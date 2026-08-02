package defpackage;

import android.os.SystemClock;
import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public final class s7b1 extends u791 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7b1(Object obj, tha1 tha1Var, int i) {
        super(tha1Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.u791
    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                mdi0 mdi0Var = (mdi0) obj;
                m8b1 m8b1Var = (m8b1) mdi0Var.d;
                m8b1Var.Gg();
                g gVar = (g) m8b1Var.b;
                gVar.D.getClass();
                mdi0Var.e(SystemClock.elapsedRealtime(), false, false);
                bh91 bh91Var = gVar.G;
                g.d(bh91Var);
                gVar.D.getClass();
                bh91Var.Jg(SystemClock.elapsedRealtime());
                break;
            default:
                n9b1 n9b1Var = (n9b1) obj;
                n9b1Var.Kg();
                y1a1 y1a1Var = ((g) n9b1Var.b).y;
                g.g(y1a1Var);
                y1a1Var.H.a("Starting upload from DelayedRunnable");
                n9b1Var.c.l();
                break;
        }
    }
}
