package defpackage;

import com.yandex.passport.api.h;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.properties.p;

/* loaded from: classes3.dex */
public final class tw7 extends cg6 {
    public q0 j;
    public p k;
    public h l;
    public /* synthetic */ Object m;
    public final /* synthetic */ vx6 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw7(vx6 vx6Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = vx6Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.z(this);
    }
}
