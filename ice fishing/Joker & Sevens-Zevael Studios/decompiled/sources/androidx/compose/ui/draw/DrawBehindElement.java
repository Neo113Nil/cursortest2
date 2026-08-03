package androidx.compose.ui.draw;

import c1.e;
import oc.c;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class DrawBehindElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f571a;

    public DrawBehindElement(c cVar) {
        this.f571a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f571a == ((DrawBehindElement) obj).f571a;
        }
        return false;
    }

    @Override // x1.y0
    public final m f() {
        e eVar = new e();
        eVar.f1205u = this.f571a;
        return eVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        ((e) mVar).f1205u = this.f571a;
    }

    public final int hashCode() {
        return this.f571a.hashCode();
    }
}
