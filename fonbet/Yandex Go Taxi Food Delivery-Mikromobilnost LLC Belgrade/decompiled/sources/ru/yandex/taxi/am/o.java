package ru.yandex.taxi.am;

import defpackage.ab60;
import defpackage.dvx;
import defpackage.gtq0;
import defpackage.io60;
import defpackage.ny61;
import defpackage.pne;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.zn3;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class o {
    public final ru.yandex.taxi.launch.c a;
    public final ru.yandex.taxi.am.internal.e b;

    public o(ru.yandex.taxi.launch.c cVar, ru.yandex.taxi.am.internal.e eVar) {
        this.a = cVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dvx dvxVar, String str, ContinuationImpl continuationImpl) {
        AuthorizationUrlWrapper$authorizeWithCookies$1 authorizationUrlWrapper$authorizeWithCookies$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof AuthorizationUrlWrapper$authorizeWithCookies$1) {
            authorizationUrlWrapper$authorizeWithCookies$1 = (AuthorizationUrlWrapper$authorizeWithCookies$1) continuationImpl;
            int i2 = authorizationUrlWrapper$authorizeWithCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationUrlWrapper$authorizeWithCookies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationUrlWrapper$authorizeWithCookies$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationUrlWrapper$authorizeWithCookies$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!dvxVar.a()) {
                        return ab60.a;
                    }
                    authorizationUrlWrapper$authorizeWithCookies$1.L$0 = null;
                    authorizationUrlWrapper$authorizeWithCookies$1.L$1 = null;
                    authorizationUrlWrapper$authorizeWithCookies$1.label = 1;
                    a = this.b.a(str, authorizationUrlWrapper$authorizeWithCookies$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    a = new pne((String) a);
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    return a;
                }
                gtq0.F("Failed to wrap authorization url", null, a2);
                return new u5o(a2.toString());
            }
        }
        authorizationUrlWrapper$authorizeWithCookies$1 = new AuthorizationUrlWrapper$authorizeWithCookies$1(this, continuationImpl);
        Object obj2 = authorizationUrlWrapper$authorizeWithCookies$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationUrlWrapper$authorizeWithCookies$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x0096, CancellationException -> 0x00a1, TryCatch #2 {CancellationException -> 0x00a1, all -> 0x0096, blocks: (B:12:0x0033, B:13:0x0093, B:19:0x0046, B:20:0x005c, B:25:0x0065, B:28:0x0071, B:30:0x0078, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:38:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AuthType authType, ContinuationImpl continuationImpl) {
        AuthorizationUrlWrapper$wrapAuthData$1 authorizationUrlWrapper$wrapAuthData$1;
        int i;
        dvx dvxVar;
        try {
            if (continuationImpl instanceof AuthorizationUrlWrapper$wrapAuthData$1) {
                authorizationUrlWrapper$wrapAuthData$1 = (AuthorizationUrlWrapper$wrapAuthData$1) continuationImpl;
                int i2 = authorizationUrlWrapper$wrapAuthData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    authorizationUrlWrapper$wrapAuthData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = authorizationUrlWrapper$wrapAuthData$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = authorizationUrlWrapper$wrapAuthData$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.launch.c cVar = this.a;
                        authorizationUrlWrapper$wrapAuthData$1.L$0 = str;
                        authorizationUrlWrapper$wrapAuthData$1.L$1 = authType;
                        authorizationUrlWrapper$wrapAuthData$1.label = 1;
                        obj = cVar.d(authorizationUrlWrapper$wrapAuthData$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (ua41) obj;
                        }
                        authType = (AuthType) authorizationUrlWrapper$wrapAuthData$1.L$1;
                        str = (String) authorizationUrlWrapper$wrapAuthData$1.L$0;
                        kotlin.b.b(obj);
                    }
                    dvxVar = (dvx) obj;
                    if (dvxVar.a()) {
                        int i3 = zn3.a[authType.ordinal()];
                        if (i3 == 1) {
                            authorizationUrlWrapper$wrapAuthData$1.L$0 = null;
                            authorizationUrlWrapper$wrapAuthData$1.L$1 = null;
                            authorizationUrlWrapper$wrapAuthData$1.L$2 = null;
                            authorizationUrlWrapper$wrapAuthData$1.label = 2;
                            obj = a(dvxVar, str, authorizationUrlWrapper$wrapAuthData$1);
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (dvxVar.e != null) {
                                return new io60();
                            }
                        }
                    }
                    return ab60.a;
                }
            }
            if (i != 0) {
            }
            dvxVar = (dvx) obj;
            if (dvxVar.a()) {
            }
            return ab60.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new u5o(th.toString());
        }
        authorizationUrlWrapper$wrapAuthData$1 = new AuthorizationUrlWrapper$wrapAuthData$1(this, continuationImpl);
        Object obj3 = authorizationUrlWrapper$wrapAuthData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationUrlWrapper$wrapAuthData$1.label;
    }
}
