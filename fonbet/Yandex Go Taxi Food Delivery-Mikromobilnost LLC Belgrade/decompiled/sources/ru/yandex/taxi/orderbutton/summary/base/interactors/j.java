package ru.yandex.taxi.orderbutton.summary.base.interactors;

import defpackage.db5;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.j7h;
import defpackage.jst;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vi70;
import defpackage.wi70;
import defpackage.xi70;
import defpackage.xy40;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.orderbutton.summary.base.analytics.SummaryOrderButtonAnalytics;

/* loaded from: classes6.dex */
public final class j extends db5 {
    public final h3y a;
    public final j7h b;
    public final List c;

    public j(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, h3y h3yVar9, h3y h3yVar10, h3y h3yVar11, h3y h3yVar12, h3y h3yVar13, h3y h3yVar14, h3y h3yVar15, h3y h3yVar16, h3y h3yVar17, j7h j7hVar) {
        this.a = h3yVar17;
        this.b = j7hVar;
        this.c = scc.g(h3yVar2, h3yVar4, h3yVar13, h3yVar7, h3yVar11, h3yVar14, h3yVar9, h3yVar8, h3yVar6, h3yVar, h3yVar12, h3yVar5, h3yVar3, h3yVar10, h3yVar15, h3yVar16);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.db5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vi70 vi70Var, Continuation continuation) {
        TaxiSummaryButtonModelInteractor$createModel$1 taxiSummaryButtonModelInteractor$createModel$1;
        int i;
        Iterator it;
        if (continuation instanceof TaxiSummaryButtonModelInteractor$createModel$1) {
            taxiSummaryButtonModelInteractor$createModel$1 = (TaxiSummaryButtonModelInteractor$createModel$1) continuation;
            int i2 = taxiSummaryButtonModelInteractor$createModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiSummaryButtonModelInteractor$createModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiSummaryButtonModelInteractor$createModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiSummaryButtonModelInteractor$createModel$1.label;
                j7h j7hVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = this.c.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xi70 xi70Var = (xi70) taxiSummaryButtonModelInteractor$createModel$1.L$3;
                    it = (Iterator) taxiSummaryButtonModelInteractor$createModel$1.L$1;
                    vi70 vi70Var2 = (vi70) taxiSummaryButtonModelInteractor$createModel$1.L$0;
                    kotlin.b.b(obj);
                    xi70 xi70Var2 = xi70Var;
                    vi70Var = vi70Var2;
                    Object a = obj;
                    wi70 wi70Var = (wi70) a;
                    if (wi70Var != null) {
                        if (!evu0.J(wi70Var.a)) {
                            return wi70Var;
                        }
                        SummaryOrderButtonAnalytics summaryOrderButtonAnalytics = (SummaryOrderButtonAnalytics) this.a.get();
                        SummaryOrderButtonAnalytics.SummaryEmptyOrderButtonException summaryEmptyOrderButtonException = new SummaryOrderButtonAnalytics.SummaryEmptyOrderButtonException(xi70Var2.b());
                        summaryOrderButtonAnalytics.getClass();
                        String creator = summaryEmptyOrderButtonException.getCreator();
                        xy40 xy40Var = summaryOrderButtonAnalytics.a;
                        if (xy40Var.c(creator) < 0) {
                            xy40Var.g(creator);
                            jst.e.k(summaryEmptyOrderButtonException, "SummaryOrderButton." + creator);
                        }
                        return j7hVar.a(vi70Var, vi70Var.b);
                    }
                    if (it.hasNext()) {
                        xi70Var2 = (xi70) ((h3y) it.next()).get();
                        taxiSummaryButtonModelInteractor$createModel$1.L$0 = vi70Var;
                        taxiSummaryButtonModelInteractor$createModel$1.L$1 = it;
                        taxiSummaryButtonModelInteractor$createModel$1.L$2 = null;
                        taxiSummaryButtonModelInteractor$createModel$1.L$3 = xi70Var2;
                        taxiSummaryButtonModelInteractor$createModel$1.label = 1;
                        a = xi70Var2.a(vi70Var, taxiSummaryButtonModelInteractor$createModel$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        wi70 wi70Var2 = (wi70) a;
                        if (wi70Var2 != null) {
                        }
                        if (it.hasNext()) {
                            return j7hVar.a(vi70Var, vi70Var.b);
                        }
                    }
                }
            }
        }
        taxiSummaryButtonModelInteractor$createModel$1 = new TaxiSummaryButtonModelInteractor$createModel$1(this, (ContinuationImpl) continuation);
        Object obj2 = taxiSummaryButtonModelInteractor$createModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiSummaryButtonModelInteractor$createModel$1.label;
        j7h j7hVar2 = this.b;
        if (i != 0) {
        }
    }
}
