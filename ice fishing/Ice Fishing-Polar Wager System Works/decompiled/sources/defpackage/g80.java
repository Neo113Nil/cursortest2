package defpackage;

/* loaded from: classes.dex */
public class g80 extends java.io.IOException {
    public boolean adDC3e2L;

    public static defpackage.g80 F7NU4MC0GW() {
        return new defpackage.g80("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static defpackage.g80 IHQe1A4L2xu() {
        return new defpackage.g80("Protocol message had invalid UTF-8.");
    }

    public static defpackage.g80 adDC3e2L() {
        return new defpackage.g80("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static defpackage.f80 oh6vYeIP() {
        return new defpackage.f80("Protocol message tag had invalid wire type.");
    }

    public static defpackage.g80 r1MBDhnF() {
        return new defpackage.g80("CodedInputStream encountered a malformed varint.");
    }
}
