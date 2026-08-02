package ru.yandex.video.m3.source;

import defpackage.cj01;
import defpackage.ipg;
import defpackage.jxi;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory;

@jxi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/source/DataSourceFactory;", "", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "Lzy11;", "setNetPerfEventTrackerFactory", "(Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;)V", "Lcj01;", "transferListener", "Lipg;", "create", "(Lcj01;)Lipg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataSourceFactory {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void setNetPerfEventTrackerFactory(DataSourceFactory dataSourceFactory, NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
            DataSourceFactory.super.setNetPerfEventTrackerFactory(netPerfEventTrackerFactory);
        }
    }

    static /* synthetic */ ipg create$default(DataSourceFactory dataSourceFactory, cj01 cj01Var, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: create");
            return null;
        }
        if ((i & 1) != 0) {
            cj01Var = null;
        }
        return dataSourceFactory.create(cj01Var);
    }

    ipg create(cj01 transferListener);

    default void setNetPerfEventTrackerFactory(NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
    }
}
