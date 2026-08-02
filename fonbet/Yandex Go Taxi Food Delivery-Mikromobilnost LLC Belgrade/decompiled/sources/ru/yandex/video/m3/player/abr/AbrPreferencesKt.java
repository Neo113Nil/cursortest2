package ru.yandex.video.m3.player.abr;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toLogAbrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "Lru/yandex/video/m3/player/abr/AbrPreferences;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbrPreferencesKt {
    public static final ru.yandex.video.m3.player.AbrPreferences toLogAbrPreferences(AbrPreferences abrPreferences) {
        return ru.yandex.video.m3.player.AbrPreferencesKt.AbrPreferences$default(abrPreferences.getDefaultQuality(), Boolean.valueOf(abrPreferences.getAesthetePreferenceProvider().getPreferHD()), abrPreferences.getUserQualityRepository().getLastUserSelectedVideoHeightPx(), abrPreferences.getExperimentalShouldConsiderSelectedUserQuality(), null, 16, null);
    }
}
