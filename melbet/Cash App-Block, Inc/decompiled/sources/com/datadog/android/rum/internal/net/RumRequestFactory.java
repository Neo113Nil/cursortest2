package com.datadog.android.rum.internal.net;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.api.net.RequestExecutionContext;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.rum.internal.domain.event.RumEventMeta$View;
import com.fillr.n;
import com.google.android.gms.tasks.zzb;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.MapBuilderEntries;
import kotlin.text.Charsets;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public final class RumRequestFactory implements RequestFactory {
    public static final byte[] PAYLOAD_SEPARATOR;
    public final InternalLogger internalLogger;
    public final n.b viewEventFilter;

    static {
        byte[] bytes = "\n".getBytes(Charsets.UTF_8);
        bytes.getClass();
        PAYLOAD_SEPARATOR = bytes;
    }

    public RumRequestFactory(n.b bVar, InternalLogger internalLogger) {
        internalLogger.getClass();
        this.viewEventFilter = bVar;
        this.internalLogger = internalLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3 A[LOOP:3: B:50:0x019a->B:52:0x01a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020b  */
    @Override // com.datadog.android.api.net.RequestFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request create(DatadogContext datadogContext, RequestExecutionContext requestExecutionContext, List list) {
        String str;
        String sb;
        Object it;
        Integer num = requestExecutionContext.previousResponseCode;
        datadogContext.getClass();
        String str2 = datadogContext.source;
        list.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<RawBatchEvent> list2 = list;
        for (RawBatchEvent rawBatchEvent : list2) {
            RumEventMeta$View rumEventMeta$View = (RumEventMeta$View) ((zzb) this.viewEventFilter.b).deserialize(rawBatchEvent.metadata);
            if (rumEventMeta$View != null) {
                linkedHashMap2.put(rawBatchEvent, rumEventMeta$View);
                String str3 = rumEventMeta$View.viewId;
                long j = rumEventMeta$View.documentVersion;
                Long l = (Long) linkedHashMap.get(str3);
                if (l == null) {
                    linkedHashMap.put(str3, Long.valueOf(j));
                } else {
                    linkedHashMap.put(str3, Long.valueOf(Math.max(j, l.longValue())));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            RawBatchEvent rawBatchEvent2 = (RawBatchEvent) obj;
            if (linkedHashMap2.containsKey(rawBatchEvent2)) {
                RumEventMeta$View rumEventMeta$View2 = (RumEventMeta$View) MapsKt__MapsKt.getValue(linkedHashMap2, rawBatchEvent2);
                if (!rumEventMeta$View2.hasAccessibility.equals(Boolean.TRUE) && rumEventMeta$View2.documentVersion != ((Number) MapsKt__MapsKt.getValue(linkedHashMap, rumEventMeta$View2.viewId)).longValue()) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((RawBatchEvent) it2.next()).data);
        }
        byte[] join$default = ByteArrayExtKt.join$default(arrayList2, PAYLOAD_SEPARATOR, this.internalLogger);
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        try {
            byte[] digest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(join$default);
            digest.getClass();
            str = MapUtilsKt.toHexString(digest);
        } catch (IllegalArgumentException e) {
            DBUtil.log$default(this.internalLogger, 5, target, RumRequestFactory$idempotencyKey$1.INSTANCE$1, e, false, 48);
            str = null;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("ddsource", str2);
            StringBuilder sb2 = new StringBuilder();
            if (num != null) {
            }
            sb = sb2.toString();
            if (sb.length() > 0) {
            }
            MapBuilder build = mapBuilder.build();
            String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(datadogContext.site.intakeEndpoint, "/api/v2/rum");
            ArrayList arrayList3 = new ArrayList(build.size);
            it = ((MapBuilderEntries) build.entrySet()).iterator();
            while (((MapBuilder.Itr) it).hasNext()) {
            }
            String concat = m$1.concat(CollectionsKt.joinToString$default(arrayList3, "&", "?", null, 0, null, null, 60));
            LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("DD-API-KEY", datadogContext.clientToken), new Pair("DD-EVP-ORIGIN", str2), new Pair("DD-EVP-ORIGIN-VERSION", datadogContext.sdkVersion), new Pair("DD-REQUEST-ID", uuid));
            if (str != null) {
            }
            return new Request(uuid, "RUM Request", concat, mutableMapOf, join$default);
        } catch (NullPointerException e2) {
            DBUtil.log$default(this.internalLogger, 5, target, RumRequestFactory$idempotencyKey$1.INSTANCE$3, e2, false, 48);
            str = null;
            MapBuilder mapBuilder2 = new MapBuilder();
            mapBuilder2.put("ddsource", str2);
            StringBuilder sb22 = new StringBuilder();
            if (num != null) {
            }
            sb = sb22.toString();
            if (sb.length() > 0) {
            }
            MapBuilder build2 = mapBuilder2.build();
            String m$12 = Recorder$$ExternalSyntheticOutline2.m$1(datadogContext.site.intakeEndpoint, "/api/v2/rum");
            ArrayList arrayList32 = new ArrayList(build2.size);
            it = ((MapBuilderEntries) build2.entrySet()).iterator();
            while (((MapBuilder.Itr) it).hasNext()) {
            }
            String concat2 = m$12.concat(CollectionsKt.joinToString$default(arrayList32, "&", "?", null, 0, null, null, 60));
            LinkedHashMap mutableMapOf2 = MapsKt__MapsKt.mutableMapOf(new Pair("DD-API-KEY", datadogContext.clientToken), new Pair("DD-EVP-ORIGIN", str2), new Pair("DD-EVP-ORIGIN-VERSION", datadogContext.sdkVersion), new Pair("DD-REQUEST-ID", uuid));
            if (str != null) {
            }
            return new Request(uuid, "RUM Request", concat2, mutableMapOf2, join$default);
        } catch (DigestException e3) {
            DBUtil.log$default(this.internalLogger, 5, target, RumRequestFactory$idempotencyKey$1.INSTANCE, e3, false, 48);
            str = null;
            MapBuilder mapBuilder22 = new MapBuilder();
            mapBuilder22.put("ddsource", str2);
            StringBuilder sb222 = new StringBuilder();
            if (num != null) {
            }
            sb = sb222.toString();
            if (sb.length() > 0) {
            }
            MapBuilder build22 = mapBuilder22.build();
            String m$122 = Recorder$$ExternalSyntheticOutline2.m$1(datadogContext.site.intakeEndpoint, "/api/v2/rum");
            ArrayList arrayList322 = new ArrayList(build22.size);
            it = ((MapBuilderEntries) build22.entrySet()).iterator();
            while (((MapBuilder.Itr) it).hasNext()) {
            }
            String concat22 = m$122.concat(CollectionsKt.joinToString$default(arrayList322, "&", "?", null, 0, null, null, 60));
            LinkedHashMap mutableMapOf22 = MapsKt__MapsKt.mutableMapOf(new Pair("DD-API-KEY", datadogContext.clientToken), new Pair("DD-EVP-ORIGIN", str2), new Pair("DD-EVP-ORIGIN-VERSION", datadogContext.sdkVersion), new Pair("DD-REQUEST-ID", uuid));
            if (str != null) {
            }
            return new Request(uuid, "RUM Request", concat22, mutableMapOf22, join$default);
        } catch (NoSuchAlgorithmException e4) {
            DBUtil.log$default(this.internalLogger, 5, target, RumRequestFactory$idempotencyKey$1.INSTANCE$2, e4, false, 48);
            str = null;
            MapBuilder mapBuilder222 = new MapBuilder();
            mapBuilder222.put("ddsource", str2);
            StringBuilder sb2222 = new StringBuilder();
            if (num != null) {
            }
            sb = sb2222.toString();
            if (sb.length() > 0) {
            }
            MapBuilder build222 = mapBuilder222.build();
            String m$1222 = Recorder$$ExternalSyntheticOutline2.m$1(datadogContext.site.intakeEndpoint, "/api/v2/rum");
            ArrayList arrayList3222 = new ArrayList(build222.size);
            it = ((MapBuilderEntries) build222.entrySet()).iterator();
            while (((MapBuilder.Itr) it).hasNext()) {
            }
            String concat222 = m$1222.concat(CollectionsKt.joinToString$default(arrayList3222, "&", "?", null, 0, null, null, 60));
            LinkedHashMap mutableMapOf222 = MapsKt__MapsKt.mutableMapOf(new Pair("DD-API-KEY", datadogContext.clientToken), new Pair("DD-EVP-ORIGIN", str2), new Pair("DD-EVP-ORIGIN-VERSION", datadogContext.sdkVersion), new Pair("DD-REQUEST-ID", uuid));
            if (str != null) {
            }
            return new Request(uuid, "RUM Request", concat222, mutableMapOf222, join$default);
        }
        MapBuilder mapBuilder2222 = new MapBuilder();
        mapBuilder2222.put("ddsource", str2);
        StringBuilder sb22222 = new StringBuilder();
        if (num != null) {
            sb22222.append("retry_count:" + requestExecutionContext.attemptNumber);
            sb22222.append(",");
            sb22222.append("last_failure_status:" + num);
        }
        sb = sb22222.toString();
        if (sb.length() > 0) {
            mapBuilder2222.put("ddtags", sb);
        }
        MapBuilder build2222 = mapBuilder2222.build();
        String m$12222 = Recorder$$ExternalSyntheticOutline2.m$1(datadogContext.site.intakeEndpoint, "/api/v2/rum");
        ArrayList arrayList32222 = new ArrayList(build2222.size);
        it = ((MapBuilderEntries) build2222.entrySet()).iterator();
        while (((MapBuilder.Itr) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((MapBuilder.KeysItr) it).next();
            arrayList32222.add(entry.getKey() + "=" + entry.getValue());
        }
        String concat2222 = m$12222.concat(CollectionsKt.joinToString$default(arrayList32222, "&", "?", null, 0, null, null, 60));
        LinkedHashMap mutableMapOf2222 = MapsKt__MapsKt.mutableMapOf(new Pair("DD-API-KEY", datadogContext.clientToken), new Pair("DD-EVP-ORIGIN", str2), new Pair("DD-EVP-ORIGIN-VERSION", datadogContext.sdkVersion), new Pair("DD-REQUEST-ID", uuid));
        if (str != null) {
            mutableMapOf2222.put("DD-IDEMPOTENCY-KEY", str);
        }
        return new Request(uuid, "RUM Request", concat2222, mutableMapOf2222, join$default);
    }
}
