package androidx.compose.foundation.layout;

import s2.f;
import x1.y0;
import y0.m;
import z.m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f538a;

    /* renamed from: b, reason: collision with root package name */
    public final float f539b;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f538a = f10;
        this.f539b = f11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return f.a(this.f538a, unspecifiedConstraintsElement.f538a) && f.a(this.f539b, unspecifiedConstraintsElement.f539b);
    }

    @Override // x1.y0
    public final m f() {
        m0 m0Var = new m0();
        m0Var.f8985u = this.f538a;
        m0Var.f8986v = this.f539b;
        return m0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        m0 m0Var = (m0) mVar;
        m0Var.f8985u = this.f538a;
        m0Var.f8986v = this.f539b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f539b) + (Float.hashCode(this.f538a) * 31);
    }
}
