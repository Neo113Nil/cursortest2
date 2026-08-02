package com.nimbusds.jose.jwk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.jwk.KeyRevocation;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import java.io.Serializable;
import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.internal.ZipFilesKt;

/* loaded from: classes5.dex */
public abstract class JWK implements Serializable {
    public final Algorithm alg;
    public final Date exp;
    public final Date iat;
    public final String kid;
    public final KeyType kty;
    public final Date nbf;
    public final Set ops;
    public final LinkedList parsedX5c;
    public final KeyRevocation revocation;
    public final KeyUse use;
    public final List x5c;
    public final Base64URL x5t;
    public final Base64URL x5t256;
    public final URI x5u;

    public JWK(KeyType keyType, KeyUse keyUse, Set set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List list, Date date, Date date2, Date date3, KeyRevocation keyRevocation) {
        Objects.requireNonNull(keyType, "The key type \"kty\" parameter must not be null");
        this.kty = keyType;
        Map map = KeyUseAndOpsConsistency.MAP;
        if (keyUse != null && set != null) {
            Map map2 = KeyUseAndOpsConsistency.MAP;
            if (map2.containsKey(keyUse) && !((Set) map2.get(keyUse)).containsAll(set)) {
                a$$ExternalSyntheticBUOutline0.m$3("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
                throw null;
            }
        }
        this.use = keyUse;
        this.ops = set;
        this.alg = algorithm;
        this.kid = str;
        this.x5u = uri;
        this.x5t = base64URL;
        this.x5t256 = base64URL2;
        if (list != null && list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("The X.509 certificate chain \"x5c\" must not be empty");
            throw null;
        }
        this.x5c = list;
        try {
            this.parsedX5c = X509CertChainUtils.parse(list);
            this.exp = date;
            this.nbf = date2;
            this.iat = date3;
            this.revocation = keyRevocation;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
        }
    }

    public static JWK parse(Map map) {
        JWK jwk;
        ArrayList arrayList;
        List list;
        String str;
        Iterator it;
        String string2 = JSONObjectUtils.getString("kty", map);
        if (string2 == null) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Missing key type \"kty\" parameter");
            return null;
        }
        KeyType parse = KeyType.parse(string2);
        if (parse == KeyType.EC) {
            return ECKey.parse(map);
        }
        KeyType keyType = KeyType.RSA;
        if (parse != keyType) {
            KeyType keyType2 = KeyType.OCT;
            if (parse == keyType2) {
                if (!keyType2.equals(ZipFilesKt.parseKeyType(map))) {
                    JWK$$ExternalSyntheticBUOutline0.m$3(keyType2.value, "The key type kty must be ");
                    return null;
                }
                try {
                    return new OctetSequenceKey(JSONObjectUtils.getBase64URL("k", map), ZipFilesKt.parseKeyUse(map), ZipFilesKt.parseKeyOperations(map), ZipFilesKt.parseAlgorithm(map), (String) JSONObjectUtils.getGeneric(map, "kid", String.class), JSONObjectUtils.getURI("x5u", map), JSONObjectUtils.getBase64URL("x5t", map), JSONObjectUtils.getBase64URL("x5t#S256", map), ZipFilesKt.parseX509CertChain(map), ZipFilesKt.parseExpirationTime(map), ZipFilesKt.parseNotBeforeTime(map), ZipFilesKt.parseIssueTime(map), ZipFilesKt.parseKeyRevocation(map));
                } catch (Exception e) {
                    JWK$$ExternalSyntheticBUOutline0.m$1(e.getMessage());
                    return null;
                }
            }
            KeyType keyType3 = KeyType.OKP;
            if (parse != keyType3) {
                throw new ParseException("Unsupported key type \"kty\" parameter: " + parse, 0);
            }
            Set set = OctetKeyPair.SUPPORTED_CURVES;
            if (!keyType3.equals(ZipFilesKt.parseKeyType(map))) {
                JWK$$ExternalSyntheticBUOutline0.m$3(keyType3.value, "The key type kty must be ");
                return null;
            }
            try {
                Curve parse2 = Curve.parse((String) JSONObjectUtils.getGeneric(map, "crv", String.class));
                Base64URL base64URL = JSONObjectUtils.getBase64URL("x", map);
                Base64URL base64URL2 = JSONObjectUtils.getBase64URL("d", map);
                try {
                    return base64URL2 == null ? new OctetKeyPair(parse2, base64URL, ZipFilesKt.parseKeyUse(map), ZipFilesKt.parseKeyOperations(map), ZipFilesKt.parseAlgorithm(map), (String) JSONObjectUtils.getGeneric(map, "kid", String.class), JSONObjectUtils.getURI("x5u", map), JSONObjectUtils.getBase64URL("x5t", map), JSONObjectUtils.getBase64URL("x5t#S256", map), ZipFilesKt.parseX509CertChain(map), ZipFilesKt.parseExpirationTime(map), ZipFilesKt.parseNotBeforeTime(map), ZipFilesKt.parseIssueTime(map), ZipFilesKt.parseKeyRevocation(map)) : new OctetKeyPair(parse2, base64URL, base64URL2, ZipFilesKt.parseKeyUse(map), ZipFilesKt.parseKeyOperations(map), ZipFilesKt.parseAlgorithm(map), (String) JSONObjectUtils.getGeneric(map, "kid", String.class), JSONObjectUtils.getURI("x5u", map), JSONObjectUtils.getBase64URL("x5t", map), JSONObjectUtils.getBase64URL("x5t#S256", map), ZipFilesKt.parseX509CertChain(map), ZipFilesKt.parseExpirationTime(map), ZipFilesKt.parseNotBeforeTime(map), ZipFilesKt.parseIssueTime(map), ZipFilesKt.parseKeyRevocation(map));
                } catch (Exception e2) {
                    JWK$$ExternalSyntheticBUOutline0.m$1(e2.getMessage());
                    return null;
                }
            } catch (IllegalArgumentException e3) {
                JWK$$ExternalSyntheticBUOutline0.m$1(e3.getMessage());
                return null;
            }
        }
        if (!keyType.equals(ZipFilesKt.parseKeyType(map))) {
            JWK$$ExternalSyntheticBUOutline0.m$1("The key type \"kty\" must be RSA");
            return null;
        }
        Base64URL base64URL3 = JSONObjectUtils.getBase64URL("n", map);
        Base64URL base64URL4 = JSONObjectUtils.getBase64URL("e", map);
        Base64URL base64URL5 = JSONObjectUtils.getBase64URL("d", map);
        Base64URL base64URL6 = JSONObjectUtils.getBase64URL("p", map);
        Base64URL base64URL7 = JSONObjectUtils.getBase64URL("q", map);
        Base64URL base64URL8 = JSONObjectUtils.getBase64URL("dp", map);
        String str2 = "dq";
        Base64URL base64URL9 = JSONObjectUtils.getBase64URL("dq", map);
        Base64URL base64URL10 = JSONObjectUtils.getBase64URL("qi", map);
        if (!map.containsKey("oth") || (list = (List) JSONObjectUtils.getGeneric(map, "oth", List.class)) == null) {
            jwk = null;
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof Map) {
                    Map map2 = (Map) next;
                    it = it2;
                    str = str2;
                    try {
                        arrayList2.add(new RSAKey.OtherPrimesInfo(JSONObjectUtils.getBase64URL("r", map2), JSONObjectUtils.getBase64URL(str2, map2), JSONObjectUtils.getBase64URL("t", map2)));
                    } catch (IllegalArgumentException e4) {
                        JWK$$ExternalSyntheticBUOutline0.m$1(e4.getMessage());
                        return null;
                    }
                } else {
                    str = str2;
                    it = it2;
                }
                it2 = it;
                str2 = str;
            }
            jwk = null;
            arrayList = arrayList2;
        }
        try {
            return new RSAKey(base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, base64URL9, base64URL10, arrayList, ZipFilesKt.parseKeyUse(map), ZipFilesKt.parseKeyOperations(map), ZipFilesKt.parseAlgorithm(map), (String) JSONObjectUtils.getGeneric(map, "kid", String.class), JSONObjectUtils.getURI("x5u", map), JSONObjectUtils.getBase64URL("x5t", map), JSONObjectUtils.getBase64URL("x5t#S256", map), ZipFilesKt.parseX509CertChain(map), ZipFilesKt.parseExpirationTime(map), ZipFilesKt.parseNotBeforeTime(map), ZipFilesKt.parseIssueTime(map), ZipFilesKt.parseKeyRevocation(map));
        } catch (Exception e5) {
            JWK$$ExternalSyntheticBUOutline0.m$1(e5.getMessage());
            return jwk;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        return Objects.equals(this.kty, jwk.kty) && Objects.equals(this.use, jwk.use) && Objects.equals(this.ops, jwk.ops) && Objects.equals(this.alg, jwk.alg) && Objects.equals(this.kid, jwk.kid) && Objects.equals(this.x5u, jwk.x5u) && Objects.equals(this.x5t, jwk.x5t) && Objects.equals(this.x5t256, jwk.x5t256) && Objects.equals(this.x5c, jwk.x5c) && Objects.equals(this.exp, jwk.exp) && Objects.equals(this.nbf, jwk.nbf) && Objects.equals(this.iat, jwk.iat) && Objects.equals(this.revocation, jwk.revocation);
    }

    public final List getParsedX509CertChain() {
        LinkedList linkedList = this.parsedX5c;
        if (linkedList == null) {
            return null;
        }
        return Collections.unmodifiableList(linkedList);
    }

    public int hashCode() {
        return Objects.hash(this.kty, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.exp, this.nbf, this.iat, this.revocation, null);
    }

    public abstract boolean isPrivate();

    public HashMap toJSONObject() {
        Gson gson = JSONObjectUtils.GSON;
        HashMap hashMap = new HashMap();
        hashMap.put("kty", this.kty.value);
        KeyUse keyUse = this.use;
        if (keyUse != null) {
            hashMap.put("use", keyUse.identifier);
        }
        Set set = this.ops;
        if (set != null) {
            int i = JSONArrayUtils.$r8$clinit;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((KeyOperation) it.next()).identifier);
            }
            hashMap.put("key_ops", arrayList);
        }
        Algorithm algorithm = this.alg;
        if (algorithm != null) {
            hashMap.put("alg", algorithm.name);
        }
        String str = this.kid;
        if (str != null) {
            hashMap.put("kid", str);
        }
        URI uri = this.x5u;
        if (uri != null) {
            hashMap.put("x5u", uri.toString());
        }
        Base64URL base64URL = this.x5t;
        if (base64URL != null) {
            hashMap.put("x5t", base64URL.value);
        }
        Base64URL base64URL2 = this.x5t256;
        if (base64URL2 != null) {
            hashMap.put("x5t#S256", base64URL2.value);
        }
        List list = this.x5c;
        if (list != null) {
            int i2 = JSONArrayUtils.$r8$clinit;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Base64) it2.next()).value);
            }
            hashMap.put("x5c", arrayList2);
        }
        Date date = this.exp;
        if (date != null) {
            hashMap.put("exp", Long.valueOf(date.getTime() / 1000));
        }
        Date date2 = this.nbf;
        if (date2 != null) {
            hashMap.put("nbf", Long.valueOf(date2.getTime() / 1000));
        }
        Date date3 = this.iat;
        if (date3 != null) {
            hashMap.put("iat", Long.valueOf(date3.getTime() / 1000));
        }
        KeyRevocation keyRevocation = this.revocation;
        if (keyRevocation != null) {
            Gson gson2 = JSONObjectUtils.GSON;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("revoked_at", Long.valueOf(keyRevocation.revokedAt.getTime() / 1000));
            KeyRevocation.Reason reason = keyRevocation.reason;
            if (reason != null) {
                hashMap2.put("reason", reason.value);
            }
            hashMap.put("revoked", hashMap2);
        }
        return hashMap;
    }

    public final String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }
}
