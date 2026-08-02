package com.squareup.cash.activity.viewmodels.fixtures;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class ActivityFixturesKt {
    public static int autoIdCounter;

    public static UiCallbackModel activityItemFixture$default(String str, int i, char c) {
        int i2 = autoIdCounter;
        autoIdCounter = i2 + 1;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "activity ");
        String str2 = (i & 2) != 0 ? "$1.23" : str;
        return new UiCallbackModel(new ActivityTabViewKt$$ExternalSyntheticLambda17(5), new ActivityItemViewModel(m, "Jeremy Martinez", "$23 for lunch", "Sep 18", (ItemAccessory) new ItemAccessory.Amount(str2, PaymentHistoryData.AmountTreatment.STANDARD), (StackedAvatarViewModel) new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(new ColorModel.Accented(new Color(new Color.ModeVariant("#FF4A4A", null, null, null, null, 30, null), (Color.ModeVariant) null, 6)), Character.valueOf((i & 4) != 0 ? 'C' : c), null, null, null, null, null, null, false, false, null, false, null, null, 131068)), (AvatarBadgeViewModel) null, false, new ActivityItemPresentationContext(ActivityItemOrigin.HISTORY, 1, null, ActivityScope.MY_ACTIVITY, new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, "token", (String) null, 12), 1), (Icons) null, (ReactionsState) null, "Jeremy Martinez, $23 for lunch, Sep 18, ".concat(str2), 5632));
    }
}
