package com.squareup.cash.cdf.asset;

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
public final class AssetPoolPoolHomeView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final MemberType member_type;
    public final LinkedHashMap parameters;
    public final String pool_token;
    public final ViewHomeSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MemberType {
        public static final /* synthetic */ MemberType[] $VALUES;
        public static final MemberType CONTRIBUTOR;
        public static final MemberType OWNER;

        static {
            MemberType memberType = new MemberType("OWNER", 0);
            OWNER = memberType;
            MemberType memberType2 = new MemberType("CONTRIBUTOR", 1);
            CONTRIBUTOR = memberType2;
            $VALUES = new MemberType[]{memberType, memberType2};
        }

        public static MemberType valueOf(String str) {
            return (MemberType) Enum.valueOf(MemberType.class, str);
        }

        public static MemberType[] values() {
            return (MemberType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ViewHomeSource {
        public static final /* synthetic */ ViewHomeSource[] $VALUES;
        public static final ViewHomeSource CREATION_FLOW;
        public static final ViewHomeSource MONEY_TAB;

        static {
            ViewHomeSource viewHomeSource = new ViewHomeSource("CREATION_FLOW", 0);
            CREATION_FLOW = viewHomeSource;
            ViewHomeSource viewHomeSource2 = new ViewHomeSource("MONEY_TAB", 1);
            MONEY_TAB = viewHomeSource2;
            $VALUES = new ViewHomeSource[]{viewHomeSource, viewHomeSource2, new ViewHomeSource("SMS", 2), new ViewHomeSource("EMAIL", 3), new ViewHomeSource("PUSH", 4), new ViewHomeSource("SHARE", 5), new ViewHomeSource("ENRICHED_RECEIPT", 6), new ViewHomeSource("ACTIVITY", 7)};
        }

        public static ViewHomeSource valueOf(String str) {
            return (ViewHomeSource) Enum.valueOf(ViewHomeSource.class, str);
        }

        public static ViewHomeSource[] values() {
            return (ViewHomeSource[]) $VALUES.clone();
        }
    }

    public AssetPoolPoolHomeView(String str, MemberType memberType, ViewHomeSource viewHomeSource, String str2) {
        this.pool_token = str;
        this.member_type = memberType;
        this.source = viewHomeSource;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "pool_token", str);
        Countries.putSafe(m, "member_type", memberType);
        Countries.putSafe(m, "source", viewHomeSource);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolPoolHomeView)) {
            return false;
        }
        AssetPoolPoolHomeView assetPoolPoolHomeView = (AssetPoolPoolHomeView) obj;
        return Intrinsics.areEqual(this.pool_token, assetPoolPoolHomeView.pool_token) && this.member_type == assetPoolPoolHomeView.member_type && this.source == assetPoolPoolHomeView.source && Intrinsics.areEqual(this.flow_token, assetPoolPoolHomeView.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolHomeView";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.pool_token;
        int hashCode = (this.member_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        ViewHomeSource viewHomeSource = this.source;
        int hashCode2 = (hashCode + (viewHomeSource == null ? 0 : viewHomeSource.hashCode())) * 31;
        String str2 = this.flow_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AssetPoolPoolHomeView(customer_token=null, pool_token=" + this.pool_token + ", member_type=" + this.member_type + ", source=" + this.source + ", flow_token=" + this.flow_token + ")";
    }
}
