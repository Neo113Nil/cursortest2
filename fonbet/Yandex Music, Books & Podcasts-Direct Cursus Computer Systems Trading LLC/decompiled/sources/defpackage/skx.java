package defpackage;

/* loaded from: classes.dex */
public final class skx extends jmx {
    private static final skx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private rmx zzg;
    private rmx zzh;
    private int zzi;
    private pmx zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        skx skxVar = new skx();
        zzb = skxVar;
        jmx.f(skx.class, skxVar);
    }

    public skx() {
        inx inxVar = inx.d;
        this.zzg = inxVar;
        this.zzh = inxVar;
        this.zzj = kmx.d;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            b3i b3iVar = b3i.n;
            return new jnx(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006ࠬ\u0007ဇ\u0003\bဇ\u0004", new Object[]{"zzd", "zze", b3iVar, "zzf", mvn.m, "zzg", mix.class, "zzh", mix.class, "zzi", ofc.m, "zzj", b3iVar, "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new skx();
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
