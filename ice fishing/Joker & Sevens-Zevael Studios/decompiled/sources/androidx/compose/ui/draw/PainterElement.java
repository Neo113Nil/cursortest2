package androidx.compose.ui.draw;

import a4.d;
import e1.e;
import f1.l;
import k1.b;
import pc.j;
import v1.i;
import x1.y0;
import y0.f;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class PainterElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f572a;

    /* renamed from: b, reason: collision with root package name */
    public final f f573b;

    /* renamed from: c, reason: collision with root package name */
    public final i f574c;

    /* renamed from: d, reason: collision with root package name */
    public final float f575d;

    /* renamed from: e, reason: collision with root package name */
    public final l f576e;

    public PainterElement(b bVar, f fVar, i iVar, float f10, l lVar) {
        this.f572a = bVar;
        this.f573b = fVar;
        this.f574c = iVar;
        this.f575d = f10;
        this.f576e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return j.a(this.f572a, painterElement.f572a) && j.a(this.f573b, painterElement.f573b) && j.a(this.f574c, painterElement.f574c) && Float.compare(this.f575d, painterElement.f575d) == 0 && j.a(this.f576e, painterElement.f576e);
    }

    @Override // x1.y0
    public final m f() {
        c1.i iVar = new c1.i();
        iVar.f1211u = this.f572a;
        iVar.f1212v = true;
        iVar.f1213w = this.f573b;
        iVar.f1214x = this.f574c;
        iVar.f1215y = this.f575d;
        iVar.f1216z = this.f576e;
        return iVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        c1.i iVar = (c1.i) mVar;
        boolean z10 = iVar.f1212v;
        b bVar = this.f572a;
        boolean z11 = (z10 && e.a(iVar.f1211u.d(), bVar.d())) ? false : true;
        iVar.f1211u = bVar;
        iVar.f1212v = true;
        iVar.f1213w = this.f573b;
        iVar.f1214x = this.f574c;
        iVar.f1215y = this.f575d;
        iVar.f1216z = this.f576e;
        if (z11) {
            x1.f.n(iVar);
        }
        x1.f.m(iVar);
    }

    public final int hashCode() {
        int b2 = d.b(this.f575d, (this.f574c.hashCode() + ((this.f573b.hashCode() + d.d(this.f572a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        l lVar = this.f576e;
        return b2 + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f572a + ", sizeToIntrinsics=true, alignment=" + this.f573b + ", contentScale=" + this.f574c + ", alpha=" + this.f575d + ", colorFilter=" + this.f576e + ')';
    }
}
