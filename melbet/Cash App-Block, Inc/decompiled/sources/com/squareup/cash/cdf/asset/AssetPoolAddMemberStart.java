package com.squareup.cash.cdf.asset;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AssetPoolAddMemberStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean contacts_synced;
    public final String flow_token;
    public final Integer number_of_contacts_displayed;
    public final LinkedHashMap parameters;
    public final String pool_token;
    public final AddMemberSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AddMemberSource {
        public static final /* synthetic */ AddMemberSource[] $VALUES;
        public static final AddMemberSource MEMBER_LIST;
        public static final AddMemberSource POOL_HOME;

        static {
            AddMemberSource addMemberSource = new AddMemberSource("MEMBER_LIST", 0);
            MEMBER_LIST = addMemberSource;
            AddMemberSource addMemberSource2 = new AddMemberSource("POOL_HOME", 1);
            POOL_HOME = addMemberSource2;
            $VALUES = new AddMemberSource[]{addMemberSource, addMemberSource2, new AddMemberSource("SHARE_POOL_SHEET", 2)};
        }

        public static AddMemberSource valueOf(String str) {
            return (AddMemberSource) Enum.valueOf(AddMemberSource.class, str);
        }

        public static AddMemberSource[] values() {
            return (AddMemberSource[]) $VALUES.clone();
        }
    }

    public AssetPoolAddMemberStart(String str, Boolean bool, Integer num, AddMemberSource addMemberSource, String str2) {
        this.pool_token = str;
        this.contacts_synced = bool;
        this.number_of_contacts_displayed = num;
        this.source = addMemberSource;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "pool_token", str);
        Countries.putSafe(m, "contacts_synced", bool);
        Countries.putSafe(m, "number_of_contacts_displayed", num);
        Countries.putSafe(m, "source", addMemberSource);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolAddMemberStart)) {
            return false;
        }
        AssetPoolAddMemberStart assetPoolAddMemberStart = (AssetPoolAddMemberStart) obj;
        return this.pool_token.equals(assetPoolAddMemberStart.pool_token) && this.contacts_synced.equals(assetPoolAddMemberStart.contacts_synced) && this.number_of_contacts_displayed.equals(assetPoolAddMemberStart.number_of_contacts_displayed) && this.source == assetPoolAddMemberStart.source && this.flow_token.equals(assetPoolAddMemberStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool AddMemberStart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + ((this.source.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.contacts_synced, this.pool_token.hashCode() * 31, 31), 31, this.number_of_contacts_displayed)) * 31);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.contacts_synced, "AssetPoolAddMemberStart(customer_token=null, pool_token=", this.pool_token, ", contacts_synced=", ", number_of_contacts_displayed=");
        m.append(this.number_of_contacts_displayed);
        m.append(", source=");
        m.append(this.source);
        m.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flow_token, ")");
    }
}
