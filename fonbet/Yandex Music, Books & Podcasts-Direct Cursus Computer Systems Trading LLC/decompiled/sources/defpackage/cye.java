package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class cye extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public static cye a() {
        return new cye("Protocol message had invalid UTF-8.");
    }

    public static zxe b() {
        return new zxe("Protocol message tag had invalid wire type.");
    }

    public static cye c() {
        return new cye("CodedInputStream encountered a malformed varint.");
    }

    public static cye d() {
        return new cye("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static cye e() {
        return new cye("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
