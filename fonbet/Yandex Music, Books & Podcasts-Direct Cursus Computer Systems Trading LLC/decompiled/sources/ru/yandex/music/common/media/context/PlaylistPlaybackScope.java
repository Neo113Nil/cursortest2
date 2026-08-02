package ru.yandex.music.common.media.context;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import defpackage.cvl;
import defpackage.k5r;
import defpackage.nyk;
import defpackage.oyk;
import java.util.Objects;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
final class PlaylistPlaybackScope extends PlaybackScope {
    private static final long serialVersionUID = 1;

    @NonNull
    @SerializedName("mInfo")
    private final nyk mInfo;

    @NonNull
    @SerializedName("mIsDefaultLibrary")
    private final Boolean mIsDefaultLibrary;

    @NonNull
    @SerializedName("mPlaylistId")
    private final String mPlaylistId;

    public PlaylistPlaybackScope(@NonNull Page page, @NonNull cvl cvlVar) {
        super(page, PlaybackScope.Type.PLAYLIST);
        this.mInfo = oyk.c(cvlVar);
        this.mPlaylistId = cvlVar.e();
        this.mIsDefaultLibrary = Boolean.valueOf(cvlVar.d());
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistPlaybackScope) || !super.equals(obj)) {
            return false;
        }
        PlaylistPlaybackScope playlistPlaybackScope = (PlaylistPlaybackScope) obj;
        return Objects.equals(this.mInfo, playlistPlaybackScope.mInfo) && Objects.equals(this.mPlaylistId, playlistPlaybackScope.mPlaylistId) && Objects.equals(this.mIsDefaultLibrary, playlistPlaybackScope.mIsDefaultLibrary);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c h() {
        c cVar = c.d;
        nyk nykVar = this.mInfo;
        String str = Card.TRACK.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (nykVar == null) {
            nykVar = nyk.d;
        }
        if (str == null) {
            str = "";
        }
        return new c(this, nykVar, str);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final int hashCode() {
        return this.mIsDefaultLibrary.hashCode() + k5r.c((this.mInfo.hashCode() + (super.hashCode() * 31)) * 31, 31, this.mPlaylistId);
    }
}
