package ru.yandex.video.m3.player.impl.utils;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.h5z0;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.MediaSourceListener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/UrlModifierHelper;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UrlModifierHelper {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\"\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/UrlModifierHelper$Companion;", "", "()V", "addOrUpdateQueryParameter", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "queryName", "", "queryValue", "url", "addOrUpdateVsid", "targetVsid", "changeVsid", "mediaSourceListener", "Lru/yandex/video/m3/player/MediaSourceListener;", "getVsid", "Lkotlin/Pair;", "removeQueryParameter", "removeVsid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String changeVsid(Uri uri, String targetVsid, MediaSourceListener mediaSourceListener) {
            String queryParameter = uri.getQueryParameter("vsid");
            if (queryParameter == null) {
                return uri.toString();
            }
            if (!queryParameter.equals(targetVsid) && mediaSourceListener != null) {
                mediaSourceListener.onVsidChanged(queryParameter, targetVsid);
            }
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            for (String str : uri.getQueryParameterNames()) {
                if (jl40.l(str, "vsid")) {
                    clearQuery.appendQueryParameter("vsid", targetVsid);
                } else {
                    clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
            return clearQuery.toString();
        }

        public final Uri addOrUpdateQueryParameter(Uri uri, String queryName, String queryValue) {
            Uri.Builder buildUpon = uri.buildUpon();
            if (uri.getQueryParameter(queryName) != null) {
                buildUpon.clearQuery();
                for (String str : uri.getQueryParameterNames()) {
                    if (!jl40.l(str, queryName)) {
                        buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                    }
                }
            }
            buildUpon.appendQueryParameter(queryName, queryValue);
            return buildUpon.build();
        }

        public final String addOrUpdateVsid(String url, String targetVsid) {
            Pair<Uri, String> vsid = getVsid(url);
            if (vsid == null) {
                return url;
            }
            Uri uri = (Uri) vsid.getFirst();
            return ((String) vsid.getSecond()) != null ? changeVsid(uri, targetVsid, (MediaSourceListener) null) : uri.buildUpon().appendQueryParameter("vsid", targetVsid).toString();
        }

        public final Pair<Uri, String> getVsid(String url) {
            try {
                Uri parse = Uri.parse(url);
                return new Pair<>(parse, parse.getQueryParameter("vsid"));
            } catch (Throwable th) {
                h5z0.a.f(th, "vsid parsing error", new Object[0]);
                return null;
            }
        }

        public final Uri removeQueryParameter(Uri uri, String queryName) {
            Uri.Builder buildUpon = uri.buildUpon();
            if (uri.getQueryParameter(queryName) != null) {
                buildUpon.clearQuery();
                for (String str : uri.getQueryParameterNames()) {
                    if (!jl40.l(str, queryName)) {
                        buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                    }
                }
            }
            return buildUpon.build();
        }

        public final String removeVsid(String url) {
            try {
                Uri parse = Uri.parse(url);
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                for (String str : parse.getQueryParameterNames()) {
                    if (!jl40.l(str, "vsid")) {
                        clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
                    }
                }
                return clearQuery.toString();
            } catch (Exception e) {
                h5z0.a.e(e);
                return url;
            }
        }

        private Companion() {
        }

        public final String addOrUpdateQueryParameter(String url, String queryName, String queryValue) {
            Uri uri;
            try {
                uri = Uri.parse(url);
            } catch (Throwable th) {
                h5z0.a.f(th, "url parsing error ".concat(url), new Object[0]);
                uri = null;
            }
            return uri != null ? addOrUpdateQueryParameter(uri, queryName, queryValue).toString() : url;
        }

        public final String changeVsid(String url, String targetVsid, MediaSourceListener mediaSourceListener) {
            try {
                return changeVsid(Uri.parse(url), targetVsid, mediaSourceListener);
            } catch (Exception e) {
                h5z0.a.e(e);
                return url;
            }
        }
    }
}
