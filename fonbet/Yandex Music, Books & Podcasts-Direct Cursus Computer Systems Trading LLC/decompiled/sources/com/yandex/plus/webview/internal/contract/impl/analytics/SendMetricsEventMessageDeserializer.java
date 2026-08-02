package com.yandex.plus.webview.internal.contract.impl.analytics;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.yandex.plus.webview.api.contract.impl.analytics.a;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/webview/internal/contract/impl/analytics/SendMetricsEventMessageDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/plus/webview/api/contract/impl/analytics/a;", "<init>", "()V", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class SendMetricsEventMessageDeserializer implements JsonDeserializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement == null) {
            return null;
        }
        JsonObject m = jsonElement.m();
        String q = m.w("type").q();
        JsonElement v = m.v("payload");
        v.getClass();
        if (!(v instanceof JsonObject)) {
            v = null;
        }
        JsonObject m2 = v != null ? v.m() : null;
        if (!Intrinsics.d(q, "SEND_METRICS") || m2 == null) {
            return null;
        }
        JsonPrimitive w = m2.w("eventName");
        String q2 = w != null ? w.q() : null;
        JsonPrimitive w2 = m2.w("eventValue");
        String q3 = w2 != null ? w2.q() : null;
        if (q2 == null || q2.length() == 0 || q3 == null || q3.length() == 0) {
            return null;
        }
        return new a(q2, q3);
    }
}
