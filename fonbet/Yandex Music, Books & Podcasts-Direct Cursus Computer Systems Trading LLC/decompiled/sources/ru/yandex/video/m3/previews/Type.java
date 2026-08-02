package ru.yandex.video.m3.previews;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/previews/Type;", "", "LOW_RES", "HI_RES", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class Type {
    private static final /* synthetic */ Type[] $VALUES;
    public static final Type HI_RES;
    public static final Type LOW_RES;

    static {
        Type type = new Type("LOW_RES", 0);
        LOW_RES = type;
        Type type2 = new Type("HI_RES", 1);
        HI_RES = type2;
        $VALUES = new Type[]{type, type2};
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }
}
