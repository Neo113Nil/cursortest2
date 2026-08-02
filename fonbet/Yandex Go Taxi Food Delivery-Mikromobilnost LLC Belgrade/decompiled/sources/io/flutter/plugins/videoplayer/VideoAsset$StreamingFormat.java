package io.flutter.plugins.videoplayer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class VideoAsset$StreamingFormat {
    private static final /* synthetic */ VideoAsset$StreamingFormat[] $VALUES;
    public static final VideoAsset$StreamingFormat DYNAMIC_ADAPTIVE;
    public static final VideoAsset$StreamingFormat HTTP_LIVE;
    public static final VideoAsset$StreamingFormat SMOOTH;
    public static final VideoAsset$StreamingFormat UNKNOWN;

    static {
        VideoAsset$StreamingFormat videoAsset$StreamingFormat = new VideoAsset$StreamingFormat("UNKNOWN", 0);
        UNKNOWN = videoAsset$StreamingFormat;
        VideoAsset$StreamingFormat videoAsset$StreamingFormat2 = new VideoAsset$StreamingFormat("SMOOTH", 1);
        SMOOTH = videoAsset$StreamingFormat2;
        VideoAsset$StreamingFormat videoAsset$StreamingFormat3 = new VideoAsset$StreamingFormat("DYNAMIC_ADAPTIVE", 2);
        DYNAMIC_ADAPTIVE = videoAsset$StreamingFormat3;
        VideoAsset$StreamingFormat videoAsset$StreamingFormat4 = new VideoAsset$StreamingFormat("HTTP_LIVE", 3);
        HTTP_LIVE = videoAsset$StreamingFormat4;
        $VALUES = new VideoAsset$StreamingFormat[]{videoAsset$StreamingFormat, videoAsset$StreamingFormat2, videoAsset$StreamingFormat3, videoAsset$StreamingFormat4};
    }

    public static VideoAsset$StreamingFormat valueOf(String str) {
        return (VideoAsset$StreamingFormat) Enum.valueOf(VideoAsset$StreamingFormat.class, str);
    }

    public static VideoAsset$StreamingFormat[] values() {
        return (VideoAsset$StreamingFormat[]) $VALUES.clone();
    }
}
