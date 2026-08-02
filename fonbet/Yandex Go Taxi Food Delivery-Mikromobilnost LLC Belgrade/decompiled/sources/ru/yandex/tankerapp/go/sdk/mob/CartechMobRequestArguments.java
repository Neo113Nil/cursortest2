package ru.yandex.tankerapp.go.sdk.mob;

import defpackage.b64;
import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR4\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\r\u0010\fR4\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/tankerapp/go/sdk/mob/CartechMobRequestArguments;", "Ljava/io/Serializable;", "", "", "", "endpoints", "additionalHeaders", "additionalQueryItems", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "getEndpoints", "()Ljava/util/Map;", "getAdditionalHeaders", "getAdditionalQueryItems", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CartechMobRequestArguments implements Serializable {

    @ysq0("additionalHeaders")
    private final Map<Object, Map<String, Object>> additionalHeaders;

    @ysq0("additionalQueryItems")
    private final Map<Object, Map<String, Object>> additionalQueryItems;

    @ysq0("endpoints")
    private final Map<Object, String> endpoints;

    public /* synthetic */ CartechMobRequestArguments(Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartechMobRequestArguments)) {
            return false;
        }
        CartechMobRequestArguments cartechMobRequestArguments = (CartechMobRequestArguments) obj;
        return jl40.l(this.endpoints, cartechMobRequestArguments.endpoints) && jl40.l(this.additionalHeaders, cartechMobRequestArguments.additionalHeaders) && jl40.l(this.additionalQueryItems, cartechMobRequestArguments.additionalQueryItems);
    }

    public final int hashCode() {
        Map<Object, String> map = this.endpoints;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<Object, Map<String, Object>> map2 = this.additionalHeaders;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<Object, Map<String, Object>> map3 = this.additionalQueryItems;
        return hashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        Map<Object, String> map = this.endpoints;
        Map<Object, Map<String, Object>> map2 = this.additionalHeaders;
        Map<Object, Map<String, Object>> map3 = this.additionalQueryItems;
        StringBuilder sb = new StringBuilder("CartechMobRequestArguments(endpoints=");
        sb.append(map);
        sb.append(", additionalHeaders=");
        sb.append(map2);
        sb.append(", additionalQueryItems=");
        return b64.r(sb, map3, Extension.C_BRAKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CartechMobRequestArguments(Map<Object, String> map, Map<Object, ? extends Map<String, ? extends Object>> map2, Map<Object, ? extends Map<String, ? extends Object>> map3) {
        this.endpoints = map;
        this.additionalHeaders = map2;
        this.additionalQueryItems = map3;
    }

    public CartechMobRequestArguments() {
        this(null, null, null, 7, null);
    }
}
