package ru.yandex.music.novelties.podcasts.catalog.data;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.vz1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PodcastsEntityDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/music/novelties/podcasts/catalog/data/TracksChartBlockDto;", "Lru/yandex/music/novelties/podcasts/catalog/data/PodcastsBlockDto;", "", DeviceService.KEY_DESC, "viewAllUrlScheme", "", "Lru/yandex/music/novelties/podcasts/catalog/data/dto/PodcastsEntityDto;", "entities", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "g", "Ljava/util/List;", "f", "()Ljava/util/List;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class TracksChartBlockDto extends PodcastsBlockDto {

    @SerializedName(DeviceService.KEY_DESC)
    private final String description;

    @SerializedName("entities")
    private final List<PodcastsEntityDto> entities;

    @SerializedName("viewAllUrlScheme")
    private final String viewAllUrlScheme;

    /* JADX WARN: Multi-variable type inference failed */
    public TracksChartBlockDto(String str, String str2, List<? extends PodcastsEntityDto> list) {
        super(null, null, null, null, 15, null);
        this.description = str;
        this.viewAllUrlScheme = str2;
        this.entities = list;
    }

    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TracksChartBlockDto)) {
            return false;
        }
        TracksChartBlockDto tracksChartBlockDto = (TracksChartBlockDto) obj;
        return Intrinsics.d(this.description, tracksChartBlockDto.description) && Intrinsics.d(this.viewAllUrlScheme, tracksChartBlockDto.viewAllUrlScheme) && Intrinsics.d(this.entities, tracksChartBlockDto.entities);
    }

    /* renamed from: f, reason: from getter */
    public final List getEntities() {
        return this.entities;
    }

    /* renamed from: g, reason: from getter */
    public final String getViewAllUrlScheme() {
        return this.viewAllUrlScheme;
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.viewAllUrlScheme;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PodcastsEntityDto> list = this.entities;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.viewAllUrlScheme;
        return vz1.u(f1d.m("TracksChartBlockDto(description=", str, ", viewAllUrlScheme=", str2, ", entities="), this.entities, ")");
    }
}
