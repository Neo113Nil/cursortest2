package defpackage;

/* loaded from: classes.dex */
public final class kix extends jmx {
    private static final kix zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private vgx zzg;

    static {
        kix kixVar = new kix();
        zzb = kixVar;
        jmx.f(kix.class, kixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", b2c.y, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new kix();
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
