package defpackage;

import com.yandex.music.shared.wave.api.StartWaveQueueCommand;

/* loaded from: classes4.dex */
public final class adr extends cg6 {
    public StartWaveQueueCommand j;
    public es6 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bdr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adr(bdr bdrVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bdrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
