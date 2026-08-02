package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class y8f extends cg6 {
    public Collection j;
    public Iterator k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ z8f p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8f(z8f z8fVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = z8fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(this);
    }
}
