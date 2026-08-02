package defpackage;

import android.content.Context;
import com.yandex.go.masstransit.sdk.order.impl.orders.k;
import com.yandex.go.morphlex.network.MorphlexApi;
import com.yandex.go.multimodal_route.interactors.a;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.taxi.tariffs.repository.g;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.b;
import ru.yandex.taxi.masstransit.mapper.f;
import ru.yandex.taxi.widget.c;

/* loaded from: classes8.dex */
public final class s730 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ s730(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                MorphlexApi c = dob1.c((on2) xvf0Var.get());
                q5z.i(c);
                return c;
            case 1:
                return new q830((Context) xvf0Var.get());
            case 2:
                return new yvi0((a400) xvf0Var.get());
            case 3:
                return new b((on2) xvf0Var.get());
            case 4:
                return new hi30((rqo) xvf0Var.get());
            case 5:
                k kVar = (k) ((to70) ((h410) xvf0Var.get()).f.getValue()).e.getValue();
                q5z.i(kVar);
                return kVar;
            case 6:
                return new qr30((com.yandex.go.payments.superapp.payment.b) xvf0Var.get());
            case 7:
                return new wu30((tu30) xvf0Var.get());
            case 8:
                return new yy30((ole0) xvf0Var.get());
            case 9:
                return new dz30(i5m.a(xvf0Var), 0);
            case 10:
                return new x740((i6r) xvf0Var.get());
            case 11:
                return new ae40((i6r) xvf0Var.get());
            case 12:
                return new f((c) xvf0Var.get());
            case 13:
                return new hio((zuj0) xvf0Var.get());
            case 14:
                return new zn40((pho) xvf0Var.get());
            case 15:
                return new bo40((pho) xvf0Var.get());
            case 16:
                return new mo40((yyq0) xvf0Var.get());
            case 17:
                return new yo40((g) xvf0Var.get());
            case 18:
                return new pp40((rqo) xvf0Var.get());
            case 19:
                return new dy6((rqo) xvf0Var.get(), 3);
            case 20:
                return new vr40((yu40) xvf0Var.get());
            case 21:
                return new es40((pho) xvf0Var.get());
            case 22:
                return new a((h) xvf0Var.get());
            case 23:
                return new com.yandex.go.multimodal_route.repositories.a((on2) xvf0Var.get());
            case 24:
                return new com.yandex.go.multimodal_route.repositories.b((on2) xvf0Var.get());
            case 25:
                return new com.yandex.go.multimodal_route.experiement.c((rqo) xvf0Var.get());
            case 26:
                return new hw40((i6r) xvf0Var.get());
            case 27:
                return new uk10((rqo) xvf0Var.get());
            case 28:
                return new u8w((pho) xvf0Var.get());
            default:
                return new r100((b00) xvf0Var.get());
        }
    }
}
