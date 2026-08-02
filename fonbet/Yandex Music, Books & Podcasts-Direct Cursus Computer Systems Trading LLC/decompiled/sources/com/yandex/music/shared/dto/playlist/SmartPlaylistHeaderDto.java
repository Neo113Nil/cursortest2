package com.yandex.music.shared.dto.playlist;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/dto/playlist/SmartPlaylistHeaderDto;", "", "", "type", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "data", "<init>", "(Ljava/lang/String;Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "getData", "()Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class SmartPlaylistHeaderDto {

    @SerializedName("data")
    private final PlaylistHeaderDto data;

    @SerializedName("type")
    private final String type;

    public SmartPlaylistHeaderDto(String str, PlaylistHeaderDto playlistHeaderDto) {
        this.type = str;
        this.data = playlistHeaderDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartPlaylistHeaderDto)) {
            return false;
        }
        SmartPlaylistHeaderDto smartPlaylistHeaderDto = (SmartPlaylistHeaderDto) obj;
        return Intrinsics.d(this.type, smartPlaylistHeaderDto.type) && Intrinsics.d(this.data, smartPlaylistHeaderDto.data);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PlaylistHeaderDto playlistHeaderDto = this.data;
        return hashCode + (playlistHeaderDto != null ? playlistHeaderDto.hashCode() : 0);
    }

    public final String toString() {
        return "SmartPlaylistHeaderDto(type=" + this.type + ", data=" + this.data + ")";
    }
}
