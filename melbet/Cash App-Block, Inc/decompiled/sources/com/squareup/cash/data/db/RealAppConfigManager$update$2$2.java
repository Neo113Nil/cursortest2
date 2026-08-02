package com.squareup.cash.data.db;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.animation.EnterExitState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.db.QueryResult;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.android.volley.RequestQueue;
import com.fillr.n;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.card.onboarding.graphics.ActivationSuccessConfig;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenLoadApplet;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.investing.InvestingRouter;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.persistence.FlaggedSyncEntityStore;
import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.EntityStorageOperation;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchSanitizer;
import com.squareup.cash.clientsync.pipeline.ReplaceRanges;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import com.squareup.cash.clientsync.pipeline.StorageOperationBatch;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$2$1;
import com.squareup.cash.education.stories.backend.real.EducationStoryEntity;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.education.stories.db.Education_story;
import com.squareup.cash.education.stories.db.Education_story_scene_data;
import com.squareup.cash.education.stories.db.SelectBySlug;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries$selectBySlug$2;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.sheet.BottomSheetState;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.ui.BottomSheetStateListener;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsResponse;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeResponse;
import com.squareup.protos.cash.registrar.api.GetStatementTypesResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.app.GetAppConfigResponse;
import com.squareup.util.Strings;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealAppConfigManager$update$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $response;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealAppConfigManager$update$2$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$response = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$response;
        switch (i) {
            case 0:
                return new RealAppConfigManager$update$2$2((RealAppConfigManager) this.this$0, (GetAppConfigResponse) obj2, continuation, 0);
            case 1:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2((HeatMaskRenderer) obj2, continuation, 1);
                realAppConfigManager$update$2$2.this$0 = obj;
                return realAppConfigManager$update$2$2;
            case 2:
                return new RealAppConfigManager$update$2$2((Function1) this.this$0, (CardScene) obj2, continuation, 2);
            case 3:
                return new RealAppConfigManager$update$2$2((List) this.this$0, (ViewUtils.RelativePadding) obj2, continuation, 3);
            case 4:
                return new RealAppConfigManager$update$2$2((ActivationSuccessConfig) this.this$0, (WandScene) obj2, continuation, 4);
            case 5:
                return new RealAppConfigManager$update$2$2((UiScope) this.this$0, (DelegatingSoftwareKeyboardController) obj2, continuation, 5);
            case 6:
                return new RealAppConfigManager$update$2$2((InvestingRouter) this.this$0, (ClientRoute.ViewEquity) obj2, continuation, 6);
            case 7:
                return new RealAppConfigManager$update$2$2((FlaggedSyncEntityStore) this.this$0, (SyncValueType) obj2, continuation, 7);
            case 8:
                return new RealAppConfigManager$update$2$2((RealClientSyncResponseProcessor) this.this$0, (StorageOperationBatch) obj2, continuation, 8);
            case 9:
                return new RealAppConfigManager$update$2$2((AcceptableScrim) this.this$0, (ScrimScreen.ManagedAccountSwitchScrimScreen) obj2, continuation, 9);
            case 10:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$22 = new RealAppConfigManager$update$2$2((ScrimScreen) obj2, continuation, 10);
                realAppConfigManager$update$2$22.this$0 = obj;
                return realAppConfigManager$update$2$22;
            case 11:
                return new RealAppConfigManager$update$2$2((View) this.this$0, (DelegatingSoftwareKeyboardController) obj2, continuation, 11);
            case 12:
                return new RealAppConfigManager$update$2$2((BottomSheetStateListener) this.this$0, (RealSheetState) obj2, continuation, 12);
            case 13:
                return new RealAppConfigManager$update$2$2((RealProfileManager) this.this$0, (CurrencyCode) obj2, continuation, 13);
            case 14:
                return new RealAppConfigManager$update$2$2((RealProfileManager) this.this$0, (BitcoinDisplayUnits) obj2, continuation, 14);
            case 15:
                return new RealAppConfigManager$update$2$2((MarkwonConfiguration) this.this$0, (GetAvailableStatementsForStatementTypeResponse) obj2, continuation, 15);
            case 16:
                return new RealAppConfigManager$update$2$2((MarkwonConfiguration) this.this$0, (GetStatementTypesResponse) obj2, continuation, 16);
            case 17:
                return new RealAppConfigManager$update$2$2((EglCore) this.this$0, (GetCryptoTaxStatementsResponse) obj2, continuation, 17);
            case 18:
                return new RealAppConfigManager$update$2$2((LocalHomePresenter) this.this$0, (Uri) obj2, continuation, 18);
            case 19:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$23 = new RealAppConfigManager$update$2$2((n) obj2, continuation, 19);
                realAppConfigManager$update$2$23.this$0 = obj;
                return realAppConfigManager$update$2$23;
            case 20:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$24 = new RealAppConfigManager$update$2$2((EarningsHomePresenter) obj2, continuation, 20);
                realAppConfigManager$update$2$24.this$0 = obj;
                return realAppConfigManager$update$2$24;
            case 21:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$25 = new RealAppConfigManager$update$2$2((Disclosure) obj2, continuation, 21);
                realAppConfigManager$update$2$25.this$0 = obj;
                return realAppConfigManager$update$2$25;
            case 22:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$26 = new RealAppConfigManager$update$2$2((TransfersPresenter) obj2, continuation, 22);
                realAppConfigManager$update$2$26.this$0 = obj;
                return realAppConfigManager$update$2$26;
            case 23:
                return new RealAppConfigManager$update$2$2((TransfersPresenter) this.this$0, (MutableState) obj2, continuation, 23);
            case 24:
                return new RealAppConfigManager$update$2$2((RealEducationStoryRepository) this.this$0, (String) obj2, continuation, 24);
            case 25:
                return new RealAppConfigManager$update$2$2((Function1) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 25);
            case 26:
                return new RealAppConfigManager$update$2$2((EducationStoryViewModel) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 26);
            case 27:
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$27 = new RealAppConfigManager$update$2$2((RealFeatureEligibilityRepository) obj2, continuation, 27);
                realAppConfigManager$update$2$27.this$0 = obj;
                return realAppConfigManager$update$2$27;
            case 28:
                return new RealAppConfigManager$update$2$2((String) this.this$0, (DisclosurePresenter) obj2, continuation, 28);
            default:
                return new RealAppConfigManager$update$2$2((DependentSavingsScreenPresenter) this.this$0, (SavingsScreenViewEvent) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealAppConfigManager$update$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x049f, code lost:
    
        if (r11.intValue() != r5) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04a1, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04b0, code lost:
    
        if (r9.intValue() != r5) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        boolean z;
        EntityStorageOperation entityStorageOperation;
        Window window;
        View currentFocus;
        BottomSheetState bottomSheetState;
        Education_story_scene_data education_story_scene_data;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 18;
        int i4 = 3;
        int i5 = 9;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.$response;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAppConfigManager realAppConfigManager = (RealAppConfigManager) this.this$0;
                realAppConfigManager.instrumentLinkingConfigQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(23, realAppConfigManager, (GetAppConfigResponse) obj2));
                Timber.Forest.i("saveGetAppConfig response done.", new Object[0]);
                BugsnagClient bugsnagClient = realAppConfigManager.bugsnagClient;
                MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection = MetadataSection$AdditionalInfoSection.INSTANCE;
                MetadataSection$AdditionalInfoSection.AppConfigSyncTimeKey appConfigSyncTimeKey = MetadataSection$AdditionalInfoSection.AppConfigSyncTimeKey.INSTANCE;
                String format2 = DateTimeFormatter.ISO_INSTANT.format(DimensionKt.now(realAppConfigManager.clock));
                format2.getClass();
                bugsnagClient.addMetadata(metadataSection$AdditionalInfoSection, appConfigSyncTimeKey, format2);
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                HeatMaskRenderer heatMaskRenderer = (HeatMaskRenderer) obj2;
                heatMaskRenderer.getClass();
                coroutineScope.getClass();
                heatMaskRenderer.renderLoopActive = true;
                heatMaskRenderer.renderJob = JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(heatMaskRenderer, (Continuation) null, 27), 3);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.this$0).invoke((CardScene) obj2);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List<Bitmap> list = (List) this.this$0;
                ViewUtils.RelativePadding relativePadding = (ViewUtils.RelativePadding) obj2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Bitmap bitmap : list) {
                    Bitmap createScaledBitmap = (bitmap.getWidth() == relativePadding.end && bitmap.getHeight() == relativePadding.bottom) ? bitmap : Bitmap.createScaledBitmap(bitmap, relativePadding.end, relativePadding.bottom, true);
                    createScaledBitmap.getClass();
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(createScaledBitmap.getByteCount());
                    allocateDirect.order(ByteOrder.nativeOrder());
                    createScaledBitmap.copyPixelsToBuffer(allocateDirect);
                    allocateDirect.position(0);
                    if (createScaledBitmap != bitmap) {
                        createScaledBitmap.recycle();
                    }
                    arrayList.add(allocateDirect);
                }
                return arrayList;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ActivationSuccessConfig) this.this$0).getClass();
                double radians = (float) Math.toRadians(2.7300000190734863d);
                float sin = ((float) Math.sin(radians)) * 15.0f;
                float cos = 15.0f * ((float) Math.cos(radians));
                WandScene wandScene = (WandScene) obj2;
                wandScene.camera.setFov(60.0f);
                RequestQueue requestQueue = wandScene.camera;
                requestQueue.setFovIsHorizontal(false);
                requestQueue.setPosition(new Vector3(0.04f, sin + 0.46f, cos + 20.0f));
                double radians2 = (float) Math.toRadians(-5.159999847412109d);
                requestQueue.setTarget(new Vector3(RecyclerView.DECELERATION_RATE, ((float) Math.sin(radians2)) * 10.0f, (-((float) Math.cos(radians2))) * 10.0f));
                wandScene.markDirty();
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((UiScope) this.this$0).$$delegate_0.getTransition().targetState$delegate.getValue() == EnterExitState.PostExit && (delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2) != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(((InvestingRouter) this.this$0).database.investmentEntityQueries.forToken(((ClientRoute.ViewEquity) obj2).entityToken).executeAsOneOrNull() != null);
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((FlaggedSyncEntityStore) this.this$0).getDelegate().getAllValuesOfTypeFlow((SyncValueType) obj2);
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealClientSyncResponseProcessor realClientSyncResponseProcessor = (RealClientSyncResponseProcessor) this.this$0;
                RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor = realClientSyncResponseProcessor.storageOperationBatchExecutor;
                realClientSyncResponseProcessor.storageOperationBatchSanitizer.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List list2 = ((StorageOperationBatch) obj2).f1115operations;
                Iterator it = list2.iterator();
                int i8 = 0;
                Integer num = null;
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        int i9 = 0;
                        for (Object obj3 : list2) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            StorageOperation storageOperation = (StorageOperation) obj3;
                            if (storageOperation instanceof ReplaceRanges) {
                                z = linkedHashSet.contains(Integer.valueOf(i9));
                            } else if (storageOperation instanceof EntityStorageOperation) {
                                Integer num2 = (Integer) linkedHashMap.get(RealClientSyncStorageOperationBatchSanitizer.getKey(((EntityStorageOperation) storageOperation).getEntity()));
                                if (num2 != null) {
                                    break;
                                }
                                z = false;
                            } else if (storageOperation instanceof DeleteAllRangesAndEntities) {
                                if (num != null) {
                                    break;
                                }
                                z = false;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            if (z) {
                                arrayList2.add(obj3);
                            }
                            i9 = i10;
                        }
                        return (List) realClientSyncStorageOperationBatchExecutor.transactor.transactionWithResult(new BadgedBoxKt$$ExternalSyntheticLambda0(11, new StorageOperationBatch(arrayList2), realClientSyncStorageOperationBatchExecutor));
                    }
                    Object next = it.next();
                    int i11 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    StorageOperation storageOperation2 = (StorageOperation) next;
                    if (storageOperation2 instanceof ReplaceRanges) {
                        linkedHashSet.add(Integer.valueOf(i8));
                    } else if (storageOperation2 instanceof EntityStorageOperation) {
                        EntityStorageOperation entityStorageOperation2 = (EntityStorageOperation) storageOperation2;
                        Integer num3 = (Integer) linkedHashMap.get(RealClientSyncStorageOperationBatchSanitizer.getKey(entityStorageOperation2.getEntity()));
                        if (num3 != null) {
                            Object obj4 = list2.get(num3.intValue());
                            obj4.getClass();
                            entityStorageOperation = (EntityStorageOperation) obj4;
                        } else {
                            entityStorageOperation = null;
                        }
                        int ordinal = Regions.getEntityVersionDifference(entityStorageOperation != null ? entityStorageOperation.getEntity() : null, entityStorageOperation2.getEntity()).ordinal();
                        if (ordinal == 0) {
                            linkedHashMap.put(RealClientSyncStorageOperationBatchSanitizer.getKey(entityStorageOperation2.getEntity()), Integer.valueOf(i8));
                        } else if (ordinal != 1 && ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                    } else if (storageOperation2 instanceof DeleteAllRangesAndEntities) {
                        linkedHashSet.clear();
                        linkedHashMap.clear();
                        linkedHashMap2.clear();
                        num = Integer.valueOf(i8);
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    i8 = i11;
                }
                return null;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = ((AcceptableScrim) this.this$0).settledScrimState;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, (ScrimScreen.ManagedAccountSwitchScrimScreen) obj2);
                return Unit.INSTANCE;
            case 10:
                ScrimScreen scrimScreen = (ScrimScreen) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(Intrinsics.areEqual(scrimScreen, (ScrimScreen) obj2));
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                View view = (View) this.this$0;
                Context context = view.getContext();
                while (context != null && !(context instanceof Activity)) {
                    ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                    context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                }
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                    currentFocus.clearFocus();
                }
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj2;
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                if (activity != null && (window = activity.getWindow()) != null) {
                    MemoryCacheService memoryCacheService = new MemoryCacheService(view);
                    int i12 = Build.VERSION.SDK_INT;
                    (i12 >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i12 >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService)).hide(8);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BottomSheetStateListener bottomSheetStateListener = (BottomSheetStateListener) this.this$0;
                int ordinal2 = ((RealSheetState) obj2).getSettledPosition().ordinal();
                if (ordinal2 == 0) {
                    bottomSheetState = BottomSheetState.EXPANDED;
                } else if (ordinal2 == 1) {
                    bottomSheetState = BottomSheetState.PEEKING;
                } else if (ordinal2 == 2) {
                    bottomSheetState = BottomSheetState.PEEKING;
                } else {
                    if (ordinal2 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    bottomSheetState = BottomSheetState.USER_HIDDEN;
                }
                bottomSheetStateListener.onBottomSheetStateChange(bottomSheetState);
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InstrumentQueries instrumentQueries = ((RealProfileManager) this.this$0).profileQueries;
                instrumentQueries.driver.execute(1839043339, "UPDATE profile\nSET bitcoin_amount_entry_currency_preference = ?", new ProfileQueries$$ExternalSyntheticLambda13((int) (null == true ? 1 : 0), obj2, (Object) instrumentQueries));
                instrumentQueries.notifyQueries(1839043339, new ProfileQueries$$ExternalSyntheticLambda4(6));
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InstrumentQueries instrumentQueries2 = ((RealProfileManager) this.this$0).profileQueries;
                QueryResult execute = instrumentQueries2.driver.execute(-247631518, "UPDATE profile\nSET bitcoin_display_units = ?", new ProfileQueries$$ExternalSyntheticLambda13(i5, (BitcoinDisplayUnits) obj2, instrumentQueries2));
                instrumentQueries2.notifyQueries(-247631518, new ProfileQueries$$ExternalSyntheticLambda4(7));
                return execute;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.this$0;
                ((InstrumentQueries) markwonConfiguration.imageDestinationProcessor).transactionWithWrapper(new InstrumentQueries$$ExternalSyntheticLambda0(i6, (GetAvailableStatementsForStatementTypeResponse) obj2, markwonConfiguration));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MarkwonConfiguration markwonConfiguration2 = (MarkwonConfiguration) this.this$0;
                ((InstrumentQueries) markwonConfiguration2.linkResolver).transactionWithWrapper(new InstrumentQueries$$ExternalSyntheticLambda0(i4, markwonConfiguration2, (GetStatementTypesResponse) obj2));
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EglCore eglCore = (EglCore) this.this$0;
                ((SessionQueries) eglCore.eglConfig).transactionWithWrapper(new InstrumentQueries$$ExternalSyntheticLambda0(i2, (GetCryptoTaxStatementsResponse) obj2, eglCore));
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((AndroidFileProvider) ((LocalHomePresenter) this.this$0).featureFlagManager).contentUriForFileUri((Uri) obj2).toString();
            case 19:
                ProducerScope producerScope = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                zzbq zzbqVar = new zzbq(producerScope, i5);
                n nVar = (n) obj2;
                Strings.registerReceiver((Context) nVar.a, zzbqVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, 4);
                ((ProducerCoroutine) producerScope).invokeOnClose(new ProfileQueries$$ExternalSyntheticLambda13(i3, nVar, zzbqVar));
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EarningsHomePresenter earningsHomePresenter = (EarningsHomePresenter) obj2;
                JobKt.launch$default(coroutineScope2, earningsHomePresenter.ioDispatcher, null, new EarningsHomePresenter$models$2$1(earningsHomePresenter, null, i7), 2);
                return Unit.INSTANCE;
            case 21:
                Disclosure disclosure = (Disclosure) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(Intrinsics.areEqual(disclosure, (Disclosure) obj2));
            case 22:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj2;
                JobKt.launch$default(coroutineScope3, (CoroutineContext) transfersPresenter.issuedCardManager, null, new GooglePayPresenter$models$1$1(transfersPresenter, null, 16), 2);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TransfersPresenter.access$models$trackLoadApplet((TransfersPresenter) this.this$0, (MutableState) obj2, EarningsTrackerOpenLoadApplet.Trigger.APPLET_OPEN);
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) this.this$0;
                StoryQueries storyQueries = (StoryQueries) realEducationStoryRepository.storyDao.text;
                storyQueries.getClass();
                StoryQueries$selectBySlug$2 storyQueries$selectBySlug$2 = StoryQueries$selectBySlug$2.INSTANCE;
                List executeAsList = new OffersSheetQueries$ForSheetKeyQuery(storyQueries, (String) obj2, new StoryQueries$$ExternalSyntheticLambda0(i3), i5).executeAsList();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : executeAsList) {
                    SelectBySlug selectBySlug = (SelectBySlug) obj5;
                    Education_story education_story = new Education_story(selectBySlug.id, selectBySlug.url, selectBySlug.slug, selectBySlug.title, selectBySlug.thumbnail, selectBySlug.primaryColor, selectBySlug.published_at_millis, selectBySlug.priority);
                    Object obj6 = linkedHashMap3.get(education_story);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(education_story, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    Education_story education_story2 = (Education_story) entry.getKey();
                    List<SelectBySlug> list3 = (List) entry.getValue();
                    ArrayList arrayList4 = new ArrayList();
                    for (SelectBySlug selectBySlug2 : list3) {
                        Long l = selectBySlug2.id_;
                        if (l != null) {
                            long longValue = l.longValue();
                            Long l2 = selectBySlug2.scene_index;
                            education_story_scene_data = new Education_story_scene_data(longValue, l2 != null ? l2.longValue() : -1L, selectBySlug2.backgroundColor, education_story2.id);
                        } else {
                            education_story_scene_data = null;
                        }
                        if (education_story_scene_data != null) {
                            arrayList4.add(education_story_scene_data);
                        }
                    }
                    arrayList3.add(new EducationStoryEntity(education_story2, arrayList4));
                }
                EducationStoryEntity educationStoryEntity = (EducationStoryEntity) CollectionsKt.firstOrNull((List) arrayList3);
                if (educationStoryEntity != null) {
                    return RealEducationStoryRepository.access$toDomainModel(realEducationStoryRepository, educationStoryEntity);
                }
                return null;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.this$0).invoke(new EducationStoryViewEvent.OnStateRestored(((ParcelableSnapshotMutableIntState) obj2).getIntValue()));
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EducationStoryViewModel educationStoryViewModel = (EducationStoryViewModel) this.this$0;
                if (educationStoryViewModel instanceof EducationStoryViewModel.Ready) {
                    ((ParcelableSnapshotMutableIntState) obj2).setIntValue(((EducationStoryViewModel.Ready) educationStoryViewModel).currentSceneIndex);
                }
                return Unit.INSTANCE;
            case 27:
                SingleAccountHolderEligibility singleAccountHolderEligibility = (SingleAccountHolderEligibility) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) obj2;
                AndroidClock androidClock = realFeatureEligibilityRepository.clock;
                if (androidClock.millis() > singleAccountHolderEligibility.nextRefreshAtMillis) {
                    StateFlowKt.sendOrThrow$default(realFeatureEligibilityRepository.updateEligibilityRequestsQueue, new RealFeatureEligibilityRepository.UpdateEligibilityRequest.CacheExpired(androidClock.millis()));
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str = (String) this.this$0;
                if (str != null) {
                    ((RealRouter) ((DisclosurePresenter) obj2).args).route(new RoutingParams(null, null, null, null, null, null, 511), str);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SavingsScreenViewEvent.GoalCelebrationSeen goalCelebrationSeen = (SavingsScreenViewEvent.GoalCelebrationSeen) ((SavingsScreenViewEvent) obj2);
                ((DependentSavingsScreenPresenter) this.this$0).goalLocalStatus.setGoalCelebrated(goalCelebrationSeen.goalToken, goalCelebrationSeen.completionToken);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealAppConfigManager$update$2$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$response = obj;
    }
}
