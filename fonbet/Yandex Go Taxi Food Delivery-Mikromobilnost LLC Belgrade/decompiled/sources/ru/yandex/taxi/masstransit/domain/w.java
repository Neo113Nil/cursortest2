package ru.yandex.taxi.masstransit.domain;

import defpackage.ed30;
import defpackage.g540;
import defpackage.igl0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ igl0 b;
    public final /* synthetic */ y c;

    public w(vpr vprVar, igl0 igl0Var, y yVar) {
        this.a = vprVar;
        this.b = igl0Var;
        this.c = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
    
        if (r6.emit(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b0 -> B:17:0x00b3). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1 mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1;
        int i;
        Iterator it;
        vpr vprVar;
        Collection collection;
        if (continuation instanceof MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1) {
            mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1 = (MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    it = ((List) obj).iterator();
                    vprVar = this.a;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                it = (Iterator) mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$11;
                collection = (Collection) mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$9;
                vprVar = (vpr) mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                ed30 ed30Var = (ed30) obj2;
                if (ed30Var != null) {
                    collection.add(ed30Var);
                }
                if (it.hasNext()) {
                    Pair pair = new Pair((List) collection, this.b);
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$0 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$1 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$2 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$3 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$4 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$5 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$6 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$7 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$8 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$9 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$10 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$11 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$12 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$13 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$14 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    g540 g540Var = (g540) it.next();
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$0 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$1 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$2 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$3 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$5 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$6 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$7 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$8 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$9 = collection;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$10 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$11 = it;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$12 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$13 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.L$14 = null;
                    mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = y.a(this.c, g540Var, mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1);
                }
                return coroutineSingletons;
            }
        }
        mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1 = new MtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPromoInteractor$transportSummaryPromotionsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
    }
}
