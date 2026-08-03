package androidx.compose.foundation;

import pc.j;
import w.b1;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f505a;

    public ScrollSemanticsElement(b1 b1Var) {
        this.f505a = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrollSemanticsElement) && j.a(this.f505a, ((ScrollSemanticsElement) obj).f505a);
    }

    @Override // x1.y0
    public final m f() {
        w.y0 y0Var = new w.y0();
        y0Var.f7534u = this.f505a;
        y0Var.f7535v = true;
        return y0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        w.y0 y0Var = (w.y0) mVar;
        y0Var.f7534u = this.f505a;
        y0Var.f7535v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a4.d.d(a4.d.d(this.f505a.hashCode() * 31, 961, false), 31, true);
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f505a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
