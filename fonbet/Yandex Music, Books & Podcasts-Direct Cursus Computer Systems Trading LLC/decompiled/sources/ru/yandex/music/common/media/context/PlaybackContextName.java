package ru.yandex.music.common.media.context;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes5.dex */
public enum PlaybackContextName {
    ARTIST("artist"),
    ALBUM("album"),
    PLAYLIST("playlist"),
    FEED("feed"),
    RADIO("radio"),
    VIDEO_WAVE("video_wave"),
    GENERATIVE("generative"),
    GLAGOL("glagol"),
    YNISON("ynison"),
    SEARCH("search"),
    COMMON("common"),
    UNKNOWN("");


    @NonNull
    public final String name;

    PlaybackContextName(@NonNull String str) {
        this.name = str;
    }
}
