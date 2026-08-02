package ru.yandex.video.m3.offline;

import defpackage.ipg;
import defpackage.ra7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.impl.drm.WidevineDrmSessionManagerFactory;
import ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory;
import ru.yandex.video.m3.source.DataSourceFactory;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/offline/ExoDrmLicenseManagerFactory;", "", "Lra7;", "cache", "Lokhttp3/OkHttpClient;", "drmProxyOkHttpClient", "manifestOkHttpClient", "", "preferL3DRMSecurityLevel", "<init>", "(Lra7;Lokhttp3/OkHttpClient;Lokhttp3/OkHttpClient;Z)V", "enable", "Lzy11;", "enableDrmSessionForClearVideo", "(Z)V", "Lru/yandex/video/m3/offline/DrmLicenseManager;", "create", "()Lru/yandex/video/m3/offline/DrmLicenseManager;", "Lra7;", "Lokhttp3/OkHttpClient;", "Z", "experimentalEnableDrmSessionForClearVideo", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDrmLicenseManagerFactory {
    public static final int $stable = 8;
    private final ra7 cache;
    private final OkHttpClient drmProxyOkHttpClient;
    private boolean experimentalEnableDrmSessionForClearVideo;
    private final OkHttpClient manifestOkHttpClient;
    private final boolean preferL3DRMSecurityLevel;

    public ExoDrmLicenseManagerFactory(ra7 ra7Var, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ra7Var, (i & 2) != 0 ? new OkHttpClient(new OkHttpClient.a()) : okHttpClient, (i & 4) != 0 ? new OkHttpClient(new OkHttpClient.a()) : okHttpClient2, (i & 8) != 0 ? false : z);
    }

    public final DrmLicenseManager create() {
        ipg create$default = DataSourceFactory.create$default(new CachedDataSourceFactory(this.cache, this.manifestOkHttpClient, null, null, 12, null), null, 1, null);
        WidevineDrmSessionManagerFactory widevineDrmSessionManagerFactory = new WidevineDrmSessionManagerFactory(this.drmProxyOkHttpClient, 0, this.preferL3DRMSecurityLevel, 2, null);
        if (this.experimentalEnableDrmSessionForClearVideo) {
            widevineDrmSessionManagerFactory.enableDrmSessionForClearVideo(true);
        }
        return new ExoDrmLicenseManager(create$default, widevineDrmSessionManagerFactory);
    }

    public final void enableDrmSessionForClearVideo(boolean enable) {
        this.experimentalEnableDrmSessionForClearVideo = enable;
    }

    public ExoDrmLicenseManagerFactory(ra7 ra7Var, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, boolean z) {
        this.cache = ra7Var;
        this.drmProxyOkHttpClient = okHttpClient;
        this.manifestOkHttpClient = okHttpClient2;
        this.preferL3DRMSecurityLevel = z;
    }
}
