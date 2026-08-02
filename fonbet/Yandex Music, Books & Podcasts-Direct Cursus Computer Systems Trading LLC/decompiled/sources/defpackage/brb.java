package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class brb extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ crb s;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brb(crb crbVar, float f, int i) {
        super(0);
        this.r = i;
        this.s = crbVar;
        this.t = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ExoPlayer exoPlayer = this.s.a;
                p0l m = exoPlayer.m();
                m.getClass();
                exoPlayer.r(new p0l(this.t, m.b));
                break;
            default:
                this.s.a.t(this.t);
                break;
        }
        return Unit.a;
    }
}
