package ru.yandex.taxi.logistics.sdk.network;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import defpackage.an2;
import defpackage.bvu0;
import defpackage.cma1;
import defpackage.csb1;
import defpackage.fo2;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.is50;
import defpackage.jgz;
import defpackage.js50;
import defpackage.ks50;
import defpackage.kvj0;
import defpackage.ls50;
import defpackage.ms50;
import defpackage.ns50;
import defpackage.ny61;
import defpackage.ps50;
import defpackage.rvj0;
import defpackage.tls;
import defpackage.yv60;
import java.io.IOException;
import java.io.Reader;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class b implements an2 {
    public final yv60 a;
    public final tls b;

    public b(yv60 yv60Var, tls tlsVar) {
        this.a = yv60Var;
        this.b = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r12 == 1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a5 -> B:11:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, int i, long j, ContinuationImpl continuationImpl) {
        ApiCallImpl$retry$1 apiCallImpl$retry$1;
        int i2;
        int i3;
        io2 io2Var;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        Object e;
        bVar.getClass();
        if (continuationImpl instanceof ApiCallImpl$retry$1) {
            apiCallImpl$retry$1 = (ApiCallImpl$retry$1) continuationImpl;
            int i8 = apiCallImpl$retry$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                apiCallImpl$retry$1.label = i8 - Integer.MIN_VALUE;
                Object obj = apiCallImpl$retry$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = apiCallImpl$retry$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    i3 = i < 1 ? 1 : i;
                    if (1 <= i3) {
                        i4 = 1;
                        yv60 yv60Var = bVar.a;
                        apiCallImpl$retry$1.L$0 = null;
                        apiCallImpl$retry$1.I$0 = i;
                        apiCallImpl$retry$1.J$0 = j;
                        apiCallImpl$retry$1.I$1 = i4;
                        apiCallImpl$retry$1.I$2 = i3;
                        apiCallImpl$retry$1.label = 1;
                        e = bVar.e(yv60Var, apiCallImpl$retry$1);
                        if (e != obj2) {
                        }
                        return obj2;
                    }
                    io2Var = null;
                    if (io2Var == null) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i7 = apiCallImpl$retry$1.I$2;
                        i6 = apiCallImpl$retry$1.I$1;
                        j2 = apiCallImpl$retry$1.J$0;
                        i5 = apiCallImpl$retry$1.I$0;
                        io2Var = (io2) apiCallImpl$retry$1.L$0;
                        kotlin.b.b(obj);
                        i3 = i7;
                        i = i5;
                        if (i6 != i3) {
                            i4 = i6 + 1;
                            j = j2;
                            yv60 yv60Var2 = bVar.a;
                            apiCallImpl$retry$1.L$0 = null;
                            apiCallImpl$retry$1.I$0 = i;
                            apiCallImpl$retry$1.J$0 = j;
                            apiCallImpl$retry$1.I$1 = i4;
                            apiCallImpl$retry$1.I$2 = i3;
                            apiCallImpl$retry$1.label = 1;
                            e = bVar.e(yv60Var2, apiCallImpl$retry$1);
                            if (e != obj2) {
                                i5 = i;
                                i7 = i3;
                                obj = e;
                                j2 = j;
                                i6 = i4;
                                io2Var = (io2) obj;
                                if (!((io2Var != null ? null : io2Var) instanceof ho2)) {
                                    if (!(io2Var instanceof go2)) {
                                        if (!csb1.g(((go2) io2Var).a)) {
                                        }
                                    }
                                    if (i6 != 1) {
                                        apiCallImpl$retry$1.L$0 = io2Var;
                                        apiCallImpl$retry$1.I$0 = i5;
                                        apiCallImpl$retry$1.J$0 = j2;
                                        apiCallImpl$retry$1.I$1 = i6;
                                        apiCallImpl$retry$1.I$2 = i7;
                                        apiCallImpl$retry$1.label = 2;
                                    }
                                    i3 = i7;
                                    i = i5;
                                    if (i6 != i3) {
                                    }
                                }
                            }
                            return obj2;
                        }
                        if (io2Var == null) {
                            return null;
                        }
                        return io2Var;
                    }
                    i7 = apiCallImpl$retry$1.I$2;
                    i6 = apiCallImpl$retry$1.I$1;
                    j2 = apiCallImpl$retry$1.J$0;
                    i5 = apiCallImpl$retry$1.I$0;
                    kotlin.b.b(obj);
                    io2Var = (io2) obj;
                    if (!((io2Var != null ? null : io2Var) instanceof ho2) && (!(io2Var instanceof go2) || !csb1.g(((go2) io2Var).a))) {
                        if (i6 != 1) {
                        }
                        i3 = i7;
                        i = i5;
                        if (i6 != i3) {
                        }
                    }
                    if (io2Var == null) {
                    }
                }
            }
        }
        apiCallImpl$retry$1 = new ApiCallImpl$retry$1(bVar, continuationImpl);
        Object obj3 = apiCallImpl$retry$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = apiCallImpl$retry$1.label;
        if (i2 != 0) {
        }
    }

    public static fo2 d(Response response) {
        kvj0 kvj0Var = response.a;
        String a = kvj0Var.y.a("X-Refresh-After");
        return new fo2(kvj0Var.y.a("X-YaTaxi-UserId"), a != null ? bvu0.m(10, a) : null);
    }

    public static ps50 f(Throwable th) {
        if (!(th instanceof ConnectException) && !(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException)) {
            if (th instanceof SSLHandshakeException) {
                return new ms50(th.getMessage(), th);
            }
            if (!(th instanceof ApiCallImpl$EmptyResponseBodyException) && !(th instanceof JsonEncodingException) && !(th instanceof JsonDataException)) {
                if (th instanceof IOException) {
                    return new js50(th.getMessage(), th);
                }
                if (th instanceof TimeoutCancellationException) {
                    return new is50("Request timed out");
                }
                if (th instanceof CancellationException) {
                    throw th;
                }
                return new ns50(th.getMessage(), th);
            }
            return new ks50(th.getMessage(), th);
        }
        return new js50(th.getMessage(), th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, long j, long j2, ContinuationImpl continuationImpl) {
        ApiCallImpl$awaitWithRetry$1 apiCallImpl$awaitWithRetry$1;
        int i2;
        try {
            if (continuationImpl instanceof ApiCallImpl$awaitWithRetry$1) {
                apiCallImpl$awaitWithRetry$1 = (ApiCallImpl$awaitWithRetry$1) continuationImpl;
                int i3 = apiCallImpl$awaitWithRetry$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    apiCallImpl$awaitWithRetry$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = apiCallImpl$awaitWithRetry$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = apiCallImpl$awaitWithRetry$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        ApiCallImpl$awaitWithRetry$2 apiCallImpl$awaitWithRetry$2 = new ApiCallImpl$awaitWithRetry$2(this, i, j, null);
                        apiCallImpl$awaitWithRetry$1.I$0 = i;
                        apiCallImpl$awaitWithRetry$1.J$0 = j;
                        apiCallImpl$awaitWithRetry$1.J$1 = j2;
                        apiCallImpl$awaitWithRetry$1.label = 1;
                        obj = kotlinx.coroutines.a.u(j2, apiCallImpl$awaitWithRetry$2, apiCallImpl$awaitWithRetry$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (io2) obj;
                }
            }
            if (i2 != 0) {
            }
            return (io2) obj;
        } catch (Throwable th) {
            return new go2(f(th), fo2.c);
        }
        apiCallImpl$awaitWithRetry$1 = new ApiCallImpl$awaitWithRetry$1(this, continuationImpl);
        Object obj2 = apiCallImpl$awaitWithRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = apiCallImpl$awaitWithRetry$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0050, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x007d, B:15:0x0085, B:17:0x008b, B:20:0x0093, B:21:0x0098, B:22:0x0099, B:24:0x00a3, B:26:0x00a9, B:27:0x00ad, B:36:0x0068, B:38:0x006e, B:39:0x0072), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v10, types: [retrofit2.Call] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(yv60 yv60Var, Continuation continuation) {
        ApiCallImpl$toApiResult$1 apiCallImpl$toApiResult$1;
        Object obj;
        int i;
        fo2 fo2Var;
        Call call;
        Reader charStream;
        try {
            if (continuation instanceof ApiCallImpl$toApiResult$1) {
                apiCallImpl$toApiResult$1 = (ApiCallImpl$toApiResult$1) continuation;
                int i2 = apiCallImpl$toApiResult$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    apiCallImpl$toApiResult$1.label = i2 - Integer.MIN_VALUE;
                    obj = apiCallImpl$toApiResult$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = apiCallImpl$toApiResult$1.label;
                    String str = null;
                    fo2Var = fo2.c;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        apiCallImpl$toApiResult$1.L$0 = yv60Var;
                        apiCallImpl$toApiResult$1.label = 1;
                        obj = this.b.invoke(apiCallImpl$toApiResult$1);
                        call = yv60Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            Response response = (Response) obj;
                            kvj0 kvj0Var = response.a;
                            if (kvj0Var.J) {
                                Object obj2 = response.b;
                                if (obj2 != null) {
                                    return new ho2(obj2, d(response));
                                }
                                throw new RuntimeException() { // from class: ru.yandex.taxi.logistics.sdk.network.ApiCallImpl$EmptyResponseBodyException
                                };
                            }
                            int i3 = kvj0Var.w;
                            rvj0 rvj0Var = response.c;
                            if (rvj0Var != null && (charStream = rvj0Var.charStream()) != null) {
                                str = cma1.x0(charStream);
                            }
                            return new go2(new ls50(i3, str), d(response));
                        }
                        ?? r8 = (Call) apiCallImpl$toApiResult$1.L$0;
                        kotlin.b.b(obj);
                        call = r8;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return new go2(new is50("Requests are disabled"), fo2Var);
                    }
                    boolean l1 = call.l1();
                    Call call2 = call;
                    if (l1) {
                        call2 = call.clone();
                    }
                    apiCallImpl$toApiResult$1.L$0 = null;
                    apiCallImpl$toApiResult$1.label = 2;
                    obj = retrofit2.a.c(call2, apiCallImpl$toApiResult$1);
                }
            }
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th) {
            ps50 f = f(th);
            if (f instanceof ks50) {
                jgz.a.h("ApiCall");
                jgz.c(th);
            }
            return new go2(f, fo2Var);
        }
        apiCallImpl$toApiResult$1 = new ApiCallImpl$toApiResult$1(this, continuation);
        obj = apiCallImpl$toApiResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = apiCallImpl$toApiResult$1.label;
        String str2 = null;
        fo2Var = fo2.c;
    }
}
