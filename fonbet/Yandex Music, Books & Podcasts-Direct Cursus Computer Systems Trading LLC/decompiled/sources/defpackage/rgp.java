package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rgp extends cg6 {
    public tgp j;
    public a1k k;
    public ArrayList l;
    public ArrayList m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public ArrayList s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ tgp y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgp(tgp tgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.y = tgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, this);
    }
}
