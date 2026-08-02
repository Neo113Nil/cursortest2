package defpackage;

/* loaded from: classes.dex */
public final class eox extends jmx {
    private static final eox zzb;
    private rmx zzd = inx.d;

    static {
        eox eoxVar = new eox();
        zzb = eoxVar;
        jmx.f(eox.class, eoxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", iox.class});
        }
        if (i2 == 3) {
            return new eox();
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
