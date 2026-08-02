package ru.yandex.taxi.plus.sdk.micro_widget.websdk;

import defpackage.a1d0;
import defpackage.b1d0;
import defpackage.c1d0;
import defpackage.d1d0;
import defpackage.e1d0;
import defpackage.ep90;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.w0d0;
import defpackage.x0d0;
import defpackage.y0d0;
import defpackage.z0d0;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.m;

/* loaded from: classes9.dex */
public final class a implements e1d0 {
    public final com.yandex.plus.adapter.auth.passport750.a a;
    public final m b;

    public a(ep90 ep90Var, m mVar, tse tseVar) {
        this.a = new com.yandex.plus.adapter.auth.passport750.a(ep90Var.a());
        this.b = mVar;
        tje.N(tseVar, null, null, new PlusWebSdkAuthAdapter$1(this, null), 3);
    }

    @Override // defpackage.e1d0
    public final r0 a() {
        return this.a.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d1d0 d1d0Var, ContinuationImpl continuationImpl) {
        PlusWebSdkAuthAdapter$updateAndInjectAuthCookie$1 plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1;
        int i;
        if (continuationImpl instanceof PlusWebSdkAuthAdapter$updateAndInjectAuthCookie$1) {
            plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1 = (PlusWebSdkAuthAdapter$updateAndInjectAuthCookie$1) continuationImpl;
            int i2 = plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.L$0 = null;
                    plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.label = 1;
                    Object b = this.a.b(d1d0Var, plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1 = new PlusWebSdkAuthAdapter$updateAndInjectAuthCookie$1(this, continuationImpl);
        Object obj2 = plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebSdkAuthAdapter$updateAndInjectAuthCookie$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a1d0 a1d0Var, ContinuationImpl continuationImpl) {
        PlusWebSdkAuthAdapter$isXTokenValid$1 plusWebSdkAuthAdapter$isXTokenValid$1;
        int i;
        if (continuationImpl instanceof PlusWebSdkAuthAdapter$isXTokenValid$1) {
            plusWebSdkAuthAdapter$isXTokenValid$1 = (PlusWebSdkAuthAdapter$isXTokenValid$1) continuationImpl;
            int i2 = plusWebSdkAuthAdapter$isXTokenValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebSdkAuthAdapter$isXTokenValid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebSdkAuthAdapter$isXTokenValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebSdkAuthAdapter$isXTokenValid$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusWebSdkAuthAdapter$isXTokenValid$1.L$0 = null;
                    plusWebSdkAuthAdapter$isXTokenValid$1.label = 1;
                    Object c = this.a.c(a1d0Var, plusWebSdkAuthAdapter$isXTokenValid$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusWebSdkAuthAdapter$isXTokenValid$1 = new PlusWebSdkAuthAdapter$isXTokenValid$1(this, continuationImpl);
        Object obj2 = plusWebSdkAuthAdapter$isXTokenValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebSdkAuthAdapter$isXTokenValid$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(x0d0 x0d0Var, ContinuationImpl continuationImpl) {
        PlusWebSdkAuthAdapter$getAccountInfo$1 plusWebSdkAuthAdapter$getAccountInfo$1;
        int i;
        if (continuationImpl instanceof PlusWebSdkAuthAdapter$getAccountInfo$1) {
            plusWebSdkAuthAdapter$getAccountInfo$1 = (PlusWebSdkAuthAdapter$getAccountInfo$1) continuationImpl;
            int i2 = plusWebSdkAuthAdapter$getAccountInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebSdkAuthAdapter$getAccountInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebSdkAuthAdapter$getAccountInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebSdkAuthAdapter$getAccountInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusWebSdkAuthAdapter$getAccountInfo$1.L$0 = null;
                    plusWebSdkAuthAdapter$getAccountInfo$1.label = 1;
                    Object d = this.a.d(x0d0Var, plusWebSdkAuthAdapter$getAccountInfo$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusWebSdkAuthAdapter$getAccountInfo$1 = new PlusWebSdkAuthAdapter$getAccountInfo$1(this, continuationImpl);
        Object obj2 = plusWebSdkAuthAdapter$getAccountInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebSdkAuthAdapter$getAccountInfo$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.e1d0
    public final Object e(b1d0 b1d0Var, Continuation continuation) {
        return new Result.Failure(new NotImplementedError("Login via SDK is not supported!"));
    }

    @Override // defpackage.e1d0
    public final Object f(c1d0 c1d0Var, Continuation continuation) {
        return new Result.Failure(new NotImplementedError("Logout via SDK is not supported!"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(w0d0 w0d0Var, ContinuationImpl continuationImpl) {
        PlusWebSdkAuthAdapter$dropAuthToken$1 plusWebSdkAuthAdapter$dropAuthToken$1;
        int i;
        if (continuationImpl instanceof PlusWebSdkAuthAdapter$dropAuthToken$1) {
            plusWebSdkAuthAdapter$dropAuthToken$1 = (PlusWebSdkAuthAdapter$dropAuthToken$1) continuationImpl;
            int i2 = plusWebSdkAuthAdapter$dropAuthToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebSdkAuthAdapter$dropAuthToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebSdkAuthAdapter$dropAuthToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebSdkAuthAdapter$dropAuthToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusWebSdkAuthAdapter$dropAuthToken$1.L$0 = null;
                    plusWebSdkAuthAdapter$dropAuthToken$1.label = 1;
                    Object g = this.a.g(w0d0Var, plusWebSdkAuthAdapter$dropAuthToken$1);
                    return g == coroutineSingletons ? coroutineSingletons : g;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusWebSdkAuthAdapter$dropAuthToken$1 = new PlusWebSdkAuthAdapter$dropAuthToken$1(this, continuationImpl);
        Object obj2 = plusWebSdkAuthAdapter$dropAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebSdkAuthAdapter$dropAuthToken$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(z0d0 z0d0Var, ContinuationImpl continuationImpl) {
        PlusWebSdkAuthAdapter$getAuthorizationUrl$1 plusWebSdkAuthAdapter$getAuthorizationUrl$1;
        int i;
        if (continuationImpl instanceof PlusWebSdkAuthAdapter$getAuthorizationUrl$1) {
            plusWebSdkAuthAdapter$getAuthorizationUrl$1 = (PlusWebSdkAuthAdapter$getAuthorizationUrl$1) continuationImpl;
            int i2 = plusWebSdkAuthAdapter$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebSdkAuthAdapter$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebSdkAuthAdapter$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebSdkAuthAdapter$getAuthorizationUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusWebSdkAuthAdapter$getAuthorizationUrl$1.L$0 = null;
                    plusWebSdkAuthAdapter$getAuthorizationUrl$1.label = 1;
                    Object h = this.a.h(z0d0Var, plusWebSdkAuthAdapter$getAuthorizationUrl$1);
                    return h == coroutineSingletons ? coroutineSingletons : h;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusWebSdkAuthAdapter$getAuthorizationUrl$1 = new PlusWebSdkAuthAdapter$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = plusWebSdkAuthAdapter$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebSdkAuthAdapter$getAuthorizationUrl$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.e1d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(y0d0 y0d0Var, ContinuationImpl continuationImpl) {
        PlusWebSdkAuthAdapter$getAuthToken$1 plusWebSdkAuthAdapter$getAuthToken$1;
        int i;
        if (continuationImpl instanceof PlusWebSdkAuthAdapter$getAuthToken$1) {
            plusWebSdkAuthAdapter$getAuthToken$1 = (PlusWebSdkAuthAdapter$getAuthToken$1) continuationImpl;
            int i2 = plusWebSdkAuthAdapter$getAuthToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebSdkAuthAdapter$getAuthToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebSdkAuthAdapter$getAuthToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebSdkAuthAdapter$getAuthToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    plusWebSdkAuthAdapter$getAuthToken$1.L$0 = null;
                    plusWebSdkAuthAdapter$getAuthToken$1.label = 1;
                    Object i3 = this.a.i(y0d0Var, plusWebSdkAuthAdapter$getAuthToken$1);
                    return i3 == coroutineSingletons ? coroutineSingletons : i3;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        plusWebSdkAuthAdapter$getAuthToken$1 = new PlusWebSdkAuthAdapter$getAuthToken$1(this, continuationImpl);
        Object obj2 = plusWebSdkAuthAdapter$getAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebSdkAuthAdapter$getAuthToken$1.label;
        if (i != 0) {
        }
    }
}
