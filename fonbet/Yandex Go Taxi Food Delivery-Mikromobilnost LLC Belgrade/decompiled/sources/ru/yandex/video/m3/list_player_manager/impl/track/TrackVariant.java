package ru.yandex.video.m3.list_player_manager.impl.track;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001%B7\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "", "", "trackVariantType", "", "title", "", "selected", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "format", "<init>", "(ILjava/lang/String;ZILru/yandex/video/m3/list_player_manager/impl/track/Format;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getTrackVariantType", "Ljava/lang/String;", "getTitle", "Z", "getSelected", "()Z", "getTrackType", "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "getFormat", "()Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackVariant {
    public static final int $stable = 0;
    private final Format format;
    private final boolean selected;
    private final String title;
    private final int trackType;
    private final int trackVariantType;

    private TrackVariant(@TrackVariantType int i, String str, boolean z, @TrackType int i2, Format format) {
        this.trackVariantType = i;
        this.title = str;
        this.selected = z;
        this.trackType = i2;
        this.format = format;
    }

    public final TrackVariant copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TrackVariant.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        TrackVariant trackVariant = (TrackVariant) other;
        return this.trackVariantType == trackVariant.trackVariantType && jl40.l(this.title, trackVariant.title) && this.selected == trackVariant.selected && this.trackType == trackVariant.trackType && jl40.l(this.format, trackVariant.format);
    }

    public final Format getFormat() {
        return this.format;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final int getTrackVariantType() {
        return this.trackVariantType;
    }

    public int hashCode() {
        int b = oyr.b(this.trackType, unr0.e(unr0.b(Integer.hashCode(this.trackVariantType) * 31, 31, this.title), 31, this.selected), 31);
        Format format = this.format;
        return b + (format != null ? format.hashCode() : 0);
    }

    public String toString() {
        return "TrackVariant(trackVariantType=" + this.trackVariantType + ", title='" + this.title + "', selected=" + this.selected + ", trackType=" + this.trackType + ", format=" + this.format + ')';
    }

    public /* synthetic */ TrackVariant(int i, String str, boolean z, int i2, Format format, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, z, i2, format);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B+\b\u0000\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0006\u0010!\u001a\u00020\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant$Builder;", "", "trackVariant", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "(Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;)V", "trackVariantType", "", "title", "", "selected", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "(ILjava/lang/String;ZI)V", "format", "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "getFormat", "()Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "setFormat", "(Lru/yandex/video/m3/list_player_manager/impl/track/Format;)V", "getSelected", "()Z", "setSelected", "(Z)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getTrackType", "()I", "setTrackType", "(I)V", "getTrackVariantType", "setTrackVariantType", "build", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Format format;
        private boolean selected;
        private String title;
        private int trackType;
        private int trackVariantType;

        public Builder(TrackVariant trackVariant) {
            this(trackVariant.getTrackVariantType(), trackVariant.getTitle(), trackVariant.getSelected(), trackVariant.getTrackType());
            this.format = trackVariant.getFormat();
        }

        public final TrackVariant build() {
            return new TrackVariant(this.trackVariantType, this.title, this.selected, this.trackType, this.format, null);
        }

        public final Format getFormat() {
            return this.format;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTrackType() {
            return this.trackType;
        }

        public final int getTrackVariantType() {
            return this.trackVariantType;
        }

        public final void setFormat(Format format) {
            this.format = format;
        }

        public final void setSelected(boolean z) {
            this.selected = z;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTrackType(int i) {
            this.trackType = i;
        }

        public final void setTrackVariantType(int i) {
            this.trackVariantType = i;
        }

        public Builder(@TrackVariantType int i, String str, boolean z, @TrackType int i2) {
            this.trackVariantType = i;
            this.title = str;
            this.selected = z;
            this.trackType = i2;
        }
    }
}
