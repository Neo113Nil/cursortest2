package defpackage;

import com.yandex.music.shared.playback.api.commands.ReplayCommand;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$BroadcastQueueFallbackToBeginning;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class qyu implements k3l {
    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.k3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WaveQueueCommandsFactory$Next waveQueueCommandsFactory$Next, vx6 vx6Var, cg6 cg6Var) {
        pyu pyuVar;
        int i;
        WaveQueueCommandsFactory$Next waveQueueCommandsFactory$Next2;
        kr7 kr7Var;
        int ordinal;
        if (cg6Var instanceof pyu) {
            pyuVar = (pyu) cg6Var;
            int i2 = pyuVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pyuVar.n = i2 - Integer.MIN_VALUE;
                Object obj = pyuVar.l;
                Object obj2 = nm6.a;
                i = pyuVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveQueueNextCommandsExecutor", "next " + waveQueueCommandsFactory$Next, null);
                    vx6Var.getClass();
                    waveQueueCommandsFactory$Next.getClass();
                    boolean forSecondaryQueue = waveQueueCommandsFactory$Next.getForSecondaryQueue();
                    g4l g4lVar = (g4l) vx6Var.c;
                    Object value = (forSecondaryQueue ? g4lVar.d : g4lVar.c).getValue();
                    kr7 kr7Var2 = value instanceof kr7 ? (kr7) value : null;
                    if (kr7Var2 != null) {
                        v5j mode = waveQueueCommandsFactory$Next.getMode();
                        pyuVar.j = waveQueueCommandsFactory$Next;
                        pyuVar.k = kr7Var2;
                        pyuVar.n = 1;
                        obj = kr7Var2.i(mode, pyuVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        kr7 kr7Var3 = kr7Var2;
                        waveQueueCommandsFactory$Next2 = waveQueueCommandsFactory$Next;
                        kr7Var = kr7Var3;
                    }
                    return i3l.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kr7Var = pyuVar.k;
                waveQueueCommandsFactory$Next2 = pyuVar.j;
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
                    return new g3l(new eyk(CollectionsKt.h0(u4c.a(waveQueueCommandsFactory$Next2.getForSecondaryQueue()).a, new WaveQueueCommandsFactory$BroadcastQueueFallbackToBeginning(waveQueueCommandsFactory$Next2.getForSecondaryQueue()))));
                }
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                return i3l.a;
            }
        }
        pyuVar = new pyu(this, cg6Var);
        Object obj3 = pyuVar.l;
        Object obj22 = nm6.a;
        i = pyuVar.n;
        if (i != 0) {
        }
        ordinal = ((oxi) obj3).ordinal();
        if (ordinal != 0) {
        }
    }
}
