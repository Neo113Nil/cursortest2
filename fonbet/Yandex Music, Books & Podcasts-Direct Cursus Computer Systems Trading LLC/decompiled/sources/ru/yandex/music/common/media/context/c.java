package ru.yandex.music.common.media.context;

import defpackage.f1d;
import defpackage.nyk;
import defpackage.su4;
import java.util.Objects;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class c {
    public static final c d;
    public final PlaybackScope a;
    public final nyk b;
    public final String c;

    static {
        a aVar = PlaybackScope.a;
        nyk nykVar = nyk.d;
        Assertions.assertNonNull(aVar, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull("", "build(): card is not set");
        d = new c(aVar, nykVar, "");
    }

    public c(PlaybackScope playbackScope, nyk nykVar, String str) {
        this.a = playbackScope;
        this.b = nykVar;
        this.c = str;
    }

    public final String a() {
        PlaybackScope playbackScope = this.a;
        String str = playbackScope.k().value;
        String str2 = playbackScope.j().a;
        StringBuilder m = f1d.m("mobile-", str, "-", this.c, "-");
        m.append(str2);
        return m.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.a, cVar.a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.c, cVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackContext{mScope=");
        sb.append(this.a);
        sb.append(", mInfo=");
        sb.append(this.b);
        sb.append(", mCard='");
        return su4.o(sb, this.c, "'}");
    }
}
