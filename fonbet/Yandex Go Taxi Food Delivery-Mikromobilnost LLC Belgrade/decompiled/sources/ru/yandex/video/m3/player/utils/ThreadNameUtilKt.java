package ru.yandex.video.m3.player.utils;

import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"getFormatThreadName", "", "name", AppSettingsContract$Setting.COLUMN_PREFIX, "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadNameUtilKt {
    public static final String getFormatThreadName(String str, String str2) {
        return oyr.f(':', str2, str);
    }

    public static /* synthetic */ String getFormatThreadName$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "YP";
        }
        return getFormatThreadName(str, str2);
    }
}
