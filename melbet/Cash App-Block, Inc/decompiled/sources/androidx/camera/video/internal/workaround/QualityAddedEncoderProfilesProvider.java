package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.room.TransactorKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class QualityAddedEncoderProfilesProvider implements EncoderProfilesProvider {
    public final HashMap mExtraQualityToEncoderProfiles;
    public final EncoderProfilesProvider mProvider;

    public QualityAddedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks, CameraInfoInternal cameraInfoInternal, VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0) {
        List videoProfiles;
        this.mProvider = encoderProfilesProvider;
        ArrayList all = quirks.getAll(ExtraSupportedQualityQuirk.class);
        if (all.isEmpty()) {
            return;
        }
        Map map = null;
        TransactorKt.checkState(null, all.size() == 1);
        ((ExtraSupportedQualityQuirk) all.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if ("1".equals(cameraInfoInternal.getCameraId()) && !encoderProfilesProvider.hasProfile(4)) {
            EncoderProfilesProxy all2 = encoderProfilesProvider.getAll(1);
            AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy = (all2 == null || (videoProfiles = all2.getVideoProfiles()) == null) ? null : (AutoValue_EncoderProfilesProxy_VideoProfileProxy) CollectionsKt.firstOrNull(videoProfiles);
            if (autoValue_EncoderProfilesProxy_VideoProfileProxy != null) {
                String str = autoValue_EncoderProfilesProxy_VideoProfileProxy.mediaType;
                videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
                VideoEncoderInfo find = VideoEncoderInfoImpl$$ExternalSyntheticLambda0.find(str);
                Range supportedBitrateRange = find != null ? find.getSupportedBitrateRange() : Range.create(0, Integer.MAX_VALUE);
                Size size = SizeUtil.RESOLUTION_480P;
                autoValue_EncoderProfilesProxy_VideoProfileProxy.getClass();
                size.getClass();
                supportedBitrateRange.getClass();
                int i = autoValue_EncoderProfilesProxy_VideoProfileProxy.bitrate;
                int i2 = autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth;
                int i3 = autoValue_EncoderProfilesProxy_VideoProfileProxy.frameRate;
                Object clamp = supportedBitrateRange.clamp(Integer.valueOf(VideoConfigUtil.scaleBitrate(i, i2, i2, i3, i3, size.getWidth(), autoValue_EncoderProfilesProxy_VideoProfileProxy.width, size.getHeight(), autoValue_EncoderProfilesProxy_VideoProfileProxy.height)));
                clamp.getClass();
                AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy create = AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(all2.getDefaultDurationSeconds(), all2.getRecommendedFileFormat(), all2.getAudioProfiles(), Collections.singletonList(new AutoValue_EncoderProfilesProxy_VideoProfileProxy(autoValue_EncoderProfilesProxy_VideoProfileProxy.codec, autoValue_EncoderProfilesProxy_VideoProfileProxy.mediaType, ((Number) clamp).intValue(), autoValue_EncoderProfilesProxy_VideoProfileProxy.frameRate, size.getWidth(), size.getHeight(), autoValue_EncoderProfilesProxy_VideoProfileProxy.profile, autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth, autoValue_EncoderProfilesProxy_VideoProfileProxy.chromaSubsampling, autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat)));
                HashMap hashMap = new HashMap();
                hashMap.put(4, create);
                Size resolution = autoValue_EncoderProfilesProxy_VideoProfileProxy.getResolution();
                if (size.getHeight() * size.getWidth() > resolution.getHeight() * resolution.getWidth()) {
                    hashMap.put(1, create);
                }
                map = hashMap;
            }
        }
        if (map != null) {
            this.mExtraQualityToEncoderProfiles = new HashMap(map);
        }
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        return getProfilesInternal$4(i);
    }

    public final EncoderProfilesProxy getProfilesInternal$4(int i) {
        HashMap hashMap = this.mExtraQualityToEncoderProfiles;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i))) ? this.mProvider.getAll(i) : (EncoderProfilesProxy) hashMap.get(Integer.valueOf(i));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        return getProfilesInternal$4(i) != null;
    }
}
