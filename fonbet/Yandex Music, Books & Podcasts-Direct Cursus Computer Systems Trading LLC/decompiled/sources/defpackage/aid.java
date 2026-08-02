package defpackage;

import ru.yandex.music.glagol.data.b;

/* loaded from: classes5.dex */
public final class aid extends cg6 {
    public Iterable j;
    public o3f k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aid(b bVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return b.a(this.m, null, this);
    }
}
