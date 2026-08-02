package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ContentCaptureEventType {
    public static final /* synthetic */ ContentCaptureEventType[] $VALUES;
    public static final ContentCaptureEventType VIEW_APPEAR;
    public static final ContentCaptureEventType VIEW_DISAPPEAR;

    static {
        ContentCaptureEventType contentCaptureEventType = new ContentCaptureEventType("VIEW_APPEAR", 0);
        VIEW_APPEAR = contentCaptureEventType;
        ContentCaptureEventType contentCaptureEventType2 = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        VIEW_DISAPPEAR = contentCaptureEventType2;
        $VALUES = new ContentCaptureEventType[]{contentCaptureEventType, contentCaptureEventType2};
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }
}
