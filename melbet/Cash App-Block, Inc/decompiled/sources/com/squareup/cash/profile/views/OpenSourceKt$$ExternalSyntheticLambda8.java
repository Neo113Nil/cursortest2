package com.squareup.cash.profile.views;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.protos.access.sync_values.PasswordInfo;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.protos.franklin.ui.Timeline;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda8(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 1:
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                break;
            case 2:
                PasswordInfo passwordInfo2 = (PasswordInfo) obj;
                break;
            case 3:
                UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
                uiCategoryNotificationPreference.getClass();
                break;
            case 4:
                Channel channel = (Channel) obj;
                channel.getClass();
                break;
            case 5:
                ((CommerceBrowserAutofillPreferences) obj).getClass();
                break;
            case 6:
                ((ProfileViewEvent) obj).getClass();
                break;
            case 7:
                ((ProfileViewEvent) obj).getClass();
                break;
            case 8:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Alias alias = (Alias) obj;
                alias.getClass();
                break;
            case 12:
                Alias alias2 = (Alias) obj;
                alias2.getClass();
                break;
            case 13:
                Alias alias3 = (Alias) obj;
                alias3.getClass();
                break;
            case 14:
                String str = (String) obj;
                str.getClass();
                break;
            case 15:
                ((String) obj).getClass();
                break;
            case 16:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                break;
            case 17:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                break;
            case 18:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                break;
            case 19:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                ComposableLambdaImpl composableLambdaImpl = CameraXPreviewKt.f638lambda$1485725407;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(CameraXPreviewKt.f637lambda$1469216296);
                break;
            case 20:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl4.getClass();
                break;
            case 21:
                Reaction reaction = (Reaction) obj;
                reaction.getClass();
                String str2 = reaction.data;
                str2.getClass();
                break;
            case 22:
                RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj;
                recipientSuggestionsProvider$RecipientWithAnalyticsData.getClass();
                break;
            case 23:
                String str3 = (String) obj;
                str3.getClass();
                break;
            case 24:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("recurring_preference");
                break;
            case 25:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("recurring_preference");
                break;
            case 26:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("recurring_preference");
                break;
            case 27:
                ((Timeline.Event) obj).getClass();
                break;
            case 28:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            default:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
