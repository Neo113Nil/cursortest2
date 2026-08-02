package ru.yandex.taxi.preorder.summary.tariffpage.interactors;

import com.yandex.go.payments.domain.m0;
import defpackage.a7t0;
import defpackage.ekz;
import defpackage.fco;
import defpackage.jk31;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class e {
    public final m0 a;
    public final pwy0 b;
    public final ekz c;
    public final jk31 d;
    public final ru.yandex.taxi.preorder.summary.tariffpage.data.vertical.a e;
    public final SummaryStateTracker f;
    public final tt2 g;
    public final fco h;

    public e(m0 m0Var, pwy0 pwy0Var, ekz ekzVar, jk31 jk31Var, ru.yandex.taxi.preorder.summary.tariffpage.data.vertical.a aVar, SummaryStateTracker summaryStateTracker, tt2 tt2Var, fco fcoVar) {
        this.a = m0Var;
        this.b = pwy0Var;
        this.c = ekzVar;
        this.d = jk31Var;
        this.e = aVar;
        this.f = summaryStateTracker;
        this.g = tt2Var;
        this.h = fcoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ContinuationImpl continuationImpl) {
        TariffPagerDataInteractor$waitForPagerUpdate$1 tariffPagerDataInteractor$waitForPagerUpdate$1;
        int i;
        SummaryStateTracker summaryStateTracker = eVar.f;
        if (continuationImpl instanceof TariffPagerDataInteractor$waitForPagerUpdate$1) {
            tariffPagerDataInteractor$waitForPagerUpdate$1 = (TariffPagerDataInteractor$waitForPagerUpdate$1) continuationImpl;
            int i2 = tariffPagerDataInteractor$waitForPagerUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPagerDataInteractor$waitForPagerUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffPagerDataInteractor$waitForPagerUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPagerDataInteractor$waitForPagerUpdate$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                SummaryStateTracker.SolidSummaryState a = summaryStateTracker.a();
                if (a != SummaryStateTracker.SolidSummaryState.EXPANDED && a != SummaryStateTracker.SolidSummaryState.TRANSITIONING) {
                    h K = kotlinx.coroutines.flow.e.K(new d(summaryStateTracker.a, eVar), new rol0(new TariffPagerDataInteractor$waitForPagerUpdate$3(2, null)));
                    tariffPagerDataInteractor$waitForPagerUpdate$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(K, tariffPagerDataInteractor$waitForPagerUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        tariffPagerDataInteractor$waitForPagerUpdate$1 = new TariffPagerDataInteractor$waitForPagerUpdate$1(eVar, continuationImpl);
        Object obj2 = tariffPagerDataInteractor$waitForPagerUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPagerDataInteractor$waitForPagerUpdate$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final tpr b() {
        h K = kotlinx.coroutines.flow.e.K(new mth(this.b.a(), 4), this.c.a());
        jk31 jk31Var = this.d;
        b bVar = new b(new mth(new j0(null, kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.m(kotlinx.coroutines.flow.e.X(((a7t0) jk31Var.b).a, new VerticalsUpdateInteractor$verticalsSnapshotFlow$$inlined$flatMapLatest$1(null, jk31Var)), this.a.b(), this.h.b, new n(K, new TariffPagerDataInteractor$dataFlow$1(2, null)), new TariffPagerDataInteractor$dataFlow$2(this, null)), new TariffPagerDataInteractor$dataFlow$3(this, null)), new TariffPagerDataInteractor$dataFlow$$inlined$withPreviousEmit$1(3, null)), 6));
        this.g.getClass();
        return kotlinx.coroutines.flow.e.F(bVar, uyj.a);
    }
}
