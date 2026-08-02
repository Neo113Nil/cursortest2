package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class puf extends xci implements ofp {
    public Function0 o;
    public luf p;
    public bxj q;
    public boolean r;
    public boolean s;
    public cwo t;
    public final ouf u = new ouf(this, 0);
    public ouf v;

    public puf(Function0 function0, luf lufVar, bxj bxjVar, boolean z, boolean z2) {
        this.o = function0;
        this.p = lufVar;
        this.q = bxjVar;
        this.r = z;
        this.s = z2;
        S0();
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    public final void S0() {
        this.t = new cwo(new nuf(this, 1), new nuf(this, 2), this.s);
        this.v = this.r ? new ouf(this, 1) : null;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        wfp.w(jfpVar);
        jfpVar.o(ufp.K, this.u);
        bxj bxjVar = this.q;
        bxj bxjVar2 = bxj.a;
        cwo cwoVar = this.t;
        if (bxjVar == bxjVar2) {
            if (cwoVar == null) {
                Intrinsics.j("scrollAxisRange");
                throw null;
            }
            wfp.y(jfpVar, cwoVar);
        } else {
            if (cwoVar == null) {
                Intrinsics.j("scrollAxisRange");
                throw null;
            }
            wfp.m(jfpVar, cwoVar);
        }
        ouf oufVar = this.v;
        if (oufVar != null) {
            jfpVar.o(hfp.f, new sa(null, oufVar));
        }
        jfpVar.o(hfp.B, new sa(null, new hxo(4, new nuf(this, 0))));
        wfp.i(jfpVar, this.p.c());
    }
}
