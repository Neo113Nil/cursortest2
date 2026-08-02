package app.cash.local.presenters.home;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoPresenter$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiCallbackModel f$0;

    public /* synthetic */ LocalHomeGeoPresenter$$ExternalSyntheticLambda2(UiCallbackModel uiCallbackModel, int i) {
        this.$r8$classId = i;
        this.f$0 = uiCallbackModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        UiCallbackModel uiCallbackModel = this.f$0;
        switch (i) {
            case 0:
                uiCallbackModel.onEvent.invoke(CashMapViewEvent.ClearSelectedLocation.INSTANCE);
                break;
            default:
                uiCallbackModel.onEvent.invoke(ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
