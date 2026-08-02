package ru.yandex.music.common.media.context;

import defpackage.nyk;
import defpackage.oyk;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class f {
    public static c a() {
        c cVar = c.d;
        nyk a = oyk.a("default", "default");
        PlaybackScope a2 = d.a();
        String str = Card.ALBUM.name;
        Assertions.assertNonNull(a2, "build(): scope is not set");
        Assertions.assertNonNull(a, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(a2, a, str);
    }

    public static c b() {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.ARTIST, "default", "default");
        PlaybackScope c = d.c();
        String str = Card.ALBUM.name;
        Assertions.assertNonNull(c, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(c, nykVar2, str);
    }

    public static c c() {
        c cVar = c.d;
        nyk a = oyk.a("default", "default");
        PlaybackScope v = d.v();
        String str = Card.ALBUM.name;
        Assertions.assertNonNull(v, "build(): scope is not set");
        Assertions.assertNonNull(a, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(v, a, str);
    }

    public static c d() {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        a aVar = PlaybackScope.a;
        String str = Card.TRACK.name;
        Assertions.assertNonNull(aVar, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (nykVar == null) {
            nykVar = nyk.d;
        }
        if (str == null) {
            str = "";
        }
        return new c(aVar, nykVar, str);
    }
}
