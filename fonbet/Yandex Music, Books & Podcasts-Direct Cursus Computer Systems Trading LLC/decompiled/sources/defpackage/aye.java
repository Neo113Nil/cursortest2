package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public class aye extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public static aye a() {
        return new aye("Protocol message had invalid UTF-8.");
    }

    public static xxe b() {
        return new xxe("Protocol message tag had invalid wire type.");
    }

    public static aye c() {
        return new aye("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static aye d() {
        return new aye("Failed to parse the message.");
    }

    public static aye e() {
        return new aye("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
