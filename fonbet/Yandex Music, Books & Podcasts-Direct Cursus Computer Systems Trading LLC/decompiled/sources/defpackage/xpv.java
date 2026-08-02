package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class xpv extends aqv {
    public final WindowInsets.Builder c;

    public xpv(kqv kqvVar) {
        super(kqvVar);
        WindowInsets g = kqvVar.g();
        this.c = g != null ? e43.f(g) : e43.e();
    }

    @Override // defpackage.aqv
    public kqv b() {
        a();
        kqv h = kqv.h(null, this.c.build());
        h.a.r(this.b);
        return h;
    }

    @Override // defpackage.aqv
    public void d(zne zneVar) {
        this.c.setMandatorySystemGestureInsets(zneVar.e());
    }

    @Override // defpackage.aqv
    public void e(zne zneVar) {
        this.c.setStableInsets(zneVar.e());
    }

    @Override // defpackage.aqv
    public void f(zne zneVar) {
        this.c.setSystemGestureInsets(zneVar.e());
    }

    @Override // defpackage.aqv
    public void g(zne zneVar) {
        this.c.setSystemWindowInsets(zneVar.e());
    }

    @Override // defpackage.aqv
    public void h(zne zneVar) {
        this.c.setTappableElementInsets(zneVar.e());
    }

    public xpv() {
        this.c = e43.e();
    }
}
