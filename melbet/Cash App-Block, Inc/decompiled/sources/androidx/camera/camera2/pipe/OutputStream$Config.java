package androidx.camera.camera2.pipe;

import android.util.Size;
import androidx.camera.camera2.pipe.MetadataTransform;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class OutputStream$Config {
    public final String camera;
    public final OutputStream$DynamicRangeProfile dynamicRangeProfile;

    /* renamed from: format, reason: collision with root package name */
    public final int f838format;
    public final OutputStream$MirrorMode mirrorMode;
    public final List sensorPixelModes;
    public final Size size;
    public final OutputStream$StreamUseCase streamUseCase;
    public final OutputStream$StreamUseHint streamUseHint;

    public final class LazyOutputConfig extends OutputStream$Config {
        public final MetadataTransform.AnonymousClass1 outputType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LazyOutputConfig(Size size, int i, String str, MetadataTransform.AnonymousClass1 anonymousClass1, OutputStream$MirrorMode outputStream$MirrorMode, OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile, OutputStream$StreamUseCase outputStream$StreamUseCase, OutputStream$StreamUseHint outputStream$StreamUseHint, List list) {
            super(size, i, str, outputStream$MirrorMode, outputStream$DynamicRangeProfile, outputStream$StreamUseCase, outputStream$StreamUseHint, list);
            size.getClass();
            this.outputType = anonymousClass1;
        }
    }

    public final class SimpleOutputConfig extends OutputStream$Config {
    }

    public OutputStream$Config(Size size, int i, String str, OutputStream$MirrorMode outputStream$MirrorMode, OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile, OutputStream$StreamUseCase outputStream$StreamUseCase, OutputStream$StreamUseHint outputStream$StreamUseHint, List list) {
        size.getClass();
        this.size = size;
        this.f838format = i;
        this.camera = str;
        this.mirrorMode = outputStream$MirrorMode;
        this.dynamicRangeProfile = outputStream$DynamicRangeProfile;
        this.streamUseCase = outputStream$StreamUseCase;
        this.streamUseHint = outputStream$StreamUseHint;
        this.sensorPixelModes = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.size);
        sb.append(", format=");
        sb.append((Object) StreamFormat.m56toStringimpl(this.f838format));
        sb.append(", camera=");
        String str = this.camera;
        sb.append((Object) (str == null ? "null" : CameraId.m46toStringimpl(str)));
        sb.append(", mirrorMode=");
        sb.append(this.mirrorMode);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.dynamicRangeProfile);
        sb.append(", streamUseCase=");
        sb.append(this.streamUseCase);
        sb.append(", streamUseHint=");
        sb.append(this.streamUseHint);
        sb.append(", sensorPixelModes=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.sensorPixelModes, ')');
    }
}
