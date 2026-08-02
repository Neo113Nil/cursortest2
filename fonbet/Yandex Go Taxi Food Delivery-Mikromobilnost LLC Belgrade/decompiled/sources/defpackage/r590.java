package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr590;", "Lj530;", "Lz590;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class r590 extends j530 {
    public final float a;
    public final float b;
    public final float c;
    public final float w;
    public final boolean x = true;
    public final tls y;

    public r590(float f, float f2, float f3, float f4, tls tlsVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.w = f4;
        boolean z = true;
        this.y = tlsVar;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            gxv.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.j530
    public final e530 a() {
        z590 z590Var = new z590();
        z590Var.a = this.a;
        z590Var.b = this.b;
        z590Var.c = this.c;
        z590Var.w = this.w;
        z590Var.x = this.x;
        return z590Var;
    }

    public final boolean equals(Object obj) {
        r590 r590Var = obj instanceof r590 ? (r590) obj : null;
        return r590Var != null && y7m.b(this.a, r590Var.a) && y7m.b(this.b, r590Var.b) && y7m.b(this.c, r590Var.c) && y7m.b(this.w, r590Var.w) && this.x == r590Var.x;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        z590 z590Var = (z590) e530Var;
        z590Var.a = this.a;
        z590Var.b = this.b;
        z590Var.c = this.c;
        z590Var.w = this.w;
        z590Var.x = this.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + g8e.c(this.w, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
