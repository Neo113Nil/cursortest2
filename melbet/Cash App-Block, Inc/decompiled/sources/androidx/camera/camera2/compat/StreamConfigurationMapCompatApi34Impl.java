package androidx.camera.camera2.compat;

import android.util.Size;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class StreamConfigurationMapCompatApi34Impl extends BiometricPrompt {
    public static boolean getHasJpegRQuirk() {
        return DeviceQuirks.getAll().get(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // androidx.biometric.BiometricPrompt
    public final Integer[] getOutputFormats() {
        Integer[] outputFormats = super.getOutputFormats();
        if (!getHasJpegRQuirk()) {
            return outputFormats;
        }
        if (outputFormats == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : outputFormats) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // androidx.biometric.BiometricPrompt
    public final long getOutputMinFrameDuration(int i, Size size) {
        size.getClass();
        if (i == 4101 && getHasJpegRQuirk()) {
            return 0L;
        }
        return super.getOutputMinFrameDuration(i, size);
    }

    @Override // androidx.biometric.BiometricPrompt
    public final Size[] getOutputSizes(int i) {
        if (i == 4101 && getHasJpegRQuirk()) {
            return null;
        }
        return super.getOutputSizes(i);
    }
}
