package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class si2 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si2(Object obj, boolean z, int i) {
        super(0);
        this.r = i;
        this.t = obj;
        this.s = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xpi i;
        switch (this.r) {
            case 0:
                ((ui2) this.t).setEnabled(this.s);
                return Unit.a;
            case 1:
                if (this.s && (i = ((ch0) this.t).i()) != null) {
                    ((x0q) i).a(Unit.a);
                }
                return Unit.a;
            case 2:
                crb crbVar = (crb) this.t;
                c38 c38Var = crbVar.O;
                c38Var.a = -9223372036854775807L;
                c38Var.b = -9223372036854775807L;
                ExoPlayer exoPlayer = crbVar.a;
                exoPlayer.O0(this.s);
                exoPlayer.stop();
                return Unit.a;
            case 3:
                return Boolean.valueOf(this.s || ((d1n) this.t).e.e() > 0.5f);
            default:
                ((Function1) this.t).invoke(Boolean.valueOf(!this.s));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si2(boolean z, Object obj, int i) {
        super(0);
        this.r = i;
        this.s = z;
        this.t = obj;
    }
}
