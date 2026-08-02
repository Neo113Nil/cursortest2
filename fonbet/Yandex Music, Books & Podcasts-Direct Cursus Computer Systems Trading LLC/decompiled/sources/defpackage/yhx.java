package defpackage;

/* loaded from: classes.dex */
public final class yhx extends jmx {
    private static final yhx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        yhx yhxVar = new yhx();
        zzb = yhxVar;
        jmx.f(yhx.class, yhxVar);
    }

    public static xhx m() {
        return (xhx) zzb.k();
    }

    public static /* synthetic */ void n(yhx yhxVar, int i) {
        yhxVar.zzd |= 2;
        yhxVar.zzf = i;
    }

    public static /* synthetic */ void o(yhx yhxVar, int i) {
        yhxVar.zzd |= 4;
        yhxVar.zzg = i;
    }

    public static /* synthetic */ void p(yhx yhxVar, int i) {
        yhxVar.zzd |= 8;
        yhxVar.zzh = i;
    }

    public static /* synthetic */ void q(yhx yhxVar, int i) {
        yhxVar.zze = i - 1;
        yhxVar.zzd |= 1;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", o6c.v, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new yhx();
        }
        if (i2 == 4) {
            return new xhx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
