package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public interface VideoCapabilities {
    public static final AnonymousClass1 EMPTY = new AnonymousClass1();

    /* renamed from: androidx.camera.video.VideoCapabilities$1, reason: invalid class name */
    public final class AnonymousClass1 implements VideoCapabilities {
        @Override // androidx.camera.video.VideoCapabilities
        public final Set getSupportedDynamicRanges() {
            return new HashSet();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public final List getSupportedQualities(DynamicRange dynamicRange) {
            return new ArrayList();
        }
    }

    default Size getResolution(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality, DynamicRange dynamicRange) {
        return null;
    }

    Set getSupportedDynamicRanges();

    List getSupportedQualities(DynamicRange dynamicRange);
}
