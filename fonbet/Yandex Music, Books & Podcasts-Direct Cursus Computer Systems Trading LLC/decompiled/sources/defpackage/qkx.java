package defpackage;

/* loaded from: classes.dex */
public final class qkx extends jmx {
    private static final qkx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private vgx zzg;

    static {
        qkx qkxVar = new qkx();
        zzb = qkxVar;
        jmx.f(qkx.class, qkxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", klx.l, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new qkx();
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
