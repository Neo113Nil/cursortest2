package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class mpk extends cg6 {
    public String j;
    public Iterator k;
    public cvl l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vpk p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f(this, null, null);
    }
}
