package defpackage;

import com.yandex.go.scooters.analytics.ScootersRideFeedbackAnalytics$Button;
import java.util.List;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class smn0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersFinishInfoModalView b;

    public /* synthetic */ smn0(ScootersFinishInfoModalView scootersFinishInfoModalView, int i) {
        this.a = i;
        this.b = scootersFinishInfoModalView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 initFeedbackCard$lambda$4;
        kmn0 kmn0Var;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen;
        y1o0 y1o0Var;
        wls wlsVar;
        int i = this.a;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        switch (i) {
            case 0:
                initFeedbackCard$lambda$4 = ScootersFinishInfoModalView.initFeedbackCard$lambda$4(scootersFinishInfoModalView, (List) obj, ((Boolean) obj2).booleanValue());
                return initFeedbackCard$lambda$4;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                kmn0Var = scootersFinishInfoModalView.scootersFinishInfoAnalytics;
                feedbackSettingsParams$Screen = scootersFinishInfoModalView.screen;
                ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button = ScootersRideFeedbackAnalytics$Button.Charity;
                y1o0Var = scootersFinishInfoModalView.newbieProgressInfo;
                kmn0Var.a(feedbackSettingsParams$Screen, scootersRideFeedbackAnalytics$Button, y1o0Var != null ? Integer.valueOf(y1o0Var.a) : null, null);
                wlsVar = scootersFinishInfoModalView.openCharity;
                wlsVar.invoke(str, str2);
                return zy11.a;
        }
    }
}
