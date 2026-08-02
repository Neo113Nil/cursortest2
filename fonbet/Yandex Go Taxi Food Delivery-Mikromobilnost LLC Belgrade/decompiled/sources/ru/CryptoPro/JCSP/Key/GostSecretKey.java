package ru.CryptoPro.JCSP.Key;

import defpackage.dy31;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.Key.foreign.JCSPForeignSecretKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class GostSecretKey implements SecretKey, JCSPSpecKey {
    protected JCSPSecretKeyInterface spec;

    public GostSecretKey(JCSPSecretKeyInterface jCSPSecretKeyInterface) {
        this.spec = jCSPSecretKeyInterface;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        if (r2.equals(ru.CryptoPro.JCSP.JCSP.TRIPLE_DES_NAME) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        if (r2.equals("TLS") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r2.equals(ru.CryptoPro.JCSP.JCSP.AES_NAME) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
    
        if (r2.equals(ru.CryptoPro.JCSP.JCSP.CP_TRIPLE_DES_112_NAME) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JCSPSecretKeyInterface extractSpec(Key key, int i) throws InvalidKeyException {
        try {
            if (!(key instanceof SecretKeySpec)) {
                return (JCSPSecretKeyInterface) ((JCSPSecretKeyInterface) ((GostSecretKey) key).getSpec()).clone();
            }
            String algorithm = key.getAlgorithm();
            switch (algorithm.hashCode()) {
                case -1917652924:
                    break;
                case -431049019:
                    if (algorithm.equals("GOST28147")) {
                        return new JCSPSecretKeySpec(key.getEncoded(), 26142, i, new AlgIdSpec((OID) null));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 64687:
                    break;
                case 83163:
                    break;
                case 1586911:
                    break;
                case 954016943:
                    if (algorithm.equals("HmacSHA224")) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), HProv.CALG_GENERIC_SECRET, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 954017038:
                    if (algorithm.equals("HmacSHA256")) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), HProv.CALG_GENERIC_SECRET, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 954018090:
                    if (algorithm.equals("HmacSHA384")) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), HProv.CALG_GENERIC_SECRET, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 954019793:
                    if (algorithm.equals("HmacSHA512")) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), HProv.CALG_GENERIC_SECRET, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 964664498:
                    if (algorithm.equals(JCSP.TRIPLE_DES_112_NAME)) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), 26121, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 1712857969:
                    if (algorithm.equals(JCSP.CP_TRIPLE_DES_NAME)) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), 26115, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 1729983970:
                    if (algorithm.equals("GOST3412_2015_K")) {
                        return new JCSPSecretKeySpecK(key.getEncoded(), 26161, i, new AlgIdSpec((OID) null));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 1729983972:
                    if (algorithm.equals("GOST3412_2015_M")) {
                        return new JCSPSecretKeySpecM(key.getEncoded(), 26160, i, new AlgIdSpec((OID) null));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 1752946092:
                    if (algorithm.equals("HmacSHA1")) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), HProv.CALG_GENERIC_SECRET, 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                case 1994929629:
                    if (algorithm.equals(JCSP.CP_AES_NAME)) {
                        return new JCSPForeignSecretKeySpec(key.getEncoded(), HKey.getAESAlgId(key.getEncoded()), 0, new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA));
                    }
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
                default:
                    throw new InvalidKeyException("Invalid key algorithm: ".concat(algorithm));
            }
        } catch (Exception e) {
            dy31.s(e);
            return null;
        }
    }

    public static SecretKey getInstance(JCSPSecretKeyInterface jCSPSecretKeyInterface) {
        if (!(jCSPSecretKeyInterface instanceof JCSPTls1MasterSecretKeySpec) && !(jCSPSecretKeyInterface instanceof JCSPSymmetric512KeySpec) && (jCSPSecretKeyInterface instanceof JCSPForeignSecretKeySpec)) {
            return new ForeignSymmetricKey(jCSPSecretKeyInterface);
        }
        return new GostSecretKey(jCSPSecretKeyInterface);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public void clear() {
        JCSPSecretKeyInterface jCSPSecretKeyInterface = this.spec;
        if (jCSPSecretKeyInterface != null) {
            jCSPSecretKeyInterface.clear();
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        JCSPSecretKeyInterface jCSPSecretKeyInterface = this.spec;
        if (jCSPSecretKeyInterface != null) {
            jCSPSecretKeyInterface.destroy();
        }
    }

    @Override // java.security.Key, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public String getAlgorithm() {
        JCSPSecretKeyInterface jCSPSecretKeyInterface = this.spec;
        return jCSPSecretKeyInterface instanceof JCSPTls1MasterSecretKeySpec ? JCP.GOST_MASTER_KEY_NAME : jCSPSecretKeyInterface instanceof JCSPSymmetric512KeySpec ? "SYMMETRIC512" : jCSPSecretKeyInterface instanceof JCSPSecretKeySpecM ? "GOST3412_2015_M" : jCSPSecretKeyInterface instanceof JCSPSecretKeySpecK ? "GOST3412_2015_K" : "GOST28147";
    }

    @Override // java.security.Key, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key, ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public String getFormat() {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public int getKeySize() {
        return this.spec instanceof JCSPSymmetric512KeySpec ? 512 : 256;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey, ru.CryptoPro.JCP.Key.SpecKey
    public KeyInterface getSpec() {
        return this.spec;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        JCSPSecretKeyInterface jCSPSecretKeyInterface = this.spec;
        if (jCSPSecretKeyInterface != null) {
            return jCSPSecretKeyInterface.isDestroyed();
        }
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey
    public boolean isFromPfx() {
        return false;
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSpecKey
    public void setFromPfx() {
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }
}
