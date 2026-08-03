package androidx.compose.foundation.layout;

import pc.j;
import x1.y0;
import y0.m;
import z.c0;
import z.d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class PaddingValuesElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f532a;

    public PaddingValuesElement(c0 c0Var) {
        this.f532a = c0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return j.a(this.f532a, paddingValuesElement.f532a);
    }

    @Override // x1.y0
    public final m f() {
        d0 d0Var = new d0();
        d0Var.f8948u = this.f532a;
        return d0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        ((d0) mVar).f8948u = this.f532a;
    }

    public final int hashCode() {
        return this.f532a.hashCode();
    }
}
