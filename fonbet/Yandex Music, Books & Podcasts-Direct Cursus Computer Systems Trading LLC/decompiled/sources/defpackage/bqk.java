package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class bqk extends cg6 {
    public String j;
    public List k;
    public List l;
    public List m;
    public ArrayList n;
    public /* synthetic */ Object o;
    public final /* synthetic */ t1f p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqk(t1f t1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = t1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.H(null, this);
    }
}
