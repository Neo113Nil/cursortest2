package ru.yandex.taxi.layers.domain;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.layers.api.model.params.Mode;
import defpackage.aq00;
import defpackage.azx;
import defpackage.byx;
import defpackage.bzx;
import defpackage.c430;
import defpackage.cq60;
import defpackage.cyx;
import defpackage.d1c;
import defpackage.dp7;
import defpackage.e2t;
import defpackage.e5d0;
import defpackage.fkp;
import defpackage.fxe0;
import defpackage.g92;
import defpackage.gw00;
import defpackage.hzk;
import defpackage.jl40;
import defpackage.jvy0;
import defpackage.l0v0;
import defpackage.lm00;
import defpackage.ny61;
import defpackage.o35;
import defpackage.oo2;
import defpackage.pfq0;
import defpackage.pvn;
import defpackage.q0c;
import defpackage.qxd;
import defpackage.r0c;
import defpackage.rol0;
import defpackage.t7s0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uo70;
import defpackage.uxx;
import defpackage.w511;
import defpackage.we11;
import defpackage.wp31;
import defpackage.znp0;
import defpackage.zyx;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class l extends o35 {
    public final ru.yandex.taxi.layers.source.k j;
    public final ru.yandex.taxi.layers.source.e k;
    public final pfq0 l;
    public final zyx m;
    public final hzk n;
    public final e5d0 o;
    public final uxx p;

    public l(tt2 tt2Var, com.yandex.go.lifecycle.a aVar, e2t e2tVar, oo2 oo2Var, cyx cyxVar, ru.yandex.taxi.layers.source.requesttrigger.g gVar, com.yandex.go.navigation.screen.c cVar, ru.yandex.taxi.layers.source.k kVar, ru.yandex.taxi.layers.source.e eVar, pfq0 pfq0Var, zyx zyxVar, hzk hzkVar, e5d0 e5d0Var, uxx uxxVar) {
        super(tt2Var, aVar, e2tVar, LayersCondition$Endpoint.OBJECTS, oo2Var, cyxVar, kVar, gVar, cVar);
        this.j = kVar;
        this.k = eVar;
        this.l = pfq0Var;
        this.m = zyxVar;
        this.n = hzkVar;
        this.o = e5d0Var;
        this.p = uxxVar;
    }

    @Override // defpackage.o35
    public final azx a(byx byxVar) {
        return f(byxVar, null);
    }

    @Override // defpackage.o35
    public final tpr c(bzx bzxVar) {
        cq60 cq60Var = (cq60) bzxVar;
        return kotlinx.coroutines.flow.e.C(new rol0(new MapObjectsInteractor$onResponse$1(cq60Var, null, this)), new MapObjectsInteractor$onResponse$$inlined$flatMapMerge$1(cq60Var, null, this));
    }

    @Override // defpackage.o35
    public final tpr d(byx byxVar, we11 we11Var) {
        c430 c430Var;
        boolean z = we11Var instanceof jvy0;
        tpr tprVar = pvn.a;
        LayersCondition$Endpoint layersCondition$Endpoint = this.d;
        if (z) {
            return byxVar.c.contains(layersCondition$Endpoint) ? g(byxVar, we11Var) : tprVar;
        }
        if (we11Var instanceof uo70) {
            return byxVar.c.contains(layersCondition$Endpoint) ? g(byxVar, we11Var) : tprVar;
        }
        boolean z2 = we11Var instanceof qxd;
        fxe0 fxe0Var = q0c.a;
        fxe0 fxe0Var2 = r0c.a;
        if (!z2) {
            if (we11Var instanceof dp7) {
                return byxVar.c.contains(layersCondition$Endpoint) ? g(byxVar, we11Var) : tprVar;
            }
            if (!jl40.l(we11Var, d1c.a)) {
                w511.b();
                return null;
            }
            if (byxVar.b.a != Mode.MASSTRANSIT) {
                fxe0Var = fxe0Var2;
            }
            return new g92(2, fxe0Var);
        }
        qxd qxdVar = (qxd) we11Var;
        byx byxVar2 = qxdVar.a;
        Mode mode = (byxVar2 == null || (c430Var = byxVar2.b) == null) ? null : c430Var.a;
        Mode mode2 = qxdVar.b.b.a;
        if (mode != Mode.MASSTRANSIT && mode2 != Mode.NAVIGATOR) {
            fxe0Var = fxe0Var2;
        }
        if (byxVar.c.contains(layersCondition$Endpoint)) {
            tprVar = g(byxVar, we11Var);
        }
        return new kotlinx.coroutines.flow.n(tprVar, new MapObjectsInteractor$reactOnTriggerEvent$4(fxe0Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fkp fkpVar, LinkedHashMap linkedHashMap, byx byxVar, ContinuationImpl continuationImpl) {
        MapObjectsInteractor$getStateForAdvertObjectSelected$1 mapObjectsInteractor$getStateForAdvertObjectSelected$1;
        int i;
        LinkedHashMap linkedHashMap2;
        lm00 lm00Var;
        if (continuationImpl instanceof MapObjectsInteractor$getStateForAdvertObjectSelected$1) {
            mapObjectsInteractor$getStateForAdvertObjectSelected$1 = (MapObjectsInteractor$getStateForAdvertObjectSelected$1) continuationImpl;
            int i2 = mapObjectsInteractor$getStateForAdvertObjectSelected$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsInteractor$getStateForAdvertObjectSelected$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsInteractor$getStateForAdvertObjectSelected$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsInteractor$getStateForAdvertObjectSelected$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (fkpVar == null) {
                        return new t7s0(kotlin.collections.b.j("selected_organizations_pin", linkedHashMap));
                    }
                    cq60 cq60Var = new cq60(Collections.singletonList(fkpVar), 4031);
                    mapObjectsInteractor$getStateForAdvertObjectSelected$1.L$0 = null;
                    mapObjectsInteractor$getStateForAdvertObjectSelected$1.L$1 = linkedHashMap;
                    mapObjectsInteractor$getStateForAdvertObjectSelected$1.L$2 = byxVar;
                    mapObjectsInteractor$getStateForAdvertObjectSelected$1.L$3 = null;
                    mapObjectsInteractor$getStateForAdvertObjectSelected$1.label = 1;
                    obj = this.k.a(cq60Var, mapObjectsInteractor$getStateForAdvertObjectSelected$1);
                    linkedHashMap2 = linkedHashMap;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r8 = (Map) mapObjectsInteractor$getStateForAdvertObjectSelected$1.L$1;
                    kotlin.b.b(obj);
                    linkedHashMap2 = r8;
                }
                lm00Var = (lm00) kotlin.collections.a.Q(((Map) obj).values());
                if (lm00Var != null) {
                    return new t7s0(kotlin.collections.b.j("selected_organizations_pin", linkedHashMap2));
                }
                lm00 a = lm00.a(lm00Var, wp31.a(lm00Var.d), null, 247);
                String str = a.a;
                return new t7s0(kotlin.collections.b.n(kotlin.collections.b.j(str, linkedHashMap2), gw00.e(new Pair(str, a))));
            }
        }
        mapObjectsInteractor$getStateForAdvertObjectSelected$1 = new MapObjectsInteractor$getStateForAdvertObjectSelected$1(this, continuationImpl);
        Object obj2 = mapObjectsInteractor$getStateForAdvertObjectSelected$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsInteractor$getStateForAdvertObjectSelected$1.label;
        if (i != 0) {
        }
        lm00Var = (lm00) kotlin.collections.a.Q(((Map) obj2).values());
        if (lm00Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r6.a == com.yandex.go.layers.api.model.params.Screen.DISCOVERY) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r5.a == com.yandex.go.layers.api.model.params.Screen.DISCOVERY) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aq00 f(byx byxVar, we11 we11Var) {
        l0v0 l0v0Var;
        znp0 znp0Var = this.o.b.a.a;
        String str = (znp0Var == null || (l0v0Var = znp0Var.d) == null) ? null : l0v0Var.b;
        boolean z = true;
        boolean z2 = false;
        if (we11Var instanceof qxd) {
            byx byxVar2 = ((qxd) we11Var).b;
            if (byxVar2.b.a == Mode.MASSTRANSIT) {
            }
            z = false;
            z2 = z;
        } else if (we11Var == null) {
            if (byxVar.b.a == Mode.MASSTRANSIT) {
            }
            z = false;
            z2 = z;
        }
        return new aq00(byxVar, str, z2);
    }

    public final tpr g(byx byxVar, we11 we11Var) {
        return kotlinx.coroutines.flow.e.C(this.j.b(f(byxVar, we11Var)), new MapObjectsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1(null, this));
    }
}
