package ru.yandex.music.common.media.context;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import defpackage.cvl;
import defpackage.nyk;
import defpackage.oyk;
import java.util.Objects;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
final class ChartPlaybackScope extends PlaybackScope {
    private static final long serialVersionUID = 1;

    @NonNull
    @SerializedName("mInfo")
    private final nyk mInfo;

    @NonNull
    @SerializedName("mPlaylistId")
    private final String mPlaylistId;

    public ChartPlaybackScope(String str, String str2) {
        super(Page.HOME, PlaybackScope.Type.CHART);
        str = str == null ? "414787002:1076" : str;
        this.mPlaylistId = str;
        nyk nykVar = oyk.a;
        this.mInfo = new nyk(PlaybackContextName.PLAYLIST, str, str2);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartPlaybackScope) || !super.equals(obj)) {
            return false;
        }
        ChartPlaybackScope chartPlaybackScope = (ChartPlaybackScope) obj;
        return Objects.equals(this.mInfo, chartPlaybackScope.mInfo) && Objects.equals(this.mPlaylistId, chartPlaybackScope.mPlaylistId);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c g(cvl cvlVar, boolean z) {
        c cVar = c.d;
        String e = cvlVar.e();
        String str = cvlVar.b;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.PLAYLIST, e, str);
        String str2 = Card.CHART.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str2, "build(): card is not set");
        if (str2 == null) {
            str2 = "";
        }
        return new c(this, nykVar2, str2);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c h() {
        c cVar = c.d;
        nyk nykVar = this.mInfo;
        String str = Card.CHART.name;
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
        return this.mPlaylistId.hashCode() + ((this.mInfo.hashCode() + (super.hashCode() * 31)) * 31);
    }
}
