package defpackage;

/* loaded from: classes.dex */
public final class ofx extends mcx {
    private static final ofx zzb;

    static {
        ofx ofxVar = new ofx();
        zzb = ofxVar;
        mcx.k(ofx.class, ofxVar);
    }

    public static ofx n() {
        return zzb;
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new ofx();
        }
        if (i2 == 4) {
            return new nfx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
