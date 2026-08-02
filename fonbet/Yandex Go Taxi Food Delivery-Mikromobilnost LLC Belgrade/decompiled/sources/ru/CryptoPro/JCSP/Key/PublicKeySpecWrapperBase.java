package ru.CryptoPro.JCSP.Key;

import defpackage.dy31;
import defpackage.ny61;
import defpackage.oyr;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.ShortBufferException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.KeyStore.KeyIsNotExportableException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.CSPVersionDependentAlgorithms;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes4.dex */
public abstract class PublicKeySpecWrapperBase extends cl_7 implements Destroyable {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.tools.resources.checker";
    public static final int CP_CRYPT_NOKEYWLOCK = 64;
    public static final boolean USE_PUBLIC_KEY_PROTECTED;
    protected static final String a;
    private static final String h = "Invalid state of the public key. It may happen 1) in case of HSM if the key's provider context has been closed unexpectedly, or 2) in case of enabled strengthened key control in CSP if the key was declared as untrusted (e.g. the key was not created with help of KeyFactory or it has a foreign implementation), or 3) because the key was destroyed in code (e.g. key.destroy()), or 4) in case of an unhandled failure. Try to create or verify signature again.";
    public static final ResourceBundle resource;
    protected final PublicKeyBlob b;
    protected final boolean c;
    private final KeyValue[] d;
    private final boolean e;
    private final AlgorithmGroups.KeyAlgorithmGroup f;
    private volatile transient boolean g = false;

    public static class ProviderContext {
        private final HProv a;
        private final boolean b;

        public ProviderContext(HProv hProv, boolean z) {
            this.a = hProv;
            this.b = z;
        }

        public HProv getProviderContext() {
            return this.a;
        }

        public boolean isPoolContext() {
            return this.b;
        }
    }

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCP.tools.resources.checker", Locale.getDefault());
        resource = bundle;
        a = bundle.getString("encrypt.not.support");
        USE_PUBLIC_KEY_PROTECTED = GetProperty.getBooleanProperty("use_public_key_protected", true);
    }

    public PublicKeySpecWrapperBase(PublicKeySpecWrapperBase publicKeySpecWrapperBase) throws CloneNotSupportedException {
        int i = 0;
        JCSPLogger.subEnter();
        this.b = publicKeySpecWrapperBase.b;
        this.e = publicKeySpecWrapperBase.e;
        this.f = publicKeySpecWrapperBase.f;
        this.c = publicKeySpecWrapperBase.c;
        this.d = new KeyValue[publicKeySpecWrapperBase.d.length];
        while (true) {
            KeyValue[] keyValueArr = this.d;
            if (i >= keyValueArr.length) {
                a(publicKeySpecWrapperBase.d, keyValueArr);
                JCSPLogger.subExit();
                return;
            } else {
                keyValueArr[i] = new KeyValue();
                i++;
            }
        }
    }

    private void c() {
        JCSPLogger.subEnter();
        if (!USE_PUBLIC_KEY_PROTECTED) {
            ny61.r("Cannot restore unprotected key.");
            return;
        }
        f().lock();
        try {
            a(a());
            a(new KeyValue[]{this.d[a()]});
            f().unlock();
            JCSPLogger.subExit();
        } catch (Throwable th) {
            f().unlock();
            throw th;
        }
    }

    private Lock d(int i) {
        return this.d[i].e;
    }

    public abstract int a();

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        r3.destroyHash();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
    
        r4 = f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fb, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(HHash hHash, byte[] bArr, int i) throws SignatureException {
        boolean a2;
        boolean z;
        boolean a3;
        JCSPLogger.subEnter();
        HHash hHash2 = null;
        if (CSPVersionDependentAlgorithms.isNoKeyWLockSupported()) {
            int i2 = i | 64;
            if (USE_PUBLIC_KEY_PROTECTED) {
                try {
                    e().lock();
                    try {
                        z = cl_7.a(hHash, bArr, g(), i2);
                        e().unlock();
                    } finally {
                    }
                } catch (Exception e) {
                    JCSPLogger.subThrown(e);
                    f().lock();
                    try {
                        try {
                            c();
                            HKey g = g();
                            if (g.hasEqualProvider(hHash.getProvHandle())) {
                                a3 = cl_7.a(hHash, bArr, g, i2);
                            } else {
                                hHash2 = a(hHash, g);
                                a3 = cl_7.a(hHash2, bArr, g, i2);
                            }
                            z = a3;
                        } catch (Exception e2) {
                            throw new SignatureException(b(e2), e2);
                        }
                    } finally {
                    }
                }
            } else {
                if (this.g) {
                    ny61.r("The key has been destroyed.");
                    return false;
                }
                try {
                    z = cl_7.a(hHash, bArr, g(), i2);
                } catch (Exception e3) {
                    throw new SignatureException(b(e3), e3);
                }
            }
        } else if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    z = cl_7.a(hHash, bArr, g(), i);
                    e().unlock();
                } finally {
                }
            } catch (Exception e4) {
                JCSPLogger.subThrown(e4);
                f().lock();
                try {
                    try {
                        c();
                        HKey g2 = g();
                        if (g2.hasEqualProvider(hHash.getProvHandle())) {
                            a2 = cl_7.a(hHash, bArr, g2, i);
                        } else {
                            hHash2 = a(hHash, g2);
                            a2 = cl_7.a(hHash2, bArr, g2, i);
                        }
                        z = a2;
                    } finally {
                    }
                } catch (Exception e5) {
                    throw new SignatureException(b(e5), e5);
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return false;
            }
            e().lock();
            try {
                try {
                    z = cl_7.a(hHash, bArr, g(), i);
                    Lock e6 = e();
                    e6.unlock();
                } finally {
                }
            } catch (Exception e7) {
                throw new SignatureException(b(e7), e7);
            }
        }
        JCSPLogger.subExit();
        return z;
    }

    public abstract void b();

    public void b(int i) throws InvalidKeyException {
        JCSPLogger.subEnter();
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    cl_7.a(i, g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    cl_7.a(i, g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return;
            }
            cl_7.a(i, g());
        }
        JCSPLogger.subExit();
    }

    public abstract PublicKeySpecWrapperBase d() throws CloneNotSupportedException;

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        synchronized (this) {
            try {
                if (!this.g) {
                    b();
                    this.g = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Lock e() {
        return c(a());
    }

    public Lock f() {
        return d(a());
    }

    public HKey g() {
        return e(a());
    }

    public int getPadding() {
        int c;
        JCSPLogger.subEnter();
        if (this.f == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            ny61.g(a);
            return 0;
        }
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    c = cl_7.c(g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    c = cl_7.c(g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return 0;
            }
            c = cl_7.c(g());
        }
        JCSPLogger.subExit();
        return c;
    }

    public int h() {
        int a2;
        JCSPLogger.subEnter();
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    a2 = cl_7.a(g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    a2 = cl_7.a(g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return 0;
            }
            a2 = cl_7.a(g());
        }
        JCSPLogger.subExit();
        return a2;
    }

    public int i() {
        int b;
        JCSPLogger.subEnter();
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    b = cl_7.b(g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    b = cl_7.b(g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return 0;
            }
            b = cl_7.b(g());
        }
        JCSPLogger.subExit();
        return b;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        boolean z;
        synchronized (this) {
            z = this.g;
        }
        return z;
    }

    public byte[] j() {
        byte[] d;
        JCSPLogger.subEnter();
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    d = cl_7.d(g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    d = cl_7.d(g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return null;
            }
            d = cl_7.d(g());
        }
        JCSPLogger.subExit();
        return d;
    }

    public void k() {
        a(this.d);
    }

    public ProviderContext l() {
        JCSPLogger.subEnter();
        HProv instanceByParamSet = HProv.getInstanceByParamSet(this.b.getParams());
        if (this.c) {
            instanceByParamSet.createWithoutContainer(null);
        } else {
            instanceByParamSet.createWithoutContainer();
        }
        JCSPLogger.subExit();
        return new ProviderContext(instanceByParamSet, false);
    }

    public HHash prepareHash(int i, ParamsInterface paramsInterface) {
        HHash a2;
        JCSPLogger.subEnter();
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    a2 = cl_7.a(i, (byte[]) null, paramsInterface, g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    a2 = cl_7.a(i, (byte[]) null, paramsInterface, g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return null;
            }
            a2 = cl_7.a(i, (byte[]) null, paramsInterface, g());
        }
        JCSPLogger.subExit();
        return a2;
    }

    public void setPadding(int i) {
        JCSPLogger.subEnter();
        if (this.f == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            ny61.g(a);
            return;
        }
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                try {
                    cl_7.b(i, g());
                    e().unlock();
                } catch (Throwable th) {
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    cl_7.b(i, g());
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return;
            }
            cl_7.b(i, g());
        }
        JCSPLogger.subExit();
    }

    public static class KeyValue {
        private HKey a;
        private boolean b;
        private final ReadWriteLock c;
        private final Lock d;
        private final Lock e;

        public KeyValue() {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.c = reentrantReadWriteLock;
            this.d = reentrantReadWriteLock.readLock();
            this.e = reentrantReadWriteLock.writeLock();
        }
    }

    private HKey e(int i) {
        return this.d[i].a;
    }

    public PublicKeySpecWrapperBase(PublicKeyBlob publicKeyBlob, boolean z, boolean z2, int i) {
        int i2 = 0;
        JCSPLogger.subEnter();
        this.b = publicKeyBlob;
        this.e = z;
        this.f = publicKeyBlob.getKeyAlgorithmGroup();
        this.c = z2;
        this.d = new KeyValue[i];
        while (true) {
            KeyValue[] keyValueArr = this.d;
            if (i2 >= keyValueArr.length) {
                JCSPLogger.subExit();
                return;
            } else {
                keyValueArr[i2] = new KeyValue();
                i2++;
            }
        }
    }

    private Lock c(int i) {
        return this.d[i].d;
    }

    private static String b(Exception exc) {
        String a2 = a(exc);
        return a2 == null ? h : "Invalid state of the public key. It may happen 1) in case of HSM if the key's provider context has been closed unexpectedly, or 2) in case of enabled strengthened key control in CSP if the key was declared as untrusted (e.g. the key was not created with help of KeyFactory or it has a foreign implementation), or 3) because the key was destroyed in code (e.g. key.destroy()), or 4) in case of an unhandled failure. Try to create or verify signature again. Failed with error ".concat(a2);
    }

    public int b(boolean z, int i) {
        if (this.g) {
            ny61.r("The key has been destroyed.");
            return 0;
        }
        if (!USE_PUBLIC_KEY_PROTECTED) {
            return g().getDecryptBufferLength(z, i);
        }
        e().lock();
        try {
            return g().getDecryptBufferLength(z, i);
        } finally {
            e().unlock();
        }
    }

    public void b(boolean z, byte[] bArr, int[] iArr, int i) throws ShortBufferException {
        if (this.g) {
            ny61.r("The key has been destroyed.");
            return;
        }
        if (!USE_PUBLIC_KEY_PROTECTED) {
            g().decrypt(z, bArr, iArr, i);
            return;
        }
        e().lock();
        try {
            g().decrypt(z, bArr, iArr, i);
        } finally {
            e().unlock();
        }
    }

    public int a(boolean z, int i) {
        if (this.g) {
            ny61.r("The key has been destroyed.");
            return 0;
        }
        if (!USE_PUBLIC_KEY_PROTECTED) {
            return g().getEncryptBufferLength(z, i);
        }
        e().lock();
        try {
            return g().getEncryptBufferLength(z, i);
        } finally {
            e().unlock();
        }
    }

    private static String a(Exception exc) {
        Throwable th = exc;
        while (th != null) {
            if (th instanceof MSException) {
                return oyr.r(new StringBuilder(HexString.STR_0x), ((MSException) th).getDescription());
            }
            String message = th.getMessage();
            if (message != null && message.contains(MSException.MSException_TAG)) {
                return message.substring(message.indexOf(MSException.MSException_TAG) + 13).trim();
            }
            th = exc.getCause();
        }
        return null;
    }

    private static HHash a(HHash hHash, HKey hKey) {
        int hashAlgId = hHash.getHashAlgId();
        byte[] hash = hHash.getHash();
        OID hashOID = hHash.getHashOID();
        return cl_7.a(hashAlgId, hash, hashOID == null ? null : DigestParamsSpec.getInstance(hashOID), hKey);
    }

    public void a(int i) {
        JCSPLogger.subEnter();
        d(i).lock();
        try {
            if (this.d[i].b) {
                this.d[i].a.destroyKey();
                this.d[i].b = false;
            }
            d(i).unlock();
            JCSPLogger.subExit();
        } catch (Throwable th) {
            d(i).unlock();
            throw th;
        }
    }

    public void a(boolean z, byte[] bArr, int[] iArr, int i) throws ShortBufferException {
        if (this.g) {
            ny61.r("The key has been destroyed.");
            return;
        }
        if (!USE_PUBLIC_KEY_PROTECTED) {
            g().encrypt(z, bArr, iArr, i);
            return;
        }
        e().lock();
        try {
            g().encrypt(z, bArr, iArr, i);
        } finally {
            e().unlock();
        }
    }

    public void a(KeyValue[] keyValueArr) {
        JCSPLogger.subEnter();
        for (int i = 0; i < keyValueArr.length; i++) {
            ProviderContext l = l();
            HProv providerContext = l.getProviderContext();
            HKey hKey = null;
            try {
                try {
                    hKey = providerContext.importPublicKey(this.b, this.e, this.f.ordinal());
                    keyValueArr[i].a = hKey;
                    keyValueArr[i].b = true;
                } catch (Exception e) {
                    if (hKey != null) {
                        hKey.destroyKey();
                    }
                    byte[] blob = this.b.getBlob();
                    if (blob != null) {
                        HexDumpEncoder hexDumpEncoder = new HexDumpEncoder();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Import of ");
                        sb.append(this.e ? ClidProvider.APP_UNTRUSTED : "trusted");
                        sb.append(" public key failed:\n");
                        sb.append(hexDumpEncoder.encode(ByteBuffer.wrap(blob)));
                        JCSPLogger.warning(sb.toString());
                    }
                    throw new IllegalArgumentException(e);
                }
            } finally {
                if (!l.isPoolContext()) {
                    providerContext.releaseContext(4);
                }
            }
        }
        JCSPLogger.subExit();
    }

    public static void a(KeyValue[] keyValueArr, KeyValue[] keyValueArr2) throws CloneNotSupportedException {
        JCSPLogger.subEnter();
        for (int i = 0; i < keyValueArr.length; i++) {
            KeyValue keyValue = keyValueArr[i];
            if (USE_PUBLIC_KEY_PROTECTED) {
                keyValue.e.lock();
                try {
                    if (keyValue.a != null) {
                        try {
                            keyValueArr2[i].a = keyValue.a.duplicateKey();
                            keyValueArr2[i].b = true;
                        } catch (MSException e) {
                            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException("Cannot duplicate the key.");
                            cloneNotSupportedException.initCause(e);
                            throw cloneNotSupportedException;
                        }
                    }
                } finally {
                    keyValue.e.unlock();
                }
            } else if (keyValue.a != null) {
                try {
                    keyValueArr2[i].a = keyValue.a.duplicateKey();
                    keyValueArr2[i].b = true;
                } catch (MSException e2) {
                    CloneNotSupportedException cloneNotSupportedException2 = new CloneNotSupportedException("Cannot duplicate the key.");
                    cloneNotSupportedException2.initCause(e2);
                    throw cloneNotSupportedException2;
                }
            } else {
                continue;
            }
        }
        JCSPLogger.subExit();
    }

    /* JADX WARN: Finally extract failed */
    public boolean a(int i, byte[] bArr, ParamsInterface paramsInterface, byte[] bArr2, int i2) {
        boolean a2;
        JCSPLogger.subEnter();
        if (CSPVersionDependentAlgorithms.isNoKeyWLockSupported()) {
            i2 |= 64;
        }
        if (USE_PUBLIC_KEY_PROTECTED) {
            try {
                e().lock();
                HHash hHash = null;
                try {
                    hHash = cl_7.a(i, bArr, paramsInterface, g());
                    a2 = cl_7.a(hHash, bArr2, g(), i2);
                    if (hHash != null) {
                        hHash.destroyHash();
                    }
                    e().unlock();
                } catch (Throwable th) {
                    if (hHash != null) {
                        hHash.destroyHash();
                    }
                    e().unlock();
                    throw th;
                }
            } catch (Exception e) {
                JCSPLogger.subThrown(e);
                f().lock();
                try {
                    c();
                    a2 = cl_7.a(cl_7.a(i, bArr, paramsInterface, g()), bArr2, g(), i2);
                } finally {
                    f().unlock();
                }
            }
        } else {
            if (this.g) {
                ny61.r("The key has been destroyed.");
                return false;
            }
            a2 = cl_7.a(cl_7.a(i, bArr, paramsInterface, g()), bArr2, g(), i2);
        }
        JCSPLogger.subExit();
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] a(SecretKeyInterface secretKeyInterface) throws InvalidKeyException {
        byte[] a2;
        JCSPLogger.subEnter();
        if (this.f == AlgorithmGroups.KeyAlgorithmGroup.GOST) {
            throw new InvalidKeyException(a);
        }
        if (!(secretKeyInterface instanceof AbstractKeySpec)) {
            dy31.v("Invalid key type.");
            return null;
        }
        HKey hKey = ((AbstractKeySpec) secretKeyInterface).insideKey;
        try {
            if (USE_PUBLIC_KEY_PROTECTED) {
                try {
                    e().lock();
                    try {
                        a2 = cl_7.a(hKey, g());
                        e().unlock();
                    } catch (Throwable th) {
                        e().unlock();
                        throw th;
                    }
                } catch (Exception e) {
                    JCSPLogger.subThrown(e);
                    f().lock();
                    try {
                        try {
                            c();
                            a2 = cl_7.a(hKey, g());
                        } finally {
                            f().unlock();
                        }
                    } catch (KeyIsNotExportableException unused) {
                        throw new InvalidKeyException(e);
                    }
                }
            } else {
                if (this.g) {
                    ny61.r("The key has been destroyed.");
                    return null;
                }
                a2 = cl_7.a(hKey, g());
            }
            JCSPLogger.subExit();
            return a2;
        } catch (KeyIsNotExportableException e2) {
            dy31.s(e2);
            return null;
        }
    }
}
