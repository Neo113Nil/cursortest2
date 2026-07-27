package com.anythink.core.common.n.b;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f15614a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f15615b;

    public h(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.f15614a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f15615b = Collections.unmodifiableMap(linkedHashMap);
    }

    private h a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f15615b);
        linkedHashMap.put("charset", charset.name());
        return new h(this.f15614a, linkedHashMap);
    }

    private Map<String, String> b() {
        return this.f15615b;
    }

    private String c() {
        return this.f15615b.get("realm");
    }

    private Charset d() {
        String str = this.f15615b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f15614a.equals(this.f15614a) && hVar.f15615b.equals(this.f15615b);
    }

    public final int hashCode() {
        return this.f15615b.hashCode() + u1.h.k(899, 31, this.f15614a);
    }

    public final String toString() {
        return this.f15614a + " authParams=" + this.f15615b;
    }

    private String a() {
        return this.f15614a;
    }

    private h(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 != null) {
            this.f15614a = str;
            this.f15615b = Collections.singletonMap("realm", str2);
            return;
        }
        throw new NullPointerException("realm == null");
    }
}
