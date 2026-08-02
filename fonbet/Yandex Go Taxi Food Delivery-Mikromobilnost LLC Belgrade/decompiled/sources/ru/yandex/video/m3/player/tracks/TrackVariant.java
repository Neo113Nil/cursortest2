package ru.yandex.video.m3.player.tracks;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackVariant;", "", "title", "", "selected", "", "(Ljava/lang/String;Z)V", "getSelected", "()Z", "getTitle", "()Ljava/lang/String;", "Adaptive", "Disable", "DownloadVariant", "PreferredTrackVariant", "Variant", "Lru/yandex/video/m3/player/tracks/TrackVariant$Adaptive;", "Lru/yandex/video/m3/player/tracks/TrackVariant$Disable;", "Lru/yandex/video/m3/player/tracks/TrackVariant$DownloadVariant;", "Lru/yandex/video/m3/player/tracks/TrackVariant$PreferredTrackVariant;", "Lru/yandex/video/m3/player/tracks/TrackVariant$Variant;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TrackVariant {
    public static final int $stable = 0;
    private final boolean selected;
    private final String title;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackVariant$Adaptive;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "title", "", "selected", "", "cappingProvider", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "trackSelectionInitializationError", "Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "(Ljava/lang/String;ZLru/yandex/video/m3/player/tracks/CappingProvider;Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;)V", "getCappingProvider", "()Lru/yandex/video/m3/player/tracks/CappingProvider;", "getSelected", "()Z", "getTitle", "()Ljava/lang/String;", "getTrackSelectionInitializationError", "()Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Adaptive extends TrackVariant {
        public static final int $stable = 8;
        private final CappingProvider cappingProvider;
        private final boolean selected;
        private final String title;
        private final TrackSelectionInitializationError trackSelectionInitializationError;

        /* JADX WARN: Multi-variable type inference failed */
        public Adaptive(String str, boolean z, CappingProvider cappingProvider, TrackSelectionInitializationError trackSelectionInitializationError) {
            super(null, false, 3, 0 == true ? 1 : 0);
            this.title = str;
            this.selected = z;
            this.cappingProvider = cappingProvider;
            this.trackSelectionInitializationError = trackSelectionInitializationError;
        }

        public static /* synthetic */ Adaptive copy$default(Adaptive adaptive, String str, boolean z, CappingProvider cappingProvider, TrackSelectionInitializationError trackSelectionInitializationError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = adaptive.title;
            }
            if ((i & 2) != 0) {
                z = adaptive.selected;
            }
            if ((i & 4) != 0) {
                cappingProvider = adaptive.cappingProvider;
            }
            if ((i & 8) != 0) {
                trackSelectionInitializationError = adaptive.trackSelectionInitializationError;
            }
            return adaptive.copy(str, z, cappingProvider, trackSelectionInitializationError);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        /* renamed from: component3, reason: from getter */
        public final CappingProvider getCappingProvider() {
            return this.cappingProvider;
        }

        /* renamed from: component4, reason: from getter */
        public final TrackSelectionInitializationError getTrackSelectionInitializationError() {
            return this.trackSelectionInitializationError;
        }

        public final Adaptive copy(String title, boolean selected, CappingProvider cappingProvider, TrackSelectionInitializationError trackSelectionInitializationError) {
            return new Adaptive(title, selected, cappingProvider, trackSelectionInitializationError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Adaptive)) {
                return false;
            }
            Adaptive adaptive = (Adaptive) other;
            return jl40.l(this.title, adaptive.title) && this.selected == adaptive.selected && jl40.l(this.cappingProvider, adaptive.cappingProvider) && jl40.l(this.trackSelectionInitializationError, adaptive.trackSelectionInitializationError);
        }

        public final CappingProvider getCappingProvider() {
            return this.cappingProvider;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public boolean getSelected() {
            return this.selected;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public String getTitle() {
            return this.title;
        }

        public final TrackSelectionInitializationError getTrackSelectionInitializationError() {
            return this.trackSelectionInitializationError;
        }

        public int hashCode() {
            int e = unr0.e(this.title.hashCode() * 31, 31, this.selected);
            CappingProvider cappingProvider = this.cappingProvider;
            int hashCode = (e + (cappingProvider == null ? 0 : cappingProvider.hashCode())) * 31;
            TrackSelectionInitializationError trackSelectionInitializationError = this.trackSelectionInitializationError;
            return hashCode + (trackSelectionInitializationError != null ? trackSelectionInitializationError.hashCode() : 0);
        }

        public String toString() {
            return "Adaptive(title=" + this.title + ", selected=" + this.selected + ", cappingProvider=" + this.cappingProvider + ", trackSelectionInitializationError=" + this.trackSelectionInitializationError + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackVariant$DownloadVariant;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "title", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/tracks/TrackType;", "periodIndex", "", "groupIndex", "trackIndex", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "(Ljava/lang/String;Lru/yandex/video/m3/player/tracks/TrackType;IIILru/yandex/video/m3/player/tracks/TrackFormat;)V", "getFormat", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "getGroupIndex", "()I", "getPeriodIndex", "getTitle", "()Ljava/lang/String;", "getTrackIndex", "getTrackType", "()Lru/yandex/video/m3/player/tracks/TrackType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DownloadVariant extends TrackVariant {
        public static final int $stable = 8;
        private final TrackFormat format;
        private final int groupIndex;
        private final int periodIndex;
        private final String title;
        private final int trackIndex;
        private final TrackType trackType;

        /* JADX WARN: Multi-variable type inference failed */
        public DownloadVariant(String str, TrackType trackType, int i, int i2, int i3, TrackFormat trackFormat) {
            super(null, false, 3, 0 == true ? 1 : 0);
            this.title = str;
            this.trackType = trackType;
            this.periodIndex = i;
            this.groupIndex = i2;
            this.trackIndex = i3;
            this.format = trackFormat;
        }

        public static /* synthetic */ DownloadVariant copy$default(DownloadVariant downloadVariant, String str, TrackType trackType, int i, int i2, int i3, TrackFormat trackFormat, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = downloadVariant.title;
            }
            if ((i4 & 2) != 0) {
                trackType = downloadVariant.trackType;
            }
            if ((i4 & 4) != 0) {
                i = downloadVariant.periodIndex;
            }
            if ((i4 & 8) != 0) {
                i2 = downloadVariant.groupIndex;
            }
            if ((i4 & 16) != 0) {
                i3 = downloadVariant.trackIndex;
            }
            if ((i4 & 32) != 0) {
                trackFormat = downloadVariant.format;
            }
            int i5 = i3;
            TrackFormat trackFormat2 = trackFormat;
            return downloadVariant.copy(str, trackType, i, i2, i5, trackFormat2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TrackType getTrackType() {
            return this.trackType;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTrackIndex() {
            return this.trackIndex;
        }

        /* renamed from: component6, reason: from getter */
        public final TrackFormat getFormat() {
            return this.format;
        }

        public final DownloadVariant copy(String title, TrackType trackType, int periodIndex, int groupIndex, int trackIndex, TrackFormat format) {
            return new DownloadVariant(title, trackType, periodIndex, groupIndex, trackIndex, format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadVariant)) {
                return false;
            }
            DownloadVariant downloadVariant = (DownloadVariant) other;
            return jl40.l(this.title, downloadVariant.title) && this.trackType == downloadVariant.trackType && this.periodIndex == downloadVariant.periodIndex && this.groupIndex == downloadVariant.groupIndex && this.trackIndex == downloadVariant.trackIndex && jl40.l(this.format, downloadVariant.format);
        }

        public final TrackFormat getFormat() {
            return this.format;
        }

        public final int getGroupIndex() {
            return this.groupIndex;
        }

        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public String getTitle() {
            return this.title;
        }

        public final int getTrackIndex() {
            return this.trackIndex;
        }

        public final TrackType getTrackType() {
            return this.trackType;
        }

        public int hashCode() {
            return this.format.hashCode() + oyr.b(this.trackIndex, oyr.b(this.groupIndex, oyr.b(this.periodIndex, (this.trackType.hashCode() + (this.title.hashCode() * 31)) * 31, 31), 31), 31);
        }

        public String toString() {
            return "DownloadVariant(title=" + this.title + ", trackType=" + this.trackType + ", periodIndex=" + this.periodIndex + ", groupIndex=" + this.groupIndex + ", trackIndex=" + this.trackIndex + ", format=" + this.format + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackVariant$PreferredTrackVariant;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "language", "", "(Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreferredTrackVariant extends TrackVariant {
        public static final int $stable = 0;
        private final String language;

        /* JADX WARN: Multi-variable type inference failed */
        public PreferredTrackVariant(String str) {
            super(null, false, 3, 0 == true ? 1 : 0);
            this.language = str;
        }

        public static /* synthetic */ PreferredTrackVariant copy$default(PreferredTrackVariant preferredTrackVariant, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preferredTrackVariant.language;
            }
            return preferredTrackVariant.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        public final PreferredTrackVariant copy(String language) {
            return new PreferredTrackVariant(language);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreferredTrackVariant) && jl40.l(this.language, ((PreferredTrackVariant) other).language);
        }

        public final String getLanguage() {
            return this.language;
        }

        public int hashCode() {
            String str = this.language;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return b64.p(new StringBuilder("PreferredTrackVariant(language="), this.language, ')');
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackVariant$Variant;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "title", "", "groupIndex", "", "trackIndex", "selected", "", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "(Ljava/lang/String;IIZLru/yandex/video/m3/player/tracks/TrackFormat;)V", "getFormat", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "getGroupIndex", "()I", "getSelected", "()Z", "getTitle", "()Ljava/lang/String;", "getTrackIndex", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Variant extends TrackVariant {
        public static final int $stable = 8;
        private final TrackFormat format;
        private final int groupIndex;
        private final boolean selected;
        private final String title;
        private final int trackIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public Variant(String str, int i, int i2, boolean z, TrackFormat trackFormat) {
            super(null, false, 3, 0 == true ? 1 : 0);
            this.title = str;
            this.groupIndex = i;
            this.trackIndex = i2;
            this.selected = z;
            this.format = trackFormat;
        }

        public static /* synthetic */ Variant copy$default(Variant variant, String str, int i, int i2, boolean z, TrackFormat trackFormat, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = variant.title;
            }
            if ((i3 & 2) != 0) {
                i = variant.groupIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = variant.trackIndex;
            }
            if ((i3 & 8) != 0) {
                z = variant.selected;
            }
            if ((i3 & 16) != 0) {
                trackFormat = variant.format;
            }
            TrackFormat trackFormat2 = trackFormat;
            int i4 = i2;
            return variant.copy(str, i, i4, z, trackFormat2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTrackIndex() {
            return this.trackIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        /* renamed from: component5, reason: from getter */
        public final TrackFormat getFormat() {
            return this.format;
        }

        public final Variant copy(String title, int groupIndex, int trackIndex, boolean selected, TrackFormat format) {
            return new Variant(title, groupIndex, trackIndex, selected, format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) other;
            return jl40.l(this.title, variant.title) && this.groupIndex == variant.groupIndex && this.trackIndex == variant.trackIndex && this.selected == variant.selected && jl40.l(this.format, variant.format);
        }

        public final TrackFormat getFormat() {
            return this.format;
        }

        public final int getGroupIndex() {
            return this.groupIndex;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public boolean getSelected() {
            return this.selected;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public String getTitle() {
            return this.title;
        }

        public final int getTrackIndex() {
            return this.trackIndex;
        }

        public int hashCode() {
            return this.format.hashCode() + unr0.e(oyr.b(this.trackIndex, oyr.b(this.groupIndex, this.title.hashCode() * 31, 31), 31), 31, this.selected);
        }

        public String toString() {
            return "Variant(title=" + this.title + ", groupIndex=" + this.groupIndex + ", trackIndex=" + this.trackIndex + ", selected=" + this.selected + ", format=" + this.format + ')';
        }
    }

    public /* synthetic */ TrackVariant(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, null);
    }

    public boolean getSelected() {
        return this.selected;
    }

    public String getTitle() {
        return this.title;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/tracks/TrackVariant$Disable;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "title", "", "selected", "", "isAvailableForSelection", "(Ljava/lang/String;ZZ)V", "()Z", "getSelected", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Disable extends TrackVariant {
        public static final int $stable = 0;
        private final boolean isAvailableForSelection;
        private final boolean selected;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Disable(String str, boolean z, boolean z2) {
            super(null, false, 3, 0 == true ? 1 : 0);
            this.title = str;
            this.selected = z;
            this.isAvailableForSelection = z2;
        }

        public static /* synthetic */ Disable copy$default(Disable disable, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disable.title;
            }
            if ((i & 2) != 0) {
                z = disable.selected;
            }
            if ((i & 4) != 0) {
                z2 = disable.isAvailableForSelection;
            }
            return disable.copy(str, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAvailableForSelection() {
            return this.isAvailableForSelection;
        }

        public final Disable copy(String title, boolean selected, boolean isAvailableForSelection) {
            return new Disable(title, selected, isAvailableForSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disable)) {
                return false;
            }
            Disable disable = (Disable) other;
            return jl40.l(this.title, disable.title) && this.selected == disable.selected && this.isAvailableForSelection == disable.isAvailableForSelection;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public boolean getSelected() {
            return this.selected;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackVariant
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAvailableForSelection) + unr0.e(this.title.hashCode() * 31, 31, this.selected);
        }

        public final boolean isAvailableForSelection() {
            return this.isAvailableForSelection;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Disable(title=");
            sb.append(this.title);
            sb.append(", selected=");
            sb.append(this.selected);
            sb.append(", isAvailableForSelection=");
            return unr0.u(sb, this.isAvailableForSelection, ')');
        }

        public /* synthetic */ Disable(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? true : z2);
        }
    }

    private TrackVariant(String str, boolean z) {
        this.title = str;
        this.selected = z;
    }

    public /* synthetic */ TrackVariant(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }
}
