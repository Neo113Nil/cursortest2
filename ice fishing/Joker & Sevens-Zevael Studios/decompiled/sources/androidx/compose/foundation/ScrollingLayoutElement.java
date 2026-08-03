package androidx.compose.foundation;

import pc.j;
import w.b1;
import w.d1;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f506a;

    public ScrollingLayoutElement(b1 b1Var) {
        this.f506a = b1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return j.a(this.f506a, ((ScrollingLayoutElement) obj).f506a);
        }
        return false;
    }

    @Override // x1.y0
    public final m f() {
        d1 d1Var = new d1();
        d1Var.f7404u = this.f506a;
        d1Var.f7405v = true;
        return d1Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        d1 d1Var = (d1) mVar;
        d1Var.f7404u = this.f506a;
        d1Var.f7405v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a4.d.d(this.f506a.hashCode() * 31, 31, false);
    }
}
