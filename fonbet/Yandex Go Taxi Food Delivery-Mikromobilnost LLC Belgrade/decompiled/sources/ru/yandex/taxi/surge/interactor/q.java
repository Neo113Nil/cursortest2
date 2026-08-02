package ru.yandex.taxi.surge.interactor;

import defpackage.dow0;
import defpackage.fnx0;
import defpackage.jn40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.w03;
import defpackage.wiq0;
import defpackage.wsw0;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class q {
    public final ru.yandex.taxi.surge.repository.b a;
    public final tt2 b;
    public final wiq0 c;
    public final ru.yandex.taxi.promotions.factory.a d;
    public final uze0 e;
    public final pwy0 f;
    public final ru.yandex.taxi.surge.mapper.a g;

    public q(ru.yandex.taxi.surge.repository.b bVar, tt2 tt2Var, wiq0 wiq0Var, ru.yandex.taxi.promotions.factory.a aVar, uze0 uze0Var, pwy0 pwy0Var, ru.yandex.taxi.surge.mapper.a aVar2) {
        this.a = bVar;
        this.b = tt2Var;
        this.c = wiq0Var;
        this.d = aVar;
        this.e = uze0Var;
        this.f = pwy0Var;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, dow0 dow0Var, ContinuationImpl continuationImpl) {
        SurgeInfoStateInteractor$mapParams$1 surgeInfoStateInteractor$mapParams$1;
        int i;
        Set set;
        kotlinx.serialization.json.b bVar;
        qVar.getClass();
        if (continuationImpl instanceof SurgeInfoStateInteractor$mapParams$1) {
            surgeInfoStateInteractor$mapParams$1 = (SurgeInfoStateInteractor$mapParams$1) continuationImpl;
            int i2 = surgeInfoStateInteractor$mapParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeInfoStateInteractor$mapParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeInfoStateInteractor$mapParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeInfoStateInteractor$mapParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set set2 = dow0Var.b;
                    kotlinx.serialization.json.b bVar2 = dow0Var.a;
                    ru.yandex.taxi.promotions.factory.a aVar = qVar.d;
                    surgeInfoStateInteractor$mapParams$1.L$0 = dow0Var;
                    surgeInfoStateInteractor$mapParams$1.L$1 = set2;
                    surgeInfoStateInteractor$mapParams$1.L$2 = bVar2;
                    surgeInfoStateInteractor$mapParams$1.label = 1;
                    Object b = aVar.b(surgeInfoStateInteractor$mapParams$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set = set2;
                    bVar = bVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) surgeInfoStateInteractor$mapParams$1.L$2;
                    Set set3 = (Set) surgeInfoStateInteractor$mapParams$1.L$1;
                    dow0 dow0Var2 = (dow0) surgeInfoStateInteractor$mapParams$1.L$0;
                    kotlin.b.b(obj);
                    bVar = bVar3;
                    set = set3;
                    dow0Var = dow0Var2;
                }
                return new wsw0(set, bVar, (w03) obj, dow0Var.d, dow0Var.e);
            }
        }
        surgeInfoStateInteractor$mapParams$1 = new SurgeInfoStateInteractor$mapParams$1(qVar, continuationImpl);
        Object obj2 = surgeInfoStateInteractor$mapParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeInfoStateInteractor$mapParams$1.label;
        if (i != 0) {
        }
        return new wsw0(set, bVar, (w03) obj2, dow0Var.d, dow0Var.e);
    }

    public static final Set b(q qVar, fnx0 fnx0Var) {
        qVar.getClass();
        pex0 pex0Var = fnx0Var.c;
        if (!pex0Var.K0) {
            return Collections.singleton(pex0Var.b);
        }
        jn40 jn40Var = pex0Var.V;
        Set set = jn40Var != null ? jn40Var.f : null;
        return set == null ? EmptySet.a : set;
    }

    public final tpr c(r0 r0Var, String str) {
        tpr t = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.X(((com.yandex.go.taxi.tariffs.internal.repository.k) this.e).j.a(), new SurgeInfoStateInteractor$stateFlow$$inlined$flatMapLatest$1(null, this, r0Var, str)), new SurgeInfoStateInteractor$stateFlow$2(2, null)));
        this.b.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
