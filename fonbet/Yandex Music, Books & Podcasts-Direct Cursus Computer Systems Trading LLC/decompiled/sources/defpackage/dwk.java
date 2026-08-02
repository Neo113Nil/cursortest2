package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes4.dex */
public final class dwk {
    public final mvk a;
    public long b;
    public final StringBuilder c;
    public String d;
    public boolean e;
    public boolean f;
    public Integer g;
    public long h;
    public long i;

    public dwk(mvk mvkVar, long j) {
        long j2;
        nsa nsaVar = mvkVar.e;
        this.a = mvkVar;
        this.b = j;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.d = "";
        this.e = true;
        this.h = this.b;
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        this.i = yd5.M(0, ssaVar);
        sb.append("p:" + nsa.f(this.b) + ";");
        this.g = null;
        if (nsa.c(this.b, yd5.M(0, ssaVar)) < 0) {
            a("r:prepareLessZero;");
            return;
        }
        long j3 = this.b;
        if (nsaVar != null) {
            j2 = nsaVar.a;
        } else {
            nsa.b.getClass();
            j2 = nsa.c;
        }
        if (nsa.c(j3, j2) > 0) {
            a("r:prepareGreaterDuration:" + (nsaVar != null ? Long.valueOf(nsa.f(nsaVar.a)) : null) + ";");
        }
    }

    public final void a(String str) {
        this.e = false;
        StringBuilder sb = this.c;
        sb.append(str);
        this.g = null;
        ssg.a(6, ewk.e, sb.toString(), null);
    }

    public final void b(long j, long j2) {
        long j3;
        nsa nsaVar = this.a.e;
        this.c.append(hrg.m(nsa.f(j2), ";", tlm.l(nsa.f(j), "sk:", StringUtils.PROCESS_POSTFIX_DELIMITER)));
        this.g = null;
        if (nsa.c(j, this.h) < 0) {
            long f = nsa.f(this.h);
            long f2 = nsa.f(j);
            StringBuilder l = tlm.l(f, "r:seekFromBeforeCurrent:", StringUtils.PROCESS_POSTFIX_DELIMITER);
            l.append(f2);
            l.append(";");
            a(l.toString());
        }
        if (nsaVar != null) {
            j3 = nsaVar.a;
        } else {
            nsa.b.getClass();
            j3 = nsa.c;
        }
        if (nsa.c(j2, j3) > 0) {
            a("r:seekToGreaterDuration" + nsa.f(j2) + StringUtils.PROCESS_POSTFIX_DELIMITER + (nsaVar != null ? Long.valueOf(nsa.f(nsaVar.a)) : null) + ";");
        }
    }
}
