package ru.CryptoPro.JCSP.Sign.eddsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.Sign.JCSPCryptoProSign;

/* loaded from: classes4.dex */
public class JCSPEDDSASign extends JCSPCryptoProSign {
    public JCSPEDDSASign() {
        this("Ed25519");
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateAlgorithms(String str, String str2) {
        if (str2.equalsIgnoreCase("Ed25519") || str2.equalsIgnoreCase("CP_Ed25519")) {
            return str.equalsIgnoreCase("Ed25519") || str.equalsIgnoreCase("CP_Ed25519") || str.equalsIgnoreCase(JCP.SIGN_EDDSA_OID);
        }
        return false;
    }

    public JCSPEDDSASign(String str) {
        super(str, "GenNoHash");
    }
}
