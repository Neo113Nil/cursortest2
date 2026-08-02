package defpackage;

/* loaded from: classes.dex */
public final class ggx extends mcx {
    private static final ggx zzb;
    private int zzd;
    private int zzf;
    private ucx zze = gex.e;
    private String zzg = "";

    static {
        ggx ggxVar = new ggx();
        zzb = ggxVar;
        mcx.k(ggx.class, ggxVar);
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ggx();
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
