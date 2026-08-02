package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class lul extends cg6 {
    public cvl j;
    public List k;
    public ArrayList l;
    public cvl m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ oul p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lul(oul oulVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = oulVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, false, this);
    }
}
