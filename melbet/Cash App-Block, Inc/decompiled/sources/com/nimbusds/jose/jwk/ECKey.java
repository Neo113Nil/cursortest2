package com.nimbusds.jose.jwk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.math.BigInteger;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.internal.RealBufferedSource;
import okio.internal.ZipFilesKt;

/* loaded from: classes5.dex */
public final class ECKey extends JWK {
    public static final Set SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.P_256, Curve.SECP256K1, Curve.P_384, Curve.P_521)));
    public final Curve crv;
    public final Base64URL d;
    public final Base64URL x;
    public final Base64URL y;

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, LinkedHashSet linkedHashSet, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, LinkedList linkedList, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        super(KeyType.EC, keyUse, linkedHashSet, algorithm, str, uri, base64URL4, base64URL5, linkedList, date, date2, date3, keyRevocation);
        Objects.requireNonNull(curve, "The curve must not be null");
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x coordinate must not be null");
        this.x = base64URL;
        Objects.requireNonNull(base64URL2, "The y coordinate must not be null");
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.d = base64URL3;
    }

    public static Base64URL encodeCoordinate(int i, BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i2 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i2 = 0;
            }
            int i3 = bitLength / 8;
            int i4 = i3 - length;
            byte[] bArr = new byte[i3];
            System.arraycopy(byteArray, i2, bArr, i4, length);
            byteArray = bArr;
        }
        int i5 = (i + 7) / 8;
        if (byteArray.length >= i5) {
            return Base64URL.encode(byteArray);
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(byteArray, 0, bArr2, i5 - byteArray.length, byteArray.length);
        return Base64URL.encode(bArr2);
    }

    public static void ensurePublicCoordinatesOnCurve(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!SUPPORTED_CURVES.contains(curve)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) curve, "Unknown / unsupported curve: ");
            return;
        }
        BigInteger decodeToBigInteger = base64URL.decodeToBigInteger();
        BigInteger decodeToBigInteger2 = base64URL2.decodeToBigInteger();
        curve.getClass();
        if (RealBufferedSource.isPointOnCurve(decodeToBigInteger, decodeToBigInteger2, ECParameterTable.get(curve))) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$2("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the ", curve, " curve");
    }

    public static ECKey parse(Map map) {
        if (!KeyType.EC.equals(ZipFilesKt.parseKeyType(map))) {
            JWK$$ExternalSyntheticBUOutline0.m$1("The key type \"kty\" must be EC");
            return null;
        }
        try {
            Curve parse = Curve.parse((String) JSONObjectUtils.getGeneric(map, "crv", String.class));
            Base64URL base64URL = JSONObjectUtils.getBase64URL("x", map);
            Base64URL base64URL2 = JSONObjectUtils.getBase64URL("y", map);
            Base64URL base64URL3 = JSONObjectUtils.getBase64URL("d", map);
            try {
                return base64URL3 == null ? new ECKey(parse, base64URL, base64URL2, ZipFilesKt.parseKeyUse(map), ZipFilesKt.parseKeyOperations(map), ZipFilesKt.parseAlgorithm(map), (String) JSONObjectUtils.getGeneric(map, "kid", String.class), JSONObjectUtils.getURI("x5u", map), JSONObjectUtils.getBase64URL("x5t", map), JSONObjectUtils.getBase64URL("x5t#S256", map), ZipFilesKt.parseX509CertChain(map), ZipFilesKt.parseExpirationTime(map), ZipFilesKt.parseNotBeforeTime(map), ZipFilesKt.parseIssueTime(map), ZipFilesKt.parseKeyRevocation(map)) : new ECKey(parse, base64URL, base64URL2, base64URL3, ZipFilesKt.parseKeyUse(map), ZipFilesKt.parseKeyOperations(map), ZipFilesKt.parseAlgorithm(map), (String) JSONObjectUtils.getGeneric(map, "kid", String.class), JSONObjectUtils.getURI("x5u", map), JSONObjectUtils.getBase64URL("x5t", map), JSONObjectUtils.getBase64URL("x5t#S256", map), ZipFilesKt.parseX509CertChain(map), ZipFilesKt.parseExpirationTime(map), ZipFilesKt.parseNotBeforeTime(map), ZipFilesKt.parseIssueTime(map), ZipFilesKt.parseKeyRevocation(map));
            } catch (Exception e) {
                JWK$$ExternalSyntheticBUOutline0.m$1(e.getMessage());
                return null;
            }
        } catch (IllegalArgumentException e2) {
            JWK$$ExternalSyntheticBUOutline0.m$1(e2.getMessage());
            return null;
        }
    }

    public final void ensureMatches(List list) {
        if (list == null) {
            return;
        }
        boolean z = false;
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) getParsedX509CertChain().get(0)).getPublicKey();
            if (this.x.decodeToBigInteger().equals(eCPublicKey.getW().getAffineX())) {
                z = this.y.decodeToBigInteger().equals(eCPublicKey.getW().getAffineY());
            }
        } catch (ClassCastException unused) {
        }
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        return Objects.equals(this.crv, eCKey.crv) && Objects.equals(this.x, eCKey.x) && Objects.equals(this.y, eCKey.y) && Objects.equals(this.d, eCKey.d);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.x, this.y, this.d, null);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean isPrivate() {
        return this.d != null;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final HashMap toJSONObject() {
        HashMap jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.name);
        jSONObject.put("x", this.x.value);
        jSONObject.put("y", this.y.value);
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.value);
        }
        return jSONObject;
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List list, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, date, date2, date3, keyRevocation);
        Objects.requireNonNull(curve, "The curve must not be null");
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x coordinate must not be null");
        this.x = base64URL;
        Objects.requireNonNull(base64URL2, "The y coordinate must not be null");
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.d = null;
    }
}
