package com.yandex.music.skeleton.blocks.itemlist.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ItemListEntityDto;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/skeleton/blocks/itemlist/data/ItemJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/skeleton/blocks/itemlist/data/dto/ItemListEntityDto;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class ItemJsonAdapter implements JsonDeserializer<ItemListEntityDto>, JsonSerializer<ItemListEntityDto> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[RETURN] */
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
                        cls = ItemListEntityDto.NonMusicAlbum.class;
                        break;
                    }
                    break;
                case -1937454837:
                    if (q.equals("artist_item")) {
                        cls = ItemListEntityDto.Artist.class;
                        break;
                    }
                    break;
                case -1603329374:
                    if (q.equals("clip_item")) {
                        cls = ItemListEntityDto.Clip.class;
                        break;
                    }
                    break;
                case -1527078413:
                    if (q.equals("menu_item")) {
                        cls = ItemListEntityDto.Menu.class;
                        break;
                    }
                    break;
                case -846503197:
                    if (q.equals("album_item")) {
                        cls = ItemListEntityDto.Album.class;
                        break;
                    }
                    break;
                case -31166883:
                    if (q.equals("q2v_item")) {
                        cls = ItemListEntityDto.QueryToVibeWave.class;
                        break;
                    }
                    break;
                case 888055886:
                    if (q.equals("liked_playlist_item")) {
                        cls = ItemListEntityDto.Playlist.class;
                        break;
                    }
                    break;
                case 1159616903:
                    if (q.equals("track_item")) {
                        cls = ItemListEntityDto.Track.class;
                        break;
                    }
                    break;
                case 1306552595:
                    if (q.equals("wave_agent_item")) {
                        cls = ItemListEntityDto.WaveAgent.class;
                        break;
                    }
                    break;
                case 1543935129:
                    if (q.equals("wave_item")) {
                        cls = ItemListEntityDto.Wave.class;
                        break;
                    }
                    break;
            }
            if (cls == null) {
                return (ItemListEntityDto) jsonDeserializationContext.a(jsonElement, cls);
            }
            return null;
        }
        cls = null;
        if (cls == null) {
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        ItemListEntityDto itemListEntityDto = (ItemListEntityDto) obj;
        itemListEntityDto.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        JsonElement b = jsonSerializationContext.b(itemListEntityDto);
        b.getClass();
        return b;
    }
}
