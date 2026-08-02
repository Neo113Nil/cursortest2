package ru.yandex.taxi.am.token.internal;

import defpackage.cne0;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.hnz0;
import defpackage.mo60;
import defpackage.ny61;
import defpackage.po60;
import defpackage.ru11;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final a a;
    public final po60 b;
    public final ru11 c;
    public final mo60 d;

    public b(a aVar, po60 po60Var, ru11 ru11Var, mo60 mo60Var) {
        this.a = aVar;
        this.b = po60Var;
        this.c = ru11Var;
        this.d = mo60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        OAuthTokenRefreshService$dropExistingToken$1 oAuthTokenRefreshService$dropExistingToken$1;
        int i;
        if (continuationImpl instanceof OAuthTokenRefreshService$dropExistingToken$1) {
            oAuthTokenRefreshService$dropExistingToken$1 = (OAuthTokenRefreshService$dropExistingToken$1) continuationImpl;
            int i2 = oAuthTokenRefreshService$dropExistingToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oAuthTokenRefreshService$dropExistingToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = oAuthTokenRefreshService$dropExistingToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = oAuthTokenRefreshService$dropExistingToken$1.label;
                po60 po60Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hnz0 a = po60Var.a();
                    if (a != null) {
                        String str = a.a;
                        if (!evu0.J(str)) {
                            this.d.getClass();
                            oAuthTokenRefreshService$dropExistingToken$1.L$0 = null;
                            oAuthTokenRefreshService$dropExistingToken$1.label = 1;
                            if (this.a.a(str, oAuthTokenRefreshService$dropExistingToken$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                cne0 cne0Var = po60Var.b;
                cne0Var.w("oauth_token");
                cne0Var.w("oauth_token_uid");
                return zy11.a;
            }
        }
        oAuthTokenRefreshService$dropExistingToken$1 = new OAuthTokenRefreshService$dropExistingToken$1(this, continuationImpl);
        Object obj2 = oAuthTokenRefreshService$dropExistingToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oAuthTokenRefreshService$dropExistingToken$1.label;
        po60 po60Var2 = this.b;
        if (i != 0) {
        }
        cne0 cne0Var2 = po60Var2.b;
        cne0Var2.w("oauth_token");
        cne0Var2.w("oauth_token_uid");
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        OAuthTokenRefreshService$refreshAndStoreToken$1 oAuthTokenRefreshService$refreshAndStoreToken$1;
        int i;
        Object b;
        long j;
        if (continuationImpl instanceof OAuthTokenRefreshService$refreshAndStoreToken$1) {
            oAuthTokenRefreshService$refreshAndStoreToken$1 = (OAuthTokenRefreshService$refreshAndStoreToken$1) continuationImpl;
            int i2 = oAuthTokenRefreshService$refreshAndStoreToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oAuthTokenRefreshService$refreshAndStoreToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = oAuthTokenRefreshService$refreshAndStoreToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = oAuthTokenRefreshService$refreshAndStoreToken$1.label;
                mo60 mo60Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mo60Var.getClass();
                    long j2 = this.c.a().a;
                    oAuthTokenRefreshService$refreshAndStoreToken$1.J$0 = j2;
                    oAuthTokenRefreshService$refreshAndStoreToken$1.label = 1;
                    b = this.a.b(oAuthTokenRefreshService$refreshAndStoreToken$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = j2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = oAuthTokenRefreshService$refreshAndStoreToken$1.J$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    String str = (String) b;
                    po60 po60Var = this.b;
                    cne0 cne0Var = po60Var.b;
                    if (evu0.J(str) || j <= 0) {
                        cne0 cne0Var2 = po60Var.b;
                        cne0Var2.w("oauth_token");
                        cne0Var2.w("oauth_token_uid");
                    } else {
                        cne0Var.d().putString("oauth_token", str).commit();
                        cne0Var.d().putLong("oauth_token_uid", j).commit();
                    }
                    mo60Var.getClass();
                    if (str.length() > 10) {
                        gvu0.A0(10, str);
                    }
                }
                if (Result.a(b) != null) {
                    mo60Var.getClass();
                }
                return b;
            }
        }
        oAuthTokenRefreshService$refreshAndStoreToken$1 = new OAuthTokenRefreshService$refreshAndStoreToken$1(this, continuationImpl);
        Object obj2 = oAuthTokenRefreshService$refreshAndStoreToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oAuthTokenRefreshService$refreshAndStoreToken$1.label;
        mo60 mo60Var2 = this.d;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        if (Result.a(b) != null) {
        }
        return b;
    }
}
