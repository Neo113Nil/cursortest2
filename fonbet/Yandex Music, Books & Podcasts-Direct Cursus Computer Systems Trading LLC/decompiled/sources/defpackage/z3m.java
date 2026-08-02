package defpackage;

import com.yandex.music.databases.main.MainDatabase;

/* loaded from: classes4.dex */
public final class z3m extends cg6 {
    public MainDatabase j;
    public cvl k;
    public r4m l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ b4m p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3m(b4m b4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = b4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return b4m.a(this.p, null, null, false, this);
    }
}
