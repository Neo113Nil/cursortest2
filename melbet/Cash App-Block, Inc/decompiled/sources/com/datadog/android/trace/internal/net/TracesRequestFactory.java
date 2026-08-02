package com.datadog.android.trace.internal.net;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.api.net.RequestExecutionContext;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class TracesRequestFactory implements RequestFactory {
    public static final byte[] PAYLOAD_SEPARATOR;
    public final InternalLogger internalLogger;

    static {
        byte[] bytes = "\n".getBytes(Charsets.UTF_8);
        bytes.getClass();
        PAYLOAD_SEPARATOR = bytes;
    }

    public TracesRequestFactory(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public final Request create(DatadogContext datadogContext, RequestExecutionContext requestExecutionContext, List list) {
        datadogContext.getClass();
        list.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(datadogContext.site.intakeEndpoint, "/api/v2/spans");
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("DD-API-KEY", datadogContext.clientToken), new Pair("DD-EVP-ORIGIN", datadogContext.source), new Pair("DD-EVP-ORIGIN-VERSION", datadogContext.sdkVersion), new Pair("DD-REQUEST-ID", uuid));
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RawBatchEvent) it.next()).data);
        }
        return new Request(uuid, "Traces Request", m$1, mapOf, ByteArrayExtKt.join$default(arrayList, PAYLOAD_SEPARATOR, this.internalLogger));
    }
}
