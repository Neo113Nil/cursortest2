package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xec extends cg6 {
    public Map j;
    public Iterator k;
    public ymp l;
    public qqi m;
    public Map n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ yec q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xec(yec yecVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = yecVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
