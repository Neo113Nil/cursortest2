package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tlg extends cg6 {
    public List j;
    public String k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ xlg o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlg(xlg xlgVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = xlgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return xlg.e(this.o, null, this);
    }
}
