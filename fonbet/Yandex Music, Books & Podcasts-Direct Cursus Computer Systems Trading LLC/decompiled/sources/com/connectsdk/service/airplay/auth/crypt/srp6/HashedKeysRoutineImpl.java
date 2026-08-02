package com.connectsdk.service.airplay.auth.crypt.srp6;

import com.nimbusds.srp6.BigIntegerUtils;
import com.nimbusds.srp6.SRP6CryptoParams;
import com.nimbusds.srp6.URoutine;
import com.nimbusds.srp6.URoutineContext;
import defpackage.kac;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
class HashedKeysRoutineImpl implements URoutine {
    public BigInteger computeU(SRP6CryptoParams sRP6CryptoParams, URoutineContext uRoutineContext) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(sRP6CryptoParams.H);
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(uRoutineContext.A));
            messageDigest.update(BigIntegerUtils.bigIntegerToBytes(uRoutineContext.B));
            return BigIntegerUtils.bigIntegerFromBytes(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            kac.k("Could not locate requested algorithm", e);
            return null;
        }
    }
}
