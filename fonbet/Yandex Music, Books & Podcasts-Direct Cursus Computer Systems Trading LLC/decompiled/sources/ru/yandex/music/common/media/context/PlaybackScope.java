package ru.yandex.music.common.media.context;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import defpackage.c01;
import defpackage.cvl;
import defpackage.eul;
import defpackage.g5b;
import defpackage.lt;
import defpackage.nyk;
import defpackage.oq;
import defpackage.oyk;
import defpackage.u51;
import java.io.Serializable;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public abstract class PlaybackScope implements Serializable {
    public static final a a = g5b.a;
    private static final long serialVersionUID = 1;

    @SerializedName("mLaunchActionInfo")
    private final LaunchActionInfo mLaunchActionInfo;

    @NonNull
    @SerializedName("mPage")
    private final Page mPage;

    @NonNull
    @SerializedName("mType")
    private final Type mType;

    @Keep
    public enum Type {
        EMPTY,
        SIMPLE_PAGE,
        ALBUM,
        ARTIST,
        CHART,
        CARD,
        FIXED_CARD,
        PLAYLIST,
        META_TAG;

        public static Type fromString(@NonNull String str) {
            for (Type type : values()) {
                if (type.name().equalsIgnoreCase(str)) {
                    return type;
                }
            }
            Assertions.fail("fromString(): unknown value " + str);
            return null;
        }
    }

    public PlaybackScope(@NonNull Page page, @NonNull Type type, LaunchActionInfo launchActionInfo) {
        this.mPage = page;
        this.mType = type;
        this.mLaunchActionInfo = launchActionInfo == null ? LaunchActionInfo.DEFAULT : launchActionInfo;
    }

    public final c a(nyk nykVar) {
        c cVar = c.d;
        String str = Card.ALBUM.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(this, nykVar, str);
    }

    public c b(oq oqVar) {
        nyk nykVar = oyk.a;
        return a(oyk.a(oqVar.a, oqVar.b));
    }

    public c c(lt ltVar) {
        nyk nykVar = oyk.a;
        return a(oyk.a(ltVar.a, ltVar.c));
    }

    public c d(c01 c01Var) {
        c cVar = c.d;
        nyk b = oyk.b(c01Var);
        String str = Card.ARTIST.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(b, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(this, b, str);
    }

    public final c e(u51 u51Var) {
        c cVar = c.d;
        String str = u51Var.a;
        String str2 = u51Var.b;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.ARTIST, str, str2);
        String str3 = Card.ARTIST.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str3, "build(): card is not set");
        if (str3 == null) {
            str3 = "";
        }
        return new c(this, nykVar2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackScope)) {
            return false;
        }
        PlaybackScope playbackScope = (PlaybackScope) obj;
        return this.mPage == playbackScope.mPage && this.mType == playbackScope.mType;
    }

    public c f(eul eulVar) {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.PLAYLIST, eulVar.f, eulVar.c);
        String str = Card.PLAYLIST.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(this, nykVar2, str);
    }

    public c g(cvl cvlVar, boolean z) {
        c cVar = c.d;
        nyk c = oyk.c(cvlVar);
        String str = Card.PLAYLIST.name;
        Assertions.assertNonNull(this, "build(): scope is not set");
        Assertions.assertNonNull(c, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(this, c, str);
    }

    public c h() {
        c cVar = c.d;
        nyk nykVar = oyk.a;
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

    public int hashCode() {
        return this.mType.hashCode() + (this.mPage.hashCode() * 31);
    }

    public c i() {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        String str = Card.DEFAULT.name;
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

    public final LaunchActionInfo j() {
        LaunchActionInfo launchActionInfo = this.mLaunchActionInfo;
        if (launchActionInfo != null) {
            return launchActionInfo;
        }
        Assertions.fail("mLaunchActionInfo should not be null");
        return LaunchActionInfo.DEFAULT;
    }

    public final Page k() {
        return this.mPage;
    }

    public final Type l() {
        return this.mType;
    }

    public final String toString() {
        return "PlaybackScope{mPage=" + this.mPage + ", mType=" + this.mType + ", mLaunchActionInfo=" + this.mLaunchActionInfo + '}';
    }

    public PlaybackScope(@NonNull Page page, @NonNull Type type) {
        this(page, type, LaunchActionInfo.DEFAULT);
    }
}
