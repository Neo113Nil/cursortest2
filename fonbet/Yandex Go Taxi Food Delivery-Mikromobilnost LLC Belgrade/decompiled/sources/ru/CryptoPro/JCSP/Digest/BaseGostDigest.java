package ru.CryptoPro.JCSP.Digest;

import defpackage.ny61;
import java.security.SignatureException;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.JCSPSignatureKeyPreHashInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class BaseGostDigest extends AbstractGostDigest {
    private static final int BUFFERSIZE = 8192;
    private static final int BUFFER_SIZE_FACTOR = 8;
    private static ru.CryptoPro.JCSP.tools.cl_0 CONTEXT_POOL = null;
    public static final int HASH_CONTEXT_POOL_SIZE;
    public static final int HASH_CONTEXT_POOL_SIZE_DEFAULT = 8;
    static final /* synthetic */ boolean d = true;
    private static final int hashContextPoolSize;
    protected boolean a;
    protected final byte[] b;
    protected int c;
    private OID digestOid;
    private HHash hHash;
    private KeyInterface keyForHash;
    private final int provType;
    private boolean useDefaultCSPProvider;
    private boolean useKeyLocalContextForHash;
    private HProv where;
    public static final boolean USE_HASH_PERSONAL_CONTEXT = GetProperty.getBooleanProperty("use_hash_personal_context", false);
    public static final boolean USE_HASH_CONTEXT_POOL = GetProperty.getBooleanProperty("use_hash_context_pool", false);

    public static class cl_0 {
        private cl_0() {
            ru.CryptoPro.JCSP.tools.cl_0 unused = BaseGostDigest.CONTEXT_POOL = new ru.CryptoPro.JCSP.tools.cl_0(BaseGostDigest.hashContextPoolSize);
        }
    }

    public static class cl_1 {
        private static final cl_0 a = new cl_0();

        private cl_1() {
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("hash_context_pool_size", 8);
        HASH_CONTEXT_POOL_SIZE = integerProperty;
        hashContextPoolSize = integerProperty > 0 ? integerProperty : 8;
    }

    public BaseGostDigest(BaseGostDigest baseGostDigest, String str) {
        super(str);
        this.a = false;
        byte[] bArr = new byte[8192];
        this.b = bArr;
        this.c = 0;
        this.where = null;
        this.hHash = null;
        this.digestOid = null;
        this.useDefaultCSPProvider = false;
        this.keyForHash = null;
        this.useKeyLocalContextForHash = false;
        this.a = baseGostDigest.a;
        this.digestOid = baseGostDigest.digestOid;
        this.provType = baseGostDigest.provType;
        this.keyForHash = baseGostDigest.keyForHash;
        this.useDefaultCSPProvider = baseGostDigest.useDefaultCSPProvider;
        this.where = baseGostDigest.where;
        HHash hHash = baseGostDigest.hHash;
        this.hHash = hHash != null ? hHash.cloneHash() : null;
        int i = baseGostDigest.c;
        this.c = i;
        System.arraycopy(baseGostDigest.b, 0, bArr, 0, i);
        this.useKeyLocalContextForHash = baseGostDigest.useKeyLocalContextForHash;
    }

    private static HHash a(HProv hProv, int i, OID oid) {
        try {
            HHash initHashGR3411 = hProv.initHashGR3411(i);
            if (oid != null && i == 32798) {
                initHashGR3411.setHashOID(oid);
            }
            return initHashGR3411;
        } finally {
            if (!USE_HASH_CONTEXT_POOL) {
                hProv.releaseContext(4);
            }
        }
    }

    private static void c() {
        cl_0 cl_0Var = cl_1.a;
        if (d || cl_0Var != null) {
            return;
        }
        ny61.w();
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] digestValue(boolean z) {
        try {
            prepare();
            int i = this.c;
            if (i != 0) {
                a(i);
            }
            byte[] hash = this.hHash.getHash(getDigestLength());
            this.a = false;
            if (z) {
                a((OID) null);
            }
            return hash;
        } catch (Error e) {
            a();
            throw e;
        } catch (RuntimeException e2) {
            a();
            throw e2;
        }
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public byte[] engineDigest() {
        try {
            JCSPLogger.enter();
            byte[] digestValue = digestValue();
            JCSPLogger.exit();
            return digestValue;
        } catch (Error e) {
            a();
            throw e;
        } catch (RuntimeException e2) {
            a();
            throw e2;
        }
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] engineDigestWithCheck() throws SignatureException {
        return engineDigest();
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] engineDigestWithoutClean() throws SignatureException {
        try {
            JCSPLogger.enter();
            byte[] digestValue = digestValue(false);
            JCSPLogger.exit();
            return digestValue;
        } catch (Error e) {
            a();
            throw e;
        } catch (RuntimeException e2) {
            a();
            throw e2;
        }
    }

    @Override // java.security.MessageDigestSpi
    public abstract int engineGetDigestLength();

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineReset() {
        reset(null);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        try {
            prepare();
            if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
                JCSPLogger.enter();
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                JCSPLogger.thrown(arrayIndexOutOfBoundsException);
                throw arrayIndexOutOfBoundsException;
            }
            int i3 = this.c;
            if (i3 + i2 < 8192) {
                System.arraycopy(bArr, i, this.b, i3, i2);
                this.c += i2;
                return;
            }
            while (i2 > 0) {
                int i4 = this.c;
                int i5 = 8192 - i4;
                if (i5 > i2) {
                    i5 = i2;
                }
                System.arraycopy(bArr, i, this.b, i4, i5);
                i += i5;
                i2 -= i5;
                int i6 = this.c + i5;
                this.c = i6;
                if (i6 == 8192) {
                    a(8192);
                }
            }
        } catch (Error e) {
            a();
            throw e;
        } catch (RuntimeException e2) {
            a();
            throw e2;
        }
    }

    public void finalize() throws Throwable {
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public Object getHash() {
        return this.hHash;
    }

    public void prepare() {
        HProv a;
        HHash a2;
        KeyInterface keyInterface;
        if (this.hHash == null) {
            if (!USE_HASH_PERSONAL_CONTEXT && (keyInterface = this.keyForHash) != null && (keyInterface instanceof JCSPSignatureKeyPreHashInterface)) {
                a2 = ((JCSPSignatureKeyPreHashInterface) this.keyForHash).prepareHash(getAlgorithmIdentifier(), null, this.useKeyLocalContextForHash);
            } else if (!USE_HASH_CONTEXT_POOL || this.useDefaultCSPProvider) {
                if (this.where == null) {
                    a = ru.CryptoPro.JCSP.tools.cl_0.a(this.provType, this.useDefaultCSPProvider);
                    this.where = a;
                }
                a2 = a(this.where, getAlgorithmIdentifier(), this.digestOid);
            } else {
                c();
                if (this.where == null) {
                    a = CONTEXT_POOL.a(this.provType);
                    this.where = a;
                }
                a2 = a(this.where, getAlgorithmIdentifier(), this.digestOid);
            }
            this.hHash = a2;
        }
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public void reset(OID oid) {
        JCSPLogger.enter();
        a(oid);
        JCSPLogger.exit();
    }

    public void setUseDefaultCSPProvider(boolean z) {
        this.useDefaultCSPProvider = z;
    }

    public void setUseKeyLocalContextForHash() {
        this.useKeyLocalContextForHash = true;
    }

    public void a() {
        HHash hHash = this.hHash;
        if (hHash != null) {
            hHash.destroyHash();
            this.hHash = null;
            if (!USE_HASH_CONTEXT_POOL) {
                this.where = null;
            }
            this.a = false;
        }
    }

    public void a(int i) {
        this.hHash.engineUpdate(this.b, 0, i);
        this.c = 0;
    }

    public void a(OID oid) {
        this.c = 0;
        this.a = true;
        this.digestOid = oid;
        a();
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] digestValue() {
        return digestValue(true);
    }

    public BaseGostDigest(OID oid, int i, KeyInterface keyInterface, String str) {
        super(str);
        this.a = false;
        this.b = new byte[8192];
        this.c = 0;
        this.where = null;
        this.hHash = null;
        this.digestOid = null;
        this.useDefaultCSPProvider = false;
        this.useKeyLocalContextForHash = false;
        this.keyForHash = keyInterface;
        this.provType = i;
        a(oid);
    }

    public BaseGostDigest(OID oid, int i, String str) {
        super(str);
        this.a = false;
        this.b = new byte[8192];
        this.c = 0;
        this.where = null;
        this.hHash = null;
        this.digestOid = null;
        this.useDefaultCSPProvider = false;
        this.keyForHash = null;
        this.useKeyLocalContextForHash = false;
        this.provType = i;
        a(oid);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        try {
            prepare();
            byte[] bArr = this.b;
            int i = this.c;
            bArr[i] = b;
            int i2 = i + 1;
            this.c = i2;
            if (i2 == 8192) {
                a(8192);
            }
        } catch (Error e) {
            reset(null);
            throw e;
        } catch (RuntimeException e2) {
            reset(null);
            throw e2;
        }
    }
}
