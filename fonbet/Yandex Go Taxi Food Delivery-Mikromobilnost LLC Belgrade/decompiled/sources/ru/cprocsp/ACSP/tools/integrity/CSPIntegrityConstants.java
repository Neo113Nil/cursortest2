package ru.cprocsp.ACSP.tools.integrity;

import defpackage.g8e;
import java.text.DateFormat;
import java.util.Locale;
import ru.cprocsp.ACSP.tools.common.CSPContextConstants;

/* loaded from: classes4.dex */
public interface CSPIntegrityConstants extends CSPContextConstants {
    public static final int CHECK_INTEGRITY_INVALID = 1;
    public static final String CHECK_INTEGRITY_LAST_DATE = "LastDate";
    public static final String CHECK_INTEGRITY_LAST_STATUS = "LastStatus";
    public static final int CHECK_INTEGRITY_SUCCESS = 0;
    public static final int CHECK_INTEGRITY_TIMEOUT = 600000;
    public static final int CHECK_INTEGRITY_UNKNOWN = -1;
    public static final String DIGEST = "digest";
    public static final String DIGESTS_DIRECTORY = "digests";
    public static final LibraryDigest DIGEST_ARM;
    public static final LibraryDigest DIGEST_ARM64;
    public static final LibraryDigest DIGEST_X86;
    public static final LibraryDigest DIGEST_X86_64;
    public static final DexDigest DEX_DIGEST = new DexDigest();
    public static final DateFormat INTEGRITY_DATE_FORMAT = DateFormat.getDateTimeInstance(3, 3, Locale.getDefault());

    static {
        int i = 0;
        DIGEST_ARM = new LibraryDigest("digests32", "armeabi-v7a", "armeabi_v7a", i);
        DIGEST_ARM64 = new LibraryDigest("digests64", "arm64-v8a", "arm64_v8a", i);
        String str = "x86";
        DIGEST_X86 = new LibraryDigest("digestsx86", str, str, i);
        String str2 = "x86_64";
        DIGEST_X86_64 = new LibraryDigest("digestsx86_64", str2, str2, i);
    }

    public static class DexDigest {
        public final String digestFileName;
        public final String digestResourceId;

        private DexDigest(String str) {
            this.digestFileName = str;
            this.digestResourceId = g8e.o("raw/", str);
        }

        public /* synthetic */ DexDigest() {
            this("dexdigests");
        }
    }

    public static class LibraryDigest {
        public final String architecture;
        public final String digestFileName;
        public final String digestResourceId;
        public final String extraDigestResourceId;
        public final String splitApkNameSuffix;

        private LibraryDigest(String str, String str2, String str3) {
            this.digestFileName = str;
            this.digestResourceId = g8e.o("raw/", str);
            this.extraDigestResourceId = g8e.o("raw/extra_", str);
            this.architecture = str2;
            this.splitApkNameSuffix = str3;
        }

        public /* synthetic */ LibraryDigest(String str, String str2, String str3, int i) {
            this(str, str2, str3);
        }
    }
}
