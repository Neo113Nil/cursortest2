package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes4.dex */
public final class uzq extends cg6 {
    public ExoPlayer j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vzq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzq(vzq vzqVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vzqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h0(null, this);
    }
}
