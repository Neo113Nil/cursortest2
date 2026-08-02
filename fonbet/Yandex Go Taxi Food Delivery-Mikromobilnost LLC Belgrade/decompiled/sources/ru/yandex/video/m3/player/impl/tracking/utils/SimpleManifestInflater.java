package ru.yandex.video.m3.player.impl.tracking.utils;

import android.net.Uri;
import defpackage.i3y;
import defpackage.j73;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.sls;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J+\u0010\u0018\u001a\u00020\u0017*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/utils/SimpleManifestInflater;", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "", "shouldReplaceExistingQueryValues", "<init>", "(Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Z)V", "", "vsid", "manifestUrl", "", "sourceIndex", "tryInflateWithHttpUrlOrNull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "tryInflateWithUriOrThrow", "Landroid/net/Uri$Builder;", "Landroid/net/Uri;", "oldUri", "queryName", "queryValue", "Lzy11;", "appendQueryParameter", "(Landroid/net/Uri$Builder;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "contentId", "", "startPosition", "autoPlay", "isOffline", "inflateManifestUrl", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;JZIZ)Ljava/lang/String;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimpleManifestInflater implements ManifestUrlInflater {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final i3y replaceableQueries$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.utils.SimpleManifestInflater$Companion$replaceableQueries$2
        @Override // defpackage.sls
        public final Set<String> invoke() {
            UriQueryParameters uriQueryParameters = UriQueryParameters.INSTANCE;
            return j73.f0(new String[]{uriQueryParameters.get(20).getName(), uriQueryParameters.get(15).getName(), uriQueryParameters.get(13).getName(), uriQueryParameters.get(19).getName()});
        }
    });
    private final InfoProvider infoProvider;
    private final boolean shouldReplaceExistingQueryValues;
    private final TimeProvider timeProvider;

    public SimpleManifestInflater(InfoProvider infoProvider, TimeProvider timeProvider, boolean z) {
        this.infoProvider = infoProvider;
        this.timeProvider = timeProvider;
        this.shouldReplaceExistingQueryValues = z;
    }

    private final void appendQueryParameter(Uri.Builder builder, Uri uri, String str, String str2) {
        if (this.shouldReplaceExistingQueryValues) {
            builder.appendQueryParameter(str, str2);
        } else if (uri.getQueryParameter(str) == null) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private final String tryInflateWithHttpUrlOrNull(String vsid, String manifestUrl, Integer sourceIndex) {
        Object failure;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, manifestUrl);
            kwu e = jwuVar.e();
            jwu g = e.g();
            String vpuid = this.infoProvider.getVpuid();
            if (this.shouldReplaceExistingQueryValues) {
                tryInflateWithHttpUrlOrNull$setVsid(g, vsid);
                tryInflateWithHttpUrlOrNull$setTimestamp(g, this.timeProvider.currentTimeMillis());
                if (sourceIndex != null) {
                    tryInflateWithHttpUrlOrNull$setSourceIndex(g, sourceIndex.intValue());
                }
                if (vpuid != null) {
                    tryInflateWithHttpUrlOrNull$setVpuid(g, vpuid);
                }
            } else {
                Set j = e.j();
                UriQueryParameters uriQueryParameters = UriQueryParameters.INSTANCE;
                if (!j.contains(uriQueryParameters.get(20).getName())) {
                    tryInflateWithHttpUrlOrNull$setVsid(g, vsid);
                }
                if (!j.contains(uriQueryParameters.get(15).getName())) {
                    tryInflateWithHttpUrlOrNull$setTimestamp(g, this.timeProvider.currentTimeMillis());
                }
                if (!j.contains(uriQueryParameters.get(13).getName()) && sourceIndex != null) {
                    tryInflateWithHttpUrlOrNull$setSourceIndex(g, sourceIndex.intValue());
                }
                if (!j.contains(uriQueryParameters.get(19).getName()) && vpuid != null) {
                    tryInflateWithHttpUrlOrNull$setVpuid(g, vpuid);
                }
            }
            failure = g.e().i;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    private static final void tryInflateWithHttpUrlOrNull$setSourceIndex(jwu jwuVar, int i) {
        jwuVar.p(UriQueryParameters.INSTANCE.get(13).getName(), String.valueOf(i));
    }

    private static final void tryInflateWithHttpUrlOrNull$setTimestamp(jwu jwuVar, long j) {
        jwuVar.p(UriQueryParameters.INSTANCE.get(15).getName(), String.valueOf(j));
    }

    private static final void tryInflateWithHttpUrlOrNull$setVpuid(jwu jwuVar, String str) {
        jwuVar.p(UriQueryParameters.INSTANCE.get(19).getName(), str);
    }

    private static final void tryInflateWithHttpUrlOrNull$setVsid(jwu jwuVar, String str) {
        jwuVar.p(UriQueryParameters.INSTANCE.get(20).getName(), str);
    }

    private final String tryInflateWithUriOrThrow(String vsid, String manifestUrl, Integer sourceIndex) {
        Uri parse = Uri.parse(manifestUrl);
        String vpuid = this.infoProvider.getVpuid();
        Uri.Builder buildUpon = parse.buildUpon();
        if (this.shouldReplaceExistingQueryValues) {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                if (!Companion.getReplaceableQueries().contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<Pair> arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (String str : arrayList) {
                arrayList2.add(new Pair(str, parse.getQueryParameter(str)));
            }
            buildUpon.clearQuery();
            for (Pair pair : arrayList2) {
                buildUpon.appendQueryParameter((String) pair.c(), (String) pair.f());
            }
            UriQueryParameters uriQueryParameters = UriQueryParameters.INSTANCE;
            buildUpon.appendQueryParameter(uriQueryParameters.get(20).getName(), vsid);
            buildUpon.appendQueryParameter(uriQueryParameters.get(15).getName(), String.valueOf(this.timeProvider.currentTimeMillis()));
            buildUpon.appendQueryParameter(uriQueryParameters.get(13).getName(), String.valueOf(sourceIndex));
            if (vpuid != null) {
                buildUpon.appendQueryParameter(uriQueryParameters.get(19).getName(), vpuid);
            }
        } else {
            UriQueryParameters uriQueryParameters2 = UriQueryParameters.INSTANCE;
            appendQueryParameter(buildUpon, parse, uriQueryParameters2.get(20).getName(), vsid);
            appendQueryParameter(buildUpon, parse, uriQueryParameters2.get(15).getName(), String.valueOf(this.timeProvider.currentTimeMillis()));
            appendQueryParameter(buildUpon, parse, uriQueryParameters2.get(13).getName(), String.valueOf(sourceIndex));
            if (vpuid != null) {
                appendQueryParameter(buildUpon, parse, uriQueryParameters2.get(19).getName(), vpuid);
            }
        }
        return buildUpon.build().toString();
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater
    public String inflateManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline) {
        Integer valueOf;
        Object failure;
        if (sourceIndex == -1) {
            valueOf = null;
        } else {
            try {
                valueOf = Integer.valueOf(sourceIndex);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        }
        failure = tryInflateWithHttpUrlOrNull(vsid, videoData.getManifestUrl(), valueOf);
        if (failure == null) {
            failure = tryInflateWithUriOrThrow(vsid, videoData.getManifestUrl(), valueOf);
        }
        Object manifestUrl = videoData.getManifestUrl();
        if (failure instanceof Result.Failure) {
            failure = manifestUrl;
        }
        return (String) failure;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/utils/SimpleManifestInflater$Companion;", "", "<init>", "()V", "", "", "replaceableQueries$delegate", "Li3y;", "getReplaceableQueries", "()Ljava/util/Set;", "replaceableQueries", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> getReplaceableQueries() {
            return (Set) SimpleManifestInflater.replaceableQueries$delegate.getValue();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SimpleManifestInflater(InfoProvider infoProvider, TimeProvider timeProvider, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(infoProvider, timeProvider, (i & 4) != 0 ? false : z);
    }
}
