package defpackage;

/* loaded from: classes.dex */
public final class yjx extends jmx {
    private static final yjx zzb;
    private int zzd;
    private String zze = "";
    private rmx zzf;
    private rmx zzg;
    private boolean zzh;

    static {
        yjx yjxVar = new yjx();
        zzb = yjxVar;
        jmx.f(yjx.class, yjxVar);
    }

    public yjx() {
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
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", tix.class, "zzg", mix.class, "zzh"});
        }
        if (i2 == 3) {
            return new yjx();
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
