package ru.yandex.taxi.utils;

import android.graphics.Bitmap;
import defpackage.cpe0;
import defpackage.g16;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.q;

/* loaded from: classes10.dex */
public abstract class a {
    public static final q a(tpr tprVar, long j) {
        return new q(tprVar, new FlowErrorsHandlingKt$retryOnNetworkOrServerErrors$1(3, j, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g16 g16Var, Continuation continuation) {
        ImageLoaderExtenstionsKt$safeSuspend$1 imageLoaderExtenstionsKt$safeSuspend$1;
        int i;
        Object d;
        Throwable a;
        if (continuation instanceof ImageLoaderExtenstionsKt$safeSuspend$1) {
            imageLoaderExtenstionsKt$safeSuspend$1 = (ImageLoaderExtenstionsKt$safeSuspend$1) continuation;
            int i2 = imageLoaderExtenstionsKt$safeSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageLoaderExtenstionsKt$safeSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageLoaderExtenstionsKt$safeSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageLoaderExtenstionsKt$safeSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    imageLoaderExtenstionsKt$safeSuspend$1.L$0 = null;
                    imageLoaderExtenstionsKt$safeSuspend$1.label = 1;
                    d = d(g16Var, imageLoaderExtenstionsKt$safeSuspend$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                a = Result.a(d);
                if (a != null) {
                    xby.d.p("Failed to load bitmap", a);
                }
                if (d instanceof Result.Failure) {
                    return d;
                }
                return null;
            }
        }
        imageLoaderExtenstionsKt$safeSuspend$1 = new ImageLoaderExtenstionsKt$safeSuspend$1(continuation);
        Object obj2 = imageLoaderExtenstionsKt$safeSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageLoaderExtenstionsKt$safeSuspend$1.label;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
        if (d instanceof Result.Failure) {
        }
    }

    public static final pzt0 c(g16 g16Var, tls tlsVar, sls slsVar, tse tseVar) {
        return tje.N(tseVar, null, null, new ImageLoaderExtenstionsKt$submit$$inlined$collectIn$1(g16Var.f(), null, tlsVar, slsVar), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(g16 g16Var, ContinuationImpl continuationImpl) {
        ImageLoaderExtenstionsKt$suspendResult$1 imageLoaderExtenstionsKt$suspendResult$1;
        int i;
        try {
            if (continuationImpl instanceof ImageLoaderExtenstionsKt$suspendResult$1) {
                imageLoaderExtenstionsKt$suspendResult$1 = (ImageLoaderExtenstionsKt$suspendResult$1) continuationImpl;
                int i2 = imageLoaderExtenstionsKt$suspendResult$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    imageLoaderExtenstionsKt$suspendResult$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = imageLoaderExtenstionsKt$suspendResult$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = imageLoaderExtenstionsKt$suspendResult$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        imageLoaderExtenstionsKt$suspendResult$1.L$0 = null;
                        imageLoaderExtenstionsKt$suspendResult$1.label = 1;
                        obj = g16Var.a(imageLoaderExtenstionsKt$suspendResult$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (Bitmap) obj;
                }
            }
            if (i != 0) {
            }
            return (Bitmap) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        imageLoaderExtenstionsKt$suspendResult$1 = new ImageLoaderExtenstionsKt$suspendResult$1(continuationImpl);
        Object obj3 = imageLoaderExtenstionsKt$suspendResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageLoaderExtenstionsKt$suspendResult$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|(1:15)|16))|29|6|7|(0)(0)|12|13|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(cpe0 cpe0Var, ContinuationImpl continuationImpl) {
        ImageLoaderExtenstionsKt$suspendResult$3 imageLoaderExtenstionsKt$suspendResult$3;
        int i;
        Throwable a;
        if (continuationImpl instanceof ImageLoaderExtenstionsKt$suspendResult$3) {
            imageLoaderExtenstionsKt$suspendResult$3 = (ImageLoaderExtenstionsKt$suspendResult$3) continuationImpl;
            int i2 = imageLoaderExtenstionsKt$suspendResult$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageLoaderExtenstionsKt$suspendResult$3.label = i2 - Integer.MIN_VALUE;
                Object obj = imageLoaderExtenstionsKt$suspendResult$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageLoaderExtenstionsKt$suspendResult$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    imageLoaderExtenstionsKt$suspendResult$3.L$0 = null;
                    imageLoaderExtenstionsKt$suspendResult$3.label = 1;
                    if (((com.yandex.go.image.domain.requests.g) cpe0Var).a(imageLoaderExtenstionsKt$suspendResult$3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object failure = zy11.a;
                a = Result.a(failure);
                if (a != null) {
                    xby.d.p("Failed to preload drawable", a);
                }
                return failure;
            }
        }
        imageLoaderExtenstionsKt$suspendResult$3 = new ImageLoaderExtenstionsKt$suspendResult$3(continuationImpl);
        Object obj2 = imageLoaderExtenstionsKt$suspendResult$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageLoaderExtenstionsKt$suspendResult$3.label;
        if (i != 0) {
        }
        Object failure2 = zy11.a;
        a = Result.a(failure2);
        if (a != null) {
        }
        return failure2;
    }
}
