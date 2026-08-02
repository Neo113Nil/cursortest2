package ru.CryptoPro.JCP.params;

import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
public class GostCipherSpecImpl implements AlgorithmParameterSpec {
    public final IvParameterSpec a;
    public final ParamsInterface b;
    public final PublicKey c;

    public GostCipherSpecImpl(byte[] bArr, OID oid) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new IvParameterSpec(bArr);
        this.b = CryptParamsSpec.getInstance(oid);
    }

    public ParamsInterface getCryptParameters() {
        return this.b;
    }

    public byte[] getIV() {
        return this.a.getIV();
    }

    public IvParameterSpec getIvParameters() {
        return this.a;
    }

    public PublicKey getPublicKey() {
        return this.c;
    }

    public GostCipherSpecImpl(byte[] bArr, PublicKey publicKey) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new IvParameterSpec(bArr);
        this.c = publicKey;
    }

    public GostCipherSpecImpl(IvParameterSpec ivParameterSpec, ParamsInterface paramsInterface) {
        this.c = null;
        this.a = ivParameterSpec;
        this.b = paramsInterface;
    }

    public GostCipherSpecImpl(byte[] bArr, ParamsInterface paramsInterface) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new IvParameterSpec(bArr);
        this.b = paramsInterface;
    }
}
