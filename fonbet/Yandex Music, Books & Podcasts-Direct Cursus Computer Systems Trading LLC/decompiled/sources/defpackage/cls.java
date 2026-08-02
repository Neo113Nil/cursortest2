package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDto;
import defpackage.hrg;
import defpackage.v3w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class cls {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$WaveDataDto] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$PlaylistDataDto] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$ArtistDataDto] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$AlbumDataDto] */
    public static final WheelContextDto a(f2v f2vVar) {
        f2vVar.getClass();
        if (f2vVar instanceof x1v) {
            x1v x1vVar = (x1v) f2vVar;
            String str = x1vVar.a;
            if (StringsKt.toIntOrNull(str) == null) {
                dfi.r("Unexpected albumId: " + str + StringUtil.SPACE + x1vVar.b, "toWheelContextDto");
            }
            return new WheelContextDto.Album(new Object(str) { // from class: com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$AlbumDataDto

                @SerializedName(ConnectableDevice.KEY_ID)
                private final String id;

                {
                    this.id = str;
                }
            });
        }
        if (f2vVar instanceof y1v) {
            y1v y1vVar = (y1v) f2vVar;
            String str2 = y1vVar.a;
            if (StringsKt.toIntOrNull(str2) == null) {
                dfi.r("Unexpected artistId: " + str2 + StringUtil.SPACE + y1vVar.b, "toWheelContextDto");
            }
            return new WheelContextDto.Artist(new Object(str2) { // from class: com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$ArtistDataDto

                @SerializedName(ConnectableDevice.KEY_ID)
                private final String id;

                {
                    this.id = str2;
                }
            });
        }
        if (f2vVar instanceof c2v) {
            return whv.a;
        }
        if (f2vVar instanceof a2v) {
            return new WheelContextDto.Playlist(new Object(null, ((a2v) f2vVar).a.d()) { // from class: com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$PlaylistDataDto

                @SerializedName("playlistId")
                private final String playlistId;

                @SerializedName("playlistUuid")
                private final String playlistUuid;

                {
                    this.playlistUuid = r1;
                    this.playlistId = r2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof WheelContextDataDto$PlaylistDataDto)) {
                        return false;
                    }
                    WheelContextDataDto$PlaylistDataDto wheelContextDataDto$PlaylistDataDto = (WheelContextDataDto$PlaylistDataDto) obj;
                    return Intrinsics.d(this.playlistUuid, wheelContextDataDto$PlaylistDataDto.playlistUuid) && Intrinsics.d(this.playlistId, wheelContextDataDto$PlaylistDataDto.playlistId);
                }

                public final int hashCode() {
                    String str3 = this.playlistUuid;
                    int hashCode = (str3 == null ? 0 : str3.hashCode()) * 31;
                    String str4 = this.playlistId;
                    return hashCode + (str4 != null ? str4.hashCode() : 0);
                }

                public final String toString() {
                    return hrg.s("PlaylistDataDto(playlistUuid=", this.playlistUuid, ", playlistId=", this.playlistId, ")");
                }
            });
        }
        if (f2vVar instanceof d2v) {
            return new WheelContextDto.Wave(new Object(o8g.R(((d2v) f2vVar).a)) { // from class: com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDataDto$WaveDataDto

                @SerializedName("seeds")
                private final List<String> seeds;

                {
                    this.seeds = r1;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof WheelContextDataDto$WaveDataDto) && Intrinsics.d(this.seeds, ((WheelContextDataDto$WaveDataDto) obj).seeds);
                }

                public final int hashCode() {
                    List<String> list = this.seeds;
                    if (list == null) {
                        return 0;
                    }
                    return list.hashCode();
                }

                public final String toString() {
                    return v3w.f("WaveDataDto(seeds=", ")", this.seeds);
                }
            });
        }
        if (f2vVar.equals(z1v.a)) {
            return uhv.a;
        }
        if (f2vVar.equals(b2v.a)) {
            return vhv.a;
        }
        b6e.s();
        return null;
    }
}
