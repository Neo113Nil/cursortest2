package defpackage;

import android.os.Build;

/* loaded from: classes5.dex */
public final class rvh {
    public final jyr a;
    public final jyr b;
    public volatile ltw c;
    public volatile chd d;

    public rvh(jyr jyrVar, jyr jyrVar2) {
        this.a = jyrVar;
        this.b = jyrVar2;
    }

    public final void a() {
        Object obj = this.d;
        if (obj == null) {
            obj = this.c;
        }
        jyr jyrVar = this.a;
        if (obj == null) {
            ((z08) ((qvh) jyrVar.getValue()).a.e.getValue()).a.l(null);
            ((rrc) this.b.getValue()).a = wg.t;
            return;
        }
        ((z08) ((qvh) jyrVar.getValue()).a.e.getValue()).a.l(obj);
        qvh qvhVar = (qvh) this.a.getValue();
        rrc rrcVar = (rrc) this.b.getValue();
        qvhVar.getClass();
        rrcVar.getClass();
        dmg dmgVar = new dmg(11, qvhVar.a);
        if (Build.VERSION.SDK_INT >= 31) {
            rrcVar.a = dmgVar;
        }
    }
}
