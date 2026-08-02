package com.squareup.cash.cdf.asset;

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
public final class AssetPoolPoolHomeViewExit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final MemberType member_type;
    public final LinkedHashMap parameters;
    public final String pool_token;

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

    public AssetPoolPoolHomeViewExit(MemberType memberType, String str, String str2) {
        this.member_type = memberType;
        this.flow_token = str;
        this.pool_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "member_type", memberType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "pool_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolPoolHomeViewExit)) {
            return false;
        }
        AssetPoolPoolHomeViewExit assetPoolPoolHomeViewExit = (AssetPoolPoolHomeViewExit) obj;
        return this.member_type == assetPoolPoolHomeViewExit.member_type && Intrinsics.areEqual(this.flow_token, assetPoolPoolHomeViewExit.flow_token) && Intrinsics.areEqual(this.pool_token, assetPoolPoolHomeViewExit.pool_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolHomeViewExit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        MemberType memberType = this.member_type;
        int hashCode = (memberType == null ? 0 : memberType.hashCode()) * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pool_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetPoolPoolHomeViewExit(member_type=");
        sb.append(this.member_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", pool_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.pool_token, ")");
    }
}
