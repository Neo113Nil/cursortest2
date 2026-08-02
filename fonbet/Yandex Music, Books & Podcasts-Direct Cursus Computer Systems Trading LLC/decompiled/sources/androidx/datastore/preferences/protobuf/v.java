package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class v extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public static class a extends v {
        private static final long serialVersionUID = 3283890091615336259L;
    }

    public static v a() {
        return new v("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static v c() {
        return new v("CodedInputStream encountered a malformed varint.");
    }

    public static v d() {
        return new v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static v e() {
        return new v("Failed to parse the message.");
    }

    public static v f() {
        return new v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
