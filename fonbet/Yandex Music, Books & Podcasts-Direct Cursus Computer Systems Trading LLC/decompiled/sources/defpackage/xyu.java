package defpackage;

import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$SetOriginalPosition;

/* loaded from: classes4.dex */
public final class xyu extends cg6 {
    public WaveQueueCommandsFactory$SetOriginalPosition j;
    public kr7 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yyu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyu(yyu yyuVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = yyuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
