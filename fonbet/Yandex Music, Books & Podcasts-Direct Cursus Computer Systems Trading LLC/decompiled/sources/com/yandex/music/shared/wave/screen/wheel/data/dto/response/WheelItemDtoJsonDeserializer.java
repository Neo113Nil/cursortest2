package com.yandex.music.shared.wave.screen.wheel.data.dto.response;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.cjv;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/wave/screen/wheel/data/dto/response/WheelItemDtoJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcjv;", "<init>", "()V", "shared-wave-screen-wheel"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class WheelItemDtoJsonDeserializer implements JsonDeserializer<cjv> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        JsonElement v;
        JsonObject m = jsonElement != null ? jsonElement.m() : null;
        String q = (m == null || (v = m.v("type")) == null) ? null : v.q();
        if (q != null) {
            switch (q.hashCode()) {
                case -1591043536:
                    if (q.equals("SETTING")) {
                        cls = WheelItemDto$WheelItemSettingsDto.class;
                        if (jsonDeserializationContext != null) {
                            return (cjv) jsonDeserializationContext.a(m, cls);
                        }
                    }
                    break;
                case 2657017:
                    if (q.equals("WAVE")) {
                        cls = WheelItemDto$WheelItemWaveDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case 62359119:
                    if (q.equals("ALBUM")) {
                        cls = WheelItemDto$WheelItemAlbumDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case 1489554762:
                    if (q.equals("PROMO_LINK")) {
                        cls = WheelItemDto$WheelItemPromoDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
            }
        }
        return null;
    }
}
