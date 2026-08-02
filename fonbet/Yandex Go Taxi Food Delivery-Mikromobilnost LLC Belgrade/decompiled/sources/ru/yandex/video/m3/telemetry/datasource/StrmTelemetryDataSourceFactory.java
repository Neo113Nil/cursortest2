package ru.yandex.video.m3.telemetry.datasource;

import defpackage.vuu;
import defpackage.xuu;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerControlCallRestrictor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/telemetry/datasource/StrmTelemetryDataSourceFactory;", "Lvuu;", "", "sessionId", "originalHttpDataSourceFactory", "Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;", "errorNotifier", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "manifestUrlInflater", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "netPerfManagerRestrictor", "<init>", "(Ljava/lang/String;Lvuu;Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;)V", "Lxuu;", "createDataSource", "()Lxuu;", "", "defaultRequestProperties", "setDefaultRequestProperties", "(Ljava/util/Map;)Lvuu;", "Ljava/lang/String;", "Lvuu;", "Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmTelemetryDataSourceFactory implements vuu {
    public static final int $stable = 8;
    private final DataSourceErrorNotifier errorNotifier;
    private final ManifestUrlInflater manifestUrlInflater;
    private final NetPerfManagerControlCallRestrictor netPerfManagerRestrictor;
    private final vuu originalHttpDataSourceFactory;
    private final String sessionId;

    public StrmTelemetryDataSourceFactory(String str, vuu vuuVar, DataSourceErrorNotifier dataSourceErrorNotifier, ManifestUrlInflater manifestUrlInflater, NetPerfManagerControlCallRestrictor netPerfManagerControlCallRestrictor) {
        this.sessionId = str;
        this.originalHttpDataSourceFactory = vuuVar;
        this.errorNotifier = dataSourceErrorNotifier;
        this.manifestUrlInflater = manifestUrlInflater;
        this.netPerfManagerRestrictor = netPerfManagerControlCallRestrictor;
    }

    @Override // defpackage.ipg
    public xuu createDataSource() {
        return new StrmTelemetryDataSource(this.sessionId, this.originalHttpDataSourceFactory.createDataSource(), this.errorNotifier, this.manifestUrlInflater, this.netPerfManagerRestrictor);
    }

    @Override // defpackage.vuu
    public vuu setDefaultRequestProperties(Map<String, String> defaultRequestProperties) {
        this.originalHttpDataSourceFactory.setDefaultRequestProperties(defaultRequestProperties);
        return this;
    }
}
