package ru.CryptoPro.ssl;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import defpackage.dac;
import java.io.IOException;
import java.io.PrintStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_EncryptedKey;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_GostR3412_KeyTransport;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_KeyTransport;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS.TLSGostKeyTransportBlob;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS.TLSProxyKeyTransportBlob;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS._SeqOfTLSProxyKeyTransportBlob;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPublicKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.LicenseControlInfoInterface;
import ru.CryptoPro.JCP.spec.GostCipherSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.ssl.util.ParamUtil;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
public class cl_37 extends cl_47 {
    public final byte[] b;
    public SecretKey c;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef A[Catch: InvalidAlgorithmParameterException -> 0x006b, Asn1Exception -> 0x006e, IllegalBlockSizeException -> 0x0071, NoSuchPaddingException -> 0x0074, NoSuchProviderException -> 0x0077, NoSuchAlgorithmException -> 0x007a, InvalidKeyException -> 0x01b0, TRY_LEAVE, TryCatch #9 {Asn1Exception -> 0x006e, blocks: (B:12:0x0060, B:16:0x0088, B:18:0x00a5, B:22:0x00c5, B:25:0x00d2, B:28:0x00d9, B:30:0x00ef, B:33:0x0169, B:38:0x0144, B:39:0x014c, B:40:0x014d, B:42:0x015c, B:47:0x0171, B:48:0x0179, B:49:0x0164, B:52:0x00b9, B:53:0x00c3, B:55:0x007d), top: B:11:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c A[Catch: InvalidAlgorithmParameterException -> 0x006b, Asn1Exception -> 0x006e, IllegalBlockSizeException -> 0x0071, NoSuchPaddingException -> 0x0074, NoSuchProviderException -> 0x0077, NoSuchAlgorithmException -> 0x007a, InvalidKeyException -> 0x01b0, TryCatch #9 {Asn1Exception -> 0x006e, blocks: (B:12:0x0060, B:16:0x0088, B:18:0x00a5, B:22:0x00c5, B:25:0x00d2, B:28:0x00d9, B:30:0x00ef, B:33:0x0169, B:38:0x0144, B:39:0x014c, B:40:0x014d, B:42:0x015c, B:47:0x0171, B:48:0x0179, B:49:0x0164, B:52:0x00b9, B:53:0x00c3, B:55:0x007d), top: B:11:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164 A[Catch: InvalidAlgorithmParameterException -> 0x006b, Asn1Exception -> 0x006e, IllegalBlockSizeException -> 0x0071, NoSuchPaddingException -> 0x0074, NoSuchProviderException -> 0x0077, NoSuchAlgorithmException -> 0x007a, InvalidKeyException -> 0x01b0, TRY_LEAVE, TryCatch #9 {Asn1Exception -> 0x006e, blocks: (B:12:0x0060, B:16:0x0088, B:18:0x00a5, B:22:0x00c5, B:25:0x00d2, B:28:0x00d9, B:30:0x00ef, B:33:0x0169, B:38:0x0144, B:39:0x014c, B:40:0x014d, B:42:0x015c, B:47:0x0171, B:48:0x0179, B:49:0x0164, B:52:0x00b9, B:53:0x00c3, B:55:0x007d), top: B:11:0x0060 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl_37(cl_8 cl_8Var, byte[] bArr, byte[] bArr2, PublicKey publicKey) throws IOException {
        byte[] bArr3;
        Asn1BerEncodeBuffer asn1BerEncodeBuffer;
        TLSGostKeyTransportBlob tLSGostKeyTransportBlob;
        this.b = null;
        this.c = null;
        cl_11 cl_11Var = cl_8Var.w;
        String defaultDigestSignatureSSLProvider = cpSSLConfig.getDefaultDigestSignatureSSLProvider();
        String defaultEncryptionSSLProvider = cpSSLConfig.getDefaultEncryptionSSLProvider();
        String h = cl_11Var.h();
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(cpSSLConfig.isJCP() ? h : JCP.GOST_MASTER_KEY_NAME, defaultEncryptionSSLProvider);
            try {
                keyGenerator.init(cl_11Var.m());
                if (!cpSSLConfig.isJCP()) {
                    try {
                        keyGenerator.init((EllipticParamsInterface) ((AlgIdInterface) ((InternalGostPublicKey) publicKey).getSpec().getParams()).getSignParams());
                    } catch (InvalidAlgorithmParameterException e) {
                        ProviderException providerException = new ProviderException("Invalid encryption parameters");
                        providerException.initCause(e);
                        throw providerException;
                    }
                }
                this.c = keyGenerator.generateKey();
                try {
                    try {
                        Cipher cipher = Cipher.getInstance(h.equals("GOST3412_2015_K") ? "GostTransportK" : h.equals("GOST3412_2015_M") ? "GostTransportM" : "GostTransport", defaultEncryptionSSLProvider);
                        cipher.init(3, publicKey, new IvParameterSpec(e(bArr, bArr2, cl_11Var, defaultDigestSignatureSSLProvider)));
                        byte[] wrap = cipher.wrap(this.c);
                        try {
                            if (!cpSSLConfig.isJCP()) {
                                KeyInterface spec = ((SpecKey) this.c).getSpec();
                                if (spec instanceof LicenseControlInfoInterface) {
                                    try {
                                        bArr3 = ((LicenseControlInfoInterface) spec).getLicenseControlInfo();
                                        asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                        if (!h.equals("GOST3412_2015_K") && !h.equals("GOST3412_2015_M")) {
                                            tLSGostKeyTransportBlob = new TLSGostKeyTransportBlob();
                                            GostR3410_KeyTransport gostR3410_KeyTransport = new GostR3410_KeyTransport();
                                            gostR3410_KeyTransport.decode(new Asn1BerDecodeBuffer(wrap));
                                            tLSGostKeyTransportBlob.keyBlob = gostR3410_KeyTransport;
                                            if (bArr3 != null) {
                                                TLSProxyKeyTransportBlob tLSProxyKeyTransportBlob = new TLSProxyKeyTransportBlob();
                                                GostR3410_KeyTransport gostR3410_KeyTransport2 = new GostR3410_KeyTransport();
                                                tLSProxyKeyTransportBlob.keyBlob = gostR3410_KeyTransport2;
                                                gostR3410_KeyTransport2.sessionEncryptedKey = new Gost28147_89_EncryptedKey();
                                                tLSProxyKeyTransportBlob.keyBlob.sessionEncryptedKey.macKey = new Gost28147_89_MAC();
                                                Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = tLSProxyKeyTransportBlob.keyBlob.sessionEncryptedKey;
                                                gost28147_89_EncryptedKey.macKey.value = new byte[4];
                                                gost28147_89_EncryptedKey.encryptedKey = new Gost28147_89_Key();
                                                tLSProxyKeyTransportBlob.keyBlob.sessionEncryptedKey.encryptedKey.value = new byte[32];
                                                tLSProxyKeyTransportBlob.cert = new Asn1OctetString(bArr3);
                                                _SeqOfTLSProxyKeyTransportBlob _seqoftlsproxykeytransportblob = new _SeqOfTLSProxyKeyTransportBlob(1);
                                                tLSGostKeyTransportBlob.proxyKeyBlobs = _seqoftlsproxykeytransportblob;
                                                _seqoftlsproxykeytransportblob.elements[0] = tLSProxyKeyTransportBlob;
                                            }
                                            try {
                                                tLSGostKeyTransportBlob.encode(asn1BerEncodeBuffer);
                                                this.b = asn1BerEncodeBuffer.getMsgCopy();
                                                return;
                                            } catch (Asn1Exception e2) {
                                                IOException iOException = new IOException("Error in creating ASN");
                                                iOException.initCause(e2);
                                                throw iOException;
                                            }
                                        }
                                        GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport = new GostR3410_GostR3412_KeyTransport();
                                        gostR3410_GostR3412_KeyTransport.decode(new Asn1BerDecodeBuffer(wrap));
                                        if (bArr3 == null) {
                                            gostR3410_GostR3412_KeyTransport.ukm = new Asn1OctetString(bArr3);
                                        } else {
                                            gostR3410_GostR3412_KeyTransport.ukm = null;
                                        }
                                        gostR3410_GostR3412_KeyTransport.encode(asn1BerEncodeBuffer);
                                        this.b = asn1BerEncodeBuffer.getMsgCopy();
                                        return;
                                    } catch (Exception e3) {
                                        IOException iOException2 = new IOException("Error in reading license info");
                                        iOException2.initCause(e3);
                                        throw iOException2;
                                    }
                                }
                            }
                            if (!h.equals("GOST3412_2015_K")) {
                                tLSGostKeyTransportBlob = new TLSGostKeyTransportBlob();
                                GostR3410_KeyTransport gostR3410_KeyTransport3 = new GostR3410_KeyTransport();
                                gostR3410_KeyTransport3.decode(new Asn1BerDecodeBuffer(wrap));
                                tLSGostKeyTransportBlob.keyBlob = gostR3410_KeyTransport3;
                                if (bArr3 != null) {
                                }
                                tLSGostKeyTransportBlob.encode(asn1BerEncodeBuffer);
                                this.b = asn1BerEncodeBuffer.getMsgCopy();
                                return;
                            }
                            gostR3410_GostR3412_KeyTransport.encode(asn1BerEncodeBuffer);
                            this.b = asn1BerEncodeBuffer.getMsgCopy();
                            return;
                        } catch (Asn1Exception e4) {
                            IOException iOException3 = new IOException("Error in creating ASN");
                            iOException3.initCause(e4);
                            throw iOException3;
                        }
                        bArr3 = null;
                        asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                        GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport2 = new GostR3410_GostR3412_KeyTransport();
                        gostR3410_GostR3412_KeyTransport2.decode(new Asn1BerDecodeBuffer(wrap));
                        if (bArr3 == null) {
                        }
                    } catch (Asn1Exception e5) {
                        IOException iOException4 = new IOException("Error in wrapping pre-master key");
                        iOException4.initCause(e5);
                        throw iOException4;
                    }
                } catch (InvalidAlgorithmParameterException e6) {
                    IOException iOException5 = new IOException("Error in wrapping pre-master key");
                    iOException5.initCause(e6);
                    throw iOException5;
                } catch (InvalidKeyException e7) {
                    IOException iOException6 = new IOException("Something wrong in cipher initiation");
                    iOException6.initCause(e7);
                    throw iOException6;
                } catch (NoSuchAlgorithmException e8) {
                    ProviderException providerException2 = new ProviderException("Encryption/Decryption provider not installed");
                    providerException2.initCause(e8);
                    throw providerException2;
                } catch (NoSuchProviderException e9) {
                    ProviderException providerException3 = new ProviderException("Encryption/Decryption provider not installed");
                    providerException3.initCause(e9);
                    throw providerException3;
                } catch (IllegalBlockSizeException e10) {
                    IOException iOException7 = new IOException("Error in wrapping pre-master key");
                    iOException7.initCause(e10);
                    throw iOException7;
                } catch (NoSuchPaddingException e11) {
                    ProviderException providerException4 = new ProviderException("Encryption/Decryption provider not installed");
                    providerException4.initCause(e11);
                    throw providerException4;
                }
            } catch (InvalidAlgorithmParameterException e12) {
                ProviderException providerException5 = new ProviderException("Invalid encryption parameters");
                providerException5.initCause(e12);
                throw providerException5;
            }
        } catch (NoSuchAlgorithmException e13) {
            ProviderException providerException6 = new ProviderException("Encryption/Decryption provider not installed");
            providerException6.initCause(e13);
            throw providerException6;
        } catch (NoSuchProviderException e14) {
            ProviderException providerException7 = new ProviderException("Encryption/Decryption provider not installed");
            providerException7.initCause(e14);
            throw providerException7;
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, cl_11 cl_11Var, String str) {
        int s = cl_11Var.s();
        byte[] bArr3 = new byte[s];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(cl_11Var.g(), str);
            if (!cl_11Var.q()) {
                ((AbstractGostDigest) messageDigest).reset(DigestParamsSpec.OID_HashVerbaO);
            }
            messageDigest.update(bArr);
            messageDigest.update(bArr2);
            System.arraycopy(messageDigest.digest(), 0, bArr3, 0, s);
            return bArr3;
        } catch (NoSuchAlgorithmException e) {
            ProviderException providerException = new ProviderException("Digest/Signature provider not installed");
            providerException.initCause(e);
            throw providerException;
        } catch (NoSuchProviderException e2) {
            ProviderException providerException2 = new ProviderException("Digest/Signature provider not installed");
            providerException2.initCause(e2);
            throw providerException2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[Catch: InvalidAlgorithmParameterException -> 0x0044, NoSuchPaddingException -> 0x0047, NoSuchProviderException -> 0x004a, NoSuchAlgorithmException -> 0x004d, InvalidKeyException -> 0x0050, TryCatch #4 {InvalidAlgorithmParameterException -> 0x0044, InvalidKeyException -> 0x0050, NoSuchAlgorithmException -> 0x004d, NoSuchProviderException -> 0x004a, NoSuchPaddingException -> 0x0047, blocks: (B:3:0x0014, B:6:0x001e, B:9:0x0025, B:11:0x002f, B:12:0x0032, B:14:0x003c, B:15:0x003f, B:16:0x006f, B:18:0x0079, B:19:0x00a2, B:22:0x00b0, B:26:0x0085, B:28:0x008b, B:29:0x0097, B:32:0x0054, B:33:0x005e, B:36:0x0060, B:37:0x006a, B:38:0x006b), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: InvalidAlgorithmParameterException -> 0x0044, NoSuchPaddingException -> 0x0047, NoSuchProviderException -> 0x004a, NoSuchAlgorithmException -> 0x004d, InvalidKeyException -> 0x0050, TryCatch #4 {InvalidAlgorithmParameterException -> 0x0044, InvalidKeyException -> 0x0050, NoSuchAlgorithmException -> 0x004d, NoSuchProviderException -> 0x004a, NoSuchPaddingException -> 0x0047, blocks: (B:3:0x0014, B:6:0x001e, B:9:0x0025, B:11:0x002f, B:12:0x0032, B:14:0x003c, B:15:0x003f, B:16:0x006f, B:18:0x0079, B:19:0x00a2, B:22:0x00b0, B:26:0x0085, B:28:0x008b, B:29:0x0097, B:32:0x0054, B:33:0x005e, B:36:0x0060, B:37:0x006a, B:38:0x006b), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(cl_8 cl_8Var, byte[] bArr, byte[] bArr2, PrivateKey privateKey, PublicKey publicKey) throws IOException {
        String str;
        byte[] copy;
        Cipher cipher;
        AlgorithmParameterSpec gostCipherSpec;
        cl_11 cl_11Var = cl_8Var.w;
        String defaultDigestSignatureSSLProvider = cpSSLConfig.getDefaultDigestSignatureSSLProvider();
        String defaultEncryptionSSLProvider = cpSSLConfig.getDefaultEncryptionSSLProvider();
        String h = cl_11Var.h();
        try {
            boolean equals = h.equals("GOST3412_2015_K");
            byte[] bArr3 = this.b;
            if (!equals && !h.equals("GOST3412_2015_M")) {
                Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr3);
                TLSGostKeyTransportBlob tLSGostKeyTransportBlob = new TLSGostKeyTransportBlob();
                try {
                    tLSGostKeyTransportBlob.decode(asn1BerDecodeBuffer);
                    asn1BerDecodeBuffer.reset();
                    GostR3410_KeyTransport gostR3410_KeyTransport = tLSGostKeyTransportBlob.keyBlob;
                    Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                    try {
                        gostR3410_KeyTransport.encode(asn1BerEncodeBuffer);
                        copy = asn1BerEncodeBuffer.getMsgCopy();
                        byte[] e = e(bArr, bArr2, cl_11Var, defaultDigestSignatureSSLProvider);
                        if (!h.equals("GOST3412_2015_K")) {
                            cipher = Cipher.getInstance("GostTransportK", defaultEncryptionSSLProvider);
                            gostCipherSpec = new IvParameterSpec(e);
                        } else if (h.equals("GOST3412_2015_M")) {
                            cipher = Cipher.getInstance("GostTransportM", defaultEncryptionSSLProvider);
                            gostCipherSpec = new IvParameterSpec(e);
                        } else {
                            cipher = Cipher.getInstance("GostTransport", defaultEncryptionSSLProvider);
                            gostCipherSpec = new GostCipherSpec(e, publicKey);
                        }
                        cipher.init(4, privateKey, gostCipherSpec);
                        this.c = (SecretKey) cipher.unwrap(copy, !cpSSLConfig.isJCP() ? null : JCP.GOST_MASTER_KEY_NAME, 3);
                    } catch (Asn1Exception e2) {
                        IOException iOException = new IOException("Error in creating ASN");
                        iOException.initCause(e2);
                        throw iOException;
                    }
                } catch (Asn1Exception e3) {
                    IOException iOException2 = new IOException("Invalid ASN format");
                    iOException2.initCause(e3);
                    throw iOException2;
                }
            }
            copy = Array.copy(bArr3);
            byte[] e4 = e(bArr, bArr2, cl_11Var, defaultDigestSignatureSSLProvider);
            if (!h.equals("GOST3412_2015_K")) {
            }
            cipher.init(4, privateKey, gostCipherSpec);
            this.c = (SecretKey) cipher.unwrap(copy, !cpSSLConfig.isJCP() ? null : JCP.GOST_MASTER_KEY_NAME, 3);
        } catch (InvalidAlgorithmParameterException e5) {
            IOException iOException3 = new IOException("Something wrong in cipher initiation");
            iOException3.initCause(e5);
            throw iOException3;
        } catch (InvalidKeyException e6) {
            if (ParamUtil.isCSPLicenseExpired(e6)) {
                str = "Invalid CSP license.";
            } else {
                if (!ParamUtil.isCSPUserCancelled(e6)) {
                    IOException iOException4 = new IOException("Something wrong in cipher initiation");
                    iOException4.initCause(e6);
                    throw iOException4;
                }
                str = "User cancelled operation.";
            }
            dac.g(str, e6);
        } catch (NoSuchAlgorithmException e7) {
            ProviderException providerException = new ProviderException("Encryption/Decryption provider not installed");
            providerException.initCause(e7);
            throw providerException;
        } catch (NoSuchProviderException e8) {
            ProviderException providerException2 = new ProviderException("Encryption/Decryption provider not installed");
            providerException2.initCause(e8);
            throw providerException2;
        } catch (NoSuchPaddingException e9) {
            ProviderException providerException3 = new ProviderException("Encryption/Decryption provider not installed");
            providerException3.initCause(e9);
            throw providerException3;
        }
    }

    public boolean b() {
        return false;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public int c() {
        return this.b.length;
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public String d() {
        StringBuffer stringBuffer = new StringBuffer("*** ClientKeyExchange\n");
        stringBuffer.append(Array.toHexString(this.b));
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public SecretKey e() {
        return this.c;
    }

    public void a(PrintStream printStream) {
        printStream.getClass();
        cl_47.a(printStream, "Encrypted value", this.b);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public void a(cl_62 cl_62Var) throws IOException {
        cl_62Var.write(this.b);
    }

    @Override // ru.CryptoPro.ssl.cl_47
    public int a() {
        return 16;
    }

    public cl_37(cl_46 cl_46Var, int i) throws IOException {
        this.b = null;
        this.c = null;
        this.b = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            i2 += cl_46Var.read(this.b);
        }
    }
}
