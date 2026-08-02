package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class mnm {
    public static String a(VideoData videoData) {
        videoData.getClass();
        String manifestUrl = videoData.getManifestUrl();
        manifestUrl.getClass();
        try {
            Uri parse = Uri.parse(manifestUrl);
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str : parse.getQueryParameterNames()) {
                if (!Intrinsics.d(str, "vsid")) {
                    clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
                }
            }
            String builder = clearQuery.toString();
            builder.getClass();
            return builder;
        } catch (Exception e) {
            Timber.INSTANCE.e(e);
            return manifestUrl;
        }
    }
}
