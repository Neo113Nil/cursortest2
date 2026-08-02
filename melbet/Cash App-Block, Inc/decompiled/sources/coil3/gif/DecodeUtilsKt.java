package coil3.gif;

import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class DecodeUtilsKt {
    public static final ByteString GIF_HEADER_87A;
    public static final ByteString GIF_HEADER_89A;
    public static final ByteString HEIF_HEADER_FTYP;
    public static final ByteString HEIF_HEADER_HEVC;
    public static final ByteString HEIF_HEADER_HEVX;
    public static final ByteString HEIF_HEADER_MSF1;
    public static final ByteString WEBP_HEADER_RIFF;
    public static final ByteString WEBP_HEADER_VPX8;
    public static final ByteString WEBP_HEADER_WEBP;

    static {
        ByteString.Companion companion = ByteString.Companion;
        GIF_HEADER_87A = ByteString.Companion.encodeUtf8("GIF87a");
        GIF_HEADER_89A = ByteString.Companion.encodeUtf8("GIF89a");
        WEBP_HEADER_RIFF = ByteString.Companion.encodeUtf8("RIFF");
        WEBP_HEADER_WEBP = ByteString.Companion.encodeUtf8("WEBP");
        WEBP_HEADER_VPX8 = ByteString.Companion.encodeUtf8("VP8X");
        HEIF_HEADER_FTYP = ByteString.Companion.encodeUtf8("ftyp");
        HEIF_HEADER_MSF1 = ByteString.Companion.encodeUtf8("msf1");
        HEIF_HEADER_HEVC = ByteString.Companion.encodeUtf8("hevc");
        HEIF_HEADER_HEVX = ByteString.Companion.encodeUtf8("hevx");
    }

    public static final boolean isAnimatedHeif(BufferedSource bufferedSource) {
        if (bufferedSource.rangeEquals(4L, HEIF_HEADER_FTYP)) {
            return bufferedSource.rangeEquals(8L, HEIF_HEADER_MSF1) || bufferedSource.rangeEquals(8L, HEIF_HEADER_HEVC) || bufferedSource.rangeEquals(8L, HEIF_HEADER_HEVX);
        }
        return false;
    }

    public static final boolean isAnimatedWebP(BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, WEBP_HEADER_RIFF) && bufferedSource.rangeEquals(8L, WEBP_HEADER_WEBP) && bufferedSource.rangeEquals(12L, WEBP_HEADER_VPX8) && bufferedSource.request(21L) && ((byte) (bufferedSource.getBuffer().getByte(20L) & 2)) > 0;
    }

    public static final boolean isGif(BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, GIF_HEADER_89A) || bufferedSource.rangeEquals(0L, GIF_HEADER_87A);
    }
}
