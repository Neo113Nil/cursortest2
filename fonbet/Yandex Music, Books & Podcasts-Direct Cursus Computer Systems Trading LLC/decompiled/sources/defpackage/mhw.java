package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.m0;

/* loaded from: classes3.dex */
public final class mhw extends cg6 {
    public a0 j;
    public m0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rn5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhw(rn5 rn5Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = rn5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Q(this);
    }
}
