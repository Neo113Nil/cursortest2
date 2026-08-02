package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingState;
import com.ybsdk.feature.autotopup.internal.presentation.saver.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class vyk0 implements mdq0 {
    public final /* synthetic */ RoundingFragment a;

    public vyk0(RoundingFragment roundingFragment) {
        this.a = roundingFragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
        b access$getViewModel = RoundingFragment.access$getViewModel(this.a);
        if (((sv3) access$getViewModel.H).a.c(el0Var.d).b) {
            return;
        }
        access$getViewModel.Z(hzk0.a);
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
        r0 r0Var;
        Object value;
        g5a0 g5a0Var = h5a0Var instanceof g5a0 ? (g5a0) h5a0Var : null;
        if (g5a0Var == null) {
            return;
        }
        b access$getViewModel = RoundingFragment.access$getViewModel(this.a);
        access$getViewModel.getClass();
        String str = g5a0Var.f;
        if (str != null && !evu0.J(str)) {
            ((sv3) access$getViewModel.H).c(str);
            return;
        }
        access$getViewModel.J.w(access$getViewModel.C, g5a0Var, (ezk0) ((RoundingState) access$getViewModel.X()).e.a());
        pz40 Y = access$getViewModel.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, null, null, g5a0Var, 63)));
        access$getViewModel.w0();
    }
}
