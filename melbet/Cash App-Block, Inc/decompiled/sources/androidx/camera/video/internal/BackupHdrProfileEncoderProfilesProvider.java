package androidx.camera.video.internal;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    public final /* synthetic */ int $r8$classId = 1;
    public final HashMap mEncoderProfilesCache = new HashMap();
    public final EncoderProfilesProvider mEncoderProfilesProvider;
    public final Object mVideoEncoderInfoFinder;

    public BackupHdrProfileEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, DynamicRange dynamicRange) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mVideoEncoderInfoFinder = dynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        switch (this.$r8$classId) {
            case 0:
                return getProfilesInternal$1(i);
            case 1:
                return getProfilesInternal$2(i);
            default:
                return getProfilesInternal$5(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.camera.core.impl.EncoderProfilesProxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EncoderProfilesProxy getProfilesInternal$1(int i) {
        AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy;
        AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy2;
        int i2;
        AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy3;
        ?? create;
        BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider = (BackupHdrProfileEncoderProfilesProvider) this.mEncoderProfilesProvider;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.mEncoderProfilesCache;
        if (hashMap.containsKey(valueOf)) {
            return (EncoderProfilesProxy) hashMap.get(Integer.valueOf(i));
        }
        if (!backupHdrProfileEncoderProfilesProvider.hasProfile(i)) {
            return null;
        }
        EncoderProfilesProxy profilesInternal$5 = backupHdrProfileEncoderProfilesProvider.getProfilesInternal$5(i);
        if (profilesInternal$5 == null) {
            create = 0;
        } else {
            ArrayList arrayList = new ArrayList(profilesInternal$5.getVideoProfiles());
            Iterator it = profilesInternal$5.getVideoProfiles().iterator();
            while (true) {
                if (!it.hasNext()) {
                    autoValue_EncoderProfilesProxy_VideoProfileProxy = null;
                    break;
                }
                autoValue_EncoderProfilesProxy_VideoProfileProxy = (AutoValue_EncoderProfilesProxy_VideoProfileProxy) it.next();
                if (autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat == 0) {
                    break;
                }
            }
            if (autoValue_EncoderProfilesProxy_VideoProfileProxy == null) {
                autoValue_EncoderProfilesProxy_VideoProfileProxy3 = null;
                autoValue_EncoderProfilesProxy_VideoProfileProxy2 = null;
            } else {
                int i3 = autoValue_EncoderProfilesProxy_VideoProfileProxy.codec;
                String str = autoValue_EncoderProfilesProxy_VideoProfileProxy.mediaType;
                int i4 = autoValue_EncoderProfilesProxy_VideoProfileProxy.profile;
                if (1 != autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat) {
                    i3 = 5;
                    str = "video/hevc";
                    i4 = 2;
                }
                int i5 = i3;
                String str2 = str;
                int i6 = i4;
                int i7 = autoValue_EncoderProfilesProxy_VideoProfileProxy.bitrate;
                int i8 = autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth;
                if (10 == i8) {
                    i2 = i7;
                    autoValue_EncoderProfilesProxy_VideoProfileProxy2 = null;
                } else {
                    int doubleValue = (int) (i7 * new Rational(10, i8).doubleValue());
                    if (StringUtilsKt.isLogLevelEnabled(3, "BackupHdrProfileEncoderProfilesProvider")) {
                        autoValue_EncoderProfilesProxy_VideoProfileProxy2 = null;
                        StringUtilsKt.d("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i7), 10, Integer.valueOf(i8), Integer.valueOf(doubleValue)));
                    } else {
                        autoValue_EncoderProfilesProxy_VideoProfileProxy2 = null;
                    }
                    i2 = doubleValue;
                }
                autoValue_EncoderProfilesProxy_VideoProfileProxy3 = new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i5, str2, i2, autoValue_EncoderProfilesProxy_VideoProfileProxy.frameRate, autoValue_EncoderProfilesProxy_VideoProfileProxy.width, autoValue_EncoderProfilesProxy_VideoProfileProxy.height, i6, 10, autoValue_EncoderProfilesProxy_VideoProfileProxy.chromaSubsampling, 1);
            }
            VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0 = (VideoEncoderInfoImpl$$ExternalSyntheticLambda0) this.mVideoEncoderInfoFinder;
            if (autoValue_EncoderProfilesProxy_VideoProfileProxy3 != null) {
                String str3 = autoValue_EncoderProfilesProxy_VideoProfileProxy3.mediaType;
                videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
                VideoEncoderInfo find = VideoEncoderInfoImpl$$ExternalSyntheticLambda0.find(str3);
                if (find != null && find.isSizeSupportedAllowSwapping(autoValue_EncoderProfilesProxy_VideoProfileProxy3.width, autoValue_EncoderProfilesProxy_VideoProfileProxy3.height)) {
                    int i9 = autoValue_EncoderProfilesProxy_VideoProfileProxy3.bitrate;
                    int intValue = ((Integer) find.getSupportedBitrateRange().clamp(Integer.valueOf(i9))).intValue();
                    if (intValue != i9) {
                        autoValue_EncoderProfilesProxy_VideoProfileProxy3 = new AutoValue_EncoderProfilesProxy_VideoProfileProxy(autoValue_EncoderProfilesProxy_VideoProfileProxy3.codec, autoValue_EncoderProfilesProxy_VideoProfileProxy3.mediaType, intValue, autoValue_EncoderProfilesProxy_VideoProfileProxy3.frameRate, autoValue_EncoderProfilesProxy_VideoProfileProxy3.width, autoValue_EncoderProfilesProxy_VideoProfileProxy3.height, autoValue_EncoderProfilesProxy_VideoProfileProxy3.profile, autoValue_EncoderProfilesProxy_VideoProfileProxy3.bitDepth, autoValue_EncoderProfilesProxy_VideoProfileProxy3.chromaSubsampling, autoValue_EncoderProfilesProxy_VideoProfileProxy3.hdrFormat);
                    }
                    if (autoValue_EncoderProfilesProxy_VideoProfileProxy3 != null) {
                        arrayList.add(autoValue_EncoderProfilesProxy_VideoProfileProxy3);
                    }
                    create = !arrayList.isEmpty() ? autoValue_EncoderProfilesProxy_VideoProfileProxy2 : AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(profilesInternal$5.getDefaultDurationSeconds(), profilesInternal$5.getRecommendedFileFormat(), profilesInternal$5.getAudioProfiles(), arrayList);
                }
            }
            autoValue_EncoderProfilesProxy_VideoProfileProxy3 = autoValue_EncoderProfilesProxy_VideoProfileProxy2;
            if (autoValue_EncoderProfilesProxy_VideoProfileProxy3 != null) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        hashMap.put(Integer.valueOf(i), create);
        return create;
    }

    public EncoderProfilesProxy getProfilesInternal$2(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.mEncoderProfilesCache;
        if (hashMap.containsKey(valueOf)) {
            return (EncoderProfilesProxy) hashMap.get(Integer.valueOf(i));
        }
        EncoderProfilesProvider encoderProfilesProvider = this.mEncoderProfilesProvider;
        AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = null;
        if (encoderProfilesProvider.hasProfile(i)) {
            EncoderProfilesProxy all = encoderProfilesProvider.getAll(i);
            DynamicRange dynamicRange = (DynamicRange) this.mVideoEncoderInfoFinder;
            if (all != null) {
                ArrayList arrayList = new ArrayList();
                for (AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy : all.getVideoProfiles()) {
                    if (DynamicRangeUtil.isHdrSettingsMatched(autoValue_EncoderProfilesProxy_VideoProfileProxy, dynamicRange)) {
                        arrayList.add(autoValue_EncoderProfilesProxy_VideoProfileProxy);
                    }
                }
                if (!arrayList.isEmpty()) {
                    autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy = AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy);
        }
        return autoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
    }

    public EncoderProfilesProxy getProfilesInternal$5(int i) {
        EncoderProfilesProxy encoderProfilesProxy;
        Size size;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.mEncoderProfilesCache;
        if (hashMap.containsKey(valueOf)) {
            return (EncoderProfilesProxy) hashMap.get(Integer.valueOf(i));
        }
        EncoderProfilesProvider encoderProfilesProvider = this.mEncoderProfilesProvider;
        if (encoderProfilesProvider.hasProfile(i)) {
            EncoderProfilesProxy all = encoderProfilesProvider.getAll(i);
            Objects.requireNonNull(all);
            Iterator it = ((Quirks) this.mVideoEncoderInfoFinder).getAll(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i == 4) {
                        size = new Size(640, 480);
                    } else if (i == 5) {
                        size = new Size(960, 720);
                    } else if (i == 6) {
                        size = new Size(1440, 1080);
                    }
                }
            }
            size = null;
            if (size == null) {
                encoderProfilesProxy = all;
            } else {
                ArrayList arrayList = new ArrayList();
                for (AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy : all.getVideoProfiles()) {
                    arrayList.add(new AutoValue_EncoderProfilesProxy_VideoProfileProxy(autoValue_EncoderProfilesProxy_VideoProfileProxy.codec, autoValue_EncoderProfilesProxy_VideoProfileProxy.mediaType, autoValue_EncoderProfilesProxy_VideoProfileProxy.bitrate, autoValue_EncoderProfilesProxy_VideoProfileProxy.frameRate, size.getWidth(), size.getHeight(), autoValue_EncoderProfilesProxy_VideoProfileProxy.profile, autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth, autoValue_EncoderProfilesProxy_VideoProfileProxy.chromaSubsampling, autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat));
                }
                if (!arrayList.isEmpty()) {
                    encoderProfilesProxy = AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), encoderProfilesProxy);
            return encoderProfilesProxy;
        }
        encoderProfilesProxy = null;
        hashMap.put(Integer.valueOf(i), encoderProfilesProxy);
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        switch (this.$r8$classId) {
            case 0:
                if (((BackupHdrProfileEncoderProfilesProvider) this.mEncoderProfilesProvider).hasProfile(i) && getProfilesInternal$1(i) != null) {
                }
                break;
            case 1:
                if (this.mEncoderProfilesProvider.hasProfile(i) && getProfilesInternal$2(i) != null) {
                }
                break;
            default:
                if (this.mEncoderProfilesProvider.hasProfile(i) && getProfilesInternal$5(i) != null) {
                }
                break;
        }
        return false;
    }

    public BackupHdrProfileEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mVideoEncoderInfoFinder = quirks;
    }

    public BackupHdrProfileEncoderProfilesProvider(BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider, VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0) {
        this.mEncoderProfilesProvider = backupHdrProfileEncoderProfilesProvider;
        this.mVideoEncoderInfoFinder = videoEncoderInfoImpl$$ExternalSyntheticLambda0;
    }
}
