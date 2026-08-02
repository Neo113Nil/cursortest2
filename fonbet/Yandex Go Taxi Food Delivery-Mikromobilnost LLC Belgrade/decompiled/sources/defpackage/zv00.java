package defpackage;

import com.yandex.go.feed_video.domain.MediaItem$StreamType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class zv00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MediaItem$StreamType.values().length];
        try {
            iArr[MediaItem$StreamType.DASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediaItem$StreamType.DASH_MB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MediaItem$StreamType.HLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
