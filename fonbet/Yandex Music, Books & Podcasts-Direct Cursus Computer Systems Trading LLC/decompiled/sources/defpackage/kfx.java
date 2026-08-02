package defpackage;

/* loaded from: classes.dex */
public final class kfx extends mcx {
    private static final kfx zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        kfx kfxVar = new kfx();
        zzb = kfxVar;
        mcx.k(kfx.class, kfxVar);
    }

    public static /* synthetic */ void n(kfx kfxVar, lgx lgxVar) {
        kfxVar.zzf = lgxVar;
        kfxVar.zze = 3;
    }

    public static /* synthetic */ void o(kfx kfxVar, int i) {
        kfxVar.zzg = i - 1;
        kfxVar.zzd |= 1;
    }

    public static jfx p() {
        return (jfx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", jax.c, bgx.class, lgx.class, dgx.class});
        }
        if (i2 == 3) {
            return new kfx();
        }
        if (i2 == 4) {
            return new jfx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
