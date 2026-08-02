package defpackage;

/* loaded from: classes.dex */
public final class fjx extends jmx {
    private static final fjx zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        fjx fjxVar = new fjx();
        zzb = fjxVar;
        jmx.f(fjx.class, fjxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", mvt.n, "zzf", "zzg", gos.n});
        }
        if (i2 == 3) {
            return new fjx();
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
