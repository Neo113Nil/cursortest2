package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final class z3e implements dzh, u9e0 {
    public final sls a;

    public /* synthetic */ z3e(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.u9e0
    public long a(f6w f6wVar, long j, LayoutDirection layoutDirection, long j2) {
        return (erb1.g(f6wVar.b + ((int) (r0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), true) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (erb1.g(f6wVar.a + ((int) (((z5w) this.a.invoke()).a >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr) << 32);
    }

    @Override // defpackage.dzh
    public void onDismiss() {
        this.a.invoke();
    }
}
