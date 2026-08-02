package ru.yandex.music.common.media.context;

import defpackage.c01;
import defpackage.cvl;
import defpackage.nyk;
import defpackage.oq;
import defpackage.oyk;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public final class a extends PlaybackScope {
    private static final long serialVersionUID = 1;

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c b(oq oqVar) {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        nyk a = oyk.a(oqVar.a, oqVar.b);
        h hVar = new h(Page.ALBUM);
        String str = Card.ALBUM.name;
        Assertions.assertNonNull(hVar, "build(): scope is not set");
        Assertions.assertNonNull(a, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(hVar, a, str);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c d(c01 c01Var) {
        c cVar = c.d;
        nyk b = oyk.b(c01Var);
        String str = Card.ARTIST.name;
        h hVar = new h(Page.ARTIST);
        Assertions.assertNonNull(hVar, "build(): scope is not set");
        Assertions.assertNonNull(b, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(hVar, b, str);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c g(cvl cvlVar, boolean z) {
        c cVar = c.d;
        nyk c = oyk.c(cvlVar);
        h hVar = new h(z ? Page.OWN_PLAYLISTS : Page.USER_PLAYLIST);
        String str = Card.PLAYLIST.name;
        Assertions.assertNonNull(hVar, "build(): scope is not set");
        Assertions.assertNonNull(c, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (str == null) {
            str = "";
        }
        return new c(hVar, c, str);
    }

    @Override // ru.yandex.music.common.media.context.PlaybackScope
    public final c h() {
        c cVar = c.d;
        nyk nykVar = oyk.a;
        h hVar = new h(Page.DEFAULT);
        String str = Card.TRACK.name;
        Assertions.assertNonNull(hVar, "build(): scope is not set");
        Assertions.assertNonNull(nykVar, "build(): info is not set");
        Assertions.assertNonNull(str, "build(): card is not set");
        if (nykVar == null) {
            nykVar = nyk.d;
        }
        if (str == null) {
            str = "";
        }
        return new c(hVar, nykVar, str);
    }
}
