package app.cash.zipline.loader;

import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class ZiplineFileKt {
    public static final int CURRENT_ZIPLINE_VERSION;
    public static final ByteString MAGIC_PREFIX;
    public static final int SECTION_HEADER_QUICKJS_BYTECODE;

    static {
        ByteString.Companion companion = ByteString.Companion;
        MAGIC_PREFIX = ByteString.Companion.encodeUtf8("ZIPLINE\u0000");
        CURRENT_ZIPLINE_VERSION = 20211020;
        SECTION_HEADER_QUICKJS_BYTECODE = 1;
    }
}
