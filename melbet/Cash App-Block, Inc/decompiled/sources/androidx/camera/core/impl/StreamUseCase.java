package androidx.camera.core.impl;

/* loaded from: classes3.dex */
public enum StreamUseCase {
    DEFAULT(0),
    PREVIEW(1),
    VIDEO_RECORD(3),
    STILL_CAPTURE(2),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_CALL(5),
    PREVIEW_VIDEO_STILL(4),
    /* JADX INFO: Fake field, exist only in values array */
    CROPPED_RAW(6);

    public final long value;

    StreamUseCase(int i) {
        this.value = i;
    }
}
