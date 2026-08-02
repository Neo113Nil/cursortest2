package app.cash.zipline.loader.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.b$$ExternalSyntheticLambda3;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class EcdsaP256Kt {
    public static final Lazy secp256r1ParamSpec$delegate = LazyKt.lazy(new b$$ExternalSyntheticLambda3(18));

    public static final ECPublicKey decodeAnsiX963(ByteString byteString) {
        Buffer buffer = new Buffer();
        buffer.m4333write(byteString);
        if (4 != buffer.readByte()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        byte[] readByteArray = buffer.readByteArray(32L);
        byte[] readByteArray2 = buffer.readByteArray(32L);
        if (!buffer.exhausted()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, readByteArray), new BigInteger(1, readByteArray2)), (ECParameterSpec) secp256r1ParamSpec$delegate.getValue()));
        generatePublic.getClass();
        return (ECPublicKey) generatePublic;
    }
}
