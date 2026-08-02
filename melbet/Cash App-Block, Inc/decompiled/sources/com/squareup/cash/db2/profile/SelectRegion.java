package com.squareup.cash.db2.profile;

import com.squareup.protos.franklin.api.Region;

/* loaded from: classes.dex */
public final class SelectRegion {
    public final Region region;

    public SelectRegion(Region region) {
        this.region = region;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectRegion) && this.region == ((SelectRegion) obj).region;
    }

    public final int hashCode() {
        Region region = this.region;
        if (region == null) {
            return 0;
        }
        return region.hashCode();
    }

    public final String toString() {
        return "SelectRegion(region=" + this.region + ")";
    }
}
