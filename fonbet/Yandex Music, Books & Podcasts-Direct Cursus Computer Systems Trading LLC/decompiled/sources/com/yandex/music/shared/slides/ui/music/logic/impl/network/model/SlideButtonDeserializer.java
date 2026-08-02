package com.yandex.music.shared.slides.ui.music.logic.impl.network.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.dfi;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideButtonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideButtonDto;", "<init>", "()V", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SlideButtonDeserializer implements JsonDeserializer<SlideButtonDto> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            JsonElement v = jsonElement.m().v("type");
            String q = v != null ? v.q() : null;
            if (q != null) {
                switch (q.hashCode()) {
                    case -1848957518:
                        if (q.equals("SIMPLE")) {
                            cls = SimpleButtonSlideDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideButton>(): unknown type ".concat(q), "SlideButtonDeserializer");
                        return null;
                    case 2336663:
                        if (q.equals("LIKE")) {
                            cls = LikeButtonSlideDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideButton>(): unknown type ".concat(q), "SlideButtonDeserializer");
                        return null;
                    case 2657017:
                        if (q.equals("WAVE")) {
                            cls = WaveButtonSlideDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideButton>(): unknown type ".concat(q), "SlideButtonDeserializer");
                        return null;
                    case 78862271:
                        if (q.equals("SHARE")) {
                            cls = ShareButtonSlideDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideButton>(): unknown type ".concat(q), "SlideButtonDeserializer");
                        return null;
                    case 1925345846:
                        if (q.equals("ACTION")) {
                            cls = ActionButtonSlideDto.class;
                            break;
                        }
                        dfi.r("deserialize<SlideButton>(): unknown type ".concat(q), "SlideButtonDeserializer");
                        return null;
                    default:
                        dfi.r("deserialize<SlideButton>(): unknown type ".concat(q), "SlideButtonDeserializer");
                        return null;
                }
                if (jsonDeserializationContext != null) {
                    return (SlideButtonDto) jsonDeserializationContext.a(jsonElement, cls);
                }
            } else {
                dfi.r("deserialize<SlideButton>(): got block with null type", "SlideButtonDeserializer");
            }
        }
        return null;
    }
}
