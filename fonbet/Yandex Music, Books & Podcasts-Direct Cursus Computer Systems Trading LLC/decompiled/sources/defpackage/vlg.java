package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class vlg extends cg6 {
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public String m;
    public long n;
    public long o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ xlg s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlg(xlg xlgVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = xlgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return xlg.f(this.s, null, null, null, this);
    }
}
