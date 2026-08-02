package com.squareup.cash.card.onboarding;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.Screen;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.sqldelight.db.QueryResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.presenters.BalanceTransferLoadingPresenter$models$1$1$2;
import com.squareup.cash.blockers.presenters.EarnerEnrollmentSuccessBlockerPresenter;
import com.squareup.cash.blockers.presenters.EarnerOnboardingAnalytics;
import com.squareup.cash.blockers.presenters.EarnerUpsellBlockerPresenter;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.PromotionPanePresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter$models$2$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.boost.db.RewardQueries$forIds$2;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubLoadingStatus;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.core.CardAssetManager;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$Albedo;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$ContouredText;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$CopyPan;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$HeatColors;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$HoloBase;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$HoloReflect;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$InkMetalHeat;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$Normal;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$Placeholder;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$Shimmer;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$SnakeSkin;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractShowStatusResult;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewBulletinSheet;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewLoanDetails;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewSeeTile;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewUpsellCard;
import com.squareup.cash.cdf.borrowlimithub.BorrowLimitHubViewBulletinSheet;
import com.squareup.cash.cdf.borrowlimithub.BorrowLimitHubViewCtaBullet;
import com.squareup.cash.cdf.borrowlimithub.BorrowLimitHubViewSeeSection;
import com.squareup.cash.cdf.crypto.CryptoTimeoutPerformanceDataRefreshTimeout;
import com.squareup.cash.cdf.earnings.EarningsOnboardingViewSuccess;
import com.squareup.cash.cdf.earnings.EarningsOnboardingViewUpsell;
import com.squareup.cash.cdf.sponsoredaccount.DependentBalanceType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountBalanceDetailSeeActivity;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.PendingTransferQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.PendingTransferQueries$transfersToRetry$2;
import com.squareup.cash.db2.referrals.RewardStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientHapticsImprovements;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.arcade.MultilineTextInputValidator$Result;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager$retryTransfers$1$1;
import com.squareup.cash.payments.backend.real.RealOfflineManager$retryTransfers$1$2;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.common.appmessaging.AppMessageInAppPromoTemplate;
import com.squareup.protos.franklin.common.appmessaging.AppMessagePayload;
import com.squareup.protos.franklin.common.appmessaging.AppMessageToggleTemplate;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.Tile;
import com.squareup.util.android.ToastKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class InteractiveCardView$flingTo$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $front;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long $velocity;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveCardView$flingTo$1(InteractiveCardView interactiveCardView, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = interactiveCardView;
        this.$front = z;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new InteractiveCardView$flingTo$1((InteractiveCardView) obj2, this.$front, this.$velocity, continuation);
            case 1:
                long j = this.$velocity;
                return new InteractiveCardView$flingTo$1(this.$front, (AndroidViewHolder) obj2, j, continuation);
            default:
                return new InteractiveCardView$flingTo$1((RealOfflineManager) obj2, this.$velocity, this.$front, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InteractiveCardView$flingTo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r15 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r15 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        boolean z = this.$front;
        Object obj2 = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                InteractiveCardView interactiveCardView = (InteractiveCardView) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, AnimationsKt.m3564flingTo38CYSgM$default(interactiveCardView.cardRotation, z ? interactiveCardView.forwardResting : interactiveCardView.backwardResting, this.$velocity, new SpringSpec(interactiveCardView.dampingRatio, interactiveCardView.stiffness, new Float(0.001f)), 8), new AnonymousClass1(interactiveCardView, z, (Continuation) null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(interactiveCardView, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowKt__MergeKt$flatMapMerge$$inlined$map$1, anonymousClass2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleActor simpleActor = ((AndroidViewHolder) obj2).dispatcher;
                    if (!z) {
                        this.label = 1;
                        obj = simpleActor.m1109dispatchPostFlingRZ2iAVY(0L, this.$velocity, this);
                        break;
                    } else {
                        this.label = 2;
                        obj = simpleActor.m1109dispatchPostFlingRZ2iAVY(this.$velocity, 0L, this);
                        break;
                    }
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    ((Velocity) obj).getClass();
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    ((Velocity) obj).getClass();
                }
                break;
            default:
                RealOfflineManager realOfflineManager = (RealOfflineManager) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries = realOfflineManager.transferQueries;
                    instrumentQueries.getClass();
                    PendingTransferQueries$transfersToRetry$2 pendingTransferQueries$transfersToRetry$2 = PendingTransferQueries$transfersToRetry$2.INSTANCE;
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 flatMapConcat = FlowKt.flatMapConcat(new RealOfflineManager$retryTransfers$1$1(realOfflineManager, z, null), FlowKt.take(DBUtil.mapToList(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(instrumentQueries, this.$velocity, new PendingTransferQueries$$ExternalSyntheticLambda2(instrumentQueries, i2), 4)), realOfflineManager.ioDispatcher), 1));
                    this.label = 1;
                    if (flatMapConcat.collect(RealOfflineManager$retryTransfers$1$2.INSTANCE, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(InteractiveCardView interactiveCardView, State state, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = interactiveCardView;
            this.L$0 = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((InteractiveCardView) obj2, continuation, 0);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                case 1:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2((JCAContext) obj2, continuation, 1);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
                case 2:
                    return new AnonymousClass2((e0) this.L$0, (MutableState) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass2((BigDecimal) this.L$0, (BitcoinTransferPresenter) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass2((RealMultiBlockerFacilitator) this.L$0, (String) obj2, continuation, 4);
                case 5:
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2((LocalPosCheckInPresenter) obj2, continuation, 5);
                    anonymousClass23.L$0 = obj;
                    return anonymousClass23;
                case 6:
                    return new AnonymousClass2((EarnerEnrollmentSuccessBlockerPresenter) this.L$0, (String) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass2((EarnerUpsellBlockerPresenter) this.L$0, (String) obj2, continuation, 7);
                case 8:
                    AnonymousClass2 anonymousClass24 = new AnonymousClass2((PoolsListPresenter) obj2, continuation, 8);
                    anonymousClass24.L$0 = obj;
                    return anonymousClass24;
                case 9:
                    AnonymousClass2 anonymousClass25 = new AnonymousClass2((PasscodePresenter) obj2, continuation, 9);
                    anonymousClass25.L$0 = obj;
                    return anonymousClass25;
                case 10:
                    return new AnonymousClass2((PromotionPanePresenter) this.L$0, (Screen) obj2, continuation, 10);
                case 11:
                    AnonymousClass2 anonymousClass26 = new AnonymousClass2((EndAppLockPresenter) obj2, continuation, 11);
                    anonymousClass26.L$0 = obj;
                    return anonymousClass26;
                case 12:
                    return new AnonymousClass2((StatusResultPresenter) this.L$0, (MutableState) obj2, continuation, 12);
                case 13:
                    AnonymousClass2 anonymousClass27 = new AnonymousClass2((CashCardKt$$ExternalSyntheticLambda0) obj2, continuation, 13);
                    anonymousClass27.L$0 = obj;
                    return anonymousClass27;
                case 14:
                    AnonymousClass2 anonymousClass28 = new AnonymousClass2((WelcomePresenter) obj2, continuation, 14);
                    anonymousClass28.L$0 = obj;
                    return anonymousClass28;
                case 15:
                    return new AnonymousClass2((ReferralCodeViewModel) this.L$0, (FocusRequester) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass2((ReferralCodeViewModel) this.L$0, (RealCashVibrator) obj2, continuation, 16);
                case 17:
                    AnonymousClass2 anonymousClass29 = new AnonymousClass2((RealBoostProvider) obj2, continuation, 17);
                    anonymousClass29.L$0 = obj;
                    return anonymousClass29;
                case 18:
                    return new AnonymousClass2((RealBoostSyncer) this.L$0, (RewardsData) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass2((BorrowHomeOverlayViewModel) this.L$0, (DisclosurePresenter) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass2((BorrowHomePresenter) this.L$0, (Tile) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass2((LocalEditorialPresenter) this.L$0, (BorrowLimitHubViewModel.Section) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass2((AfterPayOrderHubViewModel) this.L$0, (Context) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass2((CardModelView) this.L$0, (CardModelView.CardBack) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass2((InteractiveCardView) obj2, (State) this.L$0, continuation, 24);
                case 25:
                    return new AnonymousClass2((InteractiveCardView) obj2, (State) this.L$0, continuation, 25);
                case 26:
                    return new AnonymousClass2((StyledCardPerspectiveView) this.L$0, (MutableState) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass2((CardStudioViewModelV2.Content) this.L$0, (PatternStampState) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass2((ProductDetailsPageViewModel) this.L$0, (MutableState) obj2, continuation, 28);
                default:
                    return new AnonymousClass2((CardAssetManager) this.L$0, (LayoutCompat_androidKt) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:127:0x030b  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x05a5  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x05ac  */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v29 */
        /* JADX WARN: Type inference failed for: r6v30 */
        /* JADX WARN: Type inference failed for: r6v33 */
        /* JADX WARN: Type inference failed for: r6v34 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Screen remoteSkipErrorScreen;
            LayoutUpdate layoutUpdate;
            LayoutUpdate upsell;
            StatusResult.Action action;
            Object ready;
            StatusResult.Icon icon;
            int ordinal;
            String str;
            BorrowAppletBulletinsTile.Data data;
            BorrowAppletBulletinsTile.Data.UpsellCard upsellCard;
            BorrowLimitHubViewSeeSection.SectionType sectionType;
            int i = this.$r8$classId;
            int i2 = 4;
            int i3 = 3;
            int i4 = 2;
            int i5 = 1;
            ?? r6 = 0;
            r6 = 0;
            r6 = 0;
            int i6 = 0;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    Quat quat = (Quat) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((InteractiveCardView) obj2).setCardRotation(quat);
                    return Unit.INSTANCE;
                case 1:
                    ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped) {
                        RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = (RealDependentBalanceDetailLoggingManager) ((JCAContext) obj2).provider;
                        String customerToken = realDependentBalanceDetailLoggingManager.dependentCustomerTokenRepository.getCustomerToken();
                        if (customerToken != null) {
                            Analytics analytics = realDependentBalanceDetailLoggingManager.analytics;
                            DependentBalanceType dependentBalanceType = DependentBalanceType.Bitcoin;
                            analytics.track(new SponsoredAccountBalanceDetailSeeActivity(customerToken), null);
                        }
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                        ((Analytics) ((e0) this.L$0).i).track(new CryptoTimeoutPerformanceDataRefreshTimeout(), null);
                    }
                    return Unit.INSTANCE;
                case 3:
                    BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    BigDecimal bigDecimal = (BigDecimal) this.L$0;
                    if (bigDecimal != null && bigDecimal.equals(BigDecimal.ZERO)) {
                        bitcoinTransferPresenter.navigator.goTo(new FailureMessageScreen(null, bitcoinTransferPresenter.stringManager.get(R.string.bitcoin_sell_error), null, bitcoinTransferPresenter.args, null, 21));
                    }
                    return Unit.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    LocalTabContentQueries localTabContentQueries = ((RealMultiBlockerFacilitator) this.L$0).queries;
                    localTabContentQueries.getClass();
                    QueryResult execute = localTabContentQueries.driver.execute(-1249299226, "DELETE FROM multiBlockerRequests\nWHERE group_id = ?", new BadgeKt$$ExternalSyntheticLambda3((String) obj2, 12));
                    localTabContentQueries.notifyQueries(-1249299226, new MoveBitcoinViewKt$$ExternalSyntheticLambda3(9));
                    return execute;
                case 5:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                    JobKt.launch$default(coroutineScope, null, null, new SsnPresenter$models$2$2(localPosCheckInPresenter, r6, 8), 3);
                    JobKt.launch$default(coroutineScope, null, null, new BalanceTransferLoadingPresenter$models$1$1$2(localPosCheckInPresenter, r6, 0), 3);
                    return Unit.INSTANCE;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    EarnerOnboardingAnalytics earnerOnboardingAnalytics = ((EarnerEnrollmentSuccessBlockerPresenter) this.L$0).earnerOnboardingAnalytics;
                    String str2 = (String) obj2;
                    str2.getClass();
                    earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingViewSuccess(str2), null);
                    return Unit.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    EarnerOnboardingAnalytics earnerOnboardingAnalytics2 = ((EarnerUpsellBlockerPresenter) this.L$0).earnerOnboardingAnalytics;
                    String str3 = (String) obj2;
                    str3.getClass();
                    earnerOnboardingAnalytics2.analytics.track(new EarningsOnboardingViewUpsell(str3), null);
                    return Unit.INSTANCE;
                case 8:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj2;
                    JobKt.launch$default(coroutineScope2, null, null, new InviteFriendsPresenter$models$2$1(poolsListPresenter, r6, i5), 3);
                    JobKt.launch$default(coroutineScope2, null, null, new InviteFriendsPresenter$models$2$1(poolsListPresenter, r6, i4), 3);
                    JobKt.launch$default(coroutineScope2, null, null, new InviteFriendsPresenter$models$2$1(poolsListPresenter, r6, i3), 3);
                    return Unit.INSTANCE;
                case 9:
                    BlockersHelper.BlockersAction.ShowError showError = (BlockersHelper.BlockersAction.ShowError) this.L$0;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    PasscodePresenter passcodePresenter = (PasscodePresenter) obj2;
                    passcodePresenter.navigator.goTo(new FailureMessageBlockerScreen(passcodePresenter.args.blockersData, showError.message, r6, i2));
                    return Unit.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((PromotionPanePresenter) this.L$0).navigator.goTo((Screen) obj2);
                    return Unit.INSTANCE;
                case 11:
                    BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) this.L$0;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) ((EndAppLockPresenter) obj2).appLockState;
                    if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                        remoteSkipErrorScreen = ((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen;
                    } else {
                        if (!(blockersAction instanceof BlockersHelper.BlockersAction.ShowError)) {
                            return Unit.INSTANCE;
                        }
                        remoteSkipErrorScreen = new BlockersScreens.RemoteSkipErrorScreen(((BlockersHelper.BlockersAction.ShowError) blockersAction).message);
                    }
                    screenNavigator.goTo(remoteSkipErrorScreen);
                    return Unit.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    StatusResultPresenter statusResultPresenter = (StatusResultPresenter) this.L$0;
                    BlockersScreens.StatusResultScreen statusResultScreen = statusResultPresenter.args;
                    AppMessagePayload appMessagePayload = statusResultScreen.getStatusResult().promo_payload;
                    String str4 = statusResultScreen.getStatusResult().promo_text;
                    Boolean bool = statusResultScreen.getStatusResult().show_confetti;
                    Boolean bool2 = Boolean.TRUE;
                    if (!Intrinsics.areEqual(bool, bool2)) {
                        bool = null;
                    }
                    if (!ArraysKt___ArraysKt.filterNotNull(new Serializable[]{bool, str4, appMessagePayload != null ? appMessagePayload.in_app_promo : null, appMessagePayload != null ? appMessagePayload.toggle : null}).isEmpty()) {
                        Analytics analytics2 = statusResultPresenter.analytics;
                        String str5 = statusResultScreen.getBlockersData().flowToken;
                        ClientScenario clientScenario = statusResultScreen.getBlockersData().clientScenario;
                        String analyticsName = clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, statusResultScreen.getBlockersData().flowType) : null;
                        Flow$Type flow$Type = statusResultScreen.getBlockersData().flowType;
                        analytics2.track(new BlockerFlowInteractShowStatusResult(str5, analyticsName, flow$Type != null ? flow$Type.name() : null, Boolean.valueOf(Intrinsics.areEqual(statusResultScreen.getStatusResult().show_confetti, bool2)), Boolean.valueOf(str4 != null), Boolean.valueOf((appMessagePayload != null ? appMessagePayload.in_app_promo : null) != null), Boolean.valueOf((appMessagePayload != null ? appMessagePayload.toggle : null) != null)), null);
                    }
                    if (str4 != null) {
                        upsell = new LayoutUpdate.PromoText(str4);
                    } else {
                        if ((appMessagePayload != null ? appMessagePayload.in_app_promo : null) != null) {
                            AppMessageInAppPromoTemplate appMessageInAppPromoTemplate = appMessagePayload.in_app_promo;
                            appMessageInAppPromoTemplate.getClass();
                            String str6 = appMessagePayload.message_token;
                            str6.getClass();
                            upsell = new LayoutUpdate.Promotions(appMessageInAppPromoTemplate, str6);
                        } else {
                            if ((appMessagePayload != null ? appMessagePayload.toggle : null) == null) {
                                layoutUpdate = null;
                                MutableState mutableState = (MutableState) obj2;
                                action = statusResultScreen.getStatusResult().action;
                                Activity activity = statusResultPresenter.activity;
                                BetterNavigator.ScreenNavigator screenNavigator2 = statusResultPresenter.navigator;
                                if (action != null) {
                                    StatusResult.Action action2 = statusResultScreen.getStatusResult().action;
                                    int i7 = action2 == null ? -1 : StatusResultPresenter.WhenMappings.$EnumSwitchMapping$0[action2.ordinal()];
                                    if (i7 == 1) {
                                        screenNavigator2.goTo(statusResultScreen.getBlockersData().exitScreen);
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        String str7 = statusResultScreen.getStatusResult().redirect_uri;
                                        str7.getClass();
                                        intent.setData(Uri.parse(str7));
                                        intent.setFlags(335544320);
                                        activity.finish();
                                        activity.startActivity(intent);
                                    } else if (i7 == 2) {
                                        if (!CollectionsKt__CollectionsKt.listOf((Object[]) new BlockersData.Flow[]{BlockersData.Flow.ONBOARDING, BlockersData.Flow.TRANSFER, BlockersData.Flow.INSTRUMENT_SELECTION}).contains(statusResultScreen.getBlockersData().flow)) {
                                            screenNavigator2.goTo(statusResultScreen.getBlockersData().exitScreen);
                                        }
                                        String str8 = statusResultScreen.getStatusResult().redirect_uri;
                                        str8.getClass();
                                        statusResultPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), str8);
                                    } else if (i7 == 3) {
                                        statusResultPresenter.launcher.activity.moveTaskToBack(true);
                                        screenNavigator2.goTo(statusResultScreen.getBlockersData().exitScreen);
                                    } else if (i7 == 4) {
                                        StatusResult.SupportAction supportAction = statusResultScreen.getStatusResult().support_action;
                                        if (supportAction == null) {
                                            a$$ExternalSyntheticBUOutline0.m$3("support_action is required to start support flow");
                                            return null;
                                        }
                                        ClientScenario clientScenario2 = statusResultScreen.getBlockersData().clientScenario;
                                        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("client_scenario", clientScenario2 != null ? clientScenario2.name() : null), new Pair("blocker_id", statusResultScreen.getBlockersData().blockerId), new Pair("node_token", supportAction.support_flow_node), new Pair("entity_token", supportAction.entity_id));
                                        Timber.Forest.e(new IllegalStateException("Deprecated API StatusResult.Action.START_SUPPORT_FLOW is used: " + mapOf));
                                        screenNavigator2.goTo(RealSupportNavigator.startSupportFlow$default(statusResultPresenter.supportNavigator, supportAction.support_flow_node, supportAction.entity_id, statusResultScreen.getBlockersData().exitScreen, SupportNavigator$Source.BLOCKER_FLOW, null, null, 100));
                                    }
                                    ready = StatusResultViewModel.Hidden.INSTANCE;
                                    mutableState.setValue(ready);
                                    return Unit.INSTANCE;
                                }
                                StatusResult.Icon icon2 = statusResultScreen.getStatusResult().icon;
                                String str9 = statusResultScreen.getStatusResult().text;
                                str9.getClass();
                                StatusResultButton statusResultButton = statusResultScreen.getStatusResult().primary_button;
                                statusResultButton.getClass();
                                StatusResultButton statusResultButton2 = statusResultScreen.getStatusResult().secondary_button;
                                ColorModel colorModel = statusResultScreen.getBlockersData().accentColor;
                                icon = statusResultScreen.getStatusResult().icon;
                                if (icon != null && ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) statusResultPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$ClientHapticsImprovements.INSTANCE)).enabled()) {
                                    ordinal = icon.ordinal();
                                    if (ordinal != 0 || ordinal == 1) {
                                        r6 = StatusResultViewModel.Ready.HapticEffect.SUCCESS;
                                    } else if (ordinal == 2 || ordinal == 3) {
                                        r6 = StatusResultViewModel.Ready.HapticEffect.ERROR;
                                    }
                                }
                                StatusResultViewModel.Ready.HapticEffect hapticEffect = r6;
                                Boolean bool3 = statusResultScreen.getStatusResult().show_confetti;
                                ready = new StatusResultViewModel.Ready(icon2, str9, statusResultButton, statusResultButton2, layoutUpdate, colorModel, false, hapticEffect, bool3 == null ? bool3.booleanValue() : false);
                                mutableState.setValue(ready);
                                return Unit.INSTANCE;
                            }
                            AppMessageToggleTemplate appMessageToggleTemplate = appMessagePayload.toggle;
                            appMessageToggleTemplate.getClass();
                            String str10 = appMessagePayload.message_token;
                            str10.getClass();
                            upsell = new LayoutUpdate.Upsell(appMessageToggleTemplate, str10);
                        }
                    }
                    layoutUpdate = upsell;
                    MutableState mutableState2 = (MutableState) obj2;
                    action = statusResultScreen.getStatusResult().action;
                    Activity activity2 = statusResultPresenter.activity;
                    BetterNavigator.ScreenNavigator screenNavigator22 = statusResultPresenter.navigator;
                    if (action != null) {
                    }
                    StatusResult.Icon icon22 = statusResultScreen.getStatusResult().icon;
                    String str92 = statusResultScreen.getStatusResult().text;
                    str92.getClass();
                    StatusResultButton statusResultButton3 = statusResultScreen.getStatusResult().primary_button;
                    statusResultButton3.getClass();
                    StatusResultButton statusResultButton22 = statusResultScreen.getStatusResult().secondary_button;
                    ColorModel colorModel2 = statusResultScreen.getBlockersData().accentColor;
                    icon = statusResultScreen.getStatusResult().icon;
                    if (icon != null) {
                        ordinal = icon.ordinal();
                        if (ordinal != 0) {
                        }
                        r6 = StatusResultViewModel.Ready.HapticEffect.SUCCESS;
                    }
                    StatusResultViewModel.Ready.HapticEffect hapticEffect2 = r6;
                    Boolean bool32 = statusResultScreen.getStatusResult().show_confetti;
                    ready = new StatusResultViewModel.Ready(icon22, str92, statusResultButton3, statusResultButton22, layoutUpdate, colorModel2, false, hapticEffect2, bool32 == null ? bool32.booleanValue() : false);
                    mutableState2.setValue(ready);
                    return Unit.INSTANCE;
                case 13:
                    String str11 = (String) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = ((CashCardKt$$ExternalSyntheticLambda0) obj2).f$0;
                    mutableState3.setValue(VerifyAliasPresenter.State.copy$default((VerifyAliasPresenter.State) mutableState3.getValue(), null, false, false, str11, false, 0, 55));
                    return Unit.INSTANCE;
                case 14:
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    WelcomePresenter welcomePresenter = (WelcomePresenter) obj2;
                    JobKt.launch$default(coroutineScope3, null, null, new WelcomePresenter$models$2$1(welcomePresenter, r6, i5), 3);
                    return JobKt.launch$default(coroutineScope3, null, null, new WelcomePresenter$models$2$1(welcomePresenter, r6, i3), 3);
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) this.L$0;
                    if (referralCodeViewModel.allowCodeInput && (((str = referralCodeViewModel.codeOverride) == null || str.length() == 0) && !referralCodeViewModel.showLoadingScreen)) {
                        FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj2);
                    }
                    return Unit.INSTANCE;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (((ReferralCodeViewModel) this.L$0).invalidSubmission) {
                        ((RealCashVibrator) obj2).error();
                    }
                    return Unit.INSTANCE;
                case 17:
                    List list = (List) this.L$0;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    RealBoostProvider realBoostProvider = (RealBoostProvider) obj2;
                    RewardQueries rewardQueries = realBoostProvider.rewardQueries;
                    List list2 = list;
                    rewardQueries.getClass();
                    list2.getClass();
                    RewardQueries$forIds$2 rewardQueries$forIds$2 = RewardQueries$forIds$2.INSTANCE;
                    return new RealActivityInvitePresenter(6, DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardQueries, list2, new RewardQueries$$ExternalSyntheticLambda1(rewardQueries, i6))), realBoostProvider.ioDispatcher), realBoostProvider, list);
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    RealBoostSyncer realBoostSyncer = (RealBoostSyncer) this.L$0;
                    realBoostSyncer.userRewardsDataQueries.transactionWithWrapper(new BorrowHomeKt$$ExternalSyntheticLambda1(i4, realBoostSyncer, (RewardsData) obj2));
                    return Unit.INSTANCE;
                case 19:
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                    Analytics analytics3 = (Analytics) disclosurePresenter.analytics;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) this.L$0;
                    if (borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.LoanDetails) {
                        BorrowHomeOverlayViewModel.LoanDetails loanDetails = (BorrowHomeOverlayViewModel.LoanDetails) borrowHomeOverlayViewModel;
                        analytics3.track(new BorrowAppletViewLoanDetails(loanDetails.cdfVariant, loanDetails.token), null);
                    } else if (borrowHomeOverlayViewModel instanceof BorrowHomeOverlayViewModel.InfoSheet) {
                        Screen parentScreen = ((BorrowHomeOverlay) disclosurePresenter.stringManager).getParentScreen();
                        if (parentScreen instanceof BorrowHome) {
                            analytics3.track(new BorrowAppletViewBulletinSheet(((BorrowHomeOverlayViewModel.InfoSheet) borrowHomeOverlayViewModel).primaryText), null);
                        } else if (parentScreen instanceof BorrowLimitHub) {
                            analytics3.track(new BorrowLimitHubViewBulletinSheet(((BorrowHomeOverlayViewModel.InfoSheet) borrowHomeOverlayViewModel).primaryText), null);
                        }
                    }
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics4 = ((BorrowHomePresenter) this.L$0).analytics;
                    analytics4.track(new BorrowAppletViewSeeTile(BorrowAppletViewSeeTile.TileType.BULLETINS), null);
                    Tile.AbstractC0074Tile abstractC0074Tile = ((Tile) obj2).tile;
                    if (abstractC0074Tile != null) {
                        Tile.AbstractC0074Tile.BorrowAppletBulletinsTile borrowAppletBulletinsTile = abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletBulletinsTile ? (Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) abstractC0074Tile : null;
                        if (borrowAppletBulletinsTile != null) {
                            data = borrowAppletBulletinsTile.value;
                            data.getClass();
                            upsellCard = data.upsell_card;
                            if (upsellCard != null) {
                                analytics4.track(new BorrowAppletViewUpsellCard(upsellCard.action_url, upsellCard.identifier), null);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    data = null;
                    data.getClass();
                    upsellCard = data.upsell_card;
                    if (upsellCard != null) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    BorrowLimitHubViewModel.Section section = (BorrowLimitHubViewModel.Section) obj2;
                    Analytics analytics5 = (Analytics) ((LocalEditorialPresenter) this.L$0).installedStore;
                    if (section instanceof BorrowLimitHubViewModel.Section.ProgressBarSectionModel) {
                        sectionType = BorrowLimitHubViewSeeSection.SectionType.LIMIT_PROGRESS;
                    } else if (section instanceof BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) {
                        sectionType = BorrowLimitHubViewSeeSection.SectionType.INCREASE_LIMIT_ACTIONS;
                    } else if (section instanceof BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) {
                        sectionType = BorrowLimitHubViewSeeSection.SectionType.LIMIT_INFO_BULLETS;
                    } else {
                        if (!(section instanceof BorrowLimitHubViewModel.Section.DisclaimerSection)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        sectionType = BorrowLimitHubViewSeeSection.SectionType.DISCLAIMER;
                    }
                    analytics5.track(new BorrowLimitHubViewSeeSection(sectionType), null);
                    if (section instanceof BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) {
                        BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection increaseLimitActionsSection = (BorrowLimitHubViewModel.Section.IncreaseLimitActionsSection) section;
                        Iterator it = increaseLimitActionsSection.ctaBullets.iterator();
                        while (it.hasNext()) {
                            analytics5.track(new BorrowLimitHubViewCtaBullet(((BorrowLimitHubViewModel.CtaBullet) it.next()).title, increaseLimitActionsSection.title), null);
                        }
                    }
                    return Unit.INSTANCE;
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    AfterPayOrderHubLoadingStatus.PaginatedLoadStatus paginatedLoadStatus = ((AfterPayOrderHubViewModel) this.L$0).loadingViewModel.paginatedLoadStatus;
                    AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Failure failure = paginatedLoadStatus instanceof AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Failure ? (AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Failure) paginatedLoadStatus : null;
                    if (failure != null) {
                        ToastKt.toast((Context) obj2, 0, failure.message);
                    }
                    return Unit.INSTANCE;
                case 23:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Context context = ((CardModelView) this.L$0).getContext();
                    context.getClass();
                    return CardsKt.createCopyPan$default(context, (CardModelView.CardBack) obj2);
                case 24:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    State state = (State) this.L$0;
                    int i8 = CardPreviewViewKt.$r8$clinit;
                    CardModelView.setTranslation$default((InteractiveCardView) obj2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ((Number) state.getValue()).floatValue(), 3, null);
                    return Unit.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) this.L$0;
                    int i9 = CardPreviewViewKt.$r8$clinit;
                    InteractiveCardView interactiveCardView = (InteractiveCardView) obj2;
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        AnimatorSet animatorSet = interactiveCardView.nfcAnimator;
                        if (animatorSet != null) {
                            InteractiveCardView.safeCancel(animatorSet);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(interactiveCardView.eyeIntensity, 500000.0f);
                        ofFloat.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda0(interactiveCardView, i4));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(interactiveCardView.fogOptions.height, 1.23f);
                        ofFloat2.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda3(interactiveCardView, ofFloat2, i6));
                        animatorSet2.addListener(new InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(interactiveCardView, i6));
                        animatorSet2.playTogether(ofFloat, ofFloat2);
                        animatorSet2.start();
                        interactiveCardView.nfcAnimator = animatorSet2;
                    } else {
                        AnimatorSet animatorSet3 = interactiveCardView.nfcAnimator;
                        if (animatorSet3 != null) {
                            InteractiveCardView.safeCancel(animatorSet3);
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(interactiveCardView.eyeIntensity, RecyclerView.DECELERATION_RATE);
                        ofFloat3.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda0(interactiveCardView, i3));
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(interactiveCardView.fogOptions.height, RecyclerView.DECELERATION_RATE);
                        ofFloat4.addUpdateListener(new InteractiveCardView$$ExternalSyntheticLambda3(interactiveCardView, ofFloat4, i5));
                        animatorSet4.playTogether(ofFloat3, ofFloat4);
                        animatorSet4.start();
                        interactiveCardView.nfcAnimator = animatorSet4;
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    int i10 = CardPreviewViewKt.$r8$clinit;
                    boolean booleanValue = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                    StyledCardPerspectiveView styledCardPerspectiveView = (StyledCardPerspectiveView) this.L$0;
                    if (booleanValue) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(styledCardPerspectiveView.getDreamLights().eyeAlpha, 255);
                        ofInt.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, i6));
                        ofInt.start();
                    } else {
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(styledCardPerspectiveView.getDreamLights().eyeAlpha, 0);
                        ofInt2.addUpdateListener(new StyledCardPerspectiveView$$ExternalSyntheticLambda3(styledCardPerspectiveView, i5));
                        ofInt2.start();
                    }
                    return Unit.INSTANCE;
                case 27:
                    PatternStampState patternStampState = (PatternStampState) obj2;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = patternStampState.boxWidth$delegate;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if ((((CardStudioViewModelV2.Content) this.L$0).customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP) && parcelableSnapshotMutableIntState.getIntValue() > 0) {
                        parcelableSnapshotMutableIntState.setIntValue(0);
                        patternStampState.boxHeight$delegate.setIntValue(0);
                    }
                    return Unit.INSTANCE;
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (((ProductDetailsPageViewModel) this.L$0) != null) {
                        int i11 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                        ((MutableState) obj2).setValue(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    LayoutCompat_androidKt layoutCompat_androidKt = (LayoutCompat_androidKt) obj2;
                    Context context2 = ((CardAssetManager) this.L$0).context;
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Albedo) {
                        CardAssetManager$AssetKey$Albedo cardAssetManager$AssetKey$Albedo = (CardAssetManager$AssetKey$Albedo) layoutCompat_androidKt;
                        return CardsKt.createAlbedo$default(context2, cardAssetManager$AssetKey$Albedo.id, cardAssetManager$AssetKey$Albedo.background, cardAssetManager$AssetKey$Albedo.color, cardAssetManager$AssetKey$Albedo.cardBack, cardAssetManager$AssetKey$Albedo.opacity, cardAssetManager$AssetKey$Albedo.backInkColor, cardAssetManager$AssetKey$Albedo.magStripeColor);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Normal) {
                        return CardsKt.createNormal$default(context2, ((CardAssetManager$AssetKey$Normal) layoutCompat_androidKt).background);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$InkMetalHeat) {
                        CardAssetManager$AssetKey$InkMetalHeat cardAssetManager$AssetKey$InkMetalHeat = (CardAssetManager$AssetKey$InkMetalHeat) layoutCompat_androidKt;
                        return CardsKt.createInkMetal$default(context2, cardAssetManager$AssetKey$InkMetalHeat.cardFront, cardAssetManager$AssetKey$InkMetalHeat.cardBack);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HeatColors) {
                        CardTheme.BackgroundImage backgroundImage = ((CardAssetManager$AssetKey$HeatColors) layoutCompat_androidKt).background;
                        RectF rectF = CardsKt.ICON_TEXTURE_BOUNDS;
                        context2.getClass();
                        if (backgroundImage != CardTheme.BackgroundImage.MOOD) {
                            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        }
                        Bitmap decodeResource = BitmapFactory.decodeResource(context2.getResources(), R.drawable.temperature_map);
                        decodeResource.getClass();
                        return decodeResource;
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Shimmer) {
                        return CardsKt.cardShimmerGradient$default(context2);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HoloBase) {
                        return CardAssetManager.loadHoloTexture(context2, ((CardAssetManager$AssetKey$HoloBase) layoutCompat_androidKt).id, true);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$HoloReflect) {
                        return CardAssetManager.loadHoloTexture(context2, ((CardAssetManager$AssetKey$HoloReflect) layoutCompat_androidKt).id, false);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$SnakeSkin) {
                        Bitmap decodeResource2 = BitmapFactory.decodeResource(context2.getResources(), R.drawable.snake_skin_texture);
                        decodeResource2.getClass();
                        return decodeResource2;
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$CopyPan) {
                        return CardsKt.createCopyPan$default(context2, ((CardAssetManager$AssetKey$CopyPan) layoutCompat_androidKt).cardBack);
                    }
                    if (layoutCompat_androidKt instanceof CardAssetManager$AssetKey$ContouredText) {
                        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText = (CardAssetManager$AssetKey$ContouredText) layoutCompat_androidKt;
                        return CardsKt.createContouredText$default(context2, cardAssetManager$AssetKey$ContouredText.color, cardAssetManager$AssetKey$ContouredText.text);
                    }
                    if (!(layoutCompat_androidKt instanceof CardAssetManager$AssetKey$Placeholder)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(0);
                    return createBitmap;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    /* renamed from: com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function3 {
        public /* synthetic */ boolean $front;
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InteractiveCardView interactiveCardView, boolean z, Continuation continuation) {
            super(3, continuation);
            this.$r8$classId = 0;
            this.this$0 = interactiveCardView;
            this.$front = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 3;
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1((InteractiveCardView) this.this$0, this.$front, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
                case 1:
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, (Continuation) obj3, 1);
                    anonymousClass1.this$0 = (RewardStatus) obj;
                    anonymousClass1.$front = booleanValue;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                case 2:
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(i, (Continuation) obj3, 2);
                    anonymousClass12.$front = booleanValue2;
                    anonymousClass12.this$0 = (MultilineTextInputValidator$Result) obj2;
                    return anonymousClass12.invokeSuspend(Unit.INSTANCE);
                case 3:
                    boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(i, (Continuation) obj3, i);
                    anonymousClass13.this$0 = (CashAppCard.PhysicalCardOrderState) obj;
                    anonymousClass13.$front = booleanValue3;
                    return anonymousClass13.invokeSuspend(Unit.INSTANCE);
                case 4:
                    boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(i, (Continuation) obj3, 4);
                    anonymousClass14.this$0 = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
                    anonymousClass14.$front = booleanValue4;
                    return anonymousClass14.invokeSuspend(Unit.INSTANCE);
                default:
                    boolean booleanValue5 = ((Boolean) obj).booleanValue();
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(i, (Continuation) obj3, 5);
                    anonymousClass15.$front = booleanValue5;
                    anonymousClass15.this$0 = (CashCreditScoreEntryPointData) obj2;
                    return anonymousClass15.invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = false;
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    InteractiveCardView interactiveCardView = (InteractiveCardView) this.this$0;
                    boolean z2 = this.$front;
                    float[] fArr = InteractiveCardView.X_AXIS;
                    interactiveCardView.startWobble(z2);
                    return Unit.INSTANCE;
                case 1:
                    RewardStatus rewardStatus = (RewardStatus) this.this$0;
                    boolean z3 = this.$front;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    RewardStatus rewardStatus2 = RealReferralManager.DEFAULT;
                    rewardStatus.getClass();
                    return new ReferralManager$RewardStatus(rewardStatus.available_reward_payments, rewardStatus.completed_reward_payments, rewardStatus.reward_payment_amount, rewardStatus.expiration, rewardStatus.reward_header_text, rewardStatus.reward_main_text, rewardStatus.minimum_code_length, rewardStatus.code_entry_enabled, rewardStatus.reward_screen_enabled, rewardStatus.code_entry_client_route, rewardStatus.referral_status_screen, !z3);
                case 2:
                    boolean z4 = this.$front;
                    MultilineTextInputValidator$Result multilineTextInputValidator$Result = (MultilineTextInputValidator$Result) this.this$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (z4 && !(multilineTextInputValidator$Result instanceof MultilineTextInputValidator$Result.Failure)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                case 3:
                    CashAppCard.PhysicalCardOrderState physicalCardOrderState = (CashAppCard.PhysicalCardOrderState) this.this$0;
                    boolean z5 = this.$front;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return new Pair(physicalCardOrderState, Boolean.valueOf(z5));
                case 4:
                    FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) this.this$0;
                    boolean z6 = this.$front;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    if (featureFlag$EnabledDisabledAmplitudeExperiment$Options.enabled() && z6) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    boolean z7 = this.$front;
                    CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) this.this$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    return (!z7 || cashCreditScoreEntryPointData == null) ? AppletAvailabilityState.UNAVAILABLE : AppletAvailabilityState.AVAILABLE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i) {
            super(3, null);
            this.$r8$classId = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveCardView$flingTo$1(RealOfflineManager realOfflineManager, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realOfflineManager;
        this.$velocity = j;
        this.$front = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveCardView$flingTo$1(boolean z, AndroidViewHolder androidViewHolder, long j, Continuation continuation) {
        super(2, continuation);
        this.$front = z;
        this.this$0 = androidViewHolder;
        this.$velocity = j;
    }
}
