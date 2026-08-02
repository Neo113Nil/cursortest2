package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class us extends cg6 {
    public Map j;
    public et k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ et n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(et etVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = etVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, this);
    }
}
