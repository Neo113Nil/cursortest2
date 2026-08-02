package defpackage;

/* loaded from: classes.dex */
public final class cgx extends mcx {
    private static final cgx zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        cgx cgxVar = new cgx();
        zzb = cgxVar;
        mcx.k(cgx.class, cgxVar);
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", jax.h, "zzf"});
        }
        if (i2 == 3) {
            return new cgx();
        }
        if (i2 == 4) {
            return new nfx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
