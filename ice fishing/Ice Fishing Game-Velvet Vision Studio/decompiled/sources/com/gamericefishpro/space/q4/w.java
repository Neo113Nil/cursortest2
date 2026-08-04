package com.gamericefishpro.space.q4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class w extends IOException {
    public boolean d;

    public static w a() {
        return new w("Protocol message had invalid UTF-8.");
    }

    public static v b() {
        return new v("Protocol message tag had invalid wire type.");
    }

    public static w c() {
        return new w("CodedInputStream encountered a malformed varint.");
    }

    public static w d() {
        return new w("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static w e() {
        return new w("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
