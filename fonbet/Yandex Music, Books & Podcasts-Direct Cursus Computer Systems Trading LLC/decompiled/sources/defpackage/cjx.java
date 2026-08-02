package defpackage;

/* loaded from: classes.dex */
public final class cjx extends jmx {
    private static final cjx zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        cjx cjxVar = new cjx();
        zzb = cjxVar;
        jmx.f(cjx.class, cjxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", o6c.u, "zzf"});
        }
        if (i2 == 3) {
            return new cjx();
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
