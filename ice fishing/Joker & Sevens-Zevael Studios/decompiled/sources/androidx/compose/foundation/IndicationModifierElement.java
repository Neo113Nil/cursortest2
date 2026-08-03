package androidx.compose.foundation;

import pc.j;
import w.n0;
import w.o0;
import x1.l;
import x1.y0;
import y.i;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class IndicationModifierElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f503a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f504b;

    public IndicationModifierElement(i iVar, o0 o0Var) {
        this.f503a = iVar;
        this.f504b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return j.a(this.f503a, indicationModifierElement.f503a) && j.a(this.f504b, indicationModifierElement.f504b);
    }

    @Override // x1.y0
    public final m f() {
        l a6 = this.f504b.a(this.f503a);
        n0 n0Var = new n0();
        n0Var.f7473w = a6;
        n0Var.r0(a6);
        return n0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        n0 n0Var = (n0) mVar;
        l a6 = this.f504b.a(this.f503a);
        n0Var.s0(n0Var.f7473w);
        n0Var.f7473w = a6;
        n0Var.r0(a6);
    }

    public final int hashCode() {
        return this.f504b.hashCode() + (this.f503a.hashCode() * 31);
    }
}
