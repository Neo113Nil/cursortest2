package defpackage;

import com.yandex.go.scooters.analytics.ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName;
import com.yandex.go.scooters.analytics.ScootersRideFeedbackAnalytics$Button;
import java.util.HashMap;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class rmn0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersFinishInfoModalView b;

    public /* synthetic */ rmn0(ScootersFinishInfoModalView scootersFinishInfoModalView, int i) {
        this.a = i;
        this.b = scootersFinishInfoModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 initFeedbackCard$lambda$3;
        zy11 initFeedbackCard$lambda$5;
        kmn0 kmn0Var;
        kmn0 kmn0Var2;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen;
        y1o0 y1o0Var;
        tls tlsVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        switch (i) {
            case 0:
                initFeedbackCard$lambda$3 = ScootersFinishInfoModalView.initFeedbackCard$lambda$3(scootersFinishInfoModalView, ((Integer) obj).intValue());
                break;
            case 1:
                initFeedbackCard$lambda$5 = ScootersFinishInfoModalView.initFeedbackCard$lambda$5(scootersFinishInfoModalView, (String) obj);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                kmn0Var = scootersFinishInfoModalView.scootersFinishInfoAnalytics;
                dln0 dln0Var = kmn0Var.a;
                ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName = ScootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName.PricingHeader;
                dln0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("button_name", scootersFeedbackFinishCardAnalytics$ScootersFeedbackFinishCardButtonName.getEventValue());
                hashMap.put("is_opened", bool);
                dln0Var.a.a("ScootersFeedbackFinishCard", hashMap, 1, new HashMap());
                break;
            default:
                s7n0 s7n0Var = (s7n0) obj;
                kmn0Var2 = scootersFinishInfoModalView.scootersFinishInfoAnalytics;
                feedbackSettingsParams$Screen = scootersFinishInfoModalView.screen;
                ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button = ScootersRideFeedbackAnalytics$Button.Dialog;
                y1o0Var = scootersFinishInfoModalView.newbieProgressInfo;
                kmn0Var2.a(feedbackSettingsParams$Screen, scootersRideFeedbackAnalytics$Button, y1o0Var != null ? Integer.valueOf(y1o0Var.a) : null, null);
                tlsVar = scootersFinishInfoModalView.showFinishItemDialog;
                tlsVar.invoke(s7n0Var);
                break;
        }
        return zy11Var;
    }
}
