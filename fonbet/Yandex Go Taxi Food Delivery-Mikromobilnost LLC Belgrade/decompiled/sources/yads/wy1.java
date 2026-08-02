package yads;

import android.os.SystemClock;
import android.view.View;
import defpackage.b181;
import defpackage.bl61;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.fj71;
import defpackage.hu71;
import defpackage.iz71;
import defpackage.jl40;
import defpackage.o081;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uy71;
import defpackage.uyj;

/* loaded from: classes7.dex */
public final class wy1 implements View.OnClickListener {
    public final uy71 a;
    public final b181 b;
    public final o081 c;
    public final iz71 d;
    public final fj71 e;
    public final bl61 f;
    public final tse g;

    public wy1(uy71 uy71Var, b181 b181Var, o081 o081Var, iz71 iz71Var, fj71 fj71Var, bl61 bl61Var) {
        this.a = uy71Var;
        this.b = b181Var;
        this.c = o081Var;
        this.d = iz71Var;
        this.e = fj71Var;
        this.f = bl61Var;
        hu71 hu71Var = new hu71();
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.g = bvf0.a(cvw.U(a, o400.a.x).plus(hu71Var));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        Long l = this.d.a;
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = 0;
        }
        fj71 fj71Var = this.e;
        if (fj71Var == null || j < fj71Var.e || !this.a.e) {
            return;
        }
        tje.N(this.g, null, null, new vy1(this, view, null), 3);
    }
}
