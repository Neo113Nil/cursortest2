package defpackage;

import com.yandex.music.shared.skeleton.data.network.LandingSkeletonApi;

/* loaded from: classes4.dex */
public final class bjf extends cg6 {
    public boolean j;
    public LandingSkeletonApi k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cjf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjf(cjf cjfVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = cjfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(false, this);
    }
}
