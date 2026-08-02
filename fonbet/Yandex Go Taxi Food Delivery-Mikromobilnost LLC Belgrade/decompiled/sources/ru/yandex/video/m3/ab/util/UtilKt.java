package ru.yandex.video.m3.ab.util;

import android.app.Application;
import android.content.Context;
import defpackage.acx;
import defpackage.jl40;
import defpackage.sbx;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "context", "", "isMainProcess", "(Landroid/content/Context;)Z", "", "getProcessName", "(Landroid/content/Context;)Ljava/lang/String;", "Lsbx;", "providePlayerAbExpsJson", "(Lsbx;)Lsbx;", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager;", "vsid", "Lru/yandex/video/m3/ab/config/AbConfig;", "getConfigOrDefault", "(Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager;Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfig;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final AbConfig getConfigOrDefault(YandexPlayerAbConfigManager yandexPlayerAbConfigManager, String str) {
        AbConfig config$video_player_internalRelease;
        return (yandexPlayerAbConfigManager == null || (config$video_player_internalRelease = yandexPlayerAbConfigManager.getConfig$video_player_internalRelease(str)) == null) ? AbConfig.INSTANCE.getDEFAULT$video_player_internalRelease() : config$video_player_internalRelease;
    }

    private static final String getProcessName(Context context) {
        return Application.getProcessName();
    }

    public static final boolean isMainProcess(Context context) {
        return jl40.l(context.getApplicationContext().getPackageName(), getProcessName(context));
    }

    public static final sbx providePlayerAbExpsJson(sbx sbxVar) {
        return tje.a(sbxVar, new tls() { // from class: ru.yandex.video.m3.ab.util.UtilKt$providePlayerAbExpsJson$1
            public final void invoke(acx acxVar) {
                acxVar.c = true;
                acxVar.g = true;
                acxVar.a = true;
                acxVar.b = false;
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((acx) obj);
                return zy11.a;
            }
        });
    }
}
