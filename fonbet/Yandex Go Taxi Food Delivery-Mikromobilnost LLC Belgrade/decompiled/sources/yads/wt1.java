package yads;

import android.content.Context;
import defpackage.bvf0;
import defpackage.bz61;
import defpackage.cvw;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.n291;
import defpackage.qhw0;
import defpackage.qx71;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wha1;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class wt1 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ n291 c;
    public final /* synthetic */ bz61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt1(Context context, n291 n291Var, bz61 bz61Var) {
        super(0);
        this.b = context;
        this.c = n291Var;
        this.d = bz61Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Context context = this.b;
        n291 n291Var = this.c;
        bz61 bz61Var = this.d;
        Context context2 = n291Var.a;
        qx71 qx71Var = new qx71(0, wha1.c(context2, context2));
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        tje.N(bvf0.a(cvw.U(a, mdh.b).plus(qx71Var)), null, null, new xt1(context, n291Var, null), 3);
        bz61Var.onInitializationCompleted();
        return zy11.a;
    }
}
