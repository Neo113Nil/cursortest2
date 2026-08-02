package ru.yandex.video.m3;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.j73;
import defpackage.jxi;
import defpackage.npg;
import defpackage.pb7;
import defpackage.tcc;
import defpackage.w610;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;
import kotlin.text.Regex;
import ru.yandex.video.m3.player.impl.tracking.QueryParam;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0017¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/YandexCacheKeyFactory;", "Lpb7;", "", "ignoreQueryParametersAndFragments", "discardHostAndHostSignature", "discardTimestampInUrl", "<init>", "(ZZZ)V", "()V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "removeNonEssentialQueryParameters", "(Landroid/net/Uri;)Landroid/net/Uri;", "sortQueryParameters", "removeVsid", "Lnpg;", "dataSpec", "", "buildCacheKey", "(Lnpg;)Ljava/lang/String;", "Z", "Lkotlin/text/Regex;", "signTillNextPartRegex", "Lkotlin/text/Regex;", "justSignRegex", "Ljava/util/regex/Pattern;", "timestampRegex", "Ljava/util/regex/Pattern;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexCacheKeyFactory implements pb7 {
    private static final List<String> nonEssentialQueryParameter;
    private final boolean discardHostAndHostSignature;
    private final boolean discardTimestampInUrl;
    private final boolean ignoreQueryParametersAndFragments;
    private final Regex justSignRegex;
    private final Regex signTillNextPartRegex;
    private final Pattern timestampRegex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> queryParamsStopList = j73.f0(new String[]{"vsid", "vpuid", "video_content_id", "video_width", "video_height", "initial_bandwidth", "mburl", "bufsize"});

    static {
        List<QueryParam> values = UriQueryParameters.INSTANCE.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((QueryParam) obj).getIsEssentialForCacheKey()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((QueryParam) it.next()).getName());
        }
        nonEssentialQueryParameter = arrayList2;
    }

    public YandexCacheKeyFactory(boolean z, boolean z2, boolean z3) {
        this.ignoreQueryParametersAndFragments = z;
        this.discardHostAndHostSignature = z2;
        this.discardTimestampInUrl = z3;
        this.signTillNextPartRegex = new Regex("ysign[^/]*/");
        this.justSignRegex = new Regex("ysign[^,]*,");
        this.timestampRegex = new Regex(",ts=[^,/]*(?=[,/])").getNativePattern();
    }

    private final Uri removeNonEssentialQueryParameters(Uri uri) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!nonEssentialQueryParameter.contains(str)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build();
    }

    private final Uri removeVsid(Uri uri) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!queryParamsStopList.contains(str)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build();
    }

    private final Uri sortQueryParameters(Uri uri) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : a.w0(uri.getQueryParameterNames())) {
            clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
        }
        return clearQuery.build();
    }

    @Override // defpackage.pb7
    public String buildCacheKey(npg dataSpec) {
        d6w b;
        boolean z = this.ignoreQueryParametersAndFragments;
        Uri uri = dataSpec.a;
        Uri sortQueryParameters = z ? sortQueryParameters(removeNonEssentialQueryParameters(uri)) : removeVsid(uri);
        String uri2 = sortQueryParameters.toString();
        if (this.discardHostAndHostSignature && !evu0.y(uri2, "mpd", false) && !evu0.y(uri2, "m3u8", false)) {
            for (w610 w610Var : a.q0(b.s(Regex.c(this.signTillNextPartRegex, uri2)))) {
                if (evu0.y(w610Var.a.group(), "lid", false)) {
                    d6w b2 = w610Var.b();
                    uri2 = evu0.R(b2.a, b2.b + 1, uri2).toString();
                } else {
                    String group = w610Var.a.group();
                    w610 b3 = this.justSignRegex.b(group);
                    if (b3 != null && (b = b3.b()) != null) {
                        group = evu0.R(b.a, b.b + 1, group).toString();
                    }
                    d6w b4 = w610Var.b();
                    uri2 = evu0.U(b4.a, b4.b + 1, uri2, group).toString();
                }
            }
            uri2 = evu0.Q(sortQueryParameters.getScheme() + "://" + sortQueryParameters.getHost(), uri2);
        }
        return this.discardTimestampInUrl ? this.timestampRegex.matcher(uri2).replaceAll("") : uri2;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/YandexCacheKeyFactory$Companion;", "", "()V", "nonEssentialQueryParameter", "", "", "getNonEssentialQueryParameter$annotations", "queryParamsStopList", "", "getQueryParamsStopList$annotations", "getQueryParamsStopList", "()Ljava/util/Set;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getNonEssentialQueryParameter$annotations() {
        }

        @jxi
        public static /* synthetic */ void getQueryParamsStopList$annotations() {
        }

        public final Set<String> getQueryParamsStopList() {
            return YandexCacheKeyFactory.queryParamsStopList;
        }

        private Companion() {
        }
    }

    @jxi
    public YandexCacheKeyFactory() {
        this(true, true, true);
    }
}
