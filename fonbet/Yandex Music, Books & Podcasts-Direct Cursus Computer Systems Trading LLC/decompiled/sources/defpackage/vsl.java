package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class vsl extends cg6 {
    public List j;
    public String k;
    public cvl l;
    public String m;
    public rtl n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ btl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsl(btl btlVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = btlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.l(null, null, this);
    }
}
