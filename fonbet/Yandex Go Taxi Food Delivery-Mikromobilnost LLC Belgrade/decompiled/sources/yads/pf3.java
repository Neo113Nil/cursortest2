package yads;

import android.view.View;
import defpackage.b181;
import defpackage.bl61;
import defpackage.fj71;
import defpackage.iz71;
import defpackage.jq81;
import defpackage.k781;
import defpackage.mt81;
import defpackage.o081;
import defpackage.uy71;

/* loaded from: classes7.dex */
public final class pf3 implements View.OnClickListener {
    public final fj71 a;
    public final jq81 b;
    public final k781 c;

    public pf3(fj71 fj71Var, jq81 jq81Var, k781 k781Var) {
        this.a = fj71Var;
        this.b = jq81Var;
        this.c = k781Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k781 k781Var = this.c;
        fj71 fj71Var = this.a;
        fj71 fj71Var2 = new fj71(fj71Var.a, fj71Var.b, fj71Var.c, k781Var.y, fj71Var.e);
        jq81 jq81Var = this.b;
        o081 o081Var = jq81Var.c;
        mt81 mt81Var = o081Var.a;
        uy71 uy71Var = jq81Var.a;
        b181 b181Var = jq81Var.b;
        iz71 iz71Var = jq81Var.d;
        bl61 bl61Var = jq81Var.e;
        mt81Var.getClass();
        new wy1(uy71Var, b181Var, o081Var, iz71Var, fj71Var2, bl61Var).onClick(view);
    }
}
