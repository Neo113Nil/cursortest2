package defpackage;

/* loaded from: classes.dex */
public final class rix extends jmx {
    private static final rix zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private pmx zzg;
    private pmx zzh;
    private rmx zzi;
    private rmx zzj;
    private int zzk;

    static {
        rix rixVar = new rix();
        zzb = rixVar;
        jmx.f(rix.class, rixVar);
    }

    public rix() {
        kmx kmxVar = kmx.d;
        this.zzg = kmxVar;
        this.zzh = kmxVar;
        inx inxVar = inx.d;
        this.zzi = inxVar;
        this.zzj = inxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", b3i.m, "zzg", "zzh", "zzi", "zzj", "zzk", ofc.m});
        }
        if (i2 == 3) {
            return new rix();
        }
        if (i2 == 4) {
            return new tdx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
