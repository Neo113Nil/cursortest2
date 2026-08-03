package androidx.compose.ui.input.key;

import p1.d;
import x1.y0;
import y0.m;
import y1.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class KeyInputElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f592a;

    public KeyInputElement(p pVar) {
        this.f592a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f592a == ((KeyInputElement) obj).f592a;
        }
        return false;
    }

    @Override // x1.y0
    public final m f() {
        d dVar = new d();
        dVar.f5425u = this.f592a;
        return dVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        ((d) mVar).f5425u = this.f592a;
    }

    public final int hashCode() {
        return this.f592a.hashCode() * 31;
    }
}
