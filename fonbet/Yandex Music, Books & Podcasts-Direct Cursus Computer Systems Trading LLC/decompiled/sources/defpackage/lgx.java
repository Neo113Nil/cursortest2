package defpackage;

/* loaded from: classes.dex */
public final class lgx extends mcx {
    private static final lgx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        lgx lgxVar = new lgx();
        zzb = lgxVar;
        mcx.k(lgx.class, lgxVar);
    }

    public static /* synthetic */ void n(lgx lgxVar) {
        lgxVar.zzd |= 2;
        lgxVar.zzf = true;
    }

    public static kgx o() {
        return (kgx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new lgx();
        }
        if (i2 == 4) {
            return new kgx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
