package androidx.lifecycle;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import androidx.room.InvalidationTracker;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.work.CoroutineWorker;
import app.cash.local.backend.ClearMarketingBadgesIfNeeded;
import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardState;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.menu.LocalBrandLocationMenuPresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.zipline.loader.ZiplineLoader;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.AndroidResourceSignature;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.signature.ObjectKey;
import com.fillr.e0;
import com.google.android.libraries.places.internal.zzje;
import com.google.android.libraries.places.internal.zzkf;
import com.google.android.libraries.places.internal.zzql;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzd;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzl;
import com.google.firebase.datastorage.JavaDataStorage;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment$$ExternalSyntheticLambda0;
import com.squareup.cash.account.backend.RealAccountSwitcher;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.bitcoin.graph.real.BitcoinGraphPrefetch;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.localclient.LocalClientMapView;
import com.squareup.cash.core.navigationcontainer.SpacesPagerInteractionManagerImpl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.CustomerProfileClientService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.GetDisplayNameStatusClientRequest;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.serialization.json.Json;
import okhttp3.MultipartBody;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class BlockRunner$cancel$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(CheckoutGiftCardState checkoutGiftCardState, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.this$0 = checkoutGiftCardState;
        this.label = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new BlockRunner$cancel$1((e0) obj2, continuation, 0);
            case 1:
                return new BlockRunner$cancel$1((SessionWorker$doWork$2$1) obj2, continuation, 1);
            case 2:
                return new BlockRunner$cancel$1((MeasurementManagerFutures$Api33Ext5JavaImpl) obj2, continuation, 2);
            case 3:
                return new BlockRunner$cancel$1((InvalidationTracker) obj2, continuation, 3);
            case 4:
                return new BlockRunner$cancel$1((CoroutineWorker) obj2, continuation, 4);
            case 5:
                return new BlockRunner$cancel$1((LocalEditorialPresenter) obj2, continuation, 5);
            case 6:
                return new BlockRunner$cancel$1((LocalCashBalancePresenter) obj2, continuation, 6);
            case 7:
                return new BlockRunner$cancel$1((CheckoutGiftCardState) obj2, this.label, continuation);
            case 8:
                return new BlockRunner$cancel$1((LocalBrandLocationCheckoutPresenter) obj2, continuation, 8);
            case 9:
                return new BlockRunner$cancel$1((LocalBrandLocationMenuPresenter) obj2, continuation, 9);
            case 10:
                return new BlockRunner$cancel$1((LocalHomeGeoPresenter) obj2, continuation, 10);
            case 11:
                return new BlockRunner$cancel$1((LocalHomePresenter) obj2, continuation, 11);
            case 12:
                return new BlockRunner$cancel$1((DisclosurePresenter) obj2, continuation, 12);
            case 13:
                return new BlockRunner$cancel$1((LocalPosLocalCashRedemptionPresenter) obj2, continuation, 13);
            case 14:
                return new BlockRunner$cancel$1((LocalHomePresenter) obj2, continuation, 14);
            case 15:
                return new BlockRunner$cancel$1((TabContentPresenter) obj2, continuation, 15);
            case 16:
                return new BlockRunner$cancel$1((SpacesPagerInteractionManagerImpl) obj2, continuation, 16);
            case 17:
                return new BlockRunner$cancel$1((Function0) obj2, continuation, 17);
            case 18:
                return new BlockRunner$cancel$1((ZiplineLoader.ModuleJob) obj2, continuation, 18);
            case 19:
                return new BlockRunner$cancel$1((zzl) obj2, continuation, 19);
            case 20:
                return new BlockRunner$cancel$1((JavaDataStorage) obj2, continuation, 20);
            case 21:
                return new BlockRunner$cancel$1((MiSnapController) obj2, continuation, 21);
            case 22:
                return new BlockRunner$cancel$1((NfcReaderFragment) obj2, continuation, 22);
            case 23:
                return new BlockRunner$cancel$1((RealAccountSwitcher) obj2, continuation, 23);
            case 24:
                return new BlockRunner$cancel$1((TapToPayPresenter) obj2, continuation, 24);
            case 25:
                return new BlockRunner$cancel$1((CardStudioPresenter) obj2, continuation, 25);
            case 26:
                return new BlockRunner$cancel$1((DisclosurePresenter) obj2, continuation, 26);
            case 27:
                return new BlockRunner$cancel$1((AccountDocumentsPresenter) obj2, continuation, 27);
            case 28:
                return new BlockRunner$cancel$1((n) obj2, continuation, 28);
            default:
                return new BlockRunner$cancel$1((BitcoinGraphPrefetch) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((BlockRunner$cancel$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer d;
        String str;
        Drawable drawable;
        ChannelFlowTransformLatest completeClientScenario;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj2 = this.this$0;
        Unit unit = null;
        PackageInfo packageInfo = null;
        r5 = null;
        Object obj3 = null;
        switch (i) {
            case 0:
                e0 e0Var = (e0) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    e0Var.getClass();
                    this.label = 1;
                    if (JobKt.delay(5000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((CoroutineLiveData) e0Var.a).hasActiveObservers()) {
                    StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) e0Var.f;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    e0Var.f = null;
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((SessionWorker$doWork$2$1) obj2).invoke(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AmountChangedSource amountChangedSource = ((MeasurementManagerFutures$Api33Ext5JavaImpl) obj2).mMeasurementManager;
                this.label = 1;
                Object measurementApiStatus = amountChangedSource.getMeasurementApiStatus(this);
                return measurementApiStatus == coroutineSingletons3 ? coroutineSingletons3 : measurementApiStatus;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = ((InvalidationTracker) obj2).implementation;
                    this.label = 1;
                    if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object foregroundInfo = ((CoroutineWorker) obj2).getForegroundInfo(this);
                    return foregroundInfo == coroutineSingletons5 ? coroutineSingletons5 : foregroundInfo;
                }
                if (i7 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) ((LocalEditorialPresenter) obj2).service;
                    this.label = 1;
                    if (realLocalBrandSyncer.syncLocalCashInformationalContent(this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer2 = (RealLocalBrandSyncer) ((LocalCashBalancePresenter) obj2).syncer;
                    this.label = 1;
                    if (realLocalBrandSyncer2.syncLocalCashInformationalContent(this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CheckoutGiftCardState checkoutGiftCardState = (CheckoutGiftCardState) obj2;
                if (this.label <= 0) {
                    checkoutGiftCardState.getClass();
                } else if (checkoutGiftCardState.getCode().length() > 0) {
                    checkoutGiftCardState.code$delegate.setValue("");
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) obj2;
                    LocalInstalledStore localInstalledStore = localBrandLocationCheckoutPresenter.store;
                    String str2 = localBrandLocationCheckoutPresenter.brandSpot.brandToken;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore).m1288clearScheduledFulfillmentConfigurationNmdeRlM(str2, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalBrandLocationMenuPresenter localBrandLocationMenuPresenter = (LocalBrandLocationMenuPresenter) obj2;
                    RealLocalBrandSyncer realLocalBrandSyncer3 = localBrandLocationMenuPresenter.syncer;
                    BrandSpot brandSpot = localBrandLocationMenuPresenter.brandSpot;
                    this.label = 1;
                    if (realLocalBrandSyncer3.syncBuyerInfo(brandSpot, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer4 = ((LocalHomeGeoPresenter) obj2).syncer;
                    this.label = 1;
                    if (realLocalBrandSyncer4.syncBrandCollection(this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Analytics) localHomePresenter.embeddedMapEnabled$delegate).track(new LocalClientMapView(), null);
                    RealLocalBrandSyncer realLocalBrandSyncer5 = (RealLocalBrandSyncer) localHomePresenter.syncer;
                    this.label = 1;
                    if (realLocalBrandSyncer5.syncBrandCollection(this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                    if (((LocalMarketingMessagesScreen) disclosurePresenter.args).brandToken == null) {
                        RefreshMarketingMessages refreshMarketingMessages = (RefreshMarketingMessages) disclosurePresenter.launcher;
                        this.label = 1;
                        if (refreshMarketingMessages.invoke(this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((LocalPosLocalCashRedemptionPresenter) obj2).navigator.goTo(LocalTabScreen.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClearMarketingBadgesIfNeeded clearMarketingBadgesIfNeeded = (ClearMarketingBadgesIfNeeded) ((LocalHomePresenter) obj2).clearMarketingBadgesIfNeeded;
                    this.label = 1;
                    if (clearMarketingBadgesIfNeeded.invoke(this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer6 = ((TabContentPresenter) obj2).syncer;
                    this.label = 1;
                    if (realLocalBrandSyncer6.syncMarketScreen(this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SpacesPagerInteractionManagerImpl spacesPagerInteractionManagerImpl = (SpacesPagerInteractionManagerImpl) obj2;
                    if (spacesPagerInteractionManagerImpl != null) {
                        this.label = 1;
                        spacesPagerInteractionManagerImpl.pause(this);
                        return coroutineSingletons17;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(2, DurationUnit.SECONDS);
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration2, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((ZiplineLoader.ModuleJob) obj2).run(this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                SafeTrace.throwOnFailure(obj);
                if (i21 == 0) {
                    zzl zzlVar = (zzl) obj2;
                    zzd zzdVar = zzlVar.zze;
                    if (zzdVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pageData");
                        throw null;
                    }
                    Uri parse = Uri.parse(zzdVar.zza);
                    zzje zzjeVar = zzlVar.zzg;
                    if (zzjeVar != null) {
                        Context applicationContext = zzjeVar.zza.getApplicationContext();
                        zzkf.zza(applicationContext);
                        ImageView imageView = zzlVar.zzc;
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("image");
                            throw null;
                        }
                        Target zzqlVar = new zzql(imageView, new KClasses$$Lambda$2(zzlVar, 7));
                        this.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                        cancellableContinuationImpl.initCancellability();
                        RequestManager requestManager = Glide.get(applicationContext).requestManagerRetriever.get(applicationContext);
                        requestManager.getClass();
                        RequestBuilder apply = new RequestBuilder(requestManager.glide, requestManager, Bitmap.class, requestManager.context).apply((BaseRequestOptions) RequestManager.DECODE_TYPE_BITMAP);
                        RequestBuilder loadGeneric = apply.loadGeneric(parse);
                        if (parse != null && "android.resource".equals(parse.getScheme())) {
                            Context context = apply.context;
                            RequestBuilder requestBuilder = (RequestBuilder) loadGeneric.theme(context.getTheme());
                            ConcurrentHashMap concurrentHashMap = ApplicationVersionSignature.PACKAGE_NAME_TO_KEY;
                            String packageName = context.getPackageName();
                            ConcurrentHashMap concurrentHashMap2 = ApplicationVersionSignature.PACKAGE_NAME_TO_KEY;
                            Key key = (Key) concurrentHashMap2.get(packageName);
                            if (key == null) {
                                try {
                                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                                } catch (PackageManager.NameNotFoundException e) {
                                    Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                                }
                                ObjectKey objectKey = new ObjectKey(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                                key = (Key) concurrentHashMap2.putIfAbsent(packageName, objectKey);
                                if (key == null) {
                                    key = objectKey;
                                }
                            }
                            loadGeneric = (RequestBuilder) requestBuilder.signature(new AndroidResourceSignature(context.getResources().getConfiguration().uiMode & 48, key));
                        }
                        loadGeneric.getClass();
                        RequestBuilder requestBuilder2 = (RequestBuilder) loadGeneric.set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
                        requestBuilder2.into(zzqlVar, requestBuilder2);
                        Object result = cancellableContinuationImpl.getResult();
                        if (result != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            result = Unit.INSTANCE;
                        }
                        if (result == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow data = ((JavaDataStorage) obj2).dataStore.getData();
                    this.label = 1;
                    obj = FlowKt.firstOrNull(data, this);
                    if (obj == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Preferences preferences = (Preferences) obj;
                if (preferences != null) {
                    return preferences.asMap();
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            case 21:
                MiSnapController miSnapController = (MiSnapController) obj2;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = miSnapController.k;
                    this.label = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                miSnapController.m = true;
                return Unit.INSTANCE;
            case 22:
                NfcReaderFragment nfcReaderFragment = (NfcReaderFragment) obj2;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NfcReaderFragment.Companion companion3 = NfcReaderFragment.Companion;
                    MiSnapSettings miSnapSettings = (MiSnapSettings) nfcReaderFragment.c$3().f.getValue();
                    if (miSnapSettings != null) {
                        String b$3 = nfcReaderFragment.b$3();
                        if (b$3 != null && (str = miSnapSettings.workflow.get(b$3)) != null) {
                            Json.Default r5 = Json.Default;
                            r5.getClass();
                            obj3 = r5.decodeFromString(str, NfcReaderFragment.WorkflowSettings.Companion.serializer());
                        }
                        NfcReaderFragment.WorkflowSettings workflowSettings = (NfcReaderFragment.WorkflowSettings) obj3;
                        if ((workflowSettings == null || (d = workflowSettings.g) == null) && (d = MultipartBody.Companion.d(nfcReaderFragment.getArguments(), "skipVisibilityTimeout")) == null) {
                            NfcReaderFragment.Companion companion4 = NfcReaderFragment.Companion;
                            Context requireContext = nfcReaderFragment.requireContext();
                            companion4.getClass();
                            NfcReaderFragment.Companion.getDefaultWorkflowSettings(requireContext, miSnapSettings);
                            d = 20000;
                        }
                        long intValue = d.intValue();
                        this.label = 1;
                        if (JobKt.delay(intValue, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    }
                    if (unit == null) {
                        NfcReaderFragment.Companion companion5 = NfcReaderFragment.Companion;
                        MiSnapWorkflowViewModel c$3 = nfcReaderFragment.c$3();
                        Context requireContext2 = nfcReaderFragment.requireContext();
                        requireContext2.getClass();
                        c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                    }
                    NfcReaderFragment.Companion companion6 = NfcReaderFragment.Companion;
                    nfcReaderFragment.getBinding$workflow_release().m.setVisibility(0);
                    nfcReaderFragment.getBinding$workflow_release().m.setOnClickListener(new NfcReaderFragment$$ExternalSyntheticLambda0(nfcReaderFragment, i2));
                    drawable = nfcReaderFragment.getBinding$workflow_release().k.getDrawable();
                    if (drawable != null) {
                        if (drawable instanceof AnimatedVectorDrawableCompat) {
                            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
                            animatedVectorDrawableCompat.stop();
                            animatedVectorDrawableCompat.start();
                        } else if (drawable instanceof AnimatedVectorDrawable) {
                            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                            animatedVectorDrawable.stop();
                            animatedVectorDrawable.start();
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                }
                NfcReaderFragment.Companion companion62 = NfcReaderFragment.Companion;
                nfcReaderFragment.getBinding$workflow_release().m.setVisibility(0);
                nfcReaderFragment.getBinding$workflow_release().m.setOnClickListener(new NfcReaderFragment$$ExternalSyntheticLambda0(nfcReaderFragment, i2));
                drawable = nfcReaderFragment.getBinding$workflow_release().k.getDrawable();
                if (drawable != null) {
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOnSessionChangeActionsExecutor realOnSessionChangeActionsExecutor = (RealOnSessionChangeActionsExecutor) ((RealAccountSwitcher) obj2).onSessionChangeActionsExecutorProvider.invoke();
                    this.label = 1;
                    if (realOnSessionChangeActionsExecutor.executeAccountSwitch(this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj2;
                    this.label = 1;
                    RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) tapToPayPresenter.mriFactory;
                    completeClientScenario = ((RealClientScenarioCompleter) realAccountOutboundNavigator.clientScenarioCompleter).completeClientScenario(ClientScenario.EDIT_PROFILE_BIO, (r24 & 2) != 0 ? null : null, (EditProfile) tapToPayPresenter.tapToPayRepository, (r24 & 8) != 0 ? null : null, BlockersData.Flow.PROFILE_BLOCKERS, true, (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? EmptyList.INSTANCE : null, null, null, false);
                    Object collect = completeClientScenario.collect(new LazyPagingItems$collectLoadState$2(realAccountOutboundNavigator, 15), this);
                    if (collect != coroutineSingletons25) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons25) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (CardStudioPresenter.access$switchAccount((CardStudioPresenter) obj2, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (DisclosurePresenter.access$getFileDataAndDownload((DisclosurePresenter) obj2, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AccountDocumentsPresenter accountDocumentsPresenter = (AccountDocumentsPresenter) obj2;
                    DocumentsScreen documentsScreen = accountDocumentsPresenter.args;
                    if (((documentsScreen instanceof DocumentsScreen.DocumentsScreenCategory) && ((DocumentsScreen.DocumentsScreenCategory) documentsScreen).categoryId == null) || ((documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiStatementAccount) && ((DocumentsScreen.DocumentsScreenMultiStatementAccount) documentsScreen).syncStatements)) {
                        this.label = 1;
                        if (AccountDocumentsPresenter.access$syncStatements(accountDocumentsPresenter, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CustomerProfileClientService customerProfileClientService = (CustomerProfileClientService) ((n) obj2).b;
                GetDisplayNameStatusClientRequest getDisplayNameStatusClientRequest = new GetDisplayNameStatusClientRequest(ByteString.EMPTY);
                this.label = 1;
                Object displayNameStatusClient = customerProfileClientService.getDisplayNameStatusClient(getDisplayNameStatusClientRequest, this);
                return displayNameStatusClient == coroutineSingletons29 ? coroutineSingletons29 : displayNameStatusClient;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager activitiesManager = (ActivitiesManager) ((BitcoinGraphPrefetch) obj2).bitcoinActivityProvider;
                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (activitiesManager.load(loadMode, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockRunner$cancel$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
