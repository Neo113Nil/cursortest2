package app.cash.local.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocationToken;
import com.squareup.protos.cash.local.client.v1.LocalInStoreOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalRemoteOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BuyerIntentState {
    public final String brandToken;
    public final List errors;
    public final FulfillmentConfiguration fulfillmentConfiguration;
    public final LocalInStoreOrderingIntent inStoreOrdering;
    public final String intentToken;
    public final String locationToken;
    public final LocalRemoteOrderingIntent remoteOrdering;
    public final BuyerIntentScope scope;

    public BuyerIntentState(BuyerIntentScope buyerIntentScope, String str, String str2, String str3, LocalRemoteOrderingIntent localRemoteOrderingIntent, LocalInStoreOrderingIntent localInStoreOrderingIntent, List list, FulfillmentConfiguration fulfillmentConfiguration) {
        list.getClass();
        this.scope = buyerIntentScope;
        this.intentToken = str;
        this.brandToken = str2;
        this.locationToken = str3;
        this.remoteOrdering = localRemoteOrderingIntent;
        this.inStoreOrdering = localInStoreOrderingIntent;
        this.errors = list;
        this.fulfillmentConfiguration = fulfillmentConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof BuyerIntentState) {
                BuyerIntentState buyerIntentState = (BuyerIntentState) obj;
                if (this.scope.equals(buyerIntentState.scope) && this.intentToken.equals(buyerIntentState.intentToken) && this.brandToken.equals(buyerIntentState.brandToken)) {
                    String str = buyerIntentState.locationToken;
                    String str2 = this.locationToken;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && Intrinsics.areEqual(this.remoteOrdering, buyerIntentState.remoteOrdering) && Intrinsics.areEqual(this.inStoreOrdering, buyerIntentState.inStoreOrdering) && Intrinsics.areEqual(this.errors, buyerIntentState.errors) && Intrinsics.areEqual(this.fulfillmentConfiguration, buyerIntentState.fulfillmentConfiguration)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final LocalShoppingCart getShoppingCart() {
        LocalShoppingCart localShoppingCart;
        LocalRemoteOrderingIntent localRemoteOrderingIntent = this.remoteOrdering;
        if (localRemoteOrderingIntent != null && (localShoppingCart = localRemoteOrderingIntent.cart) != null) {
            return localShoppingCart;
        }
        LocalInStoreOrderingIntent localInStoreOrderingIntent = this.inStoreOrdering;
        if (localInStoreOrderingIntent != null) {
            return localInStoreOrderingIntent.cart;
        }
        return null;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.scope.hashCode() * 31, 31, this.intentToken), 31, this.brandToken);
        String str = this.locationToken;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        LocalRemoteOrderingIntent localRemoteOrderingIntent = this.remoteOrdering;
        int hashCode2 = (hashCode + (localRemoteOrderingIntent == null ? 0 : localRemoteOrderingIntent.hashCode())) * 31;
        LocalInStoreOrderingIntent localInStoreOrderingIntent = this.inStoreOrdering;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localInStoreOrderingIntent == null ? 0 : localInStoreOrderingIntent.hashCode())) * 31, 31, this.errors);
        FulfillmentConfiguration fulfillmentConfiguration = this.fulfillmentConfiguration;
        return m2 + (fulfillmentConfiguration != null ? fulfillmentConfiguration.hashCode() : 0);
    }

    public final String toString() {
        String m1229toStringimpl = BrandToken.m1229toStringimpl(this.brandToken);
        String str = this.locationToken;
        String m1252toStringimpl = str == null ? "null" : LocationToken.m1252toStringimpl(str);
        StringBuilder sb = new StringBuilder("BuyerIntentState(scope=");
        sb.append(this.scope);
        sb.append(", intentToken=");
        sb.append(this.intentToken);
        sb.append(", brandToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1229toStringimpl, ", locationToken=", m1252toStringimpl, ", remoteOrdering=");
        sb.append(this.remoteOrdering);
        sb.append(", inStoreOrdering=");
        sb.append(this.inStoreOrdering);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(", fulfillmentConfiguration=");
        sb.append(this.fulfillmentConfiguration);
        sb.append(")");
        return sb.toString();
    }
}
