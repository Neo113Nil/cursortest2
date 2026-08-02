package com.squareup.cash.offers.presenters;

import androidx.biometric.DeviceUtils;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.EstimatedCompletionDurationKt;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationKt;
import app.cash.local.primitives.LocationToken;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.blockers.presenters.EarnerEnrollmentBlockerPresenter;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewVisibleNearbyRetailers;
import com.squareup.cash.deposits.physical.backend.api.retailer.RetailerLocationResult;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$MapDataViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.viewmodels.MapBoundary;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$2$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersHomeQueries$forId$2;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.presenters.BaseAllowlistSelectionPresenter;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.presenters.QuickPayPresenter$models$3$1;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.work.data.api.ShiftDataLoader;
import com.squareup.cash.work.presenters.shift.ShiftListPresenter;
import com.squareup.protos.cash.local.client.v1.InStoreOrderingFulfillmentConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$8$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activeBoostToken$delegate;
    public final /* synthetic */ Object $browseFlowToken$delegate;
    public MutableState $browseListingViewModel$delegate;
    public final /* synthetic */ Object $browseStartEventSpec$delegate;
    public Object $heroTileHomeSection$delegate;
    public final /* synthetic */ Object $infoTileFormattedDetail$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $savedCLOClusterSectionViewModel$delegate;
    public MutableState $searchPlaceholder$delegate;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(LocalHomePresenter localHomePresenter, BugReportingViewEvent bugReportingViewEvent, RealBugReportSender realBugReportSender, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.this$0 = localHomePresenter;
        this.$heroTileHomeSection$delegate = bugReportingViewEvent;
        this.$infoTileFormattedDetail$delegate = realBugReportSender;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState5;
        this.$browseStartEventSpec$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$browseFlowToken$delegate;
        Object obj3 = this.$infoTileFormattedDetail$delegate;
        Object obj4 = this.$browseStartEventSpec$delegate;
        Object obj5 = this.$savedCLOClusterSectionViewModel$delegate;
        switch (i) {
            case 0:
                return new OffersHomePresenter$models$8$1((OffersHomePresenter) this.this$0, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, (MutableState) this.$heroTileHomeSection$delegate, (MutableState) obj3, continuation);
            case 1:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$1 = new OffersHomePresenter$models$8$1((FulfillmentConfiguration) obj4, continuation, (LocalBrandProfilePresenter) this.$heroTileHomeSection$delegate, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (State) obj3, (MutableState) obj5);
                offersHomePresenter$models$8$1.this$0 = obj;
                return offersHomePresenter$models$8$1;
            case 2:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$12 = new OffersHomePresenter$models$8$1((Flow) obj5, continuation, (TapToPayPresenter) obj4, this.$browseListingViewModel$delegate, (State) this.$heroTileHomeSection$delegate, this.$searchPlaceholder$delegate, (State) obj3, this.$activeBoostToken$delegate, (MutableState) obj2);
                offersHomePresenter$models$8$12.this$0 = obj;
                return offersHomePresenter$models$8$12;
            case 3:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$13 = new OffersHomePresenter$models$8$1((Flow) obj4, continuation, (EarnerEnrollmentBlockerPresenter) this.$heroTileHomeSection$delegate, (String) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5);
                offersHomePresenter$models$8$13.this$0 = obj;
                return offersHomePresenter$models$8$13;
            case 4:
                return new OffersHomePresenter$models$8$1((LocalHomePresenter) this.this$0, (BugReportingViewEvent) this.$heroTileHomeSection$delegate, (RealBugReportSender) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation);
            case 5:
                return new OffersHomePresenter$models$8$1(this.$activeBoostToken$delegate, (PaperMoneyDepositMapPresenter) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation);
            case 6:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$14 = new OffersHomePresenter$models$8$1((Flow) this.$heroTileHomeSection$delegate, continuation, (MoleculePresenter) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, 6);
                offersHomePresenter$models$8$14.this$0 = obj;
                return offersHomePresenter$models$8$14;
            case 7:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$15 = new OffersHomePresenter$models$8$1((Flow) this.$heroTileHomeSection$delegate, continuation, (MoleculePresenter) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, 7);
                offersHomePresenter$models$8$15.this$0 = obj;
                return offersHomePresenter$models$8$15;
            case 8:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$16 = new OffersHomePresenter$models$8$1((Flow) obj2, continuation, (BaseAllowlistSelectionPresenter) obj5, (CoroutineScope) obj4, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (ParcelableSnapshotMutableIntState) this.$heroTileHomeSection$delegate, (ParcelableSnapshotMutableIntState) obj3);
                offersHomePresenter$models$8$16.this$0 = obj;
                return offersHomePresenter$models$8$16;
            case 9:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$17 = new OffersHomePresenter$models$8$1((Flow) this.$heroTileHomeSection$delegate, continuation, (MoleculePresenter) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, 9);
                offersHomePresenter$models$8$17.this$0 = obj;
                return offersHomePresenter$models$8$17;
            case 10:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$18 = new OffersHomePresenter$models$8$1((Flow) this.$heroTileHomeSection$delegate, continuation, (MoleculePresenter) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, 10);
                offersHomePresenter$models$8$18.this$0 = obj;
                return offersHomePresenter$models$8$18;
            case 11:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$19 = new OffersHomePresenter$models$8$1((Flow) obj4, continuation, (PaymentLoadingPresenter) this.$heroTileHomeSection$delegate, this.$browseListingViewModel$delegate, (String) obj3, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, (MutableState) obj5);
                offersHomePresenter$models$8$19.this$0 = obj;
                return offersHomePresenter$models$8$19;
            case 12:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$110 = new OffersHomePresenter$models$8$1((Flow) obj5, continuation, (PoolsListPresenter) obj4, (AskedQuestion) this.$heroTileHomeSection$delegate, (CoroutineScope) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, 12);
                offersHomePresenter$models$8$110.this$0 = obj;
                return offersHomePresenter$models$8$110;
            default:
                OffersHomePresenter$models$8$1 offersHomePresenter$models$8$111 = new OffersHomePresenter$models$8$1((Flow) obj5, continuation, (ShiftListPresenter) obj4, (ShiftDataLoader) this.$heroTileHomeSection$delegate, (LocalDate) obj3, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj2, 13);
                offersHomePresenter$models$8$111.this$0 = obj;
                return offersHomePresenter$models$8$111;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersHomePresenter$models$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x055e, code lost:
    
        if (((app.cash.local.store.real.RealLocalInstalledStore) r11).m1290updateFulfillmentConfigurationsNoPDS7c(r1, r2, r28) == r13) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x06ea, code lost:
    
        if (((app.cash.local.store.real.RealLocalInstalledStore) r11).m1290updateFulfillmentConfigurationsNoPDS7c(r0, r1, r28) != r13) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x074c, code lost:
    
        if (((app.cash.local.store.real.RealLocalInstalledStore) r11).m1290updateFulfillmentConfigurationsNoPDS7c(r0, r1, r28) == r13) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x07ea, code lost:
    
        if (((app.cash.local.store.real.RealLocalInstalledStore) r11).m1289updateFulfillmentConfigurationNoPDS7c(r0, r1, r28) == r13) goto L335;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0633 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x063a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0624  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration;
        ?? r14;
        LocalFulfillmentType localFulfillmentType;
        boolean z;
        Iterator it;
        boolean z2;
        Object obj2;
        Object obj3;
        boolean z3;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration2;
        LocalBrand.RequiredLocationSelection requiredLocationSelection;
        List list;
        LocalLocationDetail localLocationDetail;
        String str;
        LocalLocationDetail localLocationDetail2;
        LocalLocationSummary localLocationSummary;
        LocalLocationDetail localLocationDetail3;
        LocalLocationSummary localLocationSummary2;
        InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration;
        CashMapViewEvent.MapMovementFinished mapMovementFinished;
        Object retailers;
        PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter;
        MutableState mutableState;
        MutableState mutableState2;
        int i;
        int i2 = this.$r8$classId;
        MutableState mutableState3 = this.$activeBoostToken$delegate;
        Object obj4 = this.$browseFlowToken$delegate;
        Object obj5 = this.$infoTileFormattedDetail$delegate;
        Object obj6 = this.$browseStartEventSpec$delegate;
        Object obj7 = this.$savedCLOClusterSectionViewModel$delegate;
        switch (i2) {
            case 0:
                OffersHomePresenter offersHomePresenter = (OffersHomePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository = offersHomePresenter.offersTabRepository;
                    Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0 = new Overlay$$ExternalSyntheticLambda0(offersHomePresenter, 26);
                    GpsConfigQueries gpsConfigQueries = realOffersTabRepository.cashDatabase.offersHomeQueries;
                    gpsConfigQueries.getClass();
                    OffersHomeQueries$forId$2 offersHomeQueries$forId$2 = OffersHomeQueries$forId$2.INSTANCE;
                    byte b = 0;
                    SafeFlow safeFlow = new SafeFlow(new MusicPresenter$models$1$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(gpsConfigQueries, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries, b), b)), realOffersTabRepository.ioDispatcher), realOffersTabRepository, overlay$$ExternalSyntheticLambda0, (Continuation) null, 21));
                    QuickPayPresenter$models$3$1 quickPayPresenter$models$3$1 = new QuickPayPresenter$models$3$1(offersHomePresenter, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7, (MutableState) obj6, (MutableState) this.$heroTileHomeSection$delegate, (MutableState) obj5, (Continuation) null);
                    this.label = 1;
                    if (FlowKt.collectLatest(safeFlow, quickPayPresenter$models$3$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState4 = this.$browseListingViewModel$delegate;
                MutableState mutableState5 = (MutableState) obj7;
                State state = (State) obj5;
                MutableState mutableState6 = (MutableState) obj4;
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) this.$heroTileHomeSection$delegate;
                LocalInstalledStore localInstalledStore = localBrandProfilePresenter.store;
                MutableState mutableState7 = this.$searchPlaceholder$delegate;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) obj6;
                    if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                        mutableState4.setValue(Boolean.TRUE);
                        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Unspecified) {
                            if (localBrandProfilePresenter.screen.syncTokens.inStoreOrderingToken != null) {
                                LocalBrand localBrand = (LocalBrand) mutableState7.getValue();
                                LocalFulfillment localFulfillment = (localBrand == null || (localLocationDetail3 = localBrand.selected_location) == null || (localLocationSummary2 = localLocationDetail3.summary) == null || (inStoreOrderingFulfillmentConfiguration = localLocationSummary2.in_store_ordering_configuration) == null) ? null : inStoreOrderingFulfillmentConfiguration.cart_fulfillment;
                                LocalBrand localBrand2 = (LocalBrand) mutableState7.getValue();
                                if (localBrand2 == null || (localLocationDetail2 = localBrand2.selected_location) == null || (localLocationSummary = localLocationDetail2.summary) == null || (str = localLocationSummary.token) == null) {
                                    str = null;
                                }
                                if (localFulfillment != null && str != null) {
                                    mutableState3.setValue(r2 != null ? new LocationToken(str) : null);
                                    Fulfillment fulfillment = FulfillmentKt.toFulfillment(localFulfillment);
                                    String models$lambda$9 = LocalBrandProfilePresenter.models$lambda$9(mutableState6);
                                    models$lambda$9.getClass();
                                    FulfillmentConfigurations fulfillmentConfigurations = new FulfillmentConfigurations(FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(fulfillment, str, null), 1);
                                    this.this$0 = null;
                                    this.label = 1;
                                    break;
                                }
                            }
                            LocalBrand.FulfillmentSelection fulfillmentSelection = ((Brand) state.getValue()).fulfillmentSelection;
                            List list2 = fulfillmentSelection != null ? fulfillmentSelection.available_fulfillment_types : null;
                            if (list2 == null) {
                                list2 = EmptyList.INSTANCE;
                            }
                            if (!list2.isEmpty()) {
                                LocalBrand localBrand3 = (LocalBrand) mutableState7.getValue();
                                List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((localBrand3 == null || (localLocationDetail = localBrand3.selected_location) == null) ? null : LocationKt.toLocation(localLocationDetail));
                                LocalBrand localBrand4 = (LocalBrand) mutableState7.getValue();
                                if (localBrand4 == null || (list = localBrand4.nearby_locations) == null) {
                                    r14 = 0;
                                } else {
                                    List list3 = list;
                                    r14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        r14.add(LocationKt.toLocation((LocalLocationSummary) it2.next()));
                                    }
                                }
                                if (r14 == 0) {
                                    r14 = EmptyList.INSTANCE;
                                }
                                ArrayList plus = CollectionsKt.plus((Iterable) r14, (Collection) listOfNotNull);
                                LocalBrand.FulfillmentSelection fulfillmentSelection2 = ((Brand) state.getValue()).fulfillmentSelection;
                                if (fulfillmentSelection2 == null || (localFulfillmentType = fulfillmentSelection2.previous_fulfillment_method_used) == null) {
                                    localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
                                }
                                List list4 = list2;
                                boolean z4 = list4 instanceof Collection;
                                if (!z4 || !list4.isEmpty()) {
                                    Iterator it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        if (((LocalFulfillmentType) it3.next()) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP) {
                                            z = true;
                                            if (z4 || !list4.isEmpty()) {
                                                it = list4.iterator();
                                                while (it.hasNext()) {
                                                    if (((LocalFulfillmentType) it.next()) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY) {
                                                        z2 = true;
                                                        boolean z5 = localFulfillmentType != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY && z2;
                                                        if (z || z5) {
                                                            if (!z2) {
                                                                throw new IllegalStateException(("No supported fulfillment types for Brand[" + BrandToken.m1229toStringimpl(((Brand) state.getValue()).token) + "], types=[" + CollectionsKt.joinToString$default(list4, null, null, null, 0, null, null, 63) + "]").toString());
                                                            }
                                                            Iterator it4 = plus.iterator();
                                                            while (true) {
                                                                if (it4.hasNext()) {
                                                                    obj2 = it4.next();
                                                                    if (((Location) obj2).getAvailableFulfillmentTypes().contains(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY)) {
                                                                    }
                                                                } else {
                                                                    obj2 = null;
                                                                }
                                                            }
                                                            Location location = (Location) obj2;
                                                            if (location != null) {
                                                                mutableState5.setValue(Boolean.TRUE);
                                                                mutableState3.setValue(r2 != null ? new LocationToken(location.mo1225getTokenQsI1X5w()) : null);
                                                                String models$lambda$92 = LocalBrandProfilePresenter.models$lambda$9(mutableState6);
                                                                models$lambda$92.getClass();
                                                                FulfillmentConfigurations fulfillmentConfigurations2 = new FulfillmentConfigurations(new FulfillmentConfiguration.Delivery(location.mo1225getTokenQsI1X5w(), null, null, null, null, null), 1);
                                                                this.this$0 = null;
                                                                this.label = 3;
                                                                break;
                                                            }
                                                        } else {
                                                            Iterator it5 = plus.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    obj3 = it5.next();
                                                                    if (((Location) obj3).getAvailableFulfillmentTypes().contains(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP)) {
                                                                    }
                                                                } else {
                                                                    obj3 = null;
                                                                }
                                                            }
                                                            Location location2 = (Location) obj3;
                                                            if (location2 != null) {
                                                                LocalBrand localBrand5 = (LocalBrand) mutableState7.getValue();
                                                                if ((localBrand5 == null || (requiredLocationSelection = localBrand5.required_location_selection) == null) ? false : Intrinsics.areEqual(requiredLocationSelection.selected_location_is_default, Boolean.TRUE)) {
                                                                    ArrayList arrayList = new ArrayList();
                                                                    Iterator it6 = plus.iterator();
                                                                    while (it6.hasNext()) {
                                                                        Object next = it6.next();
                                                                        if (((Location) next).getAvailableFulfillmentTypes().contains(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP)) {
                                                                            arrayList.add(next);
                                                                        }
                                                                    }
                                                                    if (arrayList.size() > 1) {
                                                                        z3 = true;
                                                                        mutableState5.setValue(Boolean.valueOf(z3));
                                                                        mutableState3.setValue(r2 != null ? new LocationToken(location2.mo1225getTokenQsI1X5w()) : null);
                                                                        String models$lambda$93 = LocalBrandProfilePresenter.models$lambda$9(mutableState6);
                                                                        models$lambda$93.getClass();
                                                                        String mo1225getTokenQsI1X5w = location2.mo1225getTokenQsI1X5w();
                                                                        LocalBrand localBrand6 = (LocalBrand) mutableState7.getValue();
                                                                        FulfillmentConfigurations fulfillmentConfigurations3 = new FulfillmentConfigurations(new FulfillmentConfiguration.Pickup(mo1225getTokenQsI1X5w, (localBrand6 != null || (localEstimatedCompletionDuration2 = localBrand6.estimated_pickup_wait_time) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(localEstimatedCompletionDuration2), 10), 1);
                                                                        this.this$0 = null;
                                                                        this.label = 2;
                                                                        break;
                                                                    }
                                                                }
                                                                z3 = false;
                                                                mutableState5.setValue(Boolean.valueOf(z3));
                                                                mutableState3.setValue(r2 != null ? new LocationToken(location2.mo1225getTokenQsI1X5w()) : null);
                                                                String models$lambda$932 = LocalBrandProfilePresenter.models$lambda$9(mutableState6);
                                                                models$lambda$932.getClass();
                                                                String mo1225getTokenQsI1X5w2 = location2.mo1225getTokenQsI1X5w();
                                                                LocalBrand localBrand62 = (LocalBrand) mutableState7.getValue();
                                                                FulfillmentConfigurations fulfillmentConfigurations32 = new FulfillmentConfigurations(new FulfillmentConfiguration.Pickup(mo1225getTokenQsI1X5w2, (localBrand62 != null || (localEstimatedCompletionDuration2 = localBrand62.estimated_pickup_wait_time) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(localEstimatedCompletionDuration2), 10), 1);
                                                                this.this$0 = null;
                                                                this.label = 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z2 = false;
                                            if (localFulfillmentType != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY) {
                                            }
                                            if (z) {
                                            }
                                            if (!z2) {
                                            }
                                        }
                                    }
                                }
                                z = false;
                                if (z4) {
                                }
                                it = list4.iterator();
                                while (it.hasNext()) {
                                }
                                z2 = false;
                                if (localFulfillmentType != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY) {
                                }
                                if (z) {
                                }
                                if (!z2) {
                                }
                            }
                        } else if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
                            FulfillmentConfiguration.Delivery delivery = (FulfillmentConfiguration.Delivery) fulfillmentConfiguration;
                            mutableState3.setValue(r2 != null ? new LocationToken(delivery.locationToken) : null);
                            mutableState5.setValue(Boolean.valueOf(delivery.deliveryDetails == null || delivery.deliveryFee == null));
                        } else if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
                            FulfillmentConfiguration.Pickup pickup = (FulfillmentConfiguration.Pickup) fulfillmentConfiguration;
                            mutableState3.setValue(r2 != null ? new LocationToken(pickup.locationToken) : null);
                            String models$lambda$94 = LocalBrandProfilePresenter.models$lambda$9(mutableState6);
                            models$lambda$94.getClass();
                            LocalBrand localBrand7 = (LocalBrand) mutableState7.getValue();
                            FulfillmentConfiguration.Pickup m1239copyhYjS5Xw$default = FulfillmentConfiguration.Pickup.m1239copyhYjS5Xw$default(pickup, (localBrand7 == null || (localEstimatedCompletionDuration = localBrand7.estimated_pickup_wait_time) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(localEstimatedCompletionDuration), null, 11);
                            this.this$0 = null;
                            this.label = 4;
                            break;
                        } else {
                            if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            mutableState3.setValue(r2 != null ? new LocationToken(((FulfillmentConfiguration.InStore) fulfillmentConfiguration).locationToken) : null);
                        }
                    }
                } else {
                    if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (TapToPayPresenter) obj6, this.$browseListingViewModel$delegate, (State) this.$heroTileHomeSection$delegate, this.$searchPlaceholder$delegate, (State) obj5, this.$activeBoostToken$delegate, (MutableState) obj4);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 poolDetailsPresenter$models$$inlined$CollectEffect$1$1 = new PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(coroutineScope2, (EarnerEnrollmentBlockerPresenter) this.$heroTileHomeSection$delegate, (String) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(poolDetailsPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons4) {
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
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                    BugReport bugReport = (BugReport) this.$browseListingViewModel$delegate.getValue();
                    String str2 = (String) this.$searchPlaceholder$delegate.getValue();
                    BugReportingViewEvent.Submit submit = (BugReportingViewEvent.Submit) ((BugReportingViewEvent) this.$heroTileHomeSection$delegate);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(19, mutableState3);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = new RealBrandFollowPresenter$models$2$1$1(20, (MutableState) obj4);
                    ButtonKt$Button$2.AnonymousClass1 anonymousClass1 = new ButtonKt$Button$2.AnonymousClass1(13, (MutableState) obj7, (MutableState) obj6);
                    this.label = 1;
                    if (LocalHomePresenter.access$submitBugReport(localHomePresenter, bugReport, str2, submit.deviceMetrics, submit.diagnosticContext, (RealBugReportSender) obj5, realBrandFollowPresenter$models$2$1$1, realBrandFollowPresenter$models$2$1$12, anonymousClass1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mapMovementFinished = (CashMapViewEvent.MapMovementFinished) mutableState3.getValue();
                    if (mapMovementFinished != null) {
                        PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter2 = (PaperMoneyDepositMapPresenter) obj5;
                        MutableState mutableState8 = (MutableState) obj4;
                        MutableState mutableState9 = (MutableState) obj7;
                        MutableState mutableState10 = (MutableState) obj6;
                        if (((LocationViewModel) mutableState8.getValue()) != null && !DeviceUtils.isDisplayingLocation(mapMovementFinished, (LocationViewModel) mutableState8.getValue())) {
                            mutableState8.setValue(null);
                        }
                        zzb zzbVar = paperMoneyDepositMapPresenter2.retailerLocationManager;
                        double d = mapMovementFinished.lat;
                        double d2 = mapMovementFinished.lng;
                        double d3 = mapMovementFinished.zoomRadiusInMeters;
                        this.this$0 = paperMoneyDepositMapPresenter2;
                        this.$browseListingViewModel$delegate = mutableState9;
                        this.$searchPlaceholder$delegate = mutableState10;
                        this.$heroTileHomeSection$delegate = mapMovementFinished;
                        this.label = 1;
                        retailers = zzbVar.getRetailers(d, d2, Math.min(Math.max(d3 * 6.21371E-4d, 0.1d), 25.0d), this);
                        if (retailers == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        paperMoneyDepositMapPresenter = paperMoneyDepositMapPresenter2;
                        mutableState = mutableState9;
                        mutableState2 = mutableState10;
                    }
                    return Unit.INSTANCE;
                }
                if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CashMapViewEvent.MapMovementFinished mapMovementFinished2 = (CashMapViewEvent.MapMovementFinished) this.$heroTileHomeSection$delegate;
                mutableState2 = this.$searchPlaceholder$delegate;
                mutableState = this.$browseListingViewModel$delegate;
                paperMoneyDepositMapPresenter = (PaperMoneyDepositMapPresenter) this.this$0;
                SafeTrace.throwOnFailure(obj);
                mapMovementFinished = mapMovementFinished2;
                retailers = obj;
                RetailerLocationResult retailerLocationResult = (RetailerLocationResult) retailers;
                if (retailerLocationResult instanceof RetailerLocationResult.Results) {
                    List list5 = ((RetailerLocationResult.Results) retailerLocationResult).locations;
                    List list6 = (List) mutableState.getValue();
                    paperMoneyDepositMapPresenter.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj8 : list5) {
                        GetRetailerLocationsResponse.DepositMethods depositMethods = ((GetRetailerLocationsResponse.RetailerLocation) obj8).deposit_methods;
                        if (depositMethods == null || ((list6.contains(PaperMoneyDepositMapViewModel.DepositMethodFilter.BarcodeScan) && Intrinsics.areEqual(depositMethods.scan, Boolean.TRUE)) || (list6.contains(PaperMoneyDepositMapViewModel.DepositMethodFilter.CardSwipe) && Intrinsics.areEqual(depositMethods.swipe, Boolean.TRUE)))) {
                            arrayList2.add(obj8);
                        }
                    }
                    mutableState2.setValue(new PaperMoneyDepositMapSectionViewModel$MapDataViewModel(arrayList2));
                    if (arrayList2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it7 = arrayList2.iterator();
                        i = 0;
                        while (it7.hasNext()) {
                            GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) it7.next();
                            MapBoundary mapBoundary = mapMovementFinished.boundary;
                            Double d4 = retailerLocation.latitude;
                            d4.getClass();
                            double doubleValue = d4.doubleValue();
                            Double d5 = retailerLocation.longitude;
                            d5.getClass();
                            if (mapBoundary.contains(doubleValue, d5.doubleValue()) && (i = i + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    }
                    paperMoneyDepositMapPresenter.analytics.track(new PaperMoneyDepositViewVisibleNearbyRetailers(new Integer(i)), null);
                } else {
                    AndroidStringManager androidStringManager = paperMoneyDepositMapPresenter.stringManager;
                    paperMoneyDepositMapPresenter.navigator.goTo(new PhysicalDepositErrorScreen(androidStringManager.get(R.string.retailer_error), androidStringManager.get(R.string.retailer_error_description), null, androidStringManager.get(R.string.retailer_error_button), null));
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$heroTileHomeSection$delegate;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$12 = new MerchantProfilePresenter$models$2$1$1(coroutineScope3, (MoleculePresenter) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7, (MutableState) obj6, 8);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(merchantProfilePresenter$models$2$1$12, this) == coroutineSingletons7) {
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
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$heroTileHomeSection$delegate;
                    PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 poolDetailsPresenter$models$$inlined$CollectEffect$1$12 = new PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(coroutineScope4, (MoneybotChatPresenter) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7, (MutableState) obj6, 3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(poolDetailsPresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$13 = new MerchantProfilePresenter$models$2$1$1(coroutineScope5, (BaseAllowlistSelectionPresenter) obj7, (CoroutineScope) obj6, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (ParcelableSnapshotMutableIntState) this.$heroTileHomeSection$delegate, (ParcelableSnapshotMutableIntState) obj5);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(merchantProfilePresenter$models$2$1$13, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$heroTileHomeSection$delegate;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$14 = new MerchantProfilePresenter$models$2$1$1(coroutineScope6, (MoleculePresenter) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7, (MutableState) obj6, 12);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(merchantProfilePresenter$models$2$1$14, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$heroTileHomeSection$delegate;
                    PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 poolDetailsPresenter$models$$inlined$CollectEffect$1$13 = new PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(coroutineScope7, (ProfilePresenter) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7, (MutableState) obj6, 0);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(poolDetailsPresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 poolDetailsPresenter$models$$inlined$CollectEffect$1$14 = new PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(coroutineScope8, (PaymentLoadingPresenter) this.$heroTileHomeSection$delegate, this.$browseListingViewModel$delegate, (String) obj5, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, (MutableState) obj7);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(poolDetailsPresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$15 = new MerchantProfilePresenter$models$2$1$1(coroutineScope9, (PoolsListPresenter) obj6, (AskedQuestion) this.$heroTileHomeSection$delegate, (CoroutineScope) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, 19);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(merchantProfilePresenter$models$2$1$15, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$16 = new MerchantProfilePresenter$models$2$1$1(coroutineScope10, (ShiftListPresenter) obj6, (ShiftDataLoader) this.$heroTileHomeSection$delegate, (LocalDate) obj5, this.$browseListingViewModel$delegate, this.$searchPlaceholder$delegate, this.$activeBoostToken$delegate, (MutableState) obj4, 20);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj7).collect(merchantProfilePresenter$models$2$1$16, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(MutableState mutableState, PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$activeBoostToken$delegate = mutableState;
        this.$infoTileFormattedDetail$delegate = paperMoneyDepositMapPresenter;
        this.$browseFlowToken$delegate = mutableState2;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState3;
        this.$browseStartEventSpec$delegate = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(FulfillmentConfiguration fulfillmentConfiguration, Continuation continuation, LocalBrandProfilePresenter localBrandProfilePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state, MutableState mutableState5) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$browseStartEventSpec$delegate = fulfillmentConfiguration;
        this.$heroTileHomeSection$delegate = localBrandProfilePresenter;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
        this.$infoTileFormattedDetail$delegate = state;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(OffersHomePresenter offersHomePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = offersHomePresenter;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState5;
        this.$browseStartEventSpec$delegate = mutableState6;
        this.$heroTileHomeSection$delegate = mutableState7;
        this.$infoTileFormattedDetail$delegate = mutableState8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$8$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$heroTileHomeSection$delegate = flow;
        this.$infoTileFormattedDetail$delegate = moleculePresenter;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState5;
        this.$browseStartEventSpec$delegate = mutableState6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$8$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$savedCLOClusterSectionViewModel$delegate = flow;
        this.$browseStartEventSpec$delegate = moleculePresenter;
        this.$heroTileHomeSection$delegate = obj;
        this.$infoTileFormattedDetail$delegate = obj2;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(Flow flow, Continuation continuation, EarnerEnrollmentBlockerPresenter earnerEnrollmentBlockerPresenter, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$browseStartEventSpec$delegate = flow;
        this.$heroTileHomeSection$delegate = earnerEnrollmentBlockerPresenter;
        this.$infoTileFormattedDetail$delegate = str;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(Flow flow, Continuation continuation, BaseAllowlistSelectionPresenter baseAllowlistSelectionPresenter, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$browseFlowToken$delegate = flow;
        this.$savedCLOClusterSectionViewModel$delegate = baseAllowlistSelectionPresenter;
        this.$browseStartEventSpec$delegate = coroutineScope;
        this.$browseListingViewModel$delegate = mutableState;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$heroTileHomeSection$delegate = parcelableSnapshotMutableIntState;
        this.$infoTileFormattedDetail$delegate = parcelableSnapshotMutableIntState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(Flow flow, Continuation continuation, PaymentLoadingPresenter paymentLoadingPresenter, MutableState mutableState, String str, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.$browseStartEventSpec$delegate = flow;
        this.$heroTileHomeSection$delegate = paymentLoadingPresenter;
        this.$browseListingViewModel$delegate = mutableState;
        this.$infoTileFormattedDetail$delegate = str;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
        this.$savedCLOClusterSectionViewModel$delegate = mutableState5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersHomePresenter$models$8$1(Flow flow, Continuation continuation, TapToPayPresenter tapToPayPresenter, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$savedCLOClusterSectionViewModel$delegate = flow;
        this.$browseStartEventSpec$delegate = tapToPayPresenter;
        this.$browseListingViewModel$delegate = mutableState;
        this.$heroTileHomeSection$delegate = state;
        this.$searchPlaceholder$delegate = mutableState2;
        this.$infoTileFormattedDetail$delegate = state2;
        this.$activeBoostToken$delegate = mutableState3;
        this.$browseFlowToken$delegate = mutableState4;
    }
}
