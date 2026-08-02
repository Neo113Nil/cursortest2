package defpackage;

import com.yandex.music.shared.splash.screen.network.dto.SplashScreenDto;

/* loaded from: classes4.dex */
public final class p7r extends cg6 {
    public SplashScreenDto j;
    public xve k;
    public rv8 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ q7r o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7r(q7r q7rVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = q7rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return q7r.a(this.o, null, this);
    }
}
