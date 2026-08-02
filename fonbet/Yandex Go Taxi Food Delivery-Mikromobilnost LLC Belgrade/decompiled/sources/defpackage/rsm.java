package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class rsm implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ rsm(oz40 oz40Var, oz40 oz40Var2, int i) {
        this.a = i;
        this.b = oz40Var;
        this.c = oz40Var2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i;
        int i2 = this.a;
        oz40 oz40Var = this.c;
        oz40 oz40Var2 = this.b;
        switch (i2) {
            case 0:
                return Float.valueOf(Math.abs(((Number) oz40Var2.getValue()).floatValue() - ((Number) oz40Var.getValue()).floatValue()));
            case 1:
                return Float.valueOf(((Number) ((sls) oz40Var2.getValue()).invoke()).floatValue() / (((Number) oz40Var.getValue()).floatValue() / 1000.0f));
            case 2:
                oz40Var2.setValue(new y7m(48.0f));
                oz40Var.setValue(Boolean.TRUE);
                return zy11.a;
            default:
                if (oz40Var2.getValue() == null || oz40Var.getValue() == null) {
                    i = 0;
                } else {
                    long mo43localToScreenMKHz9U = ((rzx) oz40Var2.getValue()).mo43localToScreenMKHz9U(0L);
                    long j = ((wu60) oz40Var.getValue()).a;
                    i = Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (mo43localToScreenMKHz9U >> 32)) ? Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < Float.intBitsToFloat((int) (mo43localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) ? 1 : 3 : Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < Float.intBitsToFloat((int) (mo43localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) ? 2 : 4;
                }
                return Integer.valueOf(i);
        }
    }
}
