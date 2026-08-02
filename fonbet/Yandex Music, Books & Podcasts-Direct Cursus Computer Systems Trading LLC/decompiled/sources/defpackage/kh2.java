package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class kh2 implements d3l {
    public final coc a;

    public kh2(coc cocVar) {
        cocVar.getClass();
        this.a = cocVar;
    }

    @Override // defpackage.d3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        return b((cg6) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        jh2 jh2Var;
        int i;
        if (cg6Var instanceof jh2) {
            jh2Var = (jh2) cg6Var;
            int i2 = jh2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jh2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = jh2Var.j;
                nm6 nm6Var = nm6.a;
                i = jh2Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "AwaitNetworkConnectedCommandsExecutor", "Await network connected", null);
                    msa msaVar = nsa.b;
                    long M = yd5.M(15, ssa.SECONDS);
                    hl hlVar = new hl(this, continuation, 21);
                    jh2Var.l = 1;
                    obj = tyf.M(M, hlVar, jh2Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        jh2Var = new jh2(this, cg6Var);
        Object obj2 = jh2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = jh2Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }
}
