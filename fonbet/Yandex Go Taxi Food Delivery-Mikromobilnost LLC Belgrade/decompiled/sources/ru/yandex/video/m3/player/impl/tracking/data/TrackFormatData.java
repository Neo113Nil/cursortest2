package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001!B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "", "", "id", "", "isVertical", "language", "", "", "resolution", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getLanguage", "Ljava/util/List;", "getResolution", "()Ljava/util/List;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackFormatData {
    public static final int $stable = 8;
    private final String id;
    private final Boolean isVertical;
    private final String language;
    private final List<Integer> resolution;

    private TrackFormatData(String str, Boolean bool, String str2, List<Integer> list) {
        this.id = str;
        this.isVertical = bool;
        this.language = str2;
        this.resolution = list;
    }

    public static /* synthetic */ TrackFormatData copy$default(TrackFormatData trackFormatData, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TrackFormatData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(TrackFormatData.Builder builder) {
                }
            };
        }
        return trackFormatData.copy(tlsVar);
    }

    public final TrackFormatData copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TrackFormatData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        TrackFormatData trackFormatData = (TrackFormatData) other;
        return jl40.l(this.isVertical, trackFormatData.isVertical) && jl40.l(this.id, trackFormatData.id) && jl40.l(this.language, trackFormatData.language) && jl40.l(this.resolution, trackFormatData.resolution);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final List<Integer> getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        Boolean bool = this.isVertical;
        int b = unr0.b((bool != null ? bool.hashCode() : 0) * 31, 31, this.id);
        String str = this.language;
        int hashCode = (b + (str != null ? str.hashCode() : 0)) * 31;
        List<Integer> list = this.resolution;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: isVertical, reason: from getter */
    public final Boolean getIsVertical() {
        return this.isVertical;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackFormatData(id='");
        sb.append(this.id);
        sb.append("', isVertical=");
        sb.append(this.isVertical);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", resolution=");
        return unr0.t(sb, this.resolution, ')');
    }

    public /* synthetic */ TrackFormatData(String str, Boolean bool, String str2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, str2, list);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0007R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData$Builder;", "", "trackFormatData", "Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "(Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;)V", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "isVertical", "", "()Ljava/lang/Boolean;", "setVertical", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "language", "getLanguage", "setLanguage", "resolution", "", "", "getResolution", "()Ljava/util/List;", "setResolution", "(Ljava/util/List;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String id;
        private Boolean isVertical;
        private String language;
        private List<Integer> resolution;

        public Builder(TrackFormatData trackFormatData) {
            this(trackFormatData.getId());
            this.isVertical = trackFormatData.getIsVertical();
            this.language = trackFormatData.getLanguage();
            this.resolution = trackFormatData.getResolution();
        }

        public final TrackFormatData build$video_player_internalRelease() {
            return new TrackFormatData(this.id, this.isVertical, this.language, this.resolution, null);
        }

        public final String getId() {
            return this.id;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final List<Integer> getResolution() {
            return this.resolution;
        }

        /* renamed from: isVertical, reason: from getter */
        public final Boolean getIsVertical() {
            return this.isVertical;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setResolution(List<Integer> list) {
            this.resolution = list;
        }

        public final void setVertical(Boolean bool) {
            this.isVertical = bool;
        }

        public Builder(String str) {
            this.id = str;
        }
    }
}
