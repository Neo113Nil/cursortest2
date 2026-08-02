package okhttp3;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.nvf0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lokhttp3/Protocol;", "", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Ljava/lang/String;", "Companion", "nvf0", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "HTTP_3", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Protocol {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Protocol[] $VALUES;
    public static final nvf0 Companion;
    public static final Protocol H2_PRIOR_KNOWLEDGE;
    public static final Protocol HTTP_1_0;
    public static final Protocol HTTP_1_1;
    public static final Protocol HTTP_2;
    public static final Protocol HTTP_3;
    public static final Protocol QUIC;

    @jxi
    public static final Protocol SPDY_3;
    private final String protocol;

    static {
        Protocol protocol = new Protocol("HTTP_1_0", 0, "http/1.0");
        HTTP_1_0 = protocol;
        Protocol protocol2 = new Protocol("HTTP_1_1", 1, "http/1.1");
        HTTP_1_1 = protocol2;
        Protocol protocol3 = new Protocol("SPDY_3", 2, "spdy/3.1");
        SPDY_3 = protocol3;
        Protocol protocol4 = new Protocol("HTTP_2", 3, "h2");
        HTTP_2 = protocol4;
        Protocol protocol5 = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        H2_PRIOR_KNOWLEDGE = protocol5;
        Protocol protocol6 = new Protocol("QUIC", 5, "quic");
        QUIC = protocol6;
        Protocol protocol7 = new Protocol("HTTP_3", 6, "h3");
        HTTP_3 = protocol7;
        Protocol[] protocolArr = {protocol, protocol2, protocol3, protocol4, protocol5, protocol6, protocol7};
        $VALUES = protocolArr;
        $ENTRIES = a.a(protocolArr);
        Companion = new nvf0();
    }

    public Protocol(String str, int i, String str2) {
        this.protocol = str2;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
