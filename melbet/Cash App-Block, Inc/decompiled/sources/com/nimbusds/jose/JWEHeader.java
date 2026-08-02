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
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public final class JWEHeader extends CommonSEHeader {
    public static final Set REGISTERED_PARAMETER_NAMES;
    public final Base64URL apu;
    public final Base64URL apv;
    public final List aud;
    public final EncryptionMethod enc;
    public final JWK epk;
    public final String iss;
    public final Base64URL iv;
    public final int p2c;
    public final Base64URL p2s;
    public final String skid;
    public final String sub;
    public final Base64URL tag;
    public final CompressionAlgorithm zip;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("authTag");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, HashSet hashSet, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, LinkedList linkedList, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, String str3, String str4, String str5, List list, HashMap hashMap, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, hashSet, uri, jwk, uri2, base64URL, base64URL2, linkedList, str2, hashMap, base64URL8);
        if (algorithm != null && algorithm.name.equals(Algorithm.NONE.name)) {
            a$$ExternalSyntheticBUOutline0.m$3("The JWE algorithm cannot be \"none\"");
            throw null;
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            a$$ExternalSyntheticBUOutline0.m$3("Ephemeral public key should not be a private key");
            throw null;
        }
        Objects.requireNonNull(encryptionMethod);
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i;
        this.iv = base64URL6;
        this.tag = base64URL7;
        this.skid = str3;
        this.iss = str4;
        this.sub = str5;
        this.aud = list;
    }

    public static JWEHeader parse(Base64URL base64URL) {
        Map parse = JSONObjectUtils.parse(20000, new String(base64URL.decode(), StandardCharset.UTF_8));
        String string2 = JSONObjectUtils.getString("enc", parse);
        EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
        if (!string2.equals(encryptionMethod.name)) {
            encryptionMethod = EncryptionMethod.A192CBC_HS384;
            if (!string2.equals(encryptionMethod.name)) {
                encryptionMethod = EncryptionMethod.A256CBC_HS512;
                if (!string2.equals(encryptionMethod.name)) {
                    encryptionMethod = EncryptionMethod.A128GCM;
                    if (!string2.equals(encryptionMethod.name)) {
                        encryptionMethod = EncryptionMethod.A192GCM;
                        if (!string2.equals(encryptionMethod.name)) {
                            encryptionMethod = EncryptionMethod.A256GCM;
                            if (!string2.equals(encryptionMethod.name)) {
                                encryptionMethod = EncryptionMethod.A128CBC_HS256_DEPRECATED;
                                if (!string2.equals(encryptionMethod.name)) {
                                    encryptionMethod = EncryptionMethod.A256CBC_HS512_DEPRECATED;
                                    if (!string2.equals(encryptionMethod.name)) {
                                        encryptionMethod = EncryptionMethod.XC20P;
                                        if (!string2.equals(encryptionMethod.name)) {
                                            encryptionMethod = new EncryptionMethod(string2, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        EncryptionMethod encryptionMethod2 = encryptionMethod;
        JWEAlgorithm jWEAlgorithm = null;
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
        JWK jwk2 = null;
        CompressionAlgorithm compressionAlgorithm = null;
        Base64URL base64URL4 = null;
        Base64URL base64URL5 = null;
        Base64URL base64URL6 = null;
        Base64URL base64URL7 = null;
        Base64URL base64URL8 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        HashMap hashMap = null;
        int i = 0;
        for (String str6 : parse.keySet()) {
            if ("alg".equals(str6)) {
                jWEAlgorithm = JWEAlgorithm.parse((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("enc".equals(str6)) {
                continue;
            } else if ("typ".equals(str6)) {
                String str7 = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
                if (str7 != null) {
                    jOSEObjectType = new JOSEObjectType(str7);
                }
            } else if ("cty".equals(str6)) {
                str = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
            } else if ("crit".equals(str6)) {
                List stringList = JSONObjectUtils.getStringList(str6, parse);
                if (stringList != null) {
                    hashSet = new HashSet(stringList);
                }
            } else if ("jku".equals(str6)) {
                uri = JSONObjectUtils.getURI(str6, parse);
            } else if ("jwk".equals(str6)) {
                Map jSONObject = JSONObjectUtils.getJSONObject(str6, parse);
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
            } else if ("x5u".equals(str6)) {
                uri2 = JSONObjectUtils.getURI(str6, parse);
            } else if ("x5t".equals(str6)) {
                base64URL2 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("x5t#S256".equals(str6)) {
                base64URL3 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("x5c".equals(str6)) {
                linkedList = X509CertChainUtils.toBase64List((List) JSONObjectUtils.getGeneric(parse, str6, List.class));
            } else if ("kid".equals(str6)) {
                str2 = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
            } else if ("epk".equals(str6)) {
                jwk2 = JWK.parse(JSONObjectUtils.getJSONObject(str6, parse));
            } else if ("zip".equals(str6)) {
                String str8 = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
                if (str8 != null) {
                    compressionAlgorithm = new CompressionAlgorithm(str8);
                }
            } else if ("apu".equals(str6)) {
                base64URL4 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("apv".equals(str6)) {
                base64URL5 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("p2s".equals(str6)) {
                base64URL6 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("p2c".equals(str6)) {
                Number number = (Number) JSONObjectUtils.getGeneric(parse, str6, Number.class);
                if (number == null) {
                    JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JSON object member ", str6, " is missing or null"));
                    return null;
                }
                int intValue = number.intValue();
                if (intValue < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("The PBES2 count parameter must not be negative");
                    return null;
                }
                i = intValue;
            } else if ("iv".equals(str6)) {
                base64URL7 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("tag".equals(str6)) {
                base64URL8 = Base64URL.from((String) JSONObjectUtils.getGeneric(parse, str6, String.class));
            } else if ("skid".equals(str6)) {
                str3 = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
            } else if ("iss".equals(str6)) {
                str4 = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
            } else if ("sub".equals(str6)) {
                str5 = (String) JSONObjectUtils.getGeneric(parse, str6, String.class);
            } else if ("aud".equals(str6)) {
                list = parse.get(str6) instanceof String ? Collections.singletonList((String) JSONObjectUtils.getGeneric(parse, str6, String.class)) : JSONObjectUtils.getStringList(str6, parse);
            } else {
                Object obj = parse.get(str6);
                if (REGISTERED_PARAMETER_NAMES.contains(str6)) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The parameter name \"", str6, "\" matches a registered name"));
                    return null;
                }
                HashMap hashMap2 = hashMap == null ? new HashMap() : hashMap;
                hashMap2.put(str6, obj);
                hashMap = hashMap2;
            }
        }
        return new JWEHeader(jWEAlgorithm, encryptionMethod2, jOSEObjectType, str, hashSet, uri, jwk, uri2, base64URL2, base64URL3, linkedList, str2, jwk2, compressionAlgorithm, base64URL4, base64URL5, base64URL6, i, base64URL7, base64URL8, str3, str4, str5, list, hashMap, base64URL);
    }

    @Override // com.nimbusds.jose.CommonSEHeader
    public final HashMap toJSONObject() {
        HashMap jSONObject = super.toJSONObject();
        EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put("enc", encryptionMethod.name);
        }
        JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put("epk", jwk.toJSONObject());
        }
        CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put("zip", compressionAlgorithm.name);
        }
        Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put("apu", base64URL.value);
        }
        Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put("apv", base64URL2.value);
        }
        Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put("p2s", base64URL3.value);
        }
        int i = this.p2c;
        if (i > 0) {
            jSONObject.put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.iv;
        if (base64URL4 != null) {
            jSONObject.put("iv", base64URL4.value);
        }
        Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put("tag", base64URL5.value);
        }
        String str = this.skid;
        if (str != null) {
            jSONObject.put("skid", str);
        }
        String str2 = this.iss;
        if (str2 != null) {
            jSONObject.put("iss", str2);
        }
        String str3 = this.sub;
        if (str3 != null) {
            jSONObject.put("sub", str3);
        }
        List list = this.aud;
        if (list != null) {
            if (list.size() == 1) {
                jSONObject.put("aud", list.get(0));
                return jSONObject;
            }
            if (!list.isEmpty()) {
                jSONObject.put("aud", list);
            }
        }
        return jSONObject;
    }
}
