package ru.yandex.video.m3.previews;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/previews/PreviewVersion;", "", "V1", "V2", "V3", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class PreviewVersion {
    private static final /* synthetic */ PreviewVersion[] $VALUES;
    public static final PreviewVersion V1;
    public static final PreviewVersion V2;
    public static final PreviewVersion V3;

    static {
        PreviewVersion previewVersion = new PreviewVersion("V1", 0);
        V1 = previewVersion;
        PreviewVersion previewVersion2 = new PreviewVersion("V2", 1);
        V2 = previewVersion2;
        PreviewVersion previewVersion3 = new PreviewVersion("V3", 2);
        V3 = previewVersion3;
        $VALUES = new PreviewVersion[]{previewVersion, previewVersion2, previewVersion3};
    }

    public static PreviewVersion valueOf(String str) {
        return (PreviewVersion) Enum.valueOf(PreviewVersion.class, str);
    }

    public static PreviewVersion[] values() {
        return (PreviewVersion[]) $VALUES.clone();
    }
}
