package defpackage;

import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$SetOriginalPosition;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yyu implements d3l {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WaveQueueCommandsFactory$SetOriginalPosition waveQueueCommandsFactory$SetOriginalPosition, vx6 vx6Var, cg6 cg6Var) {
        xyu xyuVar;
        int i;
        kr7 kr7Var;
        svu svuVar;
        gxj gxjVar;
        boolean z;
        if (cg6Var instanceof xyu) {
            xyuVar = (xyu) cg6Var;
            int i2 = xyuVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xyuVar.n = i2 - Integer.MIN_VALUE;
                Object obj = xyuVar.l;
                nm6 nm6Var = nm6.a;
                i = xyuVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveQueueSetOriginalPositionCommandsExecutor", "set original position " + waveQueueCommandsFactory$SetOriginalPosition, null);
                    Object value = ((g4l) vx6Var.c).c.getValue();
                    kr7Var = value instanceof kr7 ? (kr7) value : null;
                    if (kr7Var == null) {
                        return Boolean.FALSE;
                    }
                    int position = waveQueueCommandsFactory$SetOriginalPosition.getPosition();
                    xyuVar.j = waveQueueCommandsFactory$SetOriginalPosition;
                    xyuVar.k = kr7Var;
                    xyuVar.n = 1;
                    obj = kr7Var.n(position, xyuVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            dfi.r("Queue didn't met condition in 3 seconds", "WaveQueueSetPositionCommandsExecutor");
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    kr7 kr7Var2 = xyuVar.k;
                    WaveQueueCommandsFactory$SetOriginalPosition waveQueueCommandsFactory$SetOriginalPosition2 = xyuVar.j;
                    qgg.h0(obj);
                    kr7Var = kr7Var2;
                    waveQueueCommandsFactory$SetOriginalPosition = waveQueueCommandsFactory$SetOriginalPosition2;
                }
                svuVar = (svu) obj;
                boolean t = bzf.t(svuVar, waveQueueCommandsFactory$SetOriginalPosition.getMode());
                if (!Intrinsics.d(svuVar, qvu.a)) {
                    gxjVar = new gxj(waveQueueCommandsFactory$SetOriginalPosition.getPosition());
                } else if (svuVar instanceof rvu) {
                    gxjVar = new gxj(((rvu) svuVar).b);
                } else {
                    if (!Intrinsics.d(svuVar, pvu.a)) {
                        b6e.s();
                        return null;
                    }
                    gxjVar = null;
                }
                if (!waveQueueCommandsFactory$SetOriginalPosition.getAsync() || gxjVar == null) {
                    return Boolean.valueOf(t);
                }
                msa msaVar = nsa.b;
                long M = yd5.M(3, ssa.SECONDS);
                npt nptVar = new npt(kr7Var, continuation, gxjVar, 22);
                xyuVar.j = null;
                xyuVar.k = null;
                xyuVar.n = 2;
                obj = tyf.M(M, nptVar, xyuVar);
            }
        }
        xyuVar = new xyu(this, cg6Var);
        Object obj2 = xyuVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xyuVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        svuVar = (svu) obj2;
        boolean t2 = bzf.t(svuVar, waveQueueCommandsFactory$SetOriginalPosition.getMode());
        if (!Intrinsics.d(svuVar, qvu.a)) {
        }
        if (waveQueueCommandsFactory$SetOriginalPosition.getAsync()) {
        }
        return Boolean.valueOf(t2);
    }
}
