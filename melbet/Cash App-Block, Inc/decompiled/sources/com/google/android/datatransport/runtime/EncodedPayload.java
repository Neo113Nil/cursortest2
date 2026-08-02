package com.google.android.datatransport.runtime;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class EncodedPayload {
    public final byte[] bytes;

    /* renamed from: encoding, reason: collision with root package name */
    public final Encoding f989encoding;

    public EncodedPayload(Encoding encoding2, byte[] bArr) {
        if (encoding2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("encoding is null");
            throw null;
        }
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("bytes is null");
            throw null;
        }
        this.f989encoding = encoding2;
        this.bytes = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f989encoding.equals(encodedPayload.f989encoding)) {
            return Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.bytes) ^ ((this.f989encoding.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f989encoding + ", bytes=[...]}";
    }
}
