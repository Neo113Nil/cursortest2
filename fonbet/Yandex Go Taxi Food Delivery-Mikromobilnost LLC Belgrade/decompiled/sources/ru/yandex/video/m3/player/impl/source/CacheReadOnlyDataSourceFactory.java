package ru.yandex.video.m3.player.impl.source;

import androidx.media3.datasource.FileDataSource;
import defpackage.cj01;
import defpackage.db7;
import defpackage.ic7;
import defpackage.ipg;
import defpackage.jxi;
import defpackage.kpg;
import defpackage.pb7;
import defpackage.ra7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.datasource.CacheReadOnlyDataSourceConfig;
import ru.yandex.video.m3.model.config.datasource.CacheReadOnlyDataSourceConfigKt;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.source.DataSourceFactory;

@jxi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/source/CacheReadOnlyDataSourceFactory;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "Lra7;", "cache", "Lpb7;", "cacheKeyFactory", "Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;", ConfigConstants.CONFIG, "<init>", "(Lra7;Lpb7;Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;)V", "Lcj01;", "transferListener", "Lipg;", "create", "(Lcj01;)Lipg;", "Lra7;", "Lpb7;", "Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;", "", "isNetPerfEnabled", "Z", "()Z", "", "className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheReadOnlyDataSourceFactory implements DataSourceFactory, NetPerfMarker {
    public static final int $stable = 8;
    private final ra7 cache;
    private final pb7 cacheKeyFactory;
    private final String className;
    private final CacheReadOnlyDataSourceConfig config;
    private final boolean isNetPerfEnabled;

    public /* synthetic */ CacheReadOnlyDataSourceFactory(ra7 ra7Var, pb7 pb7Var, CacheReadOnlyDataSourceConfig cacheReadOnlyDataSourceConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ra7Var, (i & 2) != 0 ? null : pb7Var, (i & 4) != 0 ? CacheReadOnlyDataSourceConfigKt.CacheReadOnlyDataSourceConfig$default(null, 1, null) : cacheReadOnlyDataSourceConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kpg create$lambda$1$lambda$0(ra7 ra7Var, CacheReadOnlyDataSourceFactory cacheReadOnlyDataSourceFactory) {
        return new NotCachedDataSource(ra7Var, cacheReadOnlyDataSourceFactory.config.getShouldUseLogInsteadOfTimber());
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(cj01 transferListener) {
        db7 db7Var = new db7();
        ra7 ra7Var = this.cache;
        pb7 pb7Var = this.cacheKeyFactory;
        db7Var.a = ra7Var;
        db7Var.y = new ic7(0, ra7Var, this);
        FileDataSource.a aVar = new FileDataSource.a();
        aVar.a = transferListener;
        db7Var.b = aVar;
        db7Var.c = null;
        db7Var.x = true;
        db7Var.B = 1;
        if (pb7Var != null) {
            db7Var.w = pb7Var;
        }
        return db7Var;
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

    public CacheReadOnlyDataSourceFactory(ra7 ra7Var, pb7 pb7Var, CacheReadOnlyDataSourceConfig cacheReadOnlyDataSourceConfig) {
        this.cache = ra7Var;
        this.cacheKeyFactory = pb7Var;
        this.config = cacheReadOnlyDataSourceConfig;
        this.className = "CacheReadOnlyDataSourceFactory";
    }
}
