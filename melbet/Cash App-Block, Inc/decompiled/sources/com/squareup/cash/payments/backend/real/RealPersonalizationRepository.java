package com.squareup.cash.payments.backend.real;

import android.content.Context;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.room.util.DBUtil;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import coil3.RealImageLoader;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$stickersForState$2;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.activity.CashActivityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.activity.CashActivityQueries$forToken$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UseActivityServiceExpressivePayments;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.mosaic.personalization.api.v2.MarkViewedRequest;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationService;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.mosaic.resources.api.v2.ResourceService;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager$markViewed$1;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader$buildStateFlow$1;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import dev.zacsweers.metro.Provider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RealPersonalizationRepository implements PersonalizationRepository {
    public final LocalTabContentQueries backgroundQueries;
    public final CashAccountDatabaseImpl cashDatabase;
    public final Context context;
    public final FeatureFlagManager featureFlagManager;
    public final RealImageLoader imageLoader;
    public final CoroutineContext ioDispatcher;
    public final Provider javaScripters;
    public final CoroutineContext jsDispatcher;
    public final Moshi moshi;
    public final PersonalizationService personalizationService;
    public final KeyValue personalizePaymentResourceVersion;
    public final InstrumentQueries reactionsQueries;
    public final ResourceService resourceService;
    public final InstrumentQueries stickerQueries;

    public RealPersonalizationRepository(PersonalizationService personalizationService, ResourceService resourceService, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Provider provider, CashAccountDatabaseImpl cashAccountDatabaseImpl, FeatureFlagManager featureFlagManager, RealImageLoader realImageLoader, Context context, KeyValue keyValue, Moshi moshi) {
        provider.getClass();
        this.personalizationService = personalizationService;
        this.resourceService = resourceService;
        this.ioDispatcher = coroutineContext;
        this.jsDispatcher = coroutineContext2;
        this.javaScripters = provider;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.featureFlagManager = featureFlagManager;
        this.imageLoader = realImageLoader;
        this.context = context;
        this.personalizePaymentResourceVersion = keyValue;
        this.moshi = moshi;
        this.backgroundQueries = cashAccountDatabaseImpl.expressivePaymentsBackgroundConfigQueries;
        this.stickerQueries = cashAccountDatabaseImpl.expressivePaymentsStickerConfigQueries;
        this.reactionsQueries = cashAccountDatabaseImpl.reactionConfigQueries;
    }

    public static final void access$cacheImage(RealPersonalizationRepository realPersonalizationRepository, String str) {
        if (str == null) {
            return;
        }
        RealImageLoader realImageLoader = realPersonalizationRepository.imageLoader;
        ImageRequest.Builder builder = new ImageRequest.Builder(realPersonalizationRepository.context);
        builder.data(str);
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        builder.diskCachePolicy();
        builder.memoryCachePolicy();
        realImageLoader.enqueue(builder.build());
    }

    public static final UiCustomer access$getSenderInformation(RealPersonalizationRepository realPersonalizationRepository, PaymentHistoryInputsRow paymentHistoryInputsRow) {
        UiPayment uiPayment;
        if (((paymentHistoryInputsRow == null || (uiPayment = paymentHistoryInputsRow.payment) == null) ? null : uiPayment.role) == Role.SENDER) {
            return paymentHistoryInputsRow.recipient;
        }
        if (paymentHistoryInputsRow != null) {
            return paymentHistoryInputsRow.sender;
        }
        return null;
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final Object cacheTopResources(ReleaseState releaseState, MusicPresenter$models$3$1 musicPresenter$models$3$1) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealKeyStoreProvider$setEntry$2(this, releaseState, (Continuation) null, 26), musicPresenter$models$3$1);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final MoneyTabPresenter$models$lambda$31$$inlined$map$1 loadBackgrounds(boolean z) {
        FlowQuery$mapToList$$inlined$map$1 mapToList;
        CoroutineContext coroutineContext = this.ioDispatcher;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = this.cashDatabase;
        if (z) {
            LocalTabContentQueries localTabContentQueries = cashAccountDatabaseImpl.expressivePaymentsBackgroundConfigQueries;
            localTabContentQueries.getClass();
            ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 expressivePaymentsBackgroundConfigQueries$loadBackgrounds$2 = ExpressivePaymentsBackgroundConfigQueries$loadBackgrounds$2.INSTANCE;
            SqlDriver sqlDriver = localTabContentQueries.driver;
            ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0 expressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0 = new ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0);
            sqlDriver.getClass();
            mapToList = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(1455696628, new String[]{"expressivePaymentsBackgroundConfig"}, sqlDriver, "ExpressivePaymentsBackgroundConfig.sq", "loadBackgrounds", "SELECT expressivePaymentsBackgroundConfig.name, expressivePaymentsBackgroundConfig.main_url, expressivePaymentsBackgroundConfig.preview_url, expressivePaymentsBackgroundConfig.background_color, expressivePaymentsBackgroundConfig.default_text_format, expressivePaymentsBackgroundConfig.effects, expressivePaymentsBackgroundConfig.priority, expressivePaymentsBackgroundConfig.release_state, expressivePaymentsBackgroundConfig.tags, expressivePaymentsBackgroundConfig.is_default, expressivePaymentsBackgroundConfig.accessibility_description\nFROM expressivePaymentsBackgroundConfig\nORDER BY priority ASC", expressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0)), coroutineContext);
        } else {
            LocalTabContentQueries localTabContentQueries2 = cashAccountDatabaseImpl.expressivePaymentsBackgroundConfigQueries;
            ReleaseState releaseState = ReleaseState.RELEASE_STATE_ACTIVE;
            localTabContentQueries2.getClass();
            releaseState.getClass();
            ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2 expressivePaymentsBackgroundConfigQueries$backgroundsForState$2 = ExpressivePaymentsBackgroundConfigQueries$backgroundsForState$2.INSTANCE;
            mapToList = DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(localTabContentQueries2, releaseState, new ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0(localTabContentQueries2, 1))), coroutineContext);
        }
        return new MoneyTabPresenter$models$lambda$31$$inlined$map$1(FlowKt.flowOn(mapToList, coroutineContext), 26);
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final Object loadCachedBackgrounds(RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
        return JobKt.withContext(this.ioDispatcher, new RealPersonalizationRepository$loadCachedStickers$2(this, null, 1), ringtoneView$playRingtone$1);
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final Object loadCachedStickers(RingtoneView$playRingtone$1 ringtoneView$playRingtone$1) {
        return JobKt.withContext(this.ioDispatcher, new RealPersonalizationRepository$loadCachedStickers$2(this, null, 0), ringtoneView$playRingtone$1);
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final Flow loadPersonalizedTransaction(String str) {
        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UseActivityServiceExpressivePayments.INSTANCE)).enabled();
        CoroutineContext coroutineContext = this.ioDispatcher;
        Continuation continuation = null;
        if (enabled) {
            return FlowKt.flowOn(new SafeFlow(new MainPaymentPresenter$models$4$4(this, str, continuation, 10)), coroutineContext);
        }
        PaymentQueries paymentQueries = this.cashDatabase.cashActivityQueries;
        paymentQueries.getClass();
        CashActivityQueries$forToken$2 cashActivityQueries$forToken$2 = CashActivityQueries$forToken$2.INSTANCE;
        return FlowKt.combine(FlowKt.flowOn(new SwipeableState$special$$inlined$filter$1(DBUtil.toFlow(new RewardQueries.ForIdsQuery(paymentQueries, str, new CashActivityQueries$$ExternalSyntheticLambda1(paymentQueries, 0))), 17), coroutineContext), FlowKt.flowOn((Flow) this.javaScripters.invoke(), this.jsDispatcher), FlowKt.flowOn(new SwipeableState$special$$inlined$filter$1(DBUtil.toFlow(this.reactionsQueries.select$2()), 18), coroutineContext), new RealShiftsTileDataLoader$buildStateFlow$1(this, str, null));
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final MoneyTabPresenter$models$lambda$31$$inlined$map$1 loadStickers() {
        InstrumentQueries instrumentQueries = this.cashDatabase.expressivePaymentsStickerConfigQueries;
        ReleaseState releaseState = ReleaseState.RELEASE_STATE_ACTIVE;
        instrumentQueries.getClass();
        releaseState.getClass();
        ExpressivePaymentsStickerConfigQueries$stickersForState$2 expressivePaymentsStickerConfigQueries$stickersForState$2 = ExpressivePaymentsStickerConfigQueries$stickersForState$2.INSTANCE;
        SafeFlow flow = DBUtil.toFlow(new RewardQueries.ForIdsQuery(instrumentQueries, releaseState, new ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0(instrumentQueries, 0)));
        CoroutineContext coroutineContext = this.ioDispatcher;
        return new MoneyTabPresenter$models$lambda$31$$inlined$map$1(FlowKt.flowOn(DBUtil.mapToList(flow, coroutineContext), coroutineContext), 27);
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final Object markPaymentPersonalizationRead(String str, RealPersonalizePaymentManager$markViewed$1 realPersonalizePaymentManager$markViewed$1) {
        Object markViewed = this.personalizationService.markViewed(new MarkViewedRequest(new Entity(str, Entity.Type.TYPE_PAYMENT), ByteString.EMPTY), realPersonalizePaymentManager$markViewed$1);
        return markViewed == CoroutineSingletons.COROUTINE_SUSPENDED ? markViewed : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.payments.backend.api.PersonalizationRepository
    public final Object refreshPersonalizationResources(ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.ioDispatcher, new MusicPresenter$models$3$1(this, null, 17), continuationImpl);
    }
}
