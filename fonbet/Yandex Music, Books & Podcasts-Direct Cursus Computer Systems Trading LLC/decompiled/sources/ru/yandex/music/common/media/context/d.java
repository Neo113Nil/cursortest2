package ru.yandex.music.common.media.context;

import com.yandex.pulse.metrics.o;
import defpackage.b6e;
import defpackage.c01;
import defpackage.cvl;
import defpackage.cyt;
import defpackage.dyt;
import defpackage.eyt;
import defpackage.fyt;
import defpackage.ivf;
import defpackage.myk;
import defpackage.nrf;
import defpackage.qyt;
import defpackage.ryt;
import defpackage.syt;
import defpackage.u51;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d {
    public static PlaybackScope a() {
        return new FixedCardPlaybackScope(Page.HOME, Card.ALBUM);
    }

    public static PlaybackScope b(String str, String str2) {
        return new AlbumPlaybackScope(Page.ALBUM, str, str2);
    }

    public static PlaybackScope c() {
        return new FixedCardPlaybackScope(Page.HOME, Card.ARTIST);
    }

    public static PlaybackScope d(c01 c01Var) {
        return new ArtistPlaybackScope(Page.ARTIST, c01Var);
    }

    public static PlaybackScope e(u51 u51Var) {
        return new ArtistPlaybackScope(Page.ARTIST, u51Var);
    }

    public static PlaybackScope f(String str, String str2) {
        return new ArtistPlaybackScope(Page.ARTIST, str, str2);
    }

    public static PlaybackScope g() {
        return new FixedCardPlaybackScope(Page.ARTIST, Card.ARTIST_PICK);
    }

    public static PlaybackScope h(cvl cvlVar) {
        return new ChartPlaybackScope(cvlVar.e(), cvlVar.b);
    }

    public static PlaybackScope i() {
        return new FixedCardPlaybackScope(Page.HOME, Card.CHART);
    }

    public static h j() {
        return new h(Page.OWN_TRACKS);
    }

    public static h k() {
        return new h(Page.DOWNLOADS_AUDIOBOOKS);
    }

    public static h l() {
        return new h(Page.DOWNLOADS_KIDS);
    }

    public static h m() {
        return new h(Page.DOWNLOADS_PODCASTS);
    }

    public static PlaybackScope n() {
        return new FixedCardPlaybackScope(Page.FAMILIAR_YOU_COLLECTION, Card.DEFAULT);
    }

    public static PlaybackScope o() {
        return new FixedCardPlaybackScope(Page.FAMILIAR_YOU_WAVE, Card.DEFAULT);
    }

    public static CardPlaybackScope p(nrf nrfVar) {
        return new CardPlaybackScope(Page.HOME, "discovery_block-" + nrfVar.a.toLowerCase(Locale.US));
    }

    public static h q() {
        return new h(Page.MUSIC_HISTORY);
    }

    public static PlaybackScope r() {
        return new FixedCardPlaybackScope(Page.MUSIC_HISTORY, Card.MUSIC_HISTORY_SHUFFLE);
    }

    public static PlaybackScope s() {
        return new FixedCardPlaybackScope(Page.MUSIC_HISTORY, Card.MUSIC_HISTORY_SEARCH);
    }

    public static PlaybackScope t() {
        return new FixedCardPlaybackScope(Page.HOME, Card.PLAYLIST);
    }

    public static PlaybackScope u(cvl cvlVar) {
        return new PlaylistPlaybackScope(ivf.I(cvlVar) ? Page.OWN_PLAYLISTS : Page.USER_PLAYLIST, cvlVar);
    }

    public static PlaybackScope v() {
        return new FixedCardPlaybackScope(Page.HOME, Card.PODCASTS);
    }

    public static h w() {
        return new h(Page.OWN_TRACKS);
    }

    public static CardPlaybackScope x(String str) {
        return new CardPlaybackScope(Page.HOME, "discovery_block-" + str.replaceAll("-", "_").toLowerCase(Locale.US));
    }

    public static final fyt y(c cVar) {
        cVar.getClass();
        switch (myk.a[cVar.a.k().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return syt.a;
            case 6:
                return new qyt("", null);
            case 7:
                String str = cVar.c;
                if (Intrinsics.d(str, Card.MUSIC_HISTORY_SEARCH.name)) {
                    return dyt.a;
                }
                if (Intrinsics.d(str, Card.MUSIC_HISTORY_SHUFFLE.name)) {
                    return eyt.a;
                }
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return cyt.a;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
            case 29:
            case 30:
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
            case 32:
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                break;
            default:
                b6e.s();
                return null;
        }
        return ryt.a;
    }
}
