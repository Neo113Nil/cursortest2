package com.squareup.cash.recipients.backend.real;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import app.cash.local.primitives.ModifierKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.protos.cash.cashcustomergateway.api.v1.Customer;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrand;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagRequest;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagResponse;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagResponse$Identity$Customer;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagResponse$Identity$LocalBrand;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagService;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.FindCustomersRequest;
import com.squareup.protos.franklin.app.FindCustomersResponse;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealRecipientFinder$findByCashtag$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ String $cashtagPrefill$inlined;
    public final /* synthetic */ String $cashtagSymbol$inlined;
    public int I$0;
    public long J$0;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public FlowCollector L$2;
    public int label;
    public final /* synthetic */ RealRecipientFinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecipientFinder$findByCashtag$$inlined$flatMapLatest$1(Continuation continuation, RealRecipientFinder realRecipientFinder, String str, String str2) {
        super(3, continuation);
        this.this$0 = realRecipientFinder;
        this.$cashtagPrefill$inlined = str;
        this.$cashtagSymbol$inlined = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealRecipientFinder$findByCashtag$$inlined$flatMapLatest$1 realRecipientFinder$findByCashtag$$inlined$flatMapLatest$1 = new RealRecipientFinder$findByCashtag$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$cashtagPrefill$inlined, this.$cashtagSymbol$inlined);
        realRecipientFinder$findByCashtag$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        realRecipientFinder$findByCashtag$$inlined$flatMapLatest$1.L$1 = obj2;
        return realRecipientFinder$findByCashtag$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x02a3, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r4, r54) != r3) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Flow appLockMonitor$special$$inlined$map$2;
        Object first;
        int i;
        Object findCustomers;
        FlowCollector flowCollector;
        long j;
        Object lookupCashtag;
        long j2;
        ApiResult apiResult;
        BlockState blockState;
        Recipient recipient;
        Boolean bool;
        String str;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Recipient recipient2;
        ApiResult apiResult2;
        FlowCollector flowCollector2 = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        RealRecipientFinder realRecipientFinder = this.this$0;
        String str2 = this.$cashtagPrefill$inlined;
        boolean z = false;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj2) {
                if (Intrinsics.areEqual(((Recipient) obj3).cashtag, str2)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Recipient.copy$default((Recipient) it.next()));
            }
            if (arrayList2.isEmpty()) {
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new RealAppConfigManager$cashLiteConfig$$inlined$map$1(((RealAppConfigManager) realRecipientFinder.appConfig).instrumentLinkingConfig(), 12), 1);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = flowCollector2;
                this.I$0 = 0;
                this.label = 1;
                first = FlowKt.first(take, this);
                if (first != coroutineSingletons) {
                    i = 0;
                }
                return coroutineSingletons;
            }
            appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(CollectionsKt.first((List) arrayList2), 19);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
        } else if (i2 == 1) {
            int i3 = this.I$0;
            FlowCollector flowCollector3 = this.L$2;
            SafeTrace.throwOnFailure(obj);
            i = i3;
            flowCollector2 = flowCollector3;
            first = obj;
        } else if (i2 == 2) {
            long j3 = this.J$0;
            flowCollector = this.L$2;
            SafeTrace.throwOnFailure(obj);
            j2 = j3;
            lookupCashtag = obj;
            apiResult = (ApiResult) lookupCashtag;
            if (apiResult instanceof ApiResult.Success) {
                Timber.Forest.d("Error looking up cashtag", new Object[0]);
                flowCollector2 = flowCollector;
                recipient2 = null;
                if (recipient2 != null) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            } else {
                LookupCashtagResponse lookupCashtagResponse = (LookupCashtagResponse) ((ApiResult.Success) apiResult).response;
                ModifierKt modifierKt = lookupCashtagResponse.identity;
                LookupCashtagResponse.MatchType matchType = lookupCashtagResponse.match_type;
                LookupCashtagResponse$Identity$Customer lookupCashtagResponse$Identity$Customer = modifierKt instanceof LookupCashtagResponse$Identity$Customer ? (LookupCashtagResponse$Identity$Customer) modifierKt : null;
                Customer customer = lookupCashtagResponse$Identity$Customer != null ? lookupCashtagResponse$Identity$Customer.value : null;
                LookupCashtagResponse$Identity$LocalBrand lookupCashtagResponse$Identity$LocalBrand = modifierKt instanceof LookupCashtagResponse$Identity$LocalBrand ? (LookupCashtagResponse$Identity$LocalBrand) modifierKt : null;
                LocalBrand localBrand = lookupCashtagResponse$Identity$LocalBrand != null ? lookupCashtagResponse$Identity$LocalBrand.value : null;
                Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                if (matchType != LookupCashtagResponse.MatchType.MATCH_TYPE_CUSTOMER) {
                    customer = null;
                }
                LocalBrand localBrand2 = matchType == LookupCashtagResponse.MatchType.MATCH_TYPE_LOCAL_BRAND ? localBrand : null;
                String str3 = customer != null ? customer.token : null;
                String str4 = customer != null ? customer.cashtag : null;
                boolean booleanValue = (customer == null || (bool4 = customer.is_cash_customer) == null) ? false : bool4.booleanValue();
                boolean booleanValue2 = (customer == null || (bool3 = customer.is_verified_account) == null) ? false : bool3.booleanValue();
                boolean booleanValue3 = (customer == null || (bool2 = customer.is_business) == null) ? false : bool2.booleanValue();
                String str5 = customer != null ? customer.email_address : null;
                String str6 = customer != null ? customer.sms_number : null;
                Image image = (customer == null || (str = customer.photo_url) == null) ? null : new Image(str, str, 4);
                String str7 = customer != null ? customer.full_name : null;
                String str8 = customer != null ? customer.email_address : null;
                String str9 = customer != null ? customer.sms_number : null;
                if (customer != null && (bool = customer.can_accept_payments) != null) {
                    z = bool.booleanValue();
                }
                boolean z2 = z;
                if (customer == null || (blockState = customer.block_state) == null) {
                    blockState = BlockState.NOT_BLOCKED;
                }
                recipient = new Recipient(null, true, false, str3, null, str4, booleanValue, booleanValue2, booleanValue3, str5, str6, image, str8, str9, z2, j2, blockState, null, true, null, null, customer != null ? customer.region : null, null, null, str7, null, null, null, false, null, false, false, customer != null ? customer.render_data : null, localBrand2, -321257467, 23);
                flowCollector2 = flowCollector;
                recipient2 = recipient;
                if (recipient2 != null) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            }
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = this.J$0;
            flowCollector = this.L$2;
            SafeTrace.throwOnFailure(obj);
            j = j4;
            findCustomers = obj;
            apiResult2 = (ApiResult) findCustomers;
            if (apiResult2 instanceof ApiResult.Success) {
                Timber.Forest.d("Error looking up cashtag", new Object[0]);
            } else {
                FindCustomersResponse findCustomersResponse = (FindCustomersResponse) ((ApiResult.Success) apiResult2).response;
                UiCustomer uiCustomer = findCustomersResponse.status == FindCustomersResponse.Status.SUCCESS ? findCustomersResponse.exact_match : null;
                if (uiCustomer != null) {
                    Parcelable.Creator<Recipient> creator2 = Recipient.CREATOR;
                    recipient = zza.create$default(uiCustomer, j, false, false, null, 60);
                    flowCollector2 = flowCollector;
                    recipient2 = recipient;
                    appLockMonitor$special$$inlined$map$2 = recipient2 != null ? new AppLockMonitor$special$$inlined$map$2(recipient2, 19) : EmptyFlow.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
            }
            flowCollector2 = flowCollector;
            recipient2 = null;
            if (recipient2 != null) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
        }
        long longValue = ((Number) first).longValue();
        if (Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) realRecipientFinder.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting.INSTANCE)).value, "CASHTAG_RESOLUTION_ENDPOINT_REROUTING")) {
            LookupCashtagService lookupCashtagService = realRecipientFinder.lookupCashtagService;
            LookupCashtagRequest lookupCashtagRequest = new LookupCashtagRequest(str2, ByteString.EMPTY);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = flowCollector2;
            this.I$0 = i;
            this.J$0 = longValue;
            this.label = 2;
            lookupCashtag = lookupCashtagService.lookupCashtag(lookupCashtagRequest, this);
            if (lookupCashtag != coroutineSingletons) {
                flowCollector = flowCollector2;
                j2 = longValue;
                apiResult = (ApiResult) lookupCashtag;
                if (apiResult instanceof ApiResult.Success) {
                }
            }
        } else {
            AppService appService = realRecipientFinder.appService;
            FindCustomersRequest findCustomersRequest = new FindCustomersRequest(Recorder$$ExternalSyntheticOutline2.m$1(this.$cashtagSymbol$inlined, str2), ByteString.EMPTY);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = flowCollector2;
            this.I$0 = i;
            this.J$0 = longValue;
            this.label = 3;
            findCustomers = appService.findCustomers(findCustomersRequest, this);
            if (findCustomers != coroutineSingletons) {
                flowCollector = flowCollector2;
                j = longValue;
                apiResult2 = (ApiResult) findCustomers;
                if (apiResult2 instanceof ApiResult.Success) {
                }
                flowCollector2 = flowCollector;
                recipient2 = null;
                if (recipient2 != null) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            }
        }
        return coroutineSingletons;
    }
}
