package ru.yandex.video.m3.preload_manager;

import androidx.media3.exoplayer.offline.f;
import defpackage.aj31;
import defpackage.d6z;
import defpackage.e5p;
import defpackage.fe10;
import defpackage.gly0;
import defpackage.ip4;
import defpackage.ipg;
import defpackage.iyi0;
import defpackage.sls;
import defpackage.td10;
import defpackage.tls;
import defpackage.tw21;
import defpackage.ueh;
import defpackage.vmh;
import defpackage.wly0;
import defpackage.x8e;
import defpackage.zch;
import defpackage.zd10;
import kotlin.Metadata;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.ExoRenderersFactory;
import ru.yandex.video.m3.player.impl.SurfaceSizeHolderInternal;
import ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory;
import ru.yandex.video.m3.player.provider.ImmutableTrackSelectionRestrictionsProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/preload_manager/YandexDownloadHelperFactory;", "", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "trackSelectorFactoryBuilder", "Lru/yandex/video/m3/player/ExoRenderersFactory;", "renderersFactory", "Lip4;", "bandwidthMeter", "Lipg;", "manifestDataSourceFactory", "Lkotlin/Function0;", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "surfaceSizeProvider", "<init>", "(Ltls;Lru/yandex/video/m3/player/ExoRenderersFactory;Lip4;Lipg;Lsls;)V", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "preloadRequest", "Landroidx/media3/exoplayer/offline/f;", "create", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)Landroidx/media3/exoplayer/offline/f;", "Ltls;", "Lru/yandex/video/m3/player/ExoRenderersFactory;", "Lip4;", "Lipg;", "Lsls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexDownloadHelperFactory {
    public static final int $stable = 8;
    private final ip4 bandwidthMeter;
    private final ipg manifestDataSourceFactory;
    private final ExoRenderersFactory renderersFactory;
    private final sls surfaceSizeProvider;
    private final tls trackSelectorFactoryBuilder;

    public YandexDownloadHelperFactory(tls tlsVar, ExoRenderersFactory exoRenderersFactory, ip4 ip4Var, ipg ipgVar, sls slsVar) {
        this.trackSelectorFactoryBuilder = tlsVar;
        this.renderersFactory = exoRenderersFactory;
        this.bandwidthMeter = ip4Var;
        this.manifestDataSourceFactory = ipgVar;
        this.surfaceSizeProvider = slsVar;
    }

    public final f create(PreloadRequest preloadRequest) {
        SurfaceSizeHolderInternal surfaceSizeHolderInternal = (SurfaceSizeHolderInternal) this.surfaceSizeProvider.invoke();
        int cappingHeight = surfaceSizeHolderInternal.getCappingHeight();
        Integer maxHeight = preloadRequest.getConfig().getMaxHeight();
        int min = Math.min(cappingHeight, maxHeight != null ? maxHeight.intValue() : Integer.MAX_VALUE);
        int cappingWidth = surfaceSizeHolderInternal.getCappingWidth();
        Integer maxWidth = preloadRequest.getConfig().getMaxWidth();
        int min2 = Math.min(cappingWidth, maxWidth != null ? maxWidth.intValue() : Integer.MAX_VALUE);
        String manifestUrl = preloadRequest.getManifestUrl();
        int i = fe10.g;
        td10 td10Var = new td10();
        td10Var.b(manifestUrl);
        fe10 a = td10Var.a();
        vmh create = ((TrackSelectorFactory) this.trackSelectorFactoryBuilder.invoke(preloadRequest.getRawVideoDataWithIncorrectVsid())).create(new ImmutableTrackSelectionRestrictionsProvider(min2, min, 0, 4, null));
        ip4 ip4Var = this.bandwidthMeter;
        ExoRenderersFactory exoRenderersFactory = this.renderersFactory;
        ipg ipgVar = this.manifestDataSourceFactory;
        PreloadLiveDashConfig experimentalPreloadLiveDashConfig = preloadRequest.getConfig().getExperimentalPreloadLiveDashConfig();
        boolean z = true;
        boolean z2 = experimentalPreloadLiveDashConfig != null && experimentalPreloadLiveDashConfig.getLiveDashPreloadEnabled();
        int i2 = f.o;
        zd10 zd10Var = a.b;
        zd10Var.getClass();
        boolean z3 = tw21.O(zd10Var.a, zd10Var.b) == 4;
        if (!z3 && ipgVar == null) {
            z = false;
        }
        d6z.l(z);
        return new f(a, z3 ? null : new ueh(ipgVar, e5p.a).createMediaSource(a), exoRenderersFactory != null ? new zch(exoRenderersFactory.createRenderers(tw21.o(null), new gly0(), new wly0(), new x8e(21), new x8e(22))) : new aj31(14, new iyi0[0]), create, ip4Var, z2);
    }
}
