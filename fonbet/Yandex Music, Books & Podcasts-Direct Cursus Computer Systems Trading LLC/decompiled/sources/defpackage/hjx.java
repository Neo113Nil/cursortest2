package defpackage;

/* loaded from: classes.dex */
public final class hjx extends jmx {
    private static final hjx zzb;
    private int zzd;
    private long zze;
    private qmx zzf;
    private qmx zzg;

    static {
        hjx hjxVar = new hjx();
        zzb = hjxVar;
        jmx.f(hjx.class, hjxVar);
    }

    public hjx() {
        wmx wmxVar = wmx.d;
        this.zzf = wmxVar;
        this.zzg = wmxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new hjx();
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
