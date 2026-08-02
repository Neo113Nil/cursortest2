package coil3.network;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NetworkHeaders {
    public static final NetworkHeaders EMPTY = new NetworkHeaders(MapsKt__MapsKt.toMap(new LinkedHashMap()));
    public final Map data;

    public NetworkHeaders(Map map) {
        this.data = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkHeaders) && Intrinsics.areEqual(this.data, ((NetworkHeaders) obj).data);
    }

    public final String get() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.data.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.lastOrNull(list);
        }
        return null;
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("NetworkHeaders(data=", ")", this.data);
    }

    public final class Builder {
        public final LinkedHashMap data;

        public Builder(NetworkHeaders networkHeaders) {
            Map map = networkHeaders.data;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
            }
            this.data = linkedHashMap;
        }

        public static String key(int i, int i2, String str) {
            return i + '-' + i2 + '-' + str;
        }

        public void set(String str) {
            String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.data.put(lowerCase, CollectionsKt__CollectionsKt.mutableListOf(str));
        }

        public Builder() {
            this.data = new LinkedHashMap();
        }
    }
}
