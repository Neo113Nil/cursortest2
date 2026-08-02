package coil3.network;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public abstract class CacheNetworkResponse {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewInvesting.deepLinkSpecs;
    }

    public static NetworkResponse readFrom(RealBufferedSource realBufferedSource) {
        int parseInt = Integer.parseInt(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
        long parseLong = Long.parseLong(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
        long parseLong2 = Long.parseLong(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int parseInt2 = Integer.parseInt(realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE));
        for (int i = 0; i < parseInt2; i++) {
            String readUtf8LineStrict = realBufferedSource.readUtf8LineStrict(Long.MAX_VALUE);
            int indexOf$default = StringsKt.indexOf$default((CharSequence) readUtf8LineStrict, ':', 0, false, 6);
            if (indexOf$default == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) "Unexpected header: ".concat(readUtf8LineStrict));
                return null;
            }
            String obj = StringsKt.trim(readUtf8LineStrict.substring(0, indexOf$default)).toString();
            String substring = readUtf8LineStrict.substring(indexOf$default + 1);
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj2 = linkedHashMap.get(lowerCase);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(lowerCase, obj2);
            }
            ((List) obj2).add(substring);
        }
        return new NetworkResponse(parseInt, parseLong, parseLong2, new NetworkHeaders(MapsKt__MapsKt.toMap(linkedHashMap)), null, null);
    }

    public static void writeTo(NetworkResponse networkResponse, RealBufferedSink realBufferedSink) {
        realBufferedSink.writeDecimalLong(networkResponse.code);
        realBufferedSink.writeByte(10);
        realBufferedSink.writeDecimalLong(networkResponse.requestMillis);
        realBufferedSink.writeByte(10);
        realBufferedSink.writeDecimalLong(networkResponse.responseMillis);
        realBufferedSink.writeByte(10);
        Set<Map.Entry> entrySet = networkResponse.headers.data.entrySet();
        Iterator it = entrySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        realBufferedSink.writeDecimalLong(i);
        realBufferedSink.writeByte(10);
        for (Map.Entry entry : entrySet) {
            for (String str : (List) entry.getValue()) {
                realBufferedSink.writeUtf8((String) entry.getKey());
                realBufferedSink.writeUtf8(":");
                realBufferedSink.writeUtf8(str);
                realBufferedSink.writeByte(10);
            }
        }
    }
}
