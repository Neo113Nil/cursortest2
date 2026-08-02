package defpackage;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;
import ru.yandex.taxi.scooters.presentation.finish_info.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class qmn0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersFinishInfoModalView b;

    public /* synthetic */ qmn0(ScootersFinishInfoModalView scootersFinishInfoModalView, int i) {
        this.a = i;
        this.b = scootersFinishInfoModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 initFeedbackCard$lambda$0;
        zy11 initFeedbackCard$lambda$1;
        zy11 initFeedbackCard$lambda$2;
        d dVar;
        int i = this.a;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        switch (i) {
            case 0:
                initFeedbackCard$lambda$0 = ScootersFinishInfoModalView.initFeedbackCard$lambda$0(scootersFinishInfoModalView);
                return initFeedbackCard$lambda$0;
            case 1:
                initFeedbackCard$lambda$1 = ScootersFinishInfoModalView.initFeedbackCard$lambda$1(scootersFinishInfoModalView);
                return initFeedbackCard$lambda$1;
            case 2:
                initFeedbackCard$lambda$2 = ScootersFinishInfoModalView.initFeedbackCard$lambda$2(scootersFinishInfoModalView);
                return initFeedbackCard$lambda$2;
            default:
                dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
                dVar.P.invoke(SharingPersonalGoalsServiceName.SCOOTERS, SharingPersonalGoalsDisplayContext.RIDE_FINISH);
                return zy11.a;
        }
    }
}
