package defpackage;

/* loaded from: classes.dex */
public final class pix extends jmx {
    private static final pix zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private gjx zzi;
    private int zzj;
    private boolean zzk;

    static {
        pix pixVar = new pix();
        zzb = pixVar;
        jmx.f(pix.class, pixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", ofc.m, "zzg", rre.n, "zzh", e3s.k, "zzi", "zzj", qee.m, "zzk"});
        }
        if (i2 == 3) {
            return new pix();
        }
        if (i2 == 4) {
            return new tdx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
