package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes3.dex */
public final class DefaultEncoderProfilesProvider implements EncoderProfilesProvider {
    public final CameraInfoInternal cameraInfo;
    public final LinkedHashMap encoderProfilesMap;
    public final Lazy supportedSizes$delegate;
    public final List targetQualities;
    public final VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoFinder;

    public DefaultEncoderProfilesProvider(CameraInfoInternal cameraInfoInternal, List list, VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0) {
        cameraInfoInternal.getClass();
        list.getClass();
        videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
        this.cameraInfo = cameraInfoInternal;
        this.targetQualities = list;
        this.videoEncoderInfoFinder = videoEncoderInfoImpl$$ExternalSyntheticLambda0;
        this.supportedSizes$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 11));
        this.encoderProfilesMap = new LinkedHashMap();
    }

    public static AutoValue_EncoderProfilesProxy_VideoProfileProxy createDefaultVideoProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i, int i2, int i3) {
        return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        return getProfileInternal(i);
    }

    public final EncoderProfilesProxy getProfileInternal(int i) {
        int i2;
        Object obj;
        int i3;
        AutoValue_EncoderProfilesProxy_VideoProfileProxy createDefaultVideoProfile$default;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.encoderProfilesMap;
        if (linkedHashMap.containsKey(valueOf)) {
            return (EncoderProfilesProxy) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = this.targetQualities.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = i;
                obj = null;
                break;
            }
            obj = it.next();
            AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) obj;
            autoValue_Quality_ConstantQuality.getClass();
            i2 = i;
            if (autoValue_Quality_ConstantQuality.value == i2) {
                break;
            }
        }
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = obj instanceof AutoValue_Quality_ConstantQuality ? (AutoValue_Quality_ConstantQuality) obj : null;
        if (autoValue_Quality_ConstantQuality2 != null) {
            for (Size size : autoValue_Quality_ConstantQuality2.typicalSizes) {
                if (((List) this.supportedSizes$delegate.getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (autoValue_Quality_ConstantQuality2.equals(AutoValue_Quality_ConstantQuality.UHD)) {
                        i3 = 40000000;
                    } else if (autoValue_Quality_ConstantQuality2.equals(AutoValue_Quality_ConstantQuality.FHD)) {
                        i3 = 10000000;
                    } else if (autoValue_Quality_ConstantQuality2.equals(AutoValue_Quality_ConstantQuality.HD)) {
                        i3 = 4000000;
                    } else {
                        if (!autoValue_Quality_ConstantQuality2.equals(AutoValue_Quality_ConstantQuality.SD)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) autoValue_Quality_ConstantQuality2, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i3 = 2000000;
                    }
                    createDefaultVideoProfile$default = createDefaultVideoProfile$default(this, width, height, i3);
                    this.videoEncoderInfoFinder.getClass();
                    VideoEncoderInfo find = VideoEncoderInfoImpl$$ExternalSyntheticLambda0.find("video/avc");
                    if (find != null && find.isSizeSupportedAllowSwapping(width, height)) {
                        Integer num = (Integer) find.getSupportedBitrateRange().clamp(Integer.valueOf(i3));
                        if (num == null || num.intValue() != i3) {
                            num.getClass();
                            createDefaultVideoProfile$default = createDefaultVideoProfile$default(this, width, height, num.intValue());
                        }
                    } else {
                        createDefaultVideoProfile$default = null;
                    }
                    if (createDefaultVideoProfile$default != null) {
                        break;
                    }
                }
            }
        }
        createDefaultVideoProfile$default = null;
        AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy create = createDefaultVideoProfile$default != null ? AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(60, 2, CollectionsKt__CollectionsJVMKt.listOf(new AutoValue_EncoderProfilesProxy_AudioProfileProxy("audio/mp4a-latm", 3, 96000, 44100, 1, 2)), CollectionsKt__CollectionsJVMKt.listOf(createDefaultVideoProfile$default)) : null;
        linkedHashMap.put(Integer.valueOf(i2), create);
        return create;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        return getProfileInternal(i) != null;
    }
}
