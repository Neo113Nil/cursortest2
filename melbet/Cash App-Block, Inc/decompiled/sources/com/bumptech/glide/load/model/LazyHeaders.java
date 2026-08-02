package com.bumptech.glide.load.model;

import android.text.TextUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class LazyHeaders implements Headers {
    public volatile Map combinedHeaders;
    public final Map headers;

    public final class Builder {
        public static final Map DEFAULT_HEADERS;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new StringHeaderFactory(property)));
            }
            DEFAULT_HEADERS = Collections.unmodifiableMap(hashMap);
        }
    }

    public final class StringHeaderFactory {
        public final String value;

        public StringHeaderFactory(String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StringHeaderFactory) {
                return this.value.equals(((StringHeaderFactory) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("StringHeaderFactory{value='"), this.value, "'}");
        }
    }

    public LazyHeaders(Map map) {
        this.headers = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.headers.equals(((LazyHeaders) obj).headers);
        }
        return false;
    }

    public final HashMap generateHeaders() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.headers.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((StringHeaderFactory) list.get(i)).value;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public final Map getHeaders() {
        if (this.combinedHeaders == null) {
            synchronized (this) {
                try {
                    if (this.combinedHeaders == null) {
                        this.combinedHeaders = Collections.unmodifiableMap(generateHeaders());
                    }
                } finally {
                }
            }
        }
        return this.combinedHeaders;
    }

    public final int hashCode() {
        return this.headers.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.headers + '}';
    }
}
