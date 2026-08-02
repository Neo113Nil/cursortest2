package defpackage;

import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;

/* loaded from: classes4.dex */
public final class bap implements k3l {
    @Override // defpackage.k3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueBound.Substituting substituting, vx6 vx6Var, yrn yrnVar) {
        return b(vx6Var, yrnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vx6 vx6Var, cg6 cg6Var) {
        aap aapVar;
        int i;
        if (cg6Var instanceof aap) {
            aapVar = (aap) cg6Var;
            int i2 = aapVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aapVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aapVar.j;
                nm6 nm6Var = nm6.a;
                i = aapVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    u9p u9pVar = new u9p((uol) vx6Var.d, null, 1);
                    bsd b = dm6.b();
                    aapVar.l = 1;
                    obj = x97.V(b, u9pVar, aapVar);
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
                return new f3l(new SeekToFractionCommand(((Number) obj).floatValue()));
            }
        }
        aapVar = new aap(this, cg6Var);
        Object obj2 = aapVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aapVar.l;
        if (i != 0) {
        }
        return new f3l(new SeekToFractionCommand(((Number) obj2).floatValue()));
    }
}
