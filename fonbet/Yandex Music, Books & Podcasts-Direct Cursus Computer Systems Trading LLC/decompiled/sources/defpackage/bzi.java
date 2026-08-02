package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class bzi implements cn2 {
    public final jyr a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final jyr c = btf.b(new dmg(27, this));

    public bzi(jyr jyrVar) {
        this.a = jyrVar;
    }

    @Override // defpackage.cn2
    public final vdr getData() {
        return (vdr) this.c.getValue();
    }

    @Override // defpackage.cn2
    public final void start() {
        if (this.b.compareAndSet(false, true)) {
            azi aziVar = (azi) ((yyi) this.a.getValue());
            pjc b0 = zsd.b0(new kvh(aziVar.a.c(), 9));
            msa msaVar = nsa.b;
            aziVar.c.d(azi.e[0], ox6.B(zsd.Y(b0, yd5.M(1, ssa.SECONDS)), aziVar.b, new fmi(3, aziVar)));
        }
    }
}
