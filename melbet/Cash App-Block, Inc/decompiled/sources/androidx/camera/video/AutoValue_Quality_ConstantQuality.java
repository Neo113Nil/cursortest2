package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_Quality_ConstantQuality {
    public static final AutoValue_Quality_ConstantQuality FHD;
    public static final AutoValue_Quality_ConstantQuality HD;
    public static final AutoValue_Quality_ConstantQuality HIGHEST;
    public static final AutoValue_Quality_ConstantQuality LOWEST;
    public static final AutoValue_Quality_ConstantQuality NONE;
    public static final HashSet QUALITIES;
    public static final List QUALITIES_ORDER_BY_SIZE;
    public static final AutoValue_Quality_ConstantQuality SD;
    public static final AutoValue_Quality_ConstantQuality UHD;
    public final int highSpeedValue;
    public final String name;
    public final List typicalSizes;
    public final int value;

    static {
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = new AutoValue_Quality_ConstantQuality("SD", 4, 2002, Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        SD = autoValue_Quality_ConstantQuality;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = new AutoValue_Quality_ConstantQuality("HD", 5, 2003, Collections.singletonList(new Size(1280, 720)));
        HD = autoValue_Quality_ConstantQuality2;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality3 = new AutoValue_Quality_ConstantQuality("FHD", 6, 2004, Collections.singletonList(new Size(1920, 1080)));
        FHD = autoValue_Quality_ConstantQuality3;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality4 = new AutoValue_Quality_ConstantQuality("UHD", 8, 2005, Collections.singletonList(new Size(3840, 2160)));
        UHD = autoValue_Quality_ConstantQuality4;
        List list = Collections.EMPTY_LIST;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality5 = new AutoValue_Quality_ConstantQuality("LOWEST", 0, 2000, list);
        LOWEST = autoValue_Quality_ConstantQuality5;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality6 = new AutoValue_Quality_ConstantQuality("HIGHEST", 1, 2001, list);
        HIGHEST = autoValue_Quality_ConstantQuality6;
        NONE = new AutoValue_Quality_ConstantQuality("NONE", -1, -1, list);
        QUALITIES = new HashSet(Arrays.asList(autoValue_Quality_ConstantQuality5, autoValue_Quality_ConstantQuality6, autoValue_Quality_ConstantQuality, autoValue_Quality_ConstantQuality2, autoValue_Quality_ConstantQuality3, autoValue_Quality_ConstantQuality4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(autoValue_Quality_ConstantQuality4, autoValue_Quality_ConstantQuality3, autoValue_Quality_ConstantQuality2, autoValue_Quality_ConstantQuality);
    }

    public AutoValue_Quality_ConstantQuality(String str, int i, int i2, List list) {
        this.value = i;
        this.highSpeedValue = i2;
        this.name = str;
        if (list != null) {
            this.typicalSizes = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null typicalSizes");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_Quality_ConstantQuality)) {
            return false;
        }
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) obj;
        return this.value == autoValue_Quality_ConstantQuality.value && this.highSpeedValue == autoValue_Quality_ConstantQuality.highSpeedValue && this.name.equals(autoValue_Quality_ConstantQuality.name) && this.typicalSizes.equals(autoValue_Quality_ConstantQuality.typicalSizes);
    }

    public final int getQualityValue(int i) {
        if (i == 1) {
            return this.value;
        }
        if (i == 2) {
            return this.highSpeedValue;
        }
        a$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown quality source: "));
        return 0;
    }

    public final int hashCode() {
        return this.typicalSizes.hashCode() ^ ((((((this.value ^ 1000003) * 1000003) ^ this.highSpeedValue) * 1000003) ^ this.name.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.value);
        sb.append(", highSpeedValue=");
        sb.append(this.highSpeedValue);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", typicalSizes=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.typicalSizes, "}");
    }
}
