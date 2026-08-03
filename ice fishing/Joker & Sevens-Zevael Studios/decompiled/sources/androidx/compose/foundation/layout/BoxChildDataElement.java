package androidx.compose.foundation.layout;

import a4.d;
import x1.y0;
import y0.c;
import y0.f;
import y0.m;
import z.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class BoxChildDataElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f523a;

    public BoxChildDataElement(boolean z10) {
        this.f523a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        f fVar = c.f8423k;
        return fVar.equals(fVar) && this.f523a == boxChildDataElement.f523a;
    }

    @Override // x1.y0
    public final m f() {
        f fVar = c.f8423k;
        j jVar = new j();
        jVar.f8965u = fVar;
        jVar.f8966v = this.f523a;
        return jVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        j jVar = (j) mVar;
        jVar.f8965u = c.f8423k;
        jVar.f8966v = this.f523a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f523a) + d.b(0.0f, Float.hashCode(0.0f) * 31, 31);
    }
}
