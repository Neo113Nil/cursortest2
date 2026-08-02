package androidx.camera.video.internal.config;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FormatCombo {
    public final String audioMime;
    public final int container;
    public final String videoMime;

    public FormatCombo(int i, String str, String str2) {
        this.container = i;
        this.videoMime = str;
        this.audioMime = str2;
        if (str == null && str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatCombo)) {
            return false;
        }
        FormatCombo formatCombo = (FormatCombo) obj;
        return this.container == formatCombo.container && Intrinsics.areEqual(this.videoMime, formatCombo.videoMime) && Intrinsics.areEqual(this.audioMime, formatCombo.audioMime);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.container) * 31;
        String str = this.videoMime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioMime;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormatCombo(container=");
        sb.append(this.container);
        sb.append(", videoMime=");
        sb.append(this.videoMime);
        sb.append(", audioMime=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.audioMime, ')');
    }
}
