package yads;

import defpackage.b881;
import defpackage.f181;
import defpackage.h971;
import defpackage.mdh;
import defpackage.ns71;
import defpackage.sa71;
import defpackage.sjh;
import defpackage.sls;
import defpackage.uyj;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class a60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ns71 ns71Var = (ns71) this.b.w.getValue();
        sa71 sa71Var = (sa71) this.b.x.getValue();
        f181 f181Var = (f181) this.b.B.getValue();
        sjh sjhVar = uyj.a;
        return new b881(ns71Var, sa71Var, f181Var, mdh.b);
    }
}
