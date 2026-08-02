package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class tpk extends cg6 {
    public String j;
    public Object k;
    public Object l;
    public Object m;
    public List n;
    public Collection o;
    public Object p;
    public Collection q;
    public Object r;
    public Collection s;
    public Object t;
    public List u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ vpk x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.x = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.m(null, this);
    }
}
