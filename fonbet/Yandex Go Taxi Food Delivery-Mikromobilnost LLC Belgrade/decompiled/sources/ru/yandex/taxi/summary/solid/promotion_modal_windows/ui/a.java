package ru.yandex.taxi.summary.solid.promotion_modal_windows.ui;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.fnx0;
import defpackage.ilv0;
import defpackage.jl40;
import defpackage.jlv0;
import defpackage.llv0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tje;
import defpackage.v330;
import defpackage.wiq0;
import defpackage.wu1;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.summary.promotions.repository.e;

/* loaded from: classes6.dex */
public final class a extends jlv0 {
    public final llv0 D;
    public final e E;
    public final wiq0 F;

    public a(llv0 llv0Var, e eVar, wiq0 wiq0Var) {
        this.D = llv0Var;
        this.E = eVar;
        this.F = wiq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, String str, ContinuationImpl continuationImpl) {
        SummaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1 summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof SummaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1) {
            summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1 = (SummaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1) continuationImpl;
            int i2 = summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.label;
                if (i != 0) {
                    b.b(obj);
                    fnx0 n = ((k) aVar.F).n();
                    if (n != null) {
                        e eVar = aVar.E;
                        pex0 pex0Var = n.c;
                        String str2 = pex0Var.b;
                        wu1 wu1Var = pex0Var.O;
                        String a = wu1Var != null ? wu1Var.a() : null;
                        summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.L$0 = str;
                        summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.L$1 = null;
                        summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.label = 1;
                        obj = eVar.i(str2, a, EmptyList.a, summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.L$0;
                b.b(obj);
                for (Object obj2 : (List) obj) {
                    if (jl40.l(((ilv0) obj2).getId(), str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1 = new SummaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1(aVar, continuationImpl);
        Object obj3 = summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new SummaryPromotionModalWindowByIdRouterImpl$onLaunch$1(this, ((v330) obj).a, null), 3);
    }
}
