package yads;

import defpackage.sls;
import defpackage.v771;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.b;

/* loaded from: classes7.dex */
public final class et0 extends Lambda implements sls {
    public final /* synthetic */ v771 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(v771 v771Var) {
        super(0);
        this.b = v771Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        v771 v771Var = this.b;
        return b.m(b.p(v771Var.b, v771Var.c), "&", dt0.w, 30);
    }
}
