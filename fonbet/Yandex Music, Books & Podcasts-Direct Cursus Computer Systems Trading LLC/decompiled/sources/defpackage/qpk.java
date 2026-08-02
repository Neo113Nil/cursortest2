package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class qpk extends cg6 {
    public String j;
    public List k;
    public tqn l;
    public Iterator m;
    public cvl n;
    public Object o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ vpk s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.j(null, this);
    }
}
