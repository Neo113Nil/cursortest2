package defpackage;

import android.os.Bundle;
import android.view.View;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.scooters.deposit.notification.ui.ScootersDepositNotification;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.input.quote.a;
import com.yandex.plus.core.config.Environment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import com.ybsdk.rconfig.b;
import java.util.ArrayList;
import ru.yandex.taxi.plus.purchase.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class vfc0 implements uf41, est, e5o, ptn, xc7, f18, kds, nl21, y0j, go3, nry0, j8y, cx4, bx60, dnu0, mlf, ai60, mep0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vfc0(b bVar, twu0 twu0Var) {
        this.a = 10;
        this.b = bVar;
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        a aVar = (a) this.b;
        String str = o0kVar.a;
        wlg0 wlg0Var = aVar.b;
        z83.b(null, 0, Integer.valueOf(wlg0Var.a.a.a().getVisibility()));
        wlg0Var.g.setText(str);
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        ((sxj0) this.b).b((RestrictionsBucket) obj);
    }

    @Override // defpackage.xc7
    public void a(long j, long j2, long j3) {
        t7m t7mVar = ((jkf0) this.b).f;
        if (t7mVar == null) {
            return;
        }
        t7mVar.b(j, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j, j2);
    }

    @Override // defpackage.j8y
    public void b(long j, vfk0 vfk0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                RideCardCompactView.itemsAdapter_delegate$lambda$0$0((RideCardCompactView) obj, j, vfk0Var);
                break;
            default:
                RideCardModalView.itemsAdapter_delegate$lambda$0$0((RideCardModalView) obj, j, vfk0Var);
                break;
        }
    }

    @Override // defpackage.f18
    public void cancel() {
        muf0.b((l8x) this.b);
    }

    @Override // defpackage.dnu0
    public void d(String str, ArrayList arrayList) {
        SafetyCenterMainView._init_$lambda$2((SafetyCenterMainView) this.b, arrayList, str);
    }

    @Override // defpackage.nry0
    public boolean e(CharSequence charSequence) {
        boolean ellipsizer$lambda$0;
        ellipsizer$lambda$0 = RidaHeaderView.ellipsizer$lambda$0((RidaHeaderView) this.b, charSequence);
        return ellipsizer$lambda$0;
    }

    public void f() {
        ((d) this.b).Kg();
    }

    @Override // defpackage.cx4
    public void g() {
        ((ej1) this.b).r(new z0l0(13));
    }

    @Override // defpackage.e5o
    public Environment getEnvironment() {
        return ((fbd0) this.b).b == ru.yandex.taxi.plus.sdk.Environment.PRODUCTION ? Environment.PRODUCTION : Environment.TESTING;
    }

    @Override // defpackage.ai60
    public void i(boolean z) {
        ScootersDepositNotification._init_$lambda$1((ScootersDepositNotification) this.b, z);
    }

    @Override // defpackage.mep0
    public ru.yandex.taxi.superapp.shortcuts.a k(dgp0 dgp0Var) {
        w040 w040Var = (w040) this.b;
        tse tseVar = (tse) w040Var.b;
        com.yandex.go.scooters.discovery.shortcuts.a aVar = new com.yandex.go.scooters.discovery.shortcuts.a((xvo0) w040Var.g);
        yvo0 yvo0Var = (yvo0) w040Var.h;
        zvo0 zvo0Var = (zvo0) w040Var.f;
        dgp0Var.getClass();
        return new ru.yandex.taxi.superapp.shortcuts.a(tseVar, dgp0Var.a, yvo0Var, zvo0Var, aVar);
    }

    @Override // defpackage.ptn
    public void m(otn otnVar) {
        ((mae0) this.b).h.setData(otnVar);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        ((gol0) this.b).d(n751Var);
        return n751Var;
    }

    @Override // defpackage.uf41
    public void onClose() {
        ((wfc0) this.b).r(new qu(9));
    }

    @Override // defpackage.mlf
    public void onRefresh() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 24:
                com.ybsdk.feature.savings.internal.screens.account.a aVar = (com.ybsdk.feature.savings.internal.screens.account.a) obj;
                aVar.E.f0.a.a("savings.account.pulled_to_refresh", null);
                aVar.d0(true);
                break;
            case 25:
                SavingsDashboardFragmentV2.setupListeners$lambda$3((SavingsDashboardFragmentV2) obj);
                break;
            default:
                c cVar = (c) obj;
                ((AppAnalyticsReporter) cVar.H.a).f0.a.a("savings.dashboard.pulled_to_refresh", null);
                cVar.d0(false);
                break;
        }
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        QrPaymentsSubscriptionFragment.onViewCreated$lambda$7((QrPaymentsSubscriptionFragment) this.b, str, bundle);
    }

    public /* synthetic */ vfc0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
