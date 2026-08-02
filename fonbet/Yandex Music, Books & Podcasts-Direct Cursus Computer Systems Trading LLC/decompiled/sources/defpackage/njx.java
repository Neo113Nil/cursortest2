package defpackage;

/* loaded from: classes.dex */
public final class njx extends jmx {
    private static final njx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        njx njxVar = new njx();
        zzb = njxVar;
        jmx.f(njx.class, njxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", e88.l, "zzg"});
        }
        if (i2 == 3) {
            return new njx();
        }
        if (i2 == 4) {
            return new jjx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
