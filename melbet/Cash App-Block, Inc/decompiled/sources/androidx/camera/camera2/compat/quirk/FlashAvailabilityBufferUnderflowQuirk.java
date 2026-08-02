package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.Quirk;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;", "Landroidx/camera/core/impl/Quirk;", "DeviceInfo", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlashAvailabilityBufferUnderflowQuirk implements Quirk {
    public static final Set KNOWN_AFFECTED_MODELS;

    public final class DeviceInfo {
        public final String manufacturer;
        public final String model;

        public DeviceInfo(String str, String str2) {
            this.manufacturer = str;
            this.model = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return Intrinsics.areEqual(this.manufacturer, deviceInfo.manufacturer) && Intrinsics.areEqual(this.model, deviceInfo.model);
        }

        public final int hashCode() {
            return this.model.hashCode() + (this.manufacturer.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
            sb.append(this.manufacturer);
            sb.append(", model=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.model, ')');
        }
    }

    static {
        Locale locale = Locale.US;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, "sprd", locale);
        String lowerCase = "lemp".toLowerCase(locale);
        lowerCase.getClass();
        DeviceInfo deviceInfo = new DeviceInfo(m, lowerCase);
        locale.getClass();
        String lowerCase2 = "sprd".toLowerCase(locale);
        lowerCase2.getClass();
        String lowerCase3 = "DM20C".toLowerCase(locale);
        lowerCase3.getClass();
        KNOWN_AFFECTED_MODELS = ArraysKt___ArraysKt.toSet(new DeviceInfo[]{deviceInfo, new DeviceInfo(lowerCase2, lowerCase3)});
    }
}
