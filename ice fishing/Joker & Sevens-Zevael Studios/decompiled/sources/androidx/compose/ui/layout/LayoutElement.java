package androidx.compose.ui.layout;

import oc.f;
import v1.r;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class LayoutElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f596a;

    public LayoutElement(f fVar) {
        this.f596a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f596a == ((LayoutElement) obj).f596a;
        }
        return false;
    }

    @Override // x1.y0
    public final m f() {
        r rVar = new r();
        rVar.f7118u = this.f596a;
        return rVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        ((r) mVar).f7118u = this.f596a;
    }

    public final int hashCode() {
        return this.f596a.hashCode();
    }
}
