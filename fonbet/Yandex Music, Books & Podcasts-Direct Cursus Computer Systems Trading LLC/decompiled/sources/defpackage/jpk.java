package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class jpk extends cg6 {
    public String j;
    public Map k;
    public List l;
    public Collection m;
    public Iterator n;
    public Collection o;
    public Object p;
    public List q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ vpk t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpk(vpk vpkVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = vpkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, this);
    }
}
