package defpackage;

/* loaded from: classes.dex */
public final class aix extends jmx {
    private static final aix zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        aix aixVar = new aix();
        zzb = aixVar;
        jmx.f(aix.class, aixVar);
    }

    public static zhx m() {
        return (zhx) zzb.k();
    }

    public static /* synthetic */ void n(aix aixVar, int i) {
        aixVar.zzd |= 2;
        aixVar.zzf = i;
    }

    public static /* synthetic */ void o(aix aixVar, int i) {
        aixVar.zze = i - 1;
        aixVar.zzd |= 1;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", rre.o, "zzf"});
        }
        if (i2 == 3) {
            return new aix();
        }
        if (i2 == 4) {
            return new zhx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
