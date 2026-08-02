package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class n98 extends bfu {
    public final vx6 k;
    public final vxr l;
    public final xdr m;
    public final xdr n;
    public final j0q o;
    public rar p;

    public n98() {
        l18 l18Var = l18.b;
        bdt I = hag.I(a98.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        a98 a98Var = (a98) qdcVar.C(I);
        this.k = new vx6(6);
        l13 l13Var = a98Var.a;
        this.l = new vxr((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), (z66) l13Var.a.D(hag.I(z66.class), l13Var, l13Var.b));
        this.m = ydr.a(j98.a);
        this.n = ydr.a(Boolean.FALSE);
        this.o = new j0q();
        G();
    }

    public final void G() {
        vx6 vx6Var = this.k;
        Continuation continuation = null;
        u21 u21Var = new u21(10, ((gs4) vx6Var.b).l(), new eno(new f98(vx6Var, continuation, 0)), new jw4(3, 3, continuation));
        rar rarVar = this.p;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.p = ox6.B(u21Var, ot0.F(this), new u58(2, this));
    }
}
