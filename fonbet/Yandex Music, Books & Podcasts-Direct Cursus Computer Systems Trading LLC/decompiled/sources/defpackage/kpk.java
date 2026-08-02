package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class kpk extends cg6 {
    public String j;
    public Map k;
    public List l;
    public Collection m;
    public Object n;
    public Collection o;
    public Object p;
    public Collection q;
    public Object r;
    public List s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ vpk v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.v = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
