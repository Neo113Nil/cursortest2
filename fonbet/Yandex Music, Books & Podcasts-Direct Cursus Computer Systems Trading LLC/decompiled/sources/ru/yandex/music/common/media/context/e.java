package ru.yandex.music.common.media.context;

import defpackage.aab;
import defpackage.b6e;
import defpackage.cvl;
import defpackage.eul;
import defpackage.fm1;
import defpackage.ivf;
import defpackage.l20;
import defpackage.l3q;
import defpackage.lt;
import defpackage.mqs;
import defpackage.nyk;
import defpackage.o3m;
import defpackage.oq;
import defpackage.oyk;
import defpackage.p3q;
import defpackage.u1t;
import defpackage.u51;
import defpackage.v68;
import defpackage.ybb;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class e {
    public static c a(PlaybackScope playbackScope, oq oqVar) {
        playbackScope.getClass();
        oqVar.getClass();
        return playbackScope.b(oqVar);
    }

    public static c b(PlaybackScope playbackScope, l3q l3qVar) {
        c cVar = c.d;
        String str = l3qVar.a.a;
        String str2 = l3qVar.b.a;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.ARTIST, str, str2);
        String str3 = Card.ARTIST.name;
        Assertions.assertNonNull(playbackScope, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str3, "build(): card is not set");
        if (str3 == null) {
            str3 = "";
        }
        return new c(playbackScope, nykVar2, str3);
    }

    public static c c() {
        c cVar = c.d;
        nyk nykVar = new nyk(PlaybackContextName.COMMON, null, null);
        a aVar = PlaybackScope.a;
        String str = Card.DEFAULT.name;
        Assertions.assertNonNull(aVar, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(aVar, nykVar, str);
    }

    public static c d(h hVar, aab aabVar) {
        if (aabVar instanceof lt) {
            return hVar.c((lt) aabVar);
        }
        if (aabVar instanceof u51) {
            return hVar.e((u51) aabVar);
        }
        if (aabVar instanceof eul) {
            return hVar.f((eul) aabVar);
        }
        b6e.s();
        return null;
    }

    public static c e(v68 v68Var) {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.GLAGOL, v68Var.getDeviceId(), v68Var.getName());
        a aVar = PlaybackScope.a;
        String str = Card.DEFAULT.name;
        Assertions.assertNonNull(aVar, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(aVar, nykVar2, str);
    }

    public static c f(PlaybackScope playbackScope, cvl cvlVar) {
        playbackScope.getClass();
        cvlVar.getClass();
        return playbackScope.g(cvlVar, ivf.I(cvlVar));
    }

    public static c g(PlaybackScope playbackScope, p3q p3qVar) {
        playbackScope.getClass();
        c cVar = c.d;
        String id = p3qVar.a.getId();
        String str = p3qVar.c.a;
        nyk nykVar = oyk.a;
        nyk nykVar2 = new nyk(PlaybackContextName.PLAYLIST, id, str);
        String str2 = Card.PLAYLIST.name;
        Assertions.assertNonNull(playbackScope, "build(): scope is not set");
        Assertions.assertNonNull(nykVar2, "build(): info is not set");
        Assertions.assertNonNull(str2, "build(): card is not set");
        if (str2 == null) {
            str2 = "";
        }
        return new c(playbackScope, nykVar2, str2);
    }

    public static c h(PlaybackScope playbackScope) {
        playbackScope.getClass();
        return playbackScope.h();
    }

    public static c i(h hVar, mqs mqsVar) {
        mqsVar.getClass();
        c cVar = c.d;
        nyk nykVar = new nyk(PlaybackContextName.COMMON, mqsVar.a, mqsVar.c);
        String str = Card.TRACK.name;
        Assertions.assertNonNull(hVar, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(hVar, nykVar, str);
    }

    public static c j(ybb ybbVar) {
        FixedCardPlaybackScope fixedCardPlaybackScope;
        nyk nykVar;
        ybbVar.getClass();
        boolean z = ybbVar instanceof l20;
        if (z) {
            fixedCardPlaybackScope = new FixedCardPlaybackScope(Page.ALBUM, Card.TRAILER);
        } else if (ybbVar instanceof fm1) {
            fixedCardPlaybackScope = new FixedCardPlaybackScope(Page.ARTIST, Card.TRAILER);
        } else if (ybbVar instanceof o3m) {
            fixedCardPlaybackScope = new FixedCardPlaybackScope(Page.PLAYLIST, Card.TRAILER);
        } else {
            if (!(ybbVar instanceof u1t)) {
                b6e.s();
                return null;
            }
            fixedCardPlaybackScope = new FixedCardPlaybackScope(Page.TRACK, Card.TRAILER);
        }
        if (z) {
            lt ltVar = ((l20) ybbVar).b;
            nyk nykVar2 = oyk.a;
            nykVar = oyk.a(ltVar.a, ltVar.c);
        } else if (ybbVar instanceof o3m) {
            eul eulVar = ((o3m) ybbVar).b;
            nyk nykVar3 = oyk.a;
            nykVar = new nyk(PlaybackContextName.PLAYLIST, eulVar.f, eulVar.c);
        } else if (ybbVar instanceof u1t) {
            nykVar = oyk.a;
        } else {
            if (!(ybbVar instanceof fm1)) {
                b6e.s();
                return null;
            }
            u51 u51Var = ((fm1) ybbVar).b;
            String str = u51Var.a;
            String str2 = u51Var.b;
            nyk nykVar4 = oyk.a;
            nykVar = new nyk(PlaybackContextName.ARTIST, str, str2);
        }
        nykVar.getClass();
        c cVar = c.d;
        String str3 = Card.TRAILER.name;
        Assertions.assertNonNull(fixedCardPlaybackScope, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str3, "build(): card is not set");
        if (str3 == null) {
            str3 = "";
        }
        return new c(fixedCardPlaybackScope, nykVar, str3);
    }
}
