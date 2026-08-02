package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ucj extends cg6 {
    public Collection j;
    public Iterator k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vcj p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucj(vcj vcjVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = vcjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return vcj.a(this.p, this);
    }
}
