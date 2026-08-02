package defpackage;

/* loaded from: classes.dex */
public final class bkx extends jmx {
    private static final bkx zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        bkx bkxVar = new bkx();
        zzb = bkxVar;
        jmx.f(bkx.class, bkxVar);
    }

    public static akx m() {
        return (akx) zzb.k();
    }

    public static /* synthetic */ void n(bkx bkxVar, String str) {
        str.getClass();
        bkxVar.zzd |= 8;
        bkxVar.zzh = str;
    }

    public static /* synthetic */ void o(bkx bkxVar, String str) {
        str.getClass();
        bkxVar.zzd |= 16;
        bkxVar.zzi = str;
    }

    public static /* synthetic */ void p(bkx bkxVar, String str) {
        str.getClass();
        bkxVar.zzd |= 1;
        bkxVar.zze = str;
    }

    public static /* synthetic */ void q(bkx bkxVar, String str) {
        str.getClass();
        bkxVar.zzd |= 2;
        bkxVar.zzf = str;
    }

    public static /* synthetic */ void r(bkx bkxVar, String str) {
        str.getClass();
        bkxVar.zzd |= 4;
        bkxVar.zzg = str;
    }

    public static /* synthetic */ void s(bkx bkxVar, String str) {
        str.getClass();
        bkxVar.zzd |= 32;
        bkxVar.zzj = str;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new bkx();
        }
        if (i2 == 4) {
            return new akx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
