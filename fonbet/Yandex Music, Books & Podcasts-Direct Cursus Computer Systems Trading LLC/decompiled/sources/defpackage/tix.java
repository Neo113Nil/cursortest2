package defpackage;

/* loaded from: classes.dex */
public final class tix extends jmx {
    private static final tix zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        tix tixVar = new tix();
        zzb = tixVar;
        jmx.f(tix.class, tixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", b3i.m, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new tix();
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
