package ru.yandex.taxi.summary.solid.preview_card.interactor;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.gev0;
import defpackage.gtq0;
import defpackage.hev0;
import defpackage.i130;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final i130 a;
    public final gev0 b;
    public final d c;
    public final ru.yandex.taxi.summary.solid.preview_card.di.a d;
    public final tt2 e;
    public final tse f;
    public final kotlinx.coroutines.sync.a g = gtq0.a();

    public a(i130 i130Var, gev0 gev0Var, d dVar, ru.yandex.taxi.summary.solid.preview_card.di.a aVar, tt2 tt2Var, tse tseVar) {
        this.a = i130Var;
        this.b = gev0Var;
        this.c = dVar;
        this.d = aVar;
        this.e = tt2Var;
        this.f = tseVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005c, code lost:
    
        if (r13 == r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        SummaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1 summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1;
        int i;
        hev0 hev0Var;
        SummaryCardPromo summaryCardPromo;
        SummaryCardPromo.ShowPolicy showPolicy;
        Collection values;
        boolean z;
        Iterator it;
        boolean z2;
        d dVar = aVar.c;
        if (continuationImpl instanceof SummaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1) {
            summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1 = (SummaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1) continuationImpl;
            int i2 = summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$0 = null;
                    summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.label = 1;
                    obj = dVar.a.a(str, summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SummaryCardPromo summaryCardPromo2 = (SummaryCardPromo) summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$2;
                        kotlin.b.b(obj);
                        return summaryCardPromo2;
                    }
                    kotlin.b.b(obj);
                }
                hev0Var = (hev0) obj;
                if (hev0Var != null && (summaryCardPromo = hev0Var.d) != null && (showPolicy = summaryCardPromo.g) != null) {
                    values = aVar.b.a.c.values();
                    z = false;
                    if ((values instanceof Collection) || !values.isEmpty()) {
                        it = values.iterator();
                        while (it.hasNext()) {
                            if (((hev0) it.next()).a) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    boolean z3 = hev0Var.a;
                    int i3 = hev0Var.c;
                    boolean z4 = i3 >= showPolicy.b;
                    if (!z2 && !z3 && z4) {
                        z = true;
                    }
                    if (z) {
                        hev0 a = hev0.a(hev0Var, i3 + 1, null, 10);
                        String str2 = showPolicy.a;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$0 = null;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$1 = null;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$2 = summaryCardPromo;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$3 = null;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.L$4 = null;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.Z$0 = z;
                        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.label = 2;
                        return dVar.a.c(str2, a, summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1) == coroutineSingletons ? coroutineSingletons : summaryCardPromo;
                    }
                }
                return null;
            }
        }
        summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1 = new SummaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1(aVar, continuationImpl);
        Object obj2 = summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryCardPromoInteractor$getSummaryCardPromoForDisplayOnce$1.label;
        if (i != 0) {
        }
        hev0Var = (hev0) obj2;
        if (hev0Var != null) {
            values = aVar.b.a.c.values();
            z = false;
            if (values instanceof Collection) {
            }
            it = values.iterator();
            while (it.hasNext()) {
            }
            z2 = false;
            boolean z32 = hev0Var.a;
            int i32 = hev0Var.c;
            if (i32 >= showPolicy.b) {
            }
            if (!z2) {
                z = true;
            }
            if (z) {
            }
        }
        return null;
    }

    public final void b(String str) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.f, mdh.b, null, new SummaryCardPromoInteractor$onSelectedTariffChanged$1(this, str, null), 2);
    }
}
