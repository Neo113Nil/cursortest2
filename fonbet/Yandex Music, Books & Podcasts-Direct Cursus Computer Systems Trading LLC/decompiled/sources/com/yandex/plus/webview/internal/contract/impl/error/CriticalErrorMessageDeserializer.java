package com.yandex.plus.webview.internal.contract.impl.error;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.yandex.plus.webview.api.contract.impl.error.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/webview/internal/contract/impl/error/CriticalErrorMessageDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/plus/webview/api/contract/impl/error/a;", "<init>", "()V", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class CriticalErrorMessageDeserializer implements JsonDeserializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonPrimitive w;
        String str = null;
        if (jsonElement != null) {
            JsonObject m = jsonElement.m();
            String q = m.w("type").q();
            JsonElement v = m.v("payload");
            v.getClass();
            if (!(v instanceof JsonObject)) {
                v = null;
            }
            JsonObject m2 = v != null ? v.m() : null;
            if (Intrinsics.d(q, "CRITICAL_ERROR")) {
                if (m2 != null && (w = m2.w(Constants.KEY_MESSAGE)) != null) {
                    str = w.q();
                }
                return new a(str);
            }
        }
        return null;
    }
}
