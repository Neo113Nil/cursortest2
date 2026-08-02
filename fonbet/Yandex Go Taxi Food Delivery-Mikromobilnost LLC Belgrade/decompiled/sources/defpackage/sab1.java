package defpackage;

import com.google.android.gms.measurement.internal.n;

/* loaded from: classes.dex */
public abstract class sab1 extends r9b1 {
    public boolean w;

    public sab1(n nVar) {
        super(nVar);
        this.c.K++;
    }

    public final void Hg() {
        if (this.w) {
            return;
        }
        ny61.r("Not initialized");
    }

    public final void Ig() {
        if (this.w) {
            ny61.r("Can't initialize twice");
            return;
        }
        Jg();
        this.c.L++;
        this.w = true;
    }

    public abstract void Jg();
}
