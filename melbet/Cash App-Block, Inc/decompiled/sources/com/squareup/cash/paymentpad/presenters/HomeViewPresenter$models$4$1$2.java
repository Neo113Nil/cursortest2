package com.squareup.cash.paymentpad.presenters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Choreographer;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.fillr.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.internal.zzm;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.model.zza;
import com.google.android.play.core.review.zzf;
import com.google.android.play.core.review.zzi;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.cdf.appintro.AppIntroInteractGetStartedTapped;
import com.squareup.cash.cdf.appintro.AppIntroViewWelcomeVideoLoaded;
import com.squareup.cash.cdf.asset.AssetRequestChangeOrientation;
import com.squareup.cash.cdf.asset.AssetSendChangeOrientation;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.paychecks.PaychecksDismissPaycheckReceipt;
import com.squareup.cash.cdf.paychecks.PaychecksShowMonthlyAggregatePaycheckReceipt;
import com.squareup.cash.cdf.recipient.RecipientSearchSelectBlockerOption;
import com.squareup.cash.cdf.recipient.RecipientSearchViewBlocker;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.inappreview.real.RealInAppReviewLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.nearby.screens.NearbyOrderedListsScreen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreenV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEventV2;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen$Result$Cancel;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen$Result$Remove;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerErrorViewEvent$Close;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewEvent$SelectOption;
import com.squareup.cash.onboarding.accountpicker.viewmodels.ConfirmAccountRemovalViewEvent;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.onboarding.screens.SelectedCountry;
import com.squareup.cash.onboarding.viewmodels.CountrySelectorViewEvent;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewEvent;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.paychecks.screens.PaycheckAggregationReceiptScreen;
import com.squareup.cash.paychecks.screens.PaycheckAlertDialogScreen;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewEvent$TapPrimaryButton;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewEvent$Close;
import com.squareup.cash.paymentpad.viewmodels.LowDiskSpaceAlertViewEvent;
import com.squareup.cash.payments.presenters.ConfirmRecipientDialogPresenter$ConfirmRecipientOptions;
import com.squareup.cash.payments.presenters.QuickPayDetailsPresenter$WhenMappings;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewEvent;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewEvent;
import com.squareup.cash.payments.viewmodels.ContactSyncViewEvent;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewEvent$OnDismiss;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoItem;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewEvent$Close;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewEvent;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewEvent$Finish;
import com.squareup.cash.payments.viewmodels.WarningDialogViewEvent$ButtonClicked;
import com.squareup.cash.performance.AggregatingScrollPerformanceTracker;
import com.squareup.cash.performance.AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0;
import com.squareup.cash.performance.FrameCallbackScheduler;
import com.squareup.cash.performance.ScrollPerformanceNode;
import com.squareup.cash.persona.viewmodels.PersonaDidvViewEvent;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.android.Intents;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class HomeViewPresenter$models$4$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ HomeViewPresenter$models$4$1$2(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        zzw zzwVar;
        RecipientSearchSelectBlockerOption.Origin origin;
        RecipientSearchSelectBlockerOption.BlockerReason blockerReason;
        RecipientSearchViewBlocker.BlockerReason blockerReason2;
        Object failure;
        Enum r0;
        RecipientSearchViewBlocker.Origin origin2;
        Object failure2;
        Enum r02;
        NearbyOrderedListsScreen nearbyOrderedListsScreen;
        Orientation orientation;
        int i = this.$r8$classId;
        PaychecksReceiptViewEvent$Close paychecksReceiptViewEvent$Close = PaychecksReceiptViewEvent$Close.INSTANCE;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                EglCore eglCore = ((HomeViewPresenter) obj2).inAppReviewLauncher;
                zzi zziVar = (zzi) ((BinaryBitmap) eglCore.eglDisplay).binarizer;
                String str = zziVar.zzc;
                n.a aVar = zzi.zzb;
                aVar.zzc("requestInAppReview (%s)", str);
                zzt zztVar = zziVar.zza;
                int i2 = 0;
                if (zztVar == null) {
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", n.a.zze(aVar.b, "Play Store app is either not installed or not the official version", objArr));
                    }
                    Locale locale = Locale.getDefault();
                    HashMap hashMap = zza.zza;
                    zzwVar = Room.forException(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, hashMap.containsKey(-1) ? Boxes$$ExternalSyntheticOutline1.m((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) zza.zzb.get(-1), ")") : ""), null, null)));
                } else {
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    zztVar.zzc().post(new zzm(zztVar, taskCompletionSource, taskCompletionSource, new zzf(zziVar, taskCompletionSource, taskCompletionSource)));
                    zzwVar = taskCompletionSource.zza;
                }
                zzwVar.addOnCompleteListener(new RealInAppReviewLauncher$$ExternalSyntheticLambda0(eglCore, i2));
                break;
            case 1:
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator;
                OffersTimelineViewEventV2 offersTimelineViewEventV2 = (OffersTimelineViewEventV2) obj;
                if (!Intrinsics.areEqual(offersTimelineViewEventV2, OffersTimelineViewEventV2.SheetDismissed.INSTANCE)) {
                    if (!Intrinsics.areEqual(offersTimelineViewEventV2, OffersTimelineViewEventV2.BackClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator.goTo(((OffersScreen$OffersTimelineScreenV2) inviteErrorPresenter.args).originScreen);
                    }
                } else {
                    screenNavigator.goTo(back);
                }
                break;
            case 2:
                ((RealOffersSearchPresenter) obj2).analytics.clearCache();
                break;
            case 3:
                if (!Intrinsics.areEqual((AccountPickerErrorViewEvent$Close) obj, AccountPickerErrorViewEvent$Close.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator);
                    break;
                }
            case 4:
                AccountPickerOptionsMenuViewEvent$SelectOption accountPickerOptionsMenuViewEvent$SelectOption = (AccountPickerOptionsMenuViewEvent$SelectOption) obj;
                if (accountPickerOptionsMenuViewEvent$SelectOption == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((CardStudioUndoDialogPresenter) obj2).navigator.goTo(new Finish(OnboardingAccountPickerOptionsMenuScreen.Result.values()[accountPickerOptionsMenuViewEvent$SelectOption.optionId]));
                    break;
                }
            case 5:
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj2;
                OnboardingConfirmAccountRemovalScreen onboardingConfirmAccountRemovalScreen = (OnboardingConfirmAccountRemovalScreen) verifyCheckDialogPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator;
                ConfirmAccountRemovalViewEvent confirmAccountRemovalViewEvent = (ConfirmAccountRemovalViewEvent) obj;
                if (!Intrinsics.areEqual(confirmAccountRemovalViewEvent, ConfirmAccountRemovalViewEvent.NegativeClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(confirmAccountRemovalViewEvent, ConfirmAccountRemovalViewEvent.PositiveClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator2.goTo(new Finish(new OnboardingConfirmAccountRemovalScreen$Result$Remove(onboardingConfirmAccountRemovalScreen.account)));
                    }
                } else {
                    screenNavigator2.goTo(new Finish(new OnboardingConfirmAccountRemovalScreen$Result$Cancel(onboardingConfirmAccountRemovalScreen.account)));
                }
                break;
            case 6:
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator;
                CountrySelectorViewEvent countrySelectorViewEvent = (CountrySelectorViewEvent) obj;
                if (!(countrySelectorViewEvent instanceof CountrySelectorViewEvent.Dismissed)) {
                    if (!(countrySelectorViewEvent instanceof CountrySelectorViewEvent.Selected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator3.goTo(new Finish(new SelectedCountry(((CountrySelectorViewEvent.Selected) countrySelectorViewEvent).country)));
                    }
                } else {
                    screenNavigator3.goTo(back);
                }
                break;
            case 7:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj2;
                Analytics analytics = (Analytics) workHomePresenter.shiftSection2Presenter;
                OnboardingLandingViewEvent onboardingLandingViewEvent = (OnboardingLandingViewEvent) obj;
                if (!(onboardingLandingViewEvent instanceof OnboardingLandingViewEvent.GetStartedClicked)) {
                    if (!(onboardingLandingViewEvent instanceof OnboardingLandingViewEvent.VideoLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        analytics.track(new AppIntroViewWelcomeVideoLoaded(new Long(((OnboardingLandingViewEvent.VideoLoaded) onboardingLandingViewEvent).loadTimeMs)), null);
                    }
                } else {
                    analytics.track(new AppIntroInteractGetStartedTapped(new Long(((OnboardingLandingViewEvent.GetStartedClicked) onboardingLandingViewEvent).tapTimeMs)), null);
                    ((BetterNavigator.ScreenNavigator) workHomePresenter.titleBarPresenter).goTo(((OnboardingLandingScreen) workHomePresenter.shiftsAnalytics).nextScreen);
                }
                break;
            case 8:
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                if ((amountPickerViewEvent instanceof AmountPickerViewEvent$Full$Close) || (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$SystemBack)) {
                    screenNavigator4.goTo(back);
                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted) {
                    screenNavigator4.giveAnswer(((CustomAllocationScreen) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider).question, new Float((((AmountPickerViewEvent$Full$PercentSubmitted) amountPickerViewEvent).amount.longValue() * 100) / 10000.0f));
                }
                break;
            case 9:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                if (!Intrinsics.areEqual((PaychecksReceiptViewEvent$Close) obj, paychecksReceiptViewEvent$Close)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((Analytics) localHomePresenter.localHomeGeoPresenterFactory).track(new PaychecksDismissPaycheckReceipt(), null);
                    ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(back);
                    break;
                }
            case 10:
                if (((PaycheckAlertDialogViewEvent$TapPrimaryButton) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(new Finish(new PaycheckAlertDialogScreen.Result(true)));
                    break;
                }
            case 11:
                LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj2;
                if (!Intrinsics.areEqual((PaychecksReceiptViewEvent$Close) obj, paychecksReceiptViewEvent$Close)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((Analytics) localHomePresenter2.localHomeGeoPresenterFactory).track(new PaychecksDismissPaycheckReceipt(), null);
                    ((BetterNavigator.ScreenNavigator) localHomePresenter2.navigator).goTo(back);
                    break;
                }
            case 12:
                InviteErrorPresenter inviteErrorPresenter2 = (InviteErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter2.navigator;
                PaychecksActivityListViewEvent paychecksActivityListViewEvent = (PaychecksActivityListViewEvent) obj;
                if (!(paychecksActivityListViewEvent instanceof PaychecksActivityListViewEvent.AggregationSelected)) {
                    if (!(paychecksActivityListViewEvent instanceof PaychecksActivityListViewEvent.Close)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator5.goTo(back);
                    }
                } else {
                    Analytics analytics2 = (Analytics) inviteErrorPresenter2.analytics;
                    PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = ((PaychecksActivityListViewEvent.AggregationSelected) paychecksActivityListViewEvent).aggregation;
                    TimeZone timeZone = UtilsKt.paycheckTimeZone;
                    analytics2.track(new PaychecksShowMonthlyAggregatePaycheckReceipt(Integer.valueOf((int) calendarMonthPaychecksAggregation.monthInYear), Integer.valueOf((int) calendarMonthPaychecksAggregation.year), Boolean.FALSE), null);
                    screenNavigator5.goTo(new PaycheckAggregationReceiptScreen(calendarMonthPaychecksAggregation));
                }
                break;
            case 13:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                LowDiskSpaceAlertViewEvent lowDiskSpaceAlertViewEvent = (LowDiskSpaceAlertViewEvent) obj;
                if (!Intrinsics.areEqual(lowDiskSpaceAlertViewEvent, LowDiskSpaceAlertViewEvent.NegativeButtonClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(lowDiskSpaceAlertViewEvent, LowDiskSpaceAlertViewEvent.PositiveButtonClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator6.goTo(back);
                    }
                } else {
                    screenNavigator6.goTo(back);
                    Context context = (Context) shareSheetPresenter.shareTargetsManager;
                    Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
                    intent.setFlags(268435456);
                    Intents.maybeStartActivity(context, intent, new CameraX$$ExternalSyntheticLambda0(context, 12));
                }
                break;
            case 14:
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator;
                ConfirmDuplicateDialogViewEvent confirmDuplicateDialogViewEvent = (ConfirmDuplicateDialogViewEvent) obj;
                if (!(confirmDuplicateDialogViewEvent instanceof ConfirmDuplicateDialogViewEvent.Confirm)) {
                    if (!(confirmDuplicateDialogViewEvent instanceof ConfirmDuplicateDialogViewEvent.Cancel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator7.goTo(new Finish(AlertDialogResult.NEGATIVE));
                    }
                } else {
                    screenNavigator7.goTo(new Finish(AlertDialogResult.POSITIVE));
                }
                break;
            case 15:
                SsnPresenter ssnPresenter = (SsnPresenter) obj2;
                ConfirmRecipientDialogViewEvent confirmRecipientDialogViewEvent = (ConfirmRecipientDialogViewEvent) obj;
                ConfirmRecipientDialogPresenter$ConfirmRecipientOptions.Companion.getClass();
                confirmRecipientDialogViewEvent.getClass();
                ConfirmRecipientDialogPresenter$ConfirmRecipientOptions confirmRecipientDialogPresenter$ConfirmRecipientOptions = (ConfirmRecipientDialogPresenter$ConfirmRecipientOptions) ConfirmRecipientDialogPresenter$ConfirmRecipientOptions.map.get(confirmRecipientDialogViewEvent);
                if (confirmRecipientDialogPresenter$ConfirmRecipientOptions != null) {
                    Analytics analytics3 = (Analytics) ssnPresenter.args;
                    PaymentScreens.ConfirmRecipient.Analytics analytics4 = ((PaymentScreens.ConfirmRecipient) ssnPresenter.blockersHelper).analytics;
                    RecipientSearchSelectBlockerOption.BlockerOption blockerOption = confirmRecipientDialogPresenter$ConfirmRecipientOptions.blockerOption;
                    String str2 = analytics4 != null ? analytics4.externalId : null;
                    Map map = RecipientAnalyticsKt.SEARCH_TYPES;
                    if (analytics4 == null || (origin2 = analytics4.origin) == null) {
                        origin = null;
                    } else {
                        String name = origin2.name();
                        if (name != null) {
                            try {
                                Result.Companion companion = Result.Companion;
                                String upperCase = name.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                failure2 = RecipientSearchSelectBlockerOption.Origin.valueOf(upperCase);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure2 = new Result.Failure(th);
                            }
                            if (failure2 instanceof Result.Failure) {
                                failure2 = null;
                            }
                            r02 = (Enum) failure2;
                        } else {
                            r02 = null;
                        }
                        origin = (RecipientSearchSelectBlockerOption.Origin) r02;
                    }
                    String str3 = analytics4 != null ? analytics4.entityToken : null;
                    if (analytics4 == null || (blockerReason2 = analytics4.blockerReason) == null) {
                        blockerReason = null;
                    } else {
                        String name2 = blockerReason2.name();
                        if (name2 != null) {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                String upperCase2 = name2.toUpperCase(Locale.ROOT);
                                upperCase2.getClass();
                                failure = RecipientSearchSelectBlockerOption.BlockerReason.valueOf(upperCase2);
                            } catch (Throwable th2) {
                                Result.Companion companion4 = Result.Companion;
                                failure = new Result.Failure(th2);
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            r0 = (Enum) failure;
                        } else {
                            r0 = null;
                        }
                        blockerReason = (RecipientSearchSelectBlockerOption.BlockerReason) r0;
                    }
                    analytics3.track(new RecipientSearchSelectBlockerOption(str2, origin, str3, blockerReason, analytics4 != null ? analytics4.queryToken : null, blockerOption), null);
                    ssnPresenter.navigator.goTo(new Finish(confirmRecipientDialogPresenter$ConfirmRecipientOptions.result));
                }
                break;
            case 16:
                BetterNavigator.ScreenNavigator screenNavigator8 = ((AddAliasPresenter) obj2).navigator;
                ContactSyncViewEvent contactSyncViewEvent = (ContactSyncViewEvent) obj;
                if (!(contactSyncViewEvent instanceof ContactSyncViewEvent.Cancel)) {
                    if (!(contactSyncViewEvent instanceof ContactSyncViewEvent.Confirm)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator8.goTo(new Finish(AlertDialogResult.POSITIVE));
                    }
                } else {
                    screenNavigator8.goTo(new Finish(AlertDialogResult.NEGATIVE));
                }
                break;
            case 17:
                TaxReturnsPresenter taxReturnsPresenter2 = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter2.navigator;
                DuplicatePaymentViewEvent duplicatePaymentViewEvent = (DuplicatePaymentViewEvent) obj;
                if (!Intrinsics.areEqual(duplicatePaymentViewEvent, DuplicatePaymentViewEvent.Continue.INSTANCE)) {
                    if (!Intrinsics.areEqual(duplicatePaymentViewEvent, DuplicatePaymentViewEvent.GoBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator9.goTo(back);
                    }
                } else {
                    PaymentScreens.DuplicatePayment duplicatePayment = (PaymentScreens.DuplicatePayment) taxReturnsPresenter2.taxesDocumentsTaxReturnsDataProvider;
                    screenNavigator9.giveAnswer(duplicatePayment.question, new PaymentScreens.DuplicatePayment.DuplicatePaymentResult((Recipient) duplicatePayment.recipient.getValue()));
                }
                break;
            case 18:
                TaxReturnsPresenter taxReturnsPresenter3 = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator10 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter3.navigator;
                NearbyPayRequestHelpViewEvent nearbyPayRequestHelpViewEvent = (NearbyPayRequestHelpViewEvent) obj;
                if (!Intrinsics.areEqual(nearbyPayRequestHelpViewEvent, NearbyPayRequestHelpViewEvent.CloseClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(nearbyPayRequestHelpViewEvent, NearbyPayRequestHelpViewEvent.MoreInfoClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator10.goTo(new PaymentScreens.NearbyPaymentsInfo(((PaymentScreens.NearbyPayRequestHelp) taxReturnsPresenter3.router).flowToken));
                    }
                } else {
                    screenNavigator10.goTo(back);
                }
                break;
            case 19:
                if (!Intrinsics.areEqual((NearbyPayersSheetViewEvent$OnDismiss) obj, NearbyPayersSheetViewEvent$OnDismiss.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 20:
                TaxReturnsPresenter taxReturnsPresenter4 = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator11 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter4.navigator;
                NearbyPaymentsInfoViewEvent nearbyPaymentsInfoViewEvent = (NearbyPaymentsInfoViewEvent) obj;
                if (!Intrinsics.areEqual(nearbyPaymentsInfoViewEvent, NearbyPaymentsInfoViewEvent.OnBackClicked.INSTANCE)) {
                    if (!(nearbyPaymentsInfoViewEvent instanceof NearbyPaymentsInfoViewEvent.OnNavigationItemClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        NearbyPaymentsInfoItem nearbyPaymentsInfoItem = ((NearbyPaymentsInfoViewEvent.OnNavigationItemClicked) nearbyPaymentsInfoViewEvent).item;
                        AndroidStringManager androidStringManager = (AndroidStringManager) taxReturnsPresenter4.taxesDocumentsTaxReturnsDataProvider;
                        int ordinal = nearbyPaymentsInfoItem.ordinal();
                        if (ordinal == 0) {
                            nearbyOrderedListsScreen = new NearbyOrderedListsScreen(androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_title), androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_description), CollectionsKt__CollectionsKt.listOf((Object[]) new ListSection[]{new ListSection(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_step_1), androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_step_2), androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_step_3), androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_step_4)})), new ListSection("", androidStringManager.get(R.string.nearby_ordered_lists_good_to_know), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_gk_1), androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_gk_2), androidStringManager.get(R.string.nearby_ordered_lists_how_to_pay_gk_3)}))}));
                        } else if (ordinal == 1) {
                            nearbyOrderedListsScreen = new NearbyOrderedListsScreen(androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_title), androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_description), CollectionsKt__CollectionsKt.listOf((Object[]) new ListSection[]{new ListSection(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_step_1), androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_step_2), androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_step_3)})), new ListSection("", androidStringManager.get(R.string.nearby_ordered_lists_good_to_know), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_gk_1), androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_gk_2), androidStringManager.get(R.string.nearby_ordered_lists_how_to_get_paid_gk_3)}))}));
                        } else if (ordinal == 2) {
                            nearbyOrderedListsScreen = new NearbyOrderedListsScreen(androidStringManager.get(R.string.nearby_ordered_lists_privacy_title), androidStringManager.get(R.string.nearby_ordered_lists_privacy_description), CollectionsKt__CollectionsKt.listOf((Object[]) new ListSection[]{new ListSection(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_privacy_item_1), androidStringManager.get(R.string.nearby_ordered_lists_privacy_item_2), androidStringManager.get(R.string.nearby_ordered_lists_privacy_item_3), androidStringManager.get(R.string.nearby_ordered_lists_privacy_item_4)})), new ListSection("", androidStringManager.get(R.string.nearby_ordered_lists_if_something_feels_wrong), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_privacy_safety_1), androidStringManager.get(R.string.nearby_ordered_lists_privacy_safety_2)}))}));
                        } else if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            nearbyOrderedListsScreen = new NearbyOrderedListsScreen(androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_title), androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_description), CollectionsKt__CollectionsJVMKt.listOf(new ListSection(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_item_1), androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_item_2), androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_item_3), androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_item_4), androidStringManager.get(R.string.nearby_ordered_lists_troubleshooting_item_5)}))));
                        }
                        screenNavigator11.goTo(nearbyOrderedListsScreen);
                    }
                } else {
                    screenNavigator11.goTo(back);
                }
                break;
            case 21:
                BetterNavigator.ScreenNavigator screenNavigator12 = (BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator;
                NearbyPeopleOverflowSheetViewEvent nearbyPeopleOverflowSheetViewEvent = (NearbyPeopleOverflowSheetViewEvent) obj;
                if (!Intrinsics.areEqual(nearbyPeopleOverflowSheetViewEvent, NearbyPeopleOverflowSheetViewEvent.OnDismiss.INSTANCE)) {
                    if (!(nearbyPeopleOverflowSheetViewEvent instanceof NearbyPeopleOverflowSheetViewEvent.OnPersonClicked)) {
                        if (!(nearbyPeopleOverflowSheetViewEvent instanceof NearbyPeopleOverflowSheetViewEvent.OnAvatarClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            UUID generate = RealUuidGenerator.generate();
                            NearbyPerson nearbyPerson = ((NearbyPeopleOverflowSheetViewEvent.OnAvatarClicked) nearbyPeopleOverflowSheetViewEvent).person;
                            String str4 = nearbyPerson.customerToken;
                            String str5 = nearbyPerson.cashtag;
                            String str6 = nearbyPerson.name;
                            NearbyAvatarInfo nearbyAvatarInfo = nearbyPerson.avatar;
                            zzahg.goToProfileScreen(screenNavigator12, generate, new com.squareup.cash.recipients.data.Recipient(null, false, false, str4, null, str5, true, false, false, null, null, null, nearbyAvatarInfo.image, null, null, false, 0L, null, null, false, null, nearbyAvatarInfo.accentColor, null, null, null, str6, null, null, false, null, null, false, false, null, -35655785, 3), CustomerProfileViewOpen.EntryPoint.QUICK_PAY_AVATAR, new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), GetProfileDetailsContext.PAYMENT_FLOW);
                        }
                    } else {
                        NearbyPerson nearbyPerson2 = ((NearbyPeopleOverflowSheetViewEvent.OnPersonClicked) nearbyPeopleOverflowSheetViewEvent).person;
                        String str7 = nearbyPerson2.customerToken;
                        String str8 = nearbyPerson2.cashtag;
                        String str9 = nearbyPerson2.name;
                        NearbyAvatarInfo nearbyAvatarInfo2 = nearbyPerson2.avatar;
                        screenNavigator12.goTo(new PaymentScreens.NearbyPaymentKeypad(new PaymentScreens.NearbyPayRequest(null), new RedactedParcelable(new com.squareup.cash.recipients.data.Recipient(null, false, false, str7, null, str8, true, false, false, null, null, null, nearbyAvatarInfo2.image, null, null, false, 0L, null, null, false, null, nearbyAvatarInfo2.accentColor, null, null, null, str9, null, null, false, null, null, false, false, null, -35655785, 3)), nearbyPerson2.nearbySessionToken, null));
                    }
                } else {
                    screenNavigator12.goTo(back);
                }
                break;
            case 22:
                if (((NoteRequiredViewEvent$Close) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 23:
                TaxReturnsPresenter taxReturnsPresenter5 = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator13 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter5.navigator;
                Analytics analytics5 = (Analytics) taxReturnsPresenter5.taxesDocumentsTaxReturnsDataProvider;
                PaymentScreens.QuickPayDetails quickPayDetails = (PaymentScreens.QuickPayDetails) taxReturnsPresenter5.router;
                QuickPayDetailsViewEvent quickPayDetailsViewEvent = (QuickPayDetailsViewEvent) obj;
                if (!Intrinsics.areEqual(quickPayDetailsViewEvent, QuickPayDetailsViewEvent.ChangeOrientationClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(quickPayDetailsViewEvent, QuickPayDetailsViewEvent.CloseClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator13.goTo(back);
                    }
                } else {
                    int i3 = QuickPayDetailsPresenter$WhenMappings.$EnumSwitchMapping$0[quickPayDetails.paymentOrientation.ordinal()];
                    if (i3 == 1) {
                        analytics5.track(new AssetSendChangeOrientation(quickPayDetails.analytics.externalPaymentId.toString()), null);
                        orientation = Orientation.BILL;
                    } else if (i3 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        analytics5.track(new AssetRequestChangeOrientation(quickPayDetails.analytics.externalPaymentId.toString()), null);
                        orientation = Orientation.CASH;
                    }
                    screenNavigator13.goTo(new Finish(new PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged(orientation)));
                }
                break;
            case 24:
                if (((RecipientSelectionWarningViewEvent$Finish) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    InviteErrorPresenter inviteErrorPresenter3 = (InviteErrorPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator14 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter3.navigator;
                    Screen screen = ((PaymentScreens.RecipientSelectionWarningScreen) inviteErrorPresenter3.args).exitScreen;
                    if (screen == null) {
                        screen = new Finish(AlertDialogResult.POSITIVE);
                    }
                    screenNavigator14.goTo(screen);
                    break;
                }
            case 25:
                if (((WarningDialogViewEvent$ButtonClicked) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((ErrorPresenter) obj2).navigator.goTo(back);
                    break;
                }
            case 26:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AggregatingScrollPerformanceTracker aggregatingScrollPerformanceTracker = ((ScrollPerformanceNode) obj2).tracker;
                if (booleanValue) {
                    AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0 aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0 = aggregatingScrollPerformanceTracker.frameCallback;
                    FrameCallbackScheduler frameCallbackScheduler = aggregatingScrollPerformanceTracker.frameCallbackScheduler;
                    ArrayList arrayList = aggregatingScrollPerformanceTracker.frameTimestamps;
                    if (!aggregatingScrollPerformanceTracker.isScrolling) {
                        aggregatingScrollPerformanceTracker.isScrolling = true;
                        aggregatingScrollPerformanceTracker.clock.getClass();
                        aggregatingScrollPerformanceTracker.currentScrollStartMs = System.currentTimeMillis();
                        arrayList.clear();
                        arrayList.add(Long.valueOf(aggregatingScrollPerformanceTracker.currentScrollStartMs * 1000000));
                        ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) frameCallbackScheduler;
                        toolbarTuckTargets.getClass();
                        aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0.getClass();
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) ((LinkedHashMap) toolbarTuckTargets.endCornerCenterX$delegate).get(aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0);
                        if (frameCallback != null) {
                            ((Choreographer) toolbarTuckTargets.startCornerCenterX$delegate).removeFrameCallback(frameCallback);
                        }
                        toolbarTuckTargets.postFrameCallback(aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0);
                    }
                } else {
                    aggregatingScrollPerformanceTracker.stopScrollEvent();
                }
                break;
            case 27:
                LocalHomePresenter localHomePresenter3 = (LocalHomePresenter) obj2;
                BlockersScreens.PersonaDidvScreen personaDidvScreen = (BlockersScreens.PersonaDidvScreen) localHomePresenter3.localHomeGeoPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator15 = (BetterNavigator.ScreenNavigator) localHomePresenter3.navigator;
                PersonaDidvViewEvent personaDidvViewEvent = (PersonaDidvViewEvent) obj;
                if ((personaDidvViewEvent instanceof PersonaDidvViewEvent.DialogResult) && (((PersonaDidvViewEvent.DialogResult) personaDidvViewEvent).screen instanceof FailureMessageBlockerScreen)) {
                    screenNavigator15.goTo(personaDidvScreen.blockersData.exitScreen);
                } else if ((personaDidvViewEvent instanceof PersonaDidvViewEvent.DialogCanceled) && (((PersonaDidvViewEvent.DialogCanceled) personaDidvViewEvent).screen instanceof FailureMessageBlockerScreen)) {
                    screenNavigator15.goTo(personaDidvScreen.blockersData.exitScreen);
                }
                break;
            case 28:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator16 = (BetterNavigator.ScreenNavigator) workHomePresenter2.payPresenter;
                if (!(blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner)) {
                    if (!(blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen)) {
                        if (!(blockersAction instanceof BlockersHelper.BlockersAction.ShowError)) {
                            Path$$ExternalSyntheticBUOutline0.m$1(blockersAction, "Unsupported action: ");
                            break;
                        } else {
                            screenNavigator16.goTo(new FailureMessageBlockerScreen(((PhonePlansEsimCheckBlockerScreen) workHomePresenter2.shiftSection2Presenter).blockersData, null, ((BlockersHelper.BlockersAction.ShowError) blockersAction).message, 2));
                        }
                    } else {
                        screenNavigator16.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                    }
                }
                break;
            default:
                BlockersHelper.BlockersAction blockersAction2 = (BlockersHelper.BlockersAction) obj;
                PhonePlansNewLineLoadingPresenter phonePlansNewLineLoadingPresenter = (PhonePlansNewLineLoadingPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator17 = phonePlansNewLineLoadingPresenter.navigator;
                if (!(blockersAction2 instanceof BlockersHelper.BlockersAction.ToggleSpinner)) {
                    if (!(blockersAction2 instanceof BlockersHelper.BlockersAction.ShowScreen)) {
                        if (!(blockersAction2 instanceof BlockersHelper.BlockersAction.ShowError)) {
                            Path$$ExternalSyntheticBUOutline0.m$1(blockersAction2, "Unsupported action: ");
                            break;
                        } else {
                            screenNavigator17.goTo(new FailureMessageBlockerScreen(phonePlansNewLineLoadingPresenter.args.blockersData, null, ((BlockersHelper.BlockersAction.ShowError) blockersAction2).message, 2));
                        }
                    } else {
                        screenNavigator17.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction2).screen);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ HomeViewPresenter$models$4$1$2(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }
}
