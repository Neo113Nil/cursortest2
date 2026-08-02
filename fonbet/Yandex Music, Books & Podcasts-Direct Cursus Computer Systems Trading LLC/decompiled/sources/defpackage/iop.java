package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;

/* loaded from: classes4.dex */
public final class iop extends cg6 {
    public PlaybackCommand$QueueBound.Basic j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jop l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iop(jop jopVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jopVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
