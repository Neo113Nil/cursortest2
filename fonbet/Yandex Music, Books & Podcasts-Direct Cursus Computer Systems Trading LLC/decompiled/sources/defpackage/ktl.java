package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ktl extends cg6 {
    public String j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rtl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktl(rtl rtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = rtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(this, null, null);
    }
}
