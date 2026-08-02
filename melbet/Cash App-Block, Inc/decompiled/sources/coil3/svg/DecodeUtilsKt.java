package coil3.svg;

import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class DecodeUtilsKt {
    public static final ByteString LEFT_ANGLE_BRACKET;
    public static final ByteString SVG_TAG;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SVG_TAG = ByteString.Companion.encodeUtf8("<svg");
        LEFT_ANGLE_BRACKET = ByteString.Companion.encodeUtf8("<");
    }

    public static final boolean isSvg(BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, LEFT_ANGLE_BRACKET) && bufferedSource.indexOf(1024L, SVG_TAG) != -1;
    }
}
