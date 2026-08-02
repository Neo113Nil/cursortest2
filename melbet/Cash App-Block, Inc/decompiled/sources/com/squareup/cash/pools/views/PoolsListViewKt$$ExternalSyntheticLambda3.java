package com.squareup.cash.pools.views;

import com.squareup.cash.pools.viewmodels.PoolDetailsViewEvent;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewEvent;
import com.squareup.cash.pools.viewmodels.PoolsListViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolsListViewKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PoolsListViewKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PoolDetailsViewEvent.Refresh refresh = PoolDetailsViewEvent.Refresh.INSTANCE;
        PoolDetailsViewEvent.Close close = PoolDetailsViewEvent.Close.INSTANCE;
        PoolsListViewEvent.Refresh refresh2 = PoolsListViewEvent.Refresh.INSTANCE;
        PoolMemberListViewEvent.DismissDialog dismissDialog = PoolMemberListViewEvent.DismissDialog.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(PoolsListViewEvent.GoBack.INSTANCE);
                break;
            case 1:
                function1.invoke(PoolDetailsViewEvent.ShareTapped.INSTANCE);
                break;
            case 2:
                function1.invoke(PoolDetailsViewEvent.ContributeTapped.INSTANCE);
                break;
            case 3:
                function1.invoke(PoolDetailsViewEvent.ClosePoolTapped.INSTANCE);
                break;
            case 4:
                function1.invoke(PoolDetailsViewEvent.InvitePeopleTapped.INSTANCE);
                break;
            case 5:
                function1.invoke(PoolDetailsViewEvent.CurrentMembersTapped.INSTANCE);
                break;
            case 6:
                function1.invoke(PoolDetailsViewEvent.GoalMetAnimationShown.INSTANCE);
                break;
            case 7:
                function1.invoke(PoolDetailsViewEvent.ContributionAnimationShown.INSTANCE);
                break;
            case 8:
                function1.invoke(close);
                break;
            case 9:
                function1.invoke(refresh);
                break;
            case 10:
                function1.invoke(refresh);
                break;
            case 11:
                function1.invoke(close);
                break;
            case 12:
                function1.invoke(PoolInvitePeopleListViewEvent.GrantContactsPermissionClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(PoolInvitePeopleListViewEvent.CopyLinkTapped.INSTANCE);
                break;
            case 14:
                function1.invoke(PoolInvitePeopleListViewEvent.ShareTapped.INSTANCE);
                break;
            case 15:
                function1.invoke(PoolMemberListViewEvent.AddPeople.INSTANCE);
                break;
            case 16:
                function1.invoke(PoolMemberListViewEvent.OwnerTapped.INSTANCE);
                break;
            case 17:
                function1.invoke(dismissDialog);
                break;
            case 18:
                function1.invoke(PoolMemberListViewEvent.Close.INSTANCE);
                break;
            case 19:
                function1.invoke(dismissDialog);
                break;
            case 20:
                function1.invoke(dismissDialog);
                break;
            case 21:
                function1.invoke(PoolMoreOptionsBottomSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 22:
                function1.invoke(PoolMoreOptionsBottomSheetViewEvent.ShowParticipants.INSTANCE);
                break;
            case 23:
                function1.invoke(PoolsListViewEvent.TapNewPool.INSTANCE);
                break;
            case 24:
                function1.invoke(refresh2);
                break;
            case 25:
                function1.invoke(refresh2);
                break;
            case 26:
                function1.invoke(StartPoolViewEvent.Continue.INSTANCE);
                break;
            case 27:
                function1.invoke(StartPoolViewEvent.DismissSheet.INSTANCE);
                break;
            case 28:
                function1.invoke(StartPoolViewEvent.Back.INSTANCE);
                break;
            default:
                function1.invoke(PrepurchaseCardFAQViewEvent.CloseClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
