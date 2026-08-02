package coil3.compose;

import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.local.viewmodels.FulfillmentOptionsMenuEvent;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionMapViewEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewEvent;
import com.squareup.cash.account.settings.viewmodels.ViewMode;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.AppMessageEvent;
import com.squareup.cash.activity.viewmodels.ContactHeaderEvent;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.activity.viewmodels.InviteFriendsClicked;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.activity.viewmodels.TabToolbarEvent;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletPurchasesEmbeddedViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.protos.franklin.ui.Timeline;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ReactionViewEvent.ViewCloseRequested viewCloseRequested = ReactionViewEvent.ViewCloseRequested.INSTANCE;
        AfterpayAppletPurchasesEmbeddedViewEvent.Refresh refresh = AfterpayAppletPurchasesEmbeddedViewEvent.Refresh.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) obj;
                error.getClass();
                function1.invoke(error.result.throwable);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 2:
                CashMapViewEvent cashMapViewEvent = (CashMapViewEvent) obj;
                cashMapViewEvent.getClass();
                if (cashMapViewEvent instanceof CashMapViewEvent.MarkerClicked) {
                    function1.invoke(new BrandCollectionMapViewEvent.LocationSelectorClicked(((CashMapViewEvent.MarkerClicked) cashMapViewEvent).locationToken));
                }
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new LocalPosCheckInViewEvent.QrCodeDetected(str));
                break;
            case 4:
                FulfillmentOptionsMenuEvent fulfillmentOptionsMenuEvent = (FulfillmentOptionsMenuEvent) obj;
                fulfillmentOptionsMenuEvent.getClass();
                function1.invoke(fulfillmentOptionsMenuEvent);
                break;
            case 5:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                function1.invoke(new LocalHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                break;
            case 6:
                AsyncImagePainter.State.Error error2 = (AsyncImagePainter.State.Error) obj;
                error2.getClass();
                function1.invoke(error2.result.throwable);
                break;
            case 7:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                    function1.invoke(new AccountViewEvent.OnDialogResult(onDialogResult.screen, onDialogResult.result));
                }
                break;
            case 8:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    DialogListenerEvent.OnDialogResult onDialogResult2 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent2;
                    function1.invoke(new EditProfileViewEvent.OnDialogResult(onDialogResult2.screen, onDialogResult2.result));
                }
                break;
            case 9:
                function1.invoke(new EditProfileViewEvent.ViewModeToggled((ViewMode) ViewMode.$ENTRIES.get(((Integer) obj).intValue())));
                break;
            case 10:
                ((EditProfileViewEvent) obj).getClass();
                function1.invoke(BusinessInfoViewEvent.DowngradeToPersonalProfile.INSTANCE);
                break;
            case 11:
                ReactionViewEvent reactionViewEvent = (ReactionViewEvent) obj;
                reactionViewEvent.getClass();
                if (reactionViewEvent instanceof ReactionViewEvent.SubmitReaction) {
                    function1.invoke(new ActivityItemViewEvent.ReactionSelected(((ReactionViewEvent.SubmitReaction) reactionViewEvent).reaction));
                } else if (Intrinsics.areEqual(reactionViewEvent, viewCloseRequested)) {
                    function1.invoke(ActivityItemViewEvent.ReactionSelectorDismissed.INSTANCE);
                }
                break;
            case 12:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent2 = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent2.getClass();
                function1.invoke(new TabToolbarEvent(tabToolbarInternalViewEvent2));
                break;
            case 13:
                AvatarCarouselEntry avatarCarouselEntry = (AvatarCarouselEntry) obj;
                avatarCarouselEntry.getClass();
                String str2 = avatarCarouselEntry.key;
                if (Intrinsics.areEqual(str2, "invite_friends")) {
                    function1.invoke(new InviteFriendsClicked(true));
                } else {
                    function1.invoke(new ContactHeaderEvent(new ContactHeaderViewEvent.ContactClickById(str2)));
                }
                break;
            case 14:
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj;
                appMessageViewEvent.getClass();
                function1.invoke(new AppMessageEvent(appMessageViewEvent));
                break;
            case 15:
                AppMessageViewEvent appMessageViewEvent2 = (AppMessageViewEvent) obj;
                appMessageViewEvent2.getClass();
                function1.invoke(new AppMessageEvent(appMessageViewEvent2));
                break;
            case 16:
                AppMessageViewEvent appMessageViewEvent3 = (AppMessageViewEvent) obj;
                appMessageViewEvent3.getClass();
                function1.invoke(new AppMessageEvent(appMessageViewEvent3));
                break;
            case 17:
                Timeline.Event event = (Timeline.Event) obj;
                event.getClass();
                String str3 = event.tap_action_url;
                if (str3 != null) {
                    function1.invoke(new ReceiptViewEvent.OpenUrl(str3));
                }
                break;
            case 18:
                ReactionViewEvent reactionViewEvent2 = (ReactionViewEvent) obj;
                reactionViewEvent2.getClass();
                if (reactionViewEvent2 instanceof ReactionViewEvent.SubmitReaction) {
                    function1.invoke(new ReceiptViewEvent.ReactionSelected(((ReactionViewEvent.SubmitReaction) reactionViewEvent2).reaction));
                } else if (reactionViewEvent2.equals(viewCloseRequested)) {
                    function1.invoke(ReceiptViewEvent.ReactionSelectorDismissed.INSTANCE);
                }
                break;
            case 19:
                ActivityEmbeddedViewEvent activityEmbeddedViewEvent = (ActivityEmbeddedViewEvent) obj;
                activityEmbeddedViewEvent.getClass();
                if (activityEmbeddedViewEvent instanceof ActivityEmbeddedViewEvent.Refresh) {
                    function1.invoke(refresh);
                }
                break;
            case 20:
                ActivityEmbeddedViewEvent activityEmbeddedViewEvent2 = (ActivityEmbeddedViewEvent) obj;
                activityEmbeddedViewEvent2.getClass();
                if (activityEmbeddedViewEvent2 instanceof ActivityEmbeddedViewEvent.Refresh) {
                    function1.invoke(refresh);
                }
                break;
            case 21:
                List list = (List) obj;
                list.getClass();
                function1.invoke(new ItemViewed(list, null));
                break;
            case 22:
                List list2 = (List) obj;
                list2.getClass();
                function1.invoke(new ItemViewed(list2, null));
                break;
            case 23:
                function1.invoke(new AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.RequestMoreDates(((Integer) obj).intValue()));
                break;
            case 24:
                List list3 = (List) obj;
                list3.getClass();
                function1.invoke(list3);
                break;
            case 25:
                List list4 = (List) obj;
                list4.getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.ScrollToWeek(list4));
                break;
            case 26:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj;
                calendarDate.getClass();
                function1.invoke(calendarDate);
                break;
            case 27:
                ((Boolean) obj).booleanValue();
                function1.invoke(AfterpayAppletHomeViewEvent.PrepurchaseToggleTapped.INSTANCE);
                break;
            case 28:
                List list5 = (List) obj;
                list5.getClass();
                function1.invoke(new ItemViewed(list5, null));
                break;
            default:
                ((AsyncImagePainter.State.Error) obj).getClass();
                function1.invoke(AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
