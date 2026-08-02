package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class pca extends cg6 {
    public String j;
    public vhn k;
    public Boolean l;
    public Integer m;
    public ArrayList n;
    public String o;
    public /* synthetic */ Object p;
    public final /* synthetic */ sca q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pca(sca scaVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = scaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.e(null, null, null, null, this);
    }
}
