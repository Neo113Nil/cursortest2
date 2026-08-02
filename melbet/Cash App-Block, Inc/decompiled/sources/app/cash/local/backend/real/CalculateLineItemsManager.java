package app.cash.local.backend.real;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LineKt;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.core.internal.thread.ThreadExtKt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsRequest;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse$Response$Success;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CalculateLineItemsManager {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long debounceInterval;
    public final FeatureFlagManager featureFlagManager;
    public final Object lock = new Object();
    public final HashMap observationJobs = new HashMap();
    public final CoroutineScope scope;
    public final LocalService service;
    public final LocalInstalledStore store;

    public final class Combination {
        public final List discountCodes;
        public final FeatureFlag$EnabledDisabledFeatureFlag$Options flagEnablement;
        public final FulfillmentConfiguration fulfillmentConfiguration;
        public final List selections;

        public Combination(FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options, List list, List list2, FulfillmentConfiguration fulfillmentConfiguration) {
            featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
            list.getClass();
            list2.getClass();
            fulfillmentConfiguration.getClass();
            this.flagEnablement = featureFlag$EnabledDisabledFeatureFlag$Options;
            this.selections = list;
            this.discountCodes = list2;
            this.fulfillmentConfiguration = fulfillmentConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Combination)) {
                return false;
            }
            Combination combination = (Combination) obj;
            return this.flagEnablement == combination.flagEnablement && Intrinsics.areEqual(this.selections, combination.selections) && Intrinsics.areEqual(this.discountCodes, combination.discountCodes) && Intrinsics.areEqual(this.fulfillmentConfiguration, combination.fulfillmentConfiguration);
        }

        public final int hashCode() {
            return this.fulfillmentConfiguration.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.flagEnablement.hashCode() * 31, 31, this.selections), 31, this.discountCodes);
        }

        public final String toString() {
            return "Combination(flagEnablement=" + this.flagEnablement + ", selections=" + this.selections + ", discountCodes=" + this.discountCodes + ", fulfillmentConfiguration=" + this.fulfillmentConfiguration + ")";
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        debounceInterval = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
    }

    public CalculateLineItemsManager(FeatureFlagManager featureFlagManager, LocalService localService, LocalInstalledStore localInstalledStore, CoroutineScope coroutineScope) {
        this.featureFlagManager = featureFlagManager;
        this.service = localService;
        this.store = localInstalledStore;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00c2, code lost:
    
        if (r2 == r4) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0164 A[LOOP:0: B:13:0x015e->B:15:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b A[LOOP:1: B:24:0x0195->B:26:0x019b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$performRequest(CalculateLineItemsManager calculateLineItemsManager, BrandSpot brandSpot, List list, List list2, FulfillmentConfiguration fulfillmentConfiguration, ContinuationImpl continuationImpl) {
        CalculateLineItemsManager$performRequest$1 calculateLineItemsManager$performRequest$1;
        int i;
        FulfillmentConfiguration fulfillmentConfiguration2;
        ApiResult apiResult;
        CalculateLineItemsResponse.Success success;
        String mo1238getLocationTokenVSCKlZI;
        CalculateLineItemsResponse.Success success2;
        Iterator it;
        Iterator it2;
        BrandSpot brandSpot2 = brandSpot;
        if (continuationImpl instanceof CalculateLineItemsManager$performRequest$1) {
            calculateLineItemsManager$performRequest$1 = (CalculateLineItemsManager$performRequest$1) continuationImpl;
            int i2 = calculateLineItemsManager$performRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                calculateLineItemsManager$performRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = calculateLineItemsManager$performRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = calculateLineItemsManager$performRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        return CalculateLineItemsResult.NoSelections.INSTANCE;
                    }
                    LocalService localService = calculateLineItemsManager.service;
                    String str = brandSpot2.brandToken;
                    String str2 = brandSpot2.locationToken;
                    String str3 = str2 == null ? null : str2;
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(SelectionKt.toProtoSelection((Selection) it3.next()));
                    }
                    List list4 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((DiscountCode) it4.next()).getCode());
                    }
                    CalculateLineItemsRequest calculateLineItemsRequest = new CalculateLineItemsRequest(str, str3, arrayList, FulfillmentConfigurationKt.toProtoFulfillment(fulfillmentConfiguration), arrayList2, ByteString.EMPTY);
                    calculateLineItemsManager$performRequest$1.L$0 = brandSpot2;
                    fulfillmentConfiguration2 = fulfillmentConfiguration;
                    calculateLineItemsManager$performRequest$1.L$3 = fulfillmentConfiguration2;
                    calculateLineItemsManager$performRequest$1.label = 1;
                    obj = localService.calculateLineItems(calculateLineItemsRequest, calculateLineItemsManager$performRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        success2 = calculateLineItemsManager$performRequest$1.L$6;
                        SafeTrace.throwOnFailure(obj);
                        success = success2;
                        List list5 = success.lines;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(LineKt.toLine((LocalCart.Line) it.next()));
                        }
                        LocalMoney localMoney = success.lines_subtotal;
                        app.cash.local.primitives.LocalMoney money = localMoney == null ? LocalMoneyKt.toMoney(localMoney) : null;
                        LocalMoney localMoney2 = success.lines_subtotal_before_discounts;
                        app.cash.local.primitives.LocalMoney money2 = localMoney2 != null ? LocalMoneyKt.toMoney(localMoney2) : null;
                        List list6 = success.applied_discount_codes;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        it2 = list6.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(new DiscountCode.Entered((String) it2.next()));
                        }
                        return new CalculateLineItemsResult.RequestSuccess(arrayList3, money, money2, arrayList4, Intrinsics.areEqual(success.includes_preorder_items, Boolean.TRUE));
                    }
                    FulfillmentConfiguration fulfillmentConfiguration3 = calculateLineItemsManager$performRequest$1.L$3;
                    BrandSpot brandSpot3 = calculateLineItemsManager$performRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    fulfillmentConfiguration2 = fulfillmentConfiguration3;
                    brandSpot2 = brandSpot3;
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        return new CalculateLineItemsResult.RequestFailure();
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ThreadExtKt threadExtKt = ((CalculateLineItemsResponse) ((ApiResult.Success) apiResult).response).response;
                if (threadExtKt instanceof CalculateLineItemsResponse$Response$ErrorResponse) {
                    List list7 = ((CalculateLineItemsResponse$Response$ErrorResponse) threadExtKt).value.errors;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = list7.iterator();
                    while (it5.hasNext()) {
                        String str4 = ((LocalErrorResponse.Error) it5.next()).message;
                        if (str4 != null) {
                            arrayList5.add(str4);
                        }
                    }
                    return new CalculateLineItemsResult.RequestFailure(arrayList5);
                }
                if (!(threadExtKt instanceof CalculateLineItemsResponse$Response$Success)) {
                    if (threadExtKt == null) {
                        return new CalculateLineItemsResult.RequestFailure();
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                success = ((CalculateLineItemsResponse$Response$Success) threadExtKt).value;
                LocalFulfillment localFulfillment = success.fulfillment;
                if (localFulfillment != null && ((mo1238getLocationTokenVSCKlZI = fulfillmentConfiguration2.mo1238getLocationTokenVSCKlZI()) != null || (mo1238getLocationTokenVSCKlZI = brandSpot2.locationToken) != null)) {
                    Fulfillment fulfillment = FulfillmentKt.toFulfillment(localFulfillment);
                    FulfillmentConfiguration.Delivery asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration2);
                    FulfillmentConfiguration m1240toFulfillmentConfiguration6UYloQk = FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(fulfillment, mo1238getLocationTokenVSCKlZI, asDelivery != null ? asDelivery.deliveryFee : null);
                    if (!m1240toFulfillmentConfiguration6UYloQk.equals(fulfillmentConfiguration2) && !(m1240toFulfillmentConfiguration6UYloQk instanceof FulfillmentConfiguration.InStore)) {
                        LocalInstalledStore localInstalledStore = calculateLineItemsManager.store;
                        String str5 = brandSpot2.brandToken;
                        calculateLineItemsManager$performRequest$1.L$0 = null;
                        calculateLineItemsManager$performRequest$1.L$3 = null;
                        calculateLineItemsManager$performRequest$1.L$6 = success;
                        calculateLineItemsManager$performRequest$1.label = 2;
                        if (((RealLocalInstalledStore) localInstalledStore).m1289updateFulfillmentConfigurationNoPDS7c(str5, m1240toFulfillmentConfiguration6UYloQk, calculateLineItemsManager$performRequest$1) != coroutineSingletons) {
                            success2 = success;
                            success = success2;
                        }
                        return coroutineSingletons;
                    }
                }
                List list52 = success.lines;
                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                it = list52.iterator();
                while (it.hasNext()) {
                }
                LocalMoney localMoney3 = success.lines_subtotal;
                if (localMoney3 == null) {
                }
                LocalMoney localMoney22 = success.lines_subtotal_before_discounts;
                if (localMoney22 != null) {
                }
                List list62 = success.applied_discount_codes;
                ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10));
                it2 = list62.iterator();
                while (it2.hasNext()) {
                }
                return new CalculateLineItemsResult.RequestSuccess(arrayList32, money, money2, arrayList42, Intrinsics.areEqual(success.includes_preorder_items, Boolean.TRUE));
            }
        }
        calculateLineItemsManager$performRequest$1 = new CalculateLineItemsManager$performRequest$1(calculateLineItemsManager, continuationImpl);
        Object obj2 = calculateLineItemsManager$performRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = calculateLineItemsManager$performRequest$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public final void stopObserving(BrandSpot brandSpot) {
        Job job;
        brandSpot.getClass();
        synchronized (this.lock) {
            job = (Job) this.observationJobs.remove(brandSpot);
        }
        if (job != null) {
            job.cancel(null);
        }
    }

    public interface CalculateLineItemsResult {

        public final class FlagDisabled implements CalculateLineItemsResult {
            public static final FlagDisabled INSTANCE = new FlagDisabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FlagDisabled);
            }

            public final int hashCode() {
                return -705403449;
            }

            public final String toString() {
                return "FlagDisabled";
            }
        }

        public final class NoSelections implements CalculateLineItemsResult {
            public static final NoSelections INSTANCE = new NoSelections();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoSelections);
            }

            public final int hashCode() {
                return -1694883641;
            }

            public final String toString() {
                return "NoSelections";
            }
        }

        public final class RequestSuccess implements CalculateLineItemsResult {
            public final ArrayList appliedDiscountCodes;
            public final boolean includesPreorderItems;
            public final ArrayList lines;
            public final app.cash.local.primitives.LocalMoney subtotal;
            public final app.cash.local.primitives.LocalMoney subtotalBeforeDiscounts;

            public RequestSuccess(ArrayList arrayList, app.cash.local.primitives.LocalMoney localMoney, app.cash.local.primitives.LocalMoney localMoney2, ArrayList arrayList2, boolean z) {
                this.lines = arrayList;
                this.subtotal = localMoney;
                this.subtotalBeforeDiscounts = localMoney2;
                this.appliedDiscountCodes = arrayList2;
                this.includesPreorderItems = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestSuccess)) {
                    return false;
                }
                RequestSuccess requestSuccess = (RequestSuccess) obj;
                return this.lines.equals(requestSuccess.lines) && Intrinsics.areEqual(this.subtotal, requestSuccess.subtotal) && Intrinsics.areEqual(this.subtotalBeforeDiscounts, requestSuccess.subtotalBeforeDiscounts) && this.appliedDiscountCodes.equals(requestSuccess.appliedDiscountCodes) && this.includesPreorderItems == requestSuccess.includesPreorderItems;
            }

            public final int hashCode() {
                int hashCode = this.lines.hashCode() * 31;
                app.cash.local.primitives.LocalMoney localMoney = this.subtotal;
                int hashCode2 = (hashCode + (localMoney == null ? 0 : localMoney.hashCode())) * 31;
                app.cash.local.primitives.LocalMoney localMoney2 = this.subtotalBeforeDiscounts;
                return Boolean.hashCode(this.includesPreorderItems) + CameraState$Type$EnumUnboxingLocalUtility.m(this.appliedDiscountCodes, (hashCode2 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RequestSuccess(lines=");
                sb.append(this.lines);
                sb.append(", subtotal=");
                sb.append(this.subtotal);
                sb.append(", subtotalBeforeDiscounts=");
                sb.append(this.subtotalBeforeDiscounts);
                sb.append(", appliedDiscountCodes=");
                sb.append(this.appliedDiscountCodes);
                sb.append(", includesPreorderItems=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.includesPreorderItems, ")");
            }
        }

        public final class RequestFailure implements CalculateLineItemsResult {
            public final List messages;

            public RequestFailure(List list) {
                list.getClass();
                this.messages = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RequestFailure) && Intrinsics.areEqual(this.messages, ((RequestFailure) obj).messages);
            }

            public final int hashCode() {
                return this.messages.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("RequestFailure(messages=", ")", this.messages);
            }

            public RequestFailure() {
                this(EmptyList.INSTANCE);
            }
        }
    }
}
