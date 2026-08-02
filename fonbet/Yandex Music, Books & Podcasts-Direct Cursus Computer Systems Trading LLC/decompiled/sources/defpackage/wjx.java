package defpackage;

/* loaded from: classes.dex */
public final class wjx extends jmx {
    private static final wjx zzb;
    private int zzd;
    private mix zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private rmx zzk = inx.d;

    static {
        wjx wjxVar = new wjx();
        zzb = wjxVar;
        jmx.f(wjx.class, wjxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", e3s.l, "zzg", wvo.k, "zzh", ofc.m, "zzi", gos.n, "zzj", "zzk", mix.class});
        }
        if (i2 == 3) {
            return new wjx();
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
