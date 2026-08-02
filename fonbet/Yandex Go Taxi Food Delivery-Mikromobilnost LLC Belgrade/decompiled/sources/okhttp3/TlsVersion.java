package okhttp3;

import defpackage.jjz0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lokhttp3/TlsVersion;", "", "", "javaName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "jjz0", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TlsVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TlsVersion[] $VALUES;
    public static final jjz0 Companion;
    public static final TlsVersion SSL_3_0;
    public static final TlsVersion TLS_1_0;
    public static final TlsVersion TLS_1_1;
    public static final TlsVersion TLS_1_2;
    public static final TlsVersion TLS_1_3;
    private final String javaName;

    static {
        TlsVersion tlsVersion = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
        TLS_1_3 = tlsVersion;
        TlsVersion tlsVersion2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
        TLS_1_2 = tlsVersion2;
        TlsVersion tlsVersion3 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
        TLS_1_1 = tlsVersion3;
        TlsVersion tlsVersion4 = new TlsVersion("TLS_1_0", 3, "TLSv1");
        TLS_1_0 = tlsVersion4;
        TlsVersion tlsVersion5 = new TlsVersion("SSL_3_0", 4, "SSLv3");
        SSL_3_0 = tlsVersion5;
        TlsVersion[] tlsVersionArr = {tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4, tlsVersion5};
        $VALUES = tlsVersionArr;
        $ENTRIES = a.a(tlsVersionArr);
        Companion = new jjz0();
    }

    public TlsVersion(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }
}
