package defpackage;

import com.yandex.passport.api.h;

/* loaded from: classes3.dex */
public final class e6m extends cg6 {
    public h j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j6m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6m(j6m j6mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = j6mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
