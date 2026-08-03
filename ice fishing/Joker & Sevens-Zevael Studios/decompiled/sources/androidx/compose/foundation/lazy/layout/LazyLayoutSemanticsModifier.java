package androidx.compose.foundation.lazy.layout;

import a0.d;
import b0.i0;
import pc.j;
import x.e0;
import x1.f;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final oc.a f544a;

    /* renamed from: b, reason: collision with root package name */
    public final d f545b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f546c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f547d;

    public LazyLayoutSemanticsModifier(oc.a aVar, d dVar, e0 e0Var, boolean z10) {
        this.f544a = aVar;
        this.f545b = dVar;
        this.f546c = e0Var;
        this.f547d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f544a == lazyLayoutSemanticsModifier.f544a && j.a(this.f545b, lazyLayoutSemanticsModifier.f545b) && this.f546c == lazyLayoutSemanticsModifier.f546c && this.f547d == lazyLayoutSemanticsModifier.f547d;
    }

    @Override // x1.y0
    public final m f() {
        return new i0(this.f544a, this.f545b, this.f546c, this.f547d);
    }

    @Override // x1.y0
    public final void g(m mVar) {
        i0 i0Var = (i0) mVar;
        i0Var.f833u = this.f544a;
        i0Var.f834v = this.f545b;
        e0 e0Var = i0Var.f835w;
        e0 e0Var2 = this.f546c;
        if (e0Var != e0Var2) {
            i0Var.f835w = e0Var2;
            f.o(i0Var);
        }
        boolean z10 = i0Var.f836x;
        boolean z11 = this.f547d;
        if (z10 == z11) {
            return;
        }
        i0Var.f836x = z11;
        i0Var.r0();
        f.o(i0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + a4.d.d((this.f546c.hashCode() + ((this.f545b.hashCode() + (this.f544a.hashCode() * 31)) * 31)) * 31, 31, this.f547d);
    }
}
