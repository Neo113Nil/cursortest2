package androidx.compose.ui.layout;

import v1.n0;
import v1.o;
import x1.f;
import x1.g0;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class RulerProviderModifierElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f597a;

    public RulerProviderModifierElement(o oVar) {
        this.f597a = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f597a : null) == this.f597a;
    }

    @Override // x1.y0
    public final m f() {
        return new n0(this.f597a);
    }

    @Override // x1.y0
    public final void g(m mVar) {
        n0 n0Var = (n0) mVar;
        o oVar = n0Var.f7107u;
        o oVar2 = this.f597a;
        if (oVar != oVar2) {
            n0Var.f7107u = oVar2;
            g0.T(f.v(n0Var), false, 7);
        }
    }

    public final int hashCode() {
        return this.f597a.hashCode();
    }
}
