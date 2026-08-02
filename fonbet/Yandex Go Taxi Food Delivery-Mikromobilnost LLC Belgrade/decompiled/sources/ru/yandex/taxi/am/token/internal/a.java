package ru.yandex.taxi.am.token.internal;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.f;
import defpackage.ep90;
import defpackage.gtq0;
import defpackage.mo60;
import defpackage.mrj0;
import defpackage.ny61;
import defpackage.ru11;
import defpackage.u02;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final ep90 a;
    public final u02 b;
    public final mrj0 c;
    public final ru11 d;
    public final mo60 e;

    public a(ep90 ep90Var, u02 u02Var, mrj0 mrj0Var, ru11 ru11Var, mo60 mo60Var) {
        this.a = ep90Var;
        this.b = u02Var;
        this.c = mrj0Var;
        this.d = ru11Var;
        this.e = mo60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        OAuthTokenPassportProvider$dropToken$1 oAuthTokenPassportProvider$dropToken$1;
        int i;
        Object A;
        try {
            if (continuationImpl instanceof OAuthTokenPassportProvider$dropToken$1) {
                oAuthTokenPassportProvider$dropToken$1 = (OAuthTokenPassportProvider$dropToken$1) continuationImpl;
                int i2 = oAuthTokenPassportProvider$dropToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oAuthTokenPassportProvider$dropToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = oAuthTokenPassportProvider$dropToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = oAuthTokenPassportProvider$dropToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.api.b a = this.a.a();
                        oAuthTokenPassportProvider$dropToken$1.L$0 = null;
                        oAuthTokenPassportProvider$dropToken$1.label = 1;
                        A = a.A(str, oAuthTokenPassportProvider$dropToken$1);
                        if (A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        A = ((Result) obj).getValue();
                    }
                    kotlin.b.b(A);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(A);
            return zy11.a;
        } catch (Exception e) {
            this.e.getClass();
            return new Result.Failure(e);
        }
        oAuthTokenPassportProvider$dropToken$1 = new OAuthTokenPassportProvider$dropToken$1(this, continuationImpl);
        Object obj2 = oAuthTokenPassportProvider$dropToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oAuthTokenPassportProvider$dropToken$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        OAuthTokenPassportProvider$requestNewToken$1 oAuthTokenPassportProvider$requestNewToken$1;
        int i;
        if (continuationImpl instanceof OAuthTokenPassportProvider$requestNewToken$1) {
            oAuthTokenPassportProvider$requestNewToken$1 = (OAuthTokenPassportProvider$requestNewToken$1) continuationImpl;
            int i2 = oAuthTokenPassportProvider$requestNewToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oAuthTokenPassportProvider$requestNewToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = oAuthTokenPassportProvider$requestNewToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = oAuthTokenPassportProvider$requestNewToken$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.e.getClass();
                long j = this.d.a().a;
                if (j <= 0) {
                    return new Result.Failure(new IllegalStateException("No user is authenticated"));
                }
                oAuthTokenPassportProvider$requestNewToken$1.J$0 = j;
                oAuthTokenPassportProvider$requestNewToken$1.label = 1;
                Object c = c(j, oAuthTokenPassportProvider$requestNewToken$1);
                return c == obj2 ? obj2 : c;
            }
        }
        oAuthTokenPassportProvider$requestNewToken$1 = new OAuthTokenPassportProvider$requestNewToken$1(this, continuationImpl);
        Object obj3 = oAuthTokenPassportProvider$requestNewToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oAuthTokenPassportProvider$requestNewToken$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:10:0x0026, B:11:0x0055, B:13:0x0059, B:14:0x005d, B:16:0x0089, B:18:0x008d, B:21:0x0091, B:36:0x0084, B:40:0x003e, B:24:0x0064, B:26:0x0068, B:28:0x006c, B:33:0x0082, B:30:0x0070, B:32:0x0074), top: B:7:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:10:0x0026, B:11:0x0055, B:13:0x0059, B:14:0x005d, B:16:0x0089, B:18:0x008d, B:21:0x0091, B:36:0x0084, B:40:0x003e, B:24:0x0064, B:26:0x0068, B:28:0x006c, B:33:0x0082, B:30:0x0070, B:32:0x0074), top: B:7:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:10:0x0026, B:11:0x0055, B:13:0x0059, B:14:0x005d, B:16:0x0089, B:18:0x008d, B:21:0x0091, B:36:0x0084, B:40:0x003e, B:24:0x0064, B:26:0x0068, B:28:0x006c, B:33:0x0082, B:30:0x0070, B:32:0x0074), top: B:7:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, ContinuationImpl continuationImpl) {
        OAuthTokenPassportProvider$requestTokenForUserId$1 oAuthTokenPassportProvider$requestTokenForUserId$1;
        int i;
        mo60 mo60Var;
        Object b;
        Throwable a;
        try {
            if (continuationImpl instanceof OAuthTokenPassportProvider$requestTokenForUserId$1) {
                oAuthTokenPassportProvider$requestTokenForUserId$1 = (OAuthTokenPassportProvider$requestTokenForUserId$1) continuationImpl;
                int i2 = oAuthTokenPassportProvider$requestTokenForUserId$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oAuthTokenPassportProvider$requestTokenForUserId$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = oAuthTokenPassportProvider$requestTokenForUserId$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = oAuthTokenPassportProvider$requestTokenForUserId$1.label;
                    mo60Var = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mo60Var.getClass();
                        com.yandex.passport.api.b a2 = this.a.a();
                        PassportUidImpl h = gtq0.h(this.b, j);
                        oAuthTokenPassportProvider$requestTokenForUserId$1.J$0 = j;
                        oAuthTokenPassportProvider$requestTokenForUserId$1.label = 1;
                        b = a2.b(h, oAuthTokenPassportProvider$requestTokenForUserId$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        b = ((Result) obj).getValue();
                    }
                    if (!(b instanceof Result.Failure)) {
                        b = ((f) b).a;
                    }
                    a = Result.a(b);
                    if (a != null) {
                        try {
                            if (a instanceof PassportAccountNotFoundException) {
                                mo60Var.getClass();
                                gtq0.F("Account not found while get token", null, a);
                                this.c.b(false);
                                throw a;
                            }
                            if (a instanceof PassportAccountNotAuthorizedException) {
                                mo60Var.getClass();
                                throw a;
                            }
                            mo60Var.getClass();
                            throw a;
                        } catch (Throwable th) {
                            b = new Result.Failure(th);
                        }
                    }
                    if (b instanceof Result.Failure) {
                        mo60Var.getClass();
                        return b;
                    }
                    mo60Var.getClass();
                    return b;
                }
            }
            if (i != 0) {
            }
            if (!(b instanceof Result.Failure)) {
            }
            a = Result.a(b);
            if (a != null) {
            }
            if (b instanceof Result.Failure) {
            }
        } catch (Exception e) {
            mo60Var.getClass();
            return new Result.Failure(e);
        }
        oAuthTokenPassportProvider$requestTokenForUserId$1 = new OAuthTokenPassportProvider$requestTokenForUserId$1(this, continuationImpl);
        Object obj2 = oAuthTokenPassportProvider$requestTokenForUserId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oAuthTokenPassportProvider$requestTokenForUserId$1.label;
        mo60Var = this.e;
    }
}
