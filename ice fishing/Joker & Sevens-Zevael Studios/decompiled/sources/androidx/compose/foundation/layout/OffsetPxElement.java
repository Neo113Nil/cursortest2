package androidx.compose.foundation.layout;

import oc.c;
import x1.y0;
import y0.m;
import z.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class OffsetPxElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f527a;

    public OffsetPxElement(c cVar) {
        this.f527a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f527a == offsetPxElement.f527a;
    }

    @Override // x1.y0
    public final m f() {
        a0 a0Var = new a0();
        a0Var.f8934u = this.f527a;
        a0Var.f8935v = true;
        return a0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        a0 a0Var = (a0) mVar;
        a0Var.f8934u = this.f527a;
        a0Var.f8935v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f527a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f527a + ", rtlAware=true)";
    }
}
