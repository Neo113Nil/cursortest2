package app.cash.zipline.internal.bridge;

import androidx.media3.extractor.VorbisUtil$Mode;
import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline$$ExternalSyntheticLambda0;
import app.cash.zipline.ZiplineApiMismatchException;
import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineScope;
import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.EndpointService;
import app.cash.zipline.internal.EventListenerAdapter;
import app.cash.zipline.internal.JsonEngineKt;
import bo.app.yf$$ExternalSyntheticLambda10;
import coil3.size.ViewSizeResolver$size$3$1;
import com.fillr.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class OutboundCallHandler {
    public final ZiplineServiceAdapter adapter;
    public final Endpoint endpoint;
    public final ZiplineScope scope;
    public final String serviceName;
    public final VorbisUtil$Mode serviceState;
    public final RealZiplineServiceType sourceType;

    public final class RealSuspendCallback implements SuspendCallback, HasPassByReferenceName {
        public Object callStart;
        public boolean completed;
        public CancellableContinuationImpl continuation;
        public Call externalCall;
        public InternalCall internalCall;
        public String passByReferenceName;

        public RealSuspendCallback() {
        }

        public final void call(Object obj) {
            OutboundCallHandler outboundCallHandler = OutboundCallHandler.this;
            Endpoint endpoint = outboundCallHandler.endpoint;
            Endpoint endpoint2 = outboundCallHandler.endpoint;
            Call call = (Call) endpoint.callCodec.f;
            call.getClass();
            CallResult callResult = new CallResult(obj, call.encodedCall, call.serviceNames);
            this.completed = true;
            String str = this.passByReferenceName;
            if (str != null) {
                endpoint2.remove(str);
            }
            LinkedHashSet linkedHashSet = endpoint2.incompleteContinuations;
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("continuation");
                throw null;
            }
            linkedHashSet.remove(cancellableContinuationImpl);
            EventListenerAdapter eventListenerAdapter = endpoint2.eventListener;
            Call call2 = this.externalCall;
            if (call2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("externalCall");
                throw null;
            }
            eventListenerAdapter.callEnd(call2, callResult, this.callStart);
            CancellableContinuationImpl cancellableContinuationImpl2 = this.continuation;
            if (cancellableContinuationImpl2 != null) {
                cancellableContinuationImpl2.resumeWith(obj);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("continuation");
                throw null;
            }
        }

        @Override // app.cash.zipline.internal.bridge.SuspendCallback
        public final void failure(Throwable th) {
            Result.Companion companion = Result.Companion;
            call(new Result.Failure(th));
        }

        @Override // app.cash.zipline.internal.bridge.HasPassByReferenceName
        public final void setPassByReferenceName(String str) {
            this.passByReferenceName = str;
        }

        @Override // app.cash.zipline.internal.bridge.SuspendCallback
        public final void success(Object obj) {
            Result.Companion companion = Result.Companion;
            call(obj);
        }

        public final String toString() {
            InternalCall internalCall = this.internalCall;
            if (internalCall == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalCall");
                throw null;
            }
            return "SuspendCallback/" + internalCall;
        }
    }

    public OutboundCallHandler(RealZiplineServiceType realZiplineServiceType, String str, Endpoint endpoint, ZiplineServiceAdapter ziplineServiceAdapter, ZiplineScope ziplineScope, VorbisUtil$Mode vorbisUtil$Mode) {
        ziplineScope.getClass();
        this.sourceType = realZiplineServiceType;
        this.serviceName = str;
        this.endpoint = endpoint;
        this.adapter = ziplineServiceAdapter;
        this.scope = ziplineScope;
        this.serviceState = vorbisUtil$Mode;
    }

    public final Object call(ZiplineService ziplineService, int i, Object... objArr) {
        Object obj;
        ziplineService.getClass();
        Object obj2 = this.sourceType.functions.get(i);
        obj2.getClass();
        ReturningZiplineFunction returningZiplineFunction = (ReturningZiplineFunction) obj2;
        ArgsListSerializer argsListSerializer = returningZiplineFunction.argsListSerializer;
        ArgsListSerializer argsListSerializer2 = returningZiplineFunction.resultSerializer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        argsListSerializer.getClass();
        argsListSerializer2.getClass();
        boolean equals = returningZiplineFunction.signature.equals("fun close(): kotlin.Unit");
        VorbisUtil$Mode vorbisUtil$Mode = this.serviceState;
        boolean z = vorbisUtil$Mode.blockFlag;
        String str = this.serviceName;
        ZiplineScope ziplineScope = this.scope;
        if (equals) {
            if (z) {
                return Unit.INSTANCE;
            }
            vorbisUtil$Mode.blockFlag = true;
            ziplineScope.getClass();
            ziplineScope.callHandlers.remove(this);
        } else if (z) {
            Path$$ExternalSyntheticBUOutline0.m((Object) StringsKt__IndentKt.trimMargin$default("\n        |" + this.adapter + " " + str + " is closed, failed to call:\n        |  " + returningZiplineFunction + "\n        "));
            return null;
        }
        InternalCall internalCall = new InternalCall(str, argsListSerializer, null, null, returningZiplineFunction, null, ArraysKt___ArraysKt.toList(copyOf), 44);
        Endpoint endpoint = this.endpoint;
        Call encodeCall$zipline_release = endpoint.callCodec.encodeCall$zipline_release(internalCall, ziplineService);
        if (ziplineService instanceof SuspendCallback) {
            obj = Unit.INSTANCE;
        } else {
            EventListenerAdapter eventListenerAdapter = endpoint.eventListener;
            obj = eventListenerAdapter.delegate.callStart(eventListenerAdapter.zipline, encodeCall$zipline_release);
        }
        String call = endpoint.outboundChannel.call(encodeCall$zipline_release.encodedCall);
        ziplineScope.getClass();
        ZiplineScope ziplineScope2 = endpoint.takeScope;
        endpoint.takeScope = ziplineScope;
        try {
            e0 e0Var = endpoint.callCodec;
            e0Var.getClass();
            call.getClass();
            ArrayList arrayList = (ArrayList) e0Var.c;
            arrayList.clear();
            Result result = ((ResultOrCallback) JsonEngineKt.decodeFromStringFast(((Endpoint) e0Var.a).json, argsListSerializer2, call)).result;
            result.getClass();
            Object obj3 = result.value;
            CallResult callResult = new CallResult(obj3, call, arrayList);
            if (!(ziplineService instanceof SuspendCallback)) {
                endpoint.eventListener.callEnd(encodeCall$zipline_release, callResult, obj);
            }
            Object m1428withApiMismatchMessageKWTtemM = m1428withApiMismatchMessageKWTtemM(obj3, returningZiplineFunction);
            SafeTrace.throwOnFailure(m1428withApiMismatchMessageKWTtemM);
            return m1428withApiMismatchMessageKWTtemM;
        } finally {
            endpoint.takeScope = ziplineScope2;
        }
    }

    public final Object callSuspending(ZiplineService ziplineService, int i, Object[] objArr, ContinuationImpl continuationImpl) {
        Object obj = this.sourceType.functions.get(i);
        obj.getClass();
        SuspendingZiplineFunction suspendingZiplineFunction = (SuspendingZiplineFunction) obj;
        ArgsListSerializer argsListSerializer = suspendingZiplineFunction.argsListSerializer;
        ArgsListSerializer argsListSerializer2 = suspendingZiplineFunction.resultOrCallbackSerializer;
        KSerializer kSerializer = suspendingZiplineFunction.suspendCallbackSerializer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Endpoint endpoint = this.endpoint;
        ContextScope contextScope = endpoint.scope;
        EventListenerAdapter eventListenerAdapter = endpoint.eventListener;
        e0 e0Var = endpoint.callCodec;
        JobKt.ensureActive(contextScope.getCoroutineContext());
        boolean z = this.serviceState.blockFlag;
        String str = this.serviceName;
        if (z) {
            Path$$ExternalSyntheticBUOutline0.m((Object) StringsKt__IndentKt.trimMargin$default("\n      |" + this.adapter + " " + str + " is closed, failed to call:\n      |  " + suspendingZiplineFunction + "\n      "));
            return null;
        }
        List list = ArraysKt___ArraysKt.toList(copyOf);
        RealSuspendCallback realSuspendCallback = new RealSuspendCallback();
        InternalCall internalCall = new InternalCall(str, argsListSerializer, kSerializer, null, suspendingZiplineFunction, realSuspendCallback, list, 8);
        realSuspendCallback.internalCall = internalCall;
        Call encodeCall$zipline_release = e0Var.encodeCall$zipline_release(internalCall, ziplineService);
        realSuspendCallback.externalCall = encodeCall$zipline_release;
        realSuspendCallback.callStart = eventListenerAdapter.delegate.callStart(eventListenerAdapter.zipline, encodeCall$zipline_release);
        String call = endpoint.outboundChannel.call(encodeCall$zipline_release.encodedCall);
        ZiplineScope ziplineScope = this.scope;
        ziplineScope.getClass();
        ZiplineScope ziplineScope2 = endpoint.takeScope;
        endpoint.takeScope = ziplineScope;
        try {
            argsListSerializer2.getClass();
            call.getClass();
            ArrayList arrayList = (ArrayList) e0Var.c;
            arrayList.clear();
            ResultOrCallback resultOrCallback = (ResultOrCallback) JsonEngineKt.decodeFromStringFast(((Endpoint) e0Var.a).json, argsListSerializer2, call);
            resultOrCallback.getClass();
            arrayList.getClass();
            List list2 = CollectionsKt.toList(arrayList);
            endpoint.takeScope = ziplineScope2;
            CancelCallback cancelCallback = resultOrCallback.callback;
            if (cancelCallback != null) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
                cancellableContinuationImpl.initCancellability();
                realSuspendCallback.continuation = cancellableContinuationImpl;
                endpoint.incompleteContinuations.add(cancellableContinuationImpl);
                cancellableContinuationImpl.invokeOnCancellation(new ViewSizeResolver$size$3$1(3, this, realSuspendCallback, cancelCallback));
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return result;
            }
            Result result2 = resultOrCallback.result;
            CallResult callResult = result2 != null ? new CallResult(result2.value, call, list2) : null;
            callResult.getClass();
            String str2 = realSuspendCallback.passByReferenceName;
            if (str2 != null) {
                endpoint.remove(str2);
            }
            eventListenerAdapter.callEnd(encodeCall$zipline_release, callResult, realSuspendCallback.callStart);
            Object m1428withApiMismatchMessageKWTtemM = m1428withApiMismatchMessageKWTtemM(callResult.result, suspendingZiplineFunction);
            SafeTrace.throwOnFailure(m1428withApiMismatchMessageKWTtemM);
            return m1428withApiMismatchMessageKWTtemM;
        } catch (Throwable th) {
            endpoint.takeScope = ziplineScope2;
            throw th;
        }
    }

    public final String toString() {
        return this.serviceName;
    }

    /* renamed from: withApiMismatchMessage-KWTtemM, reason: not valid java name */
    public final Object m1428withApiMismatchMessageKWTtemM(Object obj, ZiplineFunction ziplineFunction) {
        Zipline$$ExternalSyntheticLambda0 zipline$$ExternalSyntheticLambda0 = this.endpoint.oppositeProvider;
        Result.Companion companion = Result.Companion;
        if (obj instanceof Result.Failure) {
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
            m4120exceptionOrNullimpl.getClass();
            if (m4120exceptionOrNullimpl instanceof ZiplineApiMismatchException) {
                try {
                    boolean contains = StringsKt.contains((CharSequence) ((ZiplineApiMismatchException) m4120exceptionOrNullimpl).message, (CharSequence) "<unknown function>", false);
                    String str = this.serviceName;
                    if (contains) {
                        SerializableZiplineServiceType serviceType = ((EndpointService) zipline$$ExternalSyntheticLambda0.invoke()).serviceType(str);
                        if (serviceType != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("no such method (incompatible API versions?)\n\tcalled service:\n\t\t");
                            sb.append(str);
                            sb.append("\n\tcalled function:\n\t\t");
                            sb.append(ziplineFunction.getSignature());
                            sb.append("\n\tavailable functions:\n");
                            CollectionsKt.joinTo$default(serviceType.functions, sb, "\n", null, null, new yf$$ExternalSyntheticLambda10(10), 60);
                            return new Result.Failure(new ZiplineApiMismatchException(sb.toString()));
                        }
                    } else if (StringsKt.contains((CharSequence) ((ZiplineApiMismatchException) m4120exceptionOrNullimpl).message, (CharSequence) "<unknown service>", false)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("no such service (service closed?)\n\tcalled service:\n\t\t");
                        sb2.append(str);
                        sb2.append("\n\tavailable services:\n");
                        CollectionsKt.joinTo$default(((EndpointService) zipline$$ExternalSyntheticLambda0.invoke()).getServiceNames(), sb2, "\n", null, null, new yf$$ExternalSyntheticLambda10(11), 60);
                        return new Result.Failure(new ZiplineApiMismatchException(sb2.toString()));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return obj;
    }
}
