package defpackage;

/* loaded from: classes.dex */
public final class vjx extends jmx {
    private static final vjx zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        vjx vjxVar = new vjx();
        zzb = vjxVar;
        jmx.f(vjx.class, vjxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            kjn kjnVar = kjn.k;
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", kjnVar, "zzf", kjnVar});
        }
        if (i2 == 3) {
            return new vjx();
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
