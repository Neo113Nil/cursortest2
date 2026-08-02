package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class dka extends cg6 {
    public vhn j;
    public Boolean k;
    public Integer l;
    public ArrayList m;
    public String n;
    public /* synthetic */ Object o;
    public final /* synthetic */ eka p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dka(eka ekaVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = ekaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, null, null, null, this);
    }
}
