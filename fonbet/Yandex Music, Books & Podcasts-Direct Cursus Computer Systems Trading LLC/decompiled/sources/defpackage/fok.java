package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class fok extends cg6 {
    public cok j;
    public yqk k;
    public l43 l;
    public Map m;
    public Iterator n;
    public /* synthetic */ Object o;
    public final /* synthetic */ nnd p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fok(nnd nndVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = nndVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.T(null, null, null, this);
    }
}
