package defpackage;

/* loaded from: classes.dex */
public final class xjx extends jmx {
    private static final xjx zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private rmx zzg = inx.d;

    static {
        xjx xjxVar = new xjx();
        zzb = xjxVar;
        jmx.f(xjx.class, xjxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", yjx.class});
        }
        if (i2 == 3) {
            return new xjx();
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
