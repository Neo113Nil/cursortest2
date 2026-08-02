package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import com.ybsdk.feature.split.deposit.api.model.SelectedAutoTopupPaymentMethod;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusScreenParams;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class vw3 extends uc5 {
    public final b3z B;
    public final tfl0 C;
    public final gtt0 D;
    public final yjh E;
    public final m04 F;
    public final zxs0 G;

    public vw3(b3z b3zVar, tfl0 tfl0Var, gtt0 gtt0Var, yjh yjhVar, m04 m04Var, zxs0 zxs0Var, yw3 yw3Var, itt0 itt0Var) {
        super(new tw3(itt0Var, 0), yw3Var);
        this.B = b3zVar;
        this.C = tfl0Var;
        this.D = gtt0Var;
        this.E = yjhVar;
        this.F = m04Var;
        this.G = zxs0Var;
        m04Var.a.k0.a.a("split_deposit.auto_topup_payment_methods.shown", null);
        b3zVar.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, this, 8));
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, sw3.a((sw3) value, null, 13)));
    }

    public final void c0(SelectedAutoTopupPaymentMethod selectedAutoTopupPaymentMethod) {
        FragmentScreen a = this.E.a();
        gtt0 gtt0Var = this.D;
        gtt0Var.getClass();
        SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams = new SplitDepositAutoTopupStatusScreenParams(selectedAutoTopupPaymentMethod.getLogo(), selectedAutoTopupPaymentMethod.getId(), selectedAutoTopupPaymentMethod.getPaymentMethodType());
        gtt0Var.b.getClass();
        this.C.c(a, new FragmentScreen("SplitDepositAutoTopupStatusScreen", false, splitDepositAutoTopupStatusScreenParams, TransitionPolicyType.POPUP, qoi0.a(SplitDepositAutoTopupStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null));
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        PaymentMethodType paymentMethodType;
        ug6 ug6Var = ((sw3) X()).b;
        if (!(ug6Var instanceof rg6)) {
            if (!jl40.l(ug6Var, sg6.a)) {
                if (ug6Var == null) {
                    return;
                }
                w511.b();
                return;
            }
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, sw3.a((sw3) value, null, 7)));
            b0();
            zxs0 zxs0Var = this.G;
            ((tfl0) zxs0Var.a).h(((wig) zxs0Var.b).d(SettingsOpeningSource.MENU));
            return;
        }
        this.F.a.k0.a.a("split_deposit.auto_topup_payment_methods.done_button.click", null);
        h5a0 h5a0Var = ((rg6) ug6Var).a;
        if (h5a0Var == null) {
            b0();
            this.C.e();
            return;
        }
        b0();
        ThemedImageUrlEntity d = h5a0Var.d();
        ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(d != null ? d.getLightUrl() : null, d != null ? d.getDarkUrl() : null);
        String id = h5a0Var.getId();
        if (h5a0Var instanceof c5a0) {
            paymentMethodType = PaymentMethodType.Card;
        } else if (h5a0Var instanceof e5a0) {
            paymentMethodType = PaymentMethodType.Me2Me;
        } else if (h5a0Var instanceof f5a0) {
            paymentMethodType = PaymentMethodType.SavingsAccount;
        } else {
            if (!(h5a0Var instanceof g5a0)) {
                w511.b();
                return;
            }
            paymentMethodType = PaymentMethodType.YandexAccount;
        }
        c0(new SelectedAutoTopupPaymentMethod(themedImageUrlEntity, id, paymentMethodType));
    }

    public final void e0() {
        this.F.a.k0.a.a("split_deposit.auto_topup_payment_methods.dismissed", null);
        if (((sw3) X()).b != null) {
            this.C.e();
        }
    }

    public final void f0() {
        if (((sw3) X()).d) {
            Z(rw3.a);
            this.C.e();
        }
    }
}
