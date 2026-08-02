package ru.yandex.video.m3.telemetry.datasource;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;", "", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "throwable", "", "loadDurationMs", "bytesLoaded", "Lzy11;", "onLoadError", "(Landroid/net/Uri;Ljava/lang/Throwable;JJ)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataSourceErrorNotifier {
    void onLoadError(Uri uri, Throwable throwable, long loadDurationMs, long bytesLoaded);
}
