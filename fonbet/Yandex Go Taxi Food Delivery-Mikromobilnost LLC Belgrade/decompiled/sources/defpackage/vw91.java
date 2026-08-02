package defpackage;

import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public abstract class vw91 extends hr91 {
    public boolean c;

    public vw91(g gVar) {
        super(gVar);
        ((g) this.b).T++;
    }

    public final void Hg() {
        if (this.c) {
            return;
        }
        ny61.r("Not initialized");
    }

    public final void Ig() {
        if (this.c) {
            ny61.r("Can't initialize twice");
        } else {
            if (Jg()) {
                return;
            }
            ((g) this.b).V.incrementAndGet();
            this.c = true;
        }
    }

    public abstract boolean Jg();
}
