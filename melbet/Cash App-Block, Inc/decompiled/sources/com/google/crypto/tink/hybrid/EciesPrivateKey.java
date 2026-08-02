package com.google.crypto.tink.hybrid;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.hybrid.EciesParameters;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.subtle.X25519;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class EciesPrivateKey extends HybridPrivateKey {
    public final ConnectionPool nistPrivateKeyValue;
    public final EciesPublicKey publicKey;
    public final WireAdapter x25519PrivateKeyBytes;

    public EciesPrivateKey(EciesPublicKey eciesPublicKey, ConnectionPool connectionPool, WireAdapter wireAdapter) {
        this.publicKey = eciesPublicKey;
        this.nistPrivateKeyValue = connectionPool;
        this.x25519PrivateKeyBytes = wireAdapter;
    }

    public static EciesPrivateKey createForCurveX25519(EciesPublicKey eciesPublicKey, WireAdapter wireAdapter) {
        Bytes bytes = eciesPublicKey.x25519PublicPointBytes;
        if (bytes == null) {
            a$$ExternalSyntheticBUOutline0.m$6("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
            return null;
        }
        byte[] byteArray = ((Bytes) wireAdapter.adapter).toByteArray();
        byte[] byteArray2 = bytes.toByteArray();
        if (byteArray.length != 32) {
            a$$ExternalSyntheticBUOutline0.m$6("Private key bytes length for X25519 curve must be 32");
            return null;
        }
        if (Arrays.equals(X25519.publicFromPrivate(byteArray), byteArray2)) {
            return new EciesPrivateKey(eciesPublicKey, null, wireAdapter);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Invalid private key for public key.");
        return null;
    }

    public static EciesPrivateKey createForNistCurve(EciesPublicKey eciesPublicKey, ConnectionPool connectionPool) {
        ECPoint eCPoint = eciesPublicKey.nistPublicPoint;
        if (eCPoint == null) {
            a$$ExternalSyntheticBUOutline0.m$6("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            return null;
        }
        BigInteger bigInteger = (BigInteger) connectionPool.delegate;
        EciesParameters.CurveType curveType = eciesPublicKey.parameters.curveType;
        BigInteger order = toParameterSpecNistCurve(curveType).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            a$$ExternalSyntheticBUOutline0.m$6("Invalid private value");
            return null;
        }
        if (EllipticCurvesUtil.multiplyByGenerator(bigInteger, toParameterSpecNistCurve(curveType)).equals(eCPoint)) {
            return new EciesPrivateKey(eciesPublicKey, connectionPool, null);
        }
        a$$ExternalSyntheticBUOutline0.m$6("Invalid private value");
        return null;
    }

    public static ECParameterSpec toParameterSpecNistCurve(EciesParameters.CurveType curveType) {
        if (curveType == EciesParameters.CurveType.NIST_P256) {
            return EllipticCurvesUtil.NIST_P256_PARAMS;
        }
        if (curveType == EciesParameters.CurveType.NIST_P384) {
            return EllipticCurvesUtil.NIST_P384_PARAMS;
        }
        if (curveType == EciesParameters.CurveType.NIST_P521) {
            return EllipticCurvesUtil.NIST_P521_PARAMS;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) curveType, "Unable to determine NIST curve type for ");
        return null;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        return this.publicKey.parameters;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey
    public final TransactorKt getPublicKey() {
        return this.publicKey;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPrivateKey
    /* renamed from: getPublicKey, reason: collision with other method in class */
    public final HybridPublicKey mo2034getPublicKey() {
        return this.publicKey;
    }
}
