package defpackage;

/* loaded from: classes.dex */
public final class djx extends jmx {
    private static final djx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        djx djxVar = new djx();
        zzb = djxVar;
        jmx.f(djx.class, djxVar);
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", imp.m, "zzf", "zzg", d51.o});
        }
        if (i2 == 3) {
            return new djx();
        }
        if (i2 == 4) {
            return new tdx(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = jmxVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
