package yads;

import defpackage.dt81;
import defpackage.h971;
import defpackage.ir81;
import defpackage.k181;
import defpackage.ko61;
import defpackage.mdh;
import defpackage.ns71;
import defpackage.sa71;
import defpackage.sjh;
import defpackage.sls;
import defpackage.uyj;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class z50 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ns71 ns71Var = (ns71) this.b.w.getValue();
        sa71 sa71Var = (sa71) this.b.x.getValue();
        dt81 dt81Var = (dt81) this.b.h.getValue();
        ir81 ir81Var = (ir81) this.b.A.getValue();
        ko61 ko61Var = (ko61) this.b.z.getValue();
        sjh sjhVar = uyj.a;
        return new k181(ns71Var, sa71Var, dt81Var, ir81Var, ko61Var, mdh.b);
    }
}
