package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Source;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class rhc0 implements xhc0 {
    public static final rhc0 g = new rhc0(new roc0("FALLBACK", new vf20("FALLBACK", null, pfe.d, new p151(h0k.c, j151.a, 0)), null, PlaqueModel$Type.FALLBACK, PlaqueModel$Source.NONE, false), "FALLBACK", b.f(), b.f(), 0, new she0(true));
    public final roc0 a;
    public final String b;
    public final Map c;
    public final Map d;
    public final int e;
    public final eie0 f;

    public rhc0(roc0 roc0Var, String str, Map map, Map map2, int i, eie0 eie0Var) {
        this.a = roc0Var;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.e = i;
        this.f = eie0Var;
    }

    @Override // defpackage.xhc0
    public final int a() {
        return this.e;
    }

    @Override // defpackage.xhc0
    public final roc0 b() {
        return this.a;
    }

    @Override // defpackage.xhc0
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.xhc0
    public final eie0 d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhc0)) {
            return false;
        }
        rhc0 rhc0Var = (rhc0) obj;
        return this.a.equals(rhc0Var.a) && jl40.l(this.b, rhc0Var.b) && jl40.l(this.c, rhc0Var.c) && jl40.l(this.d, rhc0Var.d) && this.e == rhc0Var.e && this.f.equals(rhc0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + oyr.b(this.e, unr0.d(unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        return "Default(plaqueModel=" + this.a + ", feedbackToken=" + this.b + ", metricContext=" + this.c + ", serviceMeta=" + this.d + ", priority=" + this.e + ", rootPredicate=" + this.f + ')';
    }
}
