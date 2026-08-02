package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;

/* loaded from: classes8.dex */
public interface JWSVerifier {
    boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL);
}
