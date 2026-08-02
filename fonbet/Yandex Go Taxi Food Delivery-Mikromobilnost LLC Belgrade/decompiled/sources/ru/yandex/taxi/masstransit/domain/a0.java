package ru.yandex.taxi.masstransit.domain;

import defpackage.gs30;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a0 implements tpr {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ gs30 c;

    public a0(c0 c0Var, Map map, gs30 gs30Var) {
        this.a = c0Var;
        this.b = map;
        this.c = gs30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1 mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1) {
            mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1 = (MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1) continuation;
            int i2 = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z zVar = new z(vprVar, this.b, this.c);
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.L$0 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.L$1 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.L$2 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(zVar, mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1 = new MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
