package ru.yandex.taxi.summary.requirements.list.experiment;

import defpackage.bz8;
import defpackage.dz8;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.pnj0;
import defpackage.tcc;
import defpackage.unj0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ unj0 b;

    public a(vpr vprVar, unj0 unj0Var) {
        this.a = vprVar;
        this.b = unj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1 requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1;
        int i;
        dz8 dz8Var;
        if (continuation instanceof RequirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1) {
            requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1 = (RequirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pnj0 pnj0Var = (pnj0) obj;
                    if (pnj0Var.b) {
                        String str = pnj0Var.d;
                        unj0 unj0Var = this.b;
                        Map d = unj0Var.d(pnj0Var, str);
                        if (d == null) {
                            d = kotlin.collections.b.f();
                        }
                        List<pnj0.c> list = pnj0Var.e;
                        int d2 = gw00.d(tcc.n(list, 10));
                        if (d2 < 16) {
                            d2 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                        for (pnj0.c cVar : list) {
                            bz8 bz8Var = new bz8(cVar.b, cVar.c);
                            Map d3 = unj0Var.d(pnj0Var, cVar.a);
                            if (d3 == null) {
                                d3 = kotlin.collections.b.f();
                            }
                            Pair pair = new Pair(bz8Var, kotlin.collections.b.n(d, d3));
                            linkedHashMap.put(pair.c(), pair.f());
                        }
                        dz8Var = new dz8(linkedHashMap, d);
                    } else {
                        dz8Var = new dz8(kotlin.collections.b.f(), kotlin.collections.b.f());
                    }
                    requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(dz8Var, requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1 = new RequirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsCarouselOverrideExperimentRepository$carouselOverrideFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
