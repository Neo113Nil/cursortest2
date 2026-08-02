package ru.yandex.video.m3.player.impl.tracks;

import androidx.media3.common.a;
import defpackage.yzz0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.tracks.CappingProvider;
import ru.yandex.video.m3.player.tracks.TrackSelectionInitializationError;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "", "Lzy11;", "disableRenderer", "()V", "selectAdaptive", "", "groupIndex", "trackIndex", "selectTrack", "(II)V", "", "language", "defaultTrackLanguage", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "getSelection", "()Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "Lyzz0;", "getTrackGroups", "()Lyzz0;", "trackGroups", "Selection", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RendererTrackSelector {
    void defaultTrackLanguage(String language);

    void disableRenderer();

    Selection getSelection();

    yzz0 getTrackGroups();

    void selectAdaptive();

    void selectTrack(int groupIndex, int trackIndex);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "", "()V", "Adaptive", "Disabled", "Track", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection$Adaptive;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection$Disabled;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection$Track;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Selection {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection$Adaptive;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "Landroidx/media3/common/a;", "format", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "cappingProvider", "Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "trackSelectionInitializationError", "<init>", "(Landroidx/media3/common/a;Lru/yandex/video/m3/player/tracks/CappingProvider;Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/media3/common/a;", "getFormat", "()Landroidx/media3/common/a;", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "getCappingProvider", "()Lru/yandex/video/m3/player/tracks/CappingProvider;", "Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "getTrackSelectionInitializationError", "()Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Adaptive extends Selection {
            public static final int $stable = 8;
            private final CappingProvider cappingProvider;
            private final a format;
            private final TrackSelectionInitializationError trackSelectionInitializationError;

            public Adaptive(a aVar, CappingProvider cappingProvider, TrackSelectionInitializationError trackSelectionInitializationError) {
                super(null);
                this.format = aVar;
                this.cappingProvider = cappingProvider;
                this.trackSelectionInitializationError = trackSelectionInitializationError;
            }

            public final CappingProvider getCappingProvider() {
                return this.cappingProvider;
            }

            public final a getFormat() {
                return this.format;
            }

            public final TrackSelectionInitializationError getTrackSelectionInitializationError() {
                return this.trackSelectionInitializationError;
            }

            public String toString() {
                return "Adaptive(format=Format(" + a.c(this.format) + ") capping=" + this.cappingProvider.getCapping() + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection$Disabled;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Disabled extends Selection {
            public static final int $stable = 0;
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection$Track;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "", "groupIndex", "trackIndex", "Landroidx/media3/common/a;", "format", "<init>", "(IILandroidx/media3/common/a;)V", "", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getGroupIndex", "()I", "getTrackIndex", "Landroidx/media3/common/a;", "getFormat", "()Landroidx/media3/common/a;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Track extends Selection {
            public static final int $stable = 8;
            private final a format;
            private final int groupIndex;
            private final int trackIndex;

            public Track(int i, int i2, a aVar) {
                super(null);
                this.groupIndex = i;
                this.trackIndex = i2;
                this.format = aVar;
            }

            public final a getFormat() {
                return this.format;
            }

            public final int getGroupIndex() {
                return this.groupIndex;
            }

            public final int getTrackIndex() {
                return this.trackIndex;
            }

            public String toString() {
                return "Track(groupIndex=" + this.groupIndex + ", trackIndex=" + this.trackIndex + ", format=Format(" + a.c(this.format) + "))";
            }
        }

        public /* synthetic */ Selection(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Selection() {
        }
    }
}
