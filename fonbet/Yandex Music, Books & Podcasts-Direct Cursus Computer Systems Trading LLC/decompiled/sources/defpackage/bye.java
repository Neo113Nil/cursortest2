package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public class bye extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public static bye a() {
        return new bye("Protocol message end-group tag did not match expected tag.");
    }

    public static bye b() {
        return new bye("Protocol message contained an invalid tag (zero).");
    }

    public static bye c() {
        return new bye("Protocol message had invalid UTF-8.");
    }

    public static yxe d() {
        return new yxe("Protocol message tag had invalid wire type.");
    }

    public static bye e() {
        return new bye("CodedInputStream encountered a malformed varint.");
    }

    public static bye f() {
        return new bye("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static bye g() {
        return new bye("Failed to parse the message.");
    }

    public static bye h() {
        return new bye("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
