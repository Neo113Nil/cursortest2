package defpackage;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class fv1 extends xzi {
    @Override // defpackage.xzi
    public final ev1 U() {
        return new gv1(((AudioAttributes.Builder) this.a).build(), 0);
    }

    @Override // defpackage.xzi
    public final xzi i0(int i) {
        ((AudioAttributes.Builder) this.a).setUsage(i);
        return this;
    }

    @Override // defpackage.xzi
    public final xzi j0(int i) {
        ((AudioAttributes.Builder) this.a).setUsage(i);
        return this;
    }
}
