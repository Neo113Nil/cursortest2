package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.suggest.d;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class z8w implements w4l0 {
    public final b a;
    public final a b;
    public final r0 c;
    public boolean d;

    public z8w(b bVar, a aVar) {
        ugw ugwVar;
        Object obj;
        ugw ugwVar2;
        Object obj2;
        this.a = bVar;
        this.b = aVar;
        d0l0 c = bVar.c();
        ZoneAddress zoneAddress = c.a;
        Address h = c.h();
        boolean z = false;
        zoneAddress = (h != null && (ugwVar = aVar.a().d) != null && (obj = ugwVar.a) != null && (obj instanceof pgw)) ? n(h.B(), (pgw) obj) : false ? zoneAddress : null;
        Address b = c.b();
        Address b2 = c.b();
        if (b2 != null && (ugwVar2 = aVar.a().d) != null && (obj2 = ugwVar2.b) != null && (obj2 instanceof pgw)) {
            z = n(b2.B(), (pgw) obj2);
        }
        this.c = bvf0.c(new d0l0(zoneAddress, scc.h(z ? b : null), 4));
    }

    public static boolean n(zzs zzsVar, pgw pgwVar) {
        return qpa1.d(zzsVar.a - pgwVar.a()) && qpa1.d(zzsVar.b - pgwVar.b());
    }

    @Override // defpackage.w4l0
    public final void a(int i, Address address) {
        r0 r0Var = this.c;
        if (((d0l0) r0Var.getValue()).b.size() >= i) {
            r0Var.m(null, ((d0l0) r0Var.getValue()).i(address));
        } else {
            l(i, address);
        }
    }

    @Override // defpackage.w4l0
    public final void b() {
        this.d = true;
        r0 r0Var = this.c;
        d0l0 k = ((d0l0) r0Var.getValue()).k(EmptyList.a);
        r0Var.getClass();
        r0Var.m(null, k);
    }

    @Override // defpackage.w4l0
    public final void c(List list) {
        r0 r0Var = this.c;
        d0l0 k = ((d0l0) r0Var.getValue()).k(list);
        r0Var.getClass();
        r0Var.m(null, k);
    }

    @Override // defpackage.w4l0
    public final void d(Address address) {
        r0 r0Var = this.c;
        d0l0 k = ((d0l0) r0Var.getValue()).k(Collections.singletonList(address));
        r0Var.getClass();
        r0Var.m(null, k);
    }

    @Override // defpackage.w4l0
    public final List e() {
        return ((d0l0) this.c.getValue()).b;
    }

    @Override // defpackage.w4l0
    public final tpr f() {
        return new d(this.c);
    }

    @Override // defpackage.w4l0
    public final tpr g() {
        return new com.yandex.go.taxi.intercity.dashboard.impl.presentation.suggest.b(this.c);
    }

    @Override // defpackage.w4l0
    public final Address h() {
        return ((d0l0) this.c.getValue()).h();
    }

    @Override // defpackage.w4l0
    public final void i(ZoneAddress zoneAddress) {
        r0 r0Var = this.c;
        d0l0 l = ((d0l0) r0Var.getValue()).l(zoneAddress);
        r0Var.getClass();
        r0Var.m(null, l);
    }

    @Override // defpackage.w4l0
    public final int j(Address address) {
        return ((d0l0) this.c.getValue()).b.indexOf(address);
    }

    @Override // defpackage.w4l0
    public final Address k() {
        return ((d0l0) this.c.getValue()).b();
    }

    @Override // defpackage.w4l0
    public final void l(int i, Address address) {
        r0 r0Var = this.c;
        d0l0 j = ((d0l0) r0Var.getValue()).j(i, address);
        r0Var.getClass();
        r0Var.m(null, j);
    }

    @Override // defpackage.w4l0
    public final void m(int i) {
        r0 r0Var = this.c;
        d0l0 e = ((d0l0) r0Var.getValue()).e(i);
        r0Var.getClass();
        r0Var.m(null, e);
    }

    public final ugw o() {
        tgw tgwVar;
        r0 r0Var = this.c;
        ZoneAddress zoneAddress = ((d0l0) r0Var.getValue()).a;
        ugw ugwVar = this.b.a().d;
        Address b = ((d0l0) r0Var.getValue()).b();
        if (zoneAddress == null && b == null && !this.d) {
            return ugwVar;
        }
        b bVar = this.a;
        tgw tgwVar2 = null;
        if (zoneAddress != null) {
            bVar.r(zoneAddress);
            tgwVar = new sgw(zoneAddress.a);
        } else {
            tgwVar = ugwVar != null ? ugwVar.a : null;
        }
        if (b != null) {
            bVar.o(Collections.singletonList(b));
            tgwVar2 = new sgw(b);
        } else if (!this.d && ugwVar != null) {
            tgwVar2 = ugwVar.b;
        }
        return new ugw(tgwVar, tgwVar2);
    }
}
