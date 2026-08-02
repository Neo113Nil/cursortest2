package com.squareup.cash.cdf.storage;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StorageManageSignInComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final Integer activeSandboxCount;
    public final String associatedAccountToken;
    public final Long jvmHeapBytes;
    public final Long nativeHeapBytes;
    public final LinkedHashMap parameters;
    public final Long storageLinkId;
    public final StorageLinkType storageLinkType;
    public final Long usableSpaceBytes;

    public StorageManageSignInComplete(String str, Long l, Long l2, StorageLinkType storageLinkType, Long l3, Long l4, Integer num) {
        this.associatedAccountToken = str;
        this.jvmHeapBytes = l;
        this.nativeHeapBytes = l2;
        this.storageLinkType = storageLinkType;
        this.storageLinkId = l3;
        this.usableSpaceBytes = l4;
        this.activeSandboxCount = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Storage", "cdf_action", "Manage");
        Countries.putSafe(m, "associatedAccountToken", str);
        Countries.putSafe(m, "jvmHeapBytes", l);
        Countries.putSafe(m, "nativeHeapBytes", l2);
        Countries.putSafe(m, "storageLinkType", storageLinkType);
        Countries.putSafe(m, "storageLinkId", l3);
        Countries.putSafe(m, "usableSpaceBytes", l4);
        Countries.putSafe(m, "activeSandboxCount", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageManageSignInComplete)) {
            return false;
        }
        StorageManageSignInComplete storageManageSignInComplete = (StorageManageSignInComplete) obj;
        return Intrinsics.areEqual(this.associatedAccountToken, storageManageSignInComplete.associatedAccountToken) && this.jvmHeapBytes.equals(storageManageSignInComplete.jvmHeapBytes) && this.nativeHeapBytes.equals(storageManageSignInComplete.nativeHeapBytes) && this.storageLinkType == storageManageSignInComplete.storageLinkType && Intrinsics.areEqual(this.storageLinkId, storageManageSignInComplete.storageLinkId) && this.usableSpaceBytes.equals(storageManageSignInComplete.usableSpaceBytes) && this.activeSandboxCount.equals(storageManageSignInComplete.activeSandboxCount);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Storage Manage SignInComplete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.associatedAccountToken;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.nativeHeapBytes, ViewEvent$State$EnumUnboxingLocalUtility.m(this.jvmHeapBytes, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        StorageLinkType storageLinkType = this.storageLinkType;
        int hashCode = (m + (storageLinkType == null ? 0 : storageLinkType.hashCode())) * 31;
        Long l = this.storageLinkId;
        return this.activeSandboxCount.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.usableSpaceBytes, (hashCode + (l != null ? l.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.jvmHeapBytes, "StorageManageSignInComplete(associatedAccountToken=", this.associatedAccountToken, ", jvmHeapBytes=", ", nativeHeapBytes=");
        m.append(this.nativeHeapBytes);
        m.append(", storageLinkType=");
        m.append(this.storageLinkType);
        m.append(", storageLinkId=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.storageLinkId, ", usableSpaceBytes=", this.usableSpaceBytes, ", activeSandboxCount=");
        return NavAction$$ExternalSyntheticOutline0.m(m, this.activeSandboxCount, ")");
    }
}
