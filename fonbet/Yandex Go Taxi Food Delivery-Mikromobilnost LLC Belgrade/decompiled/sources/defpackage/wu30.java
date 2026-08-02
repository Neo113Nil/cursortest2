package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.masstransit.address.interactor.b;
import ru.yandex.taxi.masstransit.address.interactor.d;

/* loaded from: classes9.dex */
public final class wu30 implements w4l0 {
    public final tu30 a;

    public wu30(tu30 tu30Var) {
        this.a = tu30Var;
    }

    @Override // defpackage.w4l0
    public final void a(int i, Address address) {
        tu30 tu30Var = this.a;
        List list = tu30Var.a().b;
        if (i >= list.size()) {
            tu30Var.b(a.o0(list, address));
        } else if (i >= 0) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.set(i, address);
            tu30Var.b(arrayList);
        }
    }

    @Override // defpackage.w4l0
    public final void b() {
        this.a.b(EmptyList.a);
    }

    @Override // defpackage.w4l0
    public final void c(List list) {
        this.a.b(list);
    }

    @Override // defpackage.w4l0
    public final void d(Address address) {
        this.a.b(Collections.singletonList(address));
    }

    @Override // defpackage.w4l0
    public final List e() {
        return this.a.a().b;
    }

    @Override // defpackage.w4l0
    public final tpr f() {
        return e.s(new d(e.d(this.a.b)), new vu30(0));
    }

    @Override // defpackage.w4l0
    public final tpr g() {
        return new b(e.d(this.a.b));
    }

    @Override // defpackage.w4l0
    public final Address h() {
        ZoneAddress zoneAddress = this.a.a().a;
        if (zoneAddress != null) {
            return zoneAddress.a;
        }
        return null;
    }

    @Override // defpackage.w4l0
    public final void i(ZoneAddress zoneAddress) {
        this.a.c(zoneAddress);
    }

    @Override // defpackage.w4l0
    public final int j(Address address) {
        return this.a.a().b.indexOf(address);
    }

    @Override // defpackage.w4l0
    public final Address k() {
        return (Address) a.b0(this.a.a().b);
    }

    @Override // defpackage.w4l0
    public final void l(int i, Address address) {
        tu30 tu30Var = this.a;
        List list = tu30Var.a().b;
        if (i < 0 || i > scc.f(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, address);
        tu30Var.b(arrayList);
    }

    @Override // defpackage.w4l0
    public final void m(int i) {
        tu30 tu30Var = this.a;
        List list = tu30Var.a().b;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            if (i2 != i) {
                arrayList.add(obj);
            }
            i2 = i3;
        }
        tu30Var.b(arrayList);
    }

    public final ZoneAddress n() {
        return this.a.a().a;
    }
}
