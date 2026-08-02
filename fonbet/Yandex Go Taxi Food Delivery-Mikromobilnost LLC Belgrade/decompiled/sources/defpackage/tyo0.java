package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.tariffcard.ui.view.MarginCardDivider;
import com.yandex.mapkit.navigation.JamType;
import com.yandex.mapkit.navigation.JamTypeColor;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class tyo0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ tyo0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onItemSelectedListener$lambda$0;
        Object obj2;
        zy11 json$lambda$1;
        int i = this.a;
        int i2 = 9;
        int i3 = 2;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Boolean.valueOf(((qyo0) obj) instanceof oyo0);
            case 1:
                ((e7n0) obj).b.invoke();
                return zy11Var;
            case 2:
                ((e7n0) obj).c.invoke();
                return zy11Var;
            case 3:
                ((f0p0) obj).N0();
                return zy11Var;
            case 4:
                ((g7n0) obj).a.invoke();
                return zy11Var;
            case 5:
                ((g7n0) obj).b.invoke();
                return zy11Var;
            case 6:
                l4p0 l4p0Var = (l4p0) obj;
                m4p0 m4p0Var = l4p0Var.a;
                m4p0Var.z((m950) m4p0Var.F.get(), new hym0(m4p0Var, l4p0Var.b, i4));
                return zy11Var;
            case 7:
                return Pattern.quote((String) obj);
            case 8:
                return new oip0(((Integer) obj).intValue());
            case 9:
                jwd0 jwd0Var = (jwd0) obj;
                if (jwd0Var != null && jwd0Var.a == 2) {
                    r5 = true;
                }
                return Boolean.valueOf(!r5);
            case 10:
                c2n0 c2n0Var = ((mit0) obj).a;
                c2n0Var.r(new qu(i2));
                ((lit0) c2n0Var.F).invoke();
                return zy11Var;
            case 11:
                c2n0 c2n0Var2 = ((nit0) obj).a;
                c2n0Var2.r(new qu(i2));
                ((gas0) c2n0Var2.F).invoke();
                return zy11Var;
            case 12:
                return Long.valueOf(((wtp0) obj) instanceof utp0 ? 0L : 600L);
            case 13:
                return ((mjy) obj).a;
            case 14:
                return obj;
            case 15:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMarginStart(tje.r(mrg0.go_design_s_space, listItemComponent.getContext()));
                marginLayoutParams.setMarginEnd(tje.r(mrg0.go_design_s_space, listItemComponent.getContext()));
                listItemComponent.setLayoutParams(marginLayoutParams);
                listItemComponent.setMinimumHeight(tje.u(1, listItemComponent.getContext()));
                listItemComponent.setVerticalPadding(tje.u(0, listItemComponent.getContext()));
                listItemComponent.setTitleEllipsizeMode(1);
                listItemComponent.setTitleTextColor(qje.t(xng0.textMinor, listItemComponent.getContext()));
                listItemComponent.setTitleTypeface(3);
                float u = tje.u(6, listItemComponent.getContext());
                listItemComponent.setRoundedShape(qje.t(xng0.bgMinor, listItemComponent.getContext()), u, u, u, u);
                return listItemComponent;
            case 16:
                return new ad6((ListItemComponent) obj, i3);
            case 17:
                return new CardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 18:
                return new MarginCardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 19:
                return new w9r0((CardDivider) obj, 1);
            case 20:
                onItemSelectedListener$lambda$0 = SegmentedControlView.onItemSelectedListener$lambda$0(((Integer) obj).intValue());
                return onItemSelectedListener$lambda$0;
            case 21:
                obj2 = ((twr) obj).a;
                return obj2;
            case 22:
                return ((yy51) obj).a;
            case 23:
                kgx[] kgxVarArr = f.a;
                ((mnq0) obj).a(d.e, zy11Var);
                return zy11Var;
            case 24:
                json$lambda$1 = SelectedPaymentMethodPayload.json$lambda$1((acx) obj);
                return json$lambda$1;
            case 25:
                return Boolean.valueOf(((JamTypeColor) obj).getJamType() == JamType.UNKNOWN);
            case 26:
                wu60 wu60Var = (wu60) obj;
                long j = wu60Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new pj2(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (wu60Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) : vkq0.a;
            case 27:
                pj2 pj2Var = (pj2) obj;
                return new wu60((Float.floatToRawIntBits(pj2Var.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(pj2Var.a) << 32));
            case 28:
                return new zkq0(((Long) obj).longValue());
            default:
                return new fmq0((puz0) obj);
        }
    }
}
