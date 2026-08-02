package ru.yandex.taxi.main_screen_custom.presentation.analytics;

import com.yandex.go.analytics.realtime.event.CreativeType;
import defpackage.dei0;
import defpackage.e400;
import defpackage.fei0;
import defpackage.gei0;
import defpackage.hei0;
import defpackage.iei0;
import defpackage.lx4;
import defpackage.mnf0;
import defpackage.ny61;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final lx4 a;
    public final dei0 b;
    public final gei0 c;
    public final e400 d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();

    public a(lx4 lx4Var, dei0 dei0Var, gei0 gei0Var, e400 e400Var) {
        this.a = lx4Var;
        this.b = dei0Var;
        this.c = gei0Var;
        this.d = e400Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mnf0 mnf0Var, ContinuationImpl continuationImpl) {
        PromoObjectAnalytics$reportPromoShownRealtime$1 promoObjectAnalytics$reportPromoShownRealtime$1;
        int i;
        Map a;
        if (continuationImpl instanceof PromoObjectAnalytics$reportPromoShownRealtime$1) {
            promoObjectAnalytics$reportPromoShownRealtime$1 = (PromoObjectAnalytics$reportPromoShownRealtime$1) continuationImpl;
            int i2 = promoObjectAnalytics$reportPromoShownRealtime$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoObjectAnalytics$reportPromoShownRealtime$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoObjectAnalytics$reportPromoShownRealtime$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoObjectAnalytics$reportPromoShownRealtime$1.label;
                LinkedHashSet linkedHashSet = this.e;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    if (!linkedHashSet.contains(mnf0Var.e()) && (a = mnf0Var.a()) != null && !a.isEmpty()) {
                        fei0 a2 = ((hei0) this.c).a();
                        if (a2 != null) {
                            long a3 = a2.a();
                            promoObjectAnalytics$reportPromoShownRealtime$1.L$0 = mnf0Var;
                            promoObjectAnalytics$reportPromoShownRealtime$1.J$0 = a3;
                            promoObjectAnalytics$reportPromoShownRealtime$1.label = 1;
                            if (kotlinx.coroutines.a.j(a3, promoObjectAnalytics$reportPromoShownRealtime$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mnf0Var = (mnf0) promoObjectAnalytics$reportPromoShownRealtime$1.L$0;
                b.b(obj);
                linkedHashSet.add(mnf0Var.e());
                ((com.yandex.go.analytics.realtime.a) this.b).d(new iei0(CreativeType.PromoOverMap, mnf0Var.e(), mnf0Var.a(), null, 18));
                return zy11Var;
            }
        }
        promoObjectAnalytics$reportPromoShownRealtime$1 = new PromoObjectAnalytics$reportPromoShownRealtime$1(this, continuationImpl);
        Object obj2 = promoObjectAnalytics$reportPromoShownRealtime$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoObjectAnalytics$reportPromoShownRealtime$1.label;
        LinkedHashSet linkedHashSet2 = this.e;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        linkedHashSet2.add(mnf0Var.e());
        ((com.yandex.go.analytics.realtime.a) this.b).d(new iei0(CreativeType.PromoOverMap, mnf0Var.e(), mnf0Var.a(), null, 18));
        return zy11Var2;
    }
}
