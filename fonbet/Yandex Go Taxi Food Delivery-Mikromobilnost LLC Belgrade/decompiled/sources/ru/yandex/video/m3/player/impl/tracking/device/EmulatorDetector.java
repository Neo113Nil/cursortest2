package ru.yandex.video.m3.player.impl.tracking.device;

import android.os.Build;
import defpackage.cvu0;
import defpackage.evu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/EmulatorDetector;", "", "()V", "isEmulator", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmulatorDetector {
    public static final int $stable = 0;
    public static final EmulatorDetector INSTANCE = new EmulatorDetector();

    private EmulatorDetector() {
    }

    public final boolean isEmulator() {
        if (cvu0.x(Build.BRAND, "generic", false) && cvu0.x(Build.DEVICE, "generic", false)) {
            return true;
        }
        String str = Build.FINGERPRINT;
        if (cvu0.x(str, "generic", false) || cvu0.x(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (evu0.y(str2, "goldfish", false) || evu0.y(str2, "ranchu", false)) {
            return true;
        }
        String str3 = Build.MODEL;
        if (evu0.y(str3, "google_sdk", false) || evu0.y(str3, "Emulator", false) || evu0.y(str3, "Android SDK built for x86", false) || evu0.y(Build.MANUFACTURER, "Genymotion", false)) {
            return true;
        }
        String str4 = Build.PRODUCT;
        return evu0.y(str4, "sdk_google", false) || evu0.y(str4, "google_sdk", false) || evu0.y(str4, "sdk", false) || evu0.y(str4, "sdk_x86", false) || evu0.y(str4, "sdk_gphone64_arm64", false) || evu0.y(str4, "vbox86p", false) || evu0.y(str4, "emulator", false) || evu0.y(str4, "simulator", false);
    }
}
