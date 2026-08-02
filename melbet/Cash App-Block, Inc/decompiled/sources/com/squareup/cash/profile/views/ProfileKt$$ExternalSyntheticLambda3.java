package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionEvent;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewEvent$IdentityVerificationClick;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalizedAdsSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.history.viewmodels.ReportAbuseResult;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogResult;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.persona.viewmodels.PersonaDidvViewEvent;
import com.squareup.cash.persona.views.PersonaDidvView;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewEvent;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolCreateViewEvent;
import com.squareup.cash.pools.viewmodels.PoolsListViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewEvent;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsView;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewEvent;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryListViewEvent;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.recipients.data.Recipient;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object dialogCanceled;
        int i = this.$r8$classId;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                GenericProfileElementsViewEvent genericProfileElementsViewEvent = (GenericProfileElementsViewEvent) obj;
                genericProfileElementsViewEvent.getClass();
                function1.invoke(new ProfileViewEvent.GenericProfileElementsViewEventWrapper(genericProfileElementsViewEvent));
                break;
            case 1:
                function1.invoke(new NearbyPayRequestViewEvent.OnSegmentSelected((NearbyPayRequestTab) NearbyPayRequestTab.$ENTRIES.get(((Integer) obj).intValue())));
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new NearbyPaymentKeypadViewEvent.OnAmountChanged(str));
                break;
            case 3:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                function1.invoke(new PersonalizePaymentViewEvent.OnDeleteDrawn(new CanvasDetails(UtilKt.m3706toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g()), UtilKt.m3705toDevicePixelPositionk4lQ0M(ValueInsets.positionInParent(layoutCoordinates)))));
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new PersonalizePaymentRecipientViewEvent.ReactionTapped(str2));
                break;
            case 5:
                AlertDialogResult alertDialogResult = (AlertDialogResult) obj;
                alertDialogResult.getClass();
                int ordinal = alertDialogResult.ordinal();
                if (ordinal == 0) {
                    function1.invoke(PersonalizePaymentRecipientViewEvent.ReloadResources.INSTANCE);
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    function1.invoke(PersonalizePaymentRecipientViewEvent.CloseDialog.INSTANCE);
                }
                break;
            case 6:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                Screen screen = dialogListenerEvent.getScreen();
                DialogListenerEvent.OnDialogResult onDialogResult = dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult ? (DialogListenerEvent.OnDialogResult) dialogListenerEvent : null;
                function1.invoke(new PersonalizePaymentViewEvent.OnDialogEvent(screen, onDialogResult != null ? onDialogResult.result : null));
                break;
            case 7:
                Object obj2 = (List) obj;
                obj2.getClass();
                function1.invoke(obj2);
                break;
            case 8:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                int i2 = PersonaDidvView.$r8$clinit;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        dialogCanceled = new PersonaDidvViewEvent.DialogCanceled(((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent2).screen);
                    }
                } else {
                    DialogListenerEvent.OnDialogResult onDialogResult2 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent2;
                    dialogCanceled = new PersonaDidvViewEvent.DialogResult(onDialogResult2.screen, onDialogResult2.result);
                }
                function1.invoke(dialogCanceled);
                break;
            case 9:
                PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount amountPickerQuickAmount = (PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount) obj;
                amountPickerQuickAmount.getClass();
                function1.invoke(new PoolContributeWithNoteViewEvent.AmountItemClicked(amountPickerQuickAmount));
                break;
            case 10:
                function1.invoke(new PoolContributeWithNoteViewEvent.AmountCustomChanged(((Long) obj).longValue()));
                break;
            case 11:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new PoolContributeWithNoteViewEvent.NoteChanged(str3));
                break;
            case 12:
                PoolCreateViewEvent poolCreateViewEvent = (PoolCreateViewEvent) obj;
                poolCreateViewEvent.getClass();
                if (!Intrinsics.areEqual(poolCreateViewEvent, PoolCreateViewEvent.Close.INSTANCE)) {
                    if (!Intrinsics.areEqual(poolCreateViewEvent, PoolCreateViewEvent.TermsOfService.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(StartPoolViewEvent.TermsOfService.INSTANCE);
                    }
                } else {
                    function1.invoke(StartPoolViewEvent.DismissSheet.INSTANCE);
                }
                break;
            case 13:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new StartPoolViewEvent.NameChanged(str4));
                break;
            case 14:
                function1.invoke(new PoolsListViewEvent.SelectCategory((PoolCategory) PoolCategory.$ENTRIES.get(((Integer) obj).intValue())));
                break;
            case 15:
                Context context = (Context) obj;
                context.getClass();
                InvestingGraphTabsView investingGraphTabsView = new InvestingGraphTabsView(context, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
                investingGraphTabsView.onToggle(function1);
                break;
            case 16:
                DialogListenerEvent dialogListenerEvent3 = (DialogListenerEvent) obj;
                dialogListenerEvent3.getClass();
                if (dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogResult) {
                    Object obj3 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent3).result;
                    if (obj3 instanceof DeviceManagerConfirmRemoveDevicesScreen.Result.Remove) {
                        function1.invoke(DeviceManagerListViewEvent.RemoveAllConfirmed.INSTANCE);
                    } else if (obj3 instanceof DeviceManagerConfirmRemoveDevicesScreen.Result.Cancel) {
                        function1.invoke(DeviceManagerListViewEvent.RemoveAllCancelled.INSTANCE);
                    }
                }
                break;
            case 17:
                ProfilePaymentHistoryViewEvent$ViewAll profilePaymentHistoryViewEvent$ViewAll = (ProfilePaymentHistoryViewEvent$ViewAll) obj;
                profilePaymentHistoryViewEvent$ViewAll.getClass();
                function1.invoke(new GenericProfileElementsViewEvent.PaymentHistoryViewEvent(profilePaymentHistoryViewEvent$ViewAll));
                break;
            case 18:
                Recipient recipient = (Recipient) obj;
                recipient.getClass();
                function1.invoke(new GenericProfileElementsViewEvent.FavoritesListFavoriteClicked(recipient));
                break;
            case 19:
                DialogListenerEvent dialogListenerEvent4 = (DialogListenerEvent) obj;
                dialogListenerEvent4.getClass();
                if (!(dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent4 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    DialogListenerEvent.OnDialogResult onDialogResult3 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent4;
                    Object obj4 = onDialogResult3.result;
                    Screen screen2 = onDialogResult3.screen;
                    if (screen2 instanceof PaymentScreens.ConfirmRecipient) {
                        if (obj4 == ConfirmRecipientDialogResult.CONFIRM) {
                            function1.invoke(ProfileViewEvent.RecipientConfirmed.INSTANCE);
                        }
                    } else if ((screen2 instanceof HistoryScreens.ReportAbuse) || (screen2 instanceof HistoryScreens.ReportAbuseDialogScreen)) {
                        function1.invoke(new ProfileViewEvent.GenericProfileElementsViewEventWrapper(new GenericProfileElementsViewEvent.ReportProfileResult(obj4 == ReportAbuseResult.SUCCESS)));
                    }
                }
                break;
            case 20:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 21:
                function1.invoke(new CategoryListViewEvent.ParentToggleClicked(((Boolean) obj).booleanValue()));
                break;
            case 22:
                Category category = (Category) obj;
                category.getClass();
                function1.invoke(new CategoryListViewEvent.CategoryClicked(category));
                break;
            case 23:
                ((IdentityVerificationSectionViewEvent$IdentityVerificationClick) obj).getClass();
                function1.invoke(PersonalInfoSectionViewEvent.IdentityVerificationClick.INSTANCE);
                break;
            case 24:
                DialogListenerEvent dialogListenerEvent5 = (DialogListenerEvent) obj;
                dialogListenerEvent5.getClass();
                if (!(dialogListenerEvent5 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    if (!(dialogListenerEvent5 instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        DialogListenerEvent.OnDialogResult onDialogResult4 = (DialogListenerEvent.OnDialogResult) dialogListenerEvent5;
                        Object obj5 = onDialogResult4.result;
                        Screen screen3 = onDialogResult4.screen;
                        if (screen3 instanceof ProfileScreens.ConfirmRemoveAliasScreen) {
                            if (obj5 == AlertDialogResult.POSITIVE) {
                                ProfileScreens.ConfirmRemoveAliasScreen confirmRemoveAliasScreen = (ProfileScreens.ConfirmRemoveAliasScreen) screen3;
                                function1.invoke(new PersonalScreenViewEvent.AliasEvent(new AliasesSectionEvent.UnregisterAlias(confirmRemoveAliasScreen.f1189type, (String) confirmRemoveAliasScreen.text.getValue(), confirmRemoveAliasScreen.verified)));
                            }
                        } else if (screen3 instanceof ProfileScreens.AddAliasScreen) {
                            obj5.getClass();
                            int ordinal2 = ((AliasItem) obj5).ordinal();
                            if (ordinal2 == 0) {
                                function1.invoke(new PersonalScreenViewEvent.AliasEvent(AliasesSectionEvent.NavigationAction.AddMobile.INSTANCE));
                            } else if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                function1.invoke(new PersonalScreenViewEvent.AliasEvent(AliasesSectionEvent.NavigationAction.AddEmail.INSTANCE));
                            }
                        }
                    }
                }
                break;
            case 25:
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj;
                appMessageViewEvent.getClass();
                function1.invoke(new PersonalScreenViewEvent.AppMessageEvent(appMessageViewEvent));
                break;
            case 26:
                AliasesSectionEvent aliasesSectionEvent = (AliasesSectionEvent) obj;
                aliasesSectionEvent.getClass();
                function1.invoke(new PersonalScreenViewEvent.AliasEvent(aliasesSectionEvent));
                break;
            case 27:
                function1.invoke(new PersonalScreenViewEvent.ProUpgradeClick(((Boolean) obj).booleanValue()));
                break;
            case 28:
                function1.invoke(new ProfilePrivacyViewEvent.ToggleCashMeUrlSetting(((Boolean) obj).booleanValue()));
                break;
            default:
                function1.invoke(new ProfilePrivacyViewEvent.PersonalizedAdsEvent(new PersonalizedAdsSectionViewEvent.ToggleSetting(((Boolean) obj).booleanValue())));
                break;
        }
        return Unit.INSTANCE;
    }
}
