package app.cash.zipline.internal.bridge;

import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.media3.extractor.VorbisUtil$Mode;
import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline$$ExternalSyntheticLambda0;
import app.cash.zipline.Zipline$endpoint$1;
import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineScope;
import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.EndpointService;
import app.cash.zipline.internal.EventListenerAdapter;
import app.cash.zipline.internal.JsonEngineKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.caverock.androidsvg.SVG;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.JsonImpl;
import kotlinx.serialization.modules.SerializersModule;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.AppUpdateData;

/* loaded from: classes3.dex */
public final class Endpoint implements EndpointService {
    public final e0 callCodec;
    public final EventListenerAdapter eventListener;
    public final Endpoint$inboundChannel$1 inboundChannel;
    public final LinkedHashMap inboundServices;
    public final LinkedHashSet incompleteContinuations;
    public final JsonImpl json;
    public int nextId;
    public final Zipline$$ExternalSyntheticLambda0 oppositeProvider;
    public final Zipline$endpoint$1 outboundChannel;
    public final ContextScope scope;
    public final LinkedHashMap serviceTypeCache;
    public ZiplineScope takeScope;
    public final SerializersModule userSerializersModule;

    /* JADX WARN: Type inference failed for: r1v7, types: [app.cash.zipline.internal.bridge.Endpoint$inboundChannel$1] */
    public Endpoint(ContextScope contextScope, SerializersModule serializersModule, EventListenerAdapter eventListenerAdapter, Zipline$endpoint$1 zipline$endpoint$1, Zipline$$ExternalSyntheticLambda0 zipline$$ExternalSyntheticLambda0) {
        serializersModule.getClass();
        this.scope = contextScope;
        this.userSerializersModule = serializersModule;
        this.eventListener = eventListenerAdapter;
        this.outboundChannel = zipline$endpoint$1;
        this.oppositeProvider = zipline$$ExternalSyntheticLambda0;
        this.inboundServices = new LinkedHashMap();
        this.nextId = 1;
        this.incompleteContinuations = new LinkedHashSet();
        this.json = AppUpdateData.Json$default(new xg$$ExternalSyntheticLambda9(this, 5));
        this.callCodec = new e0(this);
        this.inboundChannel = new CallChannel() { // from class: app.cash.zipline.internal.bridge.Endpoint$inboundChannel$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // app.cash.zipline.internal.bridge.CallChannel
            public final String call(String str) {
                Object failure;
                Object obj;
                str.getClass();
                e0 e0Var = Endpoint.this.callCodec;
                e0Var.getClass();
                ArrayList arrayList = (ArrayList) e0Var.c;
                arrayList.clear();
                InternalCall internalCall = (InternalCall) JsonEngineKt.decodeFromStringFast(((Endpoint) e0Var.a).json, (ArgsListSerializer) e0Var.b, str);
                InboundService inboundService = internalCall.inboundService;
                ZiplineFunction ziplineFunction = internalCall.function;
                String str2 = internalCall.serviceName;
                if (inboundService == null) {
                    Path$$ExternalSyntheticBUOutline0.m$1(str2, "no handler for ");
                    return null;
                }
                e0Var.f = new Call(str2, inboundService.service, ziplineFunction, internalCall.args, str, arrayList);
                InboundService inboundService2 = internalCall.inboundService;
                inboundService2.getClass();
                Endpoint endpoint = inboundService2.endpoint;
                e0 e0Var2 = endpoint.callCodec;
                EventListenerAdapter eventListenerAdapter2 = endpoint.eventListener;
                Call call = (Call) e0Var.f;
                call.getClass();
                ZiplineService ziplineService = call.service;
                SuspendCallback suspendCallback = internalCall.suspendCallback;
                int i = 2;
                Continuation continuation = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (suspendCallback != null) {
                    SuspendingZiplineFunction suspendingZiplineFunction = (SuspendingZiplineFunction) ziplineFunction;
                    Object callStart = eventListenerAdapter2.delegate.callStart(eventListenerAdapter2.zipline, call);
                    ContextScope contextScope2 = endpoint.scope;
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    zzmo zzmoVar = new zzmo(internalCall, suspendingZiplineFunction, inboundService2, continuation, 15);
                    int i2 = 1;
                    DeferredCoroutine async$default = JobKt.async$default(contextScope2, null, coroutineStart, zzmoVar, 1);
                    if (async$default.isActive()) {
                        InboundService$callSuspending$cancelCallback$1 inboundService$callSuspending$cancelCallback$1 = new InboundService$callSuspending$cancelCallback$1(async$default, internalCall);
                        async$default.invokeOnCompletion(new SliderKt$$ExternalSyntheticLambda3(inboundService$callSuspending$cancelCallback$1, inboundService2, async$default, suspendCallback, call, callStart, 2));
                        return (String) e0Var2.encodeResultOrCallback$zipline_release(suspendingZiplineFunction, new ResultOrCallback(objArr3 == true ? 1 : 0, inboundService$callSuspending$cancelCallback$1, i2)).cssRules;
                    }
                    Throwable completionExceptionOrNull = async$default.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull != null) {
                        Result.Companion companion = Result.Companion;
                        obj = new Result.Failure(completionExceptionOrNull);
                    } else {
                        obj = ((Result) async$default.getCompletedInternal$kotlinx_coroutines_core()).value;
                    }
                    SVG encodeResultOrCallback$zipline_release = e0Var2.encodeResultOrCallback$zipline_release(suspendingZiplineFunction, new ResultOrCallback(new Result(obj), objArr2 == true ? 1 : 0, i));
                    String str3 = (String) encodeResultOrCallback$zipline_release.cssRules;
                    Result result = ((ResultOrCallback) encodeResultOrCallback$zipline_release.rootElement).result;
                    CallResult callResult = result != null ? new CallResult(result.value, str3, (List) encodeResultOrCallback$zipline_release.idToElementMap) : null;
                    callResult.getClass();
                    eventListenerAdapter2.callEnd(call, callResult, callStart);
                    return str3;
                }
                ReturningZiplineFunction returningZiplineFunction = (ReturningZiplineFunction) ziplineFunction;
                if (returningZiplineFunction.signature.equals("fun close(): kotlin.Unit")) {
                    endpoint.remove(internalCall.serviceName);
                }
                boolean z = ziplineService instanceof SuspendCallback;
                Object callStart2 = !z ? eventListenerAdapter2.delegate.callStart(eventListenerAdapter2.zipline, call) : Unit.INSTANCE;
                try {
                    Result.Companion companion2 = Result.Companion;
                    failure = returningZiplineFunction.call(inboundService2.service, internalCall.args);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                e0Var2.getClass();
                ArrayList arrayList2 = (ArrayList) e0Var2.i;
                arrayList2.clear();
                JsonImpl jsonImpl = ((Endpoint) e0Var2.a).json;
                ArgsListSerializer argsListSerializer = returningZiplineFunction.resultSerializer;
                argsListSerializer.getClass();
                ResultOrCallback resultOrCallback = new ResultOrCallback(new Result(failure), objArr == true ? 1 : 0, i);
                jsonImpl.getClass();
                String encodeToString = jsonImpl.encodeToString(argsListSerializer, resultOrCallback);
                CallResult callResult2 = new CallResult(failure, encodeToString, arrayList2);
                if (!z) {
                    eventListenerAdapter2.callEnd(call, callResult2, callStart2);
                }
                return encodeToString;
            }

            @Override // app.cash.zipline.internal.bridge.CallChannel
            public final boolean disconnect(String str) {
                str.getClass();
                return Endpoint.this.remove(str) != null;
            }
        };
        this.serviceTypeCache = new LinkedHashMap();
    }

    public final void bind(String str, ZiplineService ziplineService, ZiplineServiceAdapter ziplineServiceAdapter) {
        ziplineService.getClass();
        EventListenerAdapter eventListenerAdapter = this.eventListener;
        eventListenerAdapter.delegate.bindService(eventListenerAdapter.zipline, str, ziplineService);
        this.inboundServices.put(str, new InboundService(serviceType(ziplineServiceAdapter), ziplineService, this));
    }

    public final Endpoint$inboundChannel$1 getInboundChannel() {
        return this.inboundChannel;
    }

    public final LinkedHashMap getInboundServices$zipline_release() {
        return this.inboundServices;
    }

    public final LinkedHashSet getIncompleteContinuations$zipline_release() {
        return this.incompleteContinuations;
    }

    @Override // app.cash.zipline.internal.EndpointService
    public final Set getServiceNames() {
        return CollectionsKt.toSet(this.inboundServices.keySet());
    }

    public final InboundService remove(String str) {
        str.getClass();
        return (InboundService) this.inboundServices.remove(str);
    }

    public final RealZiplineServiceType serviceType(ZiplineServiceAdapter ziplineServiceAdapter) {
        String serialName = ziplineServiceAdapter.getSerialName();
        LinkedHashMap linkedHashMap = this.serviceTypeCache;
        Object obj = linkedHashMap.get(serialName);
        if (obj == null) {
            obj = new RealZiplineServiceType(ziplineServiceAdapter.getSerialName(), ziplineServiceAdapter.ziplineFunctions(this.json.serializersModule));
            linkedHashMap.put(serialName, obj);
        }
        return (RealZiplineServiceType) obj;
    }

    public final ZiplineService take(String str, ZiplineScope ziplineScope, ZiplineServiceAdapter ziplineServiceAdapter) {
        while (true) {
            Reference poll = LeakCanaryJniKt.allReferencesQueue.poll();
            if (poll == null) {
                break;
            }
            Endpoint endpoint = this;
            String str2 = str;
            ZiplineScope ziplineScope2 = ziplineScope;
            ZiplineServiceAdapter ziplineServiceAdapter2 = ziplineServiceAdapter;
            ZiplineServiceReference ziplineServiceReference = (ZiplineServiceReference) poll;
            LeakCanaryJniKt.allReferencesSet.remove(ziplineServiceReference);
            if (!ziplineServiceReference.callHandler.serviceState.blockFlag) {
                EventListenerAdapter eventListenerAdapter = ziplineServiceReference.endpoint.eventListener;
                String str3 = ziplineServiceReference.serviceName;
                str3.getClass();
                eventListenerAdapter.delegate.serviceLeaked(eventListenerAdapter.zipline, str3);
            }
            str = str2;
            this = endpoint;
            ziplineServiceAdapter = ziplineServiceAdapter2;
            ziplineScope = ziplineScope2;
        }
        Endpoint endpoint2 = this;
        String str4 = str;
        ZiplineScope ziplineScope3 = ziplineScope;
        ZiplineServiceAdapter ziplineServiceAdapter3 = ziplineServiceAdapter;
        OutboundCallHandler outboundCallHandler = new OutboundCallHandler(this.serviceType(ziplineServiceAdapter), str4, endpoint2, ziplineServiceAdapter3, ziplineScope3, new VorbisUtil$Mode());
        ZiplineService outboundService = ziplineServiceAdapter3.outboundService(outboundCallHandler);
        if (!(outboundService instanceof SuspendCallback) && !(outboundService instanceof CancelCallback)) {
            if (ziplineScope3.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return null;
            }
            ziplineScope3.callHandlers.add(outboundCallHandler);
        }
        EventListenerAdapter eventListenerAdapter2 = endpoint2.eventListener;
        eventListenerAdapter2.delegate.takeService(eventListenerAdapter2.zipline, str4, outboundService);
        Set set = LeakCanaryJniKt.allReferencesSet;
        set.getClass();
        set.add(new ZiplineServiceReference(endpoint2, str4, outboundCallHandler, outboundService));
        return outboundService;
    }

    @Override // app.cash.zipline.internal.EndpointService
    public final SerializableZiplineServiceType serviceType(String str) {
        InboundService inboundService = (InboundService) this.inboundServices.get(str);
        if (inboundService != null) {
            return new SerializableZiplineServiceType(inboundService.f925type);
        }
        return null;
    }
}
