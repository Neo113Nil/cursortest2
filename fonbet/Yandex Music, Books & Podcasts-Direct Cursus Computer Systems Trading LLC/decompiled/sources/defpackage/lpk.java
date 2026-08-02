package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class lpk extends cg6 {
    public String j;
    public Iterator k;
    public cvl l;
    public byr m;
    public int n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ vpk s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.e(this, null, null);
    }
}
