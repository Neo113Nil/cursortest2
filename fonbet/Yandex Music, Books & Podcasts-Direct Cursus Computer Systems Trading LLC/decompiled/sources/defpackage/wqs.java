package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class wqs extends cg6 {
    public mqs j;
    public zus k;
    public s1t l;
    public j1g m;
    public ArrayList n;
    public brs o;
    public ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ brs u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqs(brs brsVar, cg6 cg6Var) {
        super(cg6Var);
        this.u = brsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return brs.c(this.u, null, null, false, false, false, null, null, this);
    }
}
