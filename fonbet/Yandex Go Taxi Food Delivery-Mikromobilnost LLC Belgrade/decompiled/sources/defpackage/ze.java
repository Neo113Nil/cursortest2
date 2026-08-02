package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.call_order_fallback.domain.e;
import com.yandex.go.taxi.order.details.v2.domain.a;
import com.yandex.messaging.ChatRequest;
import java.util.concurrent.Executor;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class ze implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ ze(bv5 bv5Var, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public static ze a(j8a0 j8a0Var, n3w n3wVar) {
        return new ze(j8a0Var, n3wVar, 23);
    }

    public static ze b(qta0 qta0Var, xvf0 xvf0Var) {
        return new ze(qta0Var, xvf0Var, 3);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a((je) xvf0Var2.get(), xvf0Var);
            case 1:
                return new cs((ipf0) xvf0Var2.get(), (ru.yandex.taxi.communications.data.a) xvf0Var.get());
            case 2:
                return new ru.yandex.taxi.orderbutton.summary.base.interactors.a((wb1) xvf0Var2.get(), (mzb) xvf0Var.get());
            case 3:
                return new x11((r0c0) xvf0Var2.get(), (AddressMapPickerAddressStateRepository) xvf0Var.get());
            case 4:
                return new h0w(6, (lcj0) xvf0Var2.get(), (ro0) xvf0Var.get());
            case 5:
                return new ymu(7, (naz0) xvf0Var2.get(), (k020) xvf0Var.get());
            case 6:
                return new h0w(9, (nz2) xvf0Var2.get(), (cr00) xvf0Var.get());
            case 7:
                return new ymu(10, (oy70) xvf0Var2.get(), (wy20) xvf0Var.get());
            case 8:
                return new rk2((j5z) xvf0Var2.get(), (bf50) xvf0Var.get());
            case 9:
                return new ru.yandex.taxi.delivery.extracted_delivery_form.interactors.a((vsi) xvf0Var2.get(), (b) xvf0Var.get());
            case 10:
                return new en2((ChatRequest) xvf0Var.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get());
            case 11:
                return new cs((ipf0) xvf0Var2.get(), (ru.yandex.taxi.communications.data.a) xvf0Var.get());
            case 12:
                return new com.yandex.messaging.chat.attachments.a(i5m.a(xvf0Var2), (k020) xvf0Var.get());
            case 13:
                return new ig3((Activity) xvf0Var2.get(), (tyc0) xvf0Var.get());
            case 14:
                return new yh3((Activity) xvf0Var2.get(), (ymp) xvf0Var.get());
            case 15:
                kg51 kg51Var = (kg51) xvf0Var2.get();
                fj3 fj3Var = (fj3) kg51Var.c.invoke((tw51) xvf0Var.get());
                q5z.i(fj3Var);
                return fj3Var;
            case 16:
                return new zo3((xf7) xvf0Var2.get(), (evu) xvf0Var.get());
            case 17:
                return new ddf(24, (Executor) xvf0Var.get());
            case 18:
                return new com.yandex.go.places.models.data.mappers.b((pdc) xvf0Var2.get(), (c) xvf0Var.get());
            case 19:
                return new ur4((qcp0) xvf0Var2.get(), (xr4) xvf0Var.get());
            case 20:
                return new wh5((AdditionalSettings) xvf0Var2.get(), (Context) xvf0Var.get());
            case 21:
                return new knz0(new av5(0), (nhj) xvf0Var2.get(), (rwo) xvf0Var.get());
            case 22:
                return new com.yandex.payment.sdk.core.impl.bind.a((pcy) xvf0Var.get(), ((Context) xvf0Var2.get()).getResources());
            case 23:
                return new bi6((h8a0) xvf0Var2.get(), (t3m) xvf0Var.get());
            case 24:
                return new fj6((qbx0) xvf0Var2.get(), (jgv) xvf0Var.get());
            case 25:
                return new zs6((com.yandex.go.navigator.map_interactions.parkings.c) xvf0Var2.get(), (m901) xvf0Var.get());
            case 26:
                return new com.yandex.messaging.internal.view.timeline.suggest.a((ocz0) xvf0Var2.get(), (rbv0) xvf0Var.get());
            case 27:
                return new com.yandex.messaging.internal.team.gaps.a((com.yandex.messaging.internal.team.gaps.c) xvf0Var2.get(), (w3c) xvf0Var.get());
            case 28:
                return new e((hay0) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new gs7((ah00) xvf0Var2.get(), (wb50) xvf0Var.get());
        }
    }

    public /* synthetic */ ze(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
