package androidx.compose.foundation;

import f1.i0;
import pc.j;
import s2.f;
import w.n;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f495a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f496b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d f497c;

    public BorderModifierNodeElement(float f10, i0 i0Var, d0.d dVar) {
        this.f495a = f10;
        this.f496b = i0Var;
        this.f497c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return f.a(this.f495a, borderModifierNodeElement.f495a) && this.f496b.equals(borderModifierNodeElement.f496b) && this.f497c.equals(borderModifierNodeElement.f497c);
    }

    @Override // x1.y0
    public final m f() {
        return new n(this.f495a, this.f496b, this.f497c);
    }

    @Override // x1.y0
    public final void g(m mVar) {
        n nVar = (n) mVar;
        float f10 = nVar.f7470x;
        c1.c cVar = nVar.A;
        float f11 = this.f495a;
        if (!f.a(f10, f11)) {
            nVar.f7470x = f11;
            cVar.r0();
        }
        i0 i0Var = nVar.f7471y;
        i0 i0Var2 = this.f496b;
        if (!j.a(i0Var, i0Var2)) {
            nVar.f7471y = i0Var2;
            cVar.r0();
        }
        d0.d dVar = nVar.f7472z;
        d0.d dVar2 = this.f497c;
        if (j.a(dVar, dVar2)) {
            return;
        }
        nVar.f7472z = dVar2;
        cVar.r0();
    }

    public final int hashCode() {
        return this.f497c.hashCode() + ((this.f496b.hashCode() + (Float.hashCode(this.f495a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) f.b(this.f495a)) + ", brush=" + this.f496b + ", shape=" + this.f497c + ')';
    }
}
