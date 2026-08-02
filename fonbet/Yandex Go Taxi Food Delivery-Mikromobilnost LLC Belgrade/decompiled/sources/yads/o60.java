package yads;

import defpackage.df81;
import defpackage.fa71;
import defpackage.h971;
import defpackage.j291;
import defpackage.ka81;
import defpackage.ns71;
import defpackage.nu71;
import defpackage.oq71;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class o60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new ns71((df81) this.b.n.getValue(), (oq71) this.b.q.getValue(), (j291) this.b.p.getValue(), (ka81) this.b.o.getValue(), (nu71) this.b.l.getValue(), (fa71) this.b.m.getValue());
    }
}
