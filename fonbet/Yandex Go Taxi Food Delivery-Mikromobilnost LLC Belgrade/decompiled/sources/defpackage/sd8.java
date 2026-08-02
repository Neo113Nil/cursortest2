package defpackage;

import androidx.compose.animation.i;
import androidx.compose.animation.k;
import com.yandex.payment.sdk.ui.view.CardNumberView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.ybsdk.feature.card.internal.network.dto.SetPeriodLimitsResponse;
import com.ybsdk.feature.card.internal.network.dto.YbCardDetailsResponse;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.settings.api.data.SettingDto;
import com.ybsdk.feature.settings.internal.network.dto.card.CardSetSettingsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;

/* loaded from: classes3.dex */
public final /* synthetic */ class sd8 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ sd8(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        stz0 viewBinding$lambda$27$lambda$26$lambda$25;
        zy11 viewBinding$lambda$27$lambda$19;
        zy11 viewBinding$lambda$27$lambda$22;
        stz0 viewBinding$lambda$6$lambda$4;
        zy11 onFinish$lambda$0;
        zy11 eventListener$lambda$0;
        zy11 callback$lambda$0;
        zy11 inputEventListener$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                viewBinding$lambda$27$lambda$26$lambda$25 = CardDetailsFragment.getViewBinding$lambda$27$lambda$26$lambda$25((stz0) obj);
                return viewBinding$lambda$27$lambda$26$lambda$25;
            case 1:
                viewBinding$lambda$27$lambda$19 = CardDetailsFragment.getViewBinding$lambda$27$lambda$19((n70) obj);
                return viewBinding$lambda$27$lambda$19;
            case 2:
                viewBinding$lambda$27$lambda$22 = CardDetailsFragment.getViewBinding$lambda$27$lambda$22((n70) obj);
                return viewBinding$lambda$27$lambda$22;
            case 3:
                Object value = ((Result) obj).getValue();
                return Boolean.valueOf((value instanceof Result.Failure ? null : value) instanceof zxp0);
            case 4:
                ae8 ae8Var = (ae8) obj;
                if (ae8Var instanceof zd8) {
                    return (zd8) ae8Var;
                }
                return null;
            case 5:
                return ((zd8) obj).b;
            case 6:
                return Boolean.valueOf(((gq51) obj).k != null);
            case 7:
                return new pbv((String) obj, new ccv(zxg0.ybsdk_card_skeleton), rev.f, (dcv) null, (vfv) null, 24);
            case 8:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 9:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 10:
                viewBinding$lambda$6$lambda$4 = CardLimitFragment.getViewBinding$lambda$6$lambda$4((stz0) obj);
                return viewBinding$lambda$6$lambda$4;
            case 11:
                Object value2 = ((Result) obj).getValue();
                if (value2 instanceof Result.Failure) {
                    value2 = null;
                }
                iyd0 iyd0Var = (iyd0) value2;
                return Boolean.valueOf((iyd0Var != null ? (ayp0) iyd0Var.a : null) instanceof zxp0);
            case 12:
                SetPeriodLimitsResponse setPeriodLimitsResponse = (SetPeriodLimitsResponse) obj;
                int i2 = si8.a[setPeriodLimitsResponse.getStatus().ordinal()];
                if (i2 == 1) {
                    return fgy.a;
                }
                if (i2 == 2) {
                    return egy.a;
                }
                if (i2 == 3) {
                    return new dgy(setPeriodLimitsResponse.getErrorText());
                }
                w511.b();
                return null;
            case 13:
                onFinish$lambda$0 = CardNumberInput.onFinish$lambda$0(((Boolean) obj).booleanValue());
                return onFinish$lambda$0;
            case 14:
                eventListener$lambda$0 = CardNumberInput.eventListener$lambda$0((czv) obj);
                return eventListener$lambda$0;
            case 15:
                callback$lambda$0 = CardNumberView.callback$lambda$0((String) obj);
                return callback$lambda$0;
            case 16:
                inputEventListener$lambda$0 = CardNumberView.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$0;
            case 17:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 18:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 19:
                YbCardDetailsResponse ybCardDetailsResponse = (YbCardDetailsResponse) obj;
                return new aq51(ybCardDetailsResponse.getNumber(), ybCardDetailsResponse.getCvv());
            case 20:
                YbCardDetailsResponse ybCardDetailsResponse2 = (YbCardDetailsResponse) obj;
                return new aq51(ybCardDetailsResponse2.getNumber(), ybCardDetailsResponse2.getCvv());
            case 21:
                Object value3 = ((Result) obj).getValue();
                return Boolean.valueOf((value3 instanceof Result.Failure ? null : value3) instanceof rk11);
            case 22:
                return new pbv((String) obj, (ccv) null, rev.d, (dcv) null, (vfv) null, 58);
            case 23:
                List<SettingDto> settings = ((CardSetSettingsResponse) obj).getSettings();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = settings.iterator();
                while (it.hasNext()) {
                    o8r0 a = j9r0.a((SettingDto) it.next(), null);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                return arrayList;
            case 24:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 25:
                return new i(k.e(null, 3), k.f(null, 3));
            case 26:
                return qoi0.a(((rs8) obj).getClass());
            case 27:
                acx acxVar = (acx) obj;
                acxVar.a = true;
                acxVar.c = true;
                acxVar.b = false;
                return zy11Var;
            case 28:
                Map.Entry entry = (Map.Entry) obj;
                return g8e.p((String) entry.getKey(), "=", (String) entry.getValue());
            default:
                ((sy60) obj).a();
                return zy11Var;
        }
    }
}
