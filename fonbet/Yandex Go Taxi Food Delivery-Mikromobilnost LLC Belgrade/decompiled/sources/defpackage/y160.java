package defpackage;

import com.yandex.mob.okhttp.metrics.MobNetworkSettingsProvider$MobNetworkType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class y160 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobNetworkSettingsProvider$MobNetworkType.values().length];
        try {
            iArr[MobNetworkSettingsProvider$MobNetworkType.Cellular.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobNetworkSettingsProvider$MobNetworkType.Wifi.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobNetworkSettingsProvider$MobNetworkType.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
