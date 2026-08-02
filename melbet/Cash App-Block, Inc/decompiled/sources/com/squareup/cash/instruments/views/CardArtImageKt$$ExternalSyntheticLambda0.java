package com.squareup.cash.instruments.views;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCardPlanningState;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.franklin.lending.SyncPrepurchaseCashCardResponse;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardArtImageKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ CardArtImageKt$$ExternalSyntheticLambda0(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 1;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        MutableState mutableState2 = this.f$0;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mutableState2.setValue(bool);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 1:
                SyncPrepurchaseCashCardResponse syncPrepurchaseCashCardResponse = (SyncPrepurchaseCashCardResponse) obj;
                List list = syncPrepurchaseCashCardResponse.alternative_locale_applet_data_list;
                PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = syncPrepurchaseCashCardResponse.applet_data;
                prepurchaseCashCardAppletData.getClass();
                mutableState2.setValue(CollectionsKt.plus((Collection) list, (Object) prepurchaseCashCardAppletData));
                mutableState.setValue(PrepurchaseCardPlanningState.HomeState.INSTANCE);
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                Timber.Forest forest = Timber.Forest;
                forest.tag("InteractiveCardEffect");
                forest.e("Graphics error, falling back", new Object[0], th);
                mutableState2.setValue(Boolean.TRUE);
                ((Function0) mutableState.getValue()).invoke();
                break;
            default:
                CardModelView cardModelView = (CardModelView) obj;
                cardModelView.getClass();
                if (((CardModelView) mutableState2.getValue()) == null) {
                    mutableState.setValue(cardModelView);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardArtImageKt$$ExternalSyntheticLambda0(MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
    }
}
