package defpackage;

/* loaded from: classes.dex */
public final class cox extends jmx {
    private static final cox zzb;
    private int zzd;
    private double zze;
    private int zzf;
    private int zzg;

    static {
        cox coxVar = new cox();
        zzb = coxVar;
        jmx.f(cox.class, coxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", rwd.l, "zzg", h1b.l});
        }
        if (i2 == 3) {
            return new cox();
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
