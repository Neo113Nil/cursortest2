package yads;

import defpackage.h971;
import defpackage.qw71;
import defpackage.sls;
import defpackage.tb81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class q60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new qw71((tb81) this.b.d.getValue());
    }
}
