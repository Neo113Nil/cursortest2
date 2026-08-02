package defpackage;

/* loaded from: classes.dex */
public final class mix extends jmx {
    private static final mix zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        mix mixVar = new mix();
        zzb = mixVar;
        jmx.f(mix.class, mixVar);
    }

    public static lix m() {
        return (lix) zzb.k();
    }

    public static /* synthetic */ void n(mix mixVar, String str) {
        str.getClass();
        mixVar.zzd |= 1;
        mixVar.zze = str;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new mix();
        }
        if (i2 == 4) {
            return new lix(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
