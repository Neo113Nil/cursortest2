package com.nimbusds.jose.jwk;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public final class OctetKeyPair extends JWK {
    public static final Set SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.Ed25519, Curve.Ed448, Curve.X25519, Curve.X448)));
    public final Curve crv;
    public final Base64URL d;
    public final byte[] decodedD;
    public final byte[] decodedX;
    public final Base64URL x;

    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, LinkedHashSet linkedHashSet, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, LinkedList linkedList, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        super(KeyType.OKP, keyUse, linkedHashSet, algorithm, str, uri, base64URL3, base64URL4, linkedList, date, date2, date3, keyRevocation);
        Objects.requireNonNull(curve, "The curve must not be null");
        if (!SUPPORTED_CURVES.contains(curve)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) curve, "Unknown / unsupported curve: ");
            throw null;
        }
        this.crv = curve;
        Objects.requireNonNull(base64URL, "The x parameter must not be null");
        this.x = base64URL;
        this.decodedX = base64URL.decode();
        this.d = base64URL2;
        this.decodedD = base64URL2.decode();
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        OctetKeyPair octetKeyPair = (OctetKeyPair) obj;
        return Objects.equals(this.crv, octetKeyPair.crv) && Objects.equals(this.x, octetKeyPair.x) && Arrays.equals(this.decodedX, octetKeyPair.decodedX) && Objects.equals(this.d, octetKeyPair.d) && Arrays.equals(this.decodedD, octetKeyPair.decodedD);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        return Arrays.hashCode(this.decodedD) + ((Arrays.hashCode(this.decodedX) + (Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.x, this.d) * 31)) * 31);
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
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.value);
        }
        return jSONObject;
    }

    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, LinkedHashSet linkedHashSet, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, LinkedList linkedList, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        super(KeyType.OKP, keyUse, linkedHashSet, algorithm, str, uri, base64URL2, base64URL3, linkedList, date, date2, date3, keyRevocation);
        Objects.requireNonNull(curve, "The curve must not be null");
        if (SUPPORTED_CURVES.contains(curve)) {
            this.crv = curve;
            Objects.requireNonNull(base64URL, "The x parameter must not be null");
            this.x = base64URL;
            this.decodedX = base64URL.decode();
            this.d = null;
            this.decodedD = null;
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) curve, "Unknown / unsupported curve: ");
        throw null;
    }
}
