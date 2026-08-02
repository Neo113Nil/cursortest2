package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class r04 implements mdq0 {
    public final /* synthetic */ AutoTopupSetupV2Fragment a;

    public r04(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment) {
        this.a = autoTopupSetupV2Fragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
        b access$getViewModel = AutoTopupSetupV2Fragment.access$getViewModel(this.a);
        if (((sv3) access$getViewModel.C).a.c(el0Var.d).b) {
            return;
        }
        access$getViewModel.h0();
    }

    @Override // defpackage.mdq0
    public final void onBackPressedFromSbp() {
    }

    @Override // defpackage.mdq0
    public final void onCreditPaymentMethodChanged(saf safVar) {
    }

    @Override // defpackage.mdq0
    public final void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onSbpWidgetClicked() {
    }

    @Override // defpackage.mdq0
    public final void onSelectedAccountChanged(sl slVar) {
    }

    @Override // defpackage.mdq0
    public final void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
        b access$getViewModel = AutoTopupSetupV2Fragment.access$getViewModel(this.a);
        access$getViewModel.getClass();
        lrp0 lrp0Var = lrp0.d;
        String action = h5a0Var.getAction();
        z2z c = action != null ? ((sv3) access$getViewModel.C).a.c(action) : null;
        if ((c != null ? c.a : null) instanceof v0h) {
            return;
        }
        String action2 = h5a0Var.getAction();
        if (action2 != null && !evu0.J(action2)) {
            x4c.g("Failed to resolve action on payment method click", null, h5a0Var.getAction(), Collections.singletonList(lrp0Var), 2);
        }
        thq0 thq0Var = new thq0(h5a0Var);
        su3 su3Var = ((u04) access$getViewModel.X()).g;
        if (su3Var instanceof ru3) {
            access$getViewModel.g0(thq0Var);
            return;
        }
        if (su3Var instanceof pu3) {
            access$getViewModel.v0(thq0Var);
            return;
        }
        if ((su3Var instanceof mu3) || (su3Var instanceof lu3) || jl40.l(su3Var, nu3.a) || jl40.l(su3Var, qu3.a) || su3Var == null) {
            x4c.g("onSelectedPaymentMethodChanged with state", null, String.valueOf(((u04) access$getViewModel.X()).g), Collections.singletonList(lrp0Var), 2);
        } else {
            w511.b();
        }
    }
}
