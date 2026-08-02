package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.clarify_address.before_order.b;
import com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementView;
import com.yandex.go.eboks.objects.domain.n;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.l;
import com.yandex.go.taxi.order.details.v1.elements.driver.e;
import com.yandex.messaging.ChatRequest;
import com.ybsdk.feature.boostdeposit.internal.network.BoostDepositApi;
import com.ybsdk.feature.credit.deposit.internal.network.CreditDepositApi;
import com.ybsdk.feature.credit.limitdeposit.internal.network.CreditLimitDepositApi;
import com.ybsdk.feature.mkkdeposit.internal.network.MkkDepositApi;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.delivery.interactors.h;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.c;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a;
import ru.yandex.taxi.preorder.source.domain.u;

/* loaded from: classes5.dex */
public final class qrb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public qrb(kzf kzfVar, n3w n3wVar, n3w n3wVar2, pgi pgiVar, xvf0 xvf0Var) {
        this.a = 22;
        this.d = kzfVar;
        this.e = n3wVar;
        this.c = n3wVar2;
        this.f = pgiVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new c((csb) ((xxf) xvf0Var4).b.a, (c5i) ((wxf) xvf0Var2).get(), (a) xvf0Var5.get(), (st2) ((wxf) xvf0Var).get(), (yrb) xvf0Var3.get());
            case 1:
                return j73.f0(new a151[]{(ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.widget.a) xvf0Var5.get(), (fub) ((vm80) xvf0Var4).get(), (txi) xvf0Var3.get(), (a9u) xvf0Var2.get(), (kkt0) xvf0Var.get()});
            case 2:
                return new bc((q6c0) ((tgb0) xvf0Var4).get(), (r1s) ((e3u) xvf0Var2).get(), (uxi) xvf0Var5.get(), (flg) xvf0Var3.get(), (mkt0) xvf0Var.get());
            case 3:
                return new b((tse) ((y0g) xvf0Var4).get(), (mzb) ((g0g) xvf0Var2).get(), (u) ((a1g) xvf0Var5).get(), (kr0) ((g0g) xvf0Var3).get(), (w6r) ((s0g) xvf0Var).get());
            case 4:
                return new rud((io9) ((srb) xvf0Var4).get(), (p1b) ((zob) xvf0Var2).get(), (Context) xvf0Var5.get(), (w030) xvf0Var3.get(), (sue0) ((zni0) xvf0Var).get());
            case 5:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact.b((u3s) ((n3w) xvf0Var4).a, (p6s) ((p1g) xvf0Var2).get(), (hwy0) ((gxf) xvf0Var5).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact.a) ((ncb) xvf0Var3).get(), (sae) ((srb) xvf0Var).get());
            case 6:
                hwy0 hwy0Var = (hwy0) ((exf) xvf0Var4).get();
                qcp0 qcp0Var = (qcp0) ((exf) xvf0Var2).get();
                y30 y30Var = (y30) ((exf) xvf0Var5).get();
                Context context = (Context) ((exf) xvf0Var3).get();
                yuj0 yuj0Var = (yuj0) ((exf) xvf0Var).get();
                bc bcVar = new bc();
                bcVar.b = hwy0Var;
                bcVar.c = qcp0Var;
                bcVar.w = y30Var;
                bcVar.a = context;
                bcVar.x = yuj0Var;
                return bcVar;
            case 7:
                return new t7f((Activity) ((kk) xvf0Var4).get(), (ChatRequest) ((kk) xvf0Var2).get(), (com.yandex.messaging.internal.chat.info.settings.domain.a) xvf0Var5.get(), i5m.a(xvf0Var3), (vse) xvf0Var.get());
            case 8:
                return new com.ybsdk.feature.credit.deposit.internal.data.a((CreditDepositApi) ((oaf) xvf0Var4).get(), (CreditLimitDepositApi) ((oaf) xvf0Var2).get(), (MkkDepositApi) ((oaf) xvf0Var5).get(), (BoostDepositApi) ((oaf) xvf0Var3).get(), (com.ybsdk.feature.credit.deposit.internal.domain.entities.b) ((srb) xvf0Var).get());
            case 9:
                return new q4g((apf) ((fyf) xvf0Var4).get(), (zuj0) xvf0Var5.get(), (ljz) ((fyf) xvf0Var2).get(), (k) ((qii) xvf0Var).get(), (wiq0) xvf0Var3.get(), 7);
            case 10:
                return new l((vfx0) xvf0Var5.get(), (j9i) ((fwc) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var2).get(), (viv0) xvf0Var3.get(), (com.yandex.go.summary.mapper.a) xvf0Var.get());
            case 11:
                return new ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.b((h4i) ((kyf) xvf0Var4).b.x, (ru.yandex.taxi.logistics.sdk.dashboard.storage.c) ((jyf) xvf0Var2).get(), (e100) ((di20) xvf0Var5).get(), (st2) ((jyf) xvf0Var3).get(), (c5i) ((jyf) xvf0Var).get());
            case 12:
                return new h((g580) xvf0Var5.get(), (vsi) xvf0Var3.get(), (omi) xvf0Var4.get(), (o3i) ((fyf) xvf0Var2).get(), (wiq0) xvf0Var.get());
            case 13:
                return new DeliveryRentRequirementView((Context) ((tyf) xvf0Var4).get(), (pav) ((tyf) xvf0Var2).get(), (k7x0) ((tyf) xvf0Var5).get(), (pdc) ((tyf) xvf0Var3).get(), (bmi) ((epf) xvf0Var).get());
            case 14:
                return new q4g((g191) ((c1) xvf0Var4).get(), (oh4) ((qh4) xvf0Var2).get(), (xk4) ((yk4) xvf0Var5).get(), (oh4) ((qh4) xvf0Var3).get(), (e100) ((di20) xvf0Var).get(), 9);
            case 15:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount.c((u3s) ((n3w) xvf0Var4).a, (p6s) ((p1g) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount.b) ((qy8) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var3).get(), (sae) ((srb) xvf0Var).get());
            case 16:
                return new com.yandex.go.places.impl.analytics.a((lx4) ((o4g) xvf0Var4).get(), (wbc0) xvf0Var5.get(), (hit) ((x4g) xvf0Var2).get(), (tt2) xvf0Var3.get(), (vy) xvf0Var.get());
            case 17:
                return new wt6((kdm) ((s0g) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var2).get(), (u0g) xvf0Var3, (oep0) xvf0Var5.get(), (yvw) ((v0g) xvf0Var).get());
            case 18:
                return new e((gs70) xvf0Var5.get(), (yhm) ((wrh) xvf0Var4).get(), (k7x0) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (Context) xvf0Var.get());
            case 19:
                return new q4g((gzh) xvf0Var5.get(), (zch) ((gmh) xvf0Var4).get(), (mv8) xvf0Var3.get(), i5m.a((eqh) xvf0Var2), (p6s) xvf0Var.get(), 14);
            case 20:
                zuj0 zuj0Var = (zuj0) ((jzf) xvf0Var4).get();
                ole0 ole0Var = (ole0) ((fzf) xvf0Var2).get();
                j5z j5zVar = (j5z) ((fzf) xvf0Var).get();
                nf7 nf7Var = (nf7) xvf0Var5.get();
                dqe0 dqe0Var = (dqe0) xvf0Var3.get();
                j4n j4nVar = new j4n();
                j4nVar.a = zuj0Var;
                j4nVar.b = ole0Var;
                j4nVar.c = j5zVar;
                j4nVar.x = nf7Var;
                j4nVar.y = dqe0Var;
                String h = ((avj0) zuj0Var).h(kyh0.due_chart_day_selector_date_format);
                j4nVar.z = h;
                j4nVar.w = cvu0.v(h, "EEE", "EEEE", false);
                return j4nVar;
            case 21:
                return new com.yandex.go.navigator.driving.speaker.a((tt2) xvf0Var5.get(), (wnt) xvf0Var3.get(), (my31) xvf0Var4.get(), (com.yandex.go.navigator.settings.network.repository.a) ((wz30) xvf0Var2).get(), (dz31) xvf0Var.get());
            case 22:
                return new yhn((ah00) ((kzf) xvf0Var4).get(), (tgn) ((n3w) xvf0Var2).a, (dhn) ((n3w) xvf0Var3).a, (com.yandex.go.eboks.objects.ui.a) ((pgi) xvf0Var).get(), (din) xvf0Var5.get());
            case 23:
                return new vin((tt2) ((kzf) xvf0Var4).get(), (din) xvf0Var5.get(), (hin) xvf0Var3.get(), (com.yandex.go.eboks.objects.data.a) xvf0Var2.get(), (n) ((nt0) xvf0Var).get());
            case 24:
                return new gon((f4l0) ((fxf) xvf0Var4).get(), (zqb0) ((exf) xvf0Var2).get(), (u1n) ((k0n) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a) xvf0Var5.get(), (p070) ((lq40) xvf0Var).get());
            case 25:
                return new com.ybsdk.feature.kycesia.internal.domain.b((tfl0) ((byf) xvf0Var4).get(), (lbo) ((byf) xvf0Var2).get(), (com.ybsdk.di.modules.features.kyc.a) ((byf) xvf0Var5).get(), (pbo) ((byf) xvf0Var3).get(), (jbo) ((byf) xvf0Var).get());
            case 26:
                return new ExternalServiceModalView((Context) ((jzf) xvf0Var4).get(), (q7w0) xvf0Var5.get(), (g2p) ((ii9) xvf0Var2).get(), (x6w0) xvf0Var3.get(), (pav) ((szf) xvf0Var).get());
            case 27:
                return new w4p((d800) xvf0Var5.get(), (ru.yandex.taxi.preorder.extraphone.e) xvf0Var3.get(), (jdj) ((cto) xvf0Var4).get(), (rv70) xvf0Var2.get(), (u1n) ((c4p) xvf0Var).get());
            case 28:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.a((z22) ((twf) xvf0Var4).get(), (wjm) ((pgi) xvf0Var2).get(), (FlexAdapter) xvf0Var5.get(), (com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester.c) ((c4p) xvf0Var).get(), (ns31) xvf0Var3.get());
            default:
                return new qw1((cda0) xvf0Var5.get(), (dqe0) ((w0g) xvf0Var4).get(), (g) xvf0Var3.get(), i5m.a((s0g) xvf0Var2), (m2s) ((s0g) xvf0Var).get(), 1);
        }
    }

    public /* synthetic */ qrb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, byte b) {
        this.a = i;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.b = xvf0Var3;
        this.c = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ qrb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, char c) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ qrb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, int i2) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.c = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ qrb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, short s) {
        this.a = i;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.c = xvf0Var3;
        this.b = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ qrb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ qrb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.b = xvf0Var3;
        this.f = xvf0Var4;
        this.c = xvf0Var5;
    }

    public qrb(jzf jzfVar, fzf fzfVar, fzf fzfVar2, fzf fzfVar3, fzf fzfVar4) {
        this.a = 20;
        this.d = jzfVar;
        this.e = fzfVar;
        this.f = fzfVar2;
        this.b = fzfVar3;
        this.c = fzfVar4;
    }

    public qrb(kzf kzfVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, nt0 nt0Var) {
        this.a = 23;
        this.d = kzfVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
        this.f = nt0Var;
    }

    public qrb(fyf fyfVar, gyf gyfVar, fyf fyfVar2, qii qiiVar, gyf gyfVar2) {
        this.a = 9;
        this.d = fyfVar;
        this.b = gyfVar;
        this.e = fyfVar2;
        this.f = qiiVar;
        this.c = gyfVar2;
    }

    public qrb(xvf0 xvf0Var, fwc fwcVar, w0g w0gVar, b1g b1gVar, s3f0 s3f0Var) {
        this.a = 10;
        this.b = xvf0Var;
        this.d = fwcVar;
        this.e = w0gVar;
        this.c = b1gVar;
        this.f = s3f0Var;
    }
}
