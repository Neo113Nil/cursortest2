package app.cash.local.backend.real;

import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class RealBuyerIntentManager implements BuyerIntentManager {
    public final Object lock = new Object();
    public final LinkedHashMap states = new LinkedHashMap();
    public final LinkedHashMap fulfillmentConfigurations = new LinkedHashMap();

    public static MutableStateFlow getOrPutFulfillmentFlow(Map map, BuyerIntentScope buyerIntentScope) {
        Object obj = map.get(buyerIntentScope);
        if (obj == null) {
            obj = FlowKt.MutableStateFlow(null);
            map.put(buyerIntentScope, obj);
        }
        return (MutableStateFlow) obj;
    }

    public static MutableStateFlow getOrPutStateFlow(Map map, BuyerIntentScope buyerIntentScope) {
        Object obj = map.get(buyerIntentScope);
        if (obj == null) {
            obj = FlowKt.MutableStateFlow(null);
            map.put(buyerIntentScope, obj);
        }
        return (MutableStateFlow) obj;
    }

    public static boolean matches(BuyerIntentScope buyerIntentScope, BrandSpot brandSpot, BuyerIntentState buyerIntentState) {
        if (Intrinsics.areEqual(brandSpot, buyerIntentScope.brandSpot)) {
            return true;
        }
        return Intrinsics.areEqual(brandSpot, buyerIntentState != null ? buyerIntentState.scope.brandSpot : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BuyerIntentState toInitialBuyerIntentState(BuyerIntentScope buyerIntentScope, LocalBrand localBrand, FulfillmentConfiguration fulfillmentConfiguration) {
        String str;
        int ordinal;
        FulfillmentConfiguration fulfillmentConfiguration2;
        LocalLocationSummary localLocationSummary;
        BrandSpot brandSpot = buyerIntentScope.brandSpot;
        String str2 = localBrand.token;
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = brandSpot.brandToken;
        }
        String str3 = str2;
        str3.getClass();
        String str4 = brandSpot.locationToken;
        if (str4 == null) {
            LocalLocationDetail localLocationDetail = localBrand.selected_location;
            if (localLocationDetail != null && (localLocationSummary = localLocationDetail.summary) != null && (str4 = localLocationSummary.token) != null) {
                if (StringsKt.isBlank(str4)) {
                    str4 = null;
                }
            }
            str = null;
            BuyerIntentScope copy$default = BuyerIntentScope.copy$default(buyerIntentScope, new BrandSpot(str3, str));
            ordinal = buyerIntentScope.intentType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                FulfillmentConfiguration inStoreFulfillmentConfiguration = FulfillmentConfigurationKt.inStoreFulfillmentConfiguration(localBrand, buyerIntentScope.inStoreOrderingToken);
                if (inStoreFulfillmentConfiguration != null) {
                    fulfillmentConfiguration2 = inStoreFulfillmentConfiguration;
                    return new BuyerIntentState(copy$default, "", str3, str, null, null, EmptyList.INSTANCE, fulfillmentConfiguration2);
                }
            }
            fulfillmentConfiguration2 = fulfillmentConfiguration;
            return new BuyerIntentState(copy$default, "", str3, str, null, null, EmptyList.INSTANCE, fulfillmentConfiguration2);
        }
        str = str4;
        BuyerIntentScope copy$default2 = BuyerIntentScope.copy$default(buyerIntentScope, new BrandSpot(str3, str));
        ordinal = buyerIntentScope.intentType.ordinal();
        if (ordinal != 0) {
        }
        fulfillmentConfiguration2 = fulfillmentConfiguration;
        return new BuyerIntentState(copy$default2, "", str3, str, null, null, EmptyList.INSTANCE, fulfillmentConfiguration2);
    }

    public final BuyerIntentState current(BuyerIntentScope buyerIntentScope) {
        BuyerIntentState buyerIntentState;
        buyerIntentScope.getClass();
        synchronized (this.lock) {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.states.get(buyerIntentScope);
            buyerIntentState = mutableStateFlow != null ? (BuyerIntentState) ((StateFlowImpl) mutableStateFlow).getValue() : null;
        }
        return buyerIntentState;
    }

    public final BuyerIntentState currentForBrandSpot(BrandSpot brandSpot) {
        BuyerIntentState buyerIntentState;
        synchronized (this.lock) {
            Iterator it = this.states.entrySet().iterator();
            do {
                buyerIntentState = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                BuyerIntentScope buyerIntentScope = (BuyerIntentScope) entry.getKey();
                BuyerIntentState buyerIntentState2 = (BuyerIntentState) ((StateFlowImpl) ((MutableStateFlow) entry.getValue())).getValue();
                if (buyerIntentState2 != null && matches(buyerIntentScope, brandSpot, buyerIntentState2)) {
                    buyerIntentState = buyerIntentState2;
                }
            } while (buyerIntentState == null);
        }
        return buyerIntentState;
    }

    public final boolean hasActiveBrandSpot(BrandSpot brandSpot) {
        boolean z;
        brandSpot.getClass();
        synchronized (this.lock) {
            LinkedHashMap linkedHashMap = this.states;
            z = false;
            if (!linkedHashMap.isEmpty()) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    BuyerIntentScope buyerIntentScope = (BuyerIntentScope) entry.getKey();
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) ((MutableStateFlow) entry.getValue());
                    if (stateFlowImpl.getValue() != null && matches(buyerIntentScope, brandSpot, (BuyerIntentState) stateFlowImpl.getValue())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public final BuyerIntentState preserveActiveCartForBrandProfileResponse(BuyerIntentState buyerIntentState, BrandSpot brandSpot, BrandSpot brandSpot2) {
        LocalShoppingCart shoppingCart;
        LocalShoppingCart shoppingCart2;
        BuyerIntentState currentForBrandSpot = currentForBrandSpot(brandSpot2);
        return (!(currentForBrandSpot == null && (currentForBrandSpot = currentForBrandSpot(brandSpot)) == null) && currentForBrandSpot.scope.equals(buyerIntentState.scope) && currentForBrandSpot.intentToken.equals(buyerIntentState.intentToken) && (shoppingCart = currentForBrandSpot.getShoppingCart()) != null && !(shoppingCart.lines.isEmpty() && shoppingCart.applied_discount_codes.isEmpty()) && ((shoppingCart2 = buyerIntentState.getShoppingCart()) == null || (shoppingCart2.lines.isEmpty() && shoppingCart2.applied_discount_codes.isEmpty()))) ? currentForBrandSpot : buyerIntentState;
    }

    public final void retire(BuyerIntentScope buyerIntentScope) {
        synchronized (this.lock) {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.states.get(buyerIntentScope);
            if (mutableStateFlow != null) {
                ((StateFlowImpl) mutableStateFlow).setValue(null);
            }
            MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.fulfillmentConfigurations.get(buyerIntentScope);
            if (mutableStateFlow2 != null) {
                ((StateFlowImpl) mutableStateFlow2).setValue(null);
            }
        }
    }

    public final void retireBrandSpot(BrandSpot brandSpot) {
        brandSpot.getClass();
        synchronized (this.lock) {
            try {
                LinkedHashSet<BuyerIntentScope> linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = this.states;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (matches((BuyerIntentScope) entry.getKey(), brandSpot, (BuyerIntentState) ((StateFlowImpl) ((MutableStateFlow) entry.getValue())).getValue())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((BuyerIntentScope) it.next());
                }
                LinkedHashMap linkedHashMap3 = this.fulfillmentConfigurations;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    if (Intrinsics.areEqual(((BuyerIntentScope) entry2.getKey()).brandSpot, brandSpot)) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Iterator it2 = linkedHashMap4.keySet().iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add((BuyerIntentScope) it2.next());
                }
                for (BuyerIntentScope buyerIntentScope : linkedHashSet) {
                    MutableStateFlow mutableStateFlow = (MutableStateFlow) this.states.get(buyerIntentScope);
                    if (mutableStateFlow != null) {
                        ((StateFlowImpl) mutableStateFlow).setValue(null);
                    }
                    MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.fulfillmentConfigurations.get(buyerIntentScope);
                    if (mutableStateFlow2 != null) {
                        ((StateFlowImpl) mutableStateFlow2).setValue(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setBrandProfileState(BuyerIntentState buyerIntentState, BrandSpot brandSpot) {
        synchronized (this.lock) {
            ((StateFlowImpl) getOrPutStateFlow(this.states, buyerIntentState.scope)).updateState(null, buyerIntentState);
            ((StateFlowImpl) getOrPutFulfillmentFlow(this.fulfillmentConfigurations, buyerIntentState.scope)).setValue(buyerIntentState.fulfillmentConfiguration);
            if (!Intrinsics.areEqual(brandSpot, buyerIntentState.scope.brandSpot)) {
                BuyerIntentScope copy$default = BuyerIntentScope.copy$default(buyerIntentState.scope, brandSpot);
                ((StateFlowImpl) getOrPutStateFlow(this.states, copy$default)).updateState(null, buyerIntentState);
                ((StateFlowImpl) getOrPutFulfillmentFlow(this.fulfillmentConfigurations, copy$default)).setValue(buyerIntentState.fulfillmentConfiguration);
            }
        }
    }
}
