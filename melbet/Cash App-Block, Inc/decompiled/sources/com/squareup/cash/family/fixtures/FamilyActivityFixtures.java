package com.squareup.cash.family.fixtures;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentActivityEmbeddedSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public abstract class FamilyActivityFixtures {
    public static final DependentActivityEmbeddedSectionViewModel DEPENDENT_ACTIVITY_EMBEDDED_SECTION;

    static {
        ActivityItemViewModel activityItemViewModel = new ActivityItemViewModel("item1", "Transaction", "Bitcoin", "Aug 16", (ItemAccessory) new ItemAccessory.Amount("$1.23", PaymentHistoryData.AmountTreatment.STANDARD), (StackedAvatarViewModel) new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(FamilyColorFixtures.RED_COLOR_MODEL, 'C', null, null, null, null, null, null, false, false, null, false, null, null, 131068)), (AvatarBadgeViewModel) null, false, new ActivityItemPresentationContext(ActivityItemOrigin.HISTORY, 1, null, ActivityScope.SPONSORED_ACCOUNT, new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, "token", (String) null, 12), 1), (Icons) null, (ReactionsState) null, "", 5632);
        DEPENDENT_ACTIVITY_EMBEDDED_SECTION = new DependentActivityEmbeddedSectionViewModel("Recent Activity", new UiCallbackModel(new FamilyActivityFixtures$$ExternalSyntheticLambda0(12), new ActivityEmbeddedViewModel(true, CollectionsKt__CollectionsKt.listOf((Object[]) new ActivityFeedEntry[]{new ActivityFeedEntry.EmbeddedHeader(true), new ActivityFeedEntry.Item(new UiCallbackModel(new FamilyActivityFixtures$$ExternalSyntheticLambda0(0), activityItemViewModel)), new ActivityFeedEntry.Item(new UiCallbackModel(new FamilyActivityFixtures$$ExternalSyntheticLambda0(10), ActivityItemViewModel.copy$default(activityItemViewModel, "item2", null, false, 8190))), new ActivityFeedEntry.Item(new UiCallbackModel(new FamilyActivityFixtures$$ExternalSyntheticLambda0(11), ActivityItemViewModel.copy$default(activityItemViewModel, "item3", null, false, 8190)))}))), DependentDetailViewEvent.SeeAllActivitiesEvent.INSTANCE);
    }
}
