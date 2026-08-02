package ru.yandex.video.m3.preload_manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.media3.common.PriorityTaskManager;
import defpackage.bvu0;
import defpackage.db7;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.ip4;
import defpackage.ipg;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.p16;
import defpackage.pb7;
import defpackage.qf60;
import defpackage.qoi0;
import defpackage.qv10;
import defpackage.ra7;
import defpackage.tls;
import defpackage.tw21;
import defpackage.xbi0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.YandexCacheKeyFactory;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.ab.util.UtilKt;
import ru.yandex.video.m3.cache.CacheProvider;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.offline.ExoDownloaderFactoryKt;
import ru.yandex.video.m3.player.ExoRenderersFactory;
import ru.yandex.video.m3.player.ExoRenderersFactoryKt;
import ru.yandex.video.m3.player.InternalDiUtil;
import ru.yandex.video.m3.player.abr.impl.AesthetePreferenceProviderImpl;
import ru.yandex.video.m3.player.abr.impl.UserQualityRepositoryImpl;
import ru.yandex.video.m3.player.impl.SurfaceSizeHolderInternal;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoDtoKt;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider;
import ru.yandex.video.m3.player.impl.utils.AppInfo;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;
import ru.yandex.video.m3.preload_manager.PreloadManager;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;
import ru.yandex.video.m3.preload_manager.tracking.ContentIdProvider;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b?\b\u0007\u0018\u0000 ¦\u00012\u00020\u0001:\u0002¦\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001c¢\u0006\u0004\b$\u0010\"J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J%\u0010@\u001a\u00020\u00002\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<j\u0002`?¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020B¢\u0006\u0004\bE\u0010DJ\u0017\u0010I\u001a\u00020H2\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020(¢\u0006\u0004\bU\u0010*J\u0015\u0010V\u001a\u00020\u00002\u0006\u0010#\u001a\u00020Q¢\u0006\u0004\bV\u0010SJ\r\u0010X\u001a\u00020W¢\u0006\u0004\bX\u0010YJ\u0017\u0010_\u001a\u00020\\2\u0006\u0010[\u001a\u00020ZH\u0001¢\u0006\u0004\b]\u0010^J\u0017\u0010b\u001a\u0002052\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020`2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020h2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\bi\u0010jR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010kR+\u0010s\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010tR+\u0010)\u001a\u00020(2\u0006\u0010l\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010n\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR+\u0010,\u001a\u00020+2\u0006\u0010l\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010n\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR0\u00100\u001a\u00020/2\u0006\u0010l\u001a\u00020/8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0080\u0001\u0010n\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0085\u0001R\u0019\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0086\u0001R0\u0010:\u001a\u0002092\u0006\u0010l\u001a\u0002098B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0087\u0001\u0010n\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001RP\u0010@\u001a\u0012\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<j\u0002`?2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<j\u0002`?8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010n\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010\u0091\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u0092\u0001R0\u0010\u0011\u001a\u00020\u000f2\u0006\u0010l\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0093\u0001\u0010n\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u0098\u0001R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0099\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010 \u0001R\u0017\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bE\u0010 \u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010£\u0001R\u0017\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010¤\u0001R\u0019\u0010 \u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u009f\u0001R\u0019\u0010T\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010¥\u0001R\u0017\u0010V\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010¤\u0001¨\u0006§\u0001"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "downloadExecutorService", "(Ljava/util/concurrent/ExecutorService;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "strmTrackingExecutorService", "Lokhttp3/OkHttpClient;", "okHttpClient", "strmOkHttpClient", "(Lokhttp3/OkHttpClient;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "provider", "deviceInfoProvider", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "converter", "jsonConverter", "(Lru/yandex/video/m3/player/utils/JsonConverter;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "logger", "strmErrorLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "", "", "testIds", "setTestIds", "(Ljava/util/List;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "vsid", "setVsid", "(Ljava/lang/String;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "value", "setFrom", "Lru/yandex/video/m3/preload_manager/tracking/ContentIdProvider;", "setContentIdProvider", "(Lru/yandex/video/m3/preload_manager/tracking/ContentIdProvider;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "", "maxSimultaneousDownloads", "(I)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "preloadCacheProvider", "cacheProvider", "(Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lipg;", "upstreamDataSourceFactory", "(Lipg;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "listener", "(Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "yandexDownloaderFactory", "downloaderFactory", "(Lru/yandex/video/m3/preload/YandexDownloaderFactory;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lip4;", "bandwidthMeter", "(Lip4;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Lru/yandex/video/m3/preload_manager/TrackSelectorFactoryBuilder;", "trackSelectorFactoryBuilder", "(Ltls;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "", "trackFetchTimeoutInSec", "(J)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "trackPreloadTimeoutInSec", "Lru/yandex/video/m3/data/network/UrlParams;", "strmTrackingUrl", "Lzy11;", "setStrmTrackingUrlParams", "(Lru/yandex/video/m3/data/network/UrlParams;)V", "Landroidx/media3/common/PriorityTaskManager;", "upstreamPriorityTaskManager", "(Landroidx/media3/common/PriorityTaskManager;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "Landroid/os/Handler;", "handler", "(Landroid/os/Handler;)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "", "releaseCacheOnShutdown", "(Z)Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder;", "serviceQuality", "setServiceQuality", "shouldConsiderSelectedUserQuality", "Lru/yandex/video/m3/preload_manager/PreloadManager;", "build", "()Lru/yandex/video/m3/preload_manager/PreloadManager;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "createTrackingArguments$video_player_internalRelease", "(Lru/yandex/video/m3/player/impl/utils/InfoProvider;)Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "createTrackingArguments", "Ldb7;", "cachedDataSourceFactory", "defaultDownloaderFactory", "(Ldb7;)Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Lra7;", "cache", "defaultCacheDataSourceFactory", "(Lra7;)Ldb7;", "Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker;", "createEventTracker", "(Lru/yandex/video/m3/player/impl/utils/InfoProvider;)Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker;", "Landroid/content/Context;", "<set-?>", "workersExecutorService$delegate", "Lxbi0;", "getWorkersExecutorService", "()Ljava/util/concurrent/ExecutorService;", "setWorkersExecutorService", "(Ljava/util/concurrent/ExecutorService;)V", "workersExecutorService", "Ljava/util/concurrent/ExecutorService;", "downloaderExecutorService", "maxSimultaneousDownloads$delegate", "getMaxSimultaneousDownloads", "()I", "setMaxSimultaneousDownloads", "(I)V", "preloadCacheProvider$delegate", "getPreloadCacheProvider", "()Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "setPreloadCacheProvider", "(Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;)V", "upstreamDataSourceFactory$delegate", "getUpstreamDataSourceFactory", "()Lipg;", "setUpstreamDataSourceFactory", "(Lipg;)V", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "bandwidthMeter$delegate", "getBandwidthMeter", "()Lip4;", "setBandwidthMeter", "(Lip4;)V", "trackSelectorFactoryBuilder$delegate", "getTrackSelectorFactoryBuilder", "()Ltls;", "setTrackSelectorFactoryBuilder", "(Ltls;)V", "Landroidx/media3/common/PriorityTaskManager;", "Lokhttp3/OkHttpClient;", "deviceInfoProvider$delegate", "getDeviceInfoProvider", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "setDeviceInfoProvider", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;)V", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "contentIdProvider", "Lru/yandex/video/m3/preload_manager/tracking/ContentIdProvider;", "slots", "Ljava/util/List;", "from", "Ljava/lang/String;", "J", "strmTrackingUrlParams", "Lru/yandex/video/m3/data/network/UrlParams;", "Landroid/os/Handler;", "Z", "Ljava/lang/Integer;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadManagerBuilder {

    @Deprecated
    public static final int MAXIMUM_TRACK_FETCH_TIMEOUT_IN_SEC = 120;

    @Deprecated
    public static final int MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC = 240;

    @Deprecated
    public static final int MINIMAL_TRACK_ANY_TIMEOUT_IN_SEC = 5;
    private ContentIdProvider contentIdProvider;
    private final Context context;
    private ExecutorService downloaderExecutorService;
    private YandexDownloaderFactory downloaderFactory;
    private String from;
    private Handler handler;
    private JsonConverter jsonConverter;
    private PreloadManager.Listener listener;
    private boolean releaseCacheOnShutdown;
    private Integer serviceQuality;
    private boolean shouldConsiderSelectedUserQuality;
    private PlayerLogger strmErrorLogger;
    private OkHttpClient strmOkHttpClient;
    private ExecutorService strmTrackingExecutorService;
    private UrlParams strmTrackingUrlParams;
    private PriorityTaskManager upstreamPriorityTaskManager;
    private String vsid;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("workersExecutorService", 0, "getWorkersExecutorService()Ljava/util/concurrent/ExecutorService;", PreloadManagerBuilder.class), oyr.B(qoi0.a, PreloadManagerBuilder.class, "maxSimultaneousDownloads", "getMaxSimultaneousDownloads()I", 0), new MutablePropertyReference1Impl("preloadCacheProvider", 0, "getPreloadCacheProvider()Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", PreloadManagerBuilder.class), new MutablePropertyReference1Impl("upstreamDataSourceFactory", 0, "getUpstreamDataSourceFactory()Landroidx/media3/datasource/DataSource$Factory;", PreloadManagerBuilder.class), new MutablePropertyReference1Impl("bandwidthMeter", 0, "getBandwidthMeter()Landroidx/media3/exoplayer/upstream/BandwidthMeter;", PreloadManagerBuilder.class), new MutablePropertyReference1Impl("trackSelectorFactoryBuilder", 0, "getTrackSelectorFactoryBuilder()Lkotlin/jvm/functions/Function1;", PreloadManagerBuilder.class), new MutablePropertyReference1Impl("deviceInfoProvider", 0, "getDeviceInfoProvider()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", PreloadManagerBuilder.class)};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final YandexCacheKeyFactory defaultCacheKeyFactory = new YandexCacheKeyFactory(true, true, true);

    /* renamed from: workersExecutorService$delegate, reason: from kotlin metadata */
    private final xbi0 workersExecutorService = new qf60();

    /* renamed from: maxSimultaneousDownloads$delegate, reason: from kotlin metadata */
    private final xbi0 maxSimultaneousDownloads = new qf60();

    /* renamed from: preloadCacheProvider$delegate, reason: from kotlin metadata */
    private final xbi0 preloadCacheProvider = new qf60();

    /* renamed from: upstreamDataSourceFactory$delegate, reason: from kotlin metadata */
    private final xbi0 upstreamDataSourceFactory = new qf60();

    /* renamed from: bandwidthMeter$delegate, reason: from kotlin metadata */
    private final xbi0 bandwidthMeter = new qf60();

    /* renamed from: trackSelectorFactoryBuilder$delegate, reason: from kotlin metadata */
    private final xbi0 trackSelectorFactoryBuilder = new qf60();

    /* renamed from: deviceInfoProvider$delegate, reason: from kotlin metadata */
    private final xbi0 deviceInfoProvider = new qf60();
    private List<String> slots = EmptyList.a;
    private long trackFetchTimeoutInSec = 60;
    private long trackPreloadTimeoutInSec = 10;

    public PreloadManagerBuilder(Context context) {
        this.context = context;
    }

    private final PreloadEventTracker createEventTracker(InfoProvider infoProvider) {
        OkHttpClient okHttpClient = this.strmOkHttpClient;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        OkHttpClient okHttpClient2 = okHttpClient;
        ExecutorService executorService = this.strmTrackingExecutorService;
        if (executorService == null) {
            executorService = Executors.newSingleThreadExecutor(new p16(Executors.defaultThreadFactory(), 10));
        }
        ExecutorService executorService2 = executorService;
        JsonConverter jsonConverter = this.jsonConverter;
        if (jsonConverter == null) {
            jsonConverter = new JsonConverterImpl();
        }
        JsonConverter jsonConverter2 = jsonConverter;
        PlayerLogger playerLogger = this.strmErrorLogger;
        if (playerLogger == null) {
            playerLogger = new DummyPlayerLogger();
        }
        return new PreloadEventTracker(new StrmTrackingApi(okHttpClient2, executorService2, jsonConverter2, infoProvider, playerLogger, this.strmTrackingUrlParams), createTrackingArguments$video_player_internalRelease(infoProvider), this.contentIdProvider, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread createEventTracker$lambda$40$lambda$39(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:PreloadEventTracker");
        return newThread;
    }

    private final db7 defaultCacheDataSourceFactory(ra7 cache) {
        ipg cacheDataSourceFactory = getPreloadCacheProvider().getCacheDataSourceFactory(getUpstreamDataSourceFactory());
        db7 db7Var = cacheDataSourceFactory instanceof db7 ? (db7) cacheDataSourceFactory : null;
        if (db7Var != null) {
            return db7Var;
        }
        db7 db7Var2 = new db7();
        db7Var2.a = cache;
        db7Var2.y = getUpstreamDataSourceFactory();
        db7Var2.w = defaultCacheKeyFactory;
        return db7Var2;
    }

    private final YandexDownloaderFactory defaultDownloaderFactory(db7 cachedDataSourceFactory) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(getMaxSimultaneousDownloads(), new p16(Executors.defaultThreadFactory(), 11));
        this.downloaderExecutorService = newFixedThreadPool;
        return ExoDownloaderFactoryKt.getExoDownloaderFactory(cachedDataSourceFactory, newFixedThreadPool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread defaultDownloaderFactory$lambda$34$lambda$33(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:PM:download");
        return newThread;
    }

    private final ip4 getBandwidthMeter() {
        return (ip4) this.bandwidthMeter.getValue(this, $$delegatedProperties[4]);
    }

    private final DeviceInfoProvider getDeviceInfoProvider() {
        return (DeviceInfoProvider) this.deviceInfoProvider.getValue(this, $$delegatedProperties[6]);
    }

    private final int getMaxSimultaneousDownloads() {
        return ((Number) this.maxSimultaneousDownloads.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final PreloadCacheProvider getPreloadCacheProvider() {
        return (PreloadCacheProvider) this.preloadCacheProvider.getValue(this, $$delegatedProperties[2]);
    }

    private final tls getTrackSelectorFactoryBuilder() {
        return (tls) this.trackSelectorFactoryBuilder.getValue(this, $$delegatedProperties[5]);
    }

    private final ipg getUpstreamDataSourceFactory() {
        return (ipg) this.upstreamDataSourceFactory.getValue(this, $$delegatedProperties[3]);
    }

    private final ExecutorService getWorkersExecutorService() {
        return (ExecutorService) this.workersExecutorService.getValue(this, $$delegatedProperties[0]);
    }

    private final void setBandwidthMeter(ip4 ip4Var) {
        this.bandwidthMeter.setValue(this, $$delegatedProperties[4], ip4Var);
    }

    private final void setDeviceInfoProvider(DeviceInfoProvider deviceInfoProvider) {
        this.deviceInfoProvider.setValue(this, $$delegatedProperties[6], deviceInfoProvider);
    }

    private final void setMaxSimultaneousDownloads(int i) {
        this.maxSimultaneousDownloads.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    private final void setPreloadCacheProvider(PreloadCacheProvider preloadCacheProvider) {
        this.preloadCacheProvider.setValue(this, $$delegatedProperties[2], preloadCacheProvider);
    }

    private final void setTrackSelectorFactoryBuilder(tls tlsVar) {
        this.trackSelectorFactoryBuilder.setValue(this, $$delegatedProperties[5], tlsVar);
    }

    private final void setUpstreamDataSourceFactory(ipg ipgVar) {
        this.upstreamDataSourceFactory.setValue(this, $$delegatedProperties[3], ipgVar);
    }

    private final void setWorkersExecutorService(ExecutorService executorService) {
        this.workersExecutorService.setValue(this, $$delegatedProperties[0], executorService);
    }

    public final PreloadManagerBuilder bandwidthMeter(ip4 bandwidthMeter) {
        setBandwidthMeter(bandwidthMeter);
        return this;
    }

    public final PreloadManager build() {
        InfoProviderImpl infoProviderImpl = new InfoProviderImpl(this.context);
        ra7 cache$default = CacheProvider.getCache$default(getPreloadCacheProvider(), null, 1, null);
        if (cache$default == null) {
            return new NoOpPreloadManager(createEventTracker(infoProviderImpl), getPreloadCacheProvider().getCacheInitializationException(), null, 4, null);
        }
        db7 defaultCacheDataSourceFactory = defaultCacheDataSourceFactory(cache$default);
        defaultCacheDataSourceFactory.z = this.upstreamPriorityTaskManager;
        defaultCacheDataSourceFactory.A = -4000;
        db7 defaultCacheDataSourceFactory2 = defaultCacheDataSourceFactory(cache$default);
        String str = this.vsid;
        AbFlags flags = str != null ? UtilKt.getConfigOrDefault(YandexPlayerAbConfigManager.INSTANCE.getInstanceOrNull$video_player_internalRelease(), str).getFlags() : null;
        if (this.downloaderFactory == null) {
            this.downloaderFactory = defaultDownloaderFactory(defaultCacheDataSourceFactory);
        }
        SharedPreferences provideYandexPlayerSharedPreferences$video_player_internalRelease = InternalDiUtil.INSTANCE.provideYandexPlayerSharedPreferences$video_player_internalRelease(this.context);
        UserQualityRepositoryImpl userQualityRepositoryImpl = new UserQualityRepositoryImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease);
        AesthetePreferenceProviderImpl aesthetePreferenceProviderImpl = new AesthetePreferenceProviderImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease);
        SurfaceSizeHolderInternal surfaceSizeHolderInternal = new SurfaceSizeHolderInternal(Integer.MAX_VALUE, Integer.MAX_VALUE, this.shouldConsiderSelectedUserQuality);
        Integer num = this.serviceQuality;
        if (num != null) {
            surfaceSizeHolderInternal.setServiceQuality(num.intValue());
        }
        ExoRenderersFactory ExoRenderersFactory$default = ExoRenderersFactoryKt.ExoRenderersFactory$default(this.context, null, 2, null);
        ExecutorService workersExecutorService = getWorkersExecutorService();
        int maxSimultaneousDownloads = getMaxSimultaneousDownloads();
        ExecutorService executorService = this.downloaderExecutorService;
        YandexDownloaderFactory yandexDownloaderFactory = this.downloaderFactory;
        ip4 bandwidthMeter = getBandwidthMeter();
        tls trackSelectorFactoryBuilder = getTrackSelectorFactoryBuilder();
        PreloadManager.Listener listener = this.listener;
        List singletonList = Collections.singletonList(createEventTracker(infoProviderImpl));
        long j = this.trackFetchTimeoutInSec;
        long j2 = this.trackPreloadTimeoutInSec;
        pb7 cacheKeyFactory$default = CacheProvider.getCacheKeyFactory$default(getPreloadCacheProvider(), null, 1, null);
        if (cacheKeyFactory$default == null) {
            cacheKeyFactory$default = defaultCacheKeyFactory;
        }
        pb7 pb7Var = cacheKeyFactory$default;
        Handler handler = this.handler;
        if (handler == null) {
            handler = tw21.o(null);
        }
        return new PreloadManagerImpl(workersExecutorService, maxSimultaneousDownloads, executorService, yandexDownloaderFactory, cache$default, defaultCacheDataSourceFactory2, bandwidthMeter, ExoRenderersFactory$default, trackSelectorFactoryBuilder, listener, singletonList, null, j, j2, pb7Var, handler, this.releaseCacheOnShutdown, flags != null ? flags.getEnableHevc() : false, flags != null ? flags.getIgnoreMinHeightWithService() : false, flags != null ? flags.getIgnoreMaxHeightWithService() : false, userQualityRepositoryImpl, aesthetePreferenceProviderImpl, surfaceSizeHolderInternal, 2048, null);
    }

    public final PreloadManagerBuilder cacheProvider(PreloadCacheProvider preloadCacheProvider) {
        setPreloadCacheProvider(preloadCacheProvider);
        return this;
    }

    public final TrackingCommonArguments createTrackingArguments$video_player_internalRelease(InfoProvider infoProvider) {
        AppInfo appInfo = infoProvider.getAppInfo();
        Map<String, Object> deviceInfoDto = DeviceInfoDtoKt.toDeviceInfoDto(getDeviceInfoProvider().getInfo());
        List<String> list = this.slots;
        if (list.isEmpty()) {
            list = null;
        }
        return new TrackingCommonArguments(DefaultStrmManagerConfig.ANDROID_PLAYER_TELEMETRY_SERVICE, "", appInfo, deviceInfoDto, null, list != null ? kotlin.collections.a.X(list, ";", null, null, null, 62) : null, Companion.toIntTestIds(this.slots), null, this.from, null, -1, null, infoProvider.getVpuid());
    }

    public final PreloadManagerBuilder deviceInfoProvider(DeviceInfoProvider provider) {
        setDeviceInfoProvider(provider);
        return this;
    }

    public final PreloadManagerBuilder downloadExecutorService(ExecutorService executorService) {
        setWorkersExecutorService(executorService);
        return this;
    }

    public final PreloadManagerBuilder downloaderFactory(YandexDownloaderFactory yandexDownloaderFactory) {
        this.downloaderFactory = yandexDownloaderFactory;
        return this;
    }

    public final PreloadManagerBuilder handler(Handler handler) {
        this.handler = handler;
        return this;
    }

    public final PreloadManagerBuilder jsonConverter(JsonConverter converter) {
        this.jsonConverter = converter;
        return this;
    }

    public final PreloadManagerBuilder listener(PreloadManager.Listener listener) {
        this.listener = listener;
        return this;
    }

    public final PreloadManagerBuilder maxSimultaneousDownloads(int maxSimultaneousDownloads) {
        setMaxSimultaneousDownloads(maxSimultaneousDownloads);
        return this;
    }

    public final PreloadManagerBuilder releaseCacheOnShutdown(boolean releaseCacheOnShutdown) {
        this.releaseCacheOnShutdown = releaseCacheOnShutdown;
        return this;
    }

    public final PreloadManagerBuilder setContentIdProvider(ContentIdProvider provider) {
        this.contentIdProvider = provider;
        return this;
    }

    public final PreloadManagerBuilder setFrom(String value) {
        this.from = value;
        return this;
    }

    public final PreloadManagerBuilder setServiceQuality(int serviceQuality) {
        this.serviceQuality = Integer.valueOf(serviceQuality);
        return this;
    }

    public final void setStrmTrackingUrlParams(UrlParams strmTrackingUrl) {
        this.strmTrackingUrlParams = strmTrackingUrl;
    }

    public final PreloadManagerBuilder setTestIds(List<String> testIds) {
        this.slots = testIds;
        return this;
    }

    public final PreloadManagerBuilder setVsid(String vsid) {
        this.vsid = vsid;
        return this;
    }

    public final PreloadManagerBuilder shouldConsiderSelectedUserQuality(boolean value) {
        this.shouldConsiderSelectedUserQuality = value;
        return this;
    }

    public final PreloadManagerBuilder strmErrorLogger(PlayerLogger logger) {
        this.strmErrorLogger = logger;
        return this;
    }

    public final PreloadManagerBuilder strmOkHttpClient(OkHttpClient okHttpClient) {
        this.strmOkHttpClient = okHttpClient;
        return this;
    }

    public final PreloadManagerBuilder strmTrackingExecutorService(ExecutorService executorService) {
        this.strmTrackingExecutorService = executorService;
        return this;
    }

    public final PreloadManagerBuilder trackFetchTimeoutInSec(long trackFetchTimeoutInSec) {
        if (5 > trackFetchTimeoutInSec || trackFetchTimeoutInSec >= 121) {
            h5z0.a.o(qv10.k(trackFetchTimeoutInSec, "Custom trackFetchTimeoutInSec is invalid. Standard value of ", " will be used."), new Object[0]);
            return this;
        }
        this.trackFetchTimeoutInSec = trackFetchTimeoutInSec;
        return this;
    }

    public final PreloadManagerBuilder trackPreloadTimeoutInSec(long trackPreloadTimeoutInSec) {
        if (5 > trackPreloadTimeoutInSec || trackPreloadTimeoutInSec >= 241) {
            h5z0.a.o(qv10.k(trackPreloadTimeoutInSec, "Custom trackFetchTimeoutInSec is invalid. Standard value of ", " will be used."), new Object[0]);
            return this;
        }
        this.trackPreloadTimeoutInSec = trackPreloadTimeoutInSec;
        return this;
    }

    public final PreloadManagerBuilder trackSelectorFactoryBuilder(tls trackSelectorFactoryBuilder) {
        setTrackSelectorFactoryBuilder(trackSelectorFactoryBuilder);
        return this;
    }

    public final PreloadManagerBuilder upstreamDataSourceFactory(ipg upstreamDataSourceFactory) {
        setUpstreamDataSourceFactory(upstreamDataSourceFactory);
        return this;
    }

    public final PreloadManagerBuilder upstreamPriorityTaskManager(PriorityTaskManager upstreamPriorityTaskManager) {
        this.upstreamPriorityTaskManager = upstreamPriorityTaskManager;
        return this;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadManagerBuilder$Companion;", "", "()V", "MAXIMUM_TRACK_FETCH_TIMEOUT_IN_SEC", "", "MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC", "MINIMAL_TRACK_ANY_TIMEOUT_IN_SEC", "defaultCacheKeyFactory", "Lru/yandex/video/m3/YandexCacheKeyFactory;", "getDefaultCacheKeyFactory", "()Lru/yandex/video/m3/YandexCacheKeyFactory;", "toIntTestIds", "", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Integer> toIntTestIds(List<String> list) {
            List W;
            if (list.isEmpty()) {
                return EmptyList.a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                W = evu0.W((String) it.next(), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                String str = (String) kotlin.collections.a.R(W);
                Integer l = str != null ? bvu0.l(10, str) : null;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }

        public final YandexCacheKeyFactory getDefaultCacheKeyFactory() {
            return PreloadManagerBuilder.defaultCacheKeyFactory;
        }

        private Companion() {
        }
    }
}
