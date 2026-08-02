package defpackage;

/* loaded from: classes.dex */
public final class vkx extends jmx {
    private static final vkx zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private wkx zzh;

    static {
        vkx vkxVar = new vkx();
        zzb = vkxVar;
        jmx.f(vkx.class, vkxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new vkx();
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
