package com.google.crypto.tink.hybrid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.ConscryptUtil;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Bytes;
import com.google.zxing.Result;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class HpkeContext {
    public static final byte[] EMPTY_IKM = new byte[0];
    public final HpkeAead aead;
    public final byte[] baseNonce;
    public final byte[] encapsulatedKey;
    public final byte[] key;
    public final BigInteger maxSequenceNumber;
    public BigInteger sequenceNumber = BigInteger.ZERO;

    public HpkeContext(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, HpkeAead hpkeAead) {
        this.encapsulatedKey = bArr;
        this.key = bArr2;
        this.baseNonce = bArr3;
        this.maxSequenceNumber = bigInteger;
        this.aead = hpkeAead;
    }

    public static HpkeContext createContext(byte[] bArr, byte[] bArr2, byte[] bArr3, Result result, HkdfHpkeKdf hkdfHpkeKdf, HpkeAead hpkeAead, byte[] bArr4) {
        byte[] bArr5;
        byte[] kemId = result.getKemId();
        switch ((String) hkdfHpkeKdf.macAlgorithm) {
            case "HmacSha256":
                bArr5 = HpkeUtil.HKDF_SHA256_KDF_ID;
                break;
            case "HmacSha384":
                bArr5 = HpkeUtil.HKDF_SHA384_KDF_ID;
                break;
            case "HmacSha512":
                bArr5 = HpkeUtil.HKDF_SHA512_KDF_ID;
                break;
            default:
                a$$ExternalSyntheticBUOutline0.m$6("Could not determine HPKE KDF ID");
                return null;
        }
        byte[] concat = Bytes.concat(HpkeUtil.HPKE, kemId, bArr5, hpkeAead.getAeadId());
        byte[] bArr6 = HpkeUtil.EMPTY_SALT;
        byte[] bArr7 = HpkeUtil.HPKE_V1;
        Charset charset = Util.UTF_8;
        byte[] bytes = "psk_id_hash".getBytes(charset);
        byte[] bArr8 = EMPTY_IKM;
        byte[] concat2 = Bytes.concat(bArr, hkdfHpkeKdf.extract(Bytes.concat(bArr7, concat, bytes, bArr8), bArr6), hkdfHpkeKdf.extract(Bytes.concat(bArr7, concat, "info_hash".getBytes(charset), bArr4), bArr6));
        byte[] extract = hkdfHpkeKdf.extract(Bytes.concat(bArr7, concat, "secret".getBytes(charset), bArr8), bArr3);
        int keyLength = hpkeAead.getKeyLength();
        byte[] expand = hkdfHpkeKdf.expand(extract, Bytes.concat(HpkeUtil.intToByteArray(2, keyLength), bArr7, concat, "key".getBytes(charset), concat2), keyLength);
        byte[] expand2 = hkdfHpkeKdf.expand(extract, Bytes.concat(HpkeUtil.intToByteArray(2, 12), bArr7, concat, "base_nonce".getBytes(charset), concat2), 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new HpkeContext(bArr2, expand, expand2, bigInteger.shiftLeft(96).subtract(bigInteger), hpkeAead);
    }

    public final synchronized byte[] computeNonceAndIncrementSequenceNumber() {
        byte[] xor;
        byte[] bArr = this.baseNonce;
        BigInteger bigInteger = this.sequenceNumber;
        this.aead.getClass();
        xor = Bytes.xor(bArr, ConscryptUtil.toBigEndianBytesOfFixedLength(12, bigInteger));
        if (this.sequenceNumber.compareTo(this.maxSequenceNumber) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.sequenceNumber = this.sequenceNumber.add(BigInteger.ONE);
        return xor;
    }
}
