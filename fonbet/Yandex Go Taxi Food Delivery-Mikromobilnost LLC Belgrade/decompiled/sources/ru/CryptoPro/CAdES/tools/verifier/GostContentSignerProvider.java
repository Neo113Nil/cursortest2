package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.she;
import defpackage.u2;
import defpackage.xr1;
import java.io.OutputStream;
import java.security.PrivateKey;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;

/* loaded from: classes4.dex */
public class GostContentSignerProvider implements she {
    public final PrivateKey a;
    public final SignatureOutputStream b;

    public GostContentSignerProvider(PrivateKey privateKey, String str, Options options) throws CAdESException {
        this.a = privateKey;
        try {
            this.b = new SignatureOutputStream(new xr1(new u2(AlgorithmUtility.keyAlgToSignatureOid(privateKey.getAlgorithm()))), str, privateKey, (options == null || options.csp() == null || !options.csp().isUseKeyLocalContextForHash()) ? false : true);
        } catch (OperatorCreationException e) {
            throw new CAdESException(e, IAdESException.ecInternal);
        }
    }

    @Override // defpackage.she
    public xr1 getAlgorithmIdentifier() {
        return new xr1(new u2(AlgorithmUtility.keyAlgToSignatureOid(this.a.getAlgorithm())));
    }

    @Override // defpackage.she
    public OutputStream getOutputStream() {
        return this.b;
    }

    @Override // defpackage.she
    public byte[] getSignature() {
        return this.b.sign();
    }

    public GostContentSignerProvider(PrivateKey privateKey, String str) throws CAdESException {
        this(privateKey, str, null);
    }
}
