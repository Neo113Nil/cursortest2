package defpackage;

/* loaded from: classes.dex */
public final class fax extends mcx {
    private static final fax zzb;
    private int zzd;
    private String zze = "";

    static {
        fax faxVar = new fax();
        zzb = faxVar;
        mcx.k(fax.class, faxVar);
    }

    public static eax n() {
        return (eax) zzb.f();
    }

    public static /* synthetic */ void o(fax faxVar, String str) {
        faxVar.zzd |= 1;
        faxVar.zze = str;
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new fax();
        }
        if (i2 == 4) {
            return new eax(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
