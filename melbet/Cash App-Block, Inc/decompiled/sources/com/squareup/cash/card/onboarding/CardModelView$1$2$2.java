package com.squareup.cash.card.onboarding;

import android.app.Activity;
import android.content.Intent;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.card.onboarding.CardStudioExitDialogResult;
import com.squareup.cash.card.onboarding.CardStudioExitDialogViewEvent;
import com.squareup.cash.card.onboarding.CardStudioUndoResult;
import com.squareup.cash.card.onboarding.CardStudioUndoViewEvent;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureViewEvent;
import com.squareup.cash.card.onboarding.core.ContouredMarquee;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.GridInteractionController;
import com.squareup.cash.card.onboarding.core.instancing.ZoomAnimator;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.viewmodels.RecurringPaymentInfoEvent$Exit;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightHomeViewEvent;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter;
import com.squareup.cash.cashapplite.screens.LiteCashInScreen;
import com.squareup.cash.cashapplite.viewmodels.CashInRowViewModel;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileEvent$OnClickStart;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewEvent;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewEvent;
import com.squareup.cash.cashapppay.settings.screens.ConfirmRemoveLinkedBusinessDialogScreen;
import com.squareup.cash.cashapppay.settings.screens.LinkedBusinessDetailsSheet;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewEvent;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessResult$Negative;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessResult$Positive;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewEvent;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewEvent;
import com.squareup.cash.cdf.atm.AtmWithdrawalExplainerClickNeedHelp;
import com.squareup.cash.cdf.businessgrant.BusinessGrantRemoveStart;
import com.squareup.cash.cdf.businessgrant.BusinessGrantViewCloseDetails;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositExplainerClickNeedHelp;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.checks.VerifyCheckDialogViewEvent$TapButton;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.bitcoin.BitkeyAutoWithdrawRouter;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageDialogViewEvent$Close;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageFullScreenViewEvent$FinishApp;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin;
import com.squareup.cash.crypto.common.viewmodels.CryptoInsufficientFundsViewEvent;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$updateWebLoginConfig$3$emit$1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalExplainerPresenter;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.screens.AddressSearchQuestion;
import com.squareup.cash.deposits.physical.screens.AtmExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmLocationDetailsScreen;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.AtmWithdrawalExplainerScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmRetailerEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.stablecoin.screens.StablecoinScreens$StablecoinHome;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.moneymap.app.Button;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetWebLoginConfigRequest;
import com.squareup.protos.franklin.app.GetWebLoginConfigResponse;
import com.squareup.util.android.AndroidActivityFinisher;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class CardModelView$1$2$2 implements FlowCollector {
    public final /* synthetic */ Object $marquee;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CardModelView$1$2$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$marquee = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Screen atmWithdrawalExplainerScreen;
        int i = this.$r8$classId;
        LiteCashInScreen liteCashInScreen = LiteCashInScreen.INSTANCE;
        FailureMessageDialogViewEvent$Close failureMessageDialogViewEvent$Close = FailureMessageDialogViewEvent$Close.INSTANCE;
        Back back = Back.INSTANCE;
        Object obj2 = this.$marquee;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                ((ContouredMarquee) obj2).setActive(((CardContouredText) pair.first) != null, ((Boolean) pair.second).booleanValue());
                break;
            case 1:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                CardStudioExitDialogScreen cardStudioExitDialogScreen = (CardStudioExitDialogScreen) endAppLockPresenter.appLockState;
                CardStudioExitDialogViewEvent cardStudioExitDialogViewEvent = (CardStudioExitDialogViewEvent) obj;
                if (!Intrinsics.areEqual(cardStudioExitDialogViewEvent, CardStudioExitDialogViewEvent.Exit.INSTANCE)) {
                    if (!Intrinsics.areEqual(cardStudioExitDialogViewEvent, CardStudioExitDialogViewEvent.Stay.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        AskedQuestion askedQuestion = cardStudioExitDialogScreen.question;
                        CardStudioExitDialogResult.Stay stay = CardStudioExitDialogResult.Stay.INSTANCE;
                        if (askedQuestion != null) {
                            screenNavigator.giveAnswer(askedQuestion, stay);
                        } else {
                            screenNavigator.goTo(new Finish(stay));
                        }
                    }
                } else {
                    AskedQuestion askedQuestion2 = cardStudioExitDialogScreen.question;
                    CardStudioExitDialogResult.Exit exit = CardStudioExitDialogResult.Exit.INSTANCE;
                    if (askedQuestion2 != null) {
                        screenNavigator.giveAnswer(askedQuestion2, exit);
                    } else {
                        screenNavigator.goTo(new Finish(exit));
                    }
                }
                break;
            case 2:
                BetterNavigator.ScreenNavigator screenNavigator2 = ((CardStudioUndoDialogPresenter) obj2).navigator;
                CardStudioUndoViewEvent cardStudioUndoViewEvent = (CardStudioUndoViewEvent) obj;
                if (!Intrinsics.areEqual(cardStudioUndoViewEvent, CardStudioUndoViewEvent.Cancel.INSTANCE)) {
                    if (!Intrinsics.areEqual(cardStudioUndoViewEvent, CardStudioUndoViewEvent.Undo.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator2.goTo(new Finish(CardStudioUndoResult.Undo.INSTANCE));
                    }
                } else {
                    screenNavigator2.goTo(new Finish(CardStudioUndoResult.Cancel.INSTANCE));
                }
                break;
            case 3:
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator;
                ConfirmExitDisclosureViewEvent confirmExitDisclosureViewEvent = (ConfirmExitDisclosureViewEvent) obj;
                if (!Intrinsics.areEqual(confirmExitDisclosureViewEvent, ConfirmExitDisclosureViewEvent.NegativeClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(confirmExitDisclosureViewEvent, ConfirmExitDisclosureViewEvent.PositiveClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator3.goTo(new Finish(ConfirmExitDisclosureResult$Positive.INSTANCE));
                    }
                } else {
                    screenNavigator3.goTo(new Finish(ConfirmExitDisclosureResult$Negative.INSTANCE));
                }
                break;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj2;
                float f = cardDesignLibraryScene.lastAnimationTime;
                GridInteractionController gridInteractionController = cardDesignLibraryScene.interactionController;
                ZoomAnimator zoomAnimator = cardDesignLibraryScene.zoomAnimator;
                if (floatValue != f) {
                    float f2 = floatValue - f;
                    cardDesignLibraryScene.lastAnimationTime = floatValue;
                    boolean z = cardDesignLibraryScene.wasZoomAnimating;
                    if (!zoomAnimator.isPinchDriven) {
                        float f3 = zoomAnimator.transitionProgress;
                        if (f3 < 1.0f) {
                            float f4 = (f2 / 0.4f) + f3;
                            if (f4 > 1.0f) {
                                f4 = 1.0f;
                            }
                            zoomAnimator.transitionProgress = f4;
                        }
                    }
                    float f5 = zoomAnimator.panAnimProgress;
                    if (f5 < 1.0f) {
                        float f6 = (f2 / zoomAnimator.panSettleDuration) + f5;
                        if (f6 > 1.0f) {
                            f6 = 1.0f;
                        }
                        zoomAnimator.panAnimProgress = f6;
                        float f7 = 1.0f - f6;
                        float f8 = 1.0f - ((f7 * f7) * f7);
                        float f9 = zoomAnimator.panAnimStartX;
                        zoomAnimator.panX = CameraState$Type$EnumUnboxingLocalUtility.m(zoomAnimator.panAnimTargetX, f9, f8, f9);
                        float f10 = zoomAnimator.panAnimStartY;
                        zoomAnimator.panY = CameraState$Type$EnumUnboxingLocalUtility.m(zoomAnimator.panAnimTargetY, f10, f8, f10);
                    }
                    cardDesignLibraryScene.wasZoomAnimating = zoomAnimator.isAnimating();
                    if (z && !zoomAnimator.isAnimating() && gridInteractionController.zoomAnimator.targetZoom == ZoomLevel.MEDIUM) {
                        gridInteractionController.centerOnNearestCard();
                        cardDesignLibraryScene.wakeAnimationLoop();
                    }
                    if (gridInteractionController.isFlingSettling && zoomAnimator.panAnimProgress >= 1.0f) {
                        gridInteractionController.isFlingSettling = false;
                    }
                    cardDesignLibraryScene.updateVisibleCards(f2);
                    cardDesignLibraryScene.markDirty();
                }
                break;
            case 5:
                if (!Intrinsics.areEqual((FullScreenActivityViewEvent$Exit) obj, FullScreenActivityViewEvent$Exit.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((SelectCustomerPresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 6:
                if (((RecurringPaymentInfoEvent$Exit) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((MusicPresenter) obj2).navigator).goTo(back);
                    break;
                }
            case 7:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                RealRouter realRouter = (RealRouter) disclosurePresenter.args;
                SpendingInsightDetailViewEvent spendingInsightDetailViewEvent = (SpendingInsightDetailViewEvent) obj;
                if (!(spendingInsightDetailViewEvent instanceof SpendingInsightDetailViewEvent.Exit)) {
                    if (!(spendingInsightDetailViewEvent instanceof SpendingInsightDetailViewEvent.MerchantRowTapped)) {
                        if (!(spendingInsightDetailViewEvent instanceof SpendingInsightDetailViewEvent.ClientRoute)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((SpendingInsightDetailViewEvent.ClientRoute) spendingInsightDetailViewEvent).route);
                        }
                    } else {
                        realRouter.route(new RoutingParams((SpendingInsightDetailScreen) disclosurePresenter.analytics, null, null, null, null, null, 510), ((SpendingInsightDetailViewEvent.MerchantRowTapped) spendingInsightDetailViewEvent).event.clientRoute);
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(back);
                }
                break;
            case 8:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                RealRouter realRouter2 = (RealRouter) cardLockPresenter.ioDispatcher;
                SpendingInsightHomeViewEvent spendingInsightHomeViewEvent = (SpendingInsightHomeViewEvent) obj;
                if (!(spendingInsightHomeViewEvent instanceof SpendingInsightHomeViewEvent.Exit)) {
                    if (!(spendingInsightHomeViewEvent instanceof SpendingInsightHomeViewEvent.InsightsRowTapped)) {
                        if (!(spendingInsightHomeViewEvent instanceof SpendingInsightHomeViewEvent.UrlTapped)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            realRouter2.route(new RoutingParams(null, null, null, null, null, null, 511), (String) null);
                        }
                    } else {
                        SpendingInsightHomeViewEvent.InsightsRowTapped insightsRowTapped = (SpendingInsightHomeViewEvent.InsightsRowTapped) spendingInsightHomeViewEvent;
                        CdfEvent cdfEvent = insightsRowTapped.event;
                        if (cdfEvent != null) {
                            ((Analytics) cardLockPresenter.analytics).track(new UtilsKt$toCdfEvent$2(cdfEvent, new Pair[0]), null);
                        }
                        realRouter2.route(new RoutingParams(null, null, null, null, null, null, 511), insightsRowTapped.clientRoute);
                    }
                } else {
                    cardLockPresenter.navigator.goTo(back);
                }
                break;
            case 9:
                ErrorPresenter errorPresenter = (ErrorPresenter) obj2;
                if (!Intrinsics.areEqual((KycAppletTileEvent$OnClickStart) obj, KycAppletTileEvent$OnClickStart.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((Navigator) errorPresenter.navigator).goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) errorPresenter.args, Flow$Type.CASH_LITE_KYC, PaymentScreens$HomeScreens$Home.INSTANCE, null, null, 12));
                    break;
                }
            case 10:
                if (((FullScreenActivityViewEvent$Exit) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((LiteActivityPresenter) obj2).navigator.goTo(back);
                    break;
                }
            case 11:
                BetterNavigator.ScreenNavigator screenNavigator4 = ((AddAliasPresenter) obj2).navigator;
                LiteAddMoneyViewEvent liteAddMoneyViewEvent = (LiteAddMoneyViewEvent) obj;
                if (!Intrinsics.areEqual(liteAddMoneyViewEvent, LiteAddMoneyViewEvent.DismissClicked.INSTANCE)) {
                    if (!(liteAddMoneyViewEvent instanceof LiteAddMoneyViewEvent.RowClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        int ordinal = ((LiteAddMoneyViewEvent.RowClicked) liteAddMoneyViewEvent).rowId.ordinal();
                        if (ordinal == 0) {
                            screenNavigator4.goTo(liteCashInScreen);
                        } else if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            screenNavigator4.goTo(new StablecoinDepositOptionsScreen(null, null, 3));
                        }
                    }
                } else {
                    screenNavigator4.goTo(back);
                }
                break;
            case 12:
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) ((LocalPosCheckInPresenter) obj2).navigator;
                LiteBalanceHomeViewEvent liteBalanceHomeViewEvent = (LiteBalanceHomeViewEvent) obj;
                if (!Intrinsics.areEqual(liteBalanceHomeViewEvent, LiteBalanceHomeViewEvent.BackClicked.INSTANCE)) {
                    if (!(liteBalanceHomeViewEvent instanceof LiteBalanceHomeViewEvent.RowClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        int ordinal2 = ((LiteBalanceHomeViewEvent.RowClicked) liteBalanceHomeViewEvent).rowId.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                screenNavigator5.goTo(liteCashInScreen);
                            } else if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                screenNavigator5.goTo(new StablecoinDepositOptionsScreen(null, null, 3));
                            }
                        }
                    }
                } else {
                    screenNavigator5.goTo(back);
                }
                break;
            case 13:
                LiteCashInPresenter liteCashInPresenter = (LiteCashInPresenter) obj2;
                LiteCashInViewEvent liteCashInViewEvent = (LiteCashInViewEvent) obj;
                if (!Intrinsics.areEqual(liteCashInViewEvent, LiteCashInViewEvent.BackClicked.INSTANCE)) {
                    if (!(liteCashInViewEvent instanceof LiteCashInViewEvent.CopyRowClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        RealClipboardManager realClipboardManager = (RealClipboardManager) liteCashInPresenter.clipboardManager;
                        CashInRowViewModel cashInRowViewModel = ((LiteCashInViewEvent.CopyRowClicked) liteCashInViewEvent).row;
                        realClipboardManager.copy(cashInRowViewModel.title, cashInRowViewModel.value);
                    }
                } else {
                    liteCashInPresenter.navigator.goTo(back);
                }
                break;
            case 14:
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator;
                RemoveLinkedBusinessViewEvent removeLinkedBusinessViewEvent = (RemoveLinkedBusinessViewEvent) obj;
                if (!Intrinsics.areEqual(removeLinkedBusinessViewEvent, RemoveLinkedBusinessViewEvent.Cancel.INSTANCE)) {
                    if (!Intrinsics.areEqual(removeLinkedBusinessViewEvent, RemoveLinkedBusinessViewEvent.Remove.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator6.goTo(new Finish(RemoveLinkedBusinessResult$Positive.INSTANCE));
                    }
                } else {
                    screenNavigator6.goTo(new Finish(RemoveLinkedBusinessResult$Negative.INSTANCE));
                }
                break;
            case 15:
                EndAppLockPresenter endAppLockPresenter2 = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) endAppLockPresenter2.navigatorSwitcher;
                Analytics analytics = (Analytics) endAppLockPresenter2.accountOutboundNavigator;
                LinkedBusinessDetailsSheet linkedBusinessDetailsSheet = (LinkedBusinessDetailsSheet) endAppLockPresenter2.appLockState;
                LinkedBusinessDetailsViewEvent linkedBusinessDetailsViewEvent = (LinkedBusinessDetailsViewEvent) obj;
                if (!(linkedBusinessDetailsViewEvent instanceof LinkedBusinessDetailsViewEvent.RemoveClick)) {
                    if (!(linkedBusinessDetailsViewEvent instanceof LinkedBusinessDetailsViewEvent.Close)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        analytics.track(new BusinessGrantViewCloseDetails(linkedBusinessDetailsSheet.businessGrantId), null);
                        screenNavigator7.goTo(back);
                    }
                } else {
                    analytics.track(new BusinessGrantRemoveStart(linkedBusinessDetailsSheet.businessGrantId), null);
                    screenNavigator7.goTo(new ConfirmRemoveLinkedBusinessDialogScreen(linkedBusinessDetailsSheet.businessGrantId, linkedBusinessDetailsSheet.title, linkedBusinessDetailsSheet.actionType));
                }
                break;
            case 16:
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) ((MusicPresenter) obj2).navigator;
                UnlinkResultViewEvent unlinkResultViewEvent = (UnlinkResultViewEvent) obj;
                if (!Intrinsics.areEqual(unlinkResultViewEvent, UnlinkResultViewEvent.CtaClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(unlinkResultViewEvent, UnlinkResultViewEvent.CloseClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator8.goTo(back);
                    }
                } else {
                    screenNavigator8.goTo(back);
                }
                break;
            case 17:
                VerifyCheckDialogViewEvent$TapButton verifyCheckDialogViewEvent$TapButton = (VerifyCheckDialogViewEvent$TapButton) obj;
                if (verifyCheckDialogViewEvent$TapButton == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj2).navigator).goTo(new Finish(verifyCheckDialogViewEvent$TapButton.result));
                    break;
                }
            case 18:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                    ((BitkeyAutoWithdrawRouter) obj2).navigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                    Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Failed to route to next Bitkey blocker: ", ((BlockersHelper.BlockersAction.ShowError) blockersAction).message), new Object[0]);
                }
                break;
            case 19:
                if (!Intrinsics.areEqual((FailureMessageFullScreenViewEvent$FinishApp) obj, FailureMessageFullScreenViewEvent$FinishApp.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) ((VerifyCheckDialogPresenter) obj2).navigator;
                    Intent intent = new Intent();
                    Activity activity = androidActivityFinisher.activity;
                    activity.setResult(1, intent);
                    activity.finish();
                    break;
                }
            case 20:
                if (!Intrinsics.areEqual((FailureMessageDialogViewEvent$Close) obj, failureMessageDialogViewEvent$Close)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((EndAppLockPresenter) obj2).accountOutboundNavigator).goTo(new Finish(AlertDialogResult.NEGATIVE));
                    break;
                }
            case 21:
                if (!Intrinsics.areEqual((FailureMessageDialogViewEvent$Close) obj, failureMessageDialogViewEvent$Close)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) ((EndAppLockPresenter) obj2).accountOutboundNavigator).goTo(new Finish(AlertDialogResult.NEGATIVE));
                    break;
                }
            case 22:
                NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) obj;
                UiContainer uiContainer = (UiContainer) obj2;
                uiContainer.swipeActivePage$delegate.setValue(page);
                uiContainer.onSwipePageChanged.invoke(page);
                break;
            case 23:
                EndAppLockPresenter endAppLockPresenter3 = (EndAppLockPresenter) obj2;
                CryptoCommonScreens.CryptoCommonInsufficientFunds cryptoCommonInsufficientFunds = (CryptoCommonScreens.CryptoCommonInsufficientFunds) endAppLockPresenter3.appLockState;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) endAppLockPresenter3.accountOutboundNavigator;
                CryptoInsufficientFundsViewEvent cryptoInsufficientFundsViewEvent = (CryptoInsufficientFundsViewEvent) obj;
                boolean areEqual = Intrinsics.areEqual(cryptoInsufficientFundsViewEvent, CryptoInsufficientFundsViewEvent.NegativeButtonClicked.INSTANCE);
                CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin cryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin = CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin.INSTANCE;
                if (!areEqual) {
                    if (!Intrinsics.areEqual(cryptoInsufficientFundsViewEvent, CryptoInsufficientFundsViewEvent.PositiveButtonClicked.INSTANCE)) {
                        if (!Intrinsics.areEqual(cryptoInsufficientFundsViewEvent, CryptoInsufficientFundsViewEvent.OnCloseClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            screenNavigator9.goTo(back);
                        }
                    } else if (!Intrinsics.areEqual(cryptoCommonInsufficientFunds.f1117type, cryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator9.goTo(back);
                    }
                } else if (!Intrinsics.areEqual(cryptoCommonInsufficientFunds.f1117type, cryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    screenNavigator9.goTo(StablecoinScreens$StablecoinHome.INSTANCE);
                }
                break;
            case 24:
                break;
            case 25:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                Analytics analytics2 = (Analytics) musicPresenter.musicPlayer;
                RealRouter realRouter3 = (RealRouter) musicPresenter.args;
                AtmPmdExplainerViewEvent atmPmdExplainerViewEvent = (AtmPmdExplainerViewEvent) obj;
                if (!(atmPmdExplainerViewEvent instanceof AtmPmdExplainerViewEvent.LinkClicked)) {
                    if (!(atmPmdExplainerViewEvent instanceof AtmPmdExplainerViewEvent.ButtonGroupClicked)) {
                        if (!Intrinsics.areEqual(atmPmdExplainerViewEvent, AtmPmdExplainerViewEvent.Exit.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                        }
                    } else {
                        int ordinal3 = ((AtmPmdExplainerScreen) musicPresenter.musicRepository).origin.ordinal();
                        if (ordinal3 == 0) {
                            analytics2.track(new AtmWithdrawalExplainerClickNeedHelp(), null);
                        } else if (ordinal3 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            analytics2.track(new PaperMoneyDepositExplainerClickNeedHelp(), null);
                        }
                        realRouter3.route(new RoutingParams((AtmPmdExplainerScreen) musicPresenter.musicRepository, null, null, null, null, null, 510), ((AtmPmdExplainerViewEvent.ButtonGroupClicked) atmPmdExplainerViewEvent).url);
                    }
                } else {
                    realRouter3.route(new RoutingParams(null, null, null, null, null, null, 511), ((AtmPmdExplainerViewEvent.LinkClicked) atmPmdExplainerViewEvent).url);
                }
                break;
            case 26:
                AtmWithdrawalExplainerPresenter atmWithdrawalExplainerPresenter = (AtmWithdrawalExplainerPresenter) obj2;
                AtmExplainerViewEvent atmExplainerViewEvent = (AtmExplainerViewEvent) obj;
                if (!(atmExplainerViewEvent instanceof AtmExplainerViewEvent.LinkClientRoute)) {
                    if (!Intrinsics.areEqual(atmExplainerViewEvent, AtmExplainerViewEvent.Done.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        atmWithdrawalExplainerPresenter.navigator.goTo(back);
                    }
                } else {
                    atmWithdrawalExplainerPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), ((AtmExplainerViewEvent.LinkClientRoute) atmExplainerViewEvent).uri);
                }
                break;
            case 27:
                AtmWithdrawalMapPresenter atmWithdrawalMapPresenter = (AtmWithdrawalMapPresenter) obj2;
                AtmRetailerMapScreen atmRetailerMapScreen = atmWithdrawalMapPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator10 = atmWithdrawalMapPresenter.navigator;
                AtmRetailerEvent atmRetailerEvent = (AtmRetailerEvent) obj;
                if (!Intrinsics.areEqual(atmRetailerEvent, AtmRetailerEvent.ExitClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(atmRetailerEvent, AtmRetailerEvent.HelpClick.INSTANCE)) {
                        if (!Intrinsics.areEqual(atmRetailerEvent, AtmRetailerEvent.SearchClick.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            RetailerMapBlocker.SearchScreen searchScreen = atmRetailerMapScreen.atmWithdrawalBlocker.search_screen;
                            searchScreen.getClass();
                            screenNavigator10.askQuestion(new AddressSearchQuestion(), new ProfileQueries$$ExternalSyntheticLambda13(13, searchScreen, atmWithdrawalMapPresenter));
                        }
                    } else {
                        BooleanPreference booleanPreference = atmWithdrawalMapPresenter.explainerViewedCache;
                        booleanPreference.preferences.edit().putBoolean(booleanPreference.key, true).commit();
                        RetailerMapBlocker retailerMapBlocker = atmRetailerMapScreen.atmWithdrawalBlocker;
                        BlockersData blockersData = atmRetailerMapScreen.blockersData;
                        BenefitExplainerScreen benefitExplainerScreen = retailerMapBlocker.benefit_explainer_screen;
                        if (benefitExplainerScreen != null) {
                            atmWithdrawalExplainerScreen = new AtmPmdExplainerScreen(AtmPmdExplainerScreen.AtmPmdExplainerOrigin.ATM, benefitExplainerScreen.elements, benefitExplainerScreen.footer_elements, blockersData);
                        } else {
                            RetailerMapBlocker.ExplainerScreen explainerScreen = retailerMapBlocker.explainer_screen;
                            explainerScreen.getClass();
                            atmWithdrawalExplainerScreen = new AtmWithdrawalExplainerScreen(explainerScreen, blockersData);
                        }
                        screenNavigator10.goTo(atmWithdrawalExplainerScreen);
                    }
                } else {
                    screenNavigator10.goTo(back);
                }
                break;
            case 28:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                AtmLocationDetailsScreen atmLocationDetailsScreen = (AtmLocationDetailsScreen) localHomePresenter.syncer;
                BetterNavigator.ScreenNavigator screenNavigator11 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                LocationDetailsViewEvent locationDetailsViewEvent = (LocationDetailsViewEvent) obj;
                if (!Intrinsics.areEqual(locationDetailsViewEvent, LocationDetailsViewEvent.BackOrOutsideClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(locationDetailsViewEvent, LocationDetailsViewEvent.SecondaryButtonClick.INSTANCE)) {
                        if (!Intrinsics.areEqual(locationDetailsViewEvent, LocationDetailsViewEvent.PrimaryButtonClick.INSTANCE)) {
                            if (!Intrinsics.areEqual(locationDetailsViewEvent, LocationDetailsViewEvent.FeeInformationClick.INSTANCE)) {
                                if (!(locationDetailsViewEvent instanceof LocationDetailsViewEvent.CopyAddressClick)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    GlobalAddress globalAddress = atmLocationDetailsScreen.retailerLocation.address;
                                    globalAddress.getClass();
                                    ((RealClipboardManager) localHomePresenter.localHomeGeoPresenterFactory).copy(((AndroidStringManager) localHomePresenter.featureFlagManager).get(R.string.atm_copy_address_clipboard_label), AddressKt.buildAsString(globalAddress, false));
                                }
                            } else {
                                screenNavigator11.goTo((AtmExplainerScreen) localHomePresenter.tabContentPresenterFactory);
                            }
                        } else {
                            IntentLauncher intentLauncher = (IntentLauncher) localHomePresenter.store;
                            GlobalAddress globalAddress2 = atmLocationDetailsScreen.retailerLocation.address;
                            globalAddress2.getClass();
                            intentLauncher.launchMap(StringsKt.trim(StringsKt__StringsJVMKt.replace$default(AddressKt.buildAsString(globalAddress2, false), "\n", " ")).toString(), 0.0d, 0.0d);
                        }
                    } else {
                        RealRouter realRouter4 = (RealRouter) localHomePresenter.embeddedMapEnabled$delegate;
                        Button button = ((GetRetailerLocationsResponse.RetailerLocation) localHomePresenter.neighborhoodsTabContentEnabled$delegate).button;
                        button.getClass();
                        String str = button.client_route;
                        str.getClass();
                        realRouter4.route(new RoutingParams(null, null, null, null, null, null, 511), str);
                    }
                } else {
                    screenNavigator11.goTo(back);
                }
                break;
            default:
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator12 = (BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator;
                PhysicalDepositErrorEvent physicalDepositErrorEvent = (PhysicalDepositErrorEvent) obj;
                if (!Intrinsics.areEqual(physicalDepositErrorEvent, PhysicalDepositErrorEvent.ActionNegativeClick.INSTANCE)) {
                    if (!Intrinsics.areEqual(physicalDepositErrorEvent, PhysicalDepositErrorEvent.ActionPositiveClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator12.goTo(new Finish(((PhysicalDepositErrorScreen) verifyCheckDialogPresenter.args).actionPositiveResult));
                    }
                } else {
                    screenNavigator12.goTo(back);
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit$2(Continuation continuation) {
        RealAppConfigManager$updateWebLoginConfig$3$emit$1 realAppConfigManager$updateWebLoginConfig$3$emit$1;
        int i;
        ApiResult apiResult;
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) this.$marquee;
        if (continuation instanceof RealAppConfigManager$updateWebLoginConfig$3$emit$1) {
            realAppConfigManager$updateWebLoginConfig$3$emit$1 = (RealAppConfigManager$updateWebLoginConfig$3$emit$1) continuation;
            int i2 = realAppConfigManager$updateWebLoginConfig$3$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAppConfigManager$updateWebLoginConfig$3$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAppConfigManager$updateWebLoginConfig$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAppConfigManager$updateWebLoginConfig$3$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = realAppConfigManager.appService;
                    GetWebLoginConfigRequest getWebLoginConfigRequest = new GetWebLoginConfigRequest(ByteString.EMPTY);
                    realAppConfigManager$updateWebLoginConfig$3$emit$1.label = 1;
                    obj = appService.getWebLoginConfig(getWebLoginConfigRequest, realAppConfigManager$updateWebLoginConfig$3$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to update web login config.", new Object[0]);
                }
                GetWebLoginConfigResponse getWebLoginConfigResponse = (GetWebLoginConfigResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                realAppConfigManager.webLoginConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(22, getWebLoginConfigResponse != null ? getWebLoginConfigResponse.web_login_config : null, realAppConfigManager));
                return Unit.INSTANCE;
            }
        }
        realAppConfigManager$updateWebLoginConfig$3$emit$1 = new RealAppConfigManager$updateWebLoginConfig$3$emit$1(this, continuation);
        Object obj2 = realAppConfigManager$updateWebLoginConfig$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAppConfigManager$updateWebLoginConfig$3$emit$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        GetWebLoginConfigResponse getWebLoginConfigResponse2 = (GetWebLoginConfigResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
        realAppConfigManager.webLoginConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(22, getWebLoginConfigResponse2 != null ? getWebLoginConfigResponse2.web_login_config : null, realAppConfigManager));
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardModelView$1$2$2(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.$marquee = moleculePresenter;
    }
}
