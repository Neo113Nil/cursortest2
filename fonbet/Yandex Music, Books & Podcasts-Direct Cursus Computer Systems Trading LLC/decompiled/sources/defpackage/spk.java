package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class spk extends cg6 {
    public String j;
    public Iterator k;
    public qkm l;
    public pj6 m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ vpk q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.l(null, this);
    }
}
