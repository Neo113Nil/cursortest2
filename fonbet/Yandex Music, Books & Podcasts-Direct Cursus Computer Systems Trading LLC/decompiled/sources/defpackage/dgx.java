package defpackage;

/* loaded from: classes.dex */
public final class dgx extends mcx {
    private static final dgx zzb;
    private ucx zzd = gex.e;

    static {
        dgx dgxVar = new dgx();
        zzb = dgxVar;
        mcx.k(dgx.class, dgxVar);
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", cgx.class});
        }
        if (i2 == 3) {
            return new dgx();
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
