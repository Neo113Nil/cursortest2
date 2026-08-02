package ru.CryptoPro.JCSP.Key.foreign;

import java.security.KeyManagementException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.HKey;

/* loaded from: classes4.dex */
public class JCSPForeignSecretKeySpec extends JCSPSecretKeySpec {
    public JCSPForeignSecretKeySpec(int i, boolean z) throws KeyManagementException {
        super(new AlgIdSpecForeign((OID) null), null, i, z, null);
    }

    public JCSPForeignSecretKeySpec(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
    }

    public JCSPForeignSecretKeySpec(AlgIdInterface algIdInterface, boolean z) {
        super(algIdInterface, z);
    }

    public JCSPForeignSecretKeySpec(HKey hKey) {
        super(hKey, hKey.getKeyAlgorithmGroup());
    }

    public JCSPForeignSecretKeySpec(byte[] bArr, int i, int i2, AlgIdInterface algIdInterface) {
        super(bArr, i, i2, algIdInterface);
    }
}
