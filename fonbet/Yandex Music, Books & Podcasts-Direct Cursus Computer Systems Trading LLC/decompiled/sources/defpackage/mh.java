package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final /* synthetic */ Object c;

    public mh(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    String str = oh.a;
                    if (oh.f == null) {
                        oh.f = new sj(Long.valueOf(this.b), null);
                    }
                    sj sjVar = oh.f;
                    if (sjVar != null) {
                        sjVar.e = Long.valueOf(this.b);
                    }
                    if (oh.e.get() <= 0) {
                        q9 q9Var = new q9(3, this);
                        synchronized (oh.d) {
                            oh.c = oh.b.schedule(q9Var, q8c.b(j3c.c()) != null ? r5.b : 60, TimeUnit.SECONDS);
                        }
                    }
                    long j = oh.i;
                    ne2.b(j > 0 ? (this.b - j) / 1000 : 0L, (String) this.c);
                    sj sjVar2 = oh.f;
                    if (sjVar2 != null) {
                        sjVar2.s();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    bp6.a(this, th);
                    return;
                }
            default:
                joe joeVar = new joe(0);
                zn4 zn4Var = (zn4) this.c;
                zn4Var.i.y0(joeVar);
                long j2 = this.b;
                long abs = Math.abs(j2) / 1000000000;
                long abs2 = Math.abs(j2) % 1000000000;
                StringBuilder sb = new StringBuilder("deadline exceeded after ");
                if (j2 < 0) {
                    sb.append('-');
                }
                sb.append(abs);
                Locale locale = Locale.US;
                sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
                sb.append("s. ");
                sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) zn4Var.h.a(qo4.a)) == null ? 0.0d : r2.longValue() / zn4.r)));
                sb.append(joeVar);
                zn4Var.i.f(sgr.i.c(sb.toString()));
                return;
        }
    }

    public mh(zn4 zn4Var, long j) {
        this.c = zn4Var;
        this.b = j;
    }
}
