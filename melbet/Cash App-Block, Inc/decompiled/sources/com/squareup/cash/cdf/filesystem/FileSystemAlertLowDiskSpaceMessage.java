package com.squareup.cash.cdf.filesystem;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class FileSystemAlertLowDiskSpaceMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Double disk_space;
    public final LinkedHashMap parameters;

    public FileSystemAlertLowDiskSpaceMessage(Double d) {
        this.disk_space = d;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "FileSystem", "cdf_action", "Alert");
        Countries.putSafe(m, "disk_space", d);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileSystemAlertLowDiskSpaceMessage) && this.disk_space.equals(((FileSystemAlertLowDiskSpaceMessage) obj).disk_space);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FileSystem Alert LowDiskSpaceMessage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.disk_space.hashCode();
    }

    public final String toString() {
        return "FileSystemAlertLowDiskSpaceMessage(disk_space=" + this.disk_space + ")";
    }
}
