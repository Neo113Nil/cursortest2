package defpackage;

import com.yandex.mapkit.geometry.Point;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public abstract class x65 {
    public final tt2 a;
    public final ah00 b;
    public Point c;
    public final hbp0 e = new hbp0(new czo0(14), "", null);
    public boolean d;
    public final r0 f = bvf0.c(Boolean.valueOf(this.d));
    public double g = -1.0d;
    public final v65 h = new v65(0, this);

    public x65(tt2 tt2Var, ah00 ah00Var) {
        this.a = tt2Var;
        this.b = ah00Var;
    }

    public abstract void a();

    public final void b(boolean z) {
        if (this.d != z) {
            this.d = z;
            qv10.B(z, this.f, null);
        }
    }
}
