package ru.yandex.video.m3.source;

import defpackage.ipg;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/source/DataSourceFactoryCreator;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Lru/yandex/video/m3/data/DataSourceParameters;", "sourceParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Lipg;", "create", "(Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/PlaybackParameters;)Lipg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataSourceFactoryCreator extends DataSourceFactory {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static ipg create(DataSourceFactoryCreator dataSourceFactoryCreator, DataSourceParameters dataSourceParameters, PlaybackParameters playbackParameters) {
            return DataSourceFactoryCreator.super.create(dataSourceParameters, playbackParameters);
        }

        @Deprecated
        public static void setNetPerfEventTrackerFactory(DataSourceFactoryCreator dataSourceFactoryCreator, NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
            DataSourceFactoryCreator.super.setNetPerfEventTrackerFactory(netPerfEventTrackerFactory);
        }
    }

    default ipg create(DataSourceParameters sourceParameters, PlaybackParameters playbackParameters) {
        return create(sourceParameters.getTransferListener());
    }
}
