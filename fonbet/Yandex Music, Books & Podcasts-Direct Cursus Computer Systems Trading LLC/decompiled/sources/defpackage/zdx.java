package defpackage;

/* loaded from: classes.dex */
public final class zdx extends jmx {
    private static final zdx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private wdx zzi;
    private int zzj;

    static {
        zdx zdxVar = new zdx();
        zzb = zdxVar;
        jmx.f(zdx.class, zdxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"zzd", "zze", "zzf", h1b.j, "zzg", "zzh", "zzi", "zzj", e88.k});
        }
        if (i2 == 3) {
            return new zdx();
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
