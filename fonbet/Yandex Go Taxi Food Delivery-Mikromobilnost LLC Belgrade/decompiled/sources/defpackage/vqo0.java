package defpackage;

import com.yandex.go.scooters.qr.unavailable_scooter.ui.ScootersQrUnavailableScooterModalView;

/* loaded from: classes13.dex */
public final class vqo0 implements xqo0 {
    public final /* synthetic */ ScootersQrUnavailableScooterModalView a;

    public vqo0(ScootersQrUnavailableScooterModalView scootersQrUnavailableScooterModalView) {
        this.a = scootersQrUnavailableScooterModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        oqo0 oqo0Var;
        dro0 dro0Var = (dro0) obj;
        if (!(dro0Var instanceof cro0)) {
            jl40.l(dro0Var, bro0.a);
        } else {
            oqo0Var = this.a.adapter;
            oqo0Var.submitList(((cro0) dro0Var).b, null);
        }
    }
}
