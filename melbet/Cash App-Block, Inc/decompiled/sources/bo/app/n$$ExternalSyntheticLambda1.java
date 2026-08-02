package bo.app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.core.impl.SessionConfig;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListItemProviderImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.composer.gapbuffer.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.work.Data;
import androidx.work.Logger$LogcatLogger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkProgressUpdater;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.internal.CashBalanceKt;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.DynamicChargesBreakdownComputer;
import app.cash.local.primitives.BrandCardDetailsKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.CartPaymentSummary;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LineKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.SummaryLine;
import app.cash.local.primitives.Tier;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewEvent;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.memory.MemoryCacheService;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.datadog.trace.core.DDSpan;
import com.datadog.trace.core.PendingTrace;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapClickListenerNode;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.protos.cash.local.client.app.v1.card.BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard$TypeDetails$BrandCardDetails;
import com.squareup.protos.cash.local.client.v1.CardBrandType;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.brotli.dec.HuffmanTreeGroup;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ n$$ExternalSyntheticLambda1(GapComposer gapComposer, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        this.$r8$classId = 5;
        this.f$0 = gapComposer;
        this.f$1 = changeList;
        this.f$2 = slotReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0278, code lost:
    
        if (r1 == null) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c6  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        Rect rect;
        Unit runFallbackClearCredFlow$lambda$2$0$0;
        CardManagementSheetModel.Source source;
        String str;
        CartPaymentSummary cartPaymentSummary;
        List<LocalCart.OpenTabInfo.Round> list;
        CartPaymentSummary cartPaymentSummary2;
        String str2;
        String obj;
        LocalMoney localMoney;
        Tier tier;
        LocalMoney localMoney2;
        LocalMoney localMoney3;
        Fulfillment fulfillment;
        String readResourceValue$lambda$2;
        int i2 = this.$r8$classId;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                return n.a((List) obj6, (List) obj5, (Set) obj4);
            case 1:
                SessionConfigAdapter sessionConfigAdapter = (SessionConfigAdapter) obj6;
                CameraGraphConfigProvider cameraGraphConfigProvider = (CameraGraphConfigProvider) obj5;
                GraphStateToCameraStateAdapter graphStateToCameraStateAdapter = (GraphStateToCameraStateAdapter) obj4;
                SessionConfig sessionConfig = ((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid() ? (SessionConfig) sessionConfigAdapter.sessionConfig$delegate.getValue() : null;
                if (sessionConfig != null) {
                    int i3 = sessionConfig.mSessionType;
                    if (i3 == 1) {
                        i = 1;
                    } else if (i3 != 0) {
                        if (i3 == 0 || i3 == 1) {
                            Log.e("CXCP", "Custom operating mode " + i3 + " conflicts with standard modes");
                            Unit.INSTANCE.getClass();
                            a$$ExternalSyntheticBUOutline0.m$3("kotlin.Unit");
                            return null;
                        }
                        i = i3;
                    }
                    return cameraGraphConfigProvider.m31create79VDu0o(i, sessionConfig, false, graphStateToCameraStateAdapter, null, (Map) sessionConfigAdapter.surfaceToStreamUseCaseMap$delegate.getValue(), (Map) sessionConfigAdapter.surfaceToStreamUseHintMap$delegate.getValue());
                }
                i = 0;
                return cameraGraphConfigProvider.m31create79VDu0o(i, sessionConfig, false, graphStateToCameraStateAdapter, null, (Map) sessionConfigAdapter.surfaceToStreamUseCaseMap$delegate.getValue(), (Map) sessionConfigAdapter.surfaceToStreamUseHintMap$delegate.getValue());
            case 2:
                ContentInViewNode contentInViewNode = (ContentInViewNode) obj6;
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) obj5;
                BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) obj4;
                MemoryCacheService memoryCacheService = contentInViewNode.bringIntoViewRequests;
                while (true) {
                    MutableVector mutableVector = (MutableVector) memoryCacheService.imageLoader;
                    int i4 = mutableVector.size;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            OptionalProvider$$ExternalSyntheticLambda0.m("MutableVector is empty.");
                            return null;
                        }
                        Rect rect2 = (Rect) ((ContentInViewNode.Request) mutableVector.content[i4 - 1]).currentBounds.invoke();
                        if (rect2 == null ? true : ContentInViewNode.m194isMaxVisibleEQwtKw$default(contentInViewNode, rect2, 0L, 0L, 3)) {
                            MutableVector mutableVector2 = (MutableVector) memoryCacheService.imageLoader;
                            CancellableContinuationImpl cancellableContinuationImpl = ((ContentInViewNode.Request) mutableVector2.removeAt(mutableVector2.size - 1)).continuation;
                            Unit unit = Unit.INSTANCE;
                            Result.Companion companion = Result.Companion;
                            cancellableContinuationImpl.resumeWith(unit);
                        }
                    }
                }
                if (contentInViewNode.trackingFocusedChild && (rect = (Rect) contentInViewNode.getFocusedRect.invoke()) != null && ContentInViewNode.m194isMaxVisibleEQwtKw$default(contentInViewNode, rect, 0L, 0L, 3)) {
                    contentInViewNode.trackingFocusedChild = false;
                }
                updatableAnimationState.value = ContentInViewNode.m193access$calculateScrollDeltaI_oMVgE(contentInViewNode, bringIntoViewSpec, 0L);
                return Unit.INSTANCE;
            case 3:
                LazyListState lazyListState = (LazyListState) obj5;
                LazyListIntervalContent lazyListIntervalContent = (LazyListIntervalContent) ((DerivedSnapshotState) obj6).getValue();
                return new LazyListItemProviderImpl(lazyListState, lazyListIntervalContent, (LazyItemScopeImpl) obj4, new HuffmanTreeGroup((IntRange) lazyListState.scrollPosition.nearestRangeState.getValue(), lazyListIntervalContent));
            case 4:
                TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                MutableState mutableState = (MutableState) obj4;
                if (tooltipStateImpl.isVisible()) {
                    JobKt.launch$default(coroutineScope, null, null, new DiskLruCache$launchCleanup$1(tooltipStateImpl, (Continuation) null, 10), 3);
                    mutableState.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 5:
                GapComposer gapComposer = (GapComposer) obj6;
                ChangeList changeList = (ChangeList) obj5;
                SlotReader slotReader = (SlotReader) obj4;
                ComposerChangeListWriter composerChangeListWriter = gapComposer.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.changeList;
                try {
                    composerChangeListWriter.changeList = changeList;
                    SlotReader slotReader2 = gapComposer.reader;
                    int[] iArr = gapComposer.nodeCountOverrides;
                    MutableIntObjectMap mutableIntObjectMap = gapComposer.providerUpdates;
                    gapComposer.nodeCountOverrides = null;
                    gapComposer.providerUpdates = null;
                    try {
                        gapComposer.reader = slotReader;
                        boolean z = composerChangeListWriter.implicitRootStart;
                        try {
                            composerChangeListWriter.implicitRootStart = false;
                            throw null;
                        } catch (Throwable th) {
                            composerChangeListWriter.implicitRootStart = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        gapComposer.reader = slotReader2;
                        gapComposer.nodeCountOverrides = iArr;
                        gapComposer.providerUpdates = mutableIntObjectMap;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    composerChangeListWriter.changeList = changeList2;
                    throw th3;
                }
            case 6:
                GapAnchor gapAnchor = (GapAnchor) obj6;
                SlotWriter slotWriter = (SlotWriter) obj5;
                OperationErrorContext operationErrorContext = (OperationErrorContext) obj4;
                if (gapAnchor != null) {
                    slotWriter.advanceBy(slotWriter.anchorIndex(gapAnchor) - slotWriter.currentGroup);
                }
                List buildTrace = SourceInformationKt.buildTrace(slotWriter, null, slotWriter.currentGroup, null);
                ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) CollectionsKt.lastOrNull(buildTrace);
                Integer num = composeStackTraceFrame != null ? composeStackTraceFrame.groupOffset : null;
                List buildStackTrace = operationErrorContext.buildStackTrace(num);
                if (num != null && !buildStackTrace.isEmpty()) {
                    ComposeStackTraceFrame composeStackTraceFrame2 = (ComposeStackTraceFrame) CollectionsKt.first(buildStackTrace);
                    buildStackTrace = CollectionsKt.plus((Iterable) CollectionsKt.drop(buildStackTrace, 1), (Collection) CollectionsKt__CollectionsJVMKt.listOf(new ComposeStackTraceFrame(composeStackTraceFrame2.groupKey, composeStackTraceFrame2.sourceInfo, num)));
                }
                return new ComposeStackTrace(CollectionsKt.plus((Iterable) buildStackTrace, (Collection) buildTrace), operationErrorContext.getSourceInformationEnabled());
            case 7:
                runFallbackClearCredFlow$lambda$2$0$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0((Exception) obj6, (Executor) obj5, (CredentialManagerCallback) obj4);
                return runFallbackClearCredFlow$lambda$2$0$0;
            case 8:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj5;
                IndividualNetworkCallback individualNetworkCallback = (IndividualNetworkCallback) obj4;
                if (((Ref$BooleanRef) obj6).element) {
                    Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(individualNetworkCallback);
                }
                return Unit.INSTANCE;
            case 9:
                WorkProgressUpdater workProgressUpdater = (WorkProgressUpdater) obj6;
                UUID uuid = (UUID) obj5;
                Data data = (Data) obj4;
                workProgressUpdater.getClass();
                String uuid2 = uuid.toString();
                Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
                String str3 = WorkProgressUpdater.TAG;
                logger$LogcatLogger.debug(str3, "Updating progress for " + uuid + " (" + data + ")");
                WorkDatabase workDatabase = workProgressUpdater.mWorkDatabase;
                workDatabase.beginTransaction();
                try {
                    WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(uuid2);
                    if (workSpec == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (workSpec.state == WorkInfo.State.RUNNING) {
                        WorkProgress workProgress = new WorkProgress(uuid2, data);
                        WorkProgressDao_Impl workProgressDao = workDatabase.workProgressDao();
                        workProgressDao.getClass();
                        DBUtil.performBlocking(workProgressDao.__db, false, true, new Navigator$$ExternalSyntheticLambda0(28, workProgressDao, workProgress));
                    } else {
                        Logger$LogcatLogger.get().warning(str3, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    return null;
                } catch (Throwable th4) {
                    try {
                        Logger$LogcatLogger.get().error(str3, "Error updating Worker progress", th4);
                        throw th4;
                    } catch (Throwable th5) {
                        workDatabase.endTransaction();
                        throw th5;
                    }
                }
            case 10:
                AndroidStringManager androidStringManager = (AndroidStringManager) ((LocalCashBalancePresenter) obj6).stringManager;
                MutableState mutableState2 = (MutableState) obj4;
                List list2 = (List) ((State) obj5).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list2) {
                    if (((LocalEarningCard) obj7).source != null) {
                        arrayList.add(obj7);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    LocalEarningCard.Source source2 = ((LocalEarningCard) next).source;
                    source2.getClass();
                    Object obj8 = linkedHashMap.get(source2);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap.put(source2, obj8);
                    }
                    ((List) obj8).add(next);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        LocalEarningCard.Source source3 = (LocalEarningCard.Source) entry.getKey();
                        List list3 = (List) entry.getValue();
                        int ordinal = source3.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                str = androidStringManager.get(R.string.local_presenters_earning_source_linked_in_store);
                            } else if (ordinal == 2) {
                                str = androidStringManager.get(R.string.local_presenters_earning_source_cash_app_wallet);
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj9 : list3) {
                                LocalEarningCard.EarningState earningState = ((LocalEarningCard) obj9).state;
                                if (earningState != null && earningState != LocalEarningCard.EarningState.EARNING_STATE_UNSPECIFIED) {
                                    arrayList3.add(obj9);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                LocalEarningCard localEarningCard = (LocalEarningCard) it3.next();
                                String str4 = localEarningCard.id;
                                CardManagementSheetModel.Card card = str4 == null ? null : new CardManagementSheetModel.Card(str4, localEarningCard.card_image, localEarningCard.primary_display_text, localEarningCard.secondary_display_text, localEarningCard.byline_display_text, localEarningCard.state == LocalEarningCard.EarningState.EARNING_STATE_ENABLED_FOR_EARNING);
                                if (card != null) {
                                    arrayList4.add(card);
                                }
                            }
                            source = new CardManagementSheetModel.Source(str, arrayList4);
                        } else {
                            source = null;
                        }
                        if (source != null) {
                            arrayList2.add(source);
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            if (!((CardManagementSheetModel.Source) next2).cards.isEmpty()) {
                                arrayList5.add(next2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            return new CardManagementSheetModel(androidStringManager.get(R.string.local_presenters_earning_sheet_title), androidStringManager.get(R.string.local_presenters_earning_sheet_body), arrayList5, ((Boolean) mutableState2.getValue()).booleanValue());
                        }
                    }
                }
                return null;
            case 11:
                RealOrderBuilder realOrderBuilder = (RealOrderBuilder) obj6;
                LocalMoney localMoney4 = (LocalMoney) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                CreateCartResponse cartResponse = realOrderBuilder.getCartResponse();
                AndroidStringManager androidStringManager2 = realOrderBuilder.stringManager;
                zzho zzhoVar = cartResponse.response;
                zzhoVar.getClass();
                CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                LocalCart localCart = createCartResponse$Response$Cart != null ? createCartResponse$Response$Cart.value : null;
                localCart.getClass();
                String str5 = localCart.token;
                str5.getClass();
                String str6 = localCart.brand_token;
                str6.getClass();
                String str7 = localCart.location_token;
                str7.getClass();
                BrandSpot brandSpot = new BrandSpot(str6, str7);
                List<LocalCart.Line> list4 = localCart.lines;
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(LineKt.toLine((LocalCart.Line) it5.next()));
                }
                List<LocalCart.SummaryLine> list5 = localCart.summary_lines;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (LocalCart.SummaryLine summaryLine : list5) {
                    summaryLine.getClass();
                    String str8 = summaryLine.description;
                    str8.getClass();
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney5 = summaryLine.amount;
                    localMoney5.getClass();
                    arrayList7.add(new SummaryLine(str8, LocalMoneyKt.toMoney(localMoney5), false));
                }
                com.squareup.protos.cash.local.client.v1.LocalMoney localMoney6 = localCart.lines_subtotal;
                localMoney6.getClass();
                LocalMoney money = LocalMoneyKt.toMoney(localMoney6);
                com.squareup.protos.cash.local.client.v1.LocalMoney localMoney7 = localCart.total;
                localMoney7.getClass();
                LocalMoney money2 = LocalMoneyKt.toMoney(localMoney7);
                com.squareup.protos.cash.local.client.v1.LocalMoney localMoney8 = localCart.total;
                localMoney8.getClass();
                LocalMoney money3 = LocalMoneyKt.toMoney(localMoney8);
                String str9 = localCart.version;
                DynamicChargesBreakdown dynamicChargesBreakdown = localCart.charges_breakdown;
                LocalCart.PaymentSummary paymentSummary = localCart.payment_summary;
                if (paymentSummary != null) {
                    CardBrandType cardBrandType = paymentSummary.card_brand;
                    if (cardBrandType != null) {
                        if (cardBrandType == CardBrandType.CARD_BRAND_TYPE_UNSPECIFIED) {
                            cardBrandType = null;
                        }
                        if (cardBrandType != null && (str2 = paymentSummary.last_4) != null && (obj = StringsKt.trim(str2).toString()) != null) {
                            if (obj.length() == 4) {
                                for (int i5 = 0; i5 < obj.length(); i5++) {
                                    if (Character.isDigit(obj.charAt(i5))) {
                                    }
                                }
                                if (obj != null) {
                                    cartPaymentSummary2 = new CartPaymentSummary(cardBrandType, obj);
                                    cartPaymentSummary = cartPaymentSummary2;
                                }
                            }
                            obj = null;
                            if (obj != null) {
                            }
                        }
                    }
                    cartPaymentSummary2 = null;
                    cartPaymentSummary = cartPaymentSummary2;
                } else {
                    cartPaymentSummary = null;
                }
                LocalCart.OpenTabInfo openTabInfo = localCart.open_tab_info;
                Cart cart = new Cart(str5, str9, brandSpot, arrayList6, arrayList7, money, money2, money3, dynamicChargesBreakdown, cartPaymentSummary, (openTabInfo == null || (list = openTabInfo.rounds) == null || !(list.isEmpty() ^ true)) ? false : true);
                if (dynamicChargesBreakdown != null) {
                    List<DynamicChargesBreakdown.RowCalculation> list6 = dynamicChargesBreakdown.rows;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                    for (DynamicChargesBreakdown.RowCalculation rowCalculation : list6) {
                        String str10 = rowCalculation.identifier;
                        arrayList8.add((str10 == null || !str10.equals(dynamicChargesBreakdown.customer_tip_identifier)) ? rowCalculation : DynamicChargesBreakdown.RowCalculation.copy$default(rowCalculation, null, null, null, null, null, null, null, null, null, 507, null));
                    }
                    mutableState3.setValue(new DynamicChargesBreakdownComputer(DynamicChargesBreakdown.copy$default(dynamicChargesBreakdown, arrayList8, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE), androidStringManager2));
                }
                if (!realOrderBuilder.getRedeemLocalCashBalance() || localMoney4 == null || dynamicChargesBreakdown != null) {
                    return cart;
                }
                Iterator it6 = CollectionsKt__CollectionsKt.listOf((Object[]) new LocalMoney[]{money2, localMoney4}).iterator();
                if (!it6.hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Object next3 = it6.next();
                if (it6.hasNext()) {
                    long j = ((LocalMoney) next3).amount;
                    do {
                        Object next4 = it6.next();
                        long j2 = ((LocalMoney) next4).amount;
                        if (j > j2) {
                            next3 = next4;
                            j = j2;
                        }
                    } while (it6.hasNext());
                }
                LocalMoney localMoney9 = (LocalMoney) next3;
                LocalMoney minus = LocalMoneysKt.minus(money2, localMoney9);
                ArrayList plus = CollectionsKt.plus((Collection) cart.summaryLines, (Object) new SummaryLine(androidStringManager2.get(R.string.local_presenters_local_cash_applied), LocalMoney.copy$default(localMoney9, -localMoney9.amount), true));
                String str11 = cart.token;
                str11.getClass();
                BrandSpot brandSpot2 = cart.brandSpot;
                brandSpot2.getClass();
                LocalMoney localMoney10 = cart.linesSubtotal;
                localMoney10.getClass();
                LocalMoney localMoney11 = cart.serverCalculatedTotal;
                localMoney11.getClass();
                return new Cart(str11, cart.version, brandSpot2, cart.lines, plus, localMoney10, minus, localMoney11, cart.chargesBreakdown, cart.paymentSummary, cart.hasOpenTabRounds);
            case 12:
                RealOrderBuilder realOrderBuilder2 = (RealOrderBuilder) obj6;
                State state = (State) obj5;
                State state2 = (State) obj4;
                LocalCashEarningsConfiguration localCashEarningsConfiguration = realOrderBuilder2.getCartResponse().local_cash_earnings_configuration;
                if ((localCashEarningsConfiguration != null ? localCashEarningsConfiguration.calculated_local_cash_earnings : null) != null) {
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney12 = localCashEarningsConfiguration.calculated_local_cash_earnings;
                    localMoney12.getClass();
                    return LocalMoneyKt.toMoney(localMoney12);
                }
                if (realOrderBuilder2.getTipAmount() == null) {
                    return null;
                }
                List list7 = localCashEarningsConfiguration != null ? localCashEarningsConfiguration.tiers : null;
                if (list7 == null) {
                    list7 = EmptyList.INSTANCE;
                }
                List<LocalCashEarningsConfiguration.Tier> list8 = list7;
                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                for (LocalCashEarningsConfiguration.Tier tier2 : list8) {
                    tier2.getClass();
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney13 = tier2.subtotal_threshold;
                    LocalMoney money4 = localMoney13 != null ? LocalMoneyKt.toMoney(localMoney13) : null;
                    Long l = tier2.cap_subtotal_multiplier_bps;
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney14 = tier2.cap_absolute_amount;
                    LocalMoney money5 = localMoney14 != null ? LocalMoneyKt.toMoney(localMoney14) : null;
                    Long l2 = tier2.earning_rate_bps;
                    arrayList9.add(new Tier(money4, l, money5, l2 != null ? l2.longValue() : 10000L));
                }
                if (arrayList9.isEmpty()) {
                    return null;
                }
                ComputedOrderSummary computedOrderSummary = (ComputedOrderSummary) state.getValue();
                if (computedOrderSummary != null) {
                    ComputedOrderSummary.Row grandTotalRow = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary);
                    if (grandTotalRow != null && (localMoney2 = grandTotalRow.amount) != null) {
                        ComputedOrderSummary.Row customerTipRow = ComputedOrderSummaryKt.getCustomerTipRow(computedOrderSummary);
                        if (customerTipRow == null || (localMoney3 = customerTipRow.amount) == null) {
                            localMoney3 = new LocalMoney(0L, LocalCurrencyCode.USD);
                        }
                        localMoney = LocalMoneysKt.minus(localMoney2, localMoney3);
                        break;
                    } else {
                        localMoney = null;
                        break;
                    }
                }
                localMoney = ((Cart) state2.getValue()).total;
                LocalMoney tipAmount = realOrderBuilder2.getTipAmount();
                localMoney.getClass();
                LocalMoney zero = LocalMoneysKt.zero(localMoney.currencyCode);
                if (tipAmount == null) {
                    tipAmount = zero;
                }
                Iterator it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    Object next5 = it7.next();
                    LocalMoney localMoney15 = ((Tier) next5).subtotalThreshold;
                    if (localMoney15 == null || LocalMoneysKt.compareTo(localMoney, localMoney15) <= 0) {
                        obj2 = next5;
                        tier = (Tier) obj2;
                        if (tier != null) {
                            return zero;
                        }
                        LocalMoney multiplyingByBasisPoints = CashBalanceKt.multiplyingByBasisPoints(tipAmount, tier.earningRateBps);
                        LocalMoney localMoney16 = tier.capAbsoluteAmount;
                        if (localMoney16 != null) {
                            multiplyingByBasisPoints = LocalMoneysKt.minOf(multiplyingByBasisPoints, localMoney16);
                        }
                        Long l3 = tier.capSubtotalMultiplierBps;
                        return l3 != null ? LocalMoneysKt.minOf(multiplyingByBasisPoints, CashBalanceKt.multiplyingByBasisPoints(localMoney, l3.longValue())) : multiplyingByBasisPoints;
                    }
                }
                tier = (Tier) obj2;
                if (tier != null) {
                }
                break;
            case 13:
                LocalOrderStatusPresenter localOrderStatusPresenter = (LocalOrderStatusPresenter) obj5;
                State state3 = (State) obj4;
                ZoneId zoneId = ((Location.LocationSummary) obj6).zoneId;
                if (zoneId == null || (fulfillment = (Fulfillment) state3.getValue()) == null) {
                    return null;
                }
                return DateTimesKt.estimatedTime(fulfillment, localOrderStatusPresenter.stringManager, zoneId);
            case 14:
                State state4 = (State) obj6;
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                List list9 = (List) state4.getValue();
                if (list9 == null || list9.isEmpty()) {
                    return null;
                }
                List list10 = (List) state4.getValue();
                list10.getClass();
                for (Object obj10 : list10) {
                    LocalCard localCard = (LocalCard) obj10;
                    String str12 = localBrandProfilePresenter.screen.brandSpot.brandToken;
                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = localCard.type_details;
                    localCard$TypeDetails$BrandCardDetails.getClass();
                    BrandCardDetails brandCardDetails = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails);
                    brandCardDetails.getClass();
                    String str13 = brandCardDetails.brand_token;
                    str13.getClass();
                    if (!Intrinsics.areEqual(str12, str13)) {
                        String models$lambda$9 = LocalBrandProfilePresenter.models$lambda$9(mutableState4);
                        LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails2 = localCard.type_details;
                        localCard$TypeDetails$BrandCardDetails2.getClass();
                        BrandCardDetails brandCardDetails2 = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails2);
                        brandCardDetails2.getClass();
                        String str14 = brandCardDetails2.brand_token;
                        str14.getClass();
                        if (models$lambda$9 == null ? false : models$lambda$9.equals(str14)) {
                        }
                    }
                    obj3 = obj10;
                    return (LocalCard) obj3;
                    break;
                }
                return (LocalCard) obj3;
            case 15:
                MutableState mutableState5 = (MutableState) obj4;
                boolean booleanValue = ((Boolean) ((MutableState) obj5).getValue()).booleanValue();
                LocalBrandProfileScreen localBrandProfileScreen = ((LocalBrandProfilePresenter) obj6).screen;
                BrandSpotSyncTokens copy$default = booleanValue ? BrandSpotSyncTokens.copy$default(localBrandProfileScreen.syncTokens, null, 1) : localBrandProfileScreen.syncTokens;
                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) mutableState5.getValue();
                if (fulfillmentConfiguration == null) {
                    return copy$default;
                }
                LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration.getSchedulingDetails();
                return BrandSpotSyncTokens.copy$default(copy$default, schedulingDetails != null ? schedulingDetails.scheduling_day_time_token : null, 6);
            case 16:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Function0 function0 = (Function0) obj4;
                ((FocusOwnerImpl) obj6).clearFocus(false);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function0.invoke();
                return Unit.INSTANCE;
            case 17:
                Function1 function1 = (Function1) obj6;
                ((MutableState) obj4).setValue(Boolean.TRUE);
                String str15 = ((LocalCheckoutTipSectionViewModel) obj5).overrideTip;
                if (str15 == null) {
                    str15 = "";
                }
                function1.invoke(str15);
                return Unit.INSTANCE;
            case 18:
                LocalMenuComboDetailsViewModel.ComboSlot comboSlot = (LocalMenuComboDetailsViewModel.ComboSlot) obj5;
                LocalMenuComboDetailsViewModel.ComboSlotOption comboSlotOption = (LocalMenuComboDetailsViewModel.ComboSlotOption) obj4;
                ((Function1) obj6).invoke(new LocalMenuComboDetailsViewEvent.SelectSlotOption(comboSlot.sectionIndex, comboSlot.token, comboSlotOption.itemToken, comboSlotOption.variationToken));
                return Unit.INSTANCE;
            case 19:
                LocalBrandLocationMenuContentModel.Menu menu = (LocalBrandLocationMenuContentModel.Menu) obj5;
                ((Function1) obj6).invoke(new LocalBrandProfileViewEvent.MenuCategoryClicked(menu != null ? menu.token : null, ((LocalBrandLocationMenuContentModel.Entry) obj4).token));
                return Unit.INSTANCE;
            case 20:
                Function1 function12 = (Function1) obj5;
                MutableState mutableState6 = (MutableState) obj4;
                AddressState address = ((AddressTypeaheadState) obj6).getAddress();
                if (address instanceof AddressState.Error) {
                    mutableState6.setValue(((AddressState.Error) address).message);
                } else if (address instanceof AddressState.Valid) {
                    function12.invoke(FulfillmentPickerViewEvent.DeliveryAddressSelected.INSTANCE);
                } else if (!(address instanceof AddressState.Empty) && !(address instanceof AddressState.Searching)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 21:
                return l2.a((l2) obj6, (IInAppMessage) obj5, (String) obj4);
            case 22:
                return l2.a((l2) obj6, (u3) obj5, (String) obj4);
            case 23:
                return r7.a((r7) obj6, (Class) obj5, obj4);
            case 24:
                return ta.b((kd) obj6, (Map) obj5, (JSONObject) obj4);
            case 25:
                readResourceValue$lambda$2 = CachedConfigurationProvider.readResourceValue$lambda$2((i3) obj6, (String) obj5, obj4);
                return readResourceValue$lambda$2;
            case 26:
                return com.braze.storage.f.a((Context) obj6, (String) obj5, (String) obj4);
            case 27:
                return zbc.generateLogMessage((String) ((zbc) obj6).zbb, (String) obj5, (Object[]) obj4);
            case 28:
                return zbc.generateLogMessage((String) ((zbc) obj6).zbb, "Finished span ({}): {}", (PendingTrace.PublishState) obj5, (DDSpan) obj4);
            default:
                return new MapClickListenerNode(((MapApplier) obj6).map, (Function2) obj5, obj4);
        }
    }

    public /* synthetic */ n$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
