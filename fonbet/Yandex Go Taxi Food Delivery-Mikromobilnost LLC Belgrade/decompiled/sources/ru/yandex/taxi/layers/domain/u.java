package ru.yandex.taxi.layers.domain;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.layers.api.model.params.Mode;
import defpackage.azx;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.d1c;
import defpackage.dp7;
import defpackage.e2t;
import defpackage.e5d0;
import defpackage.e5e0;
import defpackage.g92;
import defpackage.jl40;
import defpackage.jvy0;
import defpackage.l0v0;
import defpackage.l5e0;
import defpackage.ny61;
import defpackage.o35;
import defpackage.o5e0;
import defpackage.oo2;
import defpackage.pvn;
import defpackage.qxd;
import defpackage.r0c;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uo70;
import defpackage.uyj;
import defpackage.w511;
import defpackage.we11;
import defpackage.znp0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class u extends o35 {
    public final tt2 j;
    public final ru.yandex.taxi.layers.source.factory.e k;
    public final ru.yandex.taxi.layers.source.o l;
    public final e5e0 m;
    public final e5d0 n;

    public u(com.yandex.go.lifecycle.a aVar, e2t e2tVar, oo2 oo2Var, cyx cyxVar, ru.yandex.taxi.layers.source.requesttrigger.g gVar, com.yandex.go.navigation.screen.c cVar, tt2 tt2Var, ru.yandex.taxi.layers.source.factory.e eVar, ru.yandex.taxi.layers.source.o oVar, e5e0 e5e0Var, e5d0 e5d0Var) {
        super(tt2Var, aVar, e2tVar, LayersCondition$Endpoint.POLYLINES, oo2Var, cyxVar, oVar, gVar, cVar);
        this.j = tt2Var;
        this.k = eVar;
        this.l = oVar;
        this.m = e5e0Var;
        this.n = e5d0Var;
    }

    @Override // defpackage.o35
    public final azx a(byx byxVar) {
        l0v0 l0v0Var;
        znp0 znp0Var = this.n.b.a.a;
        return new l5e0(byxVar, (znp0Var == null || (l0v0Var = znp0Var.d) == null) ? null : l0v0Var.b);
    }

    @Override // defpackage.o35
    public final tpr d(byx byxVar, we11 we11Var) {
        c430 c430Var = byxVar.b;
        List list = byxVar.c;
        Mode mode = c430Var.a;
        Mode mode2 = Mode.SHUTTLE;
        r0c r0cVar = r0c.a;
        if (mode != mode2) {
            return new g92(2, r0cVar);
        }
        boolean z = we11Var instanceof jvy0;
        tpr tprVar = pvn.a;
        if (z || (we11Var instanceof uo70)) {
            return tprVar;
        }
        boolean z2 = we11Var instanceof qxd;
        LayersCondition$Endpoint layersCondition$Endpoint = this.d;
        if (z2) {
            if (list.contains(layersCondition$Endpoint)) {
                tprVar = g(byxVar);
            }
            return new kotlinx.coroutines.flow.n(tprVar, new PolylinesInteractor$reactOnTriggerEvent$2());
        }
        if (we11Var instanceof dp7) {
            return list.contains(layersCondition$Endpoint) ? g(byxVar) : tprVar;
        }
        if (jl40.l(we11Var, d1c.a)) {
            return new g92(2, r0cVar);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (r10 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl, boolean z) {
        PolylinesInteractor$getFeaturesWithCurrentTypes$1 polylinesInteractor$getFeaturesWithCurrentTypes$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        o5e0 o5e0Var;
        List list2;
        List list3;
        boolean z2;
        if (continuationImpl instanceof PolylinesInteractor$getFeaturesWithCurrentTypes$1) {
            polylinesInteractor$getFeaturesWithCurrentTypes$1 = (PolylinesInteractor$getFeaturesWithCurrentTypes$1) continuationImpl;
            int i2 = polylinesInteractor$getFeaturesWithCurrentTypes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polylinesInteractor$getFeaturesWithCurrentTypes$1.label = i2 - Integer.MIN_VALUE;
                obj = polylinesInteractor$getFeaturesWithCurrentTypes$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polylinesInteractor$getFeaturesWithCurrentTypes$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = this.m.a;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0 = list;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0 = z;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(r0Var, polylinesInteractor$getFeaturesWithCurrentTypes$1);
                } else if (i == 1) {
                    z = polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0;
                    list = (List) polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (List) obj;
                    }
                    z2 = polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0;
                    list3 = (List) polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0;
                    kotlin.b.b(obj);
                    o5e0Var = (o5e0) obj;
                    List list4 = list3;
                    z = z2;
                    list = list4;
                    this.j.getClass();
                    sjh sjhVar = uyj.a;
                    PolylinesInteractor$getFeaturesWithCurrentTypes$features$1 polylinesInteractor$getFeaturesWithCurrentTypes$features$1 = new PolylinesInteractor$getFeaturesWithCurrentTypes$features$1(o5e0Var, list, null);
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0 = null;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.L$1 = null;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.L$2 = null;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0 = z;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.label = 3;
                    obj = tje.k0(sjhVar, polylinesInteractor$getFeaturesWithCurrentTypes$features$1, polylinesInteractor$getFeaturesWithCurrentTypes$1);
                }
                o5e0Var = (o5e0) obj;
                list2 = o5e0Var.f;
                if ((list2 != null || list2.isEmpty()) && z) {
                    n0 n0Var = this.l.a;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0 = list;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.L$1 = null;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0 = z;
                    polylinesInteractor$getFeaturesWithCurrentTypes$1.label = 2;
                    obj = kotlinx.coroutines.flow.e.y(n0Var, polylinesInteractor$getFeaturesWithCurrentTypes$1);
                    if (obj != coroutineSingletons) {
                        boolean z3 = z;
                        list3 = list;
                        z2 = z3;
                        o5e0Var = (o5e0) obj;
                        List list42 = list3;
                        z = z2;
                        list = list42;
                    }
                    return coroutineSingletons;
                }
                this.j.getClass();
                sjh sjhVar2 = uyj.a;
                PolylinesInteractor$getFeaturesWithCurrentTypes$features$1 polylinesInteractor$getFeaturesWithCurrentTypes$features$12 = new PolylinesInteractor$getFeaturesWithCurrentTypes$features$1(o5e0Var, list, null);
                polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0 = null;
                polylinesInteractor$getFeaturesWithCurrentTypes$1.L$1 = null;
                polylinesInteractor$getFeaturesWithCurrentTypes$1.L$2 = null;
                polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0 = z;
                polylinesInteractor$getFeaturesWithCurrentTypes$1.label = 3;
                obj = tje.k0(sjhVar2, polylinesInteractor$getFeaturesWithCurrentTypes$features$12, polylinesInteractor$getFeaturesWithCurrentTypes$1);
            }
        }
        polylinesInteractor$getFeaturesWithCurrentTypes$1 = new PolylinesInteractor$getFeaturesWithCurrentTypes$1(this, continuationImpl);
        obj = polylinesInteractor$getFeaturesWithCurrentTypes$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polylinesInteractor$getFeaturesWithCurrentTypes$1.label;
        if (i != 0) {
        }
        o5e0Var = (o5e0) obj;
        list2 = o5e0Var.f;
        if (list2 != null) {
        }
        n0 n0Var2 = this.l.a;
        polylinesInteractor$getFeaturesWithCurrentTypes$1.L$0 = list;
        polylinesInteractor$getFeaturesWithCurrentTypes$1.L$1 = null;
        polylinesInteractor$getFeaturesWithCurrentTypes$1.Z$0 = z;
        polylinesInteractor$getFeaturesWithCurrentTypes$1.label = 2;
        obj = kotlinx.coroutines.flow.e.y(n0Var2, polylinesInteractor$getFeaturesWithCurrentTypes$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // defpackage.o35
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final t c(o5e0 o5e0Var) {
        this.m.a.l(o5e0Var);
        tpr a = this.k.a(o5e0Var);
        this.j.getClass();
        return new t(kotlinx.coroutines.flow.e.F(a, uyj.a));
    }

    public final tpr g(byx byxVar) {
        l0v0 l0v0Var;
        ru.yandex.taxi.layers.source.o oVar = this.l;
        znp0 znp0Var = this.n.b.a.a;
        return kotlinx.coroutines.flow.e.C(oVar.b(new l5e0(byxVar, (znp0Var == null || (l0v0Var = znp0Var.d) == null) ? null : l0v0Var.b)), new PolylinesInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1(null, this));
    }
}
