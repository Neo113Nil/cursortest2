package defpackage;

/* loaded from: classes.dex */
public final class dox extends jmx {
    private static final dox zzb;
    private rmx zzd;
    private rmx zze;
    private rmx zzf;
    private rmx zzg;

    static {
        dox doxVar = new dox();
        zzb = doxVar;
        jmx.f(dox.class, doxVar);
    }

    public dox() {
        inx inxVar = inx.d;
        this.zzd = inxVar;
        this.zze = inxVar;
        this.zzf = inxVar;
        this.zzg = inxVar;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzd", cox.class, "zze", box.class, "zzf", cox.class, "zzg", box.class});
        }
        if (i2 == 3) {
            return new dox();
        }
        if (i2 == 4) {
            return new jjx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
