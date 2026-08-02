package defpackage;

/* loaded from: classes.dex */
public final class gkx extends jmx {
    private static final gkx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private rmx zzg;
    private rmx zzh;

    static {
        gkx gkxVar = new gkx();
        zzb = gkxVar;
        jmx.f(gkx.class, gkxVar);
    }

    public gkx() {
        inx inxVar = inx.d;
        this.zzg = inxVar;
        this.zzh = inxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", aaw.i, "zzf", "zzg", ekx.class, "zzh", fkx.class});
        }
        if (i2 == 3) {
            return new gkx();
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
