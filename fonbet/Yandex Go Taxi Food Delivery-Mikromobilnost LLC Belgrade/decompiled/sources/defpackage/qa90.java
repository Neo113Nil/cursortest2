package defpackage;

import androidx.compose.ui.draw.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqa90;", "Lj530;", "Landroidx/compose/ui/draw/c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class qa90 extends j530 {
    public final pa90 a;
    public final boolean b = true;
    public final jt1 c;
    public final nhe w;
    public final float x;
    public final wec y;

    public qa90(pa90 pa90Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar) {
        this.a = pa90Var;
        this.c = jt1Var;
        this.w = nheVar;
        this.x = f;
        this.y = wecVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        c cVar = new c();
        cVar.a = this.a;
        cVar.b = this.b;
        cVar.c = this.c;
        cVar.w = this.w;
        cVar.x = this.x;
        cVar.y = this.y;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa90)) {
            return false;
        }
        qa90 qa90Var = (qa90) obj;
        return jl40.l(this.a, qa90Var.a) && this.b == qa90Var.b && jl40.l(this.c, qa90Var.c) && jl40.l(this.w, qa90Var.w) && Float.compare(this.x, qa90Var.x) == 0 && jl40.l(this.y, qa90Var.y);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        c cVar = (c) e530Var;
        boolean z = cVar.b;
        pa90 pa90Var = this.a;
        boolean z2 = this.b;
        boolean z3 = z != z2 || (z2 && !cjs0.a(cVar.a.i(), pa90Var.i()));
        cVar.a = pa90Var;
        cVar.b = z2;
        cVar.c = this.c;
        cVar.w = this.w;
        cVar.x = this.x;
        cVar.y = this.y;
        if (z3) {
            qje.P(cVar).C();
        }
        rzo.D(cVar);
    }

    public final int hashCode() {
        int c = g8e.c(this.x, (this.w.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31);
        wec wecVar = this.y;
        return c + (wecVar == null ? 0 : wecVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.w + ", alpha=" + this.x + ", colorFilter=" + this.y + ')';
    }
}
