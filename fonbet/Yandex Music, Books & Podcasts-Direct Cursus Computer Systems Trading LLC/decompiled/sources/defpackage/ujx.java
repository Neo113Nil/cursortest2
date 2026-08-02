package defpackage;

/* loaded from: classes.dex */
public final class ujx extends jmx {
    private static final ujx zzb;
    private int zzd;
    private dox zze;
    private rmx zzf = inx.d;

    static {
        ujx ujxVar = new ujx();
        zzb = ujxVar;
        jmx.f(ujx.class, ujxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ujx();
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
