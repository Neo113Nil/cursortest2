package ru.rt.ebs.cryptosdk.core.networkClient.entities;

import defpackage.scc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aBQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u0000\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientRequest;", "T", "", "method", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMethod;", "url", "", "headers", "", "", "body", "parts", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMultipartBodyPart;", "<init>", "(Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMethod;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/List;)V", "getMethod", "()Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMethod;", "getUrl", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getParts", "()Ljava/util/List;", "Builder", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NetworkClientRequest<T> {
    private final T body;
    private final Map<String, List<String>> headers;
    private final NetworkClientMethod method;
    private final List<NetworkClientMultipartBodyPart> parts;
    private final String url;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u000fJ\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientRequest$Builder;", "T", "", "method", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMethod;", "url", "", "<init>", "(Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMethod;Ljava/lang/String;)V", "headers", "", "", "body", "Ljava/lang/Object;", "parts", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientMultipartBodyPart;", "addHeader", "key", "value", "addHeaders", "", "setBody", "(Ljava/lang/Object;)Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientRequest$Builder;", "addPart", "part", "addParts", "", "build", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientRequest;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder<T> {
        private T body;
        private final NetworkClientMethod method;
        private final String url;
        private final Map<String, List<String>> headers = new LinkedHashMap();
        private final List<NetworkClientMultipartBodyPart> parts = new ArrayList();

        public Builder(NetworkClientMethod networkClientMethod, String str) {
            this.method = networkClientMethod;
            this.url = str;
        }

        public final Builder<T> addHeader(String key, String value) {
            boolean containsKey = this.headers.containsKey(key);
            Map<String, List<String>> map = this.headers;
            if (!containsKey) {
                map.put(key, scc.i(value));
                return this;
            }
            List<String> list = map.get(key);
            if (list != null) {
                list.add(value);
            }
            return this;
        }

        public final Builder<T> addHeaders(Map<String, String> headers) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                addHeader(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final Builder<T> addPart(NetworkClientMultipartBodyPart part) {
            this.parts.add(part);
            return this;
        }

        public final Builder<T> addParts(List<NetworkClientMultipartBodyPart> parts) {
            this.parts.addAll(parts);
            return this;
        }

        public final NetworkClientRequest<T> build() {
            return new NetworkClientRequest<>(this.method, this.url, this.headers, this.body, this.parts, null);
        }

        public final Builder<T> setBody(T body) {
            this.body = body;
            return this;
        }
    }

    public /* synthetic */ NetworkClientRequest(NetworkClientMethod networkClientMethod, String str, Map map, Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkClientMethod, str, (i & 4) != 0 ? b.f() : map, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? EmptyList.a : list);
    }

    public final T getBody() {
        return this.body;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final NetworkClientMethod getMethod() {
        return this.method;
    }

    public final List<NetworkClientMultipartBodyPart> getParts() {
        return this.parts;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NetworkClientRequest(NetworkClientMethod networkClientMethod, String str, Map<String, ? extends List<String>> map, T t, List<NetworkClientMultipartBodyPart> list) {
        this.method = networkClientMethod;
        this.url = str;
        this.headers = map;
        this.body = t;
        this.parts = list;
    }

    public /* synthetic */ NetworkClientRequest(NetworkClientMethod networkClientMethod, String str, Map map, Object obj, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkClientMethod, str, map, obj, list);
    }
}
