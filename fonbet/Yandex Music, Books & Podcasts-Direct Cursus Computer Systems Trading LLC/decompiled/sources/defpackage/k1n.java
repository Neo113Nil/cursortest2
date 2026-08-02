package defpackage;

import com.yandex.pulse.PowerStateChangeDetector;
import com.yandex.pulse.PulseService;

/* loaded from: classes5.dex */
public final /* synthetic */ class k1n implements PowerStateChangeDetector.Observer, zyc {
    public final /* synthetic */ PulseService a;

    public k1n(PulseService pulseService) {
        this.a = pulseService;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PowerStateChangeDetector.Observer) && (obj instanceof zyc)) {
            return getFunctionDelegate().equals(((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, 0, PulseService.class, this.a, "onPowerStateChanged", "onPowerStateChanged(II)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.pulse.PowerStateChangeDetector.Observer
    public final void onPowerStateChanged(int i, int i2) {
        this.a.onPowerStateChanged(i, i2);
    }
}
