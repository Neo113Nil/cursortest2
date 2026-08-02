package defpackage;

/* loaded from: classes.dex */
public final class oei {
    public float a = Float.NaN;
    public float b = Float.NaN;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ rei e;

    public oei(rei reiVar) {
        this.e = reiVar;
    }

    public final void a() {
        int i = this.c;
        rei reiVar = this.e;
        if (i != -1 || this.d != -1) {
            int i2 = this.d;
            if (i == -1) {
                reiVar.I(i2);
            } else if (i2 == -1) {
                reiVar.F(i);
            } else {
                reiVar.G(i, i2);
            }
            reiVar.setState(qei.b);
        }
        boolean isNaN = Float.isNaN(this.b);
        float f = this.a;
        if (isNaN) {
            if (Float.isNaN(f)) {
                return;
            }
            reiVar.setProgress(this.a);
            return;
        }
        float f2 = this.b;
        if (reiVar.isAttachedToWindow()) {
            reiVar.setProgress(f);
            reiVar.setState(qei.c);
            reiVar.t = f2;
            if (f2 != 0.0f) {
                reiVar.u(f2 > 0.0f ? 1.0f : 0.0f);
            } else if (f != 0.0f && f != 1.0f) {
                reiVar.u(f > 0.5f ? 1.0f : 0.0f);
            }
        } else {
            if (reiVar.Z0 == null) {
                reiVar.Z0 = new oei(reiVar);
            }
            oei oeiVar = reiVar.Z0;
            oeiVar.a = f;
            oeiVar.b = f2;
        }
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = -1;
        this.d = -1;
    }
}
