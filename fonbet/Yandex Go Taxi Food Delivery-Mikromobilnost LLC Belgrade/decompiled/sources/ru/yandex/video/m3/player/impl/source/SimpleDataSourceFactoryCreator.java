package ru.yandex.video.m3.player.impl.source;

import defpackage.cj01;
import defpackage.ipg;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory;
import ru.yandex.video.m3.source.DataSourceFactory;
import ru.yandex.video.m3.source.DataSourceFactoryCreator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/source/SimpleDataSourceFactoryCreator;", "Lru/yandex/video/m3/source/DataSourceFactoryCreator;", "Lru/yandex/video/m3/source/DataSourceFactory;", "dataSourceFactory", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "<init>", "(Lru/yandex/video/m3/source/DataSourceFactory;Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;)V", "Lru/yandex/video/m3/data/DataSourceParameters;", "sourceParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Lipg;", "create", "(Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/PlaybackParameters;)Lipg;", "Lcj01;", "transferListener", "(Lcj01;)Lipg;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimpleDataSourceFactoryCreator implements DataSourceFactoryCreator {
    private final DataSourceFactory dataSourceFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SimpleDataSourceFactoryCreator(DataSourceFactory dataSourceFactory, NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
        this.dataSourceFactory = dataSourceFactory;
        dataSourceFactory.setNetPerfEventTrackerFactory(netPerfEventTrackerFactory);
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactoryCreator
    public ipg create(DataSourceParameters sourceParameters, PlaybackParameters playbackParameters) {
        return this.dataSourceFactory.create(sourceParameters.getTransferListener());
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/source/SimpleDataSourceFactoryCreator$Companion;", "", "()V", "fromDataSourceFactory", "Lru/yandex/video/m3/source/DataSourceFactoryCreator;", "factory", "Lru/yandex/video/m3/source/DataSourceFactory;", "netPerfEventTrackerFactory", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DataSourceFactoryCreator fromDataSourceFactory(DataSourceFactory factory, NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
            return new SimpleDataSourceFactoryCreator(factory, netPerfEventTrackerFactory);
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(cj01 transferListener) {
        return this.dataSourceFactory.create(transferListener);
    }
}
