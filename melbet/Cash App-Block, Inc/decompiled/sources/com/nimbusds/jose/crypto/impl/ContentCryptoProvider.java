package com.nimbusds.jose.crypto.impl;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import com.google.crypto.tink.internal.Random;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.XChaCha20Poly1305;
import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.DeflateUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.nimbusds.jose.util.KeyUtils$1;
import com.nimbusds.jose.util.StandardCharset;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.wire.OneOf;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.reflect.TypesJVMKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ContentCryptoProvider {
    public static final Map COMPATIBLE_ENCRYPTION_METHODS;
    public static final Set SUPPORTED_ENCRYPTION_METHODS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A192CBC_HS384;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.A256CBC_HS512;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.A128GCM;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.A192GCM;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.A256GCM;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.A128CBC_HS256_DEPRECATED;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.A256CBC_HS512_DEPRECATED;
        linkedHashSet.add(encryptionMethod8);
        EncryptionMethod encryptionMethod9 = EncryptionMethod.XC20P;
        linkedHashSet.add(encryptionMethod9);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet3.add(encryptionMethod9);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(Integer.valueOf(MLKEMEngine.KyberPolyBytes), Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(hashMap);
    }

    public static void checkCEKLength(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        int i;
        try {
            if (secretKey.getEncoded() == null) {
                i = 0;
            } else {
                long length = r4.length * 8;
                i = (int) length;
                if (i != length) {
                    throw new IntegerOverflowException("Integer overflow");
                }
            }
            if (i == 0 || encryptionMethod.cekBitLength == i) {
                return;
            }
            StringBuilder sb = new StringBuilder("The Content Encryption Key (CEK) length for ");
            sb.append(encryptionMethod);
            sb.append(" must be ");
            throw new KeyLengthException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(encryptionMethod.cekBitLength, " bits", sb));
        } catch (IntegerOverflowException e) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] decrypt(JWEHeader jWEHeader, byte[] bArr, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, SecretKey secretKey, JWEJCAContext jWEJCAContext) {
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        int i;
        SecretKeySpec secretKeySpec3;
        long length;
        long j;
        byte[] doFinal;
        if (bArr == null) {
            return decrypt(jWEHeader, jWEHeader.toBase64URL().value.getBytes(StandardCharsets.US_ASCII), base64URL, base64URL2, base64URL3, secretKey, jWEJCAContext);
        }
        EncryptionMethod encryptionMethod = jWEHeader.enc;
        checkCEKLength(secretKey, encryptionMethod);
        if (encryptionMethod.equals(EncryptionMethod.A128CBC_HS256) || encryptionMethod.equals(EncryptionMethod.A192CBC_HS384) || encryptionMethod.equals(EncryptionMethod.A256CBC_HS512)) {
            byte[] decode = base64URL.decode();
            byte[] decode2 = base64URL2.decode();
            byte[] decode3 = base64URL3.decode();
            Provider provider = (Provider) jWEJCAContext.provider;
            byte[] encoded = secretKey.getEncoded();
            int i2 = 32;
            if (encoded.length == 32) {
                i = 16;
                secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                secretKeySpec3 = new SecretKeySpec(encoded, 16, 16, "AES");
            } else if (encoded.length == 48) {
                i = 24;
                secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                secretKeySpec3 = new SecretKeySpec(encoded, 24, 24, "AES");
            } else {
                if (encoded.length != 64) {
                    throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
                }
                secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
                length = bArr.length * 8;
                j = (int) length;
                if (j == length) {
                    throw new IntegerOverflowException("Integer overflow");
                }
                byte[] array2 = ByteBuffer.allocate(8).putLong(j).array();
                if (!WebSocketProtocol.areEqual(Arrays.copyOf(ECDH.compute(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr.length + decode.length + decode2.length + array2.length).put(bArr).put(decode).put(decode2).put(array2).array(), provider), i2), decode3)) {
                    throw new JOSEException("MAC check failed");
                }
                try {
                    doFinal = ECDH.createAESCBCCipher(secretKeySpec2, false, decode, provider).doFinal(decode2);
                } catch (Exception e) {
                    throw new JOSEException(e.getMessage(), e);
                }
            }
            int i3 = i;
            secretKeySpec2 = secretKeySpec3;
            i2 = i3;
            length = bArr.length * 8;
            j = (int) length;
            if (j == length) {
            }
        } else if (encryptionMethod.equals(EncryptionMethod.A128GCM) || encryptionMethod.equals(EncryptionMethod.A192GCM) || encryptionMethod.equals(EncryptionMethod.A256GCM)) {
            byte[] decode4 = base64URL.decode();
            byte[] decode5 = base64URL2.decode();
            byte[] decode6 = base64URL3.decode();
            Provider provider2 = (Provider) jWEJCAContext.provider;
            SecretKey keyUtils$1 = secretKey.getAlgorithm().equals("AES") ? secretKey : new KeyUtils$1(secretKey);
            try {
                Cipher cipher = provider2 != null ? Cipher.getInstance("AES/GCM/NoPadding", provider2) : Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, keyUtils$1, new GCMParameterSpec(128, decode4));
                cipher.updateAAD(bArr);
                try {
                    doFinal = cipher.doFinal(OneOf.concat(decode5, decode6));
                } catch (BadPaddingException | IllegalBlockSizeException e2) {
                    throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e2, new StringBuilder("AES/GCM/NoPadding decryption failed: ")), e2);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e3) {
                throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e3, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e3);
            }
        } else {
            if (encryptionMethod.equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || encryptionMethod.equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                Map map = jWEHeader.customParams;
                ECDH.generateCIK(secretKey, encryptionMethod, map.get("epu") instanceof String ? new Base64URL((String) map.get("epu")).decode() : null, map.get("epv") instanceof String ? new Base64URL((String) map.get("epv")).decode() : null);
                StringBuilder sb = new StringBuilder();
                sb.append(jWEHeader.toBase64URL().value);
                sb.append(".");
                throw null;
            }
            if (!encryptionMethod.equals(EncryptionMethod.XC20P)) {
                throw new JOSEException(ECDH.unsupportedEncryptionMethod(encryptionMethod, SUPPORTED_ENCRYPTION_METHODS));
            }
            byte[] decode7 = base64URL.decode();
            byte[] decode8 = base64URL2.decode();
            byte[] decode9 = base64URL3.decode();
            try {
                XChaCha20Poly1305 xChaCha20Poly1305 = new XChaCha20Poly1305(secretKey.getEncoded(), new byte[0]);
                byte[] concat = OneOf.concat(decode7, decode8, decode9);
                try {
                    byte[] bArr2 = xChaCha20Poly1305.outputPrefix;
                    if (bArr2.length == 0) {
                        doFinal = xChaCha20Poly1305.rawDecrypt$1(concat, bArr);
                    } else if (Util.isPrefix(bArr2, concat)) {
                        doFinal = xChaCha20Poly1305.rawDecrypt$1(Arrays.copyOfRange(concat, bArr2.length, concat.length), bArr);
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$6("Decryption failed (OutputPrefix mismatch).");
                        doFinal = null;
                    }
                } catch (GeneralSecurityException e4) {
                    throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e4, new StringBuilder("XChaCha20Poly1305 decryption failed: ")), e4);
                }
            } catch (GeneralSecurityException e5) {
                throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e5, new StringBuilder("Invalid XChaCha20Poly1305 key: ")), e5);
            }
        }
        CompressionAlgorithm compressionAlgorithm = jWEHeader.zip;
        if (compressionAlgorithm == null) {
            return doFinal;
        }
        if (!compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            JWK$$ExternalSyntheticBUOutline0.m$2(compressionAlgorithm, "Unsupported compression algorithm: ");
            return null;
        }
        try {
            return DeflateUtils.decompress(doFinal);
        } catch (Exception e6) {
            throw new JOSEException(Fragment$5$$ExternalSyntheticOutline0.m(e6, new StringBuilder("Couldn't decompress plain text: ")), e6);
        }
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) {
        Deflater deflater;
        byte[] byteArray;
        Base64URL base64URL2;
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        AuthenticatedCipherText authenticatedCipherText;
        byte[] bArr3;
        int i;
        long j;
        if (bArr2 == null) {
            return encrypt(jWEHeader, bArr, jWEHeader.toBase64URL().value.getBytes(StandardCharsets.US_ASCII), secretKey, base64URL, jWEJCAContext);
        }
        SecretKey secretKey2 = secretKey;
        EncryptionMethod encryptionMethod = jWEHeader.enc;
        checkCEKLength(secretKey2, encryptionMethod);
        CompressionAlgorithm compressionAlgorithm = jWEHeader.zip;
        DeflaterOutputStream deflaterOutputStream = null;
        deflaterOutputStream = null;
        if (compressionAlgorithm == null) {
            byteArray = bArr;
        } else {
            if (!compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
                JWK$$ExternalSyntheticBUOutline0.m$2(compressionAlgorithm, "Unsupported compression algorithm: ");
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    deflater = new Deflater(8, true);
                    try {
                        DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                        try {
                            deflaterOutputStream2.write(bArr);
                            deflaterOutputStream2.close();
                            deflater.end();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th) {
                            th = th;
                            deflaterOutputStream = deflaterOutputStream2;
                            if (deflaterOutputStream != null) {
                                deflaterOutputStream.close();
                            }
                            if (deflater != null) {
                                deflater.end();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    deflater = null;
                }
            } catch (Exception e) {
                throw new JOSEException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Couldn't compress plain text: ")), e);
            }
        }
        int i2 = 24;
        int i3 = 0;
        if (encryptionMethod.equals(EncryptionMethod.A128CBC_HS256) || encryptionMethod.equals(EncryptionMethod.A192CBC_HS384) || encryptionMethod.equals(EncryptionMethod.A256CBC_HS512)) {
            base64URL2 = base64URL;
            byte[] bArr4 = new byte[16];
            new SecureRandom().nextBytes(bArr4);
            Provider provider = (Provider) jWEJCAContext.provider;
            byte[] encoded = secretKey2.getEncoded();
            if (encoded.length == 32) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
                secretKeySpec2 = new SecretKeySpec(encoded, 16, 16, "AES");
                i2 = 16;
            } else if (encoded.length == 48) {
                secretKeySpec = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
                secretKeySpec2 = new SecretKeySpec(encoded, 24, 24, "AES");
            } else {
                if (encoded.length != 64) {
                    throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
                }
                secretKeySpec = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                i2 = 32;
                secretKeySpec2 = new SecretKeySpec(encoded, 32, 32, "AES");
            }
            try {
                byte[] doFinal = ECDH.createAESCBCCipher(secretKeySpec2, true, bArr4, provider).doFinal(byteArray);
                long length = bArr2.length * 8;
                long j2 = (int) length;
                if (j2 != length) {
                    throw new IntegerOverflowException("Integer overflow");
                }
                byte[] array2 = ByteBuffer.allocate(8).putLong(j2).array();
                authenticatedCipherText = new AuthenticatedCipherText(doFinal, Arrays.copyOf(ECDH.compute(secretKeySpec.getAlgorithm(), secretKeySpec, ByteBuffer.allocate(bArr2.length + 16 + doFinal.length + array2.length).put(bArr2).put(bArr4).put(doFinal).put(array2).array(), provider), i2), 0);
                bArr3 = bArr4;
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else if (encryptionMethod.equals(EncryptionMethod.A128GCM) || encryptionMethod.equals(EncryptionMethod.A192GCM) || encryptionMethod.equals(EncryptionMethod.A256GCM)) {
            base64URL2 = base64URL;
            byte[] bArr5 = new byte[12];
            new SecureRandom().nextBytes(bArr5);
            Provider provider2 = (Provider) jWEJCAContext.provider;
            if (!secretKey2.getAlgorithm().equals("AES")) {
                secretKey2 = new KeyUtils$1(secretKey2);
            }
            try {
                Cipher cipher = provider2 != null ? Cipher.getInstance("AES/GCM/NoPadding", provider2) : Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKey2, new GCMParameterSpec(128, bArr5));
                cipher.updateAAD(bArr2);
                try {
                    byte[] doFinal2 = cipher.doFinal(byteArray);
                    int length2 = doFinal2.length - 16;
                    byte[] subArray = OneOf.subArray(doFinal2, 0, length2);
                    byte[] subArray2 = OneOf.subArray(doFinal2, length2, 16);
                    AlgorithmParameters parameters = cipher.getParameters();
                    if (parameters == null) {
                        throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
                    }
                    try {
                        GCMParameterSpec gCMParameterSpec = (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
                        byte[] iv = gCMParameterSpec.getIV();
                        int tLen = gCMParameterSpec.getTLen();
                        if (iv == null) {
                            j = 8;
                            i = 0;
                        } else {
                            long length3 = iv.length * 8;
                            i = (int) length3;
                            j = 8;
                            if (i != length3) {
                                throw new IntegerOverflowException("Integer overflow");
                            }
                        }
                        if (i != 96) {
                            if (iv != null) {
                                long length4 = iv.length * j;
                                i3 = (int) length4;
                                if (i3 != length4) {
                                    throw new IntegerOverflowException("Integer overflow");
                                }
                            }
                            throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(i3)));
                        }
                        if (tLen != 128) {
                            throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(tLen)));
                        }
                        AuthenticatedCipherText authenticatedCipherText2 = new AuthenticatedCipherText(subArray, subArray2, 0);
                        bArr3 = iv;
                        authenticatedCipherText = authenticatedCipherText2;
                    } catch (InvalidParameterSpecException e3) {
                        throw new JOSEException(e3.getMessage(), e3);
                    }
                } catch (BadPaddingException | IllegalBlockSizeException e4) {
                    throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e4, new StringBuilder("Couldn't encrypt with AES/GCM/NoPadding: ")), e4);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e5) {
                throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e5, new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ")), e5);
            }
        } else if (encryptionMethod.equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || encryptionMethod.equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
            byte[] bArr6 = new byte[16];
            new SecureRandom().nextBytes(bArr6);
            Provider provider3 = (Provider) jWEJCAContext.provider;
            Map map = jWEHeader.customParams;
            byte[] decode = map.get("epu") instanceof String ? new Base64URL((String) map.get("epu")).decode() : null;
            byte[] decode2 = map.get("epv") instanceof String ? new Base64URL((String) map.get("epv")).decode() : null;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(ECDH.ONE_BYTES);
                byte[] encoded2 = secretKey2.getEncoded();
                byteArrayOutputStream2.write(encoded2);
                int length5 = encoded2.length * 8;
                byteArrayOutputStream2.write(TypesJVMKt.toBytes(length5 / 2));
                byteArrayOutputStream2.write(encryptionMethod.name.getBytes(StandardCharset.UTF_8));
                byte[] bArr7 = ECDH.ZERO_BYTES;
                if (decode != null) {
                    byteArrayOutputStream2.write(TypesJVMKt.toBytes(decode.length));
                    byteArrayOutputStream2.write(decode);
                } else {
                    byteArrayOutputStream2.write(bArr7);
                }
                if (decode2 != null) {
                    byteArrayOutputStream2.write(TypesJVMKt.toBytes(decode2.length));
                    byteArrayOutputStream2.write(decode2);
                } else {
                    byteArrayOutputStream2.write(bArr7);
                }
                byteArrayOutputStream2.write(ECDH.ENCRYPTION_BYTES);
                try {
                    byte[] digest = MessageDigest.getInstance("SHA-" + length5).digest(byteArrayOutputStream2.toByteArray());
                    int length6 = digest.length / 2;
                    byte[] bArr8 = new byte[length6];
                    System.arraycopy(digest, 0, bArr8, 0, length6);
                    try {
                        byte[] doFinal3 = ECDH.createAESCBCCipher(new SecretKeySpec(bArr8, "AES"), true, bArr6, provider3).doFinal(byteArray);
                        SecretKeySpec generateCIK = ECDH.generateCIK(secretKey2, encryptionMethod, decode, decode2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(jWEHeader.toBase64URL());
                        sb.append(".");
                        base64URL2 = base64URL;
                        sb.append(base64URL2);
                        sb.append(".");
                        sb.append(Base64URL.encode(bArr6));
                        sb.append(".");
                        sb.append(Base64URL.encode(doFinal3));
                        authenticatedCipherText = new AuthenticatedCipherText(doFinal3, ECDH.compute(generateCIK.getAlgorithm(), generateCIK, sb.toString().getBytes(StandardCharset.UTF_8), provider3), 0);
                        bArr3 = bArr6;
                    } catch (Exception e6) {
                        throw new JOSEException(e6.getMessage(), e6);
                    }
                } catch (NoSuchAlgorithmException e7) {
                    throw new JOSEException(e7.getMessage(), e7);
                }
            } catch (IOException e8) {
                throw new JOSEException(e8.getMessage(), e8);
            }
        } else {
            if (!encryptionMethod.equals(EncryptionMethod.XC20P)) {
                throw new JOSEException(ECDH.unsupportedEncryptionMethod(encryptionMethod, SUPPORTED_ENCRYPTION_METHODS));
            }
            try {
                InsecureNonceChaCha20Poly1305 insecureNonceChaCha20Poly1305 = new InsecureNonceChaCha20Poly1305(secretKey2.getEncoded(), 1);
                try {
                    ByteBuffer allocate = ByteBuffer.allocate(byteArray.length + 40);
                    byte[] randBytes = Random.randBytes(24);
                    allocate.put(randBytes);
                    insecureNonceChaCha20Poly1305.encrypt(allocate, randBytes, byteArray, bArr2);
                    byte[] array3 = allocate.array();
                    int length7 = array3.length;
                    bArr3 = OneOf.subArray(array3, 0, 24);
                    authenticatedCipherText = new AuthenticatedCipherText(OneOf.subArray(array3, 24, length7 - 40), OneOf.subArray(array3, length7 - 16, 16), 0);
                    base64URL2 = base64URL;
                } catch (GeneralSecurityException e9) {
                    throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e9, new StringBuilder("Couldn't encrypt with XChaCha20Poly1305: ")), e9);
                }
            } catch (GeneralSecurityException e10) {
                throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e10, new StringBuilder("Invalid XChaCha20Poly1305 key: ")), e10);
            }
        }
        return new JWECryptoParts(jWEHeader, base64URL2, Base64URL.encode(bArr3), Base64URL.encode(authenticatedCipherText.cipherText), Base64URL.encode(authenticatedCipherText.authenticationTag));
    }
}
