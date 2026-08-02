package ru.yandex.taxi.am;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.k2;
import defpackage.ep90;
import defpackage.gtq0;
import defpackage.kj;
import defpackage.mrj0;
import defpackage.mu11;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.u02;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f0 {
    public final k a;
    public final u02 b;
    public final ep90 c;
    public final mrj0 d;

    public f0(k kVar, u02 u02Var, ep90 ep90Var, mrj0 mrj0Var) {
        this.a = kVar;
        this.b = u02Var;
        this.c = ep90Var;
        this.d = mrj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(f0 f0Var, ContinuationImpl continuationImpl) {
        PassportAccountRepositoryImpl$getAccountFromPassport$1 passportAccountRepositoryImpl$getAccountFromPassport$1;
        int i;
        f0 f0Var2;
        k2 k2Var;
        Object obj;
        Throwable a;
        kj c;
        if (continuationImpl instanceof PassportAccountRepositoryImpl$getAccountFromPassport$1) {
            passportAccountRepositoryImpl$getAccountFromPassport$1 = (PassportAccountRepositoryImpl$getAccountFromPassport$1) continuationImpl;
            int i2 = passportAccountRepositoryImpl$getAccountFromPassport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAccountRepositoryImpl$getAccountFromPassport$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = passportAccountRepositoryImpl$getAccountFromPassport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAccountRepositoryImpl$getAccountFromPassport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mu11 a2 = f0Var.a.x.a();
                    if (!a2.a()) {
                        return null;
                    }
                    PassportUidImpl h = gtq0.h(f0Var.b, a2.a);
                    com.yandex.passport.api.b a3 = f0Var.c.a();
                    passportAccountRepositoryImpl$getAccountFromPassport$1.L$0 = f0Var;
                    passportAccountRepositoryImpl$getAccountFromPassport$1.L$1 = null;
                    passportAccountRepositoryImpl$getAccountFromPassport$1.L$2 = h;
                    passportAccountRepositoryImpl$getAccountFromPassport$1.label = 1;
                    Object g = a3.g(h, passportAccountRepositoryImpl$getAccountFromPassport$1);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f0Var2 = f0Var;
                    k2Var = h;
                    obj = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k2Var = (k2) passportAccountRepositoryImpl$getAccountFromPassport$1.L$2;
                    f0Var2 = (f0) passportAccountRepositoryImpl$getAccountFromPassport$1.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                a = Result.a(obj);
                if (a != null) {
                    if (a instanceof PassportAccountNotFoundException) {
                        gtq0.F("Account not found", "Account with uid [" + k2Var + "] is not found", a);
                        f0Var2.d.b(false);
                    } else if (a instanceof PassportRuntimeUnknownException) {
                        gtq0.F("Passport runtime exception while get account", "Failed to get account with uid [" + k2Var + "]", a);
                    }
                    obj = null;
                }
                com.yandex.passport.api.i iVar = (com.yandex.passport.api.i) obj;
                c = iVar != null ? s8o.c(iVar) : null;
                if (c != null) {
                    f0Var2.a.Pg(c);
                }
                return c;
            }
        }
        passportAccountRepositoryImpl$getAccountFromPassport$1 = new PassportAccountRepositoryImpl$getAccountFromPassport$1(f0Var, continuationImpl);
        Object obj22 = passportAccountRepositoryImpl$getAccountFromPassport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAccountRepositoryImpl$getAccountFromPassport$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        com.yandex.passport.api.i iVar2 = (com.yandex.passport.api.i) obj;
        if (iVar2 != null) {
        }
        if (c != null) {
        }
        return c;
    }
}
