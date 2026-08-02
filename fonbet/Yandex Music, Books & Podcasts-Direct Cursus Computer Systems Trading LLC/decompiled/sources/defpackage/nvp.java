package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class nvp {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nvp);
    }

    public final int hashCode() {
        return Integer.hashCode(R.plurals.plural_n_podcast_tracks) + (Integer.hashCode(R.string.unknown_album) * 31);
    }

    public final String toString() {
        return dfi.f("ResConfig(unknownAlbumStringRes=", R.string.unknown_album, R.plurals.plural_n_podcast_tracks, ", pluralTracksPodcastsRes=", ")");
    }
}
