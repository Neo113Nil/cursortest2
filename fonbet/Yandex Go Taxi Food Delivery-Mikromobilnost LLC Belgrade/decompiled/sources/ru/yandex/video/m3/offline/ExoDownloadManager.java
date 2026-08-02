package ru.yandex.video.m3.offline;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.b;
import androidx.media3.exoplayer.offline.e;
import androidx.media3.exoplayer.scheduler.Requirements;
import defpackage.c6w;
import defpackage.c7m;
import defpackage.d6w;
import defpackage.d6z;
import defpackage.e5p;
import defpackage.eh20;
import defpackage.fe10;
import defpackage.g8e;
import defpackage.gly0;
import defpackage.ipg;
import defpackage.iyi0;
import defpackage.l7m;
import defpackage.ny61;
import defpackage.omh;
import defpackage.qnh;
import defpackage.syi0;
import defpackage.tcc;
import defpackage.td10;
import defpackage.tls;
import defpackage.tw21;
import defpackage.u6m;
import defpackage.ueh;
import defpackage.w511;
import defpackage.wly0;
import defpackage.x8e;
import defpackage.xzz0;
import defpackage.y6i0;
import defpackage.ycc;
import defpackage.yzz0;
import defpackage.zch;
import defpackage.zd10;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.Offline;
import ru.yandex.video.m3.offline.DownloadManager;
import ru.yandex.video.m3.player.impl.ExoPlayerExceptionKt;
import ru.yandex.video.m3.player.impl.offline.ExoWritableDownloadIndexKt;
import ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactory;
import ru.yandex.video.m3.player.impl.tracks.ExoPlayerTrack;
import ru.yandex.video.m3.player.impl.utils.FutureAsync;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.source.DataSourceFactory;
import ru.yandex.video.m3.source.MediaSourceFactory;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002?@BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\n*\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0$2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J3\u0010*\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010&J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010&J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010&J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R$\u0010=\u001a\u0012\u0012\u0004\u0012\u00020/0;j\b\u0012\u0004\u0012\u00020/`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManager;", "Lru/yandex/video/m3/offline/DownloadManager;", "Landroidx/media3/exoplayer/offline/e;", "downloadManager", "Lsyi0;", "renderersFactory", "Lru/yandex/video/m3/source/MediaSourceFactory;", "mediaSourceFactory", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "downloadActionHelper", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "audioTrackNameProvider", "videoTrackNameProvider", "subtitleTrackNameProvider", "otherTrackNameProvider", "Lomh;", "trackSelectorParameters", "<init>", "(Landroidx/media3/exoplayer/offline/e;Lsyi0;Lru/yandex/video/m3/source/MediaSourceFactory;Lru/yandex/video/m3/offline/DownloadActionHelper;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lomh;)V", "", "manifestUrl", "Landroidx/media3/exoplayer/offline/b;", "createDownloadHelper", "(Ljava/lang/String;)Landroidx/media3/exoplayer/offline/b;", "Landroidx/media3/common/a;", "Lru/yandex/video/m3/player/tracks/TrackType;", "toTrackType", "(Landroidx/media3/common/a;)Lru/yandex/video/m3/player/tracks/TrackType;", "getTrackNameProvider", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "toMimeType", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lru/yandex/video/m3/player/tracks/TrackVariant$DownloadVariant;", "getTrackVariants", "(Landroidx/media3/exoplayer/offline/b;)Ljava/util/List;", "Ljava/util/concurrent/Future;", "prepareTrackVariants", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "id", "selectedTrackVariants", "Lru/yandex/video/m3/data/Offline$DownloadState;", "start", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/concurrent/Future;", "resume", "pause", "remove", "Lru/yandex/video/m3/offline/DownloadManager$DownloadObserver;", "observer", "Lzy11;", "addObserver", "(Lru/yandex/video/m3/offline/DownloadManager$DownloadObserver;)V", "removeObserver", "Landroidx/media3/exoplayer/offline/e;", "Lsyi0;", "Lru/yandex/video/m3/source/MediaSourceFactory;", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "Lomh;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "observers", "Ljava/util/HashSet;", "Companion", "DownloadListenerImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDownloadManager implements DownloadManager {
    private final PlayerTrackNameProvider audioTrackNameProvider;
    private final DownloadActionHelper downloadActionHelper;
    private final e downloadManager;
    private final MediaSourceFactory mediaSourceFactory;
    private final HashSet<DownloadManager.DownloadObserver> observers = new HashSet<>();
    private final PlayerTrackNameProvider otherTrackNameProvider;
    private final syi0 renderersFactory;
    private final PlayerTrackNameProvider subtitleTrackNameProvider;
    private final omh trackSelectorParameters;
    private final PlayerTrackNameProvider videoTrackNameProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManager$DownloadListenerImpl;", "Ll7m;", "Lru/yandex/video/m3/offline/ExoDownloadManager;", "exoDownloadManager", "<init>", "(Lru/yandex/video/m3/offline/ExoDownloadManager;)V", "Landroidx/media3/exoplayer/offline/e;", "downloadManager", "Lu6m;", "download", "Ljava/lang/Exception;", "Lkotlin/Exception;", "finalException", "Lzy11;", "onDownloadChanged", "(Landroidx/media3/exoplayer/offline/e;Lu6m;Ljava/lang/Exception;)V", "onDownloadRemoved", "(Landroidx/media3/exoplayer/offline/e;Lu6m;)V", "Lru/yandex/video/m3/offline/ExoDownloadManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DownloadListenerImpl implements l7m {
        private final ExoDownloadManager exoDownloadManager;

        public DownloadListenerImpl(ExoDownloadManager exoDownloadManager) {
            this.exoDownloadManager = exoDownloadManager;
        }

        @Override // defpackage.l7m
        public void onDownloadChanged(e downloadManager, u6m download, Exception finalException) {
            HashSet H0;
            synchronized (this.exoDownloadManager.observers) {
                H0 = kotlin.collections.a.H0(this.exoDownloadManager.observers);
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((DownloadManager.DownloadObserver) it.next()).onDownloadChanged(ExoWritableDownloadIndexKt.toDownloadItem(download), finalException);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // defpackage.l7m
        public void onDownloadRemoved(e downloadManager, u6m download) {
            HashSet H0;
            synchronized (this.exoDownloadManager.observers) {
                H0 = kotlin.collections.a.H0(this.exoDownloadManager.observers);
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((DownloadManager.DownloadObserver) it.next()).onDownloadRemoved(ExoWritableDownloadIndexKt.toDownloadItem(download));
                } catch (Throwable unused) {
                }
            }
        }

        @Override // defpackage.l7m
        public /* bridge */ /* synthetic */ void onDownloadsPausedChanged(e eVar, boolean z) {
        }

        @Override // defpackage.l7m
        public /* bridge */ /* synthetic */ void onIdle(e eVar) {
        }

        @Override // defpackage.l7m
        public /* bridge */ /* synthetic */ void onInitialized(e eVar) {
        }

        @Override // defpackage.l7m
        public /* bridge */ /* synthetic */ void onRequirementsStateChanged(e eVar, Requirements requirements, int i) {
        }

        @Override // defpackage.l7m
        public /* bridge */ /* synthetic */ void onWaitingForRequirementsChanged(e eVar, boolean z) {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackType.Subtitles.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackType.Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrackType.Other.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExoDownloadManager(e eVar, syi0 syi0Var, MediaSourceFactory mediaSourceFactory, DownloadActionHelper downloadActionHelper, PlayerTrackNameProvider playerTrackNameProvider, PlayerTrackNameProvider playerTrackNameProvider2, PlayerTrackNameProvider playerTrackNameProvider3, PlayerTrackNameProvider playerTrackNameProvider4, omh omhVar) {
        this.downloadManager = eVar;
        this.renderersFactory = syi0Var;
        this.mediaSourceFactory = mediaSourceFactory;
        this.downloadActionHelper = downloadActionHelper;
        this.audioTrackNameProvider = playerTrackNameProvider;
        this.videoTrackNameProvider = playerTrackNameProvider2;
        this.subtitleTrackNameProvider = playerTrackNameProvider3;
        this.otherTrackNameProvider = playerTrackNameProvider4;
        this.trackSelectorParameters = omhVar;
        eVar.d.add(new DownloadListenerImpl(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b createDownloadHelper(String manifestUrl) {
        td10 td10Var = new td10();
        td10Var.b(manifestUrl);
        td10Var.c = toMimeType(manifestUrl);
        fe10 a = td10Var.a();
        omh omhVar = this.trackSelectorParameters;
        syi0 syi0Var = this.renderersFactory;
        boolean z = true;
        ipg create$default = DataSourceFactory.create$default(new DefaultDataSourceFactory(null, null, 3, null), null, 1, null);
        int i = b.m;
        zd10 zd10Var = a.b;
        zd10Var.getClass();
        boolean z2 = tw21.O(zd10Var.a, zd10Var.b) == 4;
        if (!z2 && create$default == null) {
            z = false;
        }
        d6z.l(z);
        return new b(a, z2 ? null : new ueh(create$default, e5p.a).createMediaSource(a), omhVar, syi0Var != null ? new zch(syi0Var.createRenderers(tw21.o(null), new gly0(), new wly0(), new x8e(21), new x8e(22))) : new qnh(new iyi0[0]));
    }

    private final PlayerTrackNameProvider getTrackNameProvider(TrackType trackType) {
        int i = WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        if (i == 1) {
            return this.audioTrackNameProvider;
        }
        if (i == 2) {
            return this.subtitleTrackNameProvider;
        }
        if (i == 3) {
            return this.videoTrackNameProvider;
        }
        if (i == 4) {
            return this.otherTrackNameProvider;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TrackVariant.DownloadVariant> getTrackVariants(b bVar) {
        int length;
        c6w c6wVar;
        ArrayList arrayList;
        TrackVariant.DownloadVariant downloadVariant;
        int i = 0;
        if (bVar.a == null) {
            length = 0;
        } else {
            d6z.x(bVar.f);
            length = bVar.i.length;
        }
        d6w n = y6i0.n(0, length);
        ArrayList arrayList2 = new ArrayList();
        c6w it = n.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            d6z.x(bVar.f);
            yzz0 yzz0Var = bVar.i[nextInt];
            d6w n2 = y6i0.n(i, yzz0Var.a);
            ArrayList arrayList3 = new ArrayList();
            c6w it2 = n2.iterator();
            while (it2.c) {
                int nextInt2 = it2.nextInt();
                xzz0 a = yzz0Var.a(nextInt2);
                androidx.media3.common.a[] aVarArr = a.d;
                d6w n3 = y6i0.n(i, a.a);
                ArrayList arrayList4 = new ArrayList();
                c6w it3 = n3.iterator();
                while (it3.c) {
                    int nextInt3 = it3.nextInt();
                    TrackType trackType = toTrackType(aVarArr[nextInt3]);
                    if (trackType != null) {
                        ExoPlayerTrack.ExoTrackFormat exoTrackFormat = new ExoPlayerTrack.ExoTrackFormat(aVarArr[nextInt3], null, null, null, null, 0, 0, 0, 0.0f, null, null, 2046, null);
                        c6wVar = it3;
                        arrayList = arrayList4;
                        downloadVariant = new TrackVariant.DownloadVariant(getTrackNameProvider(trackType).getOtherTrackName(exoTrackFormat), trackType, nextInt, nextInt2, nextInt3, exoTrackFormat);
                    } else {
                        c6wVar = it3;
                        arrayList = arrayList4;
                        downloadVariant = null;
                    }
                    if (downloadVariant != null) {
                        arrayList.add(downloadVariant);
                    }
                    arrayList4 = arrayList;
                    it3 = c6wVar;
                }
                ycc.r(arrayList4, arrayList3);
                i = 0;
            }
            ycc.r(arrayList3, arrayList2);
            i = 0;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toMimeType(String str) {
        int i = tw21.a;
        int N = tw21.N(Uri.parse("file:///" + str));
        if (N == 0) {
            return "application/dash+xml";
        }
        if (N == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (N == 2) {
            return "application/x-mpegURL";
        }
        if (N == 4) {
            return "video/x-unknown";
        }
        ny61.r(g8e.o("Unsupported type: ", str));
        return null;
    }

    private final TrackType toTrackType(androidx.media3.common.a aVar) {
        String str = aVar.n;
        String str2 = aVar.n;
        if (eh20.l(str)) {
            return TrackType.Audio;
        }
        if (eh20.p(str2)) {
            return TrackType.Video;
        }
        if (eh20.o(str2)) {
            return TrackType.Subtitles;
        }
        return null;
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public void addObserver(DownloadManager.DownloadObserver observer) {
        synchronized (this.observers) {
            this.observers.add(observer);
        }
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public Future<Offline.DownloadState> pause(final String id) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManager$pause$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<Offline.DownloadState> callback) {
                DownloadActionHelper downloadActionHelper;
                try {
                    downloadActionHelper = ExoDownloadManager.this.downloadActionHelper;
                    downloadActionHelper.pause(id);
                    callback.onComplete(Offline.DownloadState.Stopped);
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<Offline.DownloadState>) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public Future<List<TrackVariant.DownloadVariant>> prepareTrackVariants(final String manifestUrl) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManager$prepareTrackVariants$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [ru.yandex.video.m3.offline.ExoDownloadManager$prepareTrackVariants$1$1] */
            public final void invoke(final FutureAsync.Callback<List<TrackVariant.DownloadVariant>> callback) {
                b createDownloadHelper;
                try {
                    createDownloadHelper = ExoDownloadManager.this.createDownloadHelper(manifestUrl);
                    final ExoDownloadManager exoDownloadManager = ExoDownloadManager.this;
                    createDownloadHelper.b(new c7m() { // from class: ru.yandex.video.m3.offline.ExoDownloadManager$prepareTrackVariants$1.1
                        @Override // defpackage.c7m
                        public void onPrepareError(b helper, IOException e) {
                            callback.onException(ExoPlayerExceptionKt.toPlayerError(e));
                            helper.c();
                        }

                        @Override // defpackage.c7m
                        public void onPrepared(b helper) {
                            List<TrackVariant.DownloadVariant> trackVariants;
                            FutureAsync.Callback<List<TrackVariant.DownloadVariant>> callback2 = callback;
                            trackVariants = exoDownloadManager.getTrackVariants(helper);
                            callback2.onComplete(trackVariants);
                            helper.c();
                        }
                    });
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<List<TrackVariant.DownloadVariant>>) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public Future<Offline.DownloadState> remove(final String id) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManager$remove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<Offline.DownloadState> callback) {
                DownloadActionHelper downloadActionHelper;
                try {
                    downloadActionHelper = ExoDownloadManager.this.downloadActionHelper;
                    downloadActionHelper.remove(id);
                    callback.onComplete(Offline.DownloadState.Stopped);
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<Offline.DownloadState>) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public void removeObserver(DownloadManager.DownloadObserver observer) {
        synchronized (this.observers) {
            this.observers.remove(observer);
        }
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public Future<Offline.DownloadState> resume(final String id) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManager$resume$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<Offline.DownloadState> callback) {
                DownloadActionHelper downloadActionHelper;
                try {
                    downloadActionHelper = ExoDownloadManager.this.downloadActionHelper;
                    downloadActionHelper.resume(id);
                    callback.onComplete(Offline.DownloadState.Stopped);
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<Offline.DownloadState>) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.offline.DownloadManager
    public Future<Offline.DownloadState> start(final String id, final String manifestUrl, final List<TrackVariant.DownloadVariant> selectedTrackVariants) {
        return new FutureAsync(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManager$start$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(FutureAsync.Callback<Offline.DownloadState> callback) {
                DownloadActionHelper downloadActionHelper;
                String mimeType;
                try {
                    downloadActionHelper = ExoDownloadManager.this.downloadActionHelper;
                    String str = id;
                    Uri parse = Uri.parse(manifestUrl);
                    mimeType = ExoDownloadManager.this.toMimeType(manifestUrl);
                    String q = eh20.q(mimeType);
                    List<TrackVariant.DownloadVariant> list = selectedTrackVariants;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (TrackVariant.DownloadVariant downloadVariant : list) {
                        arrayList.add(new StreamKey(downloadVariant.getPeriodIndex(), downloadVariant.getGroupIndex(), downloadVariant.getTrackIndex()));
                    }
                    downloadActionHelper.start(new DownloadRequest(str, parse, q, arrayList, null, null, null, null));
                    callback.onComplete(Offline.DownloadState.Queued);
                } catch (Throwable th) {
                    callback.onException(ExoPlayerExceptionKt.toPlayerError(th));
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FutureAsync.Callback<Offline.DownloadState>) obj);
                return zy11.a;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManager$Companion;", "", "<init>", "()V", "Lru/yandex/video/m3/offline/DownloadManager;", "Landroidx/media3/exoplayer/offline/e;", "getExoDownloadManager", "(Lru/yandex/video/m3/offline/DownloadManager;)Landroidx/media3/exoplayer/offline/e;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e getExoDownloadManager(DownloadManager downloadManager) {
            ExoDownloadManager exoDownloadManager = downloadManager instanceof ExoDownloadManager ? (ExoDownloadManager) downloadManager : null;
            if (exoDownloadManager != null) {
                return exoDownloadManager.downloadManager;
            }
            return null;
        }

        private Companion() {
        }
    }
}
