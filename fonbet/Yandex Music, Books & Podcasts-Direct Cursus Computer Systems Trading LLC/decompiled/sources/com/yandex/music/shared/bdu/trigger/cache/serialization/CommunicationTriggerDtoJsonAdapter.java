package com.yandex.music.shared.bdu.trigger.cache.serialization;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Banner;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Deeplink;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Div;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$DynamicOverlaySheet;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Toast;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$UiType;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.ej5;
import defpackage.fj5;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/serialization/CommunicationTriggerDtoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lej5;", "<init>", "()V", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class CommunicationTriggerDtoJsonAdapter implements JsonDeserializer<ej5> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject G;
        JsonElement v;
        JsonObject G2;
        JsonElement v2;
        String I;
        Object obj;
        Class cls;
        type.getClass();
        if (jsonElement != null && (G = cxb.G(jsonElement)) != null && (v = G.v("meta")) != null && (G2 = cxb.G(v)) != null && (v2 = G2.v("uiType")) != null && (I = cxb.I(v2)) != null) {
            CommunicationTriggerDto$UiType.b.getClass();
            Iterator it = CommunicationTriggerDto$UiType.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((CommunicationTriggerDto$UiType) obj).a, I)) {
                    break;
                }
            }
            CommunicationTriggerDto$UiType communicationTriggerDto$UiType = (CommunicationTriggerDto$UiType) obj;
            if (communicationTriggerDto$UiType != null) {
                switch (fj5.a[communicationTriggerDto$UiType.ordinal()]) {
                    case 1:
                        cls = CommunicationTriggerDto$Banner.class;
                        break;
                    case 2:
                        cls = CommunicationTriggerDto$Deeplink.class;
                        break;
                    case 3:
                        cls = CommunicationTriggerDto$DynamicOverlaySheet.class;
                        break;
                    case 4:
                    case 5:
                        cls = CommunicationTriggerDto$Div.class;
                        break;
                    case 6:
                        cls = CommunicationTriggerDto$Toast.class;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                if (jsonDeserializationContext != null) {
                    return (ej5) jsonDeserializationContext.a(jsonElement, cls);
                }
            }
        }
        return null;
    }
}
