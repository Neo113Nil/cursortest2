package androidx.camera.video;

import android.util.LruCache;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class EncoderProfilesResolverFactory {
    public static final LruCache cache = new LruCache(16);

    public final class CacheKey {
        public final Object cameraConfig;
        public final String cameraId;
        public final VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoFinder;
        public final int videoRecordingType;

        public CacheKey(String str, Object obj, int i, VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0) {
            str.getClass();
            obj.getClass();
            videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
            this.cameraId = str;
            this.cameraConfig = obj;
            this.videoRecordingType = i;
            this.videoEncoderInfoFinder = videoEncoderInfoImpl$$ExternalSyntheticLambda0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) obj;
            return Intrinsics.areEqual(this.cameraId, cacheKey.cameraId) && Intrinsics.areEqual(this.cameraConfig, cacheKey.cameraConfig) && this.videoRecordingType == cacheKey.videoRecordingType && Intrinsics.areEqual(this.videoEncoderInfoFinder, cacheKey.videoEncoderInfoFinder);
        }

        public final int hashCode() {
            return this.videoEncoderInfoFinder.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.videoRecordingType, (this.cameraConfig.hashCode() + (this.cameraId.hashCode() * 31)) * 31, 31), 31);
        }

        public final String toString() {
            return "CacheKey(cameraId=" + this.cameraId + ", cameraConfig=" + this.cameraConfig + ", videoRecordingType=" + this.videoRecordingType + ", videoCapabilitiesSource=0, videoEncoderInfoFinder=" + this.videoEncoderInfoFinder + ')';
        }
    }
}
