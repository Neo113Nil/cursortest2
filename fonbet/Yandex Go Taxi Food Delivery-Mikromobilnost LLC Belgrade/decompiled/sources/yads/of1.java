package yads;

import defpackage.oq81;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class of1 extends Lambda implements sls {
    public final /* synthetic */ pf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(pf1 pf1Var) {
        super(0);
        this.b = pf1Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        pf1 pf1Var = this.b;
        oq81 oq81Var = pf1Var.b;
        return oq81.a(pf1Var.c, pf1Var.a);
    }
}
