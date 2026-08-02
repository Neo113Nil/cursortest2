package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class u8r extends jib {
    public final x8r b;
    public volatile long c;

    public u8r(x8r x8rVar) {
        x8rVar.getClass();
        this.b = x8rVar;
    }

    @Override // defpackage.jib
    public final void f(es3 es3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        inetSocketAddress.getClass();
        u();
    }

    @Override // defpackage.jib
    public final void g(es3 es3Var, okn oknVar) {
        oknVar.getClass();
        u();
    }

    @Override // defpackage.jib
    public final void j(es3 es3Var, String str) {
        u();
    }

    @Override // defpackage.jib
    public final void o(es3 es3Var, long j) {
        String a;
        long j2 = this.c;
        Long valueOf = Long.valueOf(j2);
        if (j2 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            String str = es3Var.a().a.i;
            msa msaVar = nsa.b;
            long N = yd5.N(SystemClock.uptimeMillis() - longValue, ssa.MILLISECONDS);
            x8r x8rVar = this.b;
            x8rVar.getClass();
            Pair b = x8r.b(x8rVar.c);
            boolean booleanValue = ((Boolean) b.a).booleanValue();
            int intValue = ((Number) b.b).intValue();
            if (booleanValue && (a = x8r.a(str)) != null) {
                x8rVar.b.g("IMG_DOWNLOADED", new dia(intValue, str, a, N).h());
            }
        }
    }

    @Override // defpackage.jib
    public final void t(es3 es3Var) {
        u();
    }

    public final void u() {
        if (this.c != 0) {
            return;
        }
        this.c = SystemClock.uptimeMillis();
    }
}
