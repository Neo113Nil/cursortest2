package defpackage;

/* loaded from: classes.dex */
public final class sgx extends jmx {
    private static final sgx zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private pmx zzg = kmx.d;

    static {
        sgx sgxVar = new sgx();
        zzb = sgxVar;
        jmx.f(sgx.class, sgxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zzd", "zze", "zzf", "zzg", imp.n});
        }
        if (i2 == 3) {
            return new sgx();
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
