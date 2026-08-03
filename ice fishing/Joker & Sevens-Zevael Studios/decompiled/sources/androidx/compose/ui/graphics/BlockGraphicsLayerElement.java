package androidx.compose.ui.graphics;

import oc.c;
import x1.f;
import x1.f1;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f583a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f583a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.f583a == ((BlockGraphicsLayerElement) obj).f583a;
        }
        return false;
    }

    @Override // x1.y0
    public final m f() {
        return new f1.m(this.f583a);
    }

    @Override // x1.y0
    public final void g(m mVar) {
        f1.m mVar2 = (f1.m) mVar;
        mVar2.f2272u = this.f583a;
        f1 f1Var = f.t(mVar2, 2).f8034v;
        if (f1Var != null) {
            f1Var.W0(mVar2.f2272u, true);
        }
    }

    public final int hashCode() {
        return this.f583a.hashCode();
    }
}
