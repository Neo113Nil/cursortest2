package com.squareup.cash.earnings.presenters.home;

import android.net.Uri;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.core.os.BundleKt;
import androidx.room.Room;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.Result;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.featureeligibility.FeatureEligibilityRetrieveCanceled;
import com.squareup.cash.cdf.featureeligibility.FeatureEligibilityRetrieveFailed;
import com.squareup.cash.cdf.featureeligibility.FeatureEligibilityRetrieveStarted;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibilityQueries$EligibilityQuery;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.earnings.backend.api.EarnerModeResult;
import com.squareup.cash.earnings.backend.api.EarningsStream;
import com.squareup.cash.earnings.backend.api.MonthlyEarnings;
import com.squareup.cash.earnings.backend.real.RealEarningsStreamsRepository;
import com.squareup.cash.earnings.backend.real.RealEarningsStreamsRepositoryKt;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$OnAttemptToLoadUrl;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.real.RealEligibilityRefresher$refreshEligibility$2$1$1$1;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.SavingsInterestData;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager$syncValues$1$1$1;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.family.familyhub.presenters.FamilyPendingRequestsPresenter;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountsRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountsResponse;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyPendingRequestsResponse;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.GetC4bEligibilityResponse;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsRequest;
import com.squareup.protos.cash.p2pencoreedge.plasma.flows.Type;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningStreamsSummaryRequest;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningStreamsSummaryResponse;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.piggybank.appapi.GetInterestSettingsRequest;
import com.squareup.protos.cash.piggybank.appapi.GetInterestSettingsResponse;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import squareup.cash.earnings.EarningStream;
import squareup.cash.earnings.EarningStreamIdentifier;
import squareup.cash.earnings.EarningStreamsData;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.earnings.EarningsYearMonth;
import squareup.cash.earnings.EarningsYearToDate;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class EarningsHomePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public Object $earnerModeSubmitState$delegate;
    public /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsHomePresenter$models$3$1(int i, EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData, Continuation continuation, OkHttpCall.AnonymousClass1 anonymousClass1) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.$event = eligibilityRefreshAnalyticsData;
        this.label = i;
        this.$earnerModeSubmitState$delegate = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new EarningsHomePresenter$models$3$1((EarningsHomePresenter) this.this$0, (EarningsHomeViewEvent) this.$event, (MutableState) this.$earnerModeSubmitState$delegate, continuation, 0);
            case 1:
                return new EarningsHomePresenter$models$3$1((LocalEditorialPresenter) this.this$0, (MutableState) this.$event, continuation, 1);
            case 2:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$1 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (DisclosurePresenter) this.$earnerModeSubmitState$delegate, 2);
                earningsHomePresenter$models$3$1.this$0 = obj;
                return earningsHomePresenter$models$3$1;
            case 3:
                return new EarningsHomePresenter$models$3$1((DateFilter) this.this$0, (String) this.$event, (RealEarningsStreamsRepository) this.$earnerModeSubmitState$delegate, continuation, 3);
            case 4:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$12 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 4);
                earningsHomePresenter$models$3$12.this$0 = obj;
                return earningsHomePresenter$models$3$12;
            case 5:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$13 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (CardStudioPresenter) this.$earnerModeSubmitState$delegate, 5);
                earningsHomePresenter$models$3$13.this$0 = obj;
                return earningsHomePresenter$models$3$13;
            case 6:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$14 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (LocalEditorialPresenter) this.$earnerModeSubmitState$delegate, 6);
                earningsHomePresenter$models$3$14.this$0 = obj;
                return earningsHomePresenter$models$3$14;
            case 7:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$15 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (NetEarningsInfoSheetPresenter) this.$earnerModeSubmitState$delegate, 7);
                earningsHomePresenter$models$3$15.this$0 = obj;
                return earningsHomePresenter$models$3$15;
            case 8:
                return new EarningsHomePresenter$models$3$1((EducationStoryPresenter) this.this$0, (EducationStoryViewEvent) this.$event, (ParcelableSnapshotMutableIntState) this.$earnerModeSubmitState$delegate, continuation, 8);
            case 9:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$16 = new EarningsHomePresenter$models$3$1(this.label, (EligibilityRefreshAnalyticsData) this.$event, continuation, (OkHttpCall.AnonymousClass1) this.$earnerModeSubmitState$delegate);
                earningsHomePresenter$models$3$16.this$0 = obj;
                return earningsHomePresenter$models$3$16;
            case 10:
                return new EarningsHomePresenter$models$3$1((RealFeatureEligibilityRepository) this.$event, (RealFeatureEligibilityRepository.UpdateEligibilityRequest) this.$earnerModeSubmitState$delegate, continuation);
            case 11:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$17 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (DisclosurePresenter) this.$earnerModeSubmitState$delegate, 11);
                earningsHomePresenter$models$3$17.this$0 = obj;
                return earningsHomePresenter$models$3$17;
            case 12:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$18 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (EndAppLockPresenter) this.$earnerModeSubmitState$delegate, 12);
                earningsHomePresenter$models$3$18.this$0 = obj;
                return earningsHomePresenter$models$3$18;
            case 13:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$19 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (EndAppLockPresenter) this.$earnerModeSubmitState$delegate, 13);
                earningsHomePresenter$models$3$19.this$0 = obj;
                return earningsHomePresenter$models$3$19;
            case 14:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$110 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (DisclosurePresenter) this.$earnerModeSubmitState$delegate, 14);
                earningsHomePresenter$models$3$110.this$0 = obj;
                return earningsHomePresenter$models$3$110;
            case 15:
                return new EarningsHomePresenter$models$3$1((RealDependentAllowanceManager) this.this$0, (String) this.$event, (String) this.$earnerModeSubmitState$delegate, continuation, 15);
            case 16:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$111 = new EarningsHomePresenter$models$3$1((RealDependentBalancesStore) this.$earnerModeSubmitState$delegate, continuation, 16);
                earningsHomePresenter$models$3$111.$event = obj;
                return earningsHomePresenter$models$3$111;
            case 17:
                return new EarningsHomePresenter$models$3$1((Flow) this.this$0, (RealTargetEntityManager) this.$event, (ParcelableSnapshotMutableIntState) this.$earnerModeSubmitState$delegate, continuation, 17);
            case 18:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$112 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 18);
                earningsHomePresenter$models$3$112.this$0 = obj;
                return earningsHomePresenter$models$3$112;
            case 19:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$113 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 19);
                earningsHomePresenter$models$3$113.this$0 = obj;
                return earningsHomePresenter$models$3$113;
            case 20:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$114 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (LocalPosCheckInPresenter) this.$earnerModeSubmitState$delegate, 20);
                earningsHomePresenter$models$3$114.this$0 = obj;
                return earningsHomePresenter$models$3$114;
            case 21:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$115 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 21);
                earningsHomePresenter$models$3$115.this$0 = obj;
                return earningsHomePresenter$models$3$115;
            case 22:
                return new EarningsHomePresenter$models$3$1((FamilyHomePresenter) this.this$0, (MutableState) this.$event, continuation, 22);
            case 23:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$116 = new EarningsHomePresenter$models$3$1((FamilyHomePresenter) this.$earnerModeSubmitState$delegate, continuation, 23);
                earningsHomePresenter$models$3$116.$event = obj;
                return earningsHomePresenter$models$3$116;
            case 24:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$117 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (FamilyPendingRequestsPresenter) this.$earnerModeSubmitState$delegate, 24);
                earningsHomePresenter$models$3$117.this$0 = obj;
                return earningsHomePresenter$models$3$117;
            case 25:
                return new EarningsHomePresenter$models$3$1((FamilyPendingRequestsPresenter) this.this$0, (MutableState) this.$event, continuation, 25);
            case 26:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$118 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 26);
                earningsHomePresenter$models$3$118.this$0 = obj;
                return earningsHomePresenter$models$3$118;
            case 27:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$119 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (LocalEditorialPresenter) this.$earnerModeSubmitState$delegate, 27);
                earningsHomePresenter$models$3$119.this$0 = obj;
                return earningsHomePresenter$models$3$119;
            case 28:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$120 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (MusicPresenter) this.$earnerModeSubmitState$delegate, 28);
                earningsHomePresenter$models$3$120.this$0 = obj;
                return earningsHomePresenter$models$3$120;
            default:
                EarningsHomePresenter$models$3$1 earningsHomePresenter$models$3$121 = new EarningsHomePresenter$models$3$1((Flow) this.$event, continuation, (EndAppLockPresenter) this.$earnerModeSubmitState$delegate, 29);
                earningsHomePresenter$models$3$121.this$0 = obj;
                return earningsHomePresenter$models$3$121;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((EarningsHomePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c1, code lost:
    
        if (r2.emit(r5, r24) == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03a7, code lost:
    
        if (r1 == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0372, code lost:
    
        if (r4 == r3) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:554:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x09f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x082a  */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.net.Uri] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        MutableState mutableState;
        Object obj2;
        EarningsTimeFrame earningsTimeFrame;
        Object earningStreamsSummary;
        EarningsStream earningsStream;
        String str;
        String str2;
        EarningsStream.Avatar avatar;
        Money money;
        Color.ModeVariant modeVariant;
        Color.ModeVariant modeVariant2;
        YearMonth yearMonth;
        EarningsYearMonth earningsYearMonth;
        String str3;
        long j;
        Object until;
        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData;
        Object interestSettingsAppActionV2;
        SavingsInterestData savingsInterestData;
        InterestYieldStatus interestYieldStatus;
        Object first;
        LocalizedString localizedString;
        MutableState mutableState2;
        Object familyAccounts;
        Object loadAccounts;
        Object obj3;
        MutableState mutableState3;
        Object familyPendingRequests;
        int i = 4;
        int i2 = 5;
        int i3 = 10;
        int i4 = 14;
        int i5 = 15;
        int i6 = 0;
        r14 = null;
        r14 = null;
        FamilyAccountsParameters familyAccountsParameters = null;
        switch (this.$r8$classId) {
            case 0:
                MutableState mutableState4 = (MutableState) this.$earnerModeSubmitState$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result result = ((EarningsHomePresenter) this.this$0).earnerModeRepository;
                    long j2 = ((EarningsHomeViewEvent.SubmitEarnerMode) ((EarningsHomeViewEvent) this.$event)).durationSeconds;
                    this.label = 1;
                    withContext = JobKt.withContext((CoroutineContext) result.resultMetadata, new FlashControl$applyScreenFlash$3(j2, result, (Continuation) null, 9), this);
                    if (withContext == coroutineSingletons) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                EarnerModeResult earnerModeResult = (EarnerModeResult) withContext;
                if (Intrinsics.areEqual(earnerModeResult, EarnerModeResult.Success.INSTANCE)) {
                    Timber.Forest.d("Successfully enabled Earner Mode", new Object[0]);
                    mutableState4.setValue(EarningsHomeViewModel.EarnerModeSheet.SubmitState.IDLE);
                } else if (!(earnerModeResult instanceof EarnerModeResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    Timber.Forest.d("Failed to enable Earner Mode", new Object[0]);
                    mutableState4.setValue(EarningsHomeViewModel.EarnerModeSheet.SubmitState.FAILED);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState5 = (MutableState) this.$event;
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                    RealFileDownloader realFileDownloader = ((RealFormPdfProvider) localEditorialPresenter.service).fileDownloader;
                    String str4 = ((DirectDepositUpdateManualFormScreen) localEditorialPresenter.screen).token;
                    this.$earnerModeSubmitState$delegate = mutableState5;
                    this.label = 1;
                    FileDownloader$Category fileDownloader$Category = FileDownloader$Category.DDA_FORM;
                    r14 = realFileDownloader.ready(fileDownloader$Category, str4) ? realFileDownloader.localUri(fileDownloader$Category, str4) : null;
                    if (r14 == coroutineSingletons2) {
                        break;
                    } else {
                        mutableState = mutableState5;
                        obj2 = r14;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = (MutableState) this.$earnerModeSubmitState$delegate;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                }
                mutableState.setValue((Uri) obj2);
                break;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass4 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope, (DisclosurePresenter) this.$earnerModeSubmitState$delegate, i);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass4, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DateFilter dateFilter = (DateFilter) this.this$0;
                    if (dateFilter != null) {
                        if (dateFilter instanceof DateFilter.Monthly) {
                            DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter;
                            earningsTimeFrame = new EarningsTimeFrame(new EarningsTimeFrame.TimeFrame.YearMonth(new EarningsYearMonth(Integer.valueOf(monthly.year), Integer.valueOf(monthly.month))));
                        } else if (dateFilter instanceof DateFilter.Yearly) {
                            earningsTimeFrame = new EarningsTimeFrame(new EarningsTimeFrame.TimeFrame.YearToDate(new EarningsYearToDate(Integer.valueOf(((DateFilter.Yearly) dateFilter).year))));
                        } else if (!(dateFilter instanceof DateFilter.AllTime)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                        String str5 = (String) this.$event;
                        GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest = new GetEarningStreamsSummaryRequest(earningsTimeFrame, str5 == null ? new EarningStreamIdentifier(str5, ByteString.EMPTY) : null, ByteString.EMPTY);
                        PaychecksAppService paychecksAppService = ((RealEarningsStreamsRepository) this.$earnerModeSubmitState$delegate).appService;
                        this.label = 1;
                        earningStreamsSummary = paychecksAppService.getEarningStreamsSummary(getEarningStreamsSummaryRequest, this);
                        if (earningStreamsSummary == coroutineSingletons4) {
                            break;
                        }
                    }
                    earningsTimeFrame = null;
                    String str52 = (String) this.$event;
                    GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest2 = new GetEarningStreamsSummaryRequest(earningsTimeFrame, str52 == null ? new EarningStreamIdentifier(str52, ByteString.EMPTY) : null, ByteString.EMPTY);
                    PaychecksAppService paychecksAppService2 = ((RealEarningsStreamsRepository) this.$earnerModeSubmitState$delegate).appService;
                    this.label = 1;
                    earningStreamsSummary = paychecksAppService2.getEarningStreamsSummary(getEarningStreamsSummaryRequest2, this);
                    if (earningStreamsSummary == coroutineSingletons4) {
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    earningStreamsSummary = obj;
                }
                ApiResult apiResult = (ApiResult) earningStreamsSummary;
                if (apiResult instanceof ApiResult.Success) {
                    GetEarningStreamsSummaryResponse getEarningStreamsSummaryResponse = (GetEarningStreamsSummaryResponse) ((ApiResult.Success) apiResult).response;
                    List<EarningStreamsData> list = getEarningStreamsSummaryResponse.streams_data;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (EarningStreamsData earningStreamsData : list) {
                        EarningsYearMonth earningsYearMonth2 = earningStreamsData.year_month_period;
                        if (earningsYearMonth2 == null || (yearMonth = RealEarningsStreamsRepositoryKt.toYearMonth(earningsYearMonth2)) == null) {
                            EarningsTimeFrame earningsTimeFrame2 = earningStreamsData.period;
                            if (earningsTimeFrame2 != null) {
                                EarningsTimeFrame.TimeFrame timeFrame = earningsTimeFrame2.time_frame;
                                EarningsTimeFrame.TimeFrame.YearMonth yearMonth2 = timeFrame instanceof EarningsTimeFrame.TimeFrame.YearMonth ? (EarningsTimeFrame.TimeFrame.YearMonth) timeFrame : null;
                                if (yearMonth2 != null && (earningsYearMonth = yearMonth2.value) != null) {
                                    yearMonth = RealEarningsStreamsRepositoryKt.toYearMonth(earningsYearMonth);
                                }
                            }
                            yearMonth = null;
                        }
                        if (yearMonth != null) {
                            for (EarningStream earningStream : earningStreamsData.streams) {
                                EarningStreamIdentifier earningStreamIdentifier = earningStream.identifier;
                                String str6 = earningStreamIdentifier != null ? earningStreamIdentifier.token : null;
                                if (str6 != null && !StringsKt.isBlank(str6) && (str3 = earningStream.display_name) != null && !StringsKt.isBlank(str3)) {
                                    EarningStreamIdentifier earningStreamIdentifier2 = earningStream.identifier;
                                    earningStreamIdentifier2.getClass();
                                    String str7 = earningStreamIdentifier2.token;
                                    str7.getClass();
                                    Object obj4 = linkedHashMap.get(str7);
                                    Object obj5 = obj4;
                                    if (obj4 == null) {
                                        ArrayList arrayList = new ArrayList();
                                        linkedHashMap.put(str7, arrayList);
                                        obj5 = arrayList;
                                    }
                                    ((List) obj5).add(new Pair(yearMonth, earningStream));
                                }
                            }
                        }
                    }
                    Collection<List> values = linkedHashMap.values();
                    values.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (List list2 : values) {
                        list2.getClass();
                        EarningStream earningStream2 = (EarningStream) ((Pair) CollectionsKt.first(list2)).second;
                        EarningStreamIdentifier earningStreamIdentifier3 = earningStream2.identifier;
                        if (earningStreamIdentifier3 != null && (str = earningStreamIdentifier3.token) != null) {
                            if (StringsKt.isBlank(str)) {
                                str = null;
                            }
                            if (str != null && (str2 = earningStream2.display_name) != null) {
                                if (StringsKt.isBlank(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    List<Pair> list3 = list2;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i3));
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add((EarningStream) ((Pair) it.next()).second);
                                    }
                                    CurrencyCode fallbackCurrency = RealEarningsStreamsRepositoryKt.fallbackCurrency(arrayList3);
                                    UiAvatar uiAvatar = earningStream2.avatar;
                                    if (uiAvatar != null) {
                                        Image image = uiAvatar.image;
                                        String str8 = image != null ? image.light_url : null;
                                        String str9 = image != null ? image.dark_url : null;
                                        String str10 = uiAvatar.monogram_text;
                                        Color color = uiAvatar.background_color;
                                        avatar = new EarningsStream.Avatar(str8, str9, str10, (color == null || (modeVariant2 = color.light) == null) ? null : modeVariant2.srgb, (color == null || (modeVariant = color.dark) == null) ? null : modeVariant.srgb);
                                    } else {
                                        avatar = null;
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i3));
                                    for (Pair pair : list3) {
                                        YearMonth yearMonth3 = (YearMonth) pair.first;
                                        Money money2 = ((EarningStream) pair.second).earnings;
                                        if (money2 != null) {
                                            Long l = money2.amount;
                                            Long valueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                                            CurrencyCode currencyCode = money2.currency_code;
                                            if (currencyCode == null) {
                                                currencyCode = fallbackCurrency;
                                            }
                                            money = Money.copy$default(money2, valueOf, currencyCode, null, 4);
                                        } else {
                                            money = new Money((Long) 0L, fallbackCurrency, 4);
                                        }
                                        arrayList4.add(new MonthlyEarnings(yearMonth3, money));
                                    }
                                    earningsStream = new EarningsStream(str, str2, avatar, arrayList4);
                                    if (earningsStream == null) {
                                        arrayList2.add(earningsStream);
                                    }
                                    i3 = 10;
                                }
                            }
                        }
                        earningsStream = null;
                        if (earningsStream == null) {
                        }
                        i3 = 10;
                    }
                    List list4 = getEarningStreamsSummaryResponse.streams_data;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        CollectionsKt__MutableCollectionsKt.addAll(((EarningStreamsData) it2.next()).streams, arrayList5);
                    }
                    break;
                } else if (apiResult instanceof ApiResult.Failure) {
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass42 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope2, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(anonymousClass42, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass43 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope3, (CardStudioPresenter) this.$earnerModeSubmitState$delegate, 6);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(anonymousClass43, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass44 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope4, (LocalEditorialPresenter) this.$earnerModeSubmitState$delegate, 7);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(anonymousClass44, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass45 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope5, (NetEarningsInfoSheetPresenter) this.$earnerModeSubmitState$delegate, 8);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(anonymousClass45, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EducationStoryPresenter educationStoryPresenter = (EducationStoryPresenter) this.this$0;
                    String str11 = ((EducationStoryViewEvent$WebViewEvents$OnAttemptToLoadUrl) ((EducationStoryViewEvent) this.$event)).url;
                    int intValue = ((ParcelableSnapshotMutableIntState) this.$earnerModeSubmitState$delegate).getIntValue();
                    this.label = 1;
                    if (EducationStoryPresenter.access$handleNewUrl(educationStoryPresenter, str11, intValue, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData2 = (EligibilityRefreshAnalyticsData) this.$event;
                EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData3 = new EligibilityRefreshAnalyticsData(eligibilityRefreshAnalyticsData2.policyChangeTimestamp, new Long(this.label), eligibilityRefreshAnalyticsData2.originDescription);
                OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) this.$earnerModeSubmitState$delegate;
                JobKt.launch$default(coroutineScope6, null, null, new RealEligibilityRefresher$refreshEligibility$2$1$1$1(false ? 1 : 0, eligibilityRefreshAnalyticsData3, r14, anonymousClass1), 3);
                break;
            case 10:
                RealFeatureEligibilityRepository.UpdateEligibilityRequest updateEligibilityRequest = (RealFeatureEligibilityRepository.UpdateEligibilityRequest) this.$earnerModeSubmitState$delegate;
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) this.$event;
                InstrumentQueries instrumentQueries = realFeatureEligibilityRepository.eligibilityQueries;
                SessionManager sessionManager = realFeatureEligibilityRepository.sessionManager;
                Analytics analytics = realFeatureEligibilityRepository.analytics;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
                    if (activeAccountTokenOrNull == null) {
                        break;
                    } else {
                        boolean z = updateEligibilityRequest instanceof RealFeatureEligibilityRepository.UpdateEligibilityRequest.Forced;
                        if (!z) {
                            j = 0;
                            if (updateEligibilityRequest instanceof RealFeatureEligibilityRepository.UpdateEligibilityRequest.CacheExpired) {
                                long j3 = ((RealFeatureEligibilityRepository.UpdateEligibilityRequest.CacheExpired) updateEligibilityRequest).expiredAtMillis;
                                instrumentQueries.getClass();
                                Long l2 = (Long) new SingleAccountHolderEligibilityQueries$EligibilityQuery(instrumentQueries, activeAccountTokenOrNull, new ProfileQueries$$ExternalSyntheticLambda4(14)).executeAsOneOrNull();
                                if (j3 <= (l2 != null ? l2.longValue() : 0L)) {
                                    break;
                                }
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else {
                            j = 0;
                        }
                        RealFeatureEligibilityRepository.UpdateEligibilityRequest.Forced forced = z ? (RealFeatureEligibilityRepository.UpdateEligibilityRequest.Forced) updateEligibilityRequest : null;
                        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData4 = forced != null ? forced.analyticsData : null;
                        analytics.track(new FeatureEligibilityRetrieveStarted(eligibilityRefreshAnalyticsData4 != null ? new Long(eligibilityRefreshAnalyticsData4.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData4 != null ? eligibilityRefreshAnalyticsData4.originDescription : null, eligibilityRefreshAnalyticsData4 != null ? eligibilityRefreshAnalyticsData4.currentAttempt : null), null);
                        Signal signal = realFeatureEligibilityRepository.signOut;
                        RealMRIFactory$sign$2.AnonymousClass1 anonymousClass12 = new RealMRIFactory$sign$2.AnonymousClass1(realFeatureEligibilityRepository, activeAccountTokenOrNull, r14, i2);
                        this.this$0 = eligibilityRefreshAnalyticsData4;
                        this.label = 1;
                        until = StateFlowKt.until(signal, anonymousClass12, this);
                        if (until == coroutineSingletons11) {
                            break;
                        } else {
                            eligibilityRefreshAnalyticsData = eligibilityRefreshAnalyticsData4;
                        }
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData5 = (EligibilityRefreshAnalyticsData) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    eligibilityRefreshAnalyticsData = eligibilityRefreshAnalyticsData5;
                    j = 0;
                    until = obj;
                }
                ApiResult apiResult2 = (ApiResult) until;
                boolean z2 = PlatformKt.getCurrentSessionState(sessionManager) instanceof SwitchingState;
                if (apiResult2 != null && !z2) {
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData6 = eligibilityRefreshAnalyticsData;
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            ApiResult.Failure failure = (ApiResult.Failure) apiResult2;
                            analytics.track(new FeatureEligibilityRetrieveFailed(eligibilityRefreshAnalyticsData6 != null ? new Long(eligibilityRefreshAnalyticsData6.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData6 != null ? eligibilityRefreshAnalyticsData6.currentAttempt : null, Room.toAnalyticsString(failure), eligibilityRefreshAnalyticsData6 != null ? eligibilityRefreshAnalyticsData6.originDescription : null), null);
                            if (!BundleKt.isRetryable(failure)) {
                                instrumentQueries.driver.execute(1223099887, "DELETE FROM singleAccountHolderEligibility", null);
                                instrumentQueries.notifyQueries(1223099887, new ProfileQueries$$ExternalSyntheticLambda4(15));
                            }
                        }
                    } else {
                        GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) ((ApiResult.Success) apiResult2).response;
                        String str12 = getC4bEligibilityResponse.customer_token;
                        if (str12 == null) {
                            break;
                        } else {
                            long millis = realFeatureEligibilityRepository.clock.millis();
                            Long l3 = getC4bEligibilityResponse.ttl;
                            realFeatureEligibilityRepository.eligibilityQueries.transactionWithWrapper(new BadgeQueries$$ExternalSyntheticLambda3(realFeatureEligibilityRepository, str12, TimeUnit.SECONDS.toMillis(l3 != null ? l3.longValue() : j) + millis, getC4bEligibilityResponse, eligibilityRefreshAnalyticsData));
                        }
                    }
                    break;
                } else {
                    EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData7 = eligibilityRefreshAnalyticsData;
                    analytics.track(new FeatureEligibilityRetrieveCanceled(eligibilityRefreshAnalyticsData7 != null ? new Long(eligibilityRefreshAnalyticsData7.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData7 != null ? eligibilityRefreshAnalyticsData7.currentAttempt : null, apiResult2 == null ? "Signed out" : "Account switched", eligibilityRefreshAnalyticsData7 != null ? eligibilityRefreshAnalyticsData7.originDescription : null), null);
                    break;
                }
            case 11:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass46 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope7, (DisclosurePresenter) this.$earnerModeSubmitState$delegate, 9);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass46, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass47 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope8, (EndAppLockPresenter) this.$earnerModeSubmitState$delegate, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass47, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$event;
                    ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2 profilePrivacyPresenter$models$lambda$8$$inlined$map$1$2 = new ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2(2);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(profilePrivacyPresenter$models$lambda$8$$inlined$map$1$2, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass48 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope9, (DisclosurePresenter) this.$earnerModeSubmitState$delegate, 11);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(anonymousClass48, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealRecurringPaymentsManager realRecurringPaymentsManager = ((RealDependentAllowanceManager) this.this$0).recurringPaymentsManager;
                    String str13 = (String) this.$event;
                    String str14 = (String) this.$earnerModeSubmitState$delegate;
                    Type type2 = Type.ALLOWANCE;
                    this.label = 1;
                    GiftCard.Builder builder = new GiftCard.Builder(false ? 1 : 0);
                    builder.last_4 = str14;
                    builder.id = str13;
                    builder.gift_card_amount = Boolean.TRUE;
                    builder.gift_card_id = type2;
                    Object loadRecurringPayments = realRecurringPaymentsManager.loadRecurringPayments(new GetRecurringPaymentsRequest((String) builder.id, (String) builder.last_4, (Type) builder.gift_card_id, (Boolean) builder.gift_card_amount, builder.buildUnknownFields()), this);
                    if (loadRecurringPayments != coroutineSingletons16) {
                        loadRecurringPayments = Unit.INSTANCE;
                    }
                    if (loadRecurringPayments == coroutineSingletons16) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                RealDependentBalancesStore realDependentBalancesStore = (RealDependentBalancesStore) this.$earnerModeSubmitState$delegate;
                FlowCollector flowCollector = (FlowCollector) this.$event;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            InterestYieldStatus interestYieldStatus2 = (InterestYieldStatus) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            interestYieldStatus = interestYieldStatus2;
                            first = obj;
                            localizedString = (LocalizedString) first;
                            savingsInterestData = new SavingsInterestData(interestYieldStatus, localizedString);
                            this.$event = null;
                            this.this$0 = null;
                            this.label = 3;
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        interestSettingsAppActionV2 = obj;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    PiggybankAppService piggybankAppService = realDependentBalancesStore.piggybankService;
                    GetInterestSettingsRequest getInterestSettingsRequest = new GetInterestSettingsRequest(null, ByteString.EMPTY);
                    this.$event = flowCollector;
                    this.label = 1;
                    interestSettingsAppActionV2 = piggybankAppService.getInterestSettingsAppActionV2(getInterestSettingsRequest, this);
                    break;
                }
                ApiResult apiResult3 = (ApiResult) interestSettingsAppActionV2;
                if (apiResult3 instanceof ApiResult.Success) {
                    interestYieldStatus = ((GetInterestSettingsResponse) ((ApiResult.Success) apiResult3).response).interest_yield_status;
                    if (interestYieldStatus == InterestYieldStatus.INTEREST_YIELD_STATUS_UNONBOARDED || interestYieldStatus == InterestYieldStatus.INTEREST_YIELD_STATUS_ACTIVE) {
                        StateFlow singleValueOrDefault = realDependentBalancesStore.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.SavingsConfig, null, new StoryQueries$$ExternalSyntheticLambda0(27));
                        this.$event = flowCollector;
                        this.this$0 = interestYieldStatus;
                        this.label = 2;
                        first = FlowKt.first(singleValueOrDefault, this);
                        break;
                    } else {
                        localizedString = null;
                        savingsInterestData = new SavingsInterestData(interestYieldStatus, localizedString);
                        this.$event = null;
                        this.this$0 = null;
                        this.label = 3;
                    }
                } else if (!(apiResult3 instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    savingsInterestData = null;
                    this.$event = null;
                    this.this$0 = null;
                    this.label = 3;
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.this$0;
                    RealTargetEntityManager$syncValues$1$1$1 realTargetEntityManager$syncValues$1$1$1 = new RealTargetEntityManager$syncValues$1$1$1((RealTargetEntityManager) this.$event, (ParcelableSnapshotMutableIntState) this.$earnerModeSubmitState$delegate, i6);
                    this.label = 1;
                    if (flow10.collect(realTargetEntityManager$syncValues$1$1$1, this) == coroutineSingletons18) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass49 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope10, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, i5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(anonymousClass49, this) == coroutineSingletons19) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass410 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope11, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 16);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow12.collect(anonymousClass410, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass411 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope12, (LocalPosCheckInPresenter) this.$earnerModeSubmitState$delegate, 17);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow13.collect(anonymousClass411, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass412 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope13, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 18);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow14.collect(anonymousClass412, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                FamilyHomePresenter familyHomePresenter = (FamilyHomePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = (MutableState) this.$event;
                    AegisService aegisService = familyHomePresenter.service;
                    GetFamilyAccountsRequest getFamilyAccountsRequest = new GetFamilyAccountsRequest(ByteString.EMPTY);
                    this.$earnerModeSubmitState$delegate = mutableState2;
                    this.label = 1;
                    familyAccounts = aegisService.getFamilyAccounts(getFamilyAccountsRequest, this);
                    if (familyAccounts == coroutineSingletons23) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    MutableState mutableState6 = (MutableState) this.$earnerModeSubmitState$delegate;
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState6;
                    familyAccounts = obj;
                }
                ApiResult apiResult4 = (ApiResult) familyAccounts;
                if (apiResult4 instanceof ApiResult.Success) {
                    familyAccountsParameters = ((GetFamilyAccountsResponse) ((ApiResult.Success) apiResult4).response).family_accounts_parameters;
                } else if ((apiResult4 instanceof ApiResult.Failure.HttpFailure) && ((ApiResult.Failure.HttpFailure) apiResult4).code == 404) {
                    familyHomePresenter.router.route(new RoutingParams(null, null, familyHomePresenter.args.exitScreen, null, null, null, 503), "https://internal.cash.app/dl/flow/FAMILY_ACCOUNT_STATE%3Fparams%3DCAQaAA==");
                }
                StackedAvatarViewModel.Avatar avatar2 = FamilyHomePresenter.LOADING_AVATAR;
                mutableState2.setValue(familyAccountsParameters);
                break;
            case 23:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$event;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAccountholderAccountRepository realAccountholderAccountRepository = ((FamilyHomePresenter) this.$earnerModeSubmitState$delegate).accountholderAccountRepository;
                    this.$event = null;
                    this.this$0 = produceStateScope;
                    this.label = 1;
                    loadAccounts = realAccountholderAccountRepository.loadAccounts(this);
                    if (loadAccounts == coroutineSingletons24) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope = (ProduceStateScope) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    loadAccounts = obj;
                }
                AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) loadAccounts;
                if (accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful) {
                    obj3 = ((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts;
                } else if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    obj3 = EmptyList.INSTANCE;
                }
                produceStateScope.setValue(obj3);
                break;
            case 24:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass413 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope14, (FamilyPendingRequestsPresenter) this.$earnerModeSubmitState$delegate, 19);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow15.collect(anonymousClass413, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState3 = (MutableState) this.$event;
                    AegisService aegisService2 = ((FamilyPendingRequestsPresenter) this.this$0).service;
                    GetFamilyPendingRequestsRequest getFamilyPendingRequestsRequest = new GetFamilyPendingRequestsRequest(null, ByteString.EMPTY);
                    this.$earnerModeSubmitState$delegate = mutableState3;
                    this.label = 1;
                    familyPendingRequests = aegisService2.getFamilyPendingRequests(getFamilyPendingRequestsRequest, this);
                    if (familyPendingRequests == coroutineSingletons26) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    MutableState mutableState7 = (MutableState) this.$earnerModeSubmitState$delegate;
                    SafeTrace.throwOnFailure(obj);
                    mutableState3 = mutableState7;
                    familyPendingRequests = obj;
                }
                ApiResult apiResult5 = (ApiResult) familyPendingRequests;
                PendingRequestsParams pendingRequestsParams = apiResult5 instanceof ApiResult.Success ? ((GetFamilyPendingRequestsResponse) ((ApiResult.Success) apiResult5).response).pending_requests_parameters : null;
                ArrayList arrayList6 = FamilyPendingRequestsPresenter.loadingPendingRequestRows;
                mutableState3.setValue(pendingRequestsParams);
                break;
            case 26:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass414 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope15, (VerifyCheckDialogPresenter) this.$earnerModeSubmitState$delegate, 21);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow16.collect(anonymousClass414, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$event;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(i4, coroutineScope16, (LocalEditorialPresenter) this.$earnerModeSubmitState$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow17.collect(c00601, this) == coroutineSingletons28) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$event;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass415 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope17, (MusicPresenter) this.$earnerModeSubmitState$delegate, 22);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow18.collect(anonymousClass415, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow19 = (Flow) this.$event;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006012 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(i5, coroutineScope18, (EndAppLockPresenter) this.$earnerModeSubmitState$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow19.collect(c006012, this) == coroutineSingletons30) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsHomePresenter$models$3$1(MoleculePresenter moleculePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$event = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsHomePresenter$models$3$1(RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealFeatureEligibilityRepository.UpdateEligibilityRequest updateEligibilityRequest, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.$event = realFeatureEligibilityRepository;
        this.$earnerModeSubmitState$delegate = updateEligibilityRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsHomePresenter$models$3$1(HasObservability hasObservability, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$earnerModeSubmitState$delegate = hasObservability;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsHomePresenter$models$3$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$event = obj2;
        this.$earnerModeSubmitState$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsHomePresenter$models$3$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = flow;
        this.$earnerModeSubmitState$delegate = moleculePresenter;
    }
}
