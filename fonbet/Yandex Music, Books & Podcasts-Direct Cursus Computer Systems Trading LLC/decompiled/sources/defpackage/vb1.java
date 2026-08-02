package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class vb1 extends cg6 {
    public String j;
    public Map k;
    public List l;
    public Collection m;
    public Iterator n;
    public Collection o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ qne s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(qne qneVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = qneVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.t(null, null, null, this);
    }
}
