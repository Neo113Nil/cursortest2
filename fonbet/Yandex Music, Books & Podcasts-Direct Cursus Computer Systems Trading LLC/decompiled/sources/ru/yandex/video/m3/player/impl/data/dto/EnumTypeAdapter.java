package ru.yandex.video.m3.player.impl.data.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.c5b;
import defpackage.ekr;
import defpackage.ni7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/data/dto/EnumTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class EnumTypeAdapter<T> extends TypeAdapter<T> {
    public final TreeMap a;
    public final HashMap b;
    public final Enum c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    public EnumTypeAdapter(Class cls) {
        ?? r2;
        String value;
        cls.getClass();
        ekr.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        this.a = new TreeMap(comparator);
        this.b = new HashMap();
        try {
            Object[] enumConstants = cls.getEnumConstants();
            if (enumConstants != null) {
                r2 = new ArrayList(enumConstants.length);
                for (Object obj : enumConstants) {
                    obj.getClass();
                    r2.add((Enum) obj);
                }
            } else {
                r2 = 0;
            }
            for (Enum r22 : r2 == 0 ? c5b.a : r2) {
                String name = r22.name();
                SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                ni7 ni7Var = (ni7) cls.getField(name).getAnnotation(ni7.class);
                this.a.put(name, r22);
                HashMap hashMap = this.b;
                if (serializedName != null && (value = serializedName.value()) != null) {
                    name = value;
                }
                hashMap.put(r22, name);
                if (serializedName != null) {
                    this.a.put(serializedName.value(), r22);
                    for (String str : serializedName.alternate()) {
                        this.a.put(str, r22);
                    }
                }
                if (ni7Var != null) {
                    this.c = r22;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        jsonReader.getClass();
        JsonToken H0 = jsonReader.H0();
        JsonToken jsonToken = JsonToken.NULL;
        Enum r3 = this.c;
        if (H0 == jsonToken) {
            jsonReader.u0();
            if (r3 == null) {
                return null;
            }
            return r3;
        }
        Enum r5 = (Enum) this.a.get(jsonReader.f0());
        if (r5 != null) {
            r3 = r5;
        }
        if (r3 == null) {
            return null;
        }
        return r3;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        jsonWriter.getClass();
        jsonWriter.U0(obj == null ? null : (String) this.b.get((Enum) obj));
    }
}
