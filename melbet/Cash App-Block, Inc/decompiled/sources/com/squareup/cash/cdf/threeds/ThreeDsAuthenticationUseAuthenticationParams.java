package com.squareup.cash.cdf.threeds;

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
public final class ThreeDsAuthenticationUseAuthenticationParams implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source BLOCKER;
        public static final Source PRE_AUTH;

        static {
            Source source = new Source("PRE_AUTH", 0);
            PRE_AUTH = source;
            Source source2 = new Source("BLOCKER", 1);
            BLOCKER = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public ThreeDsAuthenticationUseAuthenticationParams(String str, Source source) {
        this.flow_token = str;
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ThreeDs", "cdf_action", "Authentication");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDsAuthenticationUseAuthenticationParams)) {
            return false;
        }
        ThreeDsAuthenticationUseAuthenticationParams threeDsAuthenticationUseAuthenticationParams = (ThreeDsAuthenticationUseAuthenticationParams) obj;
        return Intrinsics.areEqual(this.flow_token, threeDsAuthenticationUseAuthenticationParams.flow_token) && this.source == threeDsAuthenticationUseAuthenticationParams.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ThreeDs Authentication UseAuthenticationParams";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.source.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ThreeDsAuthenticationUseAuthenticationParams(flow_token=" + this.flow_token + ", source=" + this.source + ")";
    }
}
