package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class xqb extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ crb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqb(crb crbVar, int i) {
        super(1);
        this.r = i;
        this.s = crbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((acl) obj).getClass();
                ExoPlayer exoPlayer = this.s.a;
                Math.max(0L, exoPlayer.t0());
                exoPlayer.R0();
                return Unit.a;
            case 1:
                m7l m7lVar = (m7l) obj;
                m7lVar.getClass();
                m7lVar.q = Integer.valueOf(this.s.a.c());
                return Unit.a;
            case 2:
                ((acl) obj).getClass();
                ExoPlayer exoPlayer2 = this.s.a;
                Math.max(0L, exoPlayer2.J0());
                exoPlayer2.R0();
                return Unit.a;
            default:
                int intValue = ((Number) obj).intValue();
                crb crbVar = this.s;
                qah qahVar = crbVar.c.c;
                if (qahVar == null) {
                    return null;
                }
                if (intValue < 0 || intValue > qahVar.a - 1) {
                    qahVar = null;
                }
                if (qahVar == null) {
                    return null;
                }
                return (zsb) crbVar.f.l(new yqb(crbVar, intValue, 2));
        }
    }
}
