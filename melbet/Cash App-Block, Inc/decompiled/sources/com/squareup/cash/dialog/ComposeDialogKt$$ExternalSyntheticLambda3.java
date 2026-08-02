package com.squareup.cash.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.sqldelight.TransactionWrapper;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewEvent;
import com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewEvent;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewEvent;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewEvent;
import com.squareup.cash.earningstracker.screens.TimeframeSelectorSheetResult;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewEvent;
import com.squareup.cash.education.stories.views.EducationStoryWebViewClient;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceSectionViewEvent$TapAllowanceView;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.family.requestsponsorship.screens.ContactPermissionDialogScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionResult$Positive;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import com.squareup.cash.favorites.viewmodels.FavoritePersonViewModel;
import com.squareup.cash.favorites.viewmodels.ListFavoritesViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewEvent;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeDialogKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        DependentControlViewEvent.CustomLimitSetupEnded customLimitSetupEnded = null;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                AlertDialogResult alertDialogResult = (AlertDialogResult) obj;
                alertDialogResult.getClass();
                int ordinal = alertDialogResult.ordinal();
                if (ordinal == 0) {
                    obj2 = AlertDialogViewEvent.PositiveClick.INSTANCE;
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    obj2 = AlertDialogViewEvent.NegativeClick.INSTANCE;
                }
                function1.invoke(obj2);
                break;
            case 1:
                TransactionWrapper transactionWrapper = (TransactionWrapper) obj;
                transactionWrapper.getClass();
                break;
            case 2:
                TransactionWrapper transactionWrapper2 = (TransactionWrapper) obj;
                transactionWrapper2.getClass();
                function1.invoke(transactionWrapper2);
                break;
            case 3:
                function1.invoke(new BitcoinP2pConversionPercentageViewEvent.SelectPercentage(RangesKt___RangesKt.coerceIn(((long) Math.rint(((Float) obj).floatValue() * 100.0f)) * 100, 100L, 10000L)));
                break;
            case 4:
                Context context = (Context) obj;
                context.getClass();
                View view = (View) function1.invoke(context);
                view.setImportantForAccessibility(2);
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new AtmPmdExplainerViewEvent.LinkClicked(str));
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new AtmPmdExplainerViewEvent.ButtonGroupClicked(str2));
                break;
            case 7:
                EarningsHomeViewModel.EarnerModeSheet.DurationOption durationOption = (EarningsHomeViewModel.EarnerModeSheet.DurationOption) obj;
                durationOption.getClass();
                function1.invoke(new EarningsHomeViewEvent.SubmitEarnerMode(durationOption.seconds));
                break;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new AddPayerCustomersViewEvent.ToggleCustomer(str3));
                break;
            case 9:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new AddPayerCustomersViewEvent.ToggleCustomer(str4));
                break;
            case 10:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new AddPayerCustomersViewEvent.ToggleCustomer(str5));
                break;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new AddPayerCustomersViewEvent.ToggleCustomer(str6));
                break;
            case 12:
                DateFilter dateFilter = (DateFilter) obj;
                dateFilter.getClass();
                function1.invoke(new EarningsStreamDetailViewEvent.DateFilterChanged(dateFilter));
                break;
            case 13:
                EarningsBarViewModel earningsBarViewModel = (EarningsBarViewModel) obj;
                earningsBarViewModel.getClass();
                function1.invoke(new EarningsTrackerViewEvent.BarSelected(earningsBarViewModel.displayLabel, earningsBarViewModel.displayValue));
                break;
            case 14:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled)) {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Object obj3 = ((DialogListenerEvent.OnDialogResult) dialogListenerEvent).result;
                        if (obj3 instanceof TimeframeSelectorSheetResult) {
                            function1.invoke(new EarningsTrackerViewEvent.TimeframeSelected(((TimeframeSelectorSheetResult) obj3).timeframe));
                        }
                    }
                }
                break;
            case 15:
                DateFilter dateFilter2 = (DateFilter) obj;
                dateFilter2.getClass();
                function1.invoke(new EarningsTrackerViewEvent.FilterChipClicked(dateFilter2));
                break;
            case 16:
                Context context2 = (Context) obj;
                context2.getClass();
                WebView webView = new WebView(context2);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.setWebChromeClient(new WebChromeClient());
                webView.setWebViewClient(new EducationStoryWebViewClient(0, function1));
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setTextZoom(100);
                break;
            case 17:
                AllowanceViewEvent allowanceViewEvent = (AllowanceViewEvent) obj;
                allowanceViewEvent.getClass();
                function1.invoke(new DependentDetailViewEvent.AllowanceSectionEvent(new AllowanceSectionViewEvent$TapAllowanceView(allowanceViewEvent)));
                break;
            case 18:
                DialogListenerEvent dialogListenerEvent2 = (DialogListenerEvent) obj;
                dialogListenerEvent2.getClass();
                if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogResult)) {
                    if (!(dialogListenerEvent2 instanceof DialogListenerEvent.OnDialogCanceled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Screen screen = ((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent2).screen;
                        if (screen instanceof SetDependentCustomLimitScreen) {
                            customLimitSetupEnded = new DependentControlViewEvent.CustomLimitSetupEnded(((SetDependentCustomLimitScreen) screen).controlType);
                        }
                    }
                }
                if (customLimitSetupEnded != null) {
                    function1.invoke(customLimitSetupEnded);
                }
                break;
            case 19:
                AmountSelectorOption amountSelectorOption = (AmountSelectorOption) obj;
                amountSelectorOption.getClass();
                function1.invoke(new AmountChooserViewEvent.TapAmountSelectorOption(amountSelectorOption));
                break;
            case 20:
                BlockerAction blockerAction = (BlockerAction) obj;
                blockerAction.getClass();
                function1.invoke(new FamilyHomeViewEvent.TapUpsellCard(blockerAction));
                break;
            case 21:
                DialogListenerEvent dialogListenerEvent3 = (DialogListenerEvent) obj;
                dialogListenerEvent3.getClass();
                function1.invoke(SelectSponsorViewEvent.DialogDismissed.INSTANCE);
                if (!(dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogCanceled)) {
                    if (!(dialogListenerEvent3 instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent3;
                        if ((onDialogResult.screen instanceof ContactPermissionDialogScreen) && Intrinsics.areEqual(onDialogResult.result, ContactPermissionResult$Positive.INSTANCE)) {
                            function1.invoke(SelectSponsorViewEvent.EnableContact.INSTANCE);
                        }
                    }
                }
                break;
            case 22:
                DialogListenerEvent dialogListenerEvent4 = (DialogListenerEvent) obj;
                dialogListenerEvent4.getClass();
                function1.invoke(new AddFavoritesViewEvent.OnDialogResult(dialogListenerEvent4.getScreen(), null));
                break;
            case 23:
                FavoritePersonViewModel favoritePersonViewModel = (FavoritePersonViewModel) obj;
                favoritePersonViewModel.getClass();
                function1.invoke(new ListFavoritesViewEvent.ListRowClicked(favoritePersonViewModel));
                break;
            case 24:
                FavoritePersonViewModel favoritePersonViewModel2 = (FavoritePersonViewModel) obj;
                favoritePersonViewModel2.getClass();
                function1.invoke(new ListFavoritesViewEvent.FavoriteClicked(favoritePersonViewModel2.customerId));
                break;
            case 25:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent.getClass();
                function1.invoke(genericTreeElementsViewEvent);
                break;
            case 26:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent2.getClass();
                function1.invoke(genericTreeElementsViewEvent2);
                break;
            case 27:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent3 = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent3.getClass();
                function1.invoke(genericTreeElementsViewEvent3);
                break;
            case 28:
                GenericTreeElementsViewEvent genericTreeElementsViewEvent4 = (GenericTreeElementsViewEvent) obj;
                genericTreeElementsViewEvent4.getClass();
                function1.invoke(genericTreeElementsViewEvent4);
                break;
            default:
                AvatarCarouselEntry avatarCarouselEntry = (AvatarCarouselEntry) obj;
                avatarCarouselEntry.getClass();
                String str7 = avatarCarouselEntry.key;
                if (Intrinsics.areEqual(str7, "invite_friends")) {
                    function1.invoke(new ContactHeaderViewEvent.InviteClick());
                } else {
                    function1.invoke(new ContactHeaderViewEvent.ContactClickById(str7));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
