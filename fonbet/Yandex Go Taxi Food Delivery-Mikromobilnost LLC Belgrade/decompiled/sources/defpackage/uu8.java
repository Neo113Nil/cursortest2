package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.logistics.cargo_flow.form.address.c;
import com.yandex.go.logistics.cargo_flow.route_selector.a;
import com.yandex.go.route.interactor.b;

/* loaded from: classes12.dex */
public final class uu8 implements cai {
    public final /* synthetic */ vu8 a;
    public final /* synthetic */ int b;

    public uu8(vu8 vu8Var, int i) {
        this.a = vu8Var;
        this.b = i;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.cai
    public final void d(Address address) {
        vu8 vu8Var = this.a;
        a aVar = (a) vu8Var.E;
        b bVar = ((c) vu8Var.I).b;
        int i = this.b;
        boolean z = i == 0;
        int i2 = i - 1;
        int i3 = i2 >= 0 ? i2 : 0;
        if (z) {
            bVar.m(new ZoneAddress(address, 2), null);
        } else {
            bVar.b(i3, address);
        }
        aVar.b(qoi0.a(uu8.class));
        aVar.a(qoi0.a(uu8.class), null, true);
    }
}
