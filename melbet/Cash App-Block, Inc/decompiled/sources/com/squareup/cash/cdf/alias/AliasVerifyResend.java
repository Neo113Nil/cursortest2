package com.squareup.cash.cdf.alias;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AliasVerifyResend implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source TOP_LEVEL;

        /* JADX INFO: Fake field, exist only in values array */
        Source EF0;

        static {
            Source source = new Source("OVERFLOW_MENU", 0);
            Source source2 = new Source("TOP_LEVEL", 1);
            TOP_LEVEL = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public AliasVerifyResend(AliasType aliasType, String str, Source source) {
        this.alias_type = aliasType;
        this.flow_token = str;
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Alias", "cdf_action", "Verify");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasVerifyResend)) {
            return false;
        }
        AliasVerifyResend aliasVerifyResend = (AliasVerifyResend) obj;
        return this.alias_type == aliasVerifyResend.alias_type && Intrinsics.areEqual(this.flow_token, aliasVerifyResend.flow_token) && this.source == aliasVerifyResend.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Verify Resend";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.alias_type.hashCode() * 31;
        String str = this.flow_token;
        return this.source.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "AliasVerifyResend(alias_type=" + this.alias_type + ", flow_token=" + this.flow_token + ", source=" + this.source + ")";
    }
}
