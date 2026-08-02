package ru.yandex.video.m3.ui.debug.util;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.tls;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0001¨\u0006\u0004"}, d2 = {"bitsToHumanReadable", "", "", "perSeconds", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionsUtilsKt {
    public static final String bitsToHumanReadable(long j) {
        ExtensionsUtilsKt$bitsToHumanReadable$noRounding$1 extensionsUtilsKt$bitsToHumanReadable$noRounding$1 = new tls() { // from class: ru.yandex.video.m3.ui.debug.util.ExtensionsUtilsKt$bitsToHumanReadable$noRounding$1
            public final Double invoke(double d) {
                return Double.valueOf(Math.floor(d * 100.0d) / 100.0d);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        if (j >= 8388608) {
            return String.format(Locale.US, "%.2f MB", Arrays.copyOf(new Object[]{extensionsUtilsKt$bitsToHumanReadable$noRounding$1.invoke(Double.valueOf(j / 8388608.0d))}, 1));
        }
        if (j >= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            return String.format(Locale.US, "%.2f kB", Arrays.copyOf(new Object[]{extensionsUtilsKt$bitsToHumanReadable$noRounding$1.invoke(Double.valueOf(j / 8192.0d))}, 1));
        }
        if (j >= 8) {
            return String.format(Locale.US, "%.2f B", Arrays.copyOf(new Object[]{extensionsUtilsKt$bitsToHumanReadable$noRounding$1.invoke(Double.valueOf(j / 8.0d))}, 1));
        }
        return j + " b";
    }

    public static final String perSeconds(String str) {
        return str.concat("/s");
    }
}
