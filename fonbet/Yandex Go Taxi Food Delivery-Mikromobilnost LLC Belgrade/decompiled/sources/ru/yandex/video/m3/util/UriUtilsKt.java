package ru.yandex.video.m3.util;

import android.net.Uri;
import android.util.Log;
import defpackage.evu0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"TAG", "", "fileExtension", "Landroid/net/Uri;", "getFileExtension", "(Landroid/net/Uri;)Ljava/lang/String;", "toUriOrNull", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UriUtilsKt {
    private static final String TAG = "UriUtils";

    public static final String getFileExtension(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return null;
        }
        String e0 = evu0.e0('.', lastPathSegment, "");
        if (e0.length() == 0) {
            e0 = null;
        }
        if (e0 != null) {
            return e0.toLowerCase(Locale.ROOT);
        }
        return null;
    }

    public static final Uri toUriOrNull(String str) {
        Object failure;
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(TAG, "Error while parsing to Uri for string '" + str + '\'', a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Uri) failure;
    }
}
