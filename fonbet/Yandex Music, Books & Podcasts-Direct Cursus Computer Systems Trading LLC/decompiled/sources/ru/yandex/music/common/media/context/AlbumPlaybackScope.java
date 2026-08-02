package ru.yandex.music.common.media.context;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import defpackage.nyk;
import defpackage.oq;
import defpackage.oyk;
import java.util.Objects;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
final class AlbumPlaybackScope extends PlaybackScope {
    private static final long serialVersionUID = 1;

    @NonNull
    @SerializedName("mInfo")
    private final nyk mInfo;

    public AlbumPlaybackScope(@NonNull Page page, @NonNull oq oqVar) {
        super(page, PlaybackScope.Type.ALBUM);
        nyk nykVar = oyk.a;
        this.mInfo = oyk.a(oqVar.a, oqVar.b);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AlbumPlaybackScope) && super.equals(obj)) {
            return Objects.equals(this.mInfo, ((AlbumPlaybackScope) obj).mInfo);
        }
        return false;
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
        return this.mInfo.hashCode() + (super.hashCode() * 31);
    }

    public AlbumPlaybackScope(@NonNull Page page, @NonNull String str, @NonNull String str2) {
        super(page, PlaybackScope.Type.ALBUM);
        this.mInfo = oyk.a(str, str2);
    }
}
