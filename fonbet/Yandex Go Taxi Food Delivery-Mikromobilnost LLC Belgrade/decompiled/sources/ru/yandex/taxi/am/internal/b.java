package ru.yandex.taxi.am.internal;

import android.app.Application;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.u;
import defpackage.cne0;
import defpackage.evu0;
import defpackage.fl3;
import defpackage.gtq0;
import defpackage.j5z;
import defpackage.kj;
import defpackage.mrj0;
import defpackage.mu11;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.u5z;
import defpackage.yl;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;

/* loaded from: classes9.dex */
public final class b {
    public final Application a;
    public final k b;
    public final j5z c;
    public final mrj0 d;
    public final m e;
    public final ru.yandex.taxi.am.token.a f;

    public b(Application application, k kVar, j5z j5zVar, mrj0 mrj0Var, m mVar, ru.yandex.taxi.am.token.a aVar) {
        this.a = application;
        this.b = kVar;
        this.c = j5zVar;
        this.d = mrj0Var;
        this.e = mVar;
        this.f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u uVar, ContinuationImpl continuationImpl) {
        AuthResultInteractor$handleAuthResult$1 authResultInteractor$handleAuthResult$1;
        int i;
        if (continuationImpl instanceof AuthResultInteractor$handleAuthResult$1) {
            authResultInteractor$handleAuthResult$1 = (AuthResultInteractor$handleAuthResult$1) continuationImpl;
            int i2 = authResultInteractor$handleAuthResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authResultInteractor$handleAuthResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authResultInteractor$handleAuthResult$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authResultInteractor$handleAuthResult$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                k2 d = uVar.d();
                long value = d.getValue();
                mrj0 mrj0Var = this.d;
                mu11 a = mrj0Var.a.x.a();
                long j = a.a;
                if (a.a()) {
                    mrj0Var.a(true);
                }
                if (j != value) {
                    Iterator it = ((Iterable) mrj0Var.h.get()).iterator();
                    while (it.hasNext()) {
                        ((yl) it.next()).a(j, value);
                    }
                }
                long value2 = d.getValue();
                k kVar = this.b;
                kVar.x.a.q(value2, "uid");
                ((cne0) kVar.b).w("recently_reset");
                kj c = s8o.c(uVar.b());
                authResultInteractor$handleAuthResult$1.L$0 = null;
                authResultInteractor$handleAuthResult$1.L$1 = null;
                authResultInteractor$handleAuthResult$1.label = 1;
                Serializable b = b(c, authResultInteractor$handleAuthResult$1);
                return b == serializable ? serializable : b;
            }
        }
        authResultInteractor$handleAuthResult$1 = new AuthResultInteractor$handleAuthResult$1(this, continuationImpl);
        Object obj2 = authResultInteractor$handleAuthResult$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authResultInteractor$handleAuthResult$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(kj kjVar, ContinuationImpl continuationImpl) {
        AuthResultInteractor$handleNewAccount$1 authResultInteractor$handleNewAccount$1;
        int i;
        Object d;
        Throwable a;
        Result.Failure failure;
        boolean z;
        Throwable a2;
        if (continuationImpl instanceof AuthResultInteractor$handleNewAccount$1) {
            authResultInteractor$handleNewAccount$1 = (AuthResultInteractor$handleNewAccount$1) continuationImpl;
            int i2 = authResultInteractor$handleNewAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authResultInteractor$handleNewAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authResultInteractor$handleNewAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authResultInteractor$handleNewAccount$1.label;
                k kVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kVar.Pg(kjVar);
                    authResultInteractor$handleNewAccount$1.L$0 = kjVar;
                    authResultInteractor$handleNewAccount$1.label = 1;
                    d = this.f.d(false, authResultInteractor$handleNewAccount$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kjVar = (kj) authResultInteractor$handleNewAccount$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                a = Result.a(d);
                if (a != null) {
                    ?? r10 = (String) d;
                    boolean J = evu0.J(r10);
                    failure = r10;
                    if (J) {
                        failure = new Result.Failure(new IllegalStateException("Token is not valid!"));
                    }
                } else {
                    failure = new Result.Failure(a);
                }
                z = failure instanceof Result.Failure;
                m mVar = this.e;
                if (!z) {
                    long j = kjVar.a;
                    r0 r0Var = mVar.e;
                    fl3 fl3Var = new fl3(j);
                    r0Var.getClass();
                    r0Var.m(null, fl3Var);
                    u5z.a(this.a, this.c.c());
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                    return failure;
                }
                kVar.Pg(null);
                mVar.b(false);
                gtq0.F("error while handle auth result", null, a2);
                return failure;
            }
        }
        authResultInteractor$handleNewAccount$1 = new AuthResultInteractor$handleNewAccount$1(this, continuationImpl);
        Object obj2 = authResultInteractor$handleNewAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authResultInteractor$handleNewAccount$1.label;
        k kVar2 = this.b;
        if (i != 0) {
        }
        a = Result.a(d);
        if (a != null) {
        }
        z = failure instanceof Result.Failure;
        m mVar2 = this.e;
        if (!z) {
        }
        a2 = Result.a(failure);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(u uVar, ContinuationImpl continuationImpl) {
        AuthResultInteractor$handleUpgradeResult$1 authResultInteractor$handleUpgradeResult$1;
        int i;
        if (continuationImpl instanceof AuthResultInteractor$handleUpgradeResult$1) {
            authResultInteractor$handleUpgradeResult$1 = (AuthResultInteractor$handleUpgradeResult$1) continuationImpl;
            int i2 = authResultInteractor$handleUpgradeResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authResultInteractor$handleUpgradeResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authResultInteractor$handleUpgradeResult$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authResultInteractor$handleUpgradeResult$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                k2 d = uVar.d();
                k kVar = this.b;
                mu11 a = kVar.x.a();
                if (a.a != d.getValue()) {
                    gtq0.F("Uid changed", null, new IllegalStateException("Uid changed after upgrade account was " + a + " became " + d));
                }
                kVar.x.a.q(d.getValue(), "uid");
                kj c = s8o.c(uVar.b());
                authResultInteractor$handleUpgradeResult$1.L$0 = null;
                authResultInteractor$handleUpgradeResult$1.L$1 = null;
                authResultInteractor$handleUpgradeResult$1.L$2 = null;
                authResultInteractor$handleUpgradeResult$1.label = 1;
                Serializable b = b(c, authResultInteractor$handleUpgradeResult$1);
                return b == serializable ? serializable : b;
            }
        }
        authResultInteractor$handleUpgradeResult$1 = new AuthResultInteractor$handleUpgradeResult$1(this, continuationImpl);
        Object obj2 = authResultInteractor$handleUpgradeResult$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authResultInteractor$handleUpgradeResult$1.label;
        if (i == 0) {
        }
    }
}
