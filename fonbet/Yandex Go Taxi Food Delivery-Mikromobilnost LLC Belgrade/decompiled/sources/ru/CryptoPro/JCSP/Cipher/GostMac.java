package ru.CryptoPro.JCSP.Cipher;

import defpackage.ny61;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.GostAgreeKey;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.Starter;

/* loaded from: classes4.dex */
public class GostMac extends MacSpi implements Cloneable {
    public static final int MAC_SIZE = 4;
    private static final int e = 8;
    private static final int f = 8192;
    protected HHash a;
    private Key b;
    private CryptParamsInterface c;
    private boolean d;
    private final byte[] g;
    private int h;

    public GostMac(GostMac gostMac) throws CloneNotSupportedException {
        this.b = null;
        this.c = null;
        this.a = null;
        this.d = false;
        byte[] bArr = new byte[8192];
        this.g = bArr;
        this.h = 0;
        HHash hHash = gostMac.a;
        if (hHash != null) {
            this.a = hHash.cloneHash();
        }
        this.d = gostMac.d;
        this.b = gostMac.b;
        this.c = gostMac.c;
        this.h = gostMac.h;
        System.arraycopy(gostMac.g, 0, bArr, 0, gostMac.h);
    }

    private void a(int i) {
        this.a.engineUpdate(this.g, 0, i);
        this.h = 0;
    }

    private void d() {
        int i = 0;
        while (true) {
            byte[] bArr = this.g;
            if (i >= bArr.length) {
                this.h = 0;
                this.d = true;
                f();
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    private void e() {
        f();
        int i = 0;
        while (true) {
            byte[] bArr = this.g;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    private void f() {
        HHash hHash = this.a;
        if (hHash != null) {
            hHash.destroyHash();
        }
        this.a = null;
        this.d = false;
    }

    private void prepare() throws InvalidKeyException {
        if (this.a == null) {
            JCSPLogger.subEnter();
            JCSPSecretKeyInterface jCSPSecretKeyInterface = null;
            try {
                try {
                    try {
                        try {
                            Key key = this.b;
                            byte[] a = key instanceof GostAgreeKey ? ((GostAgreeKey) key).a() : null;
                            jCSPSecretKeyInterface = GostSecretKey.extractSpec(this.b, c());
                            if (a != null) {
                                jCSPSecretKeyInterface.setIV_byte(a);
                            }
                            if (this.b instanceof GostAgreeKey) {
                                jCSPSecretKeyInterface.setAlgorithmIdentifierByCryptMode(2032);
                            }
                            CryptParamsInterface cryptParamsInterface = this.c;
                            if (cryptParamsInterface != null) {
                                jCSPSecretKeyInterface.setParams(cryptParamsInterface);
                            }
                            this.a = jCSPSecretKeyInterface.makeNewMac(a(), engineGetMacLength());
                            b();
                            this.d = true;
                            int i = 0;
                            while (true) {
                                byte[] bArr = this.g;
                                if (i >= bArr.length) {
                                    break;
                                }
                                bArr[i] = 0;
                                i++;
                            }
                            this.h = 0;
                            JCSPLogger.subExit();
                            if (this.b instanceof ForeignSymmetricKey) {
                                return;
                            }
                            jCSPSecretKeyInterface.clear();
                        } catch (RuntimeException e2) {
                            e();
                            throw e2;
                        }
                    } catch (InvalidKeyException e3) {
                        e();
                        throw e3;
                    }
                } catch (Error e4) {
                    e();
                    throw e4;
                } catch (MSException e5) {
                    e();
                    throw new InvalidKeyException(e5);
                }
            } catch (Throwable th) {
                if (!(this.b instanceof ForeignSymmetricKey) && jCSPSecretKeyInterface != null) {
                    jCSPSecretKeyInterface.clear();
                }
                throw th;
            }
        }
    }

    public void b() throws MSException {
    }

    public int c() {
        return 0;
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostMac(this);
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        try {
            JCSPLogger.subEnter();
            prepare();
            int i = this.h;
            if (i != 0) {
                a(i);
            }
            byte[] hash = this.a.getHash();
            this.d = false;
            d();
            JCSPLogger.subExit();
            return hash;
        } catch (Error e2) {
            e();
            throw e2;
        } catch (RuntimeException e3) {
            e();
            throw e3;
        } catch (InvalidKeyException e4) {
            e();
            ny61.j(e4);
            return null;
        }
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 4;
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            JCSPLogger.subEnter();
            this.b = key;
            if (algorithmParameterSpec != null) {
                if (!(algorithmParameterSpec instanceof CryptParamsInterface)) {
                    InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(GostCipher.resource.getString("InvPar"));
                    JCSPLogger.warning(invalidAlgorithmParameterException);
                    throw invalidAlgorithmParameterException;
                }
                this.c = (CryptParamsInterface) algorithmParameterSpec;
            }
            JCSPLogger.subExit();
        } catch (Error e2) {
            e();
            throw e2;
        } catch (RuntimeException e3) {
            e();
            throw e3;
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        JCSPLogger.subEnter();
        d();
        JCSPLogger.subExit();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        try {
            prepare();
            if (bArr.length < i2 + i) {
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                JCSPLogger.thrown(arrayIndexOutOfBoundsException);
                throw arrayIndexOutOfBoundsException;
            }
            int i3 = this.h;
            if (i3 + i2 < 8192) {
                System.arraycopy(bArr, i, this.g, i3, i2);
                this.h += i2;
                return;
            }
            while (i2 > 0) {
                int i4 = this.h;
                int i5 = 8192 - i4;
                if (i5 > i2) {
                    i5 = i2;
                }
                System.arraycopy(bArr, i, this.g, i4, i5);
                i += i5;
                i2 -= i5;
                int i6 = this.h + i5;
                this.h = i6;
                if (i6 == 8192) {
                    a(8192);
                }
            }
        } catch (Error e2) {
            e();
            throw e2;
        } catch (RuntimeException e3) {
            e();
            throw e3;
        } catch (InvalidKeyException e4) {
            e();
            ny61.j(e4);
        }
    }

    public void finalize() throws Throwable {
    }

    public int a() {
        return 32799;
    }

    public GostMac() {
        this.b = null;
        this.c = null;
        this.a = null;
        this.d = false;
        this.g = new byte[8192];
        this.h = 0;
        Starter.check(GostMac.class);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        try {
            prepare();
            byte[] bArr = this.g;
            int i = this.h;
            bArr[i] = b;
            int i2 = i + 1;
            this.h = i2;
            if (i2 == 8192) {
                a(8192);
            }
        } catch (Error e2) {
            e();
            throw e2;
        } catch (RuntimeException e3) {
            e();
            throw e3;
        } catch (InvalidKeyException e4) {
            e();
            ny61.j(e4);
        }
    }
}
