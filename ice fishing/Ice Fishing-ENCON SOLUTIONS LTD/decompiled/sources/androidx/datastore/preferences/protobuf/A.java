package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class A extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2299a;

    public static A a() {
        return new A("Protocol message had invalid UTF-8.");
    }

    public static C0125z b() {
        return new C0125z("Protocol message tag had invalid wire type.");
    }

    public static A c() {
        return new A("CodedInputStream encountered a malformed varint.");
    }

    public static A d() {
        return new A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static A e() {
        return new A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
