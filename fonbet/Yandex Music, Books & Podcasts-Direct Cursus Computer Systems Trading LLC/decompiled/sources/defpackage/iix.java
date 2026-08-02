package defpackage;

/* loaded from: classes.dex */
public final class iix extends jmx {
    private static final iix zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        iix iixVar = new iix();
        zzb = iixVar;
        jmx.f(iix.class, iixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", bs4.n, "zzf", klx.k});
        }
        if (i2 == 3) {
            return new iix();
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
