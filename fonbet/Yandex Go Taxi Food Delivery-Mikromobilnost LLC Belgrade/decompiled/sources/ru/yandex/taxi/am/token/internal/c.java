package ru.yandex.taxi.am.token.internal;

import defpackage.cw11;
import defpackage.jst;
import defpackage.mrj0;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.exception.UnauthorizedUserException;
import ru.yandex.taxi.startup.launch.i;

/* loaded from: classes5.dex */
public final class c {
    public final b a;
    public final i b;
    public final mrj0 c;

    public c(b bVar, i iVar, mrj0 mrj0Var) {
        this.a = bVar;
        this.b = iVar;
        this.c = mrj0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(3:15|16|17))(5:18|19|(1:21)|22|23))(2:25|26))(3:37|38|(2:40|34))|27|(2:35|36)(5:31|(2:33|34)|(0)|22|23)))|45|6|7|(0)(0)|27|(1:29)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r13 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r0.L$0 = null;
        r0.L$1 = r10;
        r0.Z$0 = r13;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r4.a(r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004c, B:21:0x0091, B:22:0x0094, B:23:0x00a7, B:26:0x0058, B:27:0x0076, B:29:0x007c, B:31:0x0080, B:38:0x005f), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        UserAuthorizer$authorizeUser$1 userAuthorizer$authorizeUser$1;
        int i;
        owx owxVar;
        if (continuationImpl instanceof UserAuthorizer$authorizeUser$1) {
            userAuthorizer$authorizeUser$1 = (UserAuthorizer$authorizeUser$1) continuationImpl;
            int i2 = userAuthorizer$authorizeUser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userAuthorizer$authorizeUser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userAuthorizer$authorizeUser$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userAuthorizer$authorizeUser$1.label;
                mrj0 mrj0Var = this.c;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cw11 cw11Var = new cw11(false, false);
                    UserAuthorizer$authorizeUser$response$1 userAuthorizer$authorizeUser$response$1 = new UserAuthorizer$authorizeUser$response$1(this, str, null);
                    userAuthorizer$authorizeUser$1.L$0 = null;
                    userAuthorizer$authorizeUser$1.Z$0 = z;
                    userAuthorizer$authorizeUser$1.label = 1;
                    obj = tje.k0(cw11Var, userAuthorizer$authorizeUser$response$1, userAuthorizer$authorizeUser$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            e = (Exception) userAuthorizer$authorizeUser$1.L$1;
                            kotlin.b.b(obj);
                            mrj0Var.b(false);
                            throw e;
                        }
                        z = userAuthorizer$authorizeUser$1.Z$0;
                        kotlin.b.b(obj);
                        if (z) {
                            mrj0Var.b(false);
                        }
                        jst.e.r("Got null token for authorized user", new IllegalStateException("Empty token with authorized user"));
                        throw new UnauthorizedUserException();
                    }
                    z = userAuthorizer$authorizeUser$1.Z$0;
                    kotlin.b.b(obj);
                }
                owxVar = (owx) obj;
                if (!owxVar.a || owxVar.o) {
                    return zy11.a;
                }
                userAuthorizer$authorizeUser$1.L$0 = null;
                userAuthorizer$authorizeUser$1.L$1 = null;
                userAuthorizer$authorizeUser$1.Z$0 = z;
                userAuthorizer$authorizeUser$1.label = 2;
                if (bVar.a(userAuthorizer$authorizeUser$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (z) {
                }
                jst.e.r("Got null token for authorized user", new IllegalStateException("Empty token with authorized user"));
                throw new UnauthorizedUserException();
            }
        }
        userAuthorizer$authorizeUser$1 = new UserAuthorizer$authorizeUser$1(this, continuationImpl);
        Object obj2 = userAuthorizer$authorizeUser$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userAuthorizer$authorizeUser$1.label;
        mrj0 mrj0Var2 = this.c;
        b bVar2 = this.a;
        if (i != 0) {
        }
        owxVar = (owx) obj2;
        if (owxVar.a) {
        }
        return zy11.a;
    }
}
