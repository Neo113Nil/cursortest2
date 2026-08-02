package flex.network.cache.action;

import defpackage.bvf0;
import defpackage.dw;
import defpackage.fse;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jp50;
import defpackage.jse;
import defpackage.kr;
import defpackage.n6u;
import defpackage.ovw;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.xfz;
import defpackage.z93;
import defpackage.zjr;
import defpackage.zse;

/* loaded from: classes4.dex */
public final class a implements dw {
    public final jp50 a;
    public final zjr b = new zjr(xfz.b(a.class.getSimpleName()));
    public final ike c;

    public a(jp50 jp50Var, tse tseVar) {
        this.a = jp50Var;
        z93 z93Var = new z93(this);
        fse plus = tseVar.getCoroutineContext().plus(jl40.a());
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(plus.plus((jse) zse.a.c).plus(z93Var));
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.c, null, null, new InvalidateCacheActionHandler$handle$1(this, (ovw) krVar, null), 3);
    }
}
