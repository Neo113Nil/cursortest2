package defpackage;

/* loaded from: classes.dex */
public final class bgx extends mcx {
    private static final bgx zzb;
    private int zzd;
    private int zze;

    static {
        bgx bgxVar = new bgx();
        zzb = bgxVar;
        mcx.k(bgx.class, bgxVar);
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", jax.g});
        }
        if (i2 == 3) {
            return new bgx();
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
