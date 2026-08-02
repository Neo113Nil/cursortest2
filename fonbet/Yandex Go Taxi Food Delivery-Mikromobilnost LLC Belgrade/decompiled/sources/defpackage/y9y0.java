package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.route.interactor.e;
import com.yandex.go.route.interactor.g;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import java.util.List;

/* loaded from: classes8.dex */
public final class y9y0 implements w4l0 {
    public final c a;
    public final b b;

    public y9y0(c cVar, b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    @Override // defpackage.w4l0
    public final void a(int i, Address address) {
        this.b.b(i, address);
    }

    @Override // defpackage.w4l0
    public final void b() {
        this.b.j();
    }

    @Override // defpackage.w4l0
    public final void c(List list) {
        this.b.o(list);
    }

    @Override // defpackage.w4l0
    public final void d(Address address) {
        this.b.l(address);
    }

    @Override // defpackage.w4l0
    public final List e() {
        return this.a.c().b;
    }

    @Override // defpackage.w4l0
    public final tpr f() {
        return new g(this.a.f());
    }

    @Override // defpackage.w4l0
    public final tpr g() {
        return new e(this.a.f());
    }

    @Override // defpackage.w4l0
    public final Address h() {
        return this.a.g();
    }

    @Override // defpackage.w4l0
    public final void i(ZoneAddress zoneAddress) {
        this.b.m(zoneAddress, null);
    }

    @Override // defpackage.w4l0
    public final int j(Address address) {
        return this.a.c().b.indexOf(address);
    }

    @Override // defpackage.w4l0
    public final Address k() {
        return this.a.d();
    }

    @Override // defpackage.w4l0
    public final void l(int i, Address address) {
        b bVar = this.b;
        Preorder preorder = bVar.a.a;
        if (preorder.a(preorder.G.j(i, address)) || bVar.h) {
            bVar.e();
        }
        bVar.f();
    }

    @Override // defpackage.w4l0
    public final void m(int i) {
        this.b.i(i);
    }
}
