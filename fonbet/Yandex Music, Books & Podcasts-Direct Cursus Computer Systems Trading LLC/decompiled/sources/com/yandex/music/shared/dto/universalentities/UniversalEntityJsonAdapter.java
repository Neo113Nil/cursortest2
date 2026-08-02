package com.yandex.music.shared.dto.universalentities;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.ssg;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/shared/dto/universalentities/UniversalEntityJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/dto/universalentities/UniversalEntityDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class UniversalEntityJsonAdapter implements JsonDeserializer<UniversalEntityDto>, JsonSerializer<UniversalEntityDto> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[RETURN] */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement v = jsonElement.m().v("type");
        String q = v != null ? v.q() : null;
        if (q != null) {
            switch (q.hashCode()) {
                case -1996358545:
                    if (q.equals("non_music_album_item")) {
                        cls = NonMusicEntityDto.class;
                        break;
                    }
                    break;
                case -1937454837:
                    if (q.equals("artist_item")) {
                        cls = ArtistEntityDto.class;
                        break;
                    }
                    break;
                case -1782884683:
                    if (q.equals("liked_album_item")) {
                        cls = LikedAlbumEntityDto.class;
                        break;
                    }
                    break;
                case -1551888991:
                    if (q.equals("personal_playlist_item")) {
                        cls = PersonalPlaylistEntityDto.class;
                        break;
                    }
                    break;
                case -846503197:
                    if (q.equals("album_item")) {
                        cls = AlbumEntityDto.class;
                        break;
                    }
                    break;
                case 316074468:
                    if (q.equals("chart_album_item")) {
                        cls = ChartAlbumEntityDto.class;
                        break;
                    }
                    break;
                case 427524287:
                    if (q.equals("mix_card_item")) {
                        cls = MixEntityDto.class;
                        break;
                    }
                    break;
                case 816317792:
                    if (q.equals("playlist_item")) {
                        cls = PlaylistEntityDto.class;
                        break;
                    }
                    break;
                case 888055886:
                    if (q.equals("liked_playlist_item")) {
                        cls = LikedPlaylistEntityDto.class;
                        break;
                    }
                    break;
                case 1159616903:
                    if (q.equals("track_item")) {
                        ssg.a(3, "UniversalEntityJsonAdapter", "skip track_item entity type for carousels or universal screen", null);
                        cls = null;
                        break;
                    }
                    break;
                case 1306552595:
                    if (q.equals("wave_agent_item")) {
                        cls = WaveAgentDto.class;
                        break;
                    }
                    break;
            }
            if (cls == null) {
                return (UniversalEntityDto) jsonDeserializationContext.a(jsonElement, cls);
            }
            return null;
        }
        dfi.r(f1d.g("Unsupported universal screen entity type ", q), "UniversalEntityJsonAdapter");
        cls = null;
        if (cls == null) {
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        UniversalEntityDto universalEntityDto = (UniversalEntityDto) obj;
        universalEntityDto.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(universalEntityDto);
        b.getClass();
        return b;
    }
}
