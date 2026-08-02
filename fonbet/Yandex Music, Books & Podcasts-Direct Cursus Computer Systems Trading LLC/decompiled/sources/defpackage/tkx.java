package defpackage;

/* loaded from: classes.dex */
public final class tkx extends jmx {
    private static final tkx zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        tkx tkxVar = new tkx();
        zzb = tkxVar;
        jmx.f(tkx.class, tkxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", ogp.o, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new tkx();
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
