package com.nimbusds.jwt;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class JWTClaimsSet implements Serializable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final LinkedHashMap claims;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        Collections.unmodifiableSet(hashSet);
    }

    public JWTClaimsSet(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.claims = linkedHashMap2;
        linkedHashMap2.putAll(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JWTClaimsSet) {
            return Objects.equals(this.claims, ((JWTClaimsSet) obj).claims);
        }
        return false;
    }

    public final List getStringListClaim() {
        List list;
        String[] strArr;
        LinkedHashMap linkedHashMap = this.claims;
        if (linkedHashMap.get("aud") == null) {
            list = null;
        } else {
            try {
                list = (List) linkedHashMap.get("aud");
            } catch (ClassCastException unused) {
                JWK$$ExternalSyntheticBUOutline0.m$1("The aud claim is not a list / JSON array");
                return null;
            }
        }
        if (list == null) {
            strArr = null;
        } else {
            int size = list.size();
            strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused2) {
                    JWK$$ExternalSyntheticBUOutline0.m$1("The aud claim is not a list / JSON array of strings");
                    return null;
                }
            }
        }
        if (strArr == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final int hashCode() {
        return Objects.hash(this.claims);
    }

    public final String toString() {
        List list;
        Gson gson = JSONObjectUtils.GSON;
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = this.claims;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() instanceof Date) {
                hashMap.put(entry.getKey(), Long.valueOf(((Date) entry.getValue()).getTime() / 1000));
            } else if ("aud".equals(entry.getKey())) {
                Object obj = linkedHashMap.get("aud");
                if (obj instanceof String) {
                    list = Collections.singletonList((String) obj);
                } else {
                    try {
                        list = getStringListClaim();
                        if (list == null) {
                            list = Collections.EMPTY_LIST;
                        }
                    } catch (ParseException unused) {
                        list = Collections.EMPTY_LIST;
                    }
                }
                if (list != null && !list.isEmpty()) {
                    if (list.size() == 1) {
                        hashMap.put("aud", list.get(0));
                    } else {
                        int i = JSONArrayUtils.$r8$clinit;
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(list);
                        hashMap.put("aud", arrayList);
                    }
                }
            } else if (entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return JSONObjectUtils.toJSONString(hashMap);
    }
}
