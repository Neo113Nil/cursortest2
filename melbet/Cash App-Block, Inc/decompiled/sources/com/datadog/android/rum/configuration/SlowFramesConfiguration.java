package com.datadog.android.rum.configuration;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class SlowFramesConfiguration {
    public static final SlowFramesConfiguration DEFAULT = new SlowFramesConfiguration();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SlowFramesConfiguration);
    }

    public final int hashCode() {
        return Long.hashCode(1000000000L) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) * 31, 31, 700000000L), 31, 16666666L), 31, 5000000000L);
    }

    public final String toString() {
        return "SlowFramesConfiguration(maxSlowFramesAmount=1000, maxSlowFrameThresholdNs=700000000, continuousSlowFrameThresholdNs=16666666, freezeDurationThresholdNs=5000000000, minViewLifetimeThresholdNs=1000000000)";
    }
}
