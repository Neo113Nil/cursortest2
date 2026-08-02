package ru.yandex.video.m3.player.tracking;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.video.m3.player.tracking.LoadError;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, LaunchBrowserActivity.KEY_URI, "", "loadDurationMs", "bytesLoaded", "exceptionName", "exceptionMessage", "", "exceptionCode", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/LoadError$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/tracking/LoadError;", "LoadError", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltls;)Lru/yandex/video/m3/player/tracking/LoadError;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadErrorKt {
    public static final /* synthetic */ LoadError LoadError(String str, String str2, long j, long j2, String str3, String str4, Integer num, tls tlsVar) {
        LoadError.Builder builder = new LoadError.Builder(str, str2, j, j2, str3, str4, num);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
