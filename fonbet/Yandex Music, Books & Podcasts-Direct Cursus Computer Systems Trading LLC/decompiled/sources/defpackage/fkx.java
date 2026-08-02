package defpackage;

/* loaded from: classes.dex */
public final class fkx extends jmx {
    private static final fkx zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private rmx zzg;
    private rmx zzh;
    private rmx zzi;

    static {
        fkx fkxVar = new fkx();
        zzb = fkxVar;
        jmx.f(fkx.class, fkxVar);
    }

    public fkx() {
        inx inxVar = inx.d;
        this.zzg = inxVar;
        this.zzh = inxVar;
        this.zzi = inxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"zzd", "zze", y9w.j, "zzf", "zzg", bkx.class, "zzh", qhx.class, "zzi", ekx.class});
        }
        if (i2 == 3) {
            return new fkx();
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
