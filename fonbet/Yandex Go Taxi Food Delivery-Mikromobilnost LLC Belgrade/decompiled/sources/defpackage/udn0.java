package defpackage;

import com.yandex.go.scooters.deposit.communication.ui.ScootersDepositCommunicationModalView;

/* loaded from: classes13.dex */
public final class udn0 implements xdn0 {
    public final /* synthetic */ ScootersDepositCommunicationModalView a;

    public udn0(ScootersDepositCommunicationModalView scootersDepositCommunicationModalView) {
        this.a = scootersDepositCommunicationModalView;
    }

    @Override // defpackage.xdn0
    public final void d3() {
        this.a.logAnalyticEventOnClosedByButton();
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        vdn0 binding;
        aen0 aen0Var = (aen0) obj;
        binding = this.a.getBinding();
        binding.d.setText(aen0Var.a);
        binding.b.setText(aen0Var.b);
        binding.c.setTitle(aen0Var.c);
    }
}
