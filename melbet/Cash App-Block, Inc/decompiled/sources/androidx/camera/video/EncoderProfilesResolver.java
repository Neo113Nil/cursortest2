package androidx.camera.video;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes3.dex */
public final class EncoderProfilesResolver {
    public static final EncoderProfilesResolver EMPTY = new EncoderProfilesResolver(EncoderProfilesProvider.EMPTY, 1, EmptySet.INSTANCE);
    public final LinkedHashMap fullySpecifiedMap;
    public final EncoderProfilesProvider hostProfilesProvider;
    public final LinkedHashMap nonFullySpecifiedMap;
    public final int qualitySource;
    public final Set supportedDynamicRanges;

    public EncoderProfilesResolver(EncoderProfilesProvider encoderProfilesProvider, int i, Set set) {
        set.getClass();
        this.hostProfilesProvider = encoderProfilesProvider;
        this.qualitySource = i;
        this.fullySpecifiedMap = new LinkedHashMap();
        this.nonFullySpecifiedMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange = (DynamicRange) it.next();
            CapabilitiesByQuality capabilitiesByQuality = new CapabilitiesByQuality(new BackupHdrProfileEncoderProfilesProvider(this.hostProfilesProvider, dynamicRange), this.qualitySource);
            if (!new ArrayList(capabilitiesByQuality.mSupportedProfilesMap.keySet()).isEmpty()) {
                this.fullySpecifiedMap.put(dynamicRange, capabilitiesByQuality);
            }
        }
        this.supportedDynamicRanges = this.fullySpecifiedMap.keySet();
    }

    public final CapabilitiesByQuality getCapabilities(DynamicRange dynamicRange) {
        boolean isFullySpecified = dynamicRange.isFullySpecified();
        LinkedHashMap linkedHashMap = this.fullySpecifiedMap;
        if (isFullySpecified) {
            return (CapabilitiesByQuality) linkedHashMap.get(dynamicRange);
        }
        LinkedHashMap linkedHashMap2 = this.nonFullySpecifiedMap;
        Object obj = linkedHashMap2.get(dynamicRange);
        if (obj == null) {
            obj = DynamicRanges.canResolve(dynamicRange, linkedHashMap.keySet()) ? new CapabilitiesByQuality(new BackupHdrProfileEncoderProfilesProvider(this.hostProfilesProvider, dynamicRange), this.qualitySource) : null;
            linkedHashMap2.put(dynamicRange, obj);
        }
        return (CapabilitiesByQuality) obj;
    }
}
