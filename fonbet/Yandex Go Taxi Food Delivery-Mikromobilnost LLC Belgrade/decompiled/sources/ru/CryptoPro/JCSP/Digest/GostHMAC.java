package ru.CryptoPro.JCSP.Digest;

import defpackage.ny61;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.MacSpi;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.Starter;

/* loaded from: classes4.dex */
public abstract class GostHMAC extends MacSpi implements Cloneable {
    private static final int a = 8;
    private static final int b = 8192;
    protected byte[] buffer;
    protected int bufferpos;
    protected DigestParamsSpec digestSpec;
    protected HHash hash;
    protected Key hmacKey;
    protected boolean opened;

    public GostHMAC(GostHMAC gostHMAC) {
        this.hmacKey = null;
        this.digestSpec = null;
        this.hash = null;
        this.opened = false;
        this.buffer = new byte[8192];
        this.bufferpos = 0;
        Starter.check(GostHMAC.class);
        a(gostHMAC, this);
    }

    private void a() {
        try {
            if (this.hash != null) {
                b();
                this.opened = true;
            }
            Arrays.fill(this.buffer, (byte) 0);
            this.bufferpos = 0;
        } catch (Error e) {
            destroyAll();
            throw e;
        } catch (RuntimeException e2) {
            destroyAll();
            throw e2;
        }
    }

    private void b() {
        HHash hHash = this.hash;
        if (hHash != null) {
            hHash.destroyHash();
        }
        this.hash = null;
    }

    public void destroyAll() {
        b();
        this.opened = false;
        Arrays.fill(this.buffer, (byte) 0);
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        JCSPLogger.enter();
        try {
            prepare();
            int i = this.bufferpos;
            if (i != 0) {
                a(i);
            }
            byte[] hash = this.hash.getHash();
            this.opened = false;
            a();
            JCSPLogger.exit();
            return hash;
        } catch (Error e) {
            destroyAll();
            throw e;
        } catch (RuntimeException e2) {
            destroyAll();
            throw e2;
        } catch (InvalidKeyException e3) {
            destroyAll();
            ny61.j(e3);
            return null;
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof DigestParamsSpec)) {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(GostCipher.resource.getString("InvPar"));
            JCSPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
        this.hmacKey = key;
        this.digestSpec = (DigestParamsSpec) algorithmParameterSpec;
        destroyAll();
        JCSPLogger.exit();
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        a();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        try {
            prepare();
            if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
                JCSPLogger.enter();
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                JCSPLogger.thrown(arrayIndexOutOfBoundsException);
                throw arrayIndexOutOfBoundsException;
            }
            int i3 = this.bufferpos;
            if (i3 + i2 < 8192) {
                System.arraycopy(bArr, i, this.buffer, i3, i2);
                this.bufferpos += i2;
                return;
            }
            while (i2 > 0) {
                int i4 = this.bufferpos;
                int i5 = 8192 - i4;
                if (i5 > i2) {
                    i5 = i2;
                }
                System.arraycopy(bArr, i, this.buffer, i4, i5);
                i += i5;
                i2 -= i5;
                int i6 = this.bufferpos + i5;
                this.bufferpos = i6;
                if (i6 == 8192) {
                    a(8192);
                }
            }
        } catch (Error e) {
            destroyAll();
            throw e;
        } catch (RuntimeException e2) {
            destroyAll();
            throw e2;
        } catch (InvalidKeyException e3) {
            destroyAll();
            ny61.j(e3);
        }
    }

    public void finalize() throws Throwable {
    }

    public abstract int getAlgId();

    public int getHashAlgId() {
        return 32798;
    }

    public abstract String getStrOID();

    public void prepare() throws InvalidKeyException {
        JCSPSecretKeyInterface jCSPSecretKeyInterface;
        InvalidKeyException e;
        RuntimeException e2;
        Error e3;
        if (this.hash != null) {
            return;
        }
        JCSPLogger.enter();
        OID oid = null;
        try {
            jCSPSecretKeyInterface = a(this.hmacKey, getHashAlgId());
            try {
                int algId = getAlgId();
                DigestParamsSpec digestParamsSpec = this.digestSpec;
                if (digestParamsSpec != null) {
                    oid = digestParamsSpec.getOID();
                }
                this.hash = jCSPSecretKeyInterface.makeNewHMAC(algId, oid);
                jCSPSecretKeyInterface.clear();
                this.opened = true;
                this.bufferpos = 0;
                Arrays.fill(this.buffer, (byte) 0);
                JCSPLogger.exit();
            } catch (Error e4) {
                e3 = e4;
                if (jCSPSecretKeyInterface != null) {
                    jCSPSecretKeyInterface.clear();
                }
                destroyAll();
                throw e3;
            } catch (RuntimeException e5) {
                e2 = e5;
                if (jCSPSecretKeyInterface != null) {
                    jCSPSecretKeyInterface.clear();
                }
                destroyAll();
                throw e2;
            } catch (InvalidKeyException e6) {
                e = e6;
                if (jCSPSecretKeyInterface != null) {
                    jCSPSecretKeyInterface.clear();
                }
                destroyAll();
                JCSPLogger.exit();
                throw e;
            }
        } catch (Error e7) {
            jCSPSecretKeyInterface = null;
            e3 = e7;
        } catch (RuntimeException e8) {
            jCSPSecretKeyInterface = null;
            e2 = e8;
        } catch (InvalidKeyException e9) {
            jCSPSecretKeyInterface = null;
            e = e9;
        }
    }

    public GostHMAC() {
        this.hmacKey = null;
        this.digestSpec = null;
        this.hash = null;
        this.opened = false;
        this.buffer = new byte[8192];
        this.bufferpos = 0;
        Starter.check(GostHMAC.class);
    }

    private JCSPSecretKeyInterface a(Key key, int i) throws InvalidKeyException {
        if ((key instanceof GostSecretKey) || (key instanceof SecretKeySpec)) {
            return GostSecretKey.extractSpec(key, i);
        }
        throw new InvalidKeyException();
    }

    private void a(int i) {
        this.hash.engineUpdate(this.buffer, 0, i);
        this.bufferpos = 0;
    }

    private static void a(GostHMAC gostHMAC, GostHMAC gostHMAC2) {
        HHash hHash = gostHMAC.hash;
        if (hHash != null) {
            gostHMAC2.hash = hHash.cloneHash();
        }
        gostHMAC2.opened = gostHMAC.opened;
        gostHMAC2.bufferpos = gostHMAC.bufferpos;
        System.arraycopy(gostHMAC.buffer, 0, gostHMAC2.buffer, 0, gostHMAC.bufferpos);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b2) {
        try {
            prepare();
            byte[] bArr = this.buffer;
            int i = this.bufferpos;
            int i2 = i + 1;
            this.bufferpos = i2;
            bArr[i] = b2;
            if (i2 == 8192) {
                a(8192);
            }
        } catch (Error e) {
            destroyAll();
            throw e;
        } catch (RuntimeException e2) {
            destroyAll();
            throw e2;
        } catch (InvalidKeyException e3) {
            destroyAll();
            ny61.j(e3);
        }
    }
}
