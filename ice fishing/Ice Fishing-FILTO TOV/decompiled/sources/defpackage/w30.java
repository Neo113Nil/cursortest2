package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class w30 extends IOException {
    public boolean OOA6hdeuvCS;

    public static w30 GWasM1elztuh() {
        return new w30("Protocol message had invalid UTF-8.");
    }

    public static w30 OOA6hdeuvCS() {
        return new w30("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static w30 X1lG3V04pd() {
        return new w30("CodedInputStream encountered a malformed varint.");
    }

    public static v30 Yi7zF1RB1() {
        return new v30("Protocol message tag had invalid wire type.");
    }

    public static w30 xqGvceK5x() {
        return new w30("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
