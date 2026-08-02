package defpackage;

/* loaded from: classes.dex */
public final class qhx extends jmx {
    private static final qhx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        qhx qhxVar = new qhx();
        zzb = qhxVar;
        jmx.f(qhx.class, qhxVar);
    }

    public static phx m() {
        return (phx) zzb.k();
    }

    public static /* synthetic */ void n(qhx qhxVar, int i) {
        qhxVar.zzd |= 16;
        qhxVar.zzi = i;
    }

    public static /* synthetic */ void o(qhx qhxVar, int i) {
        qhxVar.zzd |= 2;
        qhxVar.zzf = i;
    }

    public static /* synthetic */ void p(qhx qhxVar, int i) {
        qhxVar.zzd |= 8;
        qhxVar.zzh = i;
    }

    public static /* synthetic */ void q(qhx qhxVar, int i) {
        qhxVar.zzd |= 4;
        qhxVar.zzg = i;
    }

    public static /* synthetic */ void r(qhx qhxVar, int i) {
        qhxVar.zze = i - 1;
        qhxVar.zzd |= 1;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", bs4.o, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new qhx();
        }
        if (i2 == 4) {
            return new phx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
