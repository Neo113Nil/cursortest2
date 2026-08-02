package com.squareup.cash.profile.views.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ProfileNotificationsView$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ProfileNotificationsViewModel f$1;

    public /* synthetic */ ProfileNotificationsView$$ExternalSyntheticLambda2(Function1 function1, ProfileNotificationsViewModel profileNotificationsViewModel) {
        this.f$0 = function1;
        this.f$1 = profileNotificationsViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ProfileNotificationsViewModel profileNotificationsViewModel = this.f$1;
        Function1 function1 = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ChannelListViewKt.ProfileNotifications(0, gapComposer, profileNotificationsViewModel, function1);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                ChannelListViewKt.ProfileNotifications(Updater.updateChangedFlags(1), composer, profileNotificationsViewModel, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProfileNotificationsView$$ExternalSyntheticLambda2(Function1 function1, ProfileNotificationsViewModel profileNotificationsViewModel, int i) {
        this.f$0 = function1;
        this.f$1 = profileNotificationsViewModel;
    }
}
