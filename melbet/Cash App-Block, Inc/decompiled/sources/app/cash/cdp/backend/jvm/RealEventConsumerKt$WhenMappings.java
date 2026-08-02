package app.cash.cdp.backend.jvm;

import app.cash.cdp.api.providers.DeviceInfo;
import app.cash.cdp.api.providers.NetworkType;
import app.cash.cdp.api.providers.OperatingSystemInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class RealEventConsumerKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[NetworkType.values().length];
        try {
            NetworkType networkType = NetworkType.BLUETOOTH;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            NetworkType networkType2 = NetworkType.BLUETOOTH;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            NetworkType networkType3 = NetworkType.BLUETOOTH;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[DeviceInfo.Screen.Orientation.values().length];
        try {
            DeviceInfo.Screen.Orientation orientation = DeviceInfo.Screen.Orientation.PORTRAIT;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            DeviceInfo.Screen.Orientation orientation2 = DeviceInfo.Screen.Orientation.PORTRAIT;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[OperatingSystemInfo.Name.values().length];
        try {
            OperatingSystemInfo.Name name = OperatingSystemInfo.Name.ANDROID;
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
