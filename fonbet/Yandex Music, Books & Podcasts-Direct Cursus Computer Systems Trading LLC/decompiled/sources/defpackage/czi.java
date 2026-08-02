package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class czi {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof czi);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.informers_no_network_no_downloads_text) + f1d.a(R.string.informers_no_network_offline_mode_text, f1d.a(R.string.informers_no_network_without_downloads_and_with_auto_cache_text, f1d.a(R.string.informers_no_network_without_downloads_and_auto_cache_text, f1d.a(R.string.informers_no_network_with_downloads_text, f1d.a(R.string.informers_no_network_with_wave_and_downloads_text, Integer.hashCode(R.string.informers_no_network_with_offline_wave_playing_text) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("NetworkBarAboveStringResources(withOfflineWavePlayingRes=", R.string.informers_no_network_with_offline_wave_playing_text, R.string.informers_no_network_with_wave_and_downloads_text, ", withDownloadsAndWaveRes=", ", withDownloadsOnlyRes=");
        hrg.w(R.string.informers_no_network_with_downloads_text, R.string.informers_no_network_without_downloads_and_auto_cache_text, ", withoutDownloadsAndAutoCacheRes=", ", withoutDownloadsAndWithAutoCacheRes=", l);
        hrg.w(R.string.informers_no_network_without_downloads_and_with_auto_cache_text, R.string.informers_no_network_offline_mode_text, ", withOfflineModeRes=", ", blankRes=", l);
        return f1d.i(l, R.string.informers_no_network_no_downloads_text, ")");
    }
}
