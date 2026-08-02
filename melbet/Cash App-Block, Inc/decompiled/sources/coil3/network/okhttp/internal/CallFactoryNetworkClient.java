package coil3.network.okhttp.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkRequest;
import coil3.network.NetworkResponse;
import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import java.io.Closeable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$await$4$2;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient {
    public final Call.Factory callFactory;

    public /* synthetic */ CallFactoryNetworkClient(Call.Factory factory) {
        this.callFactory = factory;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CallFactoryNetworkClient m1460boximpl(Call.Factory factory) {
        return new CallFactoryNetworkClient(factory);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x005c, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: executeRequest-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1461executeRequestimpl(Call.Factory factory, NetworkRequest networkRequest, Function2 function2, ContinuationImpl continuationImpl) {
        CallFactoryNetworkClient$executeRequest$1 callFactoryNetworkClient$executeRequest$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Function2 function22;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (continuationImpl instanceof CallFactoryNetworkClient$executeRequest$1) {
            callFactoryNetworkClient$executeRequest$1 = (CallFactoryNetworkClient$executeRequest$1) continuationImpl;
            int i2 = callFactoryNetworkClient$executeRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                callFactoryNetworkClient$executeRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = callFactoryNetworkClient$executeRequest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callFactoryNetworkClient$executeRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    callFactoryNetworkClient$executeRequest$1.L$0 = function2;
                    callFactoryNetworkClient$executeRequest$1.L$1 = factory;
                    callFactoryNetworkClient$executeRequest$1.label = 1;
                    obj = zzbc.access$toRequest(networkRequest, callFactoryNetworkClient$executeRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable2 = (Closeable) callFactoryNetworkClient$executeRequest$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                Utf8.closeFinally(closeable2, null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    Utf8.closeFinally(closeable2, th);
                                    throw th3;
                                }
                            }
                        }
                        function22 = (Function2) callFactoryNetworkClient$executeRequest$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        closeable = (Closeable) obj;
                        try {
                            NetworkResponse access$toNetworkResponse = zzbc.access$toNetworkResponse((Response) closeable);
                            callFactoryNetworkClient$executeRequest$1.L$0 = closeable;
                            callFactoryNetworkClient$executeRequest$1.label = 3;
                            obj = function22.invoke(access$toNetworkResponse, callFactoryNetworkClient$executeRequest$1);
                            if (obj != coroutineSingletons) {
                                closeable2 = closeable;
                                Utf8.closeFinally(closeable2, null);
                                return obj;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable2 = closeable;
                            throw th;
                        }
                    }
                    factory = callFactoryNetworkClient$executeRequest$1.L$1;
                    function2 = (Function2) callFactoryNetworkClient$executeRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Call newCall = factory.newCall((Request) obj);
                callFactoryNetworkClient$executeRequest$1.L$0 = function2;
                callFactoryNetworkClient$executeRequest$1.L$1 = null;
                callFactoryNetworkClient$executeRequest$1.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(callFactoryNetworkClient$executeRequest$1));
                cancellableContinuationImpl.initCancellability();
                cancellableContinuationImpl.invokeOnCancellation(new CallsKt$await$2$1(newCall, 0));
                ((RealCall) newCall).enqueue(new KotlinExtensions$await$4$2(cancellableContinuationImpl));
                obj = cancellableContinuationImpl.getResult();
                if (obj != coroutineSingletons) {
                    function22 = function2;
                    closeable = (Closeable) obj;
                    NetworkResponse access$toNetworkResponse2 = zzbc.access$toNetworkResponse((Response) closeable);
                    callFactoryNetworkClient$executeRequest$1.L$0 = closeable;
                    callFactoryNetworkClient$executeRequest$1.label = 3;
                    obj = function22.invoke(access$toNetworkResponse2, callFactoryNetworkClient$executeRequest$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        callFactoryNetworkClient$executeRequest$1 = new CallFactoryNetworkClient$executeRequest$1(continuationImpl);
        obj = callFactoryNetworkClient$executeRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callFactoryNetworkClient$executeRequest$1.label;
        if (i != 0) {
        }
        Call newCall2 = factory.newCall((Request) obj);
        callFactoryNetworkClient$executeRequest$1.L$0 = function2;
        callFactoryNetworkClient$executeRequest$1.L$1 = null;
        callFactoryNetworkClient$executeRequest$1.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(callFactoryNetworkClient$executeRequest$1));
        cancellableContinuationImpl2.initCancellability();
        cancellableContinuationImpl2.invokeOnCancellation(new CallsKt$await$2$1(newCall2, 0));
        ((RealCall) newCall2).enqueue(new KotlinExtensions$await$4$2(cancellableContinuationImpl2));
        obj = cancellableContinuationImpl2.getResult();
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CallFactoryNetworkClient) {
            return this.callFactory.equals(((CallFactoryNetworkClient) obj).callFactory);
        }
        return false;
    }

    public final int hashCode() {
        return this.callFactory.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.callFactory + ")";
    }
}
