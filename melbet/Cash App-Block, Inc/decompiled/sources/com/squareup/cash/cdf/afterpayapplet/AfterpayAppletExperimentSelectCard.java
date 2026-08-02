package com.squareup.cash.cdf.afterpayapplet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AfterpayAppletExperimentSelectCard implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final Integer card_position;
    public final String experiment_id;
    public final LinkedHashMap parameters;
    public final AfterpayProduct product;
    public final String variation_id;

    public AfterpayAppletExperimentSelectCard(String str, AfterpayProduct afterpayProduct, String str2, String str3, Integer num) {
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.HOME;
        AfterpayAppletUXVersion afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
        this.afterpay_applet_flow_token = str;
        this.product = afterpayProduct;
        this.experiment_id = str2;
        this.variation_id = str3;
        this.card_position = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "AfterpayApplet", "cdf_action", "Experiment");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "from_screen", afterpayAppletScreen);
        Countries.putSafe(m, "ux_version", afterpayAppletUXVersion);
        Countries.putSafe(m, "product", afterpayProduct);
        Countries.putSafe(m, "experiment_id", str2);
        Countries.putSafe(m, "variation_id", str3);
        Countries.putSafe(m, "card_position", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletExperimentSelectCard)) {
            return false;
        }
        AfterpayAppletExperimentSelectCard afterpayAppletExperimentSelectCard = (AfterpayAppletExperimentSelectCard) obj;
        if (!Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletExperimentSelectCard.afterpay_applet_flow_token)) {
            return false;
        }
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.ENTRYPOINT;
        AfterpayAppletUXVersion afterpayAppletUXVersion = AfterpayAppletUXVersion.V1;
        return this.product == afterpayAppletExperimentSelectCard.product && Intrinsics.areEqual(this.experiment_id, afterpayAppletExperimentSelectCard.experiment_id) && Intrinsics.areEqual(this.variation_id, afterpayAppletExperimentSelectCard.variation_id) && this.card_position.equals(afterpayAppletExperimentSelectCard.card_position);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet Experiment SelectCard";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        int hashCode = (this.product.hashCode() + ((AfterpayAppletUXVersion.V3.hashCode() + ((AfterpayAppletScreen.HOME.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.experiment_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.variation_id;
        return this.card_position.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.HOME;
        AfterpayAppletUXVersion afterpayAppletUXVersion = AfterpayAppletUXVersion.V3;
        StringBuilder sb = new StringBuilder("AfterpayAppletExperimentSelectCard(afterpay_applet_flow_token=");
        sb.append(this.afterpay_applet_flow_token);
        sb.append(", from_screen=");
        sb.append(afterpayAppletScreen);
        sb.append(", ux_version=");
        sb.append(afterpayAppletUXVersion);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", experiment_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.experiment_id, ", variation_id=", this.variation_id, ", card_position=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.card_position, ")");
    }
}
