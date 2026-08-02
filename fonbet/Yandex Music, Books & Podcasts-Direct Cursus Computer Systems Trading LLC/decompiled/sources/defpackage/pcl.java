package defpackage;

import android.os.Handler;
import java.util.Map;

/* loaded from: classes.dex */
public final class pcl implements azs {
    public final zno a;
    public final qdc b = new qdc(1);
    public final y2i c = new y2i(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ qcl e;

    public pcl(qcl qclVar, zi7 zi7Var) {
        this.e = qclVar;
        this.a = new zno(zi7Var, null, null);
    }

    @Override // defpackage.azs
    public final void a(long j, int i, int i2, int i3, zys zysVar) {
        long f;
        long j2;
        this.a.a(j, i, i2, i3, zysVar);
        while (this.a.t(false)) {
            y2i y2iVar = this.c;
            y2iVar.z();
            if (this.a.y(this.b, y2iVar, 0, false) == -4) {
                y2iVar.C();
            } else {
                y2iVar = null;
            }
            if (y2iVar != null) {
                long j3 = y2iVar.k;
                u2i A = this.e.c.A(y2iVar);
                if (A != null) {
                    tib tibVar = (tib) A.a[0];
                    String str = tibVar.a;
                    String str2 = tibVar.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = dvt.b0(dvt.r(tibVar.e));
                        } catch (r7k unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            ocl oclVar = new ocl(j3, j2);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, oclVar));
                        }
                    }
                }
            }
        }
        zno znoVar = this.a;
        vno vnoVar = znoVar.a;
        synchronized (znoVar) {
            int i4 = znoVar.s;
            f = i4 == 0 ? -1L : znoVar.f(i4);
        }
        vnoVar.b(f);
    }

    @Override // defpackage.azs
    public final void b(d7k d7kVar, int i, int i2) {
        this.a.b(d7kVar, i, 0);
    }

    @Override // defpackage.azs
    public final int c(ma7 ma7Var, int i, boolean z) {
        return this.a.c(ma7Var, i, z);
    }

    @Override // defpackage.azs
    public final void d(dsc dscVar) {
        this.a.d(dscVar);
    }

    public final boolean e(long j) {
        boolean z;
        qcl qclVar = this.e;
        d97 d97Var = qclVar.f;
        znk znkVar = qclVar.b;
        if (!d97Var.d) {
            return false;
        }
        if (qclVar.h) {
            return true;
        }
        Map.Entry ceilingEntry = qclVar.e.ceilingEntry(Long.valueOf(d97Var.h));
        if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= j) {
            z = false;
        } else {
            long longValue = ((Long) ceilingEntry.getKey()).longValue();
            n97 n97Var = (n97) znkVar.b;
            long j2 = n97Var.Y;
            if (j2 == -9223372036854775807L || j2 < longValue) {
                n97Var.Y = longValue;
            }
            z = true;
        }
        if (z && qclVar.g) {
            qclVar.h = true;
            qclVar.g = false;
            n97 n97Var2 = (n97) znkVar.b;
            n97Var2.D.removeCallbacks(n97Var2.w);
            n97Var2.G();
        }
        return z;
    }

    public final boolean f(sk4 sk4Var) {
        long j = this.d;
        boolean z = j != -9223372036854775807L && j < sk4Var.g;
        qcl qclVar = this.e;
        if (qclVar.f.d) {
            if (!qclVar.h) {
                if (z) {
                    if (qclVar.g) {
                        qclVar.h = true;
                        qclVar.g = false;
                        n97 n97Var = (n97) qclVar.b.b;
                        n97Var.D.removeCallbacks(n97Var.w);
                        n97Var.G();
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
