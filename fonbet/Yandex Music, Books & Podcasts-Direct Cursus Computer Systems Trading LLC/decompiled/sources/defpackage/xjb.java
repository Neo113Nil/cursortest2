package defpackage;

import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes3.dex */
public enum xjb {
    SoundQuality("sound_quality"),
    Offline(UgcLiveVideoData$UgcLiveStatus.OFFLINE),
    Crossfade("crossfade"),
    Explicit("explicit"),
    KidsTab("kids_tab"),
    /* JADX INFO: Fake field, exist only in values array */
    Theme("theme"),
    AddTracksToEndOfPlaylist("add_tracks_to_end_of_playlist"),
    NotifyAboutNewReleases("notify_about_new_releases"),
    ShowVideo("show_video"),
    AutoCache("auto_cache"),
    AutoCacheSize("auto_cache_size"),
    GlagolStation("glagol_station"),
    /* JADX INFO: Fake field, exist only in values array */
    ClearMemory("clear_memory"),
    Repeat("repeat"),
    Shake("shake"),
    Shuffle("shuffle"),
    ShowLyrics("show_lyrics"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowQueue("show_queue"),
    /* JADX INFO: Fake field, exist only in values array */
    Equalizer("equalizer"),
    PlayingSpeed("playing_speed"),
    Autoplay("autoplay"),
    VolumeLevel("volume_level"),
    /* JADX INFO: Fake field, exist only in values array */
    Bitrate("bitrate");

    public final String a;

    xjb(String str) {
        this.a = str;
    }
}
