package com.fillr.browsersdk.model;

/* loaded from: classes4.dex */
public final class FillrCachedMapping {
    public final FillrMapping fillrMapping;
    public int numRefills = 0;
    public long lastMappingTimestamp = System.currentTimeMillis();

    public FillrCachedMapping(FillrMapping fillrMapping) {
        this.fillrMapping = fillrMapping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FillrCachedMapping.class != obj.getClass()) {
            return false;
        }
        return this.fillrMapping.equals(((FillrCachedMapping) obj).fillrMapping);
    }

    public final int hashCode() {
        return this.fillrMapping.hashCode();
    }
}
