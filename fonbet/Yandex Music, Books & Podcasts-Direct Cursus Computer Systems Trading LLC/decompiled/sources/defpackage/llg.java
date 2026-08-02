package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class llg extends cg6 {
    public cvl j;
    public ArrayList k;
    public String l;
    public int m;
    public int n;
    public int o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ xlg r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llg(xlg xlgVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = xlgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return xlg.a(this.r, null, null, 0, this);
    }
}
