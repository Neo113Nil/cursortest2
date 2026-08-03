package androidx.compose.foundation.lazy.layout;

import b0.d0;
import b0.w0;
import pc.j;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f548a;

    public TraversablePrefetchStateModifierElement(d0 d0Var) {
        this.f548a = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && j.a(this.f548a, ((TraversablePrefetchStateModifierElement) obj).f548a);
    }

    @Override // x1.y0
    public final m f() {
        w0 w0Var = new w0();
        w0Var.f925u = this.f548a;
        return w0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        ((w0) mVar).f925u = this.f548a;
    }

    public final int hashCode() {
        return this.f548a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f548a + ')';
    }
}
