package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hbu {
    public final nnk a;
    public final dbu b;
    public final mgr c = new mgr();
    public final lis d = new lis(1);
    public final lis e = new lis(1);
    public final n8n f;
    public long g;
    public tcu h;
    public long i;

    public hbu(nnk nnkVar, dbu dbuVar) {
        this.a = nnkVar;
        this.b = dbuVar;
        n8n n8nVar = new n8n(7, (byte) 0);
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        n8nVar.b = 0;
        n8nVar.c = 0;
        n8nVar.e = new long[highestOneBit];
        n8nVar.d = highestOneBit - 1;
        this.f = n8nVar;
        this.g = -9223372036854775807L;
        this.h = tcu.d;
    }

    public final void a(long j, long j2) {
        int a;
        nnk nnkVar = this.a;
        tyi tyiVar = (tyi) nnkVar.b;
        do {
            n8n n8nVar = this.f;
            int i = n8nVar.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                wvs.n();
                return;
            }
            long j3 = ((long[]) n8nVar.e)[n8nVar.b];
            Long l = (Long) this.e.f(j3);
            dbu dbuVar = this.b;
            if (l != null && l.longValue() != this.i) {
                this.i = l.longValue();
                dbuVar.d(2);
            }
            a = this.b.a(j3, j, j2, this.i, false, false, this.c);
            if (a == 0 || a == 1) {
                long y0 = n8nVar.y0();
                tcu tcuVar = (tcu) this.d.f(y0);
                if (tcuVar != null && !tcuVar.equals(tcu.d) && !tcuVar.equals(this.h)) {
                    this.h = tcuVar;
                    bsc bscVar = new bsc();
                    bscVar.t = tcuVar.a;
                    bscVar.u = tcuVar.b;
                    bscVar.m = l5i.p("video/raw");
                    nnkVar.a = new dsc(bscVar);
                    ((Executor) tyiVar.h).execute(new lt7(nnkVar, tcuVar));
                }
                dbuVar.e();
                dsc dscVar = (dsc) nnkVar.a;
                dsc dscVar2 = dscVar == null ? new dsc(new bsc()) : dscVar;
                abu abuVar = (abu) tyiVar.i;
                ((dzr) tyiVar.c).getClass();
                abuVar.b(y0, System.nanoTime(), dscVar2, null);
                ((ArrayDeque) tyiVar.e).remove().getClass();
                l1j.f();
                return;
            }
            if (a == 2 || a == 3) {
                n8nVar.y0();
                ((Executor) tyiVar.h).execute(new lt7(nnkVar, 1));
                ((ArrayDeque) tyiVar.e).remove().getClass();
                l1j.f();
                return;
            }
        } while (a == 4);
        if (a == 5) {
            return;
        }
        xq0.q(String.valueOf(a));
    }
}
