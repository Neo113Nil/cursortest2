package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.semantics.f;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public final /* synthetic */ class w5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ w5(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue((Drawable) obj);
                break;
            case 1:
                oz40Var.setValue(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oz40Var.setValue(bool);
                break;
            case 3:
                oz40Var.setValue(null);
                break;
            case 4:
                oz40Var.setValue(null);
                break;
            case 5:
                oz40Var.setValue(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                oz40Var.setValue((rzx) obj);
                break;
            case 9:
                oz40Var.setValue((String) obj);
                break;
            case 10:
                oz40Var.setValue((rzx) obj);
                break;
            case 11:
                xjy0 xjy0Var = (xjy0) obj;
                oz40Var.setValue(xjy0Var.c ? xjy0Var.b : xjy0Var.a);
                break;
            case 12:
                List list = (List) obj;
                if (oz40Var != null) {
                    oz40Var.setValue(list);
                    break;
                }
                break;
            case 13:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 14:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (r10.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 15:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 16:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 17:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (r10.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 18:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 19:
                oz40Var.setValue((String) obj);
                break;
            case 20:
                oz40Var.setValue(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 21:
                oz40Var.setValue(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 22:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.f(mnq0Var, null, new w01(6, oz40Var));
                break;
            case 23:
                ((tls) oz40Var.getValue()).invoke((List) obj);
                break;
            case 24:
                Float f = (Float) obj;
                f.getClass();
                ((tls) oz40Var.getValue()).invoke(f);
                break;
            case 25:
                oz40Var.setValue(new y7m(((y7m) obj).a));
                break;
            case 26:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).m(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 27:
                oz40Var.setValue(Boolean.valueOf(((FocusStateImpl) ((ivr) obj)).b()));
                break;
            case 28:
                oz40Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((rzx) obj).m(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            default:
                rzx rzxVar = (rzx) obj;
                if (oz40Var != null) {
                    oz40Var.setValue(Integer.valueOf((int) (rzxVar.e() >> 32)));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
