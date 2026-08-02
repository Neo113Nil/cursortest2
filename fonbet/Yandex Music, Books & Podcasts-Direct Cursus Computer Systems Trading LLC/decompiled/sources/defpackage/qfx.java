package defpackage;

/* loaded from: classes.dex */
public final class qfx extends mcx {
    private static final qfx zzb;
    private int zzd;
    private int zzf;
    private mfx zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private rcx zzg = ncx.e;
    private ucx zzh = gex.e;

    static {
        qfx qfxVar = new qfx();
        zzb = qfxVar;
        mcx.k(qfx.class, qfxVar);
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", jax.f, "zzg", jax.e, "zzh", ggx.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new qfx();
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
