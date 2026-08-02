package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class fkc implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fkc(int i, long j, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.d;
        long j = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                msa msaVar = nsa.b;
                wqn wqnVar = (wqn) obj3;
                if (nsa.c(yd5.N(elapsedRealtime - wqnVar.a, ssa.MILLISECONDS), j) <= 0) {
                    break;
                } else {
                    wqnVar.a = elapsedRealtime;
                    Object emit = ((rjc) obj2).emit(obj, continuation);
                    if (emit != nm6.a) {
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                jtm jtmVar = (jtm) obj3;
                z2h z2hVar = (z2h) obj2;
                z2hVar.getClass();
                int ordinal = z2hVar.ordinal();
                Object obj4 = rmt.a;
                if (ordinal == 0) {
                    long j2 = j - longValue;
                    if (j2 > 0) {
                        long j3 = 1000;
                        long j4 = (j2 / j3) + 1;
                        obj4 = (j / j3 <= 3 || j4 > 3) ? smt.a : new qmt(String.valueOf(j4));
                    }
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                }
                jtmVar.setValue(obj4);
                break;
        }
        return Unit.a;
    }
}
