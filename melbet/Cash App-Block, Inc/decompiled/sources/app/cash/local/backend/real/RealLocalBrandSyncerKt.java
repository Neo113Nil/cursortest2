package app.cash.local.backend.real;

import app.cash.local.primitives.BrandSpot;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.protos.cash.local.client.v1.Feature;
import com.squareup.protos.cash.local.client.v1.FeatureSet;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class RealLocalBrandSyncerKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String access$anonymousUserAppTokenOrNull(SessionManager sessionManager) {
        SessionState currentSessionState = PlatformKt.getCurrentSessionState(sessionManager);
        if (!(currentSessionState instanceof SessionState.Authenticated) && !(currentSessionState instanceof SwitchingState)) {
            if (currentSessionState instanceof SessionState.Initiated) {
                return ((SessionState.Initiated) currentSessionState).getAppToken();
            }
            if (currentSessionState instanceof NotInitiatedState) {
                return ((NotInitiatedState) currentSessionState).appToken;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
        return null;
    }

    public static final boolean access$userIntentEnabled(LocalBrand localBrand) {
        Map<String, Feature> map;
        Feature feature;
        FeatureSet featureSet = localBrand.feature_set;
        if (featureSet == null || (map = featureSet.features) == null || (feature = map.get("user_intent_enabled")) == null) {
            return false;
        }
        return Intrinsics.areEqual(feature.enabled, Boolean.TRUE);
    }

    public static final String access$userIntentFallbackLinkContext(BrandSpot brandSpot, LocalFulfillmentType localFulfillmentType) {
        String str;
        String str2 = brandSpot.brandToken;
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        if (str2 != null && (str = brandSpot.locationToken) != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()];
                String str3 = i != 1 ? i != 2 ? i != 3 ? null : "in-store" : "pickup" : "delivery";
                if (str3 != null) {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("https://cash.app/l/", str2, "/p/", str, "/");
                    m.append(str3);
                    return m.toString();
                }
            }
        }
        return null;
    }

    public static final LocalFulfillmentType defaultRemoteOrderingFulfillmentType(LocalBrand localBrand) {
        LocalBrand.FulfillmentSelection fulfillmentSelection = localBrand.fulfillment_selection;
        List list = fulfillmentSelection != null ? fulfillmentSelection.available_fulfillment_types : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        LocalFulfillmentType localFulfillmentType = fulfillmentSelection != null ? fulfillmentSelection.previous_fulfillment_method_used : null;
        LocalFulfillmentType localFulfillmentType2 = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY;
        if (localFulfillmentType != localFulfillmentType2 || !list.contains(localFulfillmentType2)) {
            LocalFulfillmentType localFulfillmentType3 = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
            if (list.contains(localFulfillmentType3) || !list.contains(localFulfillmentType2)) {
                return localFulfillmentType3;
            }
        }
        return localFulfillmentType2;
    }
}
