package defpackage;

/* loaded from: classes.dex */
public final class shx extends jmx {
    private static final shx zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        shx shxVar = new shx();
        zzb = shxVar;
        jmx.f(shx.class, shxVar);
    }

    public static rhx m() {
        return (rhx) zzb.k();
    }

    public static /* synthetic */ void n(shx shxVar, int i) {
        shxVar.zzd |= 2;
        shxVar.zzf = i;
    }

    public static /* synthetic */ void o(shx shxVar, int i) {
        shxVar.zze = i - 1;
        shxVar.zzd |= 1;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", hs4.p, "zzf"});
        }
        if (i2 == 3) {
            return new shx();
        }
        if (i2 == 4) {
            return new rhx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
