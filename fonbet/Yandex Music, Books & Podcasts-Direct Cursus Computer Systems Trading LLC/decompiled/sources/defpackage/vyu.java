package defpackage;

import com.yandex.music.shared.playback.api.commands.ReplayCommand;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Prev;

/* loaded from: classes4.dex */
public final class vyu implements k3l {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.k3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WaveQueueCommandsFactory$Prev waveQueueCommandsFactory$Prev, vx6 vx6Var, cg6 cg6Var) {
        uyu uyuVar;
        int i;
        kr7 kr7Var;
        int ordinal;
        if (cg6Var instanceof uyu) {
            uyuVar = (uyu) cg6Var;
            int i2 = uyuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uyuVar.m = i2 - Integer.MIN_VALUE;
                Object obj = uyuVar.k;
                Object obj2 = nm6.a;
                i = uyuVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveQueuePrevCommandsExecutor", "prev " + waveQueueCommandsFactory$Prev, null);
                    Object value = ((g4l) vx6Var.c).c.getValue();
                    kr7Var = value instanceof kr7 ? (kr7) value : null;
                    if (kr7Var != null) {
                        uyuVar.j = kr7Var;
                        uyuVar.m = 1;
                        obj = kr7Var.j(uyuVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return i3l.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kr7Var = uyuVar.j;
                qgg.h0(obj);
                ordinal = ((oxi) obj).ordinal();
                if (ordinal != 0) {
                    return h3l.a;
                }
                if (ordinal == 1) {
                    return new f3l(new ReplayCommand());
                }
                if (ordinal == 2) {
                    kr7Var.getClass();
                    return new g3l(u4c.a(false));
                }
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                return i3l.a;
            }
        }
        uyuVar = new uyu(this, cg6Var);
        Object obj3 = uyuVar.k;
        Object obj22 = nm6.a;
        i = uyuVar.m;
        if (i != 0) {
        }
        ordinal = ((oxi) obj3).ordinal();
        if (ordinal != 0) {
        }
    }
}
