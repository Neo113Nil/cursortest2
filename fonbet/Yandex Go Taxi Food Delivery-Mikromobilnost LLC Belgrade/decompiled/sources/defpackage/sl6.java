package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.geometry.geo.XYPoint;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes5.dex */
public final class sl6 extends v35 {
    public final String h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final int l;
    public final if61 m;
    public final String n;
    public final XYPoint o;
    public final Set p;
    public final vm00 q;
    public final float r;
    public f4c0 s;
    public final BubbleType t;
    public final Bubble$BubbleKind u;

    public sl6(String str, boolean z, int i, boolean z2, int i2, if61 if61Var, String str2, XYPoint xYPoint, Set set, vm00 vm00Var, float f, f4c0 f4c0Var, BubbleType bubbleType, Bubble$BubbleKind bubble$BubbleKind) {
        super(if61Var, str2, xYPoint, set, MapObjectComponentType.BUBBLE, vm00Var, f);
        this.h = str;
        this.i = z;
        this.j = i;
        this.k = z2;
        this.l = i2;
        this.m = if61Var;
        this.n = str2;
        this.o = xYPoint;
        this.p = set;
        this.q = vm00Var;
        this.r = f;
        this.s = f4c0Var;
        this.t = bubbleType;
        this.u = bubble$BubbleKind;
    }

    @Override // defpackage.v35, defpackage.ym00
    public final Set a() {
        return this.p;
    }

    @Override // defpackage.v35, defpackage.ym00
    public final float b() {
        return this.r;
    }

    @Override // defpackage.v35, defpackage.ym00
    public final if61 c() {
        return this.m;
    }

    @Override // defpackage.ym00
    public final void d(f4c0 f4c0Var) {
        this.s = f4c0Var;
    }

    @Override // defpackage.v35, defpackage.ym00
    public final String e() {
        return this.n;
    }

    @Override // defpackage.v35
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl6)) {
            return false;
        }
        sl6 sl6Var = (sl6) obj;
        return jl40.l(this.h, sl6Var.h) && this.i == sl6Var.i && this.j == sl6Var.j && this.k == sl6Var.k && this.l == sl6Var.l && jl40.l(this.m, sl6Var.m) && jl40.l(this.n, sl6Var.n) && jl40.l(this.o, sl6Var.o) && jl40.l(this.p, sl6Var.p) && jl40.l(this.q, sl6Var.q) && Float.compare(this.r, sl6Var.r) == 0 && jl40.l(this.s, sl6Var.s) && this.t == sl6Var.t && this.u == sl6Var.u;
    }

    @Override // defpackage.v35, defpackage.ym00
    public final XYPoint f() {
        return this.o;
    }

    @Override // defpackage.ym00
    public final f4c0 g() {
        return this.s;
    }

    @Override // defpackage.v35, defpackage.ym00
    public final vm00 getAnimation() {
        return this.q;
    }

    @Override // defpackage.v35
    public final int hashCode() {
        int e = g8e.e(this.p, (this.o.hashCode() + unr0.b((this.m.hashCode() + oyr.b(this.l, unr0.e(oyr.b(this.j, unr0.e(this.h.hashCode() * 31, 31, this.i), 31), 31, this.k), 31)) * 31, 31, this.n)) * 31, 31);
        vm00 vm00Var = this.q;
        return this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + g8e.c(this.r, (e + (vm00Var == null ? 0 : vm00Var.hashCode())) * 31, 31)) * 31)) * 31);
    }

    public final Bubble$BubbleKind i() {
        return this.u;
    }

    public final BubbleType j() {
        return this.t;
    }

    public final String k() {
        return this.h;
    }

    public final boolean l() {
        return this.i;
    }

    public final String toString() {
        f4c0 f4c0Var = this.s;
        StringBuilder l = oo31.l("Bubble(id=", this.h, ", overlapBubble=", ", maxPerUser=", this.i);
        tse0.z(l, this.j, ", hideAfterTap=", this.k, ", maxPerSession=");
        l.append(this.l);
        l.append(", zoomRange=");
        l.append(this.m);
        l.append(", hostMapObjectId=");
        l.append(this.n);
        l.append(", flatWorldPosition=");
        l.append(this.o);
        l.append(", appearances=");
        l.append(this.p);
        l.append(", animation=");
        l.append(this.q);
        l.append(", safeZone=");
        l.append(this.r);
        l.append(", mapObjectWrapper=");
        l.append(f4c0Var);
        l.append(", bubbleType=");
        l.append(this.t);
        l.append(", bubbleKind=");
        l.append(this.u);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public /* synthetic */ sl6(String str, int i, boolean z, int i2, if61 if61Var, String str2, XYPoint xYPoint, Set set, vm00 vm00Var, float f, f4c0 f4c0Var, BubbleType bubbleType, Bubble$BubbleKind bubble$BubbleKind) {
        this(str, false, i, z, i2, if61Var, str2, xYPoint, set, vm00Var, f, f4c0Var, bubbleType, bubble$BubbleKind);
    }
}
