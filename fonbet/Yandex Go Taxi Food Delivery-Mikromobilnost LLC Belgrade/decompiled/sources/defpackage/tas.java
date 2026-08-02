package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class tas implements mdq0 {
    public final /* synthetic */ FpsPayEnrollFragment a;

    public tas(FpsPayEnrollFragment fpsPayEnrollFragment) {
        this.a = fpsPayEnrollFragment;
    }

    @Override // defpackage.mdq0
    public final void onAddMethodClicked() {
    }

    @Override // defpackage.mdq0
    public final void onAdditionalButtonClicked(el0 el0Var) {
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
        a viewModel;
        u8j0 t8j0Var;
        r0 r0Var;
        Object value;
        viewModel = this.a.getViewModel();
        u8j0 u8j0Var = (u8j0) viewModel.X();
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((was) r8j0Var.a).c, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return;
            }
            t8j0Var = new t8j0();
        }
        nas nasVar = (nas) t8j0Var.a();
        if (nasVar == null) {
            x4c.g("[fps-pay] onSelectedAccountChanged null state", null, null, null, 14);
            return;
        }
        pz40 Y = viewModel.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zka1.d((u8j0) value, new yas(nasVar, slVar, 0))));
    }

    @Override // defpackage.mdq0
    public final void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
    }
}
