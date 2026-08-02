package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes4.dex */
public final class d0r extends cg6 {
    public ExoPlayer j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e0r l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0r(e0r e0rVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = e0rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h0(null, this);
    }
}
