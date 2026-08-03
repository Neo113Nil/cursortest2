package androidx.compose.ui.semantics;

import oc.c;
import x1.y0;
import y0.l;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends y0 implements l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f608a;

    /* renamed from: b, reason: collision with root package name */
    public final c f609b;

    public AppendedSemanticsElement(c cVar, boolean z10) {
        this.f608a = z10;
        this.f609b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f608a == appendedSemanticsElement.f608a && this.f609b == appendedSemanticsElement.f609b;
    }

    @Override // x1.y0
    public final m f() {
        e2.c cVar = new e2.c();
        cVar.f1948u = this.f608a;
        cVar.f1949v = this.f609b;
        return cVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        e2.c cVar = (e2.c) mVar;
        cVar.f1948u = this.f608a;
        cVar.f1949v = this.f609b;
    }

    public final int hashCode() {
        return this.f609b.hashCode() + (Boolean.hashCode(this.f608a) * 31);
    }
}
