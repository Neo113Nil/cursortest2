package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class TrackSelectionOverride {
    public final TrackGroup mediaTrackGroup;
    public final ImmutableList trackIndices;

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
    }

    public TrackSelectionOverride(TrackGroup trackGroup, RegularImmutableList regularImmutableList) {
        if (!regularImmutableList.isEmpty() && (((Integer) Collections.min(regularImmutableList)).intValue() < 0 || ((Integer) Collections.max(regularImmutableList)).intValue() >= trackGroup.length)) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            throw null;
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = ImmutableList.copyOf((Collection) regularImmutableList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionOverride.class == obj.getClass()) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            if (this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup)) {
                ImmutableList immutableList = trackSelectionOverride.trackIndices;
                ImmutableList immutableList2 = this.trackIndices;
                immutableList2.getClass();
                if (Maps.equalsImpl(immutableList, immutableList2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.trackIndices.hashCode() * 31) + this.mediaTrackGroup.hashCode();
    }
}
