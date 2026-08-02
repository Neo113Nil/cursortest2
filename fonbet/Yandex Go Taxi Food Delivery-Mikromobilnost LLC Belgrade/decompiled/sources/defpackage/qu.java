package defpackage;

import com.yandex.go.payments.data.model.response.PersonalAccount;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.taxi.plus.sdk.badge.analytics.PlusHomeOpenReason;

/* loaded from: classes.dex */
public final /* synthetic */ class qu implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ qu(dm3 dm3Var) {
        this.a = 5;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PersonalAccount.ComplementAttributes complementAttributes;
        int i = this.a;
        boolean z = false;
        z = false;
        z = false;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                break;
            case 1:
                tly a = ((sly) obj).a();
                if (a != null && (r6 = a.f()) != null) {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.a.put("screen_type", qje.p(yaf0.b));
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                String openPlusHomeParamContext = PlusHomeOpenReason.DEEPLINK.getOpenPlusHomeParamContext();
                s3d0 s3d0Var = ((qn4) obj).a;
                s3d0Var.getClass();
                w2d0 w2d0Var = w2d0.f;
                s3d0Var.a(new qxx0(openPlusHomeParamContext, mo91.h(), null));
                break;
            case 8:
                break;
            case 9:
                ((sy60) obj).a();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 14:
                break;
            case 15:
                PersonalAccount personalAccount = (PersonalAccount) obj;
                if (personalAccount.h && (complementAttributes = personalAccount.i) != null && !((List) complementAttributes.d.getValue()).isEmpty()) {
                    z = true;
                }
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                dse dseVar = (dse) obj;
                if (dseVar instanceof jse) {
                    break;
                }
                break;
            case 19:
                break;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder v = oyr.v(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                v.append(value);
                break;
            case 21:
                irg irgVar = (irg) obj;
                ooc.b(irgVar, new tls[]{new dsg(z ? 1 : 0)}, new dsg(5));
                irgVar.d(new xd5(new isg(Padding.NONE)));
                ooc.b(irgVar, new tls[]{new dsg(6)}, new dsg(7));
                ooc.b(irgVar, new tls[]{new dsg(8)}, new qu(22));
                ooc.b(irgVar, new tls[]{new qu(23)}, new qu(24));
                ooc.b(irgVar, new tls[]{new qu(25)}, new qu(26));
                ooc.f(irgVar, HexString.CHAR_SPACE);
                mrg.p(irgVar);
                ooc.f(irgVar, ':');
                mrg.g(irgVar);
                ooc.v(irgVar, ":0", new dsg(i2));
                irgVar.b(" ");
                ooc.b(irgVar, new tls[]{new dsg(2), new dsg(3)}, new dsg(4));
                break;
            case 22:
                irg irgVar2 = (irg) obj;
                e eVar = e.b;
                irgVar2.getClass();
                irgVar2.d(new xd5(new d730(eVar)));
                break;
            case 23:
                ooc.f((irg) obj, LicenseUtility.SEPARATOR);
                break;
            case 24:
                ooc.f((irg) obj, HexString.CHAR_SPACE);
                break;
            case 25:
                irg irgVar3 = (irg) obj;
                irgVar3.getClass();
                irgVar3.d(new xd5(new wmi0()));
                break;
            case 26:
                org.k((irg) obj);
                break;
            case 27:
                irg irgVar4 = (irg) obj;
                cw21 cw21Var = (cw21) dw21.c.getValue();
                irgVar4.getClass();
                irgVar4.h(cw21Var.a);
                break;
            case 28:
                ooc.f((irg) obj, HexString.CHAR_COMMA);
                break;
            default:
                ((irg) obj).b(Extension.FIX_SPACE);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ qu(int i) {
        this.a = i;
    }
}
