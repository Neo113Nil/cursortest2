package com.connectsdk.service.airplay.auth.crypt.srp6;

import com.nimbusds.srp6.BigIntegerUtils;
import com.nimbusds.srp6.ClientEvidenceRoutine;
import com.nimbusds.srp6.SRP6ClientEvidenceContext;
import com.nimbusds.srp6.SRP6ClientSession;
import com.nimbusds.srp6.SRP6CryptoParams;
import defpackage.kac;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
class ClientEvidenceRoutineImpl implements ClientEvidenceRoutine {
    private final SRP6ClientSession srp6ClientSession;

    public ClientEvidenceRoutineImpl(SRP6ClientSession sRP6ClientSession) {
        this.srp6ClientSession = sRP6ClientSession;
    }

    private static byte[] xor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public BigInteger computeClientEvidence(SRP6CryptoParams sRP6CryptoParams, SRP6ClientEvidenceContext sRP6ClientEvidenceContext) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(sRP6CryptoParams.H);
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(sRP6CryptoParams.N));
            byte[] digest = messageDigest.digest();
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(sRP6CryptoParams.g));
            byte[] xor = xor(digest, messageDigest.digest());
            messageDigest.update(sRP6ClientEvidenceContext.userID.getBytes(StandardCharsets.UTF_8));
            byte[] digest2 = messageDigest.digest();
            messageDigest.update(xor);
            messageDigest.update(digest2);
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(sRP6ClientEvidenceContext.s));
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(sRP6ClientEvidenceContext.A));
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(sRP6ClientEvidenceContext.B));
            messageDigest.update(this.srp6ClientSession.getSessionKeyHash());
            return new BigInteger(1, messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            kac.k("Could not locate requested algorithm", e);
            return null;
        }
    }
}
