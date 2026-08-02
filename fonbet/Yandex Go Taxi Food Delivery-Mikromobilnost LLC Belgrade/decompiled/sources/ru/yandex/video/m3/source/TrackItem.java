package ru.yandex.video.m3.source;

import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.source.TrackItem;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/source/TrackItem;", "", "", "periodIndex", "groupIndex", "trackIndex", "<init>", "(III)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/source/TrackItem$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/source/TrackItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getPeriodIndex", "getGroupIndex", "getTrackIndex", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackItem {
    public static final int $stable = 0;
    private final int groupIndex;
    private final int periodIndex;
    private final int trackIndex;

    private TrackItem(int i, int i2, int i3) {
        this.periodIndex = i;
        this.groupIndex = i2;
        this.trackIndex = i3;
    }

    public static /* synthetic */ TrackItem copy$default(TrackItem trackItem, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.source.TrackItem$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TrackItem.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(TrackItem.Builder builder) {
                }
            };
        }
        return trackItem.copy(tlsVar);
    }

    public final TrackItem copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TrackItem.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        TrackItem trackItem = (TrackItem) other;
        return this.periodIndex == trackItem.periodIndex && this.groupIndex == trackItem.groupIndex && this.trackIndex == trackItem.trackIndex;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final int getPeriodIndex() {
        return this.periodIndex;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.trackIndex;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackItem(periodIndex=");
        sb.append(this.periodIndex);
        sb.append(", groupIndex=");
        sb.append(this.groupIndex);
        sb.append(", trackIndex=");
        return oyr.s(sb, this.trackIndex, ')');
    }

    public /* synthetic */ TrackItem(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/source/TrackItem$Builder;", "", "trackItem", "Lru/yandex/video/m3/source/TrackItem;", "(Lru/yandex/video/m3/source/TrackItem;)V", "periodIndex", "", "groupIndex", "trackIndex", "(III)V", "getGroupIndex", "()I", "setGroupIndex", "(I)V", "getPeriodIndex", "setPeriodIndex", "getTrackIndex", "setTrackIndex", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private int groupIndex;
        private int periodIndex;
        private int trackIndex;

        public Builder(TrackItem trackItem) {
            this(trackItem.getPeriodIndex(), trackItem.getGroupIndex(), trackItem.getTrackIndex());
        }

        public final TrackItem build$video_player_internalRelease() {
            return new TrackItem(this.periodIndex, this.groupIndex, this.trackIndex, null);
        }

        public final int getGroupIndex() {
            return this.groupIndex;
        }

        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        public final int getTrackIndex() {
            return this.trackIndex;
        }

        public final void setGroupIndex(int i) {
            this.groupIndex = i;
        }

        public final void setPeriodIndex(int i) {
            this.periodIndex = i;
        }

        public final void setTrackIndex(int i) {
            this.trackIndex = i;
        }

        public Builder(int i, int i2, int i3) {
            this.periodIndex = i;
            this.groupIndex = i2;
            this.trackIndex = i3;
        }
    }
}
