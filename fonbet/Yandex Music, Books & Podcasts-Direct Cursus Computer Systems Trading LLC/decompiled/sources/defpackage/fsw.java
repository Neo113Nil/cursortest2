package defpackage;

import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.s0;

/* loaded from: classes4.dex */
public final class fsw extends cg6 {
    public s0 j;
    public xlw k;
    public c0 l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gsw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsw(gsw gswVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = gswVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(null, null, false, this);
    }
}
