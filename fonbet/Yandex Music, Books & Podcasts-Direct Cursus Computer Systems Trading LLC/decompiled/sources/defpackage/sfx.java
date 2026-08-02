package defpackage;

/* loaded from: classes.dex */
public final class sfx extends mcx {
    private static final sfx zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        sfx sfxVar = new sfx();
        zzb = sfxVar;
        mcx.k(sfx.class, sfxVar);
    }

    public static /* synthetic */ void n(sfx sfxVar, int i) {
        sfxVar.zzd |= 4;
        sfxVar.zzg = i;
    }

    public static /* synthetic */ void o(sfx sfxVar, long j) {
        sfxVar.zzd |= 8;
        sfxVar.zzh = j;
    }

    public static /* synthetic */ void p(sfx sfxVar, String str) {
        str.getClass();
        sfxVar.zzd |= 2;
        sfxVar.zzf = str;
    }

    public static /* synthetic */ void q(sfx sfxVar, String str) {
        str.getClass();
        sfxVar.zzd |= 1;
        sfxVar.zze = str;
    }

    public static rfx r() {
        return (rfx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new sfx();
        }
        if (i2 == 4) {
            return new rfx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
