package defpackage;

import java.io.File;

/* loaded from: classes5.dex */
public final class s60 extends cg6 {
    public String j;
    public String k;
    public String l;
    public z77 m;
    public String n;
    public File o;
    public oqi p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ cr s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(cr crVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = crVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return cr.n(this.s, null, null, null, null, this);
    }
}
