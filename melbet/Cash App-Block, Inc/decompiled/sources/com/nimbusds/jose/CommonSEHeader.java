package com.nimbusds.jose;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CommonSEHeader implements Serializable {
    public static final Map EMPTY_CUSTOM_PARAMS = Collections.unmodifiableMap(new HashMap());
    public final Algorithm alg;
    public final Set crit;
    public final String cty;
    public final Map customParams;
    public final URI jku;
    public final JWK jwk;
    public final String kid;
    public final Base64URL parsedBase64URL;
    public final JOSEObjectType typ;
    public final List x5c;
    public final Base64URL x5t;
    public final Base64URL x5t256;
    public final URI x5u;

    public CommonSEHeader(Algorithm algorithm, JOSEObjectType jOSEObjectType, String str, Set set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List list, String str2, Map map, Base64URL base64URL3) {
        this.alg = algorithm;
        this.typ = jOSEObjectType;
        this.cty = str;
        if (set != null) {
            this.crit = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.crit = null;
        }
        if (map != null) {
            this.customParams = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.customParams = EMPTY_CUSTOM_PARAMS;
        }
        this.parsedBase64URL = base64URL3;
        this.jku = uri;
        this.jwk = jwk;
        this.x5u = uri2;
        this.x5t = base64URL;
        this.x5t256 = base64URL2;
        if (list != null) {
            this.x5c = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.x5c = null;
        }
        this.kid = str2;
    }

    public final Base64URL toBase64URL() {
        Base64URL base64URL = this.parsedBase64URL;
        return base64URL == null ? Base64URL.encode(toString().getBytes(StandardCharset.UTF_8)) : base64URL;
    }

    public HashMap toJSONObject() {
        Gson gson = JSONObjectUtils.GSON;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.customParams);
        Algorithm algorithm = this.alg;
        if (algorithm != null) {
            hashMap.put("alg", algorithm.name);
        }
        JOSEObjectType jOSEObjectType = this.typ;
        if (jOSEObjectType != null) {
            hashMap.put("typ", jOSEObjectType.f1027type);
        }
        String str = this.cty;
        if (str != null) {
            hashMap.put("cty", str);
        }
        Set set = this.crit;
        if (set != null && !set.isEmpty()) {
            hashMap.put("crit", new ArrayList(set));
        }
        URI uri = this.jku;
        if (uri != null) {
            hashMap.put("jku", uri.toString());
        }
        JWK jwk = this.jwk;
        if (jwk != null) {
            hashMap.put("jwk", jwk.toJSONObject());
        }
        URI uri2 = this.x5u;
        if (uri2 != null) {
            hashMap.put("x5u", uri2.toString());
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
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Base64) it.next()).value);
            }
            hashMap.put("x5c", arrayList);
        }
        String str2 = this.kid;
        if (str2 != null) {
            hashMap.put("kid", str2);
        }
        return hashMap;
    }

    public final String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }
}
