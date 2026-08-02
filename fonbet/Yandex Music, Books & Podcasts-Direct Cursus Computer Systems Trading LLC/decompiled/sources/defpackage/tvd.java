package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class tvd {
    public final fvf a;
    public final jx7 b;
    public final o0k c;
    public final float d;

    public tvd(fvf fvfVar, jx7 jx7Var, o0k o0kVar, float f) {
        fvfVar.getClass();
        jx7Var.getClass();
        o0kVar.getClass();
        this.a = fvfVar;
        this.b = jx7Var;
        this.c = o0kVar;
        this.d = f;
    }

    public final float a() {
        return yhn.c(fxf.J(b(), 0.5f, 0.7f, 0.0f, 1.0f), 0.0f, 1.0f);
    }

    public final float b() {
        int L = this.b.L(this.c.d() + this.d);
        fvf fvfVar = this.a;
        if (ivf.A(fvfVar) <= L) {
            return 1.0f;
        }
        cvf cvfVar = (cvf) CollectionsKt.firstOrNull(fvfVar.j().k);
        if (cvfVar == null) {
            return 0.0f;
        }
        if (cvfVar.a != 0) {
            return 1.0f;
        }
        return (-cvfVar.p) / cvfVar.q;
    }

    public final float c() {
        return yhn.c(fxf.J(b(), 0.0f, 0.5f, 1.0f, 0.0f), 0.0f, 1.0f);
    }

    public final float d() {
        float b = b();
        Float valueOf = Float.valueOf(0.0f);
        return yhn.c(fxf.J(b, valueOf.floatValue(), Float.valueOf(0.5f).floatValue(), Float.valueOf(1.0f).floatValue(), valueOf.floatValue()), 0.0f, 1.0f);
    }
}
