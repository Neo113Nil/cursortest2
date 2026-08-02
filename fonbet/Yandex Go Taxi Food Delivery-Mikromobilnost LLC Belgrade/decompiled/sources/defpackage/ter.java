package defpackage;

import androidx.compose.ui.layout.o;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ter extends o {
    public final /* synthetic */ int y;

    public ter(int i, int i2, int i3) {
        this.y = i3;
        switch (i3) {
            case 1:
                y0((i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32));
                break;
            case 2:
                y0((i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32));
                break;
            default:
                y0((i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32));
                break;
        }
    }

    private final void A0(long j, float f, tls tlsVar) {
    }

    private final void C0(long j, float f, tls tlsVar) {
    }

    private final void E0(long j, float f, tls tlsVar) {
    }

    @Override // androidx.compose.ui.layout.o
    public final void s0(long j, float f, tls tlsVar) {
        int i = this.y;
    }

    @Override // defpackage.ca10
    public final int u(kt1 kt1Var) {
        switch (this.y) {
        }
        return Integer.MIN_VALUE;
    }
}
