package com.squareup.cash.blockers.views.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class InviteFriendsView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InviteFriendsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InviteFriendsView$$ExternalSyntheticLambda0(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = inviteFriendsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        InviteFriendsViewModel inviteFriendsViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = InviteFriendsView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    VerifyAliasViewKt.InviteFriends(inviteFriendsViewModel, function1, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                VerifyAliasViewKt.PrimaryButtonFirst(inviteFriendsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                num.getClass();
                VerifyAliasViewKt.SingleButton(inviteFriendsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                VerifyAliasViewKt.SecondaryButtonFirst(inviteFriendsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InviteFriendsView$$ExternalSyntheticLambda0(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = inviteFriendsViewModel;
        this.f$1 = function1;
    }
}
