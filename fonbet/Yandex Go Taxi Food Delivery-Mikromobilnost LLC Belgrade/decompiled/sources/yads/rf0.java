package yads;

import defpackage.j18;
import defpackage.mf60;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class rf0 extends Lambda implements sls {
    public final /* synthetic */ j18 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(j18 j18Var) {
        super(0);
        this.b = j18Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        boolean z = this.b.t() instanceof mf60;
        zy11 zy11Var = zy11.a;
        if (z) {
            this.b.resumeWith(new Result(zy11Var));
        }
        return zy11Var;
    }
}
