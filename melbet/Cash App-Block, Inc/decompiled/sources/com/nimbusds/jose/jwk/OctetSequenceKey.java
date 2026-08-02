package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class OctetSequenceKey extends JWK {
    public final Base64URL k;

    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, LinkedHashSet linkedHashSet, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, LinkedList linkedList, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        super(KeyType.OCT, keyUse, linkedHashSet, algorithm, str, uri, base64URL2, base64URL3, linkedList, date, date2, date3, keyRevocation);
        Objects.requireNonNull(base64URL, "The key value must not be null");
        this.k = base64URL;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OctetSequenceKey) && super.equals(obj)) {
            return Objects.equals(this.k, ((OctetSequenceKey) obj).k);
        }
        return false;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.k);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean isPrivate() {
        return true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final HashMap toJSONObject() {
        HashMap jSONObject = super.toJSONObject();
        jSONObject.put("k", this.k.value);
        return jSONObject;
    }
}
