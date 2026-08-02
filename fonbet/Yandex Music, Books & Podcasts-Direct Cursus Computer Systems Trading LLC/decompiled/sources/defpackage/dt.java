package defpackage;

import com.yandex.music.databases.main.MainDatabase;

/* loaded from: classes4.dex */
public final class dt extends cg6 {
    public String j;
    public Object k;
    public MainDatabase l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ et o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(et etVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = etVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.k(null, null, 0, this);
    }
}
