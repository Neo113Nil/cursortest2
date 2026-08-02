package defpackage;

import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$SetQueuePosition;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class czu implements d3l {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
    
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.d3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WaveQueueCommandsFactory$SetQueuePosition waveQueueCommandsFactory$SetQueuePosition, vx6 vx6Var, cg6 cg6Var) {
        bzu bzuVar;
        int i;
        kr7 kr7Var;
        svu svuVar;
        ran ranVar;
        boolean z;
        if (cg6Var instanceof bzu) {
            bzuVar = (bzu) cg6Var;
            int i2 = bzuVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bzuVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bzuVar.l;
                nm6 nm6Var = nm6.a;
                i = bzuVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveQueueSetQueuePositionCommandsExecutor", "set queue position " + waveQueueCommandsFactory$SetQueuePosition, null);
                    vx6Var.getClass();
                    waveQueueCommandsFactory$SetQueuePosition.getClass();
                    boolean forSecondaryQueue = waveQueueCommandsFactory$SetQueuePosition.getForSecondaryQueue();
                    g4l g4lVar = (g4l) vx6Var.c;
                    Object value = (forSecondaryQueue ? g4lVar.d : g4lVar.c).getValue();
                    kr7Var = value instanceof kr7 ? (kr7) value : null;
                    if (kr7Var == null) {
                        return Boolean.FALSE;
                    }
                    int position = waveQueueCommandsFactory$SetQueuePosition.getPosition();
                    bzuVar.j = waveQueueCommandsFactory$SetQueuePosition;
                    bzuVar.k = kr7Var;
                    bzuVar.n = 1;
                    obj = kr7Var.m(position, bzuVar);
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
                    kr7 kr7Var2 = bzuVar.k;
                    WaveQueueCommandsFactory$SetQueuePosition waveQueueCommandsFactory$SetQueuePosition2 = bzuVar.j;
                    qgg.h0(obj);
                    kr7Var = kr7Var2;
                    waveQueueCommandsFactory$SetQueuePosition = waveQueueCommandsFactory$SetQueuePosition2;
                }
                svuVar = (svu) obj;
                boolean t = bzf.t(svuVar, waveQueueCommandsFactory$SetQueuePosition.getMode());
                if (!Intrinsics.d(svuVar, qvu.a)) {
                    ranVar = new ran(waveQueueCommandsFactory$SetQueuePosition.getPosition());
                } else if (svuVar instanceof rvu) {
                    ranVar = new ran(((rvu) svuVar).a);
                } else {
                    if (!Intrinsics.d(svuVar, pvu.a)) {
                        b6e.s();
                        return null;
                    }
                    ranVar = null;
                }
                if (!waveQueueCommandsFactory$SetQueuePosition.getAsync() || ranVar == null) {
                    return Boolean.valueOf(t);
                }
                msa msaVar = nsa.b;
                long M = yd5.M(3, ssa.SECONDS);
                npt nptVar = new npt(kr7Var, continuation, ranVar, 23);
                bzuVar.j = null;
                bzuVar.k = null;
                bzuVar.n = 2;
                obj = tyf.M(M, nptVar, bzuVar);
            }
        }
        bzuVar = new bzu(this, cg6Var);
        Object obj2 = bzuVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bzuVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        svuVar = (svu) obj2;
        boolean t2 = bzf.t(svuVar, waveQueueCommandsFactory$SetQueuePosition.getMode());
        if (!Intrinsics.d(svuVar, qvu.a)) {
        }
        if (waveQueueCommandsFactory$SetQueuePosition.getAsync()) {
        }
        return Boolean.valueOf(t2);
    }
}
