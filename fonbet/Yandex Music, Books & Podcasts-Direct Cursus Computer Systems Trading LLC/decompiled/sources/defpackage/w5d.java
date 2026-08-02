package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class w5d implements dup {
    public final vru a;

    public w5d(vru vruVar) {
        this.a = vruVar;
    }

    @Override // defpackage.dup
    public final ocg I(long j, xof xofVar, jx7 jx7Var) {
        nh0 a = ph0.a();
        xofVar.getClass();
        ynn d = ywf.d(0L, j);
        bak bakVar = bak.a;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(d.a, d.b, d.c, d.d);
        Path path = a.a;
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.addOval(rectF2, ph0.b(bakVar));
        a.b();
        return new zxj(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        w5d w5dVar = obj instanceof w5d ? (w5d) obj : null;
        return (w5dVar != null ? w5dVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
