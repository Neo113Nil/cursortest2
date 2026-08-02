package defpackage;

/* loaded from: classes.dex */
public final class mfx extends mcx {
    private static final mfx zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        mfx mfxVar = new mfx();
        zzb = mfxVar;
        mcx.k(mfx.class, mfxVar);
    }

    public static /* synthetic */ void n(mfx mfxVar, String str) {
        mfxVar.zzd |= 8;
        mfxVar.zzh = str;
    }

    public static /* synthetic */ void o(mfx mfxVar, String str) {
        str.getClass();
        mfxVar.zzd |= 2;
        mfxVar.zzf = str;
    }

    public static /* synthetic */ void p(mfx mfxVar, int i) {
        mfxVar.zzd |= 1;
        mfxVar.zze = i;
    }

    public static /* synthetic */ void q(mfx mfxVar, int i) {
        mfxVar.zzg = i - 1;
        mfxVar.zzd |= 4;
    }

    public static lfx r() {
        return (lfx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", jax.d, "zzh"});
        }
        if (i2 == 3) {
            return new mfx();
        }
        if (i2 == 4) {
            return new lfx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
