package ru.CryptoPro.JCSP.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class JCSPSymmetric512KeySpec extends JCSPSecretKeySpec {
    public JCSPSymmetric512KeySpec(CryptParamsInterface cryptParamsInterface, boolean z, EllipticParamsInterface ellipticParamsInterface) throws KeyManagementException {
        super(new AlgIdSpec((OID) null), cryptParamsInterface, HProv.CALG_SYMMETRIC_512, z, ellipticParamsInterface);
    }

    public static JCSPSymmetric512KeySpec fromAgree(JCSPAgreeSecretKeySpec jCSPAgreeSecretKeySpec) throws InvalidKeyException {
        jCSPAgreeSecretKeySpec.getKey().setKeyAlg(HProv.CALG_SYMMETRIC_512);
        return new JCSPSymmetric512KeySpec(jCSPAgreeSecretKeySpec.getKey());
    }

    public JCSPSymmetric512KeySpec(AlgIdInterface algIdInterface, boolean z) {
        super(algIdInterface, z);
    }

    public JCSPSymmetric512KeySpec(HKey hKey) {
        super(hKey);
    }
}
