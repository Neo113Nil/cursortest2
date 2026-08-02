package ru.yandex.music.novelties.podcasts.catalog.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.b6e;
import defpackage.bs4;
import defpackage.g94;
import defpackage.wcm;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsCatalogBlocksDeserialization;", "Lcom/google/gson/JsonDeserializer;", "Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsBlockDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class PodcastsCatalogBlocksDeserialization implements JsonDeserializer<PodcastsBlockDto>, JsonSerializer<PodcastsBlockDto> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        bs4 bs4Var = g94.b;
        JsonElement v = jsonElement.m().v("type");
        String q = v != null ? v.q() : null;
        bs4Var.getClass();
        g94 r = bs4.r(q);
        Class cls = PlaylistsAlbumsPodcastsBlockDto.class;
        switch (r == null ? -1 : wcm.a[r.ordinal()]) {
            case -1:
                cls = null;
                break;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                cls = ContinueListenBlockDto.class;
                break;
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
                break;
            case 3:
                cls = PromotionsPodcastsBlockDto.class;
                break;
            case 6:
                cls = CategoriesPodcastsBlockDto.class;
                break;
            case 10:
                cls = PlaylistPodcastsBlockDto.class;
                break;
            case 11:
                cls = TracksChartBlockDto.class;
                break;
            case 12:
                cls = AlbumsChartBlockDto.class;
                break;
            case 13:
                cls = RadioBlockDto.class;
                break;
            case 14:
                cls = MenuBlockDto.class;
                break;
            case 15:
                cls = MenuTabsBlockDto.class;
                break;
            case 16:
                cls = YandexBooksBannerBlockDto.class;
                break;
        }
        if (cls != null) {
            return (PodcastsBlockDto) jsonDeserializationContext.a(jsonElement, cls);
        }
        return null;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        PodcastsBlockDto podcastsBlockDto = (PodcastsBlockDto) obj;
        podcastsBlockDto.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(podcastsBlockDto);
        b.getClass();
        return b;
    }
}
