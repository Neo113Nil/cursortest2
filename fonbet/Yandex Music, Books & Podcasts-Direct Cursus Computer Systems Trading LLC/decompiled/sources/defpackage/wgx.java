package defpackage;

/* loaded from: classes.dex */
public final class wgx extends jmx {
    private static final wgx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private rmx zzi;
    private rmx zzj;
    private String zzk;

    static {
        wgx wgxVar = new wgx();
        zzb = wgxVar;
        jmx.f(wgx.class, wgxVar);
    }

    public wgx() {
        inx inxVar = inx.d;
        this.zzi = inxVar;
        this.zzj = inxVar;
        this.zzk = "";
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", rwd.j, "zzf", "zzg", ofc.m, "zzh", "zzi", ljx.class, "zzj", ljx.class, "zzk"});
        }
        if (i2 == 3) {
            return new wgx();
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
