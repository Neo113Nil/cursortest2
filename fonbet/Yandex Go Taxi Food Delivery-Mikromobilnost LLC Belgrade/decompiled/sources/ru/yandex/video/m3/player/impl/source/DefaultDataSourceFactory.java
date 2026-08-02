package ru.yandex.video.m3.player.impl.source;

import defpackage.aw60;
import defpackage.cj01;
import defpackage.ipg;
import defpackage.jxi;
import defpackage.xf7;
import defpackage.ya7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceConfig;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceConfigKt;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.player.netperf.NetPerfCallFactory;
import ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory;
import ru.yandex.video.m3.source.DataSourceFactory;

@jxi
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultDataSourceFactory;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig;", ConfigConstants.CONFIG, "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig;)V", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "Lzy11;", "setNetPerfEventTrackerFactory", "(Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;)V", "Lcj01;", "transferListener", "Lipg;", "create", "(Lcj01;)Lipg;", "Lokhttp3/OkHttpClient;", "", "className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/netperf/NetPerfCallFactory;", "netPerfCallFactory", "Lru/yandex/video/m3/player/netperf/NetPerfCallFactory;", "", "isNetPerfEnabled", "()Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultDataSourceFactory implements DataSourceFactory, NetPerfMarker {

    @Deprecated
    public static final String ORIGINAL_CLASS_NAME = "DefaultDataSourceFactory";
    private final String className;
    private NetPerfCallFactory netPerfCallFactory;
    private final OkHttpClient okHttpClient;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DefaultDataSourceFactory(OkHttpClient okHttpClient, DefaultDataSourceConfig defaultDataSourceConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new OkHttpClient(new OkHttpClient.a()) : okHttpClient, (i & 2) != 0 ? DefaultDataSourceConfigKt.DefaultDataSourceConfig$default(null, 1, null) : defaultDataSourceConfig);
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(cj01 transferListener) {
        xf7 xf7Var = this.netPerfCallFactory;
        if (xf7Var == null) {
            xf7Var = this.okHttpClient;
        }
        aw60 aw60Var = new aw60(xf7Var);
        aw60Var.c = transferListener;
        ya7 ya7Var = new ya7();
        ya7Var.a = true;
        ya7Var.b = true;
        aw60Var.w = ya7Var.a();
        return new LiveSessionDataSourceDecoratorFactory(aw60Var, getIsNetPerfEnabled(), ORIGINAL_CLASS_NAME);
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    public String getClassName() {
        return this.className;
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    /* renamed from: isNetPerfEnabled */
    public boolean getIsNetPerfEnabled() {
        return this.netPerfCallFactory != null;
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public void setNetPerfEventTrackerFactory(NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
        if (this.netPerfCallFactory == null) {
            this.netPerfCallFactory = new NetPerfCallFactory(this.okHttpClient, null, null, netPerfEventTrackerFactory, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultDataSourceFactory$Companion;", "", "()V", "ORIGINAL_CLASS_NAME", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultDataSourceFactory(OkHttpClient okHttpClient, DefaultDataSourceConfig defaultDataSourceConfig) {
        this.okHttpClient = okHttpClient;
        this.className = ORIGINAL_CLASS_NAME;
    }

    public DefaultDataSourceFactory() {
        this(null, null, 3, null);
    }
}
