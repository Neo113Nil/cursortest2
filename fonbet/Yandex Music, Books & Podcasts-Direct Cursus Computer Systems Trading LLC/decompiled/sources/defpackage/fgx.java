package defpackage;

/* loaded from: classes.dex */
public final class fgx extends mcx {
    private static final fgx zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private sfx zzg;
    private tfx zzh;

    static {
        fgx fgxVar = new fgx();
        zzb = fgxVar;
        mcx.k(fgx.class, fgxVar);
    }

    public static /* synthetic */ void n(fgx fgxVar, bfx bfxVar) {
        fgxVar.zzf = bfxVar;
        fgxVar.zze = 2;
    }

    public static /* synthetic */ void o(fgx fgxVar, kfx kfxVar) {
        fgxVar.zzf = kfxVar;
        fgxVar.zze = 3;
    }

    public static /* synthetic */ void p(fgx fgxVar, ofx ofxVar) {
        ofxVar.getClass();
        fgxVar.zzf = ofxVar;
        fgxVar.zze = 7;
    }

    public static /* synthetic */ void q(fgx fgxVar, sfx sfxVar) {
        sfxVar.getClass();
        fgxVar.zzg = sfxVar;
        fgxVar.zzd |= 1;
    }

    public static /* synthetic */ void r(fgx fgxVar, igx igxVar) {
        fgxVar.zzf = igxVar;
        fgxVar.zze = 8;
    }

    public static /* synthetic */ void s(fgx fgxVar, jgx jgxVar) {
        fgxVar.zzf = jgxVar;
        fgxVar.zze = 4;
    }

    public static egx t() {
        return (egx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", bfx.class, kfx.class, jgx.class, qfx.class, "zzh", ofx.class, igx.class});
        }
        if (i2 == 3) {
            return new fgx();
        }
        if (i2 == 4) {
            return new egx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
