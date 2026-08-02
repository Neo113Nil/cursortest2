package ru.yandex.logistics.care.camera.di;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/care/camera/di/Config$CameraControl", "", "Lru/yandex/logistics/care/camera/di/Config$CameraControl;", "Flash", "LensSelector", "sdk-care-camera"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Config$CameraControl {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Config$CameraControl[] $VALUES;
    public static final Config$CameraControl Flash;
    public static final Config$CameraControl LensSelector;

    static {
        Config$CameraControl config$CameraControl = new Config$CameraControl("Flash", 0);
        Flash = config$CameraControl;
        Config$CameraControl config$CameraControl2 = new Config$CameraControl("LensSelector", 1);
        LensSelector = config$CameraControl2;
        Config$CameraControl[] config$CameraControlArr = {config$CameraControl, config$CameraControl2};
        $VALUES = config$CameraControlArr;
        $ENTRIES = a.a(config$CameraControlArr);
    }

    public static Config$CameraControl valueOf(String str) {
        return (Config$CameraControl) Enum.valueOf(Config$CameraControl.class, str);
    }

    public static Config$CameraControl[] values() {
        return (Config$CameraControl[]) $VALUES.clone();
    }
}
