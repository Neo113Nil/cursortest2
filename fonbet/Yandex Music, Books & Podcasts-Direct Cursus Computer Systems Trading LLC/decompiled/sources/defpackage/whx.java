package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class whx extends jmx {
    private static final whx zzb;
    private int zzd;
    private mix zze;
    private long zzf;
    private int zzg;
    private rmx zzh;
    private rmx zzi;
    private rmx zzj;
    private rmx zzk;
    private rmx zzl;
    private int zzm;

    static {
        whx whxVar = new whx();
        zzb = whxVar;
        jmx.f(whx.class, whxVar);
    }

    public whx() {
        inx inxVar = inx.d;
        this.zzh = inxVar;
        this.zzi = inxVar;
        this.zzj = inxVar;
        this.zzk = inxVar;
        this.zzl = inxVar;
    }

    public static vhx m() {
        return (vhx) zzb.k();
    }

    public static void n(whx whxVar, ArrayList arrayList) {
        rmx rmxVar = whxVar.zzh;
        if (!((tlx) rmxVar).a) {
            whxVar.zzh = jmx.c(rmxVar);
        }
        slx.b(arrayList, whxVar.zzh);
    }

    public static void o(whx whxVar, ArrayList arrayList) {
        rmx rmxVar = whxVar.zzi;
        if (!((tlx) rmxVar).a) {
            whxVar.zzi = jmx.c(rmxVar);
        }
        slx.b(arrayList, whxVar.zzi);
    }

    public static void p(whx whxVar, ArrayList arrayList) {
        rmx rmxVar = whxVar.zzl;
        if (!((tlx) rmxVar).a) {
            whxVar.zzl = jmx.c(rmxVar);
        }
        slx.b(arrayList, whxVar.zzl);
    }

    public static void q(whx whxVar, ArrayList arrayList) {
        rmx rmxVar = whxVar.zzj;
        if (!((tlx) rmxVar).a) {
            whxVar.zzj = jmx.c(rmxVar);
        }
        slx.b(arrayList, whxVar.zzj);
    }

    public static void r(whx whxVar, ArrayList arrayList) {
        rmx rmxVar = whxVar.zzk;
        if (!((tlx) rmxVar).a) {
            whxVar.zzk = jmx.c(rmxVar);
        }
        slx.b(arrayList, whxVar.zzk);
    }

    public static /* synthetic */ void s(whx whxVar, mix mixVar) {
        whxVar.zze = mixVar;
        whxVar.zzd |= 1;
    }

    public static /* synthetic */ void t(whx whxVar, int i) {
        whxVar.zzd |= 8;
        whxVar.zzm = i;
    }

    public static /* synthetic */ void u(whx whxVar, long j) {
        whxVar.zzd |= 2;
        whxVar.zzf = j;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", qee.n, "zzh", uhx.class, "zzi", qhx.class, "zzj", aix.class, "zzk", yhx.class, "zzl", shx.class, "zzm"});
        }
        if (i2 == 3) {
            return new whx();
        }
        if (i2 == 4) {
            return new vhx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
