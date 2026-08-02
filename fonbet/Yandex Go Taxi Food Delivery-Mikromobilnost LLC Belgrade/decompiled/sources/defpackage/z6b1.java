package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z6b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hr91 c;

    public z6b1(m8b1 m8b1Var, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                Objects.requireNonNull(m8b1Var);
                this.c = m8b1Var;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(m8b1Var);
                this.c = m8b1Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r0.M.a() != false) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        long j = this.b;
        hr91 hr91Var = this.c;
        switch (i) {
            case 0:
                m8b1 m8b1Var = (m8b1) hr91Var;
                mdi0 mdi0Var = m8b1Var.z;
                m8b1Var.Gg();
                m8b1Var.Kg();
                g gVar = (g) m8b1Var.b;
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.H.b(Long.valueOf(j), "Activity resumed, time");
                j691 j691Var = gVar.w;
                if (!j691Var.Qg(null, nw91.U0)) {
                    if (!j691Var.Ug()) {
                        o5a1 o5a1Var = gVar.x;
                        g.e(o5a1Var);
                        break;
                    }
                    ((m8b1) mdi0Var.d).Gg();
                    ((s7b1) mdi0Var.c).c();
                    mdi0Var.a = j;
                    mdi0Var.b = j;
                } else if (j691Var.Ug() || m8b1Var.x) {
                    ((m8b1) mdi0Var.d).Gg();
                    ((s7b1) mdi0Var.c).c();
                    mdi0Var.a = j;
                    mdi0Var.b = j;
                }
                rfw0 rfw0Var = m8b1Var.A;
                m8b1 m8b1Var2 = (m8b1) rfw0Var.b;
                m8b1Var2.Gg();
                g gVar2 = (g) m8b1Var2.b;
                m7b1 m7b1Var = (m7b1) rfw0Var.a;
                if (m7b1Var != null) {
                    m8b1Var2.w.removeCallbacks(m7b1Var);
                }
                o5a1 o5a1Var2 = gVar2.x;
                j jVar = gVar2.F;
                g.e(o5a1Var2);
                o5a1Var2.M.b(false);
                m8b1Var2.Gg();
                m8b1Var2.x = false;
                if (gVar2.w.Qg(null, nw91.T0)) {
                    g.f(jVar);
                    if (jVar.H) {
                        y1a1 y1a1Var2 = gVar2.y;
                        g.g(y1a1Var2);
                        y1a1Var2.H.a("Retrying trigger URI registration in foreground");
                        g.f(jVar);
                        jVar.fh();
                    }
                }
                eba1 eba1Var = m8b1Var.y;
                m8b1 m8b1Var3 = (m8b1) eba1Var.a;
                m8b1Var3.Gg();
                g gVar3 = (g) m8b1Var3.b;
                if (gVar3.a()) {
                    gVar3.D.getClass();
                    eba1Var.d(System.currentTimeMillis());
                    break;
                }
                break;
            case 1:
                m8b1 m8b1Var4 = (m8b1) hr91Var;
                m8b1Var4.Gg();
                m8b1Var4.Kg();
                g gVar4 = (g) m8b1Var4.b;
                y1a1 y1a1Var3 = gVar4.y;
                g.g(y1a1Var3);
                l1a1 l1a1Var = y1a1Var3.H;
                long j2 = this.b;
                l1a1Var.b(Long.valueOf(j2), "Activity paused, time");
                rfw0 rfw0Var2 = m8b1Var4.A;
                m8b1 m8b1Var5 = (m8b1) rfw0Var2.b;
                ((g) m8b1Var5.b).D.getClass();
                m7b1 m7b1Var2 = new m7b1(rfw0Var2, System.currentTimeMillis(), j2);
                rfw0Var2.a = m7b1Var2;
                m8b1Var5.w.postDelayed(m7b1Var2, 2000L);
                if (gVar4.w.Ug()) {
                    ((s7b1) m8b1Var4.z.c).c();
                    break;
                }
                break;
            default:
                ((bh91) hr91Var).Mg(j);
                break;
        }
    }

    public z6b1(bh91 bh91Var, long j) {
        this.a = 2;
        this.b = j;
        Objects.requireNonNull(bh91Var);
        this.c = bh91Var;
    }
}
