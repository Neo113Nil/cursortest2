package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx2y;", "Lj530;", "Ly2y;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x2y extends j530 {
    public final float a;
    public final boolean b;

    public x2y(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.j530
    public final e530 a() {
        y2y y2yVar = new y2y();
        y2yVar.a = this.a;
        y2yVar.b = this.b;
        return y2yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        x2y x2yVar = obj instanceof x2y ? (x2y) obj : null;
        return x2yVar != null && this.a == x2yVar.a && this.b == x2yVar.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        y2y y2yVar = (y2y) e530Var;
        y2yVar.a = this.a;
        y2yVar.b = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
