package ru.yandex.video.m3.player;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/InternalDiUtil;", "", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideYandexPlayerSharedPreferences", "context", "Landroid/content/Context;", "provideYandexPlayerSharedPreferences$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalDiUtil {
    private static volatile SharedPreferences sharedPreferences;
    public static final InternalDiUtil INSTANCE = new InternalDiUtil();
    public static final int $stable = 8;

    private InternalDiUtil() {
    }

    public final SharedPreferences provideYandexPlayerSharedPreferences$video_player_internalRelease(Context context) {
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3 = sharedPreferences;
        if (sharedPreferences3 != null) {
            return sharedPreferences3;
        }
        synchronized (this) {
            sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = context.getApplicationContext().getSharedPreferences("YANDEX_VIDEO_PLAYER_PREFERENCES", 0);
                sharedPreferences = sharedPreferences2;
            }
        }
        return sharedPreferences2;
    }
}
