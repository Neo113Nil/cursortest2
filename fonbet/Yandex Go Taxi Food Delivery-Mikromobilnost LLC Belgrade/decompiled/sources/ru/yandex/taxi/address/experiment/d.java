package ru.yandex.taxi.address.experiment;

import defpackage.jbh;
import defpackage.k7x0;
import defpackage.kks;
import defpackage.m7x0;
import defpackage.mv0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.ufu;
import defpackage.yw0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class d {
    public final pdc a;
    public final k7x0 b;
    public final pwy0 c;
    public final t1b0 d;

    public d(rqo rqoVar, pdc pdcVar, k7x0 k7x0Var, pwy0 pwy0Var) {
        this.a = pdcVar;
        this.b = k7x0Var;
        this.c = pwy0Var;
        this.d = ((jbh) rqoVar).e(kks.o);
    }

    public final m0 a() {
        return new m0(kotlinx.coroutines.flow.e.T(com.yandex.go.coroutines.b.k(new c(this.d.a()), 300L, null), 1), this.c.a(), new FullscreenSuggestsPointsABExperimentRepository$configFlow$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FullscreenSuggestsPointsABExperimentRepository$featureEnabled$1 fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1;
        int i;
        if (continuationImpl instanceof FullscreenSuggestsPointsABExperimentRepository$featureEnabled$1) {
            fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1 = (FullscreenSuggestsPointsABExperimentRepository$featureEnabled$1) continuationImpl;
            int i2 = fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.label = 1;
                    obj = this.d.b(fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1);
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
                kks kksVar = (kks) obj;
                return Boolean.valueOf(!kksVar.a() && kksVar.c);
            }
        }
        fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1 = new FullscreenSuggestsPointsABExperimentRepository$featureEnabled$1(this, continuationImpl);
        Object obj2 = fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullscreenSuggestsPointsABExperimentRepository$featureEnabled$1.label;
        if (i != 0) {
        }
        kks kksVar2 = (kks) obj2;
        return Boolean.valueOf(!kksVar2.a() && kksVar2.c);
    }

    public final yw0 c(mv0 mv0Var) {
        String str = mv0Var.b;
        ufu ufuVar = (ufu) this.a;
        return new yw0(24, ufuVar.e(str), ufuVar.i(mv0Var.c), ((m7x0) this.b).a(mv0Var.a));
    }
}
