package ru.yandex.video.m3.player.utils;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"getLidFromStringUrl", "", "stringUrl", "getLidFromUri", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataSpecUtilKt {
    public static final String getLidFromStringUrl(String str) {
        Object failure;
        try {
            failure = getLidFromUri(Uri.parse(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static final String getLidFromUri(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            int H = evu0.H(path, "lid=", 0, false, 6);
            Integer valueOf = Integer.valueOf(H);
            if (H < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue() + 4;
                int H2 = evu0.H(path, ",", intValue, false, 4);
                Integer valueOf2 = H2 >= 0 ? Integer.valueOf(H2) : null;
                d6w n = y6i0.n(intValue, valueOf2 != null ? valueOf2.intValue() : path.length());
                return path.substring(n.a, n.b + 1);
            }
        }
        return null;
    }
}
