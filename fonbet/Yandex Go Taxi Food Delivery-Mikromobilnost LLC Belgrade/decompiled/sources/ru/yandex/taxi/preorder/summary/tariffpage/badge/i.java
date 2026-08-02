package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import com.yandex.go.payments.domain.m0;
import defpackage.d770;
import defpackage.dkx0;
import defpackage.ebx0;
import defpackage.i3y;
import defpackage.iv70;
import defpackage.jv70;
import defpackage.kv70;
import defpackage.lbx0;
import defpackage.m1a0;
import defpackage.m8t0;
import defpackage.mi31;
import defpackage.mth;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.pex0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wl4;
import defpackage.zuj0;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class i implements ebx0 {
    public final iv70 a;
    public final m0 b;
    public final dkx0 c;
    public final d770 d;
    public final zuj0 e;
    public final i3y f = kotlin.a.b(LazyThreadSafetyMode.NONE, new ogu0(11, this));

    public i(iv70 iv70Var, m0 m0Var, dkx0 dkx0Var, d770 d770Var, zuj0 zuj0Var) {
        this.a = iv70Var;
        this.b = m0Var;
        this.c = dkx0Var;
        this.d = d770Var;
        this.e = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, mi31 mi31Var, ContinuationImpl continuationImpl) {
        SummaryPaymentSelectionTariffBadgeInteractor$createBadges$1 summaryPaymentSelectionTariffBadgeInteractor$createBadges$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof SummaryPaymentSelectionTariffBadgeInteractor$createBadges$1) {
            summaryPaymentSelectionTariffBadgeInteractor$createBadges$1 = (SummaryPaymentSelectionTariffBadgeInteractor$createBadges$1) continuationImpl;
            int i2 = summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pex0 pex0Var = mi31Var.a;
                    iv70 iv70Var = iVar.a;
                    TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                    ((kv70) iv70Var).getClass();
                    switch (jv70.a[tariffOrderFlow.ordinal()]) {
                        case 1:
                        case 2:
                        case 4:
                            return EmptyList.a;
                        case 3:
                        case 5:
                        case 6:
                            m0 m0Var = iVar.b;
                            summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.L$0 = null;
                            summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.label = 1;
                            obj = m0Var.a(summaryPaymentSelectionTariffBadgeInteractor$createBadges$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                m1a0 m1a0Var = (m1a0) obj;
                ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                return Collections.singletonList(new wl4(null, bVar.c((String) iVar.f.getValue()), bVar.c(m1a0Var.a), 0, null, null, null, new lbx0(m1a0Var), null, null, null, null, new m8t0(27, iVar), 65273));
            }
        }
        summaryPaymentSelectionTariffBadgeInteractor$createBadges$1 = new SummaryPaymentSelectionTariffBadgeInteractor$createBadges$1(iVar, continuationImpl);
        Object obj2 = summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaymentSelectionTariffBadgeInteractor$createBadges$1.label;
        if (i != 0) {
        }
        m1a0 m1a0Var2 = (m1a0) obj2;
        ru.yandex.taxi.common_models.net.b bVar2 = FormattedText.Companion;
        return Collections.singletonList(new wl4(null, bVar2.c((String) iVar.f.getValue()), bVar2.c(m1a0Var2.a), 0, null, null, null, new lbx0(m1a0Var2), null, null, null, null, new m8t0(27, iVar), 65273));
    }

    @Override // defpackage.ebx0
    public final tpr a(tpr tprVar) {
        return new h((mth) tprVar, this);
    }
}
