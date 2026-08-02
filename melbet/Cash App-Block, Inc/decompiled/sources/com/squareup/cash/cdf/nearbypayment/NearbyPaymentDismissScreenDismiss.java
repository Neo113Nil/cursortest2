package com.squareup.cash.cdf.nearbypayment;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NearbyPaymentDismissScreenDismiss implements Event {
    public static final zzd Companion = new zzd(26);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final DismissScreen screen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class DismissScreen {
        public static final /* synthetic */ DismissScreen[] $VALUES;
        public static final DismissScreen DISCOVER_PAGE;
        public static final DismissScreen PAD_PAGE;
        public static final DismissScreen STILL_LOOKING;

        static {
            DismissScreen dismissScreen = new DismissScreen("DISCOVER_PAGE", 0);
            DISCOVER_PAGE = dismissScreen;
            DismissScreen dismissScreen2 = new DismissScreen("FOUND_PEOPLE", 1);
            DismissScreen dismissScreen3 = new DismissScreen("PAD_PAGE", 2);
            PAD_PAGE = dismissScreen3;
            DismissScreen dismissScreen4 = new DismissScreen("SELECT_PAYMENT_METHOD", 3);
            DismissScreen dismissScreen5 = new DismissScreen("PAYMENT_RECEIVED", 4);
            DismissScreen dismissScreen6 = new DismissScreen("STILL_LOOKING", 5);
            STILL_LOOKING = dismissScreen6;
            $VALUES = new DismissScreen[]{dismissScreen, dismissScreen2, dismissScreen3, dismissScreen4, dismissScreen5, dismissScreen6, new DismissScreen("NUX_SCREEN", 6), new DismissScreen("TURN_ON_BLUETOOTH", 7)};
        }

        public static DismissScreen valueOf(String str) {
            return (DismissScreen) Enum.valueOf(DismissScreen.class, str);
        }

        public static DismissScreen[] values() {
            return (DismissScreen[]) $VALUES.clone();
        }
    }

    public NearbyPaymentDismissScreenDismiss(DismissScreen dismissScreen, String str) {
        this.screen = dismissScreen;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NearbyPayment", "cdf_action", "Dismiss");
        Countries.putSafe(m, "screen", dismissScreen);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentDismissScreenDismiss)) {
            return false;
        }
        NearbyPaymentDismissScreenDismiss nearbyPaymentDismissScreenDismiss = (NearbyPaymentDismissScreenDismiss) obj;
        return this.screen == nearbyPaymentDismissScreenDismiss.screen && Intrinsics.areEqual(this.flow_token, nearbyPaymentDismissScreenDismiss.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment Dismiss ScreenDismiss";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.screen.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NearbyPaymentDismissScreenDismiss(screen=" + this.screen + ", flow_token=" + this.flow_token + ")";
    }
}
