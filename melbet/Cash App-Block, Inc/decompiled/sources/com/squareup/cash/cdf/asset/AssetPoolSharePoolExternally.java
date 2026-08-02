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
public final class AssetPoolSharePoolExternally implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String pool_token;
    public final ShareOption share_option_selected;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ShareOption {
        public static final /* synthetic */ ShareOption[] $VALUES;
        public static final ShareOption COPY_LINK;
        public static final ShareOption SHARE_SHEET;

        static {
            ShareOption shareOption = new ShareOption("COPY_LINK", 0);
            COPY_LINK = shareOption;
            ShareOption shareOption2 = new ShareOption("SHARE_SHEET", 1);
            SHARE_SHEET = shareOption2;
            $VALUES = new ShareOption[]{shareOption, shareOption2};
        }

        public static ShareOption valueOf(String str) {
            return (ShareOption) Enum.valueOf(ShareOption.class, str);
        }

        public static ShareOption[] values() {
            return (ShareOption[]) $VALUES.clone();
        }
    }

    public AssetPoolSharePoolExternally(String str, String str2, ShareOption shareOption) {
        this.pool_token = str;
        this.flow_token = str2;
        this.share_option_selected = shareOption;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "pool_token", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "share_option_selected", shareOption);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolSharePoolExternally)) {
            return false;
        }
        AssetPoolSharePoolExternally assetPoolSharePoolExternally = (AssetPoolSharePoolExternally) obj;
        return Intrinsics.areEqual(this.pool_token, assetPoolSharePoolExternally.pool_token) && Intrinsics.areEqual(this.flow_token, assetPoolSharePoolExternally.flow_token) && this.share_option_selected == assetPoolSharePoolExternally.share_option_selected;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool SharePoolExternally";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.pool_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.share_option_selected.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetPoolSharePoolExternally(pool_token=", this.pool_token, ", flow_token=", this.flow_token, ", share_option_selected=");
        m.append(this.share_option_selected);
        m.append(")");
        return m.toString();
    }
}
