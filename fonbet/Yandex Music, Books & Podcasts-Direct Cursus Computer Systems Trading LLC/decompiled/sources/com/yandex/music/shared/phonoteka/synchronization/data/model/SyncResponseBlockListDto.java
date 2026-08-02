package com.yandex.music.shared.phonoteka.synchronization.data.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import defpackage.b6e;
import defpackage.f43;
import defpackage.g43;
import defpackage.gxr;
import defpackage.h43;
import defpackage.i43;
import defpackage.j43;
import defpackage.k43;
import defpackage.l43;
import defpackage.m43;
import defpackage.n43;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncResponseBlockListDto;", "", "", "Lgxr;", "blocks", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "SyncResponseBlockListDtoJsonAdapter", "shared-phonoteka-synchronization"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SyncResponseBlockListDto {

    @SerializedName("blocks")
    private final List<gxr> blocks;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncResponseBlockListDto$SyncResponseBlockListDtoJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncResponseBlockListDto;", "shared-phonoteka-synchronization"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class SyncResponseBlockListDtoJsonAdapter implements JsonDeserializer<SyncResponseBlockListDto> {
        public final Set a;

        public SyncResponseBlockListDtoJsonAdapter(Set set) {
            set.getClass();
            this.a = set;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[SYNTHETIC] */
        @Override // com.google.gson.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            Pair pair;
            gxr gxrVar;
            jsonDeserializationContext.getClass();
            JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            if (jsonObject == null) {
                return new SyncResponseBlockListDto(null);
            }
            Set<n43> set = this.a;
            ArrayList arrayList = new ArrayList();
            for (n43 n43Var : set) {
                n43Var.getClass();
                if (n43Var.equals(j43.a)) {
                    pair = new Pair("likedTracks", SyncResponseBlockDto$LikedTracksResponseDto.class);
                } else if (n43Var.equals(g43.a)) {
                    pair = new Pair("likedAlbums", SyncResponseBlockDto$LikedAlbumsResponseDto.class);
                } else if (n43Var.equals(h43.a)) {
                    pair = new Pair("likedArtists", SyncResponseBlockDto$LikedArtistsResponseDto.class);
                } else if (n43Var.equals(i43.a)) {
                    pair = new Pair("likedPlaylists", SyncResponseBlockDto$LikedPlaylistsResponseDto.class);
                } else if (n43Var.equals(l43.a)) {
                    pair = new Pair("ownPlaylists", SyncResponseBlockDto$OwnPlaylistsResponseDto.class);
                } else if (n43Var.equals(m43.a)) {
                    pair = new Pair("presavedAlbums", SyncResponseBlockDto$PreSavesResponseDto.class);
                } else if (n43Var.equals(k43.a)) {
                    pair = new Pair("likedClips", SyncResponseBlockDto$LikedVideoClipsResponseDto.class);
                } else {
                    if (!n43Var.equals(f43.a)) {
                        b6e.s();
                        return null;
                    }
                    pair = null;
                }
                if (pair != null) {
                    Object a = jsonDeserializationContext.a(jsonObject.v((String) pair.a), (Class) pair.b);
                    if (a instanceof gxr) {
                        gxrVar = (gxr) a;
                        if (gxrVar == null) {
                            arrayList.add(gxrVar);
                        }
                    }
                }
                gxrVar = null;
                if (gxrVar == null) {
                }
            }
            return new SyncResponseBlockListDto(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncResponseBlockListDto(List<? extends gxr> list) {
        this.blocks = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getBlocks() {
        return this.blocks;
    }
}
