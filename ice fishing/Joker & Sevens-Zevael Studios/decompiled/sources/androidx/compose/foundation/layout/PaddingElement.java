package androidx.compose.foundation.layout;

import a4.d;
import s2.f;
import x1.y0;
import y0.m;
import z.b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class PaddingElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f528a;

    /* renamed from: b, reason: collision with root package name */
    public final float f529b;

    /* renamed from: c, reason: collision with root package name */
    public final float f530c;

    /* renamed from: d, reason: collision with root package name */
    public final float f531d;

    public PaddingElement(float f10, float f11, float f12, float f13) {
        this.f528a = f10;
        this.f529b = f11;
        this.f530c = f12;
        this.f531d = f13;
        if ((f10 < 0.0f && !f.a(f10, Float.NaN)) || ((f11 < 0.0f && !f.a(f11, Float.NaN)) || ((f12 < 0.0f && !f.a(f12, Float.NaN)) || (f13 < 0.0f && !f.a(f13, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f528a, paddingElement.f528a) && f.a(this.f529b, paddingElement.f529b) && f.a(this.f530c, paddingElement.f530c) && f.a(this.f531d, paddingElement.f531d);
    }

    @Override // x1.y0
    public final m f() {
        b0 b0Var = new b0();
        b0Var.f8937u = this.f528a;
        b0Var.f8938v = this.f529b;
        b0Var.f8939w = this.f530c;
        b0Var.f8940x = this.f531d;
        b0Var.f8941y = true;
        return b0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        b0 b0Var = (b0) mVar;
        b0Var.f8937u = this.f528a;
        b0Var.f8938v = this.f529b;
        b0Var.f8939w = this.f530c;
        b0Var.f8940x = this.f531d;
        b0Var.f8941y = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + d.b(this.f531d, d.b(this.f530c, d.b(this.f529b, Float.hashCode(this.f528a) * 31, 31), 31), 31);
    }
}
