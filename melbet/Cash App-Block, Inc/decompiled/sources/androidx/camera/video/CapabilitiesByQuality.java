package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CapabilitiesByQuality {
    public final AutoValue_VideoValidatedEncoderProfilesProxy mHighestProfiles;
    public final AutoValue_VideoValidatedEncoderProfilesProxy mLowestProfiles;
    public final LinkedHashMap mSupportedProfilesMap = new LinkedHashMap();
    public final TreeMap mAreaSortedSizeToQualityMap = new TreeMap(new CompareSizesByArea(false));

    public CapabilitiesByQuality(BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider, int i) {
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = AutoValue_Quality_ConstantQuality.SD;
        Iterator it = new ArrayList(AutoValue_Quality_ConstantQuality.QUALITIES_ORDER_BY_SIZE).iterator();
        while (true) {
            AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = null;
            if (!it.hasNext()) {
                break;
            }
            AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = (AutoValue_Quality_ConstantQuality) it.next();
            TransactorKt.checkState("Currently only support ConstantQuality", autoValue_Quality_ConstantQuality2 instanceof AutoValue_Quality_ConstantQuality);
            EncoderProfilesProxy profilesInternal$2 = backupHdrProfileEncoderProfilesProvider.getProfilesInternal$2(autoValue_Quality_ConstantQuality2.getQualityValue(i));
            if (profilesInternal$2 != null) {
                StringUtilsKt.d("CapabilitiesByQuality", "profiles = " + profilesInternal$2);
                if (!profilesInternal$2.getVideoProfiles().isEmpty()) {
                    int defaultDurationSeconds = profilesInternal$2.getDefaultDurationSeconds();
                    int recommendedFileFormat = profilesInternal$2.getRecommendedFileFormat();
                    List audioProfiles = profilesInternal$2.getAudioProfiles();
                    List videoProfiles = profilesInternal$2.getVideoProfiles();
                    TransactorKt.checkArgument("Should contain at least one VideoProfile.", !videoProfiles.isEmpty());
                    autoValue_VideoValidatedEncoderProfilesProxy = new AutoValue_VideoValidatedEncoderProfilesProxy(defaultDurationSeconds, recommendedFileFormat, Collections.unmodifiableList(new ArrayList(audioProfiles)), Collections.unmodifiableList(new ArrayList(videoProfiles)), audioProfiles.isEmpty() ? null : (AutoValue_EncoderProfilesProxy_AudioProfileProxy) audioProfiles.get(0), (AutoValue_EncoderProfilesProxy_VideoProfileProxy) videoProfiles.get(0));
                }
                if (autoValue_VideoValidatedEncoderProfilesProxy == null) {
                    StringUtilsKt.w("CapabilitiesByQuality", "EncoderProfiles of quality " + autoValue_Quality_ConstantQuality2 + " has no video validated profiles.");
                } else {
                    this.mAreaSortedSizeToQualityMap.put(autoValue_VideoValidatedEncoderProfilesProxy.defaultVideoProfile.getResolution(), autoValue_Quality_ConstantQuality2);
                    this.mSupportedProfilesMap.put(autoValue_Quality_ConstantQuality2, autoValue_VideoValidatedEncoderProfilesProxy);
                }
            }
        }
        if (this.mSupportedProfilesMap.isEmpty()) {
            StringUtilsKt.e("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.mLowestProfiles = null;
            this.mHighestProfiles = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.mSupportedProfilesMap.values());
            this.mHighestProfiles = (AutoValue_VideoValidatedEncoderProfilesProxy) arrayDeque.peekFirst();
            this.mLowestProfiles = (AutoValue_VideoValidatedEncoderProfilesProxy) arrayDeque.peekLast();
        }
    }

    public final AutoValue_VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size) {
        Object value;
        Size size2 = SizeUtil.RESOLUTION_ZERO;
        TreeMap treeMap = this.mAreaSortedSizeToQualityMap;
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = treeMap.floorEntry(size);
            value = floorEntry != null ? floorEntry.getValue() : null;
        }
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) value;
        if (autoValue_Quality_ConstantQuality == null) {
            autoValue_Quality_ConstantQuality = AutoValue_Quality_ConstantQuality.NONE;
        }
        StringUtilsKt.d("CapabilitiesByQuality", "Using supported quality of " + autoValue_Quality_ConstantQuality + " for size " + size);
        if (autoValue_Quality_ConstantQuality != AutoValue_Quality_ConstantQuality.NONE) {
            AutoValue_VideoValidatedEncoderProfilesProxy profiles = getProfiles(autoValue_Quality_ConstantQuality);
            if (profiles != null) {
                return profiles;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }
        return null;
    }

    public final AutoValue_VideoValidatedEncoderProfilesProxy getProfiles(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality) {
        TransactorKt.checkArgument("Unknown quality: " + autoValue_Quality_ConstantQuality, AutoValue_Quality_ConstantQuality.QUALITIES.contains(autoValue_Quality_ConstantQuality));
        return autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.HIGHEST ? this.mHighestProfiles : autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.LOWEST ? this.mLowestProfiles : (AutoValue_VideoValidatedEncoderProfilesProxy) this.mSupportedProfilesMap.get(autoValue_Quality_ConstantQuality);
    }
}
