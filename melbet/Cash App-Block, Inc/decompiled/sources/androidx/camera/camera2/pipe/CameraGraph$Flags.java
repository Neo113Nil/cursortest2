package androidx.camera.camera2.pipe;

import android.os.Build;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import com.google.android.gms.dynamite.zzo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class CameraGraph$Flags {
    public final boolean abortCapturesOnStop;
    public final zzo awaitRepeatingRequestBeforeCapture;
    public final boolean closeCameraDeviceOnClose;
    public final boolean closeCaptureSessionOnDisconnect;
    public final boolean enableRestartDelays;
    public final int finalizeSessionOnCloseBehavior;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.contains(r3) == true) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CameraGraph$Flags(boolean z, zzo zzoVar, int i, boolean z2, int i2) {
        boolean z3;
        z = (i2 & 2) != 0 ? Build.VERSION.SDK_INT >= 30 : z;
        zzoVar = (i2 & 4) != 0 ? new zzo(0, CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior.AT_LEAST) : zzoVar;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = Camera2Quirks.SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP;
            String str = Build.HARDWARE;
            if (!Intrinsics.areEqual(str, "samsungexynos7870") && (!StringsKt__StringsJVMKt.equals(str, "qcom", true) || Build.VERSION.SDK_INT > 31)) {
                Map map2 = Camera2Quirks.SM8150_DEVICES;
                String str2 = Build.BRAND;
                str2.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
                Set set = (Set) map2.get(lowerCase);
                if (set != null) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    String lowerCase2 = str3.toLowerCase(locale);
                    lowerCase2.getClass();
                }
                z3 = false;
                z2 = (i2 & 64) != 0 ? false : z2;
                boolean z4 = (i2 & 128) == 0;
                this.abortCapturesOnStop = z;
                this.awaitRepeatingRequestBeforeCapture = zzoVar;
                this.finalizeSessionOnCloseBehavior = i;
                this.closeCaptureSessionOnDisconnect = z3;
                this.closeCameraDeviceOnClose = z2;
                this.enableRestartDelays = z4;
            }
        }
        z3 = true;
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        this.abortCapturesOnStop = z;
        this.awaitRepeatingRequestBeforeCapture = zzoVar;
        this.finalizeSessionOnCloseBehavior = i;
        this.closeCaptureSessionOnDisconnect = z3;
        this.closeCameraDeviceOnClose = z2;
        this.enableRestartDelays = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraGraph$Flags)) {
            return false;
        }
        CameraGraph$Flags cameraGraph$Flags = (CameraGraph$Flags) obj;
        return this.abortCapturesOnStop == cameraGraph$Flags.abortCapturesOnStop && Intrinsics.areEqual(this.awaitRepeatingRequestBeforeCapture, cameraGraph$Flags.awaitRepeatingRequestBeforeCapture) && this.finalizeSessionOnCloseBehavior == cameraGraph$Flags.finalizeSessionOnCloseBehavior && this.closeCaptureSessionOnDisconnect == cameraGraph$Flags.closeCaptureSessionOnDisconnect && this.closeCameraDeviceOnClose == cameraGraph$Flags.closeCameraDeviceOnClose && this.enableRestartDelays == cameraGraph$Flags.enableRestartDelays;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enableRestartDelays) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.finalizeSessionOnCloseBehavior, (this.awaitRepeatingRequestBeforeCapture.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(false) * 31, 31, this.abortCapturesOnStop)) * 961, 31), 31, this.closeCaptureSessionOnDisconnect), 31, this.closeCameraDeviceOnClose);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.abortCapturesOnStop);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.awaitRepeatingRequestBeforeCapture);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.finalizeSessionOnCloseBehavior + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.closeCaptureSessionOnDisconnect);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.closeCameraDeviceOnClose);
        sb.append(", enableRestartDelays=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enableRestartDelays, ')');
    }
}
