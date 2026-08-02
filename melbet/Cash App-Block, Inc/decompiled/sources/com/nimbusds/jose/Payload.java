package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Payload implements Serializable {
    public final Base64URL base64URL;
    public final byte[] bytes;

    /* renamed from: string, reason: collision with root package name */
    public final String f1028string;

    public Payload(String str) {
        Objects.requireNonNull(str, "The string must not be null");
        this.f1028string = str;
        this.bytes = null;
        this.base64URL = null;
    }

    public final String toString() {
        String str = this.f1028string;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return new String(bArr, StandardCharset.UTF_8);
        }
        Base64URL base64URL = this.base64URL;
        if (base64URL != null) {
            return new String(base64URL.decode(), StandardCharset.UTF_8);
        }
        return null;
    }

    public Payload(byte[] bArr) {
        this.f1028string = null;
        Objects.requireNonNull(bArr, "The byte array must not be null");
        this.bytes = bArr;
        this.base64URL = null;
    }

    public Payload(Base64URL base64URL) {
        this.f1028string = null;
        this.bytes = null;
        Objects.requireNonNull(base64URL, "The Base64URL-encoded object must not be null");
        this.base64URL = base64URL;
    }
}
