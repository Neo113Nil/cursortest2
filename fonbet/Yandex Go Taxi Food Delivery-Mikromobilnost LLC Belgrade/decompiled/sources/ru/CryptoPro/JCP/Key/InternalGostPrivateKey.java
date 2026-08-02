package ru.CryptoPro.JCP.Key;

import defpackage.nzs;
import defpackage.puu0;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public abstract class InternalGostPrivateKey implements PrivateKey {
    public static final String INVALID_CIPHER = "InvalidCipherParam";
    public static final String INVALID_PKUP = "InvalidPKUP";
    public static final String NOT_ELLIPTIC = "NotEllipticParam";
    public static final String NOT_GOST = "NotGostParam";
    public static final String NULL_PARAM = "NullParam";
    private static final String a = "InternalGostPrivateKey_class_default";
    private static boolean b;
    protected PrivateKeyInterface spec;
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.Key.resources.key";
    public static final ResourceBundle resource = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault());
    private static final Object c = new Object();
    protected String keyAlgorithm = null;
    protected int keySize = 0;
    protected int digestAlgId = 0;

    static {
        b = true;
        b = ((Boolean) AccessController.doPrivileged(new puu0(9))).booleanValue();
    }

    public InternalGostPrivateKey(PrivateKeyInterface privateKeyInterface) throws InvalidKeySpecException {
        verifySpec(privateKeyInterface);
        this.spec = privateKeyInterface;
        resolveAlgorithm(privateKeyInterface);
        resolveDigestAlgId();
    }

    public static PrivateKeyInterface extractSpec(Key key) throws InvalidKeyException {
        try {
            PrivateKeyInterface privateKeyInterface = (PrivateKeyInterface) ((InternalGostPrivateKey) key).getSpec();
            if (!(key instanceof GostPrivateKey)) {
                return privateKeyInterface;
            }
            if (privateKeyInterface.getParams() instanceof EllipticParamsSpec2012_512) {
                SelfTester_JCP.check(131072);
            } else {
                SelfTester_JCP.check(32768);
            }
            return (PrivateKeyInterface) privateKeyInterface.clone();
        } catch (Exception e) {
            throw ((InvalidKeyException) new InvalidKeyException(e.getMessage()).initCause(e));
        }
    }

    public static boolean ifWrite() {
        return nzs.u(InternalGostPrivateKey.class);
    }

    public static boolean isCheckOfPKUPEnabled() {
        boolean z;
        synchronized (c) {
            z = b;
        }
        return z;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new NotSerializableException();
    }

    public static void setCheckPKUPEnabled(boolean z, boolean z2) {
        JCPPref jCPPref = new JCPPref(InternalGostPrivateKey.class);
        synchronized (c) {
            jCPPref.putBoolean(a, z);
            b = z;
            if (z2) {
                try {
                    jCPPref.sync();
                } catch (BackingStoreException unused) {
                }
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        throw new NotSerializableException();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.keyAlgorithm;
    }

    public int getDigestAlgId() {
        return this.digestAlgId;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    public KeyInterface getSpec() {
        return this.spec;
    }

    public Object readResolve() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void resolveAlgorithm(PrivateKeyInterface privateKeyInterface) {
        if (privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256)) {
            this.keyAlgorithm = JCP.GOST_EL_2012_256_NAME;
            this.keySize = 256;
            return;
        }
        if (privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
            this.keyAlgorithm = JCP.GOST_DH_2012_256_NAME;
            this.keySize = 256;
            return;
        }
        if (privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512)) {
            this.keyAlgorithm = JCP.GOST_EL_2012_512_NAME;
            this.keySize = 512;
        } else if (privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
            this.keyAlgorithm = JCP.GOST_DH_2012_512_NAME;
            this.keySize = 512;
        } else if (privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_98)) {
            this.keyAlgorithm = "GOST3410DHEL";
            this.keySize = 256;
        } else {
            this.keyAlgorithm = JCP.GOST_EL_DEGREE_NAME;
            this.keySize = 256;
        }
    }

    public void resolveDigestAlgId() {
    }

    public String toString() {
        return "CryptoPro Gost PrivateKey (" + this.keyAlgorithm + ") with parameters: " + this.spec.getParams().getOID();
    }

    public void verifySpec(PrivateKeyInterface privateKeyInterface) throws InvalidKeySpecException {
        if (privateKeyInterface == null) {
            throw new InvalidKeySpecException(resource.getString(NULL_PARAM));
        }
        if (!privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_19) && !privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) && !privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_98) && !privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !privateKeyInterface.getParams().getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
            throw new InvalidKeySpecException(resource.getString(NOT_GOST));
        }
    }

    public Object writeReplace() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public static void setCheckPKUPEnabled(boolean z) {
        setCheckPKUPEnabled(z, false);
    }
}
