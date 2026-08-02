package yads;

import defpackage.fyc;
import defpackage.q881;
import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class pd1 extends Lambda implements tls {
    public final /* synthetic */ q881 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd1(q881 q881Var) {
        super(1);
        this.b = q881Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 zy11Var = zy11.a;
        fyc fycVar = this.b.f.a;
        if (fycVar != null) {
            fycVar.T(zy11Var);
        }
        return zy11Var;
    }
}
