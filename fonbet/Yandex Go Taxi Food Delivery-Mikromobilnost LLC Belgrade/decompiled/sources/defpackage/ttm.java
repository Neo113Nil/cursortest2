package defpackage;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.semantics.f;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public final /* synthetic */ class ttm implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ ttm(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                rzx rzxVar = (rzx) obj;
                if (oz40Var != null) {
                    oz40Var.setValue(Integer.valueOf((int) (rzxVar.e() >> 32)));
                    break;
                }
                break;
            case 1:
                rzx rzxVar2 = (rzx) obj;
                if (oz40Var != null) {
                    oz40Var.setValue(Integer.valueOf((int) (rzxVar2.e() >> 32)));
                    break;
                }
                break;
            case 2:
                int i3 = ((t6y) ((n6y) obj)).a;
                Integer num = (Integer) ((zgq0) oz40Var.getValue()).b;
                break;
            case 3:
                int i4 = ((t6y) ((n6y) obj)).a;
                Integer num2 = (Integer) ((zgq0) oz40Var.getValue()).a;
                break;
            case 4:
                oz40Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
            case 5:
                oz40Var.setValue(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 6:
                oz40Var.setValue(Integer.valueOf((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 7:
                ((Float) obj).floatValue();
                oz40Var.setValue(Boolean.TRUE);
                break;
            case 8:
                oz40Var.setValue((String) obj);
                break;
            case 9:
                oz40Var.setValue(Boolean.valueOf(((FocusStateImpl) ((ivr) obj)).b()));
                break;
            case 10:
                oz40Var.setValue((rzx) obj);
                break;
            case 11:
                long v = ((rzx) obj).v(0L);
                oz40Var.setValue(new z5w((m810.b(Float.intBitsToFloat((int) (v & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (m810.b(Float.intBitsToFloat((int) (v >> 32))) << 32)));
                break;
            case 12:
                oz40Var.setValue((String) obj);
                break;
            case 13:
                break;
            case 14:
                nzs.i(((rzx) obj).v(0L), oz40Var);
                break;
            case 15:
                oz40Var.setValue((String) obj);
                break;
            case 16:
                f.q((mnq0) obj, ((Boolean) oz40Var.getValue()).booleanValue());
                break;
            case 17:
                f.q((mnq0) obj, ((Boolean) oz40Var.getValue()).booleanValue());
                break;
            case 18:
                oz40Var.setValue(new k6w(((rzx) obj).e()));
                break;
            case 19:
                nzs.i(((rzx) obj).v(0L), oz40Var);
                break;
            case 20:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                oz40Var.setValue(bool);
                break;
            case 21:
                Float f = (Float) obj;
                f.getClass();
                break;
            case 22:
                oz40Var.setValue((ckq0) obj);
                break;
            case 23:
                oz40Var.setValue((rzx) obj);
                break;
            case 24:
                if (obj == null) {
                    obj = null;
                }
                if (obj != null) {
                    ((tls) oz40Var.getValue()).invoke(obj);
                    break;
                }
                break;
            case 25:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                oz40Var.setValue(bool2);
                break;
            case 26:
                nzs.i(((rzx) obj).v(0L), oz40Var);
                break;
            case 27:
                oz40Var.setValue((zii0) obj);
                break;
            case 28:
                oz40Var.setValue(new k6w(((k6w) obj).a));
                break;
            default:
                oz40Var.setValue(a.j0((List) oz40Var.getValue(), (tyx0) obj));
                break;
        }
        return zy11Var;
    }
}
