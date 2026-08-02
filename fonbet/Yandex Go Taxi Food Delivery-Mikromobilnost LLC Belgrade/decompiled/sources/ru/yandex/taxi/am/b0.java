package ru.yandex.taxi.am;

import com.yandex.passport.api.g1;
import com.yandex.passport.api.h1;
import com.yandex.passport.api.i1;
import com.yandex.passport.api.j1;
import com.yandex.passport.api.k1;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.kj;
import defpackage.mrj0;
import defpackage.ny61;
import defpackage.vo90;
import defpackage.w511;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b0 {
    public final g a;
    public final ru.yandex.taxi.startup.launch.c b;
    public final vo90 c;
    public final ru.yandex.taxi.am.internal.g d;
    public final mrj0 e;

    public b0(g gVar, ru.yandex.taxi.startup.launch.c cVar, vo90 vo90Var, ru.yandex.taxi.am.internal.g gVar2, mrj0 mrj0Var) {
        this.a = gVar;
        this.b = cVar;
        this.c = vo90Var;
        this.d = gVar2;
        this.e = mrj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        LogoutInteractorImpl$logout$1 logoutInteractorImpl$logout$1;
        int i;
        k1 k1Var;
        if (continuationImpl instanceof LogoutInteractorImpl$logout$1) {
            logoutInteractorImpl$logout$1 = (LogoutInteractorImpl$logout$1) continuationImpl;
            int i2 = logoutInteractorImpl$logout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutInteractorImpl$logout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutInteractorImpl$logout$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutInteractorImpl$logout$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vo90 vo90Var = this.c;
                    vo90Var.getClass();
                    PassportLogoutPropertiesImpl.a aVar = new PassportLogoutPropertiesImpl.a();
                    aVar.a = gtq0.h(vo90Var.a, j);
                    aVar.c = true;
                    aVar.b = vo90Var.b.a();
                    aVar.w = vo90Var.c();
                    PassportLogoutPropertiesImpl.Companion.getClass();
                    PassportLogoutPropertiesImpl b = com.yandex.passport.internal.properties.l.b(aVar);
                    logoutInteractorImpl$logout$1.L$0 = null;
                    logoutInteractorImpl$logout$1.J$0 = j;
                    logoutInteractorImpl$logout$1.label = 1;
                    obj = this.d.a(b, logoutInteractorImpl$logout$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                k1Var = (k1) obj;
                if (!jl40.l(k1Var, j1.a)) {
                    this.e.b(true);
                    this.b.b("afterLogout", true);
                } else {
                    if (!jl40.l(k1Var, g1.a) && !jl40.l(k1Var, i1.a)) {
                        if (k1Var instanceof h1) {
                            throw ((h1) k1Var).a;
                        }
                        w511.b();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        logoutInteractorImpl$logout$1 = new LogoutInteractorImpl$logout$1(this, continuationImpl);
        Object obj2 = logoutInteractorImpl$logout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutInteractorImpl$logout$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        k1Var = (k1) obj2;
        if (!jl40.l(k1Var, j1.a)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        LogoutInteractorImpl$tryLogout$1 logoutInteractorImpl$tryLogout$1;
        int i;
        try {
            if (continuationImpl instanceof LogoutInteractorImpl$tryLogout$1) {
                logoutInteractorImpl$tryLogout$1 = (LogoutInteractorImpl$tryLogout$1) continuationImpl;
                int i2 = logoutInteractorImpl$tryLogout$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    logoutInteractorImpl$tryLogout$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = logoutInteractorImpl$tryLogout$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = logoutInteractorImpl$tryLogout$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g gVar = this.a;
                        if (!gVar.f()) {
                            return Boolean.TRUE;
                        }
                        kj Ig = gVar.a.Ig();
                        if (Ig == null) {
                            this.e.b(true);
                            this.b.b("afterLogout", true);
                            gtq0.F("No cached account but hasAuthorizedUser is true", null, new IllegalStateException());
                            return Boolean.TRUE;
                        }
                        long j = Ig.a;
                        logoutInteractorImpl$tryLogout$1.J$0 = j;
                        logoutInteractorImpl$tryLogout$1.label = 1;
                        obj = a(j, logoutInteractorImpl$tryLogout$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    return bool;
                }
            }
            if (i != 0) {
            }
            Boolean bool2 = (Boolean) obj;
            bool2.getClass();
            return bool2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        logoutInteractorImpl$tryLogout$1 = new LogoutInteractorImpl$tryLogout$1(this, continuationImpl);
        Object obj2 = logoutInteractorImpl$tryLogout$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutInteractorImpl$tryLogout$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        LogoutInteractorImpl$tryLogoutThrowing$1 logoutInteractorImpl$tryLogoutThrowing$1;
        int i;
        Object b;
        if (continuationImpl instanceof LogoutInteractorImpl$tryLogoutThrowing$1) {
            logoutInteractorImpl$tryLogoutThrowing$1 = (LogoutInteractorImpl$tryLogoutThrowing$1) continuationImpl;
            int i2 = logoutInteractorImpl$tryLogoutThrowing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutInteractorImpl$tryLogoutThrowing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutInteractorImpl$tryLogoutThrowing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutInteractorImpl$tryLogoutThrowing$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    logoutInteractorImpl$tryLogoutThrowing$1.label = 1;
                    b = b(logoutInteractorImpl$tryLogoutThrowing$1);
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
                kotlin.b.b(b);
                return b;
            }
        }
        logoutInteractorImpl$tryLogoutThrowing$1 = new LogoutInteractorImpl$tryLogoutThrowing$1(this, continuationImpl);
        Object obj2 = logoutInteractorImpl$tryLogoutThrowing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutInteractorImpl$tryLogoutThrowing$1.label;
        if (i != 0) {
        }
        kotlin.b.b(b);
        return b;
    }
}
