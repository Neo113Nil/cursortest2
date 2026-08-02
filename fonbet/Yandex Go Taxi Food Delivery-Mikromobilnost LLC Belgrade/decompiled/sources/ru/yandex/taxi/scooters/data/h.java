package ru.yandex.taxi.scooters.data;

import defpackage.bvf0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.p6p0;
import defpackage.pz40;
import defpackage.rhf;
import defpackage.u4b1;
import defpackage.w6p0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class h {
    public final ru.yandex.taxi.scooters.data.mapper.f a;
    public final r0 b = bvf0.c(null);
    public final r0 c = bvf0.c(null);
    public final r0 d = bvf0.c(null);

    public h(ru.yandex.taxi.scooters.data.mapper.f fVar) {
        this.a = fVar;
    }

    public final p6p0 a() {
        p6p0 p6p0Var = (p6p0) this.d.getValue();
        if (p6p0Var != null) {
            return p6p0Var;
        }
        p6p0 p6p0Var2 = p6p0.i;
        return u4b1.b();
    }

    public final kotlinx.coroutines.flow.n b(boolean z) {
        return new kotlinx.coroutines.flow.n(new mth(this.d, 6), new ScootersCurrentUserStateRepository$listenUserState$1(this, z, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(w6p0 w6p0Var, ContinuationImpl continuationImpl) {
        ScootersCurrentUserStateRepository$pushUserStateResponse$1 scootersCurrentUserStateRepository$pushUserStateResponse$1;
        int i;
        pz40 pz40Var;
        if (continuationImpl instanceof ScootersCurrentUserStateRepository$pushUserStateResponse$1) {
            scootersCurrentUserStateRepository$pushUserStateResponse$1 = (ScootersCurrentUserStateRepository$pushUserStateResponse$1) continuationImpl;
            int i2 = scootersCurrentUserStateRepository$pushUserStateResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentUserStateRepository$pushUserStateResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentUserStateRepository$pushUserStateResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentUserStateRepository$pushUserStateResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.l(w6p0Var);
                    rhf rhfVar = (rhf) this.b.getValue();
                    scootersCurrentUserStateRepository$pushUserStateResponse$1.L$0 = null;
                    r0 r0Var = this.d;
                    scootersCurrentUserStateRepository$pushUserStateResponse$1.L$1 = r0Var;
                    scootersCurrentUserStateRepository$pushUserStateResponse$1.label = 1;
                    obj = this.a.b(rhfVar, w6p0Var, scootersCurrentUserStateRepository$pushUserStateResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pz40Var = r0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var = (pz40) scootersCurrentUserStateRepository$pushUserStateResponse$1.L$1;
                    kotlin.b.b(obj);
                }
                ((r0) pz40Var).l(obj);
                return zy11.a;
            }
        }
        scootersCurrentUserStateRepository$pushUserStateResponse$1 = new ScootersCurrentUserStateRepository$pushUserStateResponse$1(this, continuationImpl);
        Object obj2 = scootersCurrentUserStateRepository$pushUserStateResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentUserStateRepository$pushUserStateResponse$1.label;
        if (i != 0) {
        }
        ((r0) pz40Var).l(obj2);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(rhf rhfVar, ContinuationImpl continuationImpl) {
        ScootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1 scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1;
        int i;
        pz40 pz40Var;
        if (continuationImpl instanceof ScootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1) {
            scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1 = (ScootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1) continuationImpl;
            int i2 = scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.l(rhfVar);
                    w6p0 w6p0Var = (w6p0) this.c.getValue();
                    scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.L$0 = null;
                    r0 r0Var = this.d;
                    scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.L$1 = r0Var;
                    scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.label = 1;
                    obj = this.a.b(rhfVar, w6p0Var, scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pz40Var = r0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var = (pz40) scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.L$1;
                    kotlin.b.b(obj);
                }
                ((r0) pz40Var).l(obj);
                return zy11.a;
            }
        }
        scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1 = new ScootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1(this, continuationImpl);
        Object obj2 = scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1.label;
        if (i != 0) {
        }
        ((r0) pz40Var).l(obj2);
        return zy11.a;
    }
}
