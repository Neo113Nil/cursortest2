package ru.yandex.video.m3.player.tracks;

import defpackage.evu0;
import defpackage.rza;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/tracks/DefaultPlayerTrackNameProvider;", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "resourceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "(Lru/yandex/video/m3/player/utils/ResourceProvider;)V", "getAdaptiveTrackName", "", "getDisabledTrackName", "getOtherTrackName", "format", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DefaultPlayerTrackNameProvider implements PlayerTrackNameProvider {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    public DefaultPlayerTrackNameProvider(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getAdaptiveTrackName() {
        return this.resourceProvider.getString(R.string.player_adaptive_track);
    }

    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    public String getDisabledTrackName() {
        return this.resourceProvider.getString(R.string.player_disable_track);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        if ("und".equals(r0) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 != null) goto L44;
     */
    @Override // ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getOtherTrackName(TrackFormat format) {
        Locale forLanguageTag;
        String label = format.getLabel();
        String str = null;
        if (label != null) {
            if (evu0.J(label)) {
                label = null;
            }
        }
        String language = format.getLanguage();
        if (language != null) {
            if (evu0.J(language)) {
                language = null;
            }
            if (language != null) {
                if ("und".equals(language)) {
                    language = null;
                }
                if (language != null && (forLanguageTag = Locale.forLanguageTag(language)) != null && (label = forLanguageTag.getDisplayLanguage(new Locale(ClearCryptoProPrefs.COUNTRY))) != null) {
                    if (evu0.J(label)) {
                        label = null;
                    }
                    if (label != null) {
                    }
                }
            }
        }
        label = null;
        if (label == null) {
            String language2 = format.getLanguage();
            if (language2 != null && !evu0.J(language2)) {
                str = language2;
            }
            label = str == null ? this.resourceProvider.getString(R.string.player_undefined_track) : str;
        }
        if (label.length() <= 0) {
            return label;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = label.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? rza.c(charAt, Locale.ROOT) : String.valueOf(charAt)));
        sb.append(label.substring(1));
        return sb.toString();
    }
}
