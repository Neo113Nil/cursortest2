package defpackage;

/* loaded from: classes.dex */
public final class aax extends mcx {
    private static final aax zzb;
    private int zzd;
    private fax zze;
    private fax zzf;
    private int zzg;

    static {
        aax aaxVar = new aax();
        zzb = aaxVar;
        mcx.k(aax.class, aaxVar);
    }

    public static y9x n() {
        return (y9x) zzb.f();
    }

    public static /* synthetic */ void o(aax aaxVar, fax faxVar) {
        aaxVar.zze = faxVar;
        aaxVar.zzd |= 1;
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", jax.b});
        }
        if (i2 == 3) {
            return new aax();
        }
        if (i2 == 4) {
            return new y9x(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
