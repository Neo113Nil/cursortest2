package com.anythink.core.common.n.b;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f16401a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f16402b;

    public h(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.f16401a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f16402b = Collections.unmodifiableMap(linkedHashMap);
    }

    private h a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f16402b);
        linkedHashMap.put("charset", charset.name());
        return new h(this.f16401a, linkedHashMap);
    }

    private Map<String, String> b() {
        return this.f16402b;
    }

    private String c() {
        return this.f16402b.get("realm");
    }

    private Charset d() {
        String str = this.f16402b.get("charset");
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
        return hVar.f16401a.equals(this.f16401a) && hVar.f16402b.equals(this.f16402b);
    }

    public final int hashCode() {
        return this.f16402b.hashCode() + AbstractC5128c.a(899, 31, this.f16401a);
    }

    public final String toString() {
        return this.f16401a + " authParams=" + this.f16402b;
    }

    private String a() {
        return this.f16401a;
    }

    private h(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 != null) {
            this.f16401a = str;
            this.f16402b = Collections.singletonMap("realm", str2);
            return;
        }
        throw new NullPointerException("realm == null");
    }
}
