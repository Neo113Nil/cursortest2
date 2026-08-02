package com.yandex.plus.webview.internal.contract.impl.sharing;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.yandex.plus.webview.api.contract.impl.sharing.a;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/webview/internal/contract/impl/sharing/OpenNativeSharingMessageDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/plus/webview/api/contract/impl/sharing/a;", "<init>", "()V", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class OpenNativeSharingMessageDeserializer implements JsonDeserializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null) {
            JsonElement v = jsonElement.m().v("payload");
            v.getClass();
            if (!(v instanceof JsonObject)) {
                v = null;
            }
            JsonObject m = v != null ? v.m() : null;
            if (m != null) {
                JsonPrimitive w = m.w("title");
                String q = w != null ? w.q() : null;
                String q2 = m.w("text").q();
                q2.getClass();
                String q3 = m.w("mimeType").q();
                q3.getClass();
                return new a(q, q2, q3);
            }
        }
        return null;
    }
}
