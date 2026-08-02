package com.squareup.cash.directory_ui.views;

import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class CardItemView$setModel$1$1 implements Function0 {
    public final /* synthetic */ int $position;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ui.EventReceiver $receiver;
    public final /* synthetic */ DirectoryListItem.ItemViewModel $viewModel;

    public /* synthetic */ CardItemView$setModel$1$1(Ui.EventReceiver eventReceiver, DirectoryListItem.ItemViewModel itemViewModel, int i, int i2) {
        this.$r8$classId = i2;
        this.$receiver = eventReceiver;
        this.$viewModel = itemViewModel;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.$position;
        DirectoryListItem.ItemViewModel itemViewModel = this.$viewModel;
        Ui.EventReceiver eventReceiver = this.$receiver;
        switch (i) {
            case 0:
                DirectoryAnalyticsData directoryAnalyticsData = itemViewModel.analyticsData;
                eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.AnalyticsEvent(DirectoryAnalyticsData.copy$default(directoryAnalyticsData, DirectoryAnalyticsData.ItemAnalyticsData.copy$default(directoryAnalyticsData.item, Integer.valueOf(i2)), null, DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM, 445)));
                break;
            default:
                DirectoryAnalyticsData directoryAnalyticsData2 = itemViewModel.analyticsData;
                eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.AnalyticsEvent(DirectoryAnalyticsData.copy$default(directoryAnalyticsData2, DirectoryAnalyticsData.ItemAnalyticsData.copy$default(directoryAnalyticsData2.item, Integer.valueOf(i2)), null, DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM, 445)));
                break;
        }
        return Unit.INSTANCE;
    }
}
