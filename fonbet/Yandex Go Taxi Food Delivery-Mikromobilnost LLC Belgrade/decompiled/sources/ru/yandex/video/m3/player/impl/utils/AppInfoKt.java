package ru.yandex.video.m3.player.impl.utils;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.utils.AppInfo;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "applicationId", "appVersionName", "", "appVersionCode", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/utils/AppInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "AppInfo", "(Ljava/lang/String;Ljava/lang/String;JLtls;)Lru/yandex/video/m3/player/impl/utils/AppInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppInfoKt {
    public static final /* synthetic */ AppInfo AppInfo(String str, String str2, long j, tls tlsVar) {
        AppInfo.Builder builder = new AppInfo.Builder(str, str2, j);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ AppInfo AppInfo$default(String str, String str2, long j, tls tlsVar, int i, Object obj) {
        if ((i & 8) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.utils.AppInfoKt$AppInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AppInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AppInfo.Builder builder) {
                }
            };
        }
        return AppInfo(str, str2, j, tlsVar);
    }
}
