package defpackage;

import android.view.ViewGroup;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.surge.dialog.TextBlockView;

/* loaded from: classes3.dex */
public final /* synthetic */ class wnf0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ tls c;

    public /* synthetic */ wnf0(tls tlsVar, tls tlsVar2, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = tlsVar2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        tls tlsVar2 = this.b;
        switch (i) {
            case 0:
                tlsVar2.invoke(new q0s(tlsVar, ((Boolean) obj).booleanValue()));
                break;
            case 1:
                n70 n70Var = (n70) obj;
                ((r561) n70Var.N).a.setOnClickListener(new os3(4, n70Var, tlsVar2));
                n70Var.W(new ns3(n70Var, 8));
                n70Var.a0(new h4m0(0, n70Var, tlsVar));
                break;
            case 2:
                n70 n70Var2 = (n70) obj;
                ((d261) n70Var2.N).b.setActionHandler(tlsVar2);
                n70Var2.W(new ns3(n70Var2, 12));
                n70Var2.a0(new h4m0(5, n70Var2, tlsVar));
                break;
            case 3:
                n70 n70Var3 = (n70) obj;
                n70Var3.a0(new h4m0(6, n70Var3, tlsVar2));
                n70Var3.W(new ms3(3, n70Var3, tlsVar));
                break;
            case 4:
                break;
            case 5:
                TextBlockView textBlockView = new TextBlockView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                textBlockView.setBlockClickListener(tlsVar2);
                textBlockView.setOnSelectorClickListener(tlsVar);
                textBlockView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                break;
            case 6:
                rzx rzxVar = (rzx) obj;
                long mo43localToScreenMKHz9U = rzxVar.mo43localToScreenMKHz9U(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (mo43localToScreenMKHz9U >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (mo43localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                tlsVar2.invoke(new wu60((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                tlsVar.invoke(new k6w((((int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (rzxVar.e() >> 32)) << 32)));
                break;
            case 7:
                tyj0 tyj0Var = (tyj0) obj;
                if (!tyj0Var.c()) {
                    YSError ySError = tyj0Var.b;
                    c.b(ySError);
                    tlsVar.invoke(ySError);
                    break;
                } else {
                    tlsVar2.invoke(tyj0Var.a());
                    break;
                }
            case 8:
                break;
            case 9:
                n70 n70Var4 = (n70) obj;
                n70Var4.W(new zjy0(16, n70Var4, tlsVar2, tlsVar));
                break;
            case 10:
                tlsVar2.invoke(tlsVar.invoke(obj));
                break;
            default:
                tlsVar2.invoke(tlsVar.invoke(obj));
                break;
        }
        return zy11Var;
    }
}
