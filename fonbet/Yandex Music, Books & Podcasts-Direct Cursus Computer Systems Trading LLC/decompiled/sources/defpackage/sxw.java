package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* loaded from: classes.dex */
public final class sxw extends lxw implements rmd, smd {
    public static final bww o = wxw.a;
    public final Context h;
    public final Handler i;
    public final bww j = o;
    public final Set k;
    public final rn5 l;
    public rfq m;
    public cxw n;

    public sxw(Context context, fsn fsnVar, rn5 rn5Var) {
        this.h = context;
        this.i = fsnVar;
        this.l = rn5Var;
        this.k = (Set) rn5Var.b;
    }

    @Override // defpackage.rmd
    public final void R(Bundle bundle) {
        this.m.B(this);
    }

    @Override // defpackage.lxw
    public final void S0(myw mywVar) {
        this.i.post(new rxw(0, this, mywVar));
    }

    @Override // defpackage.smd
    public final void X(h66 h66Var) {
        this.n.b(h66Var);
    }

    @Override // defpackage.rmd
    public final void p0(int i) {
        cxw cxwVar = this.n;
        axw axwVar = (axw) cxwVar.f.j.get(cxwVar.b);
        if (axwVar != null) {
            if (axwVar.o) {
                axwVar.n(new h66(17));
            } else {
                axwVar.p0(i);
            }
        }
    }
}
