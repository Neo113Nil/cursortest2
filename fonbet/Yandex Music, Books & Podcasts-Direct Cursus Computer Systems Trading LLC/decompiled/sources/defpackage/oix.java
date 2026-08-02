package defpackage;

/* loaded from: classes.dex */
public final class oix extends jmx {
    private static final oix zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private rmx zzh = inx.d;

    static {
        oix oixVar = new oix();
        zzb = oixVar;
        jmx.f(oix.class, oixVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", nix.class});
        }
        if (i2 == 3) {
            return new oix();
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
