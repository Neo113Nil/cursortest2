package defpackage;

/* loaded from: classes.dex */
public final class ygx extends jmx {
    private static final ygx zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        ygx ygxVar = new ygx();
        zzb = ygxVar;
        jmx.f(ygx.class, ygxVar);
    }

    public static xgx m() {
        return (xgx) zzb.k();
    }

    public static /* synthetic */ void n(ygx ygxVar, String str) {
        str.getClass();
        ygxVar.zzd |= 1;
        ygxVar.zze = str;
    }

    public static /* synthetic */ void o(ygx ygxVar, String str) {
        str.getClass();
        ygxVar.zzd |= 2;
        ygxVar.zzf = str;
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
            return new ygx();
        }
        if (i2 == 4) {
            return new xgx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
