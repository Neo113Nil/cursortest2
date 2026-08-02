package ru.CryptoPro.JCP.spec;

import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes4.dex */
public class PublicKeyBlobSpec extends X509EncodedKeySpec {
    public final boolean a;

    public PublicKeyBlobSpec(byte[] bArr, boolean z) {
        super(bArr);
        this.a = z;
    }

    public boolean isStrictExport() {
        return this.a;
    }

    public PublicKeyBlobSpec(byte[] bArr) {
        this(bArr, false);
    }
}
