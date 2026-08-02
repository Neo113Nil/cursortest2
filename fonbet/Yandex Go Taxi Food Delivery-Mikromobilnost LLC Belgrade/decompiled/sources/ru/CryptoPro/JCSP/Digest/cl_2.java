package ru.CryptoPro.JCSP.Digest;

import defpackage.dy31;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCSP.CStructReader.HmacInfoStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public abstract class cl_2 extends GostHMAC {
    public cl_2() {
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC, javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        super.engineInit(key, algorithmParameterSpec);
        Key key2 = this.hmacKey;
        if ((key2 instanceof ForeignSymmetricKey) || (key2 instanceof SecretKeySpec)) {
            return;
        }
        InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(GostCipher.resource.getString("InvPar"));
        JCSPLogger.warning(invalidAlgorithmParameterException);
        throw invalidAlgorithmParameterException;
    }

    @Override // ru.CryptoPro.JCSP.Digest.GostHMAC
    public void prepare() throws InvalidKeyException {
        if (this.hash == null) {
            JCSPLogger.enter();
            Key key = this.hmacKey;
            JCSPSecretKeyInterface extractSpec = key instanceof SecretKeySpec ? ForeignSymmetricKey.extractSpec(key) : (JCSPSecretKeyInterface) ((ForeignSymmetricKey) key).getSpec();
            try {
                DigestParamsSpec digestParamsSpec = this.digestSpec;
                this.hash = extractSpec.makeNewHMAC(HProv.CALG_HMAC, digestParamsSpec == null ? null : digestParamsSpec.getOID());
                HmacInfoStructure hmacInfoStructure = new HmacInfoStructure(getAlgId());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hmacInfoStructure.write(byteArrayOutputStream);
                    this.hash.setHashParam(5, byteArrayOutputStream.toByteArray());
                    this.opened = true;
                    this.bufferpos = 0;
                    Arrays.fill(this.buffer, (byte) 0);
                    JCSPLogger.exit();
                } catch (StructException e) {
                    InvalidKeyException invalidKeyException = new InvalidKeyException("InvPar");
                    invalidKeyException.initCause(e);
                    throw invalidKeyException;
                }
            } catch (Error e2) {
                destroyAll();
                throw e2;
            } catch (RuntimeException e3) {
                destroyAll();
                throw e3;
            } catch (InvalidKeyException e4) {
                destroyAll();
                JCSPLogger.exit();
                throw e4;
            } catch (MSException e5) {
                destroyAll();
                dy31.s(e5);
            }
        }
    }

    public cl_2(cl_2 cl_2Var) {
        super(cl_2Var);
    }
}
