package com.squareup.cash.cdf.localclient;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LocalClientBannerInteraction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BannerLocation banner_location;
    public final BannerType banner_type;
    public final String brand_token;
    public final InteractionType interaction_type;
    public final String location_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class InteractionType {
        public static final /* synthetic */ InteractionType[] $VALUES;
        public static final InteractionType Action;
        public static final InteractionType Dismiss;
        public static final InteractionType Toggle;

        static {
            InteractionType interactionType = new InteractionType("Action", 0);
            Action = interactionType;
            InteractionType interactionType2 = new InteractionType("Toggle", 1);
            Toggle = interactionType2;
            InteractionType interactionType3 = new InteractionType("Dismiss", 2);
            Dismiss = interactionType3;
            $VALUES = new InteractionType[]{interactionType, interactionType2, interactionType3};
        }

        public static InteractionType valueOf(String str) {
            return (InteractionType) Enum.valueOf(InteractionType.class, str);
        }

        public static InteractionType[] values() {
            return (InteractionType[]) $VALUES.clone();
        }
    }

    public LocalClientBannerInteraction(String str, String str2, BannerLocation bannerLocation, BannerType bannerType, InteractionType interactionType) {
        this.brand_token = str;
        this.location_token = str2;
        this.banner_location = bannerLocation;
        this.banner_type = bannerType;
        this.interaction_type = interactionType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "LocalClient", "cdf_action", "Banner");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "location_token", str2);
        Countries.putSafe(m, "banner_location", bannerLocation);
        Countries.putSafe(m, "banner_type", bannerType);
        Countries.putSafe(m, "interaction_type", interactionType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientBannerInteraction)) {
            return false;
        }
        LocalClientBannerInteraction localClientBannerInteraction = (LocalClientBannerInteraction) obj;
        return Intrinsics.areEqual(this.brand_token, localClientBannerInteraction.brand_token) && Intrinsics.areEqual(this.location_token, localClientBannerInteraction.location_token) && this.banner_location == localClientBannerInteraction.banner_location && this.banner_type == localClientBannerInteraction.banner_type && this.interaction_type == localClientBannerInteraction.interaction_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Banner Interaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location_token;
        return this.interaction_type.hashCode() + ((this.banner_type.hashCode() + ((this.banner_location.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientBannerInteraction(brand_token=", this.brand_token, ", location_token=", this.location_token, ", banner_location=");
        m.append(this.banner_location);
        m.append(", banner_type=");
        m.append(this.banner_type);
        m.append(", interaction_type=");
        m.append(this.interaction_type);
        m.append(")");
        return m.toString();
    }
}
