package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;

/* loaded from: classes4.dex */
public final class cop extends cg6 {
    public PlaybackCommand$QueueBound.Basic j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dop l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cop(dop dopVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = dopVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
