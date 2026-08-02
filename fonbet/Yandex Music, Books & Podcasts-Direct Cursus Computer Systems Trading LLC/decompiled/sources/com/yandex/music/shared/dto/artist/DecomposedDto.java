package com.yandex.music.shared.dto.artist;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/music/shared/dto/artist/DecomposedDto;", "", "", "Lcom/yandex/music/shared/dto/artist/ArtistDto;", "decomposed", "", "joinSymbol", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "GsonDeserializer", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class DecomposedDto {

    @SerializedName("decomposed")
    private final List<ArtistDto> decomposed;

    @SerializedName("joinSymbol")
    private final String joinSymbol;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/shared/dto/artist/DecomposedDto$GsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/dto/artist/DecomposedDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class GsonDeserializer implements JsonDeserializer<DecomposedDto>, JsonSerializer<DecomposedDto> {
        @Override // com.google.gson.JsonDeserializer
        public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = jsonElement.g().a.iterator();
            it.getClass();
            String str = null;
            while (it.hasNext()) {
                JsonElement jsonElement2 = (JsonElement) it.next();
                jsonElement2.getClass();
                if (jsonElement2 instanceof JsonPrimitive) {
                    str = jsonElement2.q();
                } else {
                    arrayList.add(jsonDeserializationContext.a(jsonElement2, ArtistDto.class));
                }
            }
            return new DecomposedDto(arrayList, str);
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
            DecomposedDto decomposedDto = (DecomposedDto) obj;
            decomposedDto.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            JsonArray jsonArray = new JsonArray();
            if (decomposedDto.getJoinSymbol() != null) {
                jsonArray.s(decomposedDto.getJoinSymbol());
            }
            List decomposed = decomposedDto.getDecomposed();
            if (decomposed != null) {
                Iterator it = decomposed.iterator();
                while (it.hasNext()) {
                    jsonArray.r(jsonSerializationContext.b((ArtistDto) it.next()));
                }
            }
            return jsonArray;
        }
    }

    public DecomposedDto(List<ArtistDto> list, String str) {
        this.decomposed = list;
        this.joinSymbol = str;
    }

    /* renamed from: a, reason: from getter */
    public final List getDecomposed() {
        return this.decomposed;
    }

    /* renamed from: b, reason: from getter */
    public final String getJoinSymbol() {
        return this.joinSymbol;
    }
}
