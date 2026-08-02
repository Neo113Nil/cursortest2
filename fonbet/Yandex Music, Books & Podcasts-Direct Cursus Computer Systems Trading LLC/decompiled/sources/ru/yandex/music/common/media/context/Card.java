package ru.yandex.music.common.media.context;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
@Deprecated
/* loaded from: classes5.dex */
enum Card {
    TRACK("track"),
    ARTIST("artist"),
    ARTIST_PICK("artist_pick"),
    ALBUM("album"),
    PLAYLIST("playlist"),
    PODCASTS("non-music_main_podcasts"),
    CHART("chart"),
    DEFAULT("default"),
    MUSIC_HISTORY_SHUFFLE("shuffle"),
    MUSIC_HISTORY_SEARCH("search_results"),
    TRAILER("trailer");


    @NonNull
    public final String name;

    Card(@NonNull String str) {
        this.name = str;
    }
}
