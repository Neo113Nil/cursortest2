package defpackage;

/* loaded from: classes.dex */
public final class rkx extends jmx {
    private static final rkx zzb;
    private int zzd;
    private int zze;
    private rmx zzf;
    private rmx zzg;
    private int zzh;

    static {
        rkx rkxVar = new rkx();
        zzb = rkxVar;
        jmx.f(rkx.class, rkxVar);
    }

    public rkx() {
        inx inxVar = inx.d;
        this.zzf = inxVar;
        this.zzg = inxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", x2i.n, "zzf", ljx.class, "zzg", ljx.class, "zzh"});
        }
        if (i2 == 3) {
            return new rkx();
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
