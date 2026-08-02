package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class epu extends cg6 {
    public sml j;
    public ArrayList k;
    public ArrayList l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ sml o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epu(sml smlVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = smlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.k(null, this);
    }
}
