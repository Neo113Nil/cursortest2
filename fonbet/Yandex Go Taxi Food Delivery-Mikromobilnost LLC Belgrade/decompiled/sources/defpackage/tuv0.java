package defpackage;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.a;

/* loaded from: classes14.dex */
public final class tuv0 {
    public final e7c0 a;
    public final z111 b;
    public final vw9 c;
    public final ein0 d;
    public final sux0 e;
    public final a f;
    public final ktv0 g;

    public tuv0(e7c0 e7c0Var, z111 z111Var, vw9 vw9Var, ein0 ein0Var, sux0 sux0Var, a aVar, ktv0 ktv0Var) {
        this.a = e7c0Var;
        this.b = z111Var;
        this.c = vw9Var;
        this.d = ein0Var;
        this.e = sux0Var;
        this.f = aVar;
        this.g = ktv0Var;
    }

    public final void a() {
        wo9 wo9Var = wo9.a;
        vw9 vw9Var = this.c;
        vw9Var.b(wo9Var);
        vw9Var.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
    }

    public final void b() {
        din0 din0Var = din0.a;
        ein0 ein0Var = this.d;
        ein0Var.b(din0Var);
        ein0Var.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
    }

    public final void c() {
        rux0 rux0Var = rux0.a;
        sux0 sux0Var = this.e;
        sux0Var.b(rux0Var);
        sux0Var.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
    }

    public final void d() {
        n010 n010Var = n010.a;
        z111 z111Var = this.b;
        z111Var.b(n010Var);
        z111Var.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
    }

    public final void e(String str, String str2, String str3) {
        d();
        a();
        b();
        c();
        w6c0 w6c0Var = new w6c0(new hn80(str), str3, str2);
        e7c0 e7c0Var = this.a;
        e7c0Var.b(w6c0Var);
        e7c0Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        this.f.a(SuperAppOpenServiceActionType.PLACES);
    }

    public final void f() {
        this.a.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
        d();
        b();
        c();
        wo9 wo9Var = wo9.a;
        vw9 vw9Var = this.c;
        vw9Var.b(wo9Var);
        vw9Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        this.f.a(SuperAppOpenServiceActionType.CHARGERS);
    }

    public final void g() {
        d();
        a();
        b();
        c();
        u6c0 u6c0Var = u6c0.a;
        e7c0 e7c0Var = this.a;
        e7c0Var.b(u6c0Var);
        e7c0Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        this.f.a(SuperAppOpenServiceActionType.FAVORITES);
    }

    public final void h() {
        this.a.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
        d();
        a();
        c();
        din0 din0Var = din0.a;
        ein0 ein0Var = this.d;
        ein0Var.b(din0Var);
        ein0Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        this.f.a(SuperAppOpenServiceActionType.SCOOTERS);
    }

    public final void i() {
        this.a.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
        d();
        a();
        b();
        rux0 rux0Var = rux0.a;
        sux0 sux0Var = this.e;
        sux0Var.b(rux0Var);
        sux0Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        this.f.a(SuperAppOpenServiceActionType.TAXI);
    }

    public final void j() {
        this.a.a(SuperAppDiscoveryMapOverlayState.HIDDEN);
        a();
        b();
        c();
        n010 n010Var = n010.a;
        z111 z111Var = this.b;
        z111Var.b(n010Var);
        z111Var.a(SuperAppDiscoveryMapOverlayState.SELECTED);
        this.f.a(SuperAppOpenServiceActionType.TRANSPORT);
    }

    public final void k() {
        int i = suv0.a[this.g.f().ordinal()];
        if (i == 1) {
            l(t6c0.a);
            return;
        }
        if (i == 2) {
            j();
            return;
        }
        if (i == 3) {
            h();
            return;
        }
        if (i == 4) {
            i();
        } else if (i == 5) {
            f();
        } else {
            w511.b();
        }
    }

    public final void l(x6c0 x6c0Var) {
        e7c0 e7c0Var = this.a;
        e7c0Var.b(x6c0Var);
        e7c0Var.a(SuperAppDiscoveryMapOverlayState.DEFAULT);
        this.f.a(SuperAppOpenServiceActionType.PLACES);
        d();
        a();
        b();
        c();
    }
}
