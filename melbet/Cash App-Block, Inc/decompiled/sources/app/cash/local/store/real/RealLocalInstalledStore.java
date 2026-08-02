package app.cash.local.store.real;

import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import app.cash.local.db.LocalBrandCollectionQueries$selectContent$2;
import app.cash.local.db.LocalCashDetailContentQueries$$ExternalSyntheticLambda0;
import app.cash.local.db.LocalCashDetailContentQueries$selectActivity$2;
import app.cash.local.db.LocalFulfillmentConfigurationQueries;
import app.cash.local.db.LocalMarketScreenQueries$selectScreen$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.LocalTabContentQueries$selectContent$2;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.primitives.EstimatedCompletionDurationKt;
import app.cash.local.primitives.EstimatedCompletionTimeKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class RealLocalInstalledStore implements LocalInstalledStore {
    public final FlowQuery$mapToList$$inlined$map$1 brandCollections;
    public final LocalTabContentQueries cashDetailContentQueries;
    public final AndroidClock clock;
    public final LocalFulfillmentConfigurationQueries fulfillmentConfigurationQueries;
    public final CoroutineContext ioDispatcher;
    public final LocalTabContentQueries localBrandCollectionQueries;
    public final LocalTabContentQueries localTabContentQueries;
    public final FlowQuery$mapToList$$inlined$map$1 localTabContents;
    public final LocalTabContentQueries marketScreenQueries;
    public final RealProfileManager profileManager;
    public final FlowQuery$mapToList$$inlined$map$1 screens;
    public final SyncValueReader syncValueReader;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocalFulfillment.SchedulingDetails.SchedulingMode.values().length];
            try {
                iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalFulfillmentType.values().length];
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealLocalInstalledStore(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, SyncValueReader syncValueReader, CoroutineContext coroutineContext, RealProfileManager realProfileManager) {
        this.clock = androidClock;
        this.syncValueReader = syncValueReader;
        this.ioDispatcher = coroutineContext;
        this.profileManager = realProfileManager;
        LocalTabContentQueries localTabContentQueries = cashAccountDatabaseImpl.localMarketScreenQueries;
        this.marketScreenQueries = localTabContentQueries;
        LocalTabContentQueries localTabContentQueries2 = cashAccountDatabaseImpl.localTabContentQueries;
        this.localTabContentQueries = localTabContentQueries2;
        LocalTabContentQueries localTabContentQueries3 = cashAccountDatabaseImpl.localBrandCollectionQueries;
        this.localBrandCollectionQueries = localTabContentQueries3;
        this.cashDetailContentQueries = cashAccountDatabaseImpl.localCashDetailContentQueries;
        this.fulfillmentConfigurationQueries = cashAccountDatabaseImpl.localFulfillmentConfigurationQueries;
        localTabContentQueries.getClass();
        int i = LocalMarketScreenQueries$selectScreen$2.$r8$clinit;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0 = new CachedPageEventFlow$$ExternalSyntheticLambda0(localTabContentQueries, (char) 0);
        sqlDriver.getClass();
        this.screens = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(2100533118, new String[]{"local_market_screen"}, sqlDriver, "localMarketScreen.sq", "selectScreen", "SELECT tiles, expires_at\nFROM local_market_screen", cachedPageEventFlow$$ExternalSyntheticLambda0)), coroutineContext);
        localTabContentQueries2.getClass();
        int i2 = LocalTabContentQueries$selectContent$2.$r8$clinit;
        SqlDriver sqlDriver2 = localTabContentQueries2.driver;
        CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda02 = new CachedPageEventFlow$$ExternalSyntheticLambda0(localTabContentQueries2);
        sqlDriver2.getClass();
        this.localTabContents = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-1173038133, new String[]{"local_tab_content"}, sqlDriver2, "localTabContent.sq", "selectContent", "SELECT response\nFROM local_tab_content", cachedPageEventFlow$$ExternalSyntheticLambda02)), coroutineContext);
        localTabContentQueries3.getClass();
        int i3 = LocalBrandCollectionQueries$selectContent$2.$r8$clinit;
        SqlDriver sqlDriver3 = localTabContentQueries3.driver;
        CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda03 = new CachedPageEventFlow$$ExternalSyntheticLambda0(localTabContentQueries3, (byte) (0 == true ? 1 : 0));
        sqlDriver3.getClass();
        this.brandCollections = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-319576438, new String[]{"local_brand_collection"}, sqlDriver3, "localBrandCollection.sq", "selectContent", "SELECT response\nFROM local_brand_collection", cachedPageEventFlow$$ExternalSyntheticLambda03)), coroutineContext);
    }

    public static final boolean access$isExpired(RealLocalInstalledStore realLocalInstalledStore, LocalFulfillment localFulfillment) {
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime;
        realLocalInstalledStore.getClass();
        Long l = (localFulfillment == null || (estimatedCompletionTime = localFulfillment.estimated_completion_time) == null) ? null : estimatedCompletionTime.latest;
        return l != null && DimensionKt.now(realLocalInstalledStore.clock).isAfter(Instant.ofEpochMilli(l.longValue()));
    }

    public static final FulfillmentConfiguration access$toFulfillmentConfiguration(RealLocalInstalledStore realLocalInstalledStore, LocalFulfillment localFulfillment, String str, LocalFulfillmentType localFulfillmentType, LocalMoney localMoney) {
        LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration;
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime;
        LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration2;
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime2;
        LocalFulfillment.InStoreDetails inStoreDetails;
        realLocalInstalledStore.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()]) {
            case 1:
                if (str != null) {
                    return new FulfillmentConfiguration.Pickup(str, (localFulfillment == null || (estimatedCompletionTime = localFulfillment.estimated_completion_time) == null) ? null : EstimatedCompletionTimeKt.toEstimatedCompletionTime(estimatedCompletionTime), (localFulfillment == null || (estimatedCompletionDuration = localFulfillment.estimated_completion_duration) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(estimatedCompletionDuration), localFulfillment != null ? localFulfillment.scheduling_details : null);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Location token expected for pickup!");
                return null;
            case 2:
                return new FulfillmentConfiguration.Delivery(str != null ? str : null, (localFulfillment == null || (estimatedCompletionTime2 = localFulfillment.estimated_completion_time) == null) ? null : EstimatedCompletionTimeKt.toEstimatedCompletionTime(estimatedCompletionTime2), (localFulfillment == null || (estimatedCompletionDuration2 = localFulfillment.estimated_completion_duration) == null) ? null : EstimatedCompletionDurationKt.toEstimatedCompletionDuration(estimatedCompletionDuration2), localFulfillment != null ? localFulfillment.scheduling_details : null, localFulfillment != null ? localFulfillment.delivery_details : null, localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null);
            case 3:
                if (str == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Location token expected for in-store!");
                    return null;
                }
                if (localFulfillment == null || (inStoreDetails = localFulfillment.in_store_details) == null) {
                    inStoreDetails = new LocalFulfillment.InStoreDetails(null, null, null, 7, null);
                }
                return new FulfillmentConfiguration.InStore(str, inStoreDetails);
            case 4:
            case 5:
            case 6:
                return FulfillmentConfiguration.Unspecified.INSTANCE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    /* renamed from: clearFulfillmentConfiguration-NmdeRlM, reason: not valid java name */
    public final Object m1287clearFulfillmentConfigurationNmdeRlM(String str, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealLocalInstalledStore$clearFulfillmentConfiguration$2(this, str, null, 0), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* renamed from: clearScheduledFulfillmentConfiguration-NmdeRlM, reason: not valid java name */
    public final Object m1288clearScheduledFulfillmentConfigurationNmdeRlM(String str, SuspendLambda suspendLambda) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealLocalInstalledStore$clearFulfillmentConfiguration$2(this, str, null, 1), suspendLambda);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final RealCustomerStore$getCustomerForId$$inlined$map$1 selectLocalCashActivity() {
        LocalTabContentQueries localTabContentQueries = this.cashDetailContentQueries;
        localTabContentQueries.getClass();
        int i = LocalCashDetailContentQueries$selectActivity$2.$r8$clinit;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        LocalCashDetailContentQueries$$ExternalSyntheticLambda0 localCashDetailContentQueries$$ExternalSyntheticLambda0 = new LocalCashDetailContentQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0);
        sqlDriver.getClass();
        return new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-1344596978, new String[]{"local_cash_detail_content"}, sqlDriver, "localCashDetailContent.sq", "selectActivity", "SELECT activity\nFROM local_cash_detail_content", localCashDetailContentQueries$$ExternalSyntheticLambda0)), this.ioDispatcher), 1);
    }

    /* renamed from: updateFulfillmentConfiguration-NoPDS7c, reason: not valid java name */
    public final Object m1289updateFulfillmentConfigurationNoPDS7c(String str, FulfillmentConfiguration fulfillmentConfiguration, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealLocalInstalledStore$updateFulfillmentConfiguration$2(this, str, fulfillmentConfiguration, null), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* renamed from: updateFulfillmentConfigurations-NoPDS7c, reason: not valid java name */
    public final Object m1290updateFulfillmentConfigurationsNoPDS7c(String str, FulfillmentConfigurations fulfillmentConfigurations, SuspendLambda suspendLambda) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealLocalInstalledStore$updateFulfillmentConfigurations$2(this, str, fulfillmentConfigurations, null), suspendLambda);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
