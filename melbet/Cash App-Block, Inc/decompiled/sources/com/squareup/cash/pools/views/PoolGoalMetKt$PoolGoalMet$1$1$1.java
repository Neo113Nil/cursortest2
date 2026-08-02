package com.squareup.cash.pools.views;

import android.content.Context;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.squareup.cash.account.settings.viewmodels.ConfirmReplaceInfoViewEvent;
import com.squareup.cash.account.settings.viewmodels.ErrorViewEvent$GoBack;
import com.squareup.cash.account.settings.viewmodels.ProfileCashtagRequiredViewEvent$Close;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewEvent$OkClick;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfileUnavailableViewEvent$PositiveButtonClicked;
import com.squareup.cash.account.settings.viewmodels.ReferralStatusViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.cdf.asset.AssetPoolClosePoolStart;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveCompleteStatus;
import com.squareup.cash.cdf.referralreward.ReferralRewardReceiveViewStatus;
import com.squareup.cash.cdf.system.SystemNotificationSettingsOrigin;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceRemoveRetry;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceViewDetails;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.backend.real.PoolsRefresher;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.PoolMoreOptionsBottomSheet;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewEvent;
import com.squareup.cash.pools.views.animation.AvatarLayoutAnimationStateHolder;
import com.squareup.cash.pools.views.animation.AvatarLayoutAnimationStateHolder$animateIn$2;
import com.squareup.cash.pools.views.animation.GoalMetAnimationStateHolder;
import com.squareup.cash.pools.views.animation.GoalMetAnimationStateHolder$animateIn$2;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder;
import com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder$animateIn$2;
import com.squareup.cash.profile.devicemanager.backend.LoggedInDevice;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.ConfirmRemoveDevicesViewEvent$PositiveClick;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewEvent;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.ReferralStatusPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.results.CropSuccessResult;
import com.squareup.cash.profile.screens.ActivePasswordDialog;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.screens.SearchVisibilityScreen;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewEvent$ConfirmationClicked;
import com.squareup.cash.profile.viewmodels.AddAliasViewEvent;
import com.squareup.cash.profile.viewmodels.AddressSheetResponse;
import com.squareup.cash.profile.viewmodels.AddressSheetViewEvent;
import com.squareup.cash.profile.viewmodels.OpenSourceViewEvent;
import com.squareup.cash.profile.viewmodels.PaymentNotificationOptionsViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileConfirmRemoveAliasViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutResult;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileCropViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewEvent;
import com.squareup.cash.profile.viewmodels.RingtoneViewEvent;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolState;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.RealIntentFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class PoolGoalMetKt$PoolGoalMet$1$1$1 implements FlowCollector {
    public final /* synthetic */ Object $animation;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PoolGoalMetKt$PoolGoalMet$1$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$animation = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        TrustedDeviceViewDetails.DeviceType deviceType;
        Screen deviceManagerListScreen;
        int i = this.$r8$classId;
        int i2 = 0;
        Back back = Back.INSTANCE;
        Object obj2 = this.$animation;
        Continuation continuation2 = null;
        switch (i) {
            case 0:
                GoalMetTimeline.Step step = (GoalMetTimeline.Step) obj;
                GoalMetAnimationStateHolder goalMetAnimationStateHolder = (GoalMetAnimationStateHolder) obj2;
                if (step != GoalMetTimeline.Step.SHOW_HERO) {
                    if (step != GoalMetTimeline.Step.HIDE_HERO) {
                        break;
                    } else {
                        goalMetAnimationStateHolder.getClass();
                        Object coroutineScope = JobKt.coroutineScope(new GoalMetAnimationStateHolder$animateIn$2(goalMetAnimationStateHolder, continuation2, 1), continuation);
                        if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    }
                } else {
                    goalMetAnimationStateHolder.getClass();
                    Object coroutineScope2 = JobKt.coroutineScope(new GoalMetAnimationStateHolder$animateIn$2(goalMetAnimationStateHolder, continuation2, i2), continuation);
                    if (coroutineScope2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    RealPoolsRepository realPoolsRepository = ((PoolsRefresher) obj2).poolsRepository;
                    Object withContext = JobKt.withContext(realPoolsRepository.ioDispatcher, new RingtoneView.AnonymousClass1(realPoolsRepository, continuation2, 2), continuation);
                    if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 2:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj2;
                FlowStarter flowStarter = (FlowStarter) workHomePresenter.shiftsAnalytics;
                Analytics analytics = (Analytics) workHomePresenter.shiftSection2Presenter;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter;
                PoolMoreOptionsBottomSheet poolMoreOptionsBottomSheet = (PoolMoreOptionsBottomSheet) workHomePresenter.payPresenter;
                PoolMoreOptionsBottomSheetViewEvent poolMoreOptionsBottomSheetViewEvent = (PoolMoreOptionsBottomSheetViewEvent) obj;
                if (!(poolMoreOptionsBottomSheetViewEvent instanceof PoolMoreOptionsBottomSheetViewEvent.Dismiss)) {
                    if (!(poolMoreOptionsBottomSheetViewEvent instanceof PoolMoreOptionsBottomSheetViewEvent.ShowParticipants)) {
                        if (!(poolMoreOptionsBottomSheetViewEvent instanceof PoolMoreOptionsBottomSheetViewEvent.ClosePool)) {
                            if (!Intrinsics.areEqual(poolMoreOptionsBottomSheetViewEvent, PoolMoreOptionsBottomSheetViewEvent.LeavePool.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                String str = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).pool_token;
                                str.getClass();
                                String str2 = poolMoreOptionsBottomSheet.flowToken;
                                Money money = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).target;
                                money.getClass();
                                double amount = Moneys.amount(money);
                                ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).balance.getClass();
                                zzahx.trackLeavePoolStart(analytics, str, str2, amount, Moneys.amount(r3));
                                String str3 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).pool_token;
                                str3.getClass();
                                screenNavigator.goTo(((RealFlowStarter) flowStarter).startLeavePoolFlow(str3, poolMoreOptionsBottomSheet.leavePoolOrigin));
                            }
                        } else {
                            String str4 = poolMoreOptionsBottomSheet.flowToken;
                            String str5 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).pool_token;
                            str5.getClass();
                            Money money2 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).balance;
                            money2.getClass();
                            double amount2 = Moneys.amount(money2);
                            str4.getClass();
                            analytics.track(new AssetPoolClosePoolStart(Double.valueOf(amount2), str4, str5), null);
                            String str6 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).pool_token;
                            str6.getClass();
                            String str7 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).pool_token;
                            str7.getClass();
                            screenNavigator.goTo(((RealFlowStarter) flowStarter).startClosePoolFlow(str6, new PoolDetailsScreen(str7, null, null, null, null, null, 62)));
                        }
                    } else {
                        String str8 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).pool_token;
                        str8.getClass();
                        PoolOwner poolOwner = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).owner;
                        poolOwner.getClass();
                        RedactedParcelable redactedParcelable = new RedactedParcelable(poolOwner);
                        RedactedParcelableList redactList = DBUtil.redactList(((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).participants);
                        String str9 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).share_link;
                        boolean z = poolMoreOptionsBottomSheet.viewerCanLeavePool;
                        String str10 = poolMoreOptionsBottomSheet.flowToken;
                        Money money3 = ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).target;
                        money3.getClass();
                        double amount3 = Moneys.amount(money3);
                        ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).balance.getClass();
                        screenNavigator.goTo(new PoolMemberListScreen(str8, redactedParcelable, redactList, str9, z, str10, amount3, Moneys.amount(r1), ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).status == PoolState.POOL_STATE_MANUAL_CLOSED || ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).closed_at != null || ((MoneyPool) poolMoreOptionsBottomSheet.pool.getValue()).status == PoolState.POOL_STATE_CLOSING, poolMoreOptionsBottomSheet.leavePoolOrigin));
                    }
                } else {
                    screenNavigator.goTo(back);
                }
                break;
            case 3:
                GoalMetTimeline.Step step2 = (GoalMetTimeline.Step) obj;
                PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder = (PoolDetailsAnimationStateHolder) obj2;
                if (step2 != GoalMetTimeline.Step.COLLAPSE_DETAILS) {
                    if (step2 != GoalMetTimeline.Step.EXPAND_DETAILS) {
                        break;
                    } else {
                        poolDetailsAnimationStateHolder.getClass();
                        Object coroutineScope3 = JobKt.coroutineScope(new PoolDetailsAnimationStateHolder$animateIn$2(poolDetailsAnimationStateHolder, continuation2, i2), continuation);
                        if (coroutineScope3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    }
                } else {
                    poolDetailsAnimationStateHolder.getClass();
                    Object coroutineScope4 = JobKt.coroutineScope(new PoolDetailsAnimationStateHolder$animateIn$2(poolDetailsAnimationStateHolder, continuation2, r4), continuation);
                    if (coroutineScope4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 4:
                GoalMetTimeline.Step step3 = (GoalMetTimeline.Step) obj;
                AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder = (AvatarLayoutAnimationStateHolder) obj2;
                if (step3 != GoalMetTimeline.Step.SHOW_HERO) {
                    if (step3 != GoalMetTimeline.Step.HIDE_HERO) {
                        break;
                    } else {
                        avatarLayoutAnimationStateHolder.getClass();
                        Object coroutineScope5 = JobKt.coroutineScope(new AvatarLayoutAnimationStateHolder$animateIn$2(avatarLayoutAnimationStateHolder, continuation2, r4), continuation);
                        if (coroutineScope5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    }
                } else {
                    avatarLayoutAnimationStateHolder.getClass();
                    Object coroutineScope6 = JobKt.coroutineScope(new AvatarLayoutAnimationStateHolder$animateIn$2(avatarLayoutAnimationStateHolder, continuation2, i2), continuation);
                    if (coroutineScope6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 5:
                if (((Boolean) obj).booleanValue() && (delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2) != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 6:
                ConfirmRemoveDevicesViewEvent$PositiveClick confirmRemoveDevicesViewEvent$PositiveClick = (ConfirmRemoveDevicesViewEvent$PositiveClick) obj;
                if (!(confirmRemoveDevicesViewEvent$PositiveClick instanceof ConfirmRemoveDevicesViewEvent$PositiveClick)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((AddAliasPresenter) obj2).navigator.goTo(new Finish(confirmRemoveDevicesViewEvent$PositiveClick.result));
                    break;
                }
            case 7:
                LoggedInDevice loggedInDevice = (LoggedInDevice) obj;
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj2;
                if (loggedInDevice == null) {
                    pdfPreviewPresenter.navigator.goTo(back);
                } else {
                    RealDeviceManagerAnalytics realDeviceManagerAnalytics = (RealDeviceManagerAnalytics) pdfPreviewPresenter.fileProvider;
                    String format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Instant.ofEpochMilli(loggedInDevice.lastLogin.timestampMillis).atZone(ZoneOffset.UTC));
                    Analytics analytics2 = realDeviceManagerAnalytics.analytics;
                    Boolean valueOf = Boolean.valueOf(loggedInDevice.isThisDevice);
                    switch (loggedInDevice.deviceType.ordinal()) {
                        case 0:
                            deviceType = TrustedDeviceViewDetails.DeviceType.ANDROID;
                            break;
                        case 1:
                        case 7:
                            deviceType = TrustedDeviceViewDetails.DeviceType.OTHER;
                            break;
                        case 2:
                            deviceType = TrustedDeviceViewDetails.DeviceType.MAC;
                            break;
                        case 3:
                            deviceType = TrustedDeviceViewDetails.DeviceType.WINDOWS;
                            break;
                        case 4:
                            deviceType = TrustedDeviceViewDetails.DeviceType.IPAD;
                            break;
                        case 5:
                            deviceType = TrustedDeviceViewDetails.DeviceType.IPHONE;
                            break;
                        case 6:
                            deviceType = TrustedDeviceViewDetails.DeviceType.IPOD_TOUCH;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                    }
                    analytics2.track(new TrustedDeviceViewDetails(valueOf, format2, deviceType), null);
                }
                break;
            case 8:
                DeviceRemovalFailedViewEvent deviceRemovalFailedViewEvent = (DeviceRemovalFailedViewEvent) obj;
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
                DeviceManagerDeviceRemovalFailedScreen deviceManagerDeviceRemovalFailedScreen = (DeviceManagerDeviceRemovalFailedScreen) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
                if (!Intrinsics.areEqual(deviceRemovalFailedViewEvent, DeviceRemovalFailedViewEvent.TryAgain.INSTANCE)) {
                    if (!Intrinsics.areEqual(deviceRemovalFailedViewEvent, DeviceRemovalFailedViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        boolean z2 = deviceRemovalFailedViewEvent instanceof DeviceRemovalFailedViewEvent.TryAgain;
                        deviceManagerListScreen = new DeviceManagerListScreen(z2 ? deviceManagerDeviceRemovalFailedScreen.getFailedTokens() : EmptyList.INSTANCE, z2 ? 1 + deviceManagerDeviceRemovalFailedScreen.getRemoveAttemptCount() : 1);
                    }
                } else {
                    ((RealDeviceManagerAnalytics) taxReturnsPresenter.args).analytics.track(new TrustedDeviceRemoveRetry(Integer.valueOf(deviceManagerDeviceRemovalFailedScreen.getRemoveAttemptCount())), null);
                    if (deviceManagerDeviceRemovalFailedScreen.isRemoveAll()) {
                        boolean z3 = deviceRemovalFailedViewEvent instanceof DeviceRemovalFailedViewEvent.TryAgain;
                        deviceManagerListScreen = new DeviceManagerListScreen(z3 ? deviceManagerDeviceRemovalFailedScreen.getFailedTokens() : EmptyList.INSTANCE, z3 ? 1 + deviceManagerDeviceRemovalFailedScreen.getRemoveAttemptCount() : 1);
                    } else {
                        deviceManagerListScreen = new DeviceManagerDeviceDetailsScreen((String) CollectionsKt.first(deviceManagerDeviceRemovalFailedScreen.getFailedTokens()), deviceRemovalFailedViewEvent instanceof DeviceRemovalFailedViewEvent.TryAgain ? 1 + deviceManagerDeviceRemovalFailedScreen.getRemoveAttemptCount() : 1);
                    }
                }
                screenNavigator2.goTo(deviceManagerListScreen);
                break;
            case 9:
                if (!Intrinsics.areEqual((AccountSwitchInfoDialogViewEvent$ConfirmationClicked) obj, AccountSwitchInfoDialogViewEvent$ConfirmationClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((ErrorPresenter) obj2).navigator);
                    break;
                }
            case 10:
                BetterNavigator.ScreenNavigator screenNavigator3 = ((AddAliasPresenter) obj2).navigator;
                AddAliasViewEvent addAliasViewEvent = (AddAliasViewEvent) obj;
                if (!(addAliasViewEvent instanceof AddAliasViewEvent.AddAlias)) {
                    if (!Intrinsics.areEqual(addAliasViewEvent, AddAliasViewEvent.Exit.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator3.goTo(back);
                    }
                } else {
                    screenNavigator3.goTo(new Finish(((AddAliasViewEvent.AddAlias) addAliasViewEvent).result));
                }
                break;
            case 11:
                BetterNavigator.ScreenNavigator screenNavigator4 = ((ErrorPresenter) obj2).navigator;
                AddressSheetViewEvent addressSheetViewEvent = (AddressSheetViewEvent) obj;
                if (!(addressSheetViewEvent instanceof AddressSheetViewEvent.Cancel)) {
                    if (!(addressSheetViewEvent instanceof AddressSheetViewEvent.Replace)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator4.goTo(new Finish(AddressSheetResponse.REPLACE_ADDRESS));
                    }
                } else {
                    screenNavigator4.goTo(back);
                }
                break;
            case 12:
                ErrorPresenter errorPresenter = (ErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator5 = errorPresenter.navigator;
                if (!Intrinsics.areEqual((ErrorViewEvent$GoBack) obj, ErrorViewEvent$GoBack.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    screenNavigator5.goTo(back);
                    if (((ProfileScreens.ErrorScreen) errorPresenter.args).closeParentScreen) {
                        screenNavigator5.goTo(back);
                    }
                    break;
                }
            case 13:
                NavAction$$ExternalSyntheticOutline0.m((Object) null, ((ErrorPresenter) obj2).navigator);
                break;
            case 14:
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) obj2;
                OpenSourceViewEvent openSourceViewEvent = (OpenSourceViewEvent) obj;
                if (!Intrinsics.areEqual(openSourceViewEvent, OpenSourceViewEvent.Exit.INSTANCE)) {
                    if (!(openSourceViewEvent instanceof OpenSourceViewEvent.OpenUrl)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        ((Context) workHomePresenter2.payPresenter).startActivity(((RealIntentFactory) workHomePresenter2.youPresenter).createUrlIntent(((OpenSourceViewEvent.OpenUrl) openSourceViewEvent).url));
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) workHomePresenter2.shiftsAnalytics).goTo(back);
                }
                break;
            case 15:
                BetterNavigator.ScreenNavigator screenNavigator6 = ((AddAliasPresenter) obj2).navigator;
                PaymentNotificationOptionsViewEvent paymentNotificationOptionsViewEvent = (PaymentNotificationOptionsViewEvent) obj;
                if (!Intrinsics.areEqual(paymentNotificationOptionsViewEvent, PaymentNotificationOptionsViewEvent.Exit.INSTANCE)) {
                    if (!(paymentNotificationOptionsViewEvent instanceof PaymentNotificationOptionsViewEvent.PickRingtone)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        PaymentNotificationOptionsViewEvent.PickRingtone pickRingtone = (PaymentNotificationOptionsViewEvent.PickRingtone) paymentNotificationOptionsViewEvent;
                        screenNavigator6.goTo(new ProfileScreens.RingtoneScreen(pickRingtone.currentRingtone, pickRingtone.additionalItems, true, true));
                    }
                } else {
                    screenNavigator6.goTo(back);
                }
                break;
            case 16:
                if (!Intrinsics.areEqual((ProfileCashtagRequiredViewEvent$Close) obj, ProfileCashtagRequiredViewEvent$Close.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator);
                    break;
                }
            case 17:
                BetterNavigator.ScreenNavigator screenNavigator7 = ((ErrorPresenter) obj2).navigator;
                ProfileConfirmRemoveAliasViewEvent profileConfirmRemoveAliasViewEvent = (ProfileConfirmRemoveAliasViewEvent) obj;
                if (!Intrinsics.areEqual(profileConfirmRemoveAliasViewEvent, ProfileConfirmRemoveAliasViewEvent.ConfirmClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(profileConfirmRemoveAliasViewEvent, ProfileConfirmRemoveAliasViewEvent.CancelClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator7.goTo(back);
                    }
                } else {
                    screenNavigator7.goTo(new Finish(AlertDialogResult.POSITIVE));
                }
                break;
            case 18:
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator;
                ProfileConfirmSignOutViewEvent profileConfirmSignOutViewEvent = (ProfileConfirmSignOutViewEvent) obj;
                if (!Intrinsics.areEqual(profileConfirmSignOutViewEvent, ProfileConfirmSignOutViewEvent.Cancel.INSTANCE)) {
                    if (!Intrinsics.areEqual(profileConfirmSignOutViewEvent, ProfileConfirmSignOutViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator8.goTo(new Finish(ProfileConfirmSignOutResult.Positive.INSTANCE));
                    }
                } else {
                    screenNavigator8.goTo(new Finish(ProfileConfirmSignOutResult.Negative.INSTANCE));
                }
                break;
            case 19:
                BetterNavigator.ScreenNavigator screenNavigator9 = ((ErrorPresenter) obj2).navigator;
                ProfileCropViewEvent profileCropViewEvent = (ProfileCropViewEvent) obj;
                if (!Intrinsics.areEqual(profileCropViewEvent, ProfileCropViewEvent.CancelClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(profileCropViewEvent, ProfileCropViewEvent.CropFinished.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator9.goTo(new Finish(CropSuccessResult.INSTANCE));
                    }
                } else {
                    screenNavigator9.goTo(back);
                }
                break;
            case 20:
                BetterNavigator.ScreenNavigator screenNavigator10 = ((ErrorPresenter) obj2).navigator;
                ProfileHeaderMenuViewEvent profileHeaderMenuViewEvent = (ProfileHeaderMenuViewEvent) obj;
                if (!Intrinsics.areEqual(profileHeaderMenuViewEvent, ProfileHeaderMenuViewEvent.CancelClicked.INSTANCE)) {
                    if (!(profileHeaderMenuViewEvent instanceof ProfileHeaderMenuViewEvent.Complete)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator10.goTo(new Finish(((ProfileHeaderMenuViewEvent.Complete) profileHeaderMenuViewEvent).result));
                    }
                } else {
                    screenNavigator10.goTo(back);
                }
                break;
            case 21:
                if (!Intrinsics.areEqual((ProfilePasswordDialogViewEvent$OkClick) obj, ProfilePasswordDialogViewEvent$OkClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, ((CardStudioUndoDialogPresenter) obj2).navigator);
                    break;
                }
            case 22:
                BetterNavigator.ScreenNavigator screenNavigator11 = ((ProfilePrivacyPresenter) obj2).navigator;
                ProfilePrivacyViewEvent profilePrivacyViewEvent = (ProfilePrivacyViewEvent) obj;
                if (!(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.ManageSearchVisibility)) {
                    if (!(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.ManageIncomingRequests)) {
                        if (!Intrinsics.areEqual(profilePrivacyViewEvent, ProfilePrivacyViewEvent.NavBack.INSTANCE)) {
                            if (!(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.ToggleCashMeUrlSetting) && !(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.PersonalizedAdsEvent) && !(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.BlockedAccountsEvent) && !(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.AllowedAccountsEvent) && !(profilePrivacyViewEvent instanceof ProfilePrivacyViewEvent.ToggleContactsSync)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else {
                            screenNavigator11.goTo(back);
                        }
                    } else {
                        screenNavigator11.goTo(ProfileScreens.IncomingRequestsScreen.INSTANCE);
                    }
                } else {
                    screenNavigator11.goTo(SearchVisibilityScreen.INSTANCE);
                }
                break;
            case 23:
                TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator12 = (BetterNavigator.ScreenNavigator) tabToolbarPresenter.moneybotFlagsHelper;
                ProfileSecurityViewEvent profileSecurityViewEvent = (ProfileSecurityViewEvent) obj;
                if (!Intrinsics.areEqual(profileSecurityViewEvent, ProfileSecurityViewEvent.ManageSecurityLock.INSTANCE)) {
                    if (!Intrinsics.areEqual(profileSecurityViewEvent, ProfileSecurityViewEvent.ManageTaxesPassword.INSTANCE)) {
                        if (!Intrinsics.areEqual(profileSecurityViewEvent, ProfileSecurityViewEvent.NavBack.INSTANCE)) {
                            if (!(profileSecurityViewEvent instanceof ProfileSecurityViewEvent.ToggleAuthenticator)) {
                                if (!(profileSecurityViewEvent instanceof ProfileSecurityViewEvent.TrustedContactViewEventWrapper) && !(profileSecurityViewEvent instanceof ProfileSecurityViewEvent.PasscodeEventWrapper)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            } else {
                                screenNavigator12.goTo(new BlockersScreens.StartFlowEntryPointScreen(BlockersData.copy$default(BlockersData.copy$default(FlowStarter.startProfileBlockersFlow$default((FlowStarter) tabToolbarPresenter.p2pSettingsManager, ClientScenario.PROFILE, new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.TAXES), null, 12), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65537, 65535), null, null, null, Flow$Type.TOTP, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535), (String) null, (Screen) null, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 30));
                            }
                        } else {
                            screenNavigator12.goTo(back);
                        }
                    } else {
                        screenNavigator12.goTo(ProfileScreens.TaxesPasswordScreen.INSTANCE);
                    }
                } else {
                    screenNavigator12.goTo(ProfileScreens.SecurityLockScreen.INSTANCE);
                }
                break;
            case 24:
                if (!Intrinsics.areEqual((ProfileUnavailableViewEvent$PositiveButtonClicked) obj, ProfileUnavailableViewEvent$PositiveButtonClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((AndroidActivityFinisher) ((KybBannerPresenter) obj2).kybRestrictionBannerPresenter).finish();
                    break;
                }
            case 25:
                ReferralStatusPresenter referralStatusPresenter = (ReferralStatusPresenter) obj2;
                Analytics analytics3 = referralStatusPresenter.analytics;
                AndroidClock androidClock = referralStatusPresenter.clock;
                ReferralStatusViewEvent referralStatusViewEvent = (ReferralStatusViewEvent) obj;
                if (!(referralStatusViewEvent instanceof ReferralStatusViewEvent.ViewAttached)) {
                    if (!(referralStatusViewEvent instanceof ReferralStatusViewEvent.ViewDetached)) {
                        if (!(referralStatusViewEvent instanceof ReferralStatusViewEvent.BackPressed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            referralStatusPresenter.navigator.goTo(back);
                        }
                    } else {
                        analytics3.track(ReferralRewardReceiveCompleteStatus.copy$default(referralStatusPresenter.analyticsCompleteResult, Long.valueOf(androidClock.millis() - referralStatusPresenter.attachTime), null, null, null, 14), null);
                    }
                } else {
                    referralStatusPresenter.attachTime = androidClock.millis();
                    analytics3.track(new ReferralRewardReceiveViewStatus(), null);
                }
                break;
            case 26:
                BetterNavigator.ScreenNavigator screenNavigator13 = ((ErrorPresenter) obj2).navigator;
                RingtoneViewEvent ringtoneViewEvent = (RingtoneViewEvent) obj;
                if (!Intrinsics.areEqual(ringtoneViewEvent, RingtoneViewEvent.CancelClicked.INSTANCE)) {
                    if (!(ringtoneViewEvent instanceof RingtoneViewEvent.OkClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator13.goTo(new Finish(((RingtoneViewEvent.OkClicked) ringtoneViewEvent).result));
                    }
                } else {
                    screenNavigator13.goTo(back);
                }
                break;
            case 27:
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj2;
                FlowStarter flowStarter2 = (FlowStarter) inviteErrorPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator14 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator;
                TaxesPasswordViewEvent taxesPasswordViewEvent = (TaxesPasswordViewEvent) obj;
                boolean areEqual = Intrinsics.areEqual(taxesPasswordViewEvent, TaxesPasswordViewEvent.ChangePasswordClicked.INSTANCE);
                ProfileScreens.TaxesPasswordScreen taxesPasswordScreen = ProfileScreens.TaxesPasswordScreen.INSTANCE;
                if (!areEqual) {
                    if (!(taxesPasswordViewEvent instanceof TaxesPasswordViewEvent.EnablePassword)) {
                        if (!Intrinsics.areEqual(taxesPasswordViewEvent, TaxesPasswordViewEvent.GoBack.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            screenNavigator14.goTo(back);
                        }
                    } else if (((TaxesPasswordViewEvent.EnablePassword) taxesPasswordViewEvent).enabled) {
                        screenNavigator14.goTo(FlowStarter.startPlasmaFlow$default(flowStarter2, Flow$Type.SET_OR_UPDATE_PASSWORD, taxesPasswordScreen, null, null, 12));
                    } else {
                        screenNavigator14.goTo(ActivePasswordDialog.INSTANCE);
                    }
                } else {
                    screenNavigator14.goTo(FlowStarter.startPlasmaFlow$default(flowStarter2, Flow$Type.SET_OR_UPDATE_PASSWORD, taxesPasswordScreen, null, null, 12));
                }
                break;
            case 28:
                ProfileNotificationsPresenter profileNotificationsPresenter = (ProfileNotificationsPresenter) obj2;
                ProfileNotificationsViewEvent profileNotificationsViewEvent = (ProfileNotificationsViewEvent) obj;
                if (!(profileNotificationsViewEvent instanceof ProfileNotificationsViewEvent.GoBack)) {
                    if (!(profileNotificationsViewEvent instanceof ProfileNotificationsViewEvent.OpenSettingsTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        zzaky.trackSystemOpenNotificationSettings(profileNotificationsPresenter.analytics, SystemNotificationSettingsOrigin.NOTIFICATION_SETTINGS_BANNER);
                        profileNotificationsPresenter.launcher.launchNotificationSettings();
                    }
                } else {
                    profileNotificationsPresenter.navigator.goTo(back);
                }
                break;
            default:
                BetterNavigator.ScreenNavigator screenNavigator15 = (BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator;
                ConfirmReplaceInfoViewEvent confirmReplaceInfoViewEvent = (ConfirmReplaceInfoViewEvent) obj;
                if (!Intrinsics.areEqual(confirmReplaceInfoViewEvent, ConfirmReplaceInfoViewEvent.Cancel.INSTANCE)) {
                    if (!Intrinsics.areEqual(confirmReplaceInfoViewEvent, ConfirmReplaceInfoViewEvent.ConfirmReplace.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator15.goTo(new Finish(AlertDialogResult.POSITIVE));
                    }
                } else {
                    screenNavigator15.goTo(new Finish(AlertDialogResult.NEGATIVE));
                }
                break;
        }
        return null;
    }

    public /* synthetic */ PoolGoalMetKt$PoolGoalMet$1$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.$animation = moleculePresenter;
    }
}
