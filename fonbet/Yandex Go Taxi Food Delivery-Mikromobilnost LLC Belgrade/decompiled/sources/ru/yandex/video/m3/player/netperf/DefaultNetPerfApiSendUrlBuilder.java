package ru.yandex.video.m3.player.netperf;

import com.adjust.sdk.Constants;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.data.network.UrlParamsKt;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/netperf/DefaultNetPerfApiSendUrlBuilder;", "Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;", "Lru/yandex/video/m3/data/network/UrlParams;", "urlParams", "<init>", "(Lru/yandex/video/m3/data/network/UrlParams;)V", "", "navStart", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lkwu;", "buildUrl", "(JLru/yandex/video/m3/player/impl/utils/TimeProvider;)Lkwu;", "Lru/yandex/video/m3/data/network/UrlParams;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultNetPerfApiSendUrlBuilder implements NetPerfApiSendUrlBuilder {
    public static final int $stable = 0;
    private final UrlParams urlParams;

    public DefaultNetPerfApiSendUrlBuilder(UrlParams urlParams) {
        this.urlParams = urlParams == null ? UrlParamsKt.UrlParams("log.strm.yandex.ru", new tls() { // from class: ru.yandex.video.m3.player.netperf.DefaultNetPerfApiSendUrlBuilder$urlParams$1
            public final void invoke(UrlParams.Builder builder) {
                builder.setScheme(Constants.SCHEME);
                builder.setPathSegments("perf");
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UrlParams.Builder) obj);
                return zy11.a;
            }
        }) : urlParams;
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfApiSendUrlBuilder
    public kwu buildUrl(long navStart, TimeProvider timeProvider) {
        jwu jwuVar = new jwu();
        jwuVar.o(this.urlParams.getScheme());
        jwuVar.h(this.urlParams.getHost());
        jwuVar.b(this.urlParams.getPathSegments());
        jwuVar.d("navstart", String.valueOf(navStart));
        jwuVar.d("perfnow", String.valueOf(timeProvider.currentTimeMillis()));
        return jwuVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultNetPerfApiSendUrlBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DefaultNetPerfApiSendUrlBuilder(UrlParams urlParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlParams);
    }
}
