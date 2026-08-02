package defpackage;

import ru.yandex.music.glagol.data.b;

/* loaded from: classes5.dex */
public final class cid extends cg6 {
    public unl j;
    public t1q k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cid(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
