package defpackage;

/* loaded from: classes.dex */
public final class six extends jmx {
    private static final six zzb;
    private int zzd;
    private int zze;

    static {
        six sixVar = new six();
        zzb = sixVar;
        jmx.f(six.class, sixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", b3i.m});
        }
        if (i2 == 3) {
            return new six();
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
