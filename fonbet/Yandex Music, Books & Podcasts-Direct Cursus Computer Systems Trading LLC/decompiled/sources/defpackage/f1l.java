package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;

/* loaded from: classes4.dex */
public final class f1l extends cg6 {
    public PlaybackCommand$QueueLaunch j;
    public ii3 k;
    public Integer l;
    public /* synthetic */ Object m;
    public final /* synthetic */ anx n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1l(anx anxVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = anxVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.o(null, null, null, this);
    }
}
