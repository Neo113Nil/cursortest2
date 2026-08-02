package ru.CryptoPro.JCP.params;

import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;

/* loaded from: classes4.dex */
public interface PKUPSignatureInterface extends AlgorithmParameterSpec {
    public static final int DEFAULT_INTERVAL = 15;
    public static final int DEFAULT_UNIT = 2;
    public static final OID PK_UP_OID_SIG = new OID(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_key_usage_period);
    public static final OID PK_UP_OID_EXC = new OID(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_key_usage_period);

    Extension getExchangePKUPExtension() throws InvalidParameterException;

    Extension getSignaturePKUPExtension() throws InvalidParameterException;
}
