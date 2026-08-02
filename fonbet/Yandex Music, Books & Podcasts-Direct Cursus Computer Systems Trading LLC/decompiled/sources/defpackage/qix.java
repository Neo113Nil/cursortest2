package defpackage;

/* loaded from: classes.dex */
public final class qix extends jmx {
    private static final qix zzb;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private ukx zzh;
    private boolean zzi;
    private long zzk;
    private long zzl;
    private String zze = "";
    private pmx zzj = kmx.d;

    static {
        qix qixVar = new qix();
        zzb = qixVar;
        jmx.f(qix.class, qixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzd", "zze", "zzf", "zzh", "zzi", "zzj", ovn.m, "zzg", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new qix();
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
