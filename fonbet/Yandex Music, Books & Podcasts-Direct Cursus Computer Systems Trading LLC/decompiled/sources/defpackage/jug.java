package defpackage;

import com.yandex.passport.api.h;

/* loaded from: classes3.dex */
public final class jug extends cg6 {
    public h j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t1f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jug(t1f t1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = t1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.y(this);
    }
}
