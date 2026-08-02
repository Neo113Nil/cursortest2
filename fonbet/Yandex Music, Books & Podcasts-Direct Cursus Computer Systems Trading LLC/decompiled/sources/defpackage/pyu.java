package defpackage;

import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;

/* loaded from: classes4.dex */
public final class pyu extends cg6 {
    public WaveQueueCommandsFactory$Next j;
    public kr7 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qyu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyu(qyu qyuVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = qyuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
