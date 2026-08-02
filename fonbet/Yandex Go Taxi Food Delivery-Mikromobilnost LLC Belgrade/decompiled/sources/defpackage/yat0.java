package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address_confirmation.analytics.AddressConfirmationAnalytics$DismissType;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class yat0 implements r71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zat0 b;

    public yat0(boolean z, zat0 zat0Var) {
        this.a = z;
        this.b = zat0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.l51
    public final void a1(pv0 pv0Var) {
        boolean z = this.a;
        zat0 zat0Var = this.b;
        if (!z) {
            zat0Var.M.a(AddressConfirmationAnalytics$DismissType.CloseAfterButtonTap);
        }
        zat0Var.r(new t71(pv0Var, 19));
    }

    @Override // defpackage.r71
    public final void g() {
        this.b.r(new x8t0(2));
    }

    @Override // defpackage.l51
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
    }

    @Override // defpackage.r71
    public final void o(String str) {
    }

    @Override // defpackage.r71
    public final void q() {
    }
}
