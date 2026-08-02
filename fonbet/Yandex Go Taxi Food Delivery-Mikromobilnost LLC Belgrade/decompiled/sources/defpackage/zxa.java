package defpackage;

import android.content.Context;
import com.yandex.go.chargers.station.presentation.tariff.ChargersTariffModalView;
import com.yandex.go.universal_qr_scanner.domain.camera.a;
import com.yandex.go.universal_qr_scanner.domain.torch.b;
import com.yandex.go.universal_qr_scanner.presentation.UniversalQrScannerModalView;
import com.yandex.go.universal_qr_scanner.presentation.d;
import java.util.function.Supplier;
import ru.yandex.taxi.plus.sdk.payments.PaymentsWidgetModalView;

/* loaded from: classes12.dex */
public final class zxa extends m230 {
    public final /* synthetic */ int E;
    public final w030 F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxa(w030 w030Var, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.E = i;
        this.F = w030Var;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.E) {
            case 2:
                ((oqd0) this.J).a();
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                rxa rxaVar = ((yxa) obj).a;
                io9 io9Var = new io9(this);
                zz7 zz7Var = ((uxa) obj4).a;
                return new ChargersTariffModalView((Context) ((xxa) obj3).a.a.get(), new txa((em9) zz7Var.a.get(), (gxa) zz7Var.b.get(), rxaVar, io9Var));
            case 1:
                wpy0 wpy0Var = new wpy0(19, this);
                o021 o021Var = ((n021) obj2).a;
                d dVar = new d(wpy0Var, (a) ((xvf0) o021Var.a).get(), (b) ((z6x0) o021Var.f).get(), (com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d) ((xvf0) o021Var.b).get(), (a201) ((mg11) o021Var.g).get(), (com.yandex.go.universal_qr_scanner.domain.b) ((rct0) o021Var.h).get(), i5m.a((on11) o021Var.i), (lz11) ((xvf0) o021Var.c).get(), (wz11) ((xvf0) o021Var.d).get(), (com.yandex.go.universal_qr_scanner.domain.camera.permission.a) ((mg11) o021Var.j).get(), (yz11) ((xvf0) o021Var.e).get());
                cjw0 cjw0Var = ((j021) obj4).a;
                return new UniversalQrScannerModalView((Context) ((sag) cjw0Var.a).get(), dVar, (ney) ((sag) cjw0Var.b).get(), (er7) ((xvf0) cjw0Var.c).get());
            default:
                bj41 bj41Var = (bj41) obj;
                Context context = (Context) obj3;
                return new PaymentsWidgetModalView(context, new ooa0(bj41Var.a, new aj31(8, this), new abe(context, false, false), bj41Var.b), new zka0((Supplier) obj4, (wnt) obj2));
        }
    }
}
