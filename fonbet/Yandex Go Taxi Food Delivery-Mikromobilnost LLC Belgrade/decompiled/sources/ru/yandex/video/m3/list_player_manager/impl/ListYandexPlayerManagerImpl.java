package ru.yandex.video.m3.list_player_manager.impl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import defpackage.bvf0;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.debug.DebugViewToggleManager;
import ru.yandex.video.m3.debug.DebugViewToggleManagerImpl;
import ru.yandex.video.m3.debug.DecoderUsageListener;
import ru.yandex.video.m3.debug.ListSdkDebugDataManager;
import ru.yandex.video.m3.debug.SpeedTelemetryObservable;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListPlayerManagerEventTracker;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryRegistry;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.BitmapDownloaderFactory;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.pool.ForceEnginePoolError;
import ru.yandex.video.m3.list_player_manager.pool.GetEngineFromPausePlayerError;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView;

@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u007f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0017¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0017¢\u0006\u0004\b.\u0010-J\u001d\u0010/\u001a\u00020+2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020+2\u0006\u00100\u001a\u00020%H\u0017¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020+2\b\u00106\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b7\u00108J\u0019\u00107\u001a\u00020+2\b\u00106\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0004\b7\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0017¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020+2\u0006\u00100\u001a\u00020=2\u0006\u0010>\u001a\u00020)H\u0016¢\u0006\u0004\b?\u0010@J+\u0010C\u001a\u00020+2\u0006\u00100\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010>\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010H\u001a\u00020+2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020EH\u0016¢\u0006\u0004\bH\u0010IJ!\u0010L\u001a\u00020+2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ#\u0010P\u001a\u00020+2\u0006\u0010>\u001a\u00020)2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030NH\u0016¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020+2\u0006\u0010>\u001a\u00020)2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030NH\u0016¢\u0006\u0004\bR\u0010QJ%\u0010U\u001a\u00020+2\u0006\u00100\u001a\u00020=2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020=0SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020+2\u0006\u00100\u001a\u00020=2\u0006\u0010W\u001a\u00020=H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020+2\u0006\u0010Z\u001a\u00020EH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020+2\u0006\u0010>\u001a\u00020)H\u0016¢\u0006\u0004\b]\u0010^J\u001f\u0010a\u001a\u00020+2\u0006\u0010>\u001a\u00020)2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020+2\u0006\u0010>\u001a\u00020)H\u0016¢\u0006\u0004\bc\u0010^J\u0017\u0010d\u001a\u00020+2\u0006\u0010>\u001a\u00020)H\u0016¢\u0006\u0004\bd\u0010^J\u001f\u0010h\u001a\u00020+2\u0006\u0010e\u001a\u00020E2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ'\u0010n\u001a\u00020+2\u0006\u0010e\u001a\u00020E2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ'\u0010p\u001a\u00020+2\u0006\u0010e\u001a\u00020E2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bp\u0010oJ'\u0010q\u001a\u00020+2\u0006\u0010e\u001a\u00020E2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bq\u0010oJ\u001f\u0010s\u001a\u00020+2\u0006\u0010r\u001a\u00020A2\u0006\u0010>\u001a\u00020)H\u0003¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020+2\u0006\u0010r\u001a\u00020AH\u0003¢\u0006\u0004\bu\u0010vJ\u0019\u0010w\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u0004\u0018\u00010y*\u0004\u0018\u00010yH\u0002¢\u0006\u0004\bz\u0010{R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010|R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010}R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010~R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u007fR\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0080\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0081\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0082\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0083\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0084\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0085\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0086\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0087\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0088\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010\u0089\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u008a\u0001R\u001f\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0081\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0088\u0001R*\u0010\u009a\u0001\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009e\u0001"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerImpl;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManagerListener;", "Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManagerListener;", "Lru/yandex/video/m3/debug/DecoderUsageListener;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManager;", "engineReuseManager", "Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager;", "videoPreloadManager", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;", "listViewTelemetryRegistry", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "absoluteItems", "", "listSdkVsid", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "listPlayerManagerEventTracker", "Lru/yandex/video/m3/debug/SpeedTelemetryObservable;", "speedTelemetryObservable", "Lru/yandex/video/m3/list_player_manager/impl/ypfactories/BitmapDownloaderFactory;", "bitmapDownloaderFactory", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "listPlayerManagerAudioControl", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "preloadCacheProvider", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "listSdkDebugDataManager", "", "isFailFast", "Ltse;", "scope", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "debugViewToggleManager", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManager;Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager;Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;Ljava/lang/String;Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;Lru/yandex/video/m3/debug/SpeedTelemetryObservable;Lru/yandex/video/m3/list_player_manager/impl/ypfactories/BitmapDownloaderFactory;Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;Lru/yandex/video/m3/debug/ListSdkDebugDataManager;ZLtse;Lru/yandex/video/m3/debug/DebugViewToggleManager;)V", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "getPlayer", "()Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaDataList", "Lzy11;", "updateItemsList", "(Ljava/util/List;)V", "updateVisibleItemsList", "prepareItems", "player", "returnPlayer", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;)V", "release", "()V", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "setCurrentActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "sendDebugReport", "()Ljava/lang/String;", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "mediaData", "onItemAttachedToListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "onItemDetachedFromListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "", "width", "height", "onPlayerAttachedToViewWithSize", "(II)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onItemVideoDataLoaded", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/data/dto/VideoData;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "onEngineAttachedToMediaData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetachedToMediaData", "", "playersWithAttachedEngines", "onForceEngineAcquire", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Ljava/util/Set;)V", "playerWithDetachedEngine", "onGetEngineFromOtherPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "count", "onListPlayerCountChanged", "(I)V", "onPreloadStarted", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "", "bytes", "onPreloadSuccess", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;J)V", "onPreloadCanceled", "onPreloadError", "engineIndex", "Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;", "decoderFallbackData", "onVideoDecoderFallback", "(ILru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", Constants.KEY_DATA, "onDecoderInitialized", "(ILru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "view", "onItemAssignedToView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "onItemClearedFromView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "mediaDataListToLogString", "(Ljava/util/List;)Ljava/lang/String;", "Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;", "checkAccess", "(Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;)Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManager;", "Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "Ljava/lang/String;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "Lru/yandex/video/m3/debug/SpeedTelemetryObservable;", "Lru/yandex/video/m3/list_player_manager/impl/ypfactories/BitmapDownloaderFactory;", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "Z", "Ltse;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerDebugListener;", "debugObservers", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "TAG", "Ll8x;", "observersControllerJob", "Ll8x;", "Lru/yandex/video/m3/ui/debug/ListYandexPlayerManagerDebugView;", "debugView", "Lru/yandex/video/m3/ui/debug/ListYandexPlayerManagerDebugView;", "bitmapDownloader", "Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;", "cacheInitErrorSent", "value", "isDebugViewEnabled", "()Z", "setDebugViewEnabled", "(Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerImpl implements ListYandexPlayerManager, EngineReuseManagerListener, VideoPreloadManagerListener, DecoderUsageListener {
    public static final int $stable = 8;
    private final ItemsListAbsoluteIndicesAdapter absoluteItems;
    private GlideBitmapDownloader bitmapDownloader;
    private final BitmapDownloaderFactory bitmapDownloaderFactory;
    private boolean cacheInitErrorSent;
    private ListYandexPlayerManagerDebugView debugView;
    private final DebugViewToggleManager debugViewToggleManager;
    private final EngineReuseManager engineReuseManager;
    private final boolean isFailFast;
    private final ListPlayerManagerAudioControl listPlayerManagerAudioControl;
    private final ListPlayerManagerEventTracker listPlayerManagerEventTracker;
    private final ListSdkDebugDataManager listSdkDebugDataManager;
    private final String listSdkVsid;
    private final ListViewTelemetryRegistry listViewTelemetryRegistry;
    private l8x observersControllerJob;
    private final PlayerLogger playerLogger;
    private final PreloadCacheProvider preloadCacheProvider;
    private final tse scope;
    private final SpeedTelemetryObservable speedTelemetryObservable;
    private final VideoPreloadManager videoPreloadManager;
    private final ObserverDispatcher<ListYandexPlayerManagerDebugListener> debugObservers = new ObserverDispatcher<>();
    private final String TAG = "LPM";

    public ListYandexPlayerManagerImpl(PlayerLogger playerLogger, EngineReuseManager engineReuseManager, VideoPreloadManager videoPreloadManager, ListViewTelemetryRegistry listViewTelemetryRegistry, ItemsListAbsoluteIndicesAdapter itemsListAbsoluteIndicesAdapter, String str, ListPlayerManagerEventTracker listPlayerManagerEventTracker, SpeedTelemetryObservable speedTelemetryObservable, BitmapDownloaderFactory bitmapDownloaderFactory, ListPlayerManagerAudioControl listPlayerManagerAudioControl, PreloadCacheProvider preloadCacheProvider, ListSdkDebugDataManager listSdkDebugDataManager, boolean z, tse tseVar, DebugViewToggleManager debugViewToggleManager) {
        this.playerLogger = playerLogger;
        this.engineReuseManager = engineReuseManager;
        this.videoPreloadManager = videoPreloadManager;
        this.listViewTelemetryRegistry = listViewTelemetryRegistry;
        this.absoluteItems = itemsListAbsoluteIndicesAdapter;
        this.listSdkVsid = str;
        this.listPlayerManagerEventTracker = listPlayerManagerEventTracker;
        this.speedTelemetryObservable = speedTelemetryObservable;
        this.bitmapDownloaderFactory = bitmapDownloaderFactory;
        this.listPlayerManagerAudioControl = listPlayerManagerAudioControl;
        this.preloadCacheProvider = preloadCacheProvider;
        this.listSdkDebugDataManager = listSdkDebugDataManager;
        this.isFailFast = z;
        this.scope = tseVar;
        this.debugViewToggleManager = debugViewToggleManager;
        engineReuseManager.setEngineReuseManagerListener(this);
        engineReuseManager.setDecoderUsageListener(this);
        videoPreloadManager.setVideoPreloadManagerListener(this);
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, "LPM", "init", null, new Object[0], 4, null);
        }
        this.observersControllerJob = kotlinx.coroutines.flow.e.H(tseVar, new jqr(debugViewToggleManager.getIsDebugViewEnabled(), new AnonymousClass2(null), 3));
    }

    private final GlideBitmapDownloader checkAccess(GlideBitmapDownloader glideBitmapDownloader) {
        if (glideBitmapDownloader == null) {
            UtilKt.throwError(this.isFailFast, new IllegalStateException("try access bitmapDownloader, but it is null. Call ListYandexPlayerManager.setCurrentActivity first"), this.playerLogger, this.TAG, "access bitmapDownloader", "try access bitmapDownloader, but it is null. Call ListYandexPlayerManager.setCurrentActivity first");
        }
        return glideBitmapDownloader;
    }

    private final String mediaDataListToLogString(List<MediaData> list) {
        List<MediaData> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (MediaData mediaData : list2) {
            arrayList.add(mediaData.getVideoContentId() + Extension.O_BRAKE_SPACE + mediaData.getStreams().size() + ')');
        }
        return kotlin.collections.a.X(arrayList, null, null, null, null, 63);
    }

    private final void onItemAssignedToView(ListYandexPlayerView view, MediaData mediaData) {
        view.setFirstFrameUntilPlay(mediaData.getShowFirstFrameUntilPlay());
        GlideBitmapDownloader checkAccess = checkAccess(this.bitmapDownloader);
        if (checkAccess != null) {
            checkAccess.onSourceSetForView(view, mediaData);
        }
    }

    private final void onItemClearedFromView(ListYandexPlayerView view) {
        GlideBitmapDownloader checkAccess = checkAccess(this.bitmapDownloader);
        if (checkAccess != null) {
            checkAccess.onSourceClearedFromView(view);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public ListYandexPlayer getPlayer() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, this.TAG, "getPlayer", null, new Object[0], 4, null);
        }
        InternalListYandexPlayer player = this.engineReuseManager.getPlayer();
        this.listPlayerManagerAudioControl.onGet(player);
        PlayerLogger playerLogger2 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(this.TAG, "getPlayer", "returned player index = " + player.getListPlayerIndex(), new Object[0]);
        }
        return player;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public boolean isDebugViewEnabled() {
        return DebugViewToggleManagerImpl.INSTANCE.isEnabled$video_player_internalRelease(this.debugViewToggleManager);
    }

    @Override // ru.yandex.video.m3.debug.DecoderUsageListener
    public void onDecoderDiscarded(int engineIndex, TrackType trackType, DecoderEventData data) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onDecoderDiscarded(engineIndex, trackType, data);
        }
    }

    @Override // ru.yandex.video.m3.debug.DecoderUsageListener
    public void onDecoderInitialized(int engineIndex, TrackType trackType, DecoderEventData data) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onDecoderInitialized(engineIndex, trackType, data);
        }
    }

    @Override // ru.yandex.video.m3.debug.DecoderUsageListener
    public void onDecoderReused(int engineIndex, TrackType trackType, DecoderEventData data) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onDecoderReused(engineIndex, trackType, data);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onEngineAttachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer) {
        HashSet H0;
        PreloadException.CacheInitException cacheInitializationException;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onEngineAttachedToMediaData(mediaData, yandexPlayer);
        }
        if (this.cacheInitErrorSent || (cacheInitializationException = this.preloadCacheProvider.getCacheInitializationException()) == null) {
            return;
        }
        this.listPlayerManagerEventTracker.reportCacheInitError(cacheInitializationException);
        this.cacheInitErrorSent = true;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onEngineDetachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onEngineDetachedToMediaData(mediaData, yandexPlayer);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onForceEngineAcquire(InternalListYandexPlayer player, Set<? extends InternalListYandexPlayer> playersWithAttachedEngines) {
        try {
            ListPlayerManagerEventTracker listPlayerManagerEventTracker = this.listPlayerManagerEventTracker;
            int listPlayerIndex = player.getListPlayerIndex();
            PlaybackConfig playbackConfig = player.getPlaybackConfig();
            Set<? extends InternalListYandexPlayer> set = playersWithAttachedEngines;
            ArrayList arrayList = new ArrayList(tcc.n(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((InternalListYandexPlayer) it.next()).getListPlayerIndex()));
            }
            listPlayerManagerEventTracker.reportPoolError(new ForceEnginePoolError(listPlayerIndex, playbackConfig, arrayList));
        } catch (Exception e) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "onForceEngineAcquire", null, e, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onGetEngineFromOtherPlayer(InternalListYandexPlayer player, InternalListYandexPlayer playerWithDetachedEngine) {
        try {
            this.listPlayerManagerEventTracker.reportPoolError(new GetEngineFromPausePlayerError(player.getListPlayerIndex(), playerWithDetachedEngine.getListPlayerIndex()));
        } catch (Exception e) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "onGetEngineFromOtherPlayer", null, e, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onItemAttachedToListPlayer(InternalListYandexPlayer player, MediaData mediaData) {
        HashSet H0;
        ListYandexPlayerView listYandexPlayerView = player.getListYandexPlayerView();
        if (listYandexPlayerView != null) {
            onItemAssignedToView(listYandexPlayerView, mediaData);
        }
        this.videoPreloadManager.notifyItemAttachedToListPlayer(mediaData);
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onItemAttachedToListPlayer(player, mediaData);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onItemDetachedFromListPlayer(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
        if (listYandexPlayerView != null) {
            onItemClearedFromView(listYandexPlayerView);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onItemVideoDataLoaded(ListYandexPlayerView listYandexPlayerView, VideoData videoData) {
        GlideBitmapDownloader checkAccess;
        if (listYandexPlayerView == null || (checkAccess = checkAccess(this.bitmapDownloader)) == null) {
            return;
        }
        checkAccess.onVideoDataLoadedForView(listYandexPlayerView, videoData);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onListPlayerCountChanged(int count) {
        if (count == 0) {
            this.listViewTelemetryRegistry.onAllListPlayersDestroyed();
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.EngineReuseManagerListener
    public void onPlayerAttachedToViewWithSize(int width, int height) {
        if (width <= 0 || height <= 0) {
            return;
        }
        this.videoPreloadManager.setActualViewSize(width, height);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManagerListener
    public void onPreloadCanceled(MediaData mediaData) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onPreloadCanceled(mediaData);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManagerListener
    public void onPreloadError(MediaData mediaData) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onPreloadError(mediaData);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManagerListener
    public void onPreloadStarted(MediaData mediaData) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onPreloadStarted(mediaData);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManagerListener
    public void onPreloadSuccess(MediaData mediaData, long bytes) {
        HashSet H0;
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onPreloadSuccess(mediaData, bytes);
        }
    }

    @Override // ru.yandex.video.m3.debug.DecoderUsageListener
    public void onVideoDecoderFallback(int engineIndex, DecoderFallbackData decoderFallbackData) {
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void prepareItems(List<MediaData> mediaDataList) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "prepareItems", mediaDataListToLogString(mediaDataList), new Object[0]);
        }
        this.videoPreloadManager.preloadItems(mediaDataList);
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void release() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, this.TAG, "release", null, new Object[0], 4, null);
        }
        ListYandexPlayerManagerInstanceProvider.INSTANCE.release$video_player_internalRelease();
        tse tseVar = this.scope;
        sjh sjhVar = uyj.a;
        tje.N(tseVar, o400.a, null, new ListYandexPlayerManagerImpl$release$2(this, null), 2).w(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerImpl$release$3
            {
                super(1);
            }

            public final void invoke(Throwable th) {
                tse tseVar2;
                tseVar2 = ListYandexPlayerManagerImpl.this.scope;
                bvf0.j(tseVar2, null);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void returnPlayer(ListYandexPlayer player) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("returning player index ");
            InternalListYandexPlayer internalListYandexPlayer = player instanceof InternalListYandexPlayer ? (InternalListYandexPlayer) player : null;
            sb.append(internalListYandexPlayer != null ? Integer.valueOf(internalListYandexPlayer.getListPlayerIndex()) : null);
            playerLogger.verbose(str, "returnPlayer", sb.toString(), new Object[0]);
        }
        this.listPlayerManagerAudioControl.onReturn(player);
        this.engineReuseManager.returnPlayer(InternalListYandexPlayer.INSTANCE.impl(player));
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public String sendDebugReport() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, this.TAG, "sendDebugReport", null, new Object[0], 4, null);
        }
        try {
            this.listPlayerManagerEventTracker.reportDebugReport();
        } catch (Exception e) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "sendDebugReport", null, e, new Object[0], 4, null);
        }
        return this.listSdkVsid;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void setCurrentActivity(FragmentActivity activity) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "setCurrentActivity", String.valueOf(activity), new Object[0]);
        }
        GlideBitmapDownloader glideBitmapDownloader = this.bitmapDownloader;
        if (glideBitmapDownloader != null) {
            glideBitmapDownloader.release();
        }
        this.bitmapDownloader = activity != null ? this.bitmapDownloaderFactory.create(this.absoluteItems, activity) : null;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void setDebugViewEnabled(boolean z) {
        this.debugViewToggleManager.enableDebugView(z);
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void updateItemsList(List<MediaData> mediaDataList) {
        HashSet H0;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "updateItemsList", mediaDataListToLogString(mediaDataList), new Object[0]);
        }
        this.absoluteItems.updateItems(mediaDataList);
        this.engineReuseManager.onUpdateItemsList(mediaDataList);
        this.videoPreloadManager.onUpdateItemsList(mediaDataList);
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onUpdateItemsList(mediaDataList);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void updateVisibleItemsList(List<MediaData> mediaDataList) {
        HashSet H0;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "updateVisibleItemsList", mediaDataListToLogString(mediaDataList), new Object[0]);
        }
        GlideBitmapDownloader checkAccess = checkAccess(this.bitmapDownloader);
        if (checkAccess != null) {
            checkAccess.onUpdateVisibleItemsList(mediaDataList);
        }
        this.engineReuseManager.onUpdateVisibleItemsList(mediaDataList);
        this.videoPreloadManager.onUpdateVisibleItemsList(mediaDataList);
        ObserverDispatcher<ListYandexPlayerManagerDebugListener> observerDispatcher = this.debugObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListYandexPlayerManagerDebugListener) it.next()).onUpdateVisibleItemsList(mediaDataList);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isDebugViewEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerImpl$2", f = "ListYandexPlayerManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerImpl$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ListYandexPlayerManagerImpl.this.new AnonymousClass2(continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z, Continuation<? super zy11> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            boolean z = this.Z$0;
            ListYandexPlayerManagerImpl listYandexPlayerManagerImpl = ListYandexPlayerManagerImpl.this;
            if (z) {
                listYandexPlayerManagerImpl.debugObservers.add((ObserverDispatcher) ListYandexPlayerManagerImpl.this.listSdkDebugDataManager);
            } else {
                listYandexPlayerManagerImpl.debugObservers.remove(ListYandexPlayerManagerImpl.this.listSdkDebugDataManager);
            }
            return zy11.a;
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super zy11>) obj2);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager
    public void setCurrentActivity(AppCompatActivity activity) {
        setCurrentActivity((FragmentActivity) activity);
    }
}
