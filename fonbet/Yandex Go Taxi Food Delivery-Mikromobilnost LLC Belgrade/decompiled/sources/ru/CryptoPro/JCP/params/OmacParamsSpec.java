package ru.CryptoPro.JCP.params;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class OmacParamsSpec implements AlgorithmParameterSpec {
    public byte[] a;
    public final OmacTransportInterface b;
    public final byte[] c;
    public final boolean w;

    public OmacParamsSpec(OmacTransportInterface omacTransportInterface, byte[] bArr, boolean z) {
        this.a = null;
        this.c = null;
        this.w = false;
        this.b = omacTransportInterface;
        if (bArr != null) {
            this.c = Array.copy(bArr);
        }
        this.w = z;
    }

    public byte[] getIvValue() {
        return this.c;
    }

    public byte[] getOmacValue() throws IOException {
        OmacTransportInterface omacTransportInterface = this.b;
        if (omacTransportInterface != null) {
            this.a = omacTransportInterface.getOmac();
        }
        return this.a;
    }

    public boolean isCms() {
        return this.w;
    }

    public void setOmacValue(byte[] bArr) {
        if (bArr != null) {
            this.a = Array.copy(bArr);
        }
    }

    public OmacParamsSpec(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.w = false;
        if (bArr != null) {
            this.a = Array.copy(bArr);
        }
    }

    public OmacParamsSpec(byte[] bArr, byte[] bArr2) {
        this(bArr);
        if (bArr2 != null) {
            this.c = Array.copy(bArr2);
        }
    }
}
