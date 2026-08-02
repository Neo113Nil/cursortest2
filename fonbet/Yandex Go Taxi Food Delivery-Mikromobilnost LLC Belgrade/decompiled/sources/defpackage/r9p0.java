package defpackage;

import com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoModalView;

/* loaded from: classes13.dex */
public final class r9p0 implements t9p0 {
    public final /* synthetic */ ScootersZonesInfoModalView a;

    public r9p0(ScootersZonesInfoModalView scootersZonesInfoModalView) {
        this.a = scootersZonesInfoModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        k9p0 k9p0Var;
        dap0 dap0Var = (dap0) obj;
        if (dap0Var instanceof cap0) {
            k9p0Var = this.a.adapter;
            k9p0Var.submitList(((cap0) dap0Var).a, null);
        } else {
            if (jl40.l(dap0Var, bap0.a)) {
                return;
            }
            w511.b();
        }
    }
}
