package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class yj50 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ int c;

    public /* synthetic */ yj50(int i, int i2, tls tlsVar) {
        this.a = i2;
        this.b = tlsVar;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    tlsVar.invoke(new nep(i2));
                    break;
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                tlsVar.invoke(Integer.valueOf(i2 + 1));
                break;
            default:
                tlsVar.invoke(Integer.valueOf(((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i2));
                break;
        }
        return zy11Var;
    }
}
