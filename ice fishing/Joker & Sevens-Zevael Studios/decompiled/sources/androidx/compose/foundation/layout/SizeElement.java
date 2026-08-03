package androidx.compose.foundation.layout;

import a4.d;
import s2.f;
import x1.y0;
import y0.m;
import z.k0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class SizeElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f533a;

    /* renamed from: b, reason: collision with root package name */
    public final float f534b;

    /* renamed from: c, reason: collision with root package name */
    public final float f535c;

    /* renamed from: d, reason: collision with root package name */
    public final float f536d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f537e;

    public SizeElement(float f10, float f11, float f12, float f13) {
        this.f533a = f10;
        this.f534b = f11;
        this.f535c = f12;
        this.f536d = f13;
        this.f537e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f533a, sizeElement.f533a) && f.a(this.f534b, sizeElement.f534b) && f.a(this.f535c, sizeElement.f535c) && f.a(this.f536d, sizeElement.f536d) && this.f537e == sizeElement.f537e;
    }

    @Override // x1.y0
    public final m f() {
        k0 k0Var = new k0();
        k0Var.f8972u = this.f533a;
        k0Var.f8973v = this.f534b;
        k0Var.f8974w = this.f535c;
        k0Var.f8975x = this.f536d;
        k0Var.f8976y = this.f537e;
        return k0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        k0 k0Var = (k0) mVar;
        k0Var.f8972u = this.f533a;
        k0Var.f8973v = this.f534b;
        k0Var.f8974w = this.f535c;
        k0Var.f8975x = this.f536d;
        k0Var.f8976y = this.f537e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f537e) + d.b(this.f536d, d.b(this.f535c, d.b(this.f534b, Float.hashCode(this.f533a) * 31, 31), 31), 31);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13);
    }
}
