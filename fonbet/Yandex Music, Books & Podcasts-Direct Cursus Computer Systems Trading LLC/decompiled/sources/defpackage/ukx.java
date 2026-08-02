package defpackage;

/* loaded from: classes.dex */
public final class ukx extends jmx {
    private static final ukx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzh;
    private long zzj;
    private pmx zzg = kmx.d;
    private rmx zzi = inx.d;

    static {
        ukx ukxVar = new ukx();
        zzb = ukxVar;
        jmx.f(ukx.class, ukxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zzd", "zze", ogp.o, "zzf", ofc.m, "zzg", ovn.m, "zzh", aaw.h, "zzi", tkx.class, "zzj"});
        }
        if (i2 == 3) {
            return new ukx();
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
