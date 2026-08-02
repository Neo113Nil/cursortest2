package ru.yandex.video.m3.player.lowlatency.datasource;

import defpackage.cj01;
import defpackage.ipg;
import defpackage.jxi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.player.impl.source.LiveSessionDataSourceDecoratorFactory;
import ru.yandex.video.m3.player.lowlatency.datasource.LowLatencyHttpDataSource;
import ru.yandex.video.m3.source.DataSourceFactory;

@jxi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/datasource/LowLatencyDataSourceFactory;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "<init>", "()V", "Lcj01;", "transferListener", "Lipg;", "create", "(Lcj01;)Lipg;", "", "isNetPerfEnabled", "Z", "()Z", "", "className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LowLatencyDataSourceFactory implements DataSourceFactory, NetPerfMarker {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ORIGINAL_CLASS_NAME = "LowLatencyDataSourceFactory";
    private final boolean isNetPerfEnabled = true;
    private final String className = ORIGINAL_CLASS_NAME;

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(cj01 transferListener) {
        return new LiveSessionDataSourceDecoratorFactory(new LowLatencyHttpDataSource.Factory().setTransferListener(transferListener), getIsNetPerfEnabled(), ORIGINAL_CLASS_NAME);
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    public String getClassName() {
        return this.className;
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    /* renamed from: isNetPerfEnabled, reason: from getter */
    public boolean getIsNetPerfEnabled() {
        return this.isNetPerfEnabled;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/datasource/LowLatencyDataSourceFactory$Companion;", "", "()V", "ORIGINAL_CLASS_NAME", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
