package com.squareup.cash.activity.views;

import com.squareup.cash.account.settings.viewmodels.EditProfileViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewEvent;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.activity.viewmodels.InviteFriendsClicked;
import com.squareup.cash.activity.viewmodels.PulledToRefresh;
import com.squareup.cash.activity.viewmodels.SuspensionsBannerClicked;
import com.squareup.cash.activity.viewmodels.TooltipDismissed;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceFeedKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BalanceFeedKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ActivityEmbeddedViewEvent.ShowMoreClicked showMoreClicked = ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE;
        ActivityItemViewEvent.AvatarClicked avatarClicked = ActivityItemViewEvent.AvatarClicked.INSTANCE;
        ActivityEmbeddedViewEvent.Refresh refresh = ActivityEmbeddedViewEvent.Refresh.INSTANCE;
        ActivityItemViewEvent.ItemClicked itemClicked = ActivityItemViewEvent.ItemClicked.INSTANCE;
        ActivityItemViewEvent.InlineButtonClicked inlineButtonClicked = ActivityItemViewEvent.InlineButtonClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(BalanceFeedViewEvent.Exit.INSTANCE);
                break;
            case 1:
                function1.invoke(EditProfileViewEvent.AddPhotoClick.INSTANCE);
                break;
            case 2:
                function1.invoke(new EditProfileViewEvent.FullNameClicked(true));
                break;
            case 3:
                function1.invoke(new EditProfileViewEvent.FullNameClicked(false));
                break;
            case 4:
                function1.invoke(EditProfileViewEvent.CashtagClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(refresh);
                break;
            case 6:
                function1.invoke(showMoreClicked);
                break;
            case 7:
                function1.invoke(showMoreClicked);
                break;
            case 8:
                function1.invoke(refresh);
                break;
            case 9:
                function1.invoke(refresh);
                break;
            case 10:
                function1.invoke(inlineButtonClicked);
                break;
            case 11:
                function1.invoke(inlineButtonClicked);
                break;
            case 12:
                function1.invoke(itemClicked);
                break;
            case 13:
                function1.invoke(avatarClicked);
                break;
            case 14:
                function1.invoke(inlineButtonClicked);
                break;
            case 15:
                function1.invoke(avatarClicked);
                break;
            case 16:
                function1.invoke(itemClicked);
                break;
            case 17:
                function1.invoke(new InviteFriendsClicked(false));
                break;
            case 18:
                function1.invoke(new PulledToRefresh(true));
                break;
            case 19:
                function1.invoke(TooltipDismissed.INSTANCE);
                break;
            case 20:
                function1.invoke(SuspensionsBannerClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(new InviteFriendsClicked(false));
                break;
            case 22:
                function1.invoke(new PulledToRefresh(true));
                break;
            case 23:
                function1.invoke(new BalanceFeedViewEvent.ToggleInfoSheet(true));
                break;
            case 24:
                function1.invoke(new BalanceFeedViewEvent.ToggleInfoSheet(false));
                break;
            case 25:
                function1.invoke(FullScreenActivityViewEvent$Exit.INSTANCE);
                break;
            case 26:
                function1.invoke(ReactionViewEvent.ViewCloseRequested.INSTANCE);
                break;
            case 27:
                function1.invoke(inlineButtonClicked);
                break;
            case 28:
                function1.invoke(inlineButtonClicked);
                break;
            default:
                function1.invoke(itemClicked);
                break;
        }
        return Unit.INSTANCE;
    }
}
