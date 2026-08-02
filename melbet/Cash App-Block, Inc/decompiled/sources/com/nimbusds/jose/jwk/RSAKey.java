package com.nimbusds.jose.jwk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class RSAKey extends JWK {
    public final Base64URL d;
    public final Base64URL dp;
    public final Base64URL dq;
    public final Base64URL e;
    public final Base64URL n;
    public final List oth;
    public final Base64URL p;
    public final Base64URL q;
    public final Base64URL qi;

    public final class OtherPrimesInfo implements Serializable {
        public final Base64URL d;
        public final Base64URL r;
        public final Base64URL t;

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            Objects.requireNonNull(base64URL);
            this.r = base64URL;
            Objects.requireNonNull(base64URL2);
            this.d = base64URL2;
            Objects.requireNonNull(base64URL3);
            this.t = base64URL3;
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, ArrayList arrayList, KeyUse keyUse, LinkedHashSet linkedHashSet, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, LinkedList linkedList, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        super(KeyType.RSA, keyUse, linkedHashSet, algorithm, str, uri, base64URL9, base64URL10, linkedList, date, date2, date3, keyRevocation);
        Base64URL base64URL11;
        Base64URL base64URL12;
        Objects.requireNonNull(base64URL, "The modulus value must not be null");
        this.n = base64URL;
        Objects.requireNonNull(base64URL2, "The public exponent value must not be null");
        this.e = base64URL2;
        if (getParsedX509CertChain() != null) {
            boolean z = false;
            try {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) ((X509Certificate) getParsedX509CertChain().get(0)).getPublicKey();
                if (base64URL2.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                    z = base64URL.decodeToBigInteger().equals(rSAPublicKey.getModulus());
                }
            } catch (ClassCastException unused) {
            }
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m$3("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
                throw null;
            }
        }
        this.d = base64URL3;
        if (base64URL4 == null || base64URL5 == null) {
            base64URL11 = base64URL7;
        } else {
            base64URL11 = base64URL7;
            if (base64URL6 != null) {
                base64URL12 = base64URL8;
                if (base64URL11 != null && base64URL12 != null) {
                    this.p = base64URL4;
                    this.q = base64URL5;
                    this.dp = base64URL6;
                    this.dq = base64URL11;
                    this.qi = base64URL12;
                    if (arrayList != null) {
                        this.oth = Collections.unmodifiableList(arrayList);
                        return;
                    } else {
                        this.oth = Collections.EMPTY_LIST;
                        return;
                    }
                }
                if (base64URL4 != null && base64URL5 == null && base64URL6 == null && base64URL11 == null && base64URL12 == null && arrayList == null) {
                    this.p = null;
                    this.q = null;
                    this.dp = null;
                    this.dq = null;
                    this.qi = null;
                    this.oth = Collections.EMPTY_LIST;
                    return;
                }
                if (base64URL4 == null || base64URL5 != null || base64URL6 != null || base64URL11 != null || base64URL12 != null) {
                    Objects.requireNonNull(base64URL4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
                    Objects.requireNonNull(base64URL5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
                    Objects.requireNonNull(base64URL6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                    Objects.requireNonNull(base64URL11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                    a$$ExternalSyntheticBUOutline0.m$3("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                    throw null;
                }
                this.p = null;
                this.q = null;
                this.dp = null;
                this.dq = null;
                this.qi = null;
                this.oth = Collections.EMPTY_LIST;
                return;
            }
        }
        base64URL12 = base64URL8;
        if (base64URL4 != null) {
        }
        if (base64URL4 == null) {
        }
        Objects.requireNonNull(base64URL4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
        Objects.requireNonNull(base64URL5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
        Objects.requireNonNull(base64URL6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
        Objects.requireNonNull(base64URL11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
        a$$ExternalSyntheticBUOutline0.m$3("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
        throw null;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAKey) || !super.equals(obj)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) obj;
        return Objects.equals(this.n, rSAKey.n) && Objects.equals(this.e, rSAKey.e) && Objects.equals(this.d, rSAKey.d) && Objects.equals(this.p, rSAKey.p) && Objects.equals(this.q, rSAKey.q) && Objects.equals(this.dp, rSAKey.dp) && Objects.equals(this.dq, rSAKey.dq) && Objects.equals(this.qi, rSAKey.qi) && Objects.equals(this.oth, rSAKey.oth);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.n, this.e, this.d, this.p, this.q, this.dp, this.dq, this.qi, this.oth, null);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final boolean isPrivate() {
        return (this.d == null && this.p == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public final HashMap toJSONObject() {
        HashMap jSONObject = super.toJSONObject();
        jSONObject.put("n", this.n.value);
        jSONObject.put("e", this.e.value);
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.value);
        }
        Base64URL base64URL2 = this.p;
        if (base64URL2 != null) {
            jSONObject.put("p", base64URL2.value);
        }
        Base64URL base64URL3 = this.q;
        if (base64URL3 != null) {
            jSONObject.put("q", base64URL3.value);
        }
        Base64URL base64URL4 = this.dp;
        if (base64URL4 != null) {
            jSONObject.put("dp", base64URL4.value);
        }
        Base64URL base64URL5 = this.dq;
        if (base64URL5 != null) {
            jSONObject.put("dq", base64URL5.value);
        }
        Base64URL base64URL6 = this.qi;
        if (base64URL6 != null) {
            jSONObject.put("qi", base64URL6.value);
        }
        List<OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            int i = JSONArrayUtils.$r8$clinit;
            ArrayList arrayList = new ArrayList();
            for (OtherPrimesInfo otherPrimesInfo : list) {
                Gson gson = JSONObjectUtils.GSON;
                HashMap hashMap = new HashMap();
                hashMap.put("r", otherPrimesInfo.r.value);
                hashMap.put("d", otherPrimesInfo.d.value);
                hashMap.put("t", otherPrimesInfo.t.value);
                arrayList.add(hashMap);
            }
            jSONObject.put("oth", arrayList);
        }
        return jSONObject;
    }
}
