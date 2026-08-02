package ru.yandex.taxi.network.api;

import defpackage.a1k0;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o7j0;
import defpackage.tje;
import defpackage.tls;
import defpackage.w0k0;
import defpackage.w511;
import defpackage.wwg;
import defpackage.x240;
import defpackage.y0k0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.network.api.models.GoApiException;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.impl.RetryKt$makeRequestWithRetry$2;

/* loaded from: classes9.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fb -> B:11:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cmt cmtVar, tls tlsVar, Continuation continuation) {
        GoApiCallExtensionsKt$request$1 goApiCallExtensionsKt$request$1;
        int i;
        int i2;
        int i3;
        GoApiCallExtensionsKt$request$1 goApiCallExtensionsKt$request$12;
        tls tlsVar2;
        cmt cmtVar2;
        int i4;
        GoApiException e;
        int i5;
        cmt cmtVar3;
        tls tlsVar3;
        int i6;
        a1k0 v;
        y0k0 y0k0Var;
        if (continuation instanceof GoApiCallExtensionsKt$request$1) {
            goApiCallExtensionsKt$request$1 = (GoApiCallExtensionsKt$request$1) continuation;
            int i7 = goApiCallExtensionsKt$request$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                goApiCallExtensionsKt$request$1.label = i7 - Integer.MIN_VALUE;
                Object obj = goApiCallExtensionsKt$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallExtensionsKt$request$1.label;
                if (i != 0) {
                    b.b(obj);
                    i2 = 0;
                    i3 = 5;
                    goApiCallExtensionsKt$request$12 = goApiCallExtensionsKt$request$1;
                    tlsVar2 = tlsVar;
                    cmtVar2 = cmtVar;
                    i4 = 0;
                    kotlinx.coroutines.a.k(goApiCallExtensionsKt$request$12.get_context());
                    o7j0 d = jl40.d(i2, i4);
                    RetryKt$makeRequestWithRetry$2 retryKt$makeRequestWithRetry$2 = new RetryKt$makeRequestWithRetry$2(cmtVar2, null);
                    goApiCallExtensionsKt$request$12.L$0 = null;
                    goApiCallExtensionsKt$request$12.L$1 = null;
                    goApiCallExtensionsKt$request$12.L$2 = cmtVar2;
                    goApiCallExtensionsKt$request$12.L$3 = tlsVar2;
                    goApiCallExtensionsKt$request$12.L$4 = null;
                    goApiCallExtensionsKt$request$12.L$5 = null;
                    goApiCallExtensionsKt$request$12.I$0 = i3;
                    goApiCallExtensionsKt$request$12.I$1 = i2;
                    goApiCallExtensionsKt$request$12.I$2 = i4;
                    goApiCallExtensionsKt$request$12.label = 1;
                    obj = tje.k0(d, retryKt$makeRequestWithRetry$2, goApiCallExtensionsKt$request$12);
                } else {
                    if (i == 1) {
                        i4 = goApiCallExtensionsKt$request$1.I$2;
                        i5 = goApiCallExtensionsKt$request$1.I$1;
                        i6 = goApiCallExtensionsKt$request$1.I$0;
                        tlsVar3 = (tls) goApiCallExtensionsKt$request$1.L$3;
                        cmtVar3 = (cmt) goApiCallExtensionsKt$request$1.L$2;
                        try {
                            b.b(obj);
                        } catch (GoApiException e2) {
                            e = e2;
                            if (e instanceof GoApiHttpException) {
                            }
                            int i8 = i5 + 1;
                            v = jl40.v(i5, e, i6);
                            y0k0Var = y0k0.a;
                            if (!v.equals(y0k0Var)) {
                                tlsVar3.invoke(e);
                            }
                            if (!v.equals(y0k0Var)) {
                            }
                        }
                        return ((fmt) obj).a;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = goApiCallExtensionsKt$request$1.I$2;
                    int i9 = goApiCallExtensionsKt$request$1.I$1;
                    int i10 = goApiCallExtensionsKt$request$1.I$0;
                    tls tlsVar4 = (tls) goApiCallExtensionsKt$request$1.L$3;
                    cmtVar3 = (cmt) goApiCallExtensionsKt$request$1.L$2;
                    b.b(obj);
                    goApiCallExtensionsKt$request$12 = goApiCallExtensionsKt$request$1;
                    tlsVar2 = tlsVar4;
                    i3 = i10;
                    i2 = i9;
                    cmtVar2 = cmtVar3;
                    kotlinx.coroutines.a.k(goApiCallExtensionsKt$request$12.get_context());
                    try {
                    } catch (GoApiException e3) {
                        cmtVar3 = cmtVar2;
                        i5 = i2;
                        e = e3;
                        int i11 = i3;
                        tlsVar3 = tlsVar2;
                        goApiCallExtensionsKt$request$1 = goApiCallExtensionsKt$request$12;
                        i6 = i11;
                        if (e instanceof GoApiHttpException) {
                            i4 = ((GoApiHttpException) e).getCode();
                        }
                        int i82 = i5 + 1;
                        v = jl40.v(i5, e, i6);
                        y0k0Var = y0k0.a;
                        if (!v.equals(y0k0Var) && tlsVar3 != null) {
                            tlsVar3.invoke(e);
                        }
                        if (!v.equals(y0k0Var)) {
                            throw e;
                        }
                        if (!(v instanceof w0k0)) {
                            w511.b();
                            return null;
                        }
                        long j = ((w0k0) v).a;
                        goApiCallExtensionsKt$request$1.L$0 = null;
                        goApiCallExtensionsKt$request$1.L$1 = null;
                        goApiCallExtensionsKt$request$1.L$2 = cmtVar3;
                        goApiCallExtensionsKt$request$1.L$3 = tlsVar3;
                        goApiCallExtensionsKt$request$1.L$4 = null;
                        goApiCallExtensionsKt$request$1.L$5 = null;
                        goApiCallExtensionsKt$request$1.I$0 = i6;
                        goApiCallExtensionsKt$request$1.I$1 = i82;
                        goApiCallExtensionsKt$request$1.I$2 = i4;
                        goApiCallExtensionsKt$request$1.label = 2;
                        if (kotlinx.coroutines.a.i(j, goApiCallExtensionsKt$request$1) != coroutineSingletons) {
                            int i12 = i6;
                            goApiCallExtensionsKt$request$12 = goApiCallExtensionsKt$request$1;
                            tlsVar2 = tlsVar3;
                            i3 = i12;
                            i2 = i82;
                            cmtVar2 = cmtVar3;
                            kotlinx.coroutines.a.k(goApiCallExtensionsKt$request$12.get_context());
                            o7j0 d2 = jl40.d(i2, i4);
                            RetryKt$makeRequestWithRetry$2 retryKt$makeRequestWithRetry$22 = new RetryKt$makeRequestWithRetry$2(cmtVar2, null);
                            goApiCallExtensionsKt$request$12.L$0 = null;
                            goApiCallExtensionsKt$request$12.L$1 = null;
                            goApiCallExtensionsKt$request$12.L$2 = cmtVar2;
                            goApiCallExtensionsKt$request$12.L$3 = tlsVar2;
                            goApiCallExtensionsKt$request$12.L$4 = null;
                            goApiCallExtensionsKt$request$12.L$5 = null;
                            goApiCallExtensionsKt$request$12.I$0 = i3;
                            goApiCallExtensionsKt$request$12.I$1 = i2;
                            goApiCallExtensionsKt$request$12.I$2 = i4;
                            goApiCallExtensionsKt$request$12.label = 1;
                            obj = tje.k0(d2, retryKt$makeRequestWithRetry$22, goApiCallExtensionsKt$request$12);
                        }
                        return coroutineSingletons;
                    }
                    o7j0 d22 = jl40.d(i2, i4);
                    RetryKt$makeRequestWithRetry$2 retryKt$makeRequestWithRetry$222 = new RetryKt$makeRequestWithRetry$2(cmtVar2, null);
                    goApiCallExtensionsKt$request$12.L$0 = null;
                    goApiCallExtensionsKt$request$12.L$1 = null;
                    goApiCallExtensionsKt$request$12.L$2 = cmtVar2;
                    goApiCallExtensionsKt$request$12.L$3 = tlsVar2;
                    goApiCallExtensionsKt$request$12.L$4 = null;
                    goApiCallExtensionsKt$request$12.L$5 = null;
                    goApiCallExtensionsKt$request$12.I$0 = i3;
                    goApiCallExtensionsKt$request$12.I$1 = i2;
                    goApiCallExtensionsKt$request$12.I$2 = i4;
                    goApiCallExtensionsKt$request$12.label = 1;
                    obj = tje.k0(d22, retryKt$makeRequestWithRetry$222, goApiCallExtensionsKt$request$12);
                }
            }
        }
        goApiCallExtensionsKt$request$1 = new GoApiCallExtensionsKt$request$1(continuation);
        Object obj2 = goApiCallExtensionsKt$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallExtensionsKt$request$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f7 -> B:11:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(cmt cmtVar, tls tlsVar, Continuation continuation) {
        GoApiCallExtensionsKt$requestFull$1 goApiCallExtensionsKt$requestFull$1;
        int i;
        int i2;
        int i3;
        GoApiCallExtensionsKt$requestFull$1 goApiCallExtensionsKt$requestFull$12;
        tls tlsVar2;
        cmt cmtVar2;
        int i4;
        GoApiException e;
        int i5;
        cmt cmtVar3;
        tls tlsVar3;
        int i6;
        a1k0 v;
        y0k0 y0k0Var;
        if (continuation instanceof GoApiCallExtensionsKt$requestFull$1) {
            goApiCallExtensionsKt$requestFull$1 = (GoApiCallExtensionsKt$requestFull$1) continuation;
            int i7 = goApiCallExtensionsKt$requestFull$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                goApiCallExtensionsKt$requestFull$1.label = i7 - Integer.MIN_VALUE;
                Object obj = goApiCallExtensionsKt$requestFull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallExtensionsKt$requestFull$1.label;
                if (i != 0) {
                    b.b(obj);
                    i2 = 0;
                    i3 = 5;
                    goApiCallExtensionsKt$requestFull$12 = goApiCallExtensionsKt$requestFull$1;
                    tlsVar2 = tlsVar;
                    cmtVar2 = cmtVar;
                    i4 = 0;
                    kotlinx.coroutines.a.k(goApiCallExtensionsKt$requestFull$12.get_context());
                    o7j0 d = jl40.d(i2, i4);
                    RetryKt$makeRequestWithRetry$2 retryKt$makeRequestWithRetry$2 = new RetryKt$makeRequestWithRetry$2(cmtVar2, null);
                    goApiCallExtensionsKt$requestFull$12.L$0 = null;
                    goApiCallExtensionsKt$requestFull$12.L$1 = null;
                    goApiCallExtensionsKt$requestFull$12.L$2 = cmtVar2;
                    goApiCallExtensionsKt$requestFull$12.L$3 = tlsVar2;
                    goApiCallExtensionsKt$requestFull$12.L$4 = null;
                    goApiCallExtensionsKt$requestFull$12.L$5 = null;
                    goApiCallExtensionsKt$requestFull$12.I$0 = i3;
                    goApiCallExtensionsKt$requestFull$12.I$1 = i2;
                    goApiCallExtensionsKt$requestFull$12.I$2 = i4;
                    goApiCallExtensionsKt$requestFull$12.label = 1;
                    Object k0 = tje.k0(d, retryKt$makeRequestWithRetry$2, goApiCallExtensionsKt$requestFull$12);
                    if (k0 == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = goApiCallExtensionsKt$requestFull$1.I$2;
                        int i8 = goApiCallExtensionsKt$requestFull$1.I$1;
                        int i9 = goApiCallExtensionsKt$requestFull$1.I$0;
                        tls tlsVar4 = (tls) goApiCallExtensionsKt$requestFull$1.L$3;
                        cmtVar3 = (cmt) goApiCallExtensionsKt$requestFull$1.L$2;
                        b.b(obj);
                        goApiCallExtensionsKt$requestFull$12 = goApiCallExtensionsKt$requestFull$1;
                        tlsVar2 = tlsVar4;
                        i3 = i9;
                        i2 = i8;
                        cmtVar2 = cmtVar3;
                        kotlinx.coroutines.a.k(goApiCallExtensionsKt$requestFull$12.get_context());
                        try {
                        } catch (GoApiException e2) {
                            cmtVar3 = cmtVar2;
                            i5 = i2;
                            e = e2;
                            int i10 = i3;
                            tlsVar3 = tlsVar2;
                            goApiCallExtensionsKt$requestFull$1 = goApiCallExtensionsKt$requestFull$12;
                            i6 = i10;
                            if (e instanceof GoApiHttpException) {
                                i4 = ((GoApiHttpException) e).getCode();
                            }
                            int i11 = i5 + 1;
                            v = jl40.v(i5, e, i6);
                            y0k0Var = y0k0.a;
                            if (!v.equals(y0k0Var) && tlsVar3 != null) {
                                tlsVar3.invoke(e);
                            }
                            if (!v.equals(y0k0Var)) {
                                throw e;
                            }
                            if (!(v instanceof w0k0)) {
                                w511.b();
                                return null;
                            }
                            long j = ((w0k0) v).a;
                            goApiCallExtensionsKt$requestFull$1.L$0 = null;
                            goApiCallExtensionsKt$requestFull$1.L$1 = null;
                            goApiCallExtensionsKt$requestFull$1.L$2 = cmtVar3;
                            goApiCallExtensionsKt$requestFull$1.L$3 = tlsVar3;
                            goApiCallExtensionsKt$requestFull$1.L$4 = null;
                            goApiCallExtensionsKt$requestFull$1.L$5 = null;
                            goApiCallExtensionsKt$requestFull$1.I$0 = i6;
                            goApiCallExtensionsKt$requestFull$1.I$1 = i11;
                            goApiCallExtensionsKt$requestFull$1.I$2 = i4;
                            goApiCallExtensionsKt$requestFull$1.label = 2;
                            if (kotlinx.coroutines.a.i(j, goApiCallExtensionsKt$requestFull$1) != coroutineSingletons) {
                                int i12 = i6;
                                goApiCallExtensionsKt$requestFull$12 = goApiCallExtensionsKt$requestFull$1;
                                tlsVar2 = tlsVar3;
                                i3 = i12;
                                i2 = i11;
                                cmtVar2 = cmtVar3;
                                kotlinx.coroutines.a.k(goApiCallExtensionsKt$requestFull$12.get_context());
                                o7j0 d2 = jl40.d(i2, i4);
                                RetryKt$makeRequestWithRetry$2 retryKt$makeRequestWithRetry$22 = new RetryKt$makeRequestWithRetry$2(cmtVar2, null);
                                goApiCallExtensionsKt$requestFull$12.L$0 = null;
                                goApiCallExtensionsKt$requestFull$12.L$1 = null;
                                goApiCallExtensionsKt$requestFull$12.L$2 = cmtVar2;
                                goApiCallExtensionsKt$requestFull$12.L$3 = tlsVar2;
                                goApiCallExtensionsKt$requestFull$12.L$4 = null;
                                goApiCallExtensionsKt$requestFull$12.L$5 = null;
                                goApiCallExtensionsKt$requestFull$12.I$0 = i3;
                                goApiCallExtensionsKt$requestFull$12.I$1 = i2;
                                goApiCallExtensionsKt$requestFull$12.I$2 = i4;
                                goApiCallExtensionsKt$requestFull$12.label = 1;
                                Object k02 = tje.k0(d2, retryKt$makeRequestWithRetry$22, goApiCallExtensionsKt$requestFull$12);
                                if (k02 == coroutineSingletons) {
                                }
                            }
                        }
                        o7j0 d22 = jl40.d(i2, i4);
                        RetryKt$makeRequestWithRetry$2 retryKt$makeRequestWithRetry$222 = new RetryKt$makeRequestWithRetry$2(cmtVar2, null);
                        goApiCallExtensionsKt$requestFull$12.L$0 = null;
                        goApiCallExtensionsKt$requestFull$12.L$1 = null;
                        goApiCallExtensionsKt$requestFull$12.L$2 = cmtVar2;
                        goApiCallExtensionsKt$requestFull$12.L$3 = tlsVar2;
                        goApiCallExtensionsKt$requestFull$12.L$4 = null;
                        goApiCallExtensionsKt$requestFull$12.L$5 = null;
                        goApiCallExtensionsKt$requestFull$12.I$0 = i3;
                        goApiCallExtensionsKt$requestFull$12.I$1 = i2;
                        goApiCallExtensionsKt$requestFull$12.I$2 = i4;
                        goApiCallExtensionsKt$requestFull$12.label = 1;
                        Object k022 = tje.k0(d22, retryKt$makeRequestWithRetry$222, goApiCallExtensionsKt$requestFull$12);
                        return k022 == coroutineSingletons ? coroutineSingletons : k022;
                    }
                    i4 = goApiCallExtensionsKt$requestFull$1.I$2;
                    i5 = goApiCallExtensionsKt$requestFull$1.I$1;
                    i6 = goApiCallExtensionsKt$requestFull$1.I$0;
                    tlsVar3 = (tls) goApiCallExtensionsKt$requestFull$1.L$3;
                    cmtVar3 = (cmt) goApiCallExtensionsKt$requestFull$1.L$2;
                    try {
                        b.b(obj);
                        return obj;
                    } catch (GoApiException e3) {
                        e = e3;
                        if (e instanceof GoApiHttpException) {
                        }
                        int i112 = i5 + 1;
                        v = jl40.v(i5, e, i6);
                        y0k0Var = y0k0.a;
                        if (!v.equals(y0k0Var)) {
                            tlsVar3.invoke(e);
                        }
                        if (!v.equals(y0k0Var)) {
                        }
                    }
                }
            }
        }
        goApiCallExtensionsKt$requestFull$1 = new GoApiCallExtensionsKt$requestFull$1(continuation);
        Object obj2 = goApiCallExtensionsKt$requestFull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallExtensionsKt$requestFull$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(cmt cmtVar, x240 x240Var, ContinuationImpl continuationImpl) {
        GoApiCallExtensionsKt$requestPolling$1 goApiCallExtensionsKt$requestPolling$1;
        int i;
        if (continuationImpl instanceof GoApiCallExtensionsKt$requestPolling$1) {
            goApiCallExtensionsKt$requestPolling$1 = (GoApiCallExtensionsKt$requestPolling$1) continuationImpl;
            int i2 = goApiCallExtensionsKt$requestPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goApiCallExtensionsKt$requestPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goApiCallExtensionsKt$requestPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallExtensionsKt$requestPolling$1.label;
                if (i != 0) {
                    b.b(obj);
                    goApiCallExtensionsKt$requestPolling$1.L$0 = null;
                    goApiCallExtensionsKt$requestPolling$1.L$1 = null;
                    goApiCallExtensionsKt$requestPolling$1.label = 1;
                    obj = b(cmtVar, x240Var, goApiCallExtensionsKt$requestPolling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return wwg.l((fmt) obj);
            }
        }
        goApiCallExtensionsKt$requestPolling$1 = new GoApiCallExtensionsKt$requestPolling$1(continuationImpl);
        Object obj2 = goApiCallExtensionsKt$requestPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallExtensionsKt$requestPolling$1.label;
        if (i != 0) {
        }
        return wwg.l((fmt) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(cmt cmtVar, Continuation continuation) {
        GoApiCallExtensionsKt$singleRequest$1 goApiCallExtensionsKt$singleRequest$1;
        int i;
        if (continuation instanceof GoApiCallExtensionsKt$singleRequest$1) {
            goApiCallExtensionsKt$singleRequest$1 = (GoApiCallExtensionsKt$singleRequest$1) continuation;
            int i2 = goApiCallExtensionsKt$singleRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goApiCallExtensionsKt$singleRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goApiCallExtensionsKt$singleRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goApiCallExtensionsKt$singleRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    goApiCallExtensionsKt$singleRequest$1.L$0 = null;
                    goApiCallExtensionsKt$singleRequest$1.label = 1;
                    obj = cmtVar.a(goApiCallExtensionsKt$singleRequest$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((fmt) obj).a;
            }
        }
        goApiCallExtensionsKt$singleRequest$1 = new GoApiCallExtensionsKt$singleRequest$1(continuation);
        Object obj3 = goApiCallExtensionsKt$singleRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goApiCallExtensionsKt$singleRequest$1.label;
        if (i != 0) {
        }
        return ((fmt) obj3).a;
    }
}
