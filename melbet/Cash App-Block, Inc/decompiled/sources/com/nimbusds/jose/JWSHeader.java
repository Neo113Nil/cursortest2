package com.nimbusds.jose;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.StandardCharset;
import com.nimbusds.jose.util.X509CertChainUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class JWSHeader extends CommonSEHeader {
    public static final Set REGISTERED_PARAMETER_NAMES;
    public final boolean b64;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWSHeader(JWSAlgorithm jWSAlgorithm, JOSEObjectType jOSEObjectType, String str, Set set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List list, String str2, boolean z, Map map, Base64URL base64URL3) {
        super(jWSAlgorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (jWSAlgorithm.name.equals(Algorithm.NONE.name)) {
            a$$ExternalSyntheticBUOutline0.m$3("The JWS algorithm \"alg\" cannot be \"none\"");
            throw null;
        }
        this.b64 = z;
    }

    public static JWSHeader parse(Base64URL base64URL) {
        Algorithm algorithm;
        Map parse = JSONObjectUtils.parse(20000, new String(base64URL.decode(), StandardCharset.UTF_8));
        String string2 = JSONObjectUtils.getString("alg", parse);
        if (string2 == null) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Missing \"alg\" in header JSON object");
            return null;
        }
        Algorithm algorithm2 = Algorithm.NONE;
        if (string2.equals(algorithm2.name)) {
            algorithm = algorithm2;
        } else if (parse.containsKey("enc")) {
            algorithm = JWEAlgorithm.parse(string2);
        } else {
            JWSAlgorithm jWSAlgorithm = JWSAlgorithm.HS256;
            if (!string2.equals(jWSAlgorithm.name)) {
                jWSAlgorithm = JWSAlgorithm.HS384;
                if (!string2.equals(jWSAlgorithm.name)) {
                    jWSAlgorithm = JWSAlgorithm.HS512;
                    if (!string2.equals(jWSAlgorithm.name)) {
                        jWSAlgorithm = JWSAlgorithm.RS256;
                        if (!string2.equals(jWSAlgorithm.name)) {
                            jWSAlgorithm = JWSAlgorithm.RS384;
                            if (!string2.equals(jWSAlgorithm.name)) {
                                jWSAlgorithm = JWSAlgorithm.RS512;
                                if (!string2.equals(jWSAlgorithm.name)) {
                                    jWSAlgorithm = JWSAlgorithm.ES256;
                                    if (!string2.equals(jWSAlgorithm.name)) {
                                        jWSAlgorithm = JWSAlgorithm.ES256K;
                                        if (!string2.equals(jWSAlgorithm.name)) {
                                            jWSAlgorithm = JWSAlgorithm.ES384;
                                            if (!string2.equals(jWSAlgorithm.name)) {
                                                jWSAlgorithm = JWSAlgorithm.ES512;
                                                if (!string2.equals(jWSAlgorithm.name)) {
                                                    jWSAlgorithm = JWSAlgorithm.PS256;
                                                    if (!string2.equals(jWSAlgorithm.name)) {
                                                        jWSAlgorithm = JWSAlgorithm.PS384;
                                                        if (!string2.equals(jWSAlgorithm.name)) {
                                                            jWSAlgorithm = JWSAlgorithm.PS512;
                                                            if (!string2.equals(jWSAlgorithm.name)) {
                                                                jWSAlgorithm = JWSAlgorithm.EdDSA;
                                                                if (!string2.equals(jWSAlgorithm.name)) {
                                                                    jWSAlgorithm = JWSAlgorithm.Ed25519;
                                                                    if (!string2.equals(jWSAlgorithm.name)) {
                                                                        jWSAlgorithm = JWSAlgorithm.Ed448;
                                                                        if (!string2.equals(jWSAlgorithm.name)) {
                                                                            jWSAlgorithm = new JWSAlgorithm(string2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            algorithm = jWSAlgorithm;
        }
        if (!(algorithm instanceof JWSAlgorithm)) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Not a JWS header");
            return null;
        }
        JWSAlgorithm jWSAlgorithm2 = (JWSAlgorithm) algorithm;
        if (jWSAlgorithm2.name.equals(algorithm2.name)) {
            a$$ExternalSyntheticBUOutline0.m$3("The JWS algorithm \"alg\" cannot be \"none\"");
            return null;
        }
        boolean z = true;
        JOSEObjectType jOSEObjectType = null;
        String str = null;
        HashSet hashSet = null;
        URI uri = null;
        JWK jwk = null;
        URI uri2 = null;
        Base64URL base64URL2 = null;
        Base64URL base64URL3 = null;
        LinkedList linkedList = null;
        String str2 = null;
        HashMap hashMap = null;
        while (true) {
            boolean z2 = z;
            for (String str3 : parse.keySet()) {
                if (!"alg".equals(str3)) {
                    if ("typ".equals(str3)) {
                        String str4 = (String) JSONObjectUtils.getGeneric(parse, str3, String.class);
                        if (str4 != null) {
                            jOSEObjectType = new JOSEObjectType(str4);
                        }
                    } else if ("cty".equals(str3)) {
                        str = (String) JSONObjectUtils.getGeneric(parse, str3, String.class);
                    } else if ("crit".equals(str3)) {
                        List stringList = JSONObjectUtils.getStringList(str3, parse);
                        if (stringList != null) {
                            hashSet = new HashSet(stringList);
                        }
                    } else if ("jku".equals(str3)) {
                        uri = JSONObjectUtils.getURI(str3, parse);
                    } else if ("jwk".equals(str3)) {
                        Map jSONObject = JSONObjectUtils.getJSONObject(str3, parse);
                        if (jSONObject == null) {
                            jwk = null;
                        } else {
                            JWK parse2 = JWK.parse(jSONObject);
                            if (parse2.isPrivate()) {
                                JWK$$ExternalSyntheticBUOutline0.m$1("Non-public key in jwk header parameter");
                                return null;
                            }
                            jwk = parse2;
                        }
                        if (jwk != null && jwk.isPrivate()) {
                            a$$ExternalSyntheticBUOutline0.m$3("The JWK must be public");
                            return null;
                        }
                    } else if ("x5u".equals(str3)) {
                        uri2 = JSONObjectUtils.getURI(str3, parse);
                    } else if ("x5t".equals(str3)) {
                        base64URL2 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str3, String.class));
                    } else if ("x5t#S256".equals(str3)) {
                        base64URL3 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str3, String.class));
                    } else if ("x5c".equals(str3)) {
                        linkedList = X509CertChainUtils.toBase64List((List) JSONObjectUtils.getGeneric(parse, str3, List.class));
                    } else if ("kid".equals(str3)) {
                        str2 = (String) JSONObjectUtils.getGeneric(parse, str3, String.class);
                    } else if ("b64".equals(str3)) {
                        Boolean bool = (Boolean) JSONObjectUtils.getGeneric(parse, str3, Boolean.class);
                        if (bool == null) {
                            JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JSON object member ", str3, " is missing or null"));
                            return null;
                        }
                        z = bool.booleanValue();
                    } else {
                        Object obj = parse.get(str3);
                        if (REGISTERED_PARAMETER_NAMES.contains(str3)) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The parameter name \"", str3, "\" matches a registered name"));
                            return null;
                        }
                        HashMap hashMap2 = hashMap == null ? new HashMap() : hashMap;
                        hashMap2.put(str3, obj);
                        hashMap = hashMap2;
                    }
                }
            }
            return new JWSHeader(jWSAlgorithm2, jOSEObjectType, str, hashSet, uri, jwk, uri2, base64URL2, base64URL3, linkedList, str2, z2, hashMap, base64URL);
        }
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final HashMap toJSONObject() {
        HashMap jSONObject = super.toJSONObject();
        if (!this.b64) {
            jSONObject.put("b64", Boolean.FALSE);
        }
        return jSONObject;
    }
}
