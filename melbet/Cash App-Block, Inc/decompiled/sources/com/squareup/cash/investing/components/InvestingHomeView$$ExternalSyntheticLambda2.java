package com.squareup.cash.investing.components;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingHomeView$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingHomeView f$0;

    public /* synthetic */ InvestingHomeView$$ExternalSyntheticLambda2(InvestingHomeView investingHomeView, int i) {
        this.$r8$classId = i;
        this.f$0 = investingHomeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InvestingHomeView investingHomeView = this.f$0;
        switch (i) {
            case 0:
                Ui.EventReceiver eventReceiver = investingHomeView.eventReceiver;
                if (eventReceiver != null) {
                    return eventReceiver;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 1:
                Ui.EventReceiver eventReceiver2 = investingHomeView.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(InvestingHomeViewEvent.Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 2:
                Ui.EventReceiver eventReceiver3 = investingHomeView.eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(new InvestingHomeViewEvent.SearchClicked(InvestingHomeViewEvent.SearchClicked.Source.PORTFOLIO_SEARCH_BAR));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 3:
                Ui.EventReceiver eventReceiver4 = investingHomeView.eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(InvestingHomeViewEvent.SettingsMenuIconClicked.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 4:
                Ui.EventReceiver eventReceiver5 = investingHomeView.eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(InvestingHomeViewEvent.StocksTransferStatusTileClicked.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 5:
                Ui.EventReceiver eventReceiver6 = investingHomeView.eventReceiver;
                if (eventReceiver6 != null) {
                    return eventReceiver6;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 6:
                Ui.EventReceiver eventReceiver7 = investingHomeView.eventReceiver;
                if (eventReceiver7 != null) {
                    return eventReceiver7;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 7:
                Ui.EventReceiver eventReceiver8 = investingHomeView.eventReceiver;
                if (eventReceiver8 != null) {
                    return eventReceiver8;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 8:
                Ui.EventReceiver eventReceiver9 = investingHomeView.eventReceiver;
                if (eventReceiver9 != null) {
                    return eventReceiver9;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            default:
                Ui.EventReceiver eventReceiver10 = investingHomeView.eventReceiver;
                if (eventReceiver10 != null) {
                    return eventReceiver10;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
        }
    }
}
