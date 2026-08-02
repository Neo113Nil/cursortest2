package defpackage;

/* loaded from: classes.dex */
public final class igx extends mcx {
    private static final igx zzb;
    private int zzd;
    private mfx zze;

    static {
        igx igxVar = new igx();
        zzb = igxVar;
        mcx.k(igx.class, igxVar);
    }

    public static /* synthetic */ void n(igx igxVar, mfx mfxVar) {
        igxVar.zze = mfxVar;
        igxVar.zzd |= 1;
    }

    public static hgx o() {
        return (hgx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new igx();
        }
        if (i2 == 4) {
            return new hgx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
