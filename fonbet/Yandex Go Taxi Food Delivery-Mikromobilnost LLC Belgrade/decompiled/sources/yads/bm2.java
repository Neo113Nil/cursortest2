package yads;

import android.view.View;
import defpackage.c971;
import defpackage.d291;
import defpackage.pzf;
import defpackage.s421;
import defpackage.yp61;

/* loaded from: classes7.dex */
public final class bm2 implements View.OnClickListener {
    public final yp61 a;
    public final c971 b;
    public final d291 c;

    public bm2(yp61 yp61Var, c971 c971Var, d291 d291Var) {
        this.a = yp61Var;
        this.b = c971Var;
        this.c = d291Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t52 t52Var = (t52) this.a.d();
        if (t52Var != null) {
            yl2 yl2Var = t52Var.c.a;
            this.c.getClass();
            yl2Var.setBackground(null);
            yl2Var.setVisibility(8);
            yl2Var.a.setOnClickListener(null);
            pzf pzfVar = this.b.a;
            pzfVar.a((s421) pzfVar.j);
        }
    }
}
