package ru.yandex.video.m3.player.ui.debug.util;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u0004*\u00060\u0005j\u0002`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"plus", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "other", "toKB", "", "", "Lru/yandex/video/m3/player/ui/debug/util/Bytes;", AppSettingsContract$Setting.COLUMN_PREFIX, "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final SessionColor plus(SessionColor sessionColor, SessionColor sessionColor2) {
        SessionColor sessionColor3 = SessionColor.RED;
        if (sessionColor == sessionColor3 || sessionColor2 == sessionColor3) {
            return sessionColor3;
        }
        SessionColor sessionColor4 = SessionColor.GREEN;
        return (sessionColor == sessionColor4 && sessionColor2 == sessionColor4) ? sessionColor4 : SessionColor.YELLOW;
    }

    public static final String toKB(long j, String str) {
        if (j == 0) {
            return "";
        }
        if (str == null) {
            return String.valueOf(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        }
        StringBuilder v = oyr.v(str, Extension.COLON_SPACE);
        v.append(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        return v.toString();
    }
}
