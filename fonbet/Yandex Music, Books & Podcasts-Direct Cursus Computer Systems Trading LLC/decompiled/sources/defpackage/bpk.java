package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class bpk extends cg6 {
    public String j;
    public List k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ epk o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpk(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(null, null, this);
    }
}
