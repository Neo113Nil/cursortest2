package defpackage;

/* loaded from: classes.dex */
public final class uhx extends jmx {
    private static final uhx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;

    static {
        uhx uhxVar = new uhx();
        zzb = uhxVar;
        jmx.f(uhx.class, uhxVar);
    }

    public static thx m() {
        return (thx) zzb.k();
    }

    public static /* synthetic */ void n(uhx uhxVar, boolean z) {
        uhxVar.zzd |= 8;
        uhxVar.zzh = z;
    }

    public static /* synthetic */ void o(uhx uhxVar, int i) {
        uhxVar.zzd |= 4;
        uhxVar.zzg = i;
    }

    public static /* synthetic */ void p(uhx uhxVar, long j) {
        uhxVar.zzd |= 16;
        uhxVar.zzi = j;
    }

    public static /* synthetic */ void q(uhx uhxVar, int i) {
        uhxVar.zzd |= 2;
        uhxVar.zzf = i;
    }

    public static /* synthetic */ void r(uhx uhxVar, int i) {
        uhxVar.zze = i - 1;
        uhxVar.zzd |= 1;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", b2c.z, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new uhx();
        }
        if (i2 == 4) {
            return new thx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
