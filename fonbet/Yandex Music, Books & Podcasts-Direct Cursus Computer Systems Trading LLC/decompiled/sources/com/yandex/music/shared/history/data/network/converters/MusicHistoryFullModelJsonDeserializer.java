package com.yandex.music.shared.history.data.network.converters;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Track;
import defpackage.ili;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/history/data/network/converters/MusicHistoryFullModelJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lili;", "<init>", "()V", "shared-music-history"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class MusicHistoryFullModelJsonDeserializer implements JsonDeserializer<ili> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        JsonElement v;
        String q = (jsonElement == null || (v = jsonElement.m().v("type")) == null) ? null : v.q();
        if (q != null) {
            switch (q.hashCode()) {
                case -1409097913:
                    if (q.equals("artist")) {
                        cls = MusicHistoryModelDto$Context.ArtistDto.class;
                        if (jsonDeserializationContext != null) {
                            return (ili) jsonDeserializationContext.a(jsonElement, cls);
                        }
                    }
                    break;
                case -86507959:
                    if (q.equals("multivibe_wave")) {
                        cls = MusicHistoryModelDto$Context.MultiwaveDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case -30767549:
                    if (q.equals("q2v_wave")) {
                        cls = MusicHistoryModelDto$Context.QueryToVibeDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case 3642105:
                    if (q.equals("wave")) {
                        cls = MusicHistoryModelDto$Context.WaveDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case 92896879:
                    if (q.equals("album")) {
                        cls = MusicHistoryModelDto$Context.AlbumDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case 110621003:
                    if (q.equals("track")) {
                        cls = MusicHistoryModelDto$Track.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
                case 1879474642:
                    if (q.equals("playlist")) {
                        cls = MusicHistoryModelDto$Context.PlaylistDto.class;
                        if (jsonDeserializationContext != null) {
                        }
                    }
                    break;
            }
        }
        return null;
    }
}
