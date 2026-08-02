package defpackage;

/* loaded from: classes.dex */
public final class ojx extends jmx {
    private static final ojx zzb;
    private int zzd;
    private rmx zze;
    private rmx zzf;
    private zjx zzg;

    static {
        ojx ojxVar = new ojx();
        zzb = ojxVar;
        jmx.f(ojx.class, ojxVar);
    }

    public ojx() {
        inx inxVar = inx.d;
        this.zze = inxVar;
        this.zzf = inxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", qkx.class, "zzf", kix.class, "zzg"});
        }
        if (i2 == 3) {
            return new ojx();
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
