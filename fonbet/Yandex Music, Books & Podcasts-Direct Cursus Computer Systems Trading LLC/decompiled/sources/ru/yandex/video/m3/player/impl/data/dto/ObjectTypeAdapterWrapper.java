package ru.yandex.video.m3.player.impl.data.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.yhj;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlin.text.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/data/dto/ObjectTypeAdapterWrapper;", "T", "Lcom/google/gson/TypeAdapter;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
final class ObjectTypeAdapterWrapper<T> extends TypeAdapter<T> {
    public final TypeAdapter a;

    public ObjectTypeAdapterWrapper(TypeAdapter typeAdapter) {
        typeAdapter.getClass();
        this.a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        jsonReader.getClass();
        JsonToken H0 = jsonReader.H0();
        if ((H0 == null ? -1 : yhj.a[H0.ordinal()]) != 1) {
            return this.a.b(jsonReader);
        }
        String f0 = jsonReader.f0();
        f0.getClass();
        Object s0 = StringsKt.s0(f0);
        return (s0 == null && (s0 = b.h(f0)) == null) ? f0 : s0;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        jsonWriter.getClass();
        this.a.c(jsonWriter, obj);
    }
}
