package ru.yandex.music.radio.store;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.yandex.music.shared.dto.wave.recommendation.StationWithSettingsDto;
import defpackage.vfn;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/music/radio/store/RadioMenuDataJsonAdapter;", "Lcom/google/gson/JsonSerializer;", "Lvfn;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class RadioMenuDataJsonAdapter implements JsonSerializer<vfn>, JsonDeserializer<vfn> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        if (jsonElement.m().a.containsKey("station")) {
            return new RadioMenuStationDto((StationWithSettingsDto) jsonDeserializationContext.a(jsonElement, StationWithSettingsDto.class));
        }
        Object a = jsonDeserializationContext.a(jsonElement, RadioMenuDefaultDto.class);
        a.getClass();
        return (vfn) a;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        vfn vfnVar = (vfn) obj;
        vfnVar.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        if (vfnVar instanceof RadioMenuStationDto) {
            JsonElement c = jsonSerializationContext.c(StationWithSettingsDto.class, ((RadioMenuStationDto) vfnVar).getStationWithSettings());
            c.getClass();
            return c;
        }
        JsonElement c2 = jsonSerializationContext.c(RadioMenuDefaultDto.class, vfnVar);
        c2.getClass();
        return c2;
    }
}
