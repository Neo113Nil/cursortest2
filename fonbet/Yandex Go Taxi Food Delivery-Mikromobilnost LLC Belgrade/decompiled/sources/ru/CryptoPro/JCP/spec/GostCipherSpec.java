package ru.CryptoPro.JCP.spec;

import java.security.PublicKey;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.params.GostCipherSpecImpl;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public class GostCipherSpec extends GostCipherSpecImpl {
    public GostCipherSpec(IvParameterSpec ivParameterSpec, ParamsInterface paramsInterface) {
        super(ivParameterSpec, paramsInterface);
    }

    public GostCipherSpec(byte[] bArr, PublicKey publicKey) {
        super(bArr, publicKey);
    }

    public GostCipherSpec(byte[] bArr, OID oid) {
        super(bArr, oid);
    }

    public GostCipherSpec(byte[] bArr, ParamsInterface paramsInterface) {
        super(bArr, paramsInterface);
    }
}
