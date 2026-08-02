package ru.yandex.music.novelties.podcasts.catalog.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.bdm;
import defpackage.i94;
import java.lang.reflect.Type;
import kotlin.Metadata;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.AlbumChartEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.AlbumPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.ArtistEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.CategoryPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.MenuItemEntityAliasDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PersonalPlaylistPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PlaylistPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PromotionPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.StationEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.TrackChartEntityDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsCatalogEntitiesDeserialization;", "Lcom/google/gson/JsonDeserializer;", "Lru/yandex/music/novelties/podcasts/catalog/data/dto/PodcastsEntityDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class PodcastsCatalogEntitiesDeserialization implements JsonDeserializer<PodcastsEntityDto>, JsonSerializer<PodcastsEntityDto> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        b2c b2cVar = i94.b;
        JsonElement v = jsonElement.m().v("type");
        String q = v != null ? v.q() : null;
        b2cVar.getClass();
        i94 A = b2c.A(q);
        Class cls = MenuItemEntityAliasDto.class;
        switch (A == null ? -1 : bdm.a[A.ordinal()]) {
            case -1:
                cls = null;
                break;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                cls = AlbumPodcastsEntityDto.class;
                break;
            case 2:
                cls = PlaylistPodcastsEntityDto.class;
                break;
            case 3:
                cls = PromotionPodcastsEntityDto.class;
                break;
            case 4:
                cls = CategoryPodcastsEntityDto.class;
                break;
            case 5:
                cls = TrackChartEntityDto.class;
                break;
            case 6:
                cls = AlbumChartEntityDto.class;
                break;
            case 7:
                cls = StationEntityDto.class;
                break;
            case 8:
                cls = PersonalPlaylistPodcastsEntityDto.class;
                break;
            case 9:
            case 10:
                break;
            case 11:
                cls = ArtistEntityDto.class;
                break;
        }
        if (cls != null) {
            return (PodcastsEntityDto) jsonDeserializationContext.a(jsonElement, cls);
        }
        return null;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        PodcastsEntityDto podcastsEntityDto = (PodcastsEntityDto) obj;
        podcastsEntityDto.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(podcastsEntityDto);
        b.getClass();
        return b;
    }
}
