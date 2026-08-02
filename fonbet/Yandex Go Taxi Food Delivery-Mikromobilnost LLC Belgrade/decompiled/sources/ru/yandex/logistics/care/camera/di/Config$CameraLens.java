package ru.yandex.logistics.care.camera.di;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/care/camera/di/Config$CameraLens", "", "Lru/yandex/logistics/care/camera/di/Config$CameraLens;", "Front", "Back", "sdk-care-camera"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Config$CameraLens {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Config$CameraLens[] $VALUES;
    public static final Config$CameraLens Back;
    public static final Config$CameraLens Front;

    static {
        Config$CameraLens config$CameraLens = new Config$CameraLens("Front", 0);
        Front = config$CameraLens;
        Config$CameraLens config$CameraLens2 = new Config$CameraLens("Back", 1);
        Back = config$CameraLens2;
        Config$CameraLens[] config$CameraLensArr = {config$CameraLens, config$CameraLens2};
        $VALUES = config$CameraLensArr;
        $ENTRIES = a.a(config$CameraLensArr);
    }

    public static Config$CameraLens valueOf(String str) {
        return (Config$CameraLens) Enum.valueOf(Config$CameraLens.class, str);
    }

    public static Config$CameraLens[] values() {
        return (Config$CameraLens[]) $VALUES.clone();
    }
}
