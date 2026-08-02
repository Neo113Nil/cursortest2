package defpackage;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import com.yandex.go.superapp.discovery.map.impl.data.repositories.common.d;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.SuperAppDiscoveryMapOverlayUiState;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public abstract class yz4 {
    public final r0 a = bvf0.c(new c0d(b(), zz4.a, zz4.b));

    public final SuperAppDiscoveryMapOverlayState a() {
        return ((c0d) this.a.getValue()).b;
    }

    public abstract Object b();

    public void c() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, c0d.a((c0d) value, null, null, SuperAppDiscoveryMapOverlayUiState.HIDDEN, 3)));
    }

    public final void d() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, c0d.a((c0d) value, null, null, SuperAppDiscoveryMapOverlayUiState.SHOWED, 3)));
    }

    public final d e() {
        return new d(this.a);
    }

    public final void f() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new c0d(b(), zz4.a, zz4.b)));
    }

    public final void g(SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, c0d.a((c0d) value, null, superAppDiscoveryMapOverlayState, null, 5)));
    }
}
