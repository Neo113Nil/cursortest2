package defpackage;

import com.yandex.go.multimodal_route.ui.notification.ScooterFinishedPayload;
import java.util.Arrays;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class rpm0 extends qkv {
    public final okv F;
    public final rm5 G;
    public final p1b H;

    public rpm0(okv okvVar, rm5 rm5Var) {
        super(0);
        this.F = okvVar;
        this.G = rm5Var;
        this.H = new p1b(rm5Var, new umm0(6));
    }

    @Override // defpackage.qkv, defpackage.h55
    public final void G(Object obj) {
        ScooterFinishedPayload scooterFinishedPayload = (ScooterFinishedPayload) obj;
        rm5 rm5Var = this.G;
        String format = String.format(((avj0) ((zuj0) rm5Var.d)).h(kyh0.multimodal_route_scooter_finish_notification_title), Arrays.copyOf(new Object[]{scooterFinishedPayload.a}, 1));
        r0 r0Var = (r0) rm5Var.b;
        spm0 spm0Var = new spm0(format);
        r0Var.getClass();
        r0Var.m(null, spm0Var);
        super.G(scooterFinishedPayload);
    }

    @Override // defpackage.qkv
    public final wfd P() {
        return this.H;
    }

    @Override // defpackage.qkv
    public final okv Q() {
        return this.F;
    }

    @Override // defpackage.qkv
    public final pkv R(Object obj) {
        return new pkv("scooter_route_finished_notification", false, 14);
    }
}
