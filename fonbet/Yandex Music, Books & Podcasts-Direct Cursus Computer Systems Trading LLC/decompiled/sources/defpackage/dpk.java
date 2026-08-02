package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class dpk extends cg6 {
    public String j;
    public h63 k;
    public gwr l;
    public Map m;
    public ArrayList n;
    public /* synthetic */ Object o;
    public final /* synthetic */ epk p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpk(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.k(null, null, null, this);
    }
}
