package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MimeMatchedVideoCapabilities implements VideoCapabilities {
    public final CameraInfoInternal cameraInfo;
    public final String mime;
    public final Lazy validatedData$delegate;

    public MimeMatchedVideoCapabilities(String str, CameraInfoInternal cameraInfoInternal, VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0) {
        str.getClass();
        cameraInfoInternal.getClass();
        videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
        this.mime = str;
        this.cameraInfo = cameraInfoInternal;
        this.validatedData$delegate = LazyKt.lazy(new DialogHostKt$$ExternalSyntheticLambda0(7, videoEncoderInfoImpl$$ExternalSyntheticLambda0, this));
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final Size getResolution(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality, DynamicRange dynamicRange) {
        autoValue_Quality_ConstantQuality.getClass();
        Lazy lazy = this.validatedData$delegate;
        if (DynamicRanges.canResolve(dynamicRange, ((ValidatedData) lazy.getValue()).dynamicRanges)) {
            return (Size) ((ValidatedData) lazy.getValue()).qualityToSizeMap.get(autoValue_Quality_ConstantQuality);
        }
        return null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final Set getSupportedDynamicRanges() {
        return ((ValidatedData) this.validatedData$delegate.getValue()).dynamicRanges;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final List getSupportedQualities(DynamicRange dynamicRange) {
        Lazy lazy = this.validatedData$delegate;
        return DynamicRanges.canResolve(dynamicRange, ((ValidatedData) lazy.getValue()).dynamicRanges) ? CollectionsKt.toList(((ValidatedData) lazy.getValue()).qualityToSizeMap.keySet()) : EmptyList.INSTANCE;
    }

    public final String toString() {
        return "MimeMatchedVideoCapabilities(mime=" + this.mime + ", cameraInfo=" + this.cameraInfo + ')';
    }

    public final class ValidatedData {
        public final Set dynamicRanges;
        public final Map qualityToSizeMap;

        public ValidatedData(Map map, Set set) {
            set.getClass();
            map.getClass();
            this.dynamicRanges = set;
            this.qualityToSizeMap = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidatedData)) {
                return false;
            }
            ValidatedData validatedData = (ValidatedData) obj;
            return Intrinsics.areEqual(this.dynamicRanges, validatedData.dynamicRanges) && Intrinsics.areEqual(this.qualityToSizeMap, validatedData.qualityToSizeMap);
        }

        public final int hashCode() {
            return this.qualityToSizeMap.hashCode() + (this.dynamicRanges.hashCode() * 31);
        }

        public final String toString() {
            return "ValidatedData(dynamicRanges=" + this.dynamicRanges + ", qualityToSizeMap=" + this.qualityToSizeMap + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ValidatedData() {
            this(r1, r0);
            EmptySet emptySet = EmptySet.INSTANCE;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }
    }
}
