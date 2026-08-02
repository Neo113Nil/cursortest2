package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class tuu implements cn2 {
    public final jyr a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final jyr c = btf.b(new wfs(28, this));

    public tuu(jyr jyrVar) {
        this.a = jyrVar;
    }

    @Override // defpackage.cn2
    public final vdr getData() {
        return (vdr) this.c.getValue();
    }

    @Override // defpackage.cn2
    public final void start() {
        if (this.b.compareAndSet(false, true)) {
            suu suuVar = (suu) ((puu) this.a.getValue());
            pjc b0 = zsd.b0(new cla(y1g.L(suuVar.a), 12));
            msa msaVar = nsa.b;
            suuVar.c.d(suu.e[0], ox6.B(new y4s(zsd.Y(b0, yd5.M(1, ssa.SECONDS)), 19), suuVar.b, new lot(12, suuVar)));
        }
    }
}
