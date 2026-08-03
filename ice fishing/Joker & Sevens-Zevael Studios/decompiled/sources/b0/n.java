package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends y0.m implements x1.n {

    /* renamed from: u, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f859u;

    @Override // x1.n
    public final void b(x1.i0 i0Var) {
        ArrayList arrayList = this.f859u.f556h;
        if (arrayList.size() <= 0) {
            i0Var.a();
        } else {
            a4.d.s(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && pc.j.a(this.f859u, ((n) obj).f859u);
    }

    public final int hashCode() {
        return this.f859u.hashCode();
    }

    @Override // y0.m
    public final void j0() {
        this.f859u.getClass();
    }

    @Override // y0.m
    public final void k0() {
        this.f859u.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f859u + ')';
    }
}
