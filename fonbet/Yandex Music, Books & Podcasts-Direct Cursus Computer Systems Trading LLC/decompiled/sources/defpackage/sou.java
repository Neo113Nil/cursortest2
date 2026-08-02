package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class sou extends cg6 {
    public String j;
    public ArrayList k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ uou o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sou(uou uouVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = uouVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(this, null, null);
    }
}
