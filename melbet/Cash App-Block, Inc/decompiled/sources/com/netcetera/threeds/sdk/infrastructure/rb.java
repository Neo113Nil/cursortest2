package com.netcetera.threeds.sdk.infrastructure;

import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class rb extends SecretKeySpec {
    public rb(byte[] bArr) {
        super(bArr, "HMAC");
    }
}
