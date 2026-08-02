package ru.yandex.video.m3.player.ui.debug.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.bvf0;
import defpackage.f4b1;
import defpackage.hua1;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.l8v;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pz40;
import defpackage.rol0;
import defpackage.s5g0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u92;
import defpackage.vz5;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver;
import ru.yandex.video.m3.player.ui.debug.internal.providers.BandwidthEstimateProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.BandwidthEstimateProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.BufferSizeProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.BufferSizeProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ContentProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ContentProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DrmModeProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DrmModeProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DroppedFramesProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DroppedFramesProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ErrorProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ErrorProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.TracksProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.TracksProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ViewPortSizeProviderImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ViewportSizeProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.composite.CompositePlayerAnalyticsObserver;
import ru.yandex.video.m3.player.ui.debug.internal.providers.composite.CompositePlayerObserver;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.player.ui.debug.util.PlayerDebugDataToStringConverter;
import ru.yandex.video.m3.player.utils.network.NetworkChangeListener;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\\B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020;0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010H\u001a\b\u0018\u00010GR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager;", "", "Ltse;", "coroutineScope", "<init>", "(Ltse;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Landroid/content/Context;", "context", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Landroid/content/Context;)V", "stop", "()V", "", "isCompact", "setCompact", "(Z)V", "", "getDebugDataString", "(Landroid/content/Context;)Ljava/lang/String;", "resetDebugData", "Ltse;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BufferSizeProvider;", "bufferSizeProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BufferSizeProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;", "contentProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;", "tracksProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BandwidthEstimateProvider;", "bandwidthEstimateProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BandwidthEstimateProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;", "decoderDataProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DrmModeProvider;", "drmModeProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DrmModeProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;", "droppedFramesProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;", "loadedChunksProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ViewportSizeProvider;", "viewPortSizeProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ViewportSizeProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ErrorProvider;", "errorProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ErrorProvider;", "Lpz40;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "_debugData", "Lpz40;", "Ln4u0;", "debugData", "Ln4u0;", "getDebugData", "()Ln4u0;", "Lru/yandex/video/m3/player/YandexPlayer;", "Ll8x;", "job", "Ll8x;", "Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager$DebugObserver;", "debugObserver", "Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager$DebugObserver;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "networkTypeProvider", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProvider;", "sessionColorProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProvider;", "Lru/yandex/video/m3/player/ui/debug/util/PlayerDebugDataToStringConverter;", "playerDebugDataToStringConverter", "Lru/yandex/video/m3/player/ui/debug/util/PlayerDebugDataToStringConverter;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/composite/CompositePlayerObserver;", "compositePlayerObserver", "Lru/yandex/video/m3/player/ui/debug/internal/providers/composite/CompositePlayerObserver;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/composite/CompositePlayerAnalyticsObserver;", "compositePlayerAnalyticsObserver", "Lru/yandex/video/m3/player/ui/debug/internal/providers/composite/CompositePlayerAnalyticsObserver;", "Ll8v;", "vsidBitmap", "Ll8v;", "DebugObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerDebugDataManager {
    public static final int $stable = 8;
    private final pz40 _debugData;
    private final BandwidthEstimateProvider bandwidthEstimateProvider;
    private final BufferSizeProvider bufferSizeProvider;
    private final CompositePlayerAnalyticsObserver compositePlayerAnalyticsObserver;
    private final CompositePlayerObserver compositePlayerObserver;
    private final ContentProvider contentProvider;
    private final tse coroutineScope;
    private final n4u0 debugData;
    private DebugObserver debugObserver;
    private final DecoderDataProvider decoderDataProvider;
    private final DrmModeProvider drmModeProvider;
    private final DroppedFramesProvider droppedFramesProvider;
    private final ErrorProvider errorProvider;
    private l8x job;
    private final LoadedChunksProvider loadedChunksProvider;
    private NetworkTypeProvider networkTypeProvider;
    private final ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher;
    private YandexPlayer<?> player;
    private final PlayerDebugDataToStringConverter playerDebugDataToStringConverter;
    private SessionColorProvider sessionColorProvider;
    private final TracksProvider tracksProvider;
    private final ViewportSizeProvider viewPortSizeProvider;
    private l8v vsidBitmap;

    @Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020(H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016¢\u0006\u0004\b6\u0010,J\u0017\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\tJ\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020F0BH\u0002¢\u0006\u0004\bG\u0010EJ\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020H0BH\u0002¢\u0006\u0004\bI\u0010EJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020J0BH\u0002¢\u0006\u0004\bK\u0010EJ\u0015\u0010M\u001a\b\u0012\u0004\u0012\u00020L0BH\u0002¢\u0006\u0004\bM\u0010EJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020N0BH\u0002¢\u0006\u0004\bO\u0010EJ\u0019\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020\u0005H\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0005H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020(H\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0007H\u0002¢\u0006\u0004\b[\u0010\\R\u001c\u0010_\u001a\n ^*\u0004\u0018\u00010]0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010bR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010bR\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010bR\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020$0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010bR\u001c\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010bR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010bR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010bR\u001c\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010bR\u001c\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010bR\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010bR\u001c\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010bR\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010bR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020h0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020j0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010rR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020l0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010r¨\u0006u"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager$DebugObserver;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "Lru/yandex/video/m3/player/utils/network/NetworkChangeListener;", "<init>", "(Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager;)V", "", "contentId", "Lzy11;", "onContentIdInitialized", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;", "videoType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "streamType", "onVideoAndStreamTypeInitialized", "(Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;)V", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "videoTrackData", "onVideoTrackChanged", "(Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "audioTrackData", "onAudioTrackChanged", "(Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "subtitlesTrackData", "onSubtitlesTrackChanged", "(Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "size", "onViewportSizeChanged", "(Lru/yandex/video/m3/player/ui/debug/model/Size;)V", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "drmMode", "onDrmInitialized", "(Lru/yandex/video/m3/player/ui/debug/model/DrmMode;)V", "", "count", "onFramesDropped", "(I)V", "", "estimationBytes", ClidProvider.TIMESTAMP, "onBandwidthEstimated", "(JJ)V", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bytesLoaded", "onBytesLoaded", "(Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;)V", "", "isSuccessful", "onChunkLoadAttempt", "(ZJ)V", "sizeMs", "onBufferSizeChanged", Constants.KEY_MESSAGE, "onError", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "videoDecoderData", "onVideoDecoderUpdated", "(Lru/yandex/video/m3/player/ui/debug/model/DecoderData;)V", "onAudioDecoderUpdated", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "networkType", "onNetworkChanged", "(Lru/yandex/video/m3/player/utils/network/NetworkType;)V", "Ltpr;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "debugDataFlow", "()Ltpr;", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "contentDataFlow", "Lru/yandex/video/m3/player/ui/debug/internal/model/TracksAndDecoders;", "tracksAndDecodersDataFlow", "Lru/yandex/video/m3/player/ui/debug/internal/model/TimerData;", "timerDataFlow", "Lru/yandex/video/m3/player/ui/debug/internal/model/OtherData;", "otherDataFlow", "Lru/yandex/video/m3/player/ui/debug/internal/model/History;", "historyFlow", "vsid", "Ll8v;", "obtainVsidBitmap", "(Ljava/lang/String;)Ll8v;", "Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "getLatency", "()Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "getDateTime", "()Ljava/lang/String;", "getTargetBuffer", "()J", "extractDataFromPlayer", "()V", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "calendar", "Ljava/util/Calendar;", "Lpz40;", "Lpz40;", "videoTrack", "audioTrack", "subtitlesTrack", "viewportSize", "droppedFrames", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "bandwidthEstimate", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "loadedChunk", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "bufferSize", "lastError", "audioDecoderData", "", "bandwidthHistory", "Ljava/util/List;", "chunksHistory", "bufferSizeHistory", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DebugObserver implements YandexDebugInfoObserver, NetworkChangeListener {
        private final Calendar calendar = Calendar.getInstance();
        private final pz40 contentId = bvf0.c(null);
        private final pz40 videoType = bvf0.c(null);
        private final pz40 streamType = bvf0.c(null);
        private final pz40 videoTrack = bvf0.c(null);
        private final pz40 audioTrack = bvf0.c(null);
        private final pz40 subtitlesTrack = bvf0.c(null);
        private final pz40 viewportSize = bvf0.c(null);
        private final pz40 drmMode = bvf0.c(null);
        private final pz40 droppedFrames = bvf0.c(0);
        private final pz40 bandwidthEstimate = bvf0.c(null);
        private final pz40 loadedChunk = bvf0.c(null);
        private final pz40 bytesLoaded = bvf0.c(null);
        private final pz40 bufferSize = bvf0.c(null);
        private final pz40 lastError = bvf0.c(null);
        private final pz40 videoDecoderData = bvf0.c(null);
        private final pz40 audioDecoderData = bvf0.c(null);
        private final pz40 networkType = bvf0.c(null);
        private final List<BandwidthEstimation> bandwidthHistory = new ArrayList();
        private final List<LoadedChunk> chunksHistory = new ArrayList();
        private final List<BufferSize> bufferSizeHistory = new ArrayList();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;)V"}, k = 3, mv = {1, 8, 0})
        @mvg(c = "ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$1", f = "YandexPlayerDebugDataManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager$DebugObserver$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ YandexPlayerDebugDataManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(YandexPlayerDebugDataManager yandexPlayerDebugDataManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = yandexPlayerDebugDataManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.wls
            public final Object invoke(DebugData debugData, Continuation<? super zy11> continuation) {
                return ((AnonymousClass1) create(debugData, continuation)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ((r0) this.this$0._debugData).l((DebugData) this.L$0);
                return zy11.a;
            }
        }

        public DebugObserver() {
            YandexPlayerDebugDataManager.this.job = e.H(YandexPlayerDebugDataManager.this.coroutineScope, new jqr(debugDataFlow(), new AnonymousClass1(YandexPlayerDebugDataManager.this, null), 3));
            extractDataFromPlayer();
        }

        private final tpr contentDataFlow() {
            return e.n(this.contentId, this.streamType, this.videoType, new YandexPlayerDebugDataManager$DebugObserver$contentDataFlow$1(null));
        }

        private final tpr debugDataFlow() {
            return e.l(contentDataFlow(), tracksAndDecodersDataFlow(), otherDataFlow(), historyFlow(), timerDataFlow(), new YandexPlayerDebugDataManager$DebugObserver$debugDataFlow$1(YandexPlayerDebugDataManager.this, this, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void extractDataFromPlayer() {
            YandexPlayer yandexPlayer = YandexPlayerDebugDataManager.this.player;
            if (yandexPlayer != null) {
                YandexPlayerDebugDataManager yandexPlayerDebugDataManager = YandexPlayerDebugDataManager.this;
                VideoType videoType = yandexPlayer.getVideoType();
                StreamType streamType = yandexPlayer.getStreamType();
                if (videoType != null && streamType != null) {
                    yandexPlayerDebugDataManager.compositePlayerAnalyticsObserver.onVideoAndStreamTypeChanged(videoType, streamType);
                }
                Track audioTrack = yandexPlayer.getAudioTrack();
                Track subtitlesTrack = yandexPlayer.getSubtitlesTrack();
                Track videoTrack = yandexPlayer.getVideoTrack();
                if (audioTrack != null && subtitlesTrack != null && videoTrack != null) {
                    yandexPlayerDebugDataManager.compositePlayerObserver.onTracksChanged(audioTrack, subtitlesTrack, videoTrack);
                }
                PlaybackStats playbackStats = yandexPlayer.getPlaybackStats();
                if (playbackStats != null) {
                    DrmType drmType = playbackStats.getDrmType();
                    if (drmType != null) {
                        yandexPlayerDebugDataManager.compositePlayerAnalyticsObserver.onDrmSessionAcquired(drmType);
                    }
                    Decoder videoDecoder = playbackStats.getVideoDecoder();
                    if (videoDecoder != null) {
                        pz40 pz40Var = this.videoDecoderData;
                        DecoderData decoderData = new DecoderData(videoDecoder.getName(), videoDecoder.getInits(), videoDecoder.getReuses(), videoDecoder.getReleases(), videoDecoder.getIsHardwareAccelerated());
                        r0 r0Var = (r0) pz40Var;
                        r0Var.getClass();
                        r0Var.m(null, decoderData);
                    }
                    Decoder audioDecoder = playbackStats.getAudioDecoder();
                    if (audioDecoder != null) {
                        pz40 pz40Var2 = this.audioDecoderData;
                        DecoderData decoderData2 = new DecoderData(audioDecoder.getName(), audioDecoder.getInits(), audioDecoder.getReuses(), audioDecoder.getReleases(), audioDecoder.getIsHardwareAccelerated());
                        r0 r0Var2 = (r0) pz40Var2;
                        r0Var2.getClass();
                        r0Var2.m(null, decoderData2);
                    }
                    Size surfaceSize = playbackStats.getSurfaceSize();
                    if (surfaceSize != null) {
                        pz40 pz40Var3 = this.viewportSize;
                        ru.yandex.video.m3.player.ui.debug.model.Size size = new ru.yandex.video.m3.player.ui.debug.model.Size(surfaceSize.getWidth(), surfaceSize.getHeight());
                        r0 r0Var3 = (r0) pz40Var3;
                        r0Var3.getClass();
                        r0Var3.m(null, size);
                    }
                }
                VideoData videoDataInternal = yandexPlayer.getVideoDataInternal();
                if (videoDataInternal != null) {
                    if (videoDataInternal instanceof VhVideoData) {
                        ((r0) this.contentId).l(((VhVideoData) videoDataInternal).getContentId());
                        return;
                    }
                    boolean z = videoDataInternal instanceof OttVideoData;
                    pz40 pz40Var4 = this.contentId;
                    if (!z) {
                        ((r0) pz40Var4).l(null);
                    } else {
                        ((r0) pz40Var4).l(((OttVideoData) videoDataInternal).getContentId());
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getDateTime() {
            return new SimpleDateFormat(oyr.j(this.calendar.getTimeZone().getRawOffset() / com.adjust.sdk.Constants.ONE_HOUR, "HH:mm:ss, 'UTC+'", ", MMMM d yyyy"), Locale.CANADA).format(this.calendar.getTime());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LatencyData getLatency() {
            long liveOffset;
            YandexPlayer yandexPlayer = YandexPlayerDebugDataManager.this.player;
            PlaybackStats playbackStats = yandexPlayer != null ? yandexPlayer.getPlaybackStats() : null;
            if (playbackStats != null) {
                liveOffset = playbackStats.getLiveOffset();
            } else {
                YandexPlayer yandexPlayer2 = YandexPlayerDebugDataManager.this.player;
                liveOffset = yandexPlayer2 != null ? yandexPlayer2.getLiveOffset() : -1L;
            }
            return new LatencyData(Long.valueOf(liveOffset), Long.valueOf(playbackStats != null ? playbackStats.getTargetLiveOffset() : -1L));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getTargetBuffer() {
            PlaybackStats playbackStats;
            YandexPlayer yandexPlayer = YandexPlayerDebugDataManager.this.player;
            if (yandexPlayer == null || (playbackStats = yandexPlayer.getPlaybackStats()) == null) {
                return 0L;
            }
            return playbackStats.getMaxTargetBufferMs();
        }

        private final tpr historyFlow() {
            return e.m(this.bandwidthEstimate, this.loadedChunk, this.bytesLoaded, this.bufferSize, new YandexPlayerDebugDataManager$DebugObserver$historyFlow$1(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l8v obtainVsidBitmap(String vsid) {
            if (YandexPlayerDebugDataManager.this.vsidBitmap != null && jl40.l(((DebugData) YandexPlayerDebugDataManager.this.getDebugData().getValue()).getVsid(), vsid)) {
                return YandexPlayerDebugDataManager.this.vsidBitmap;
            }
            vz5 a = new s5g0().a(vsid, BarcodeFormat.QR_CODE, 256, 256, null);
            u92 b = f4b1.b(256, 256, 2, 24);
            Bitmap a2 = hua1.a(b);
            for (int i = 0; i < 256; i++) {
                for (int i2 = 0; i2 < 256; i2++) {
                    if (a.b(i, i2)) {
                        a2.setPixel(i, i2, ModalContentViewContainer.BASE_SHADOW_COLOR);
                    } else {
                        a2.setPixel(i, i2, -1);
                    }
                }
            }
            YandexPlayerDebugDataManager.this.vsidBitmap = b;
            return b;
        }

        private final tpr otherDataFlow() {
            return e.l(this.viewportSize, this.drmMode, this.droppedFrames, this.lastError, this.networkType, new YandexPlayerDebugDataManager$DebugObserver$otherDataFlow$1(null));
        }

        private final tpr timerDataFlow() {
            return new rol0(new YandexPlayerDebugDataManager$DebugObserver$timerDataFlow$1(this, YandexPlayerDebugDataManager.this, null));
        }

        private final tpr tracksAndDecodersDataFlow() {
            return e.l(this.videoTrack, this.audioTrack, this.subtitlesTrack, this.videoDecoderData, this.audioDecoderData, new YandexPlayerDebugDataManager$DebugObserver$tracksAndDecodersDataFlow$1(null));
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onAudioDecoderUpdated(DecoderData videoDecoderData) {
            r0 r0Var = (r0) this.audioDecoderData;
            r0Var.getClass();
            r0Var.m(null, videoDecoderData);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onAudioTrackChanged(AudioTrackData audioTrackData) {
            r0 r0Var = (r0) this.audioTrack;
            r0Var.getClass();
            r0Var.m(null, audioTrackData);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onBandwidthEstimated(long estimationBytes, long timestamp) {
            BandwidthEstimation bandwidthEstimation = new BandwidthEstimation(timestamp, estimationBytes);
            r0 r0Var = (r0) this.bandwidthEstimate;
            r0Var.getClass();
            r0Var.m(null, bandwidthEstimation);
            this.bandwidthHistory.add(bandwidthEstimation);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onBufferSizeChanged(long sizeMs, long timestamp) {
            BufferSize bufferSize = new BufferSize(timestamp, sizeMs);
            r0 r0Var = (r0) this.bufferSize;
            r0Var.getClass();
            r0Var.m(null, bufferSize);
            this.bufferSizeHistory.add(bufferSize);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onBytesLoaded(BytesLoaded bytesLoaded) {
            r0 r0Var = (r0) this.bytesLoaded;
            r0Var.getClass();
            r0Var.m(null, bytesLoaded);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onChunkLoadAttempt(boolean isSuccessful, long timestamp) {
            LoadedChunk loadedChunk = new LoadedChunk(timestamp, isSuccessful);
            r0 r0Var = (r0) this.loadedChunk;
            r0Var.getClass();
            r0Var.m(null, loadedChunk);
            this.chunksHistory.add(loadedChunk);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onContentIdInitialized(String contentId) {
            r0 r0Var = (r0) this.contentId;
            r0Var.getClass();
            r0Var.m(null, contentId);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onDrmInitialized(DrmMode drmMode) {
            r0 r0Var = (r0) this.drmMode;
            r0Var.getClass();
            r0Var.m(null, drmMode);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onError(String message) {
            r0 r0Var = (r0) this.lastError;
            r0Var.getClass();
            r0Var.m(null, message);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onFramesDropped(int count) {
            pz40 pz40Var = this.droppedFrames;
            Integer valueOf = Integer.valueOf(count);
            r0 r0Var = (r0) pz40Var;
            r0Var.getClass();
            r0Var.m(null, valueOf);
        }

        @Override // ru.yandex.video.m3.player.utils.network.NetworkChangeListener
        public void onNetworkChanged(NetworkType networkType) {
            ((r0) this.networkType).l(networkType.getNetworkTypeName());
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onSubtitlesTrackChanged(SubtitlesTrackData subtitlesTrackData) {
            r0 r0Var = (r0) this.subtitlesTrack;
            r0Var.getClass();
            r0Var.m(null, subtitlesTrackData);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onVideoAndStreamTypeInitialized(CurrentVideoType videoType, CurrentStreamType streamType) {
            r0 r0Var = (r0) this.videoType;
            r0Var.getClass();
            r0Var.m(null, videoType);
            r0 r0Var2 = (r0) this.streamType;
            r0Var2.getClass();
            r0Var2.m(null, streamType);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onVideoDecoderUpdated(DecoderData videoDecoderData) {
            r0 r0Var = (r0) this.videoDecoderData;
            r0Var.getClass();
            r0Var.m(null, videoDecoderData);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onVideoTrackChanged(VideoTrackData videoTrackData) {
            r0 r0Var = (r0) this.videoTrack;
            r0Var.getClass();
            r0Var.m(null, videoTrackData);
        }

        @Override // ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver
        public void onViewportSizeChanged(ru.yandex.video.m3.player.ui.debug.model.Size size) {
            r0 r0Var = (r0) this.viewportSize;
            r0Var.getClass();
            r0Var.m(null, size);
        }
    }

    public YandexPlayerDebugDataManager(tse tseVar) {
        this.coroutineScope = tseVar;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = new ObserverDispatcher<>();
        this.observerDispatcher = observerDispatcher;
        BufferSizeProviderImpl bufferSizeProviderImpl = new BufferSizeProviderImpl(observerDispatcher);
        this.bufferSizeProvider = bufferSizeProviderImpl;
        ContentProviderImpl contentProviderImpl = new ContentProviderImpl(observerDispatcher);
        this.contentProvider = contentProviderImpl;
        TracksProviderImpl tracksProviderImpl = new TracksProviderImpl(observerDispatcher);
        this.tracksProvider = tracksProviderImpl;
        BandwidthEstimateProviderImpl bandwidthEstimateProviderImpl = new BandwidthEstimateProviderImpl(observerDispatcher);
        this.bandwidthEstimateProvider = bandwidthEstimateProviderImpl;
        DecoderDataProviderImpl decoderDataProviderImpl = new DecoderDataProviderImpl(observerDispatcher);
        this.decoderDataProvider = decoderDataProviderImpl;
        DrmModeProviderImpl drmModeProviderImpl = new DrmModeProviderImpl(observerDispatcher);
        this.drmModeProvider = drmModeProviderImpl;
        DroppedFramesProviderImpl droppedFramesProviderImpl = new DroppedFramesProviderImpl(observerDispatcher);
        this.droppedFramesProvider = droppedFramesProviderImpl;
        LoadedChunksProviderImpl loadedChunksProviderImpl = new LoadedChunksProviderImpl(observerDispatcher);
        this.loadedChunksProvider = loadedChunksProviderImpl;
        ViewPortSizeProviderImpl viewPortSizeProviderImpl = new ViewPortSizeProviderImpl(observerDispatcher);
        this.viewPortSizeProvider = viewPortSizeProviderImpl;
        ErrorProviderImpl errorProviderImpl = new ErrorProviderImpl(observerDispatcher);
        this.errorProvider = errorProviderImpl;
        r0 c = bvf0.c(new DebugData(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, false, 67108863, null));
        this._debugData = c;
        this.debugData = e.d(c);
        this.playerDebugDataToStringConverter = new PlayerDebugDataToStringConverter();
        this.compositePlayerObserver = new CompositePlayerObserver(bufferSizeProviderImpl, tracksProviderImpl, errorProviderImpl);
        this.compositePlayerAnalyticsObserver = new CompositePlayerAnalyticsObserver(contentProviderImpl, bandwidthEstimateProviderImpl, decoderDataProviderImpl, drmModeProviderImpl, droppedFramesProviderImpl, loadedChunksProviderImpl, viewPortSizeProviderImpl);
    }

    public final n4u0 getDebugData() {
        return this.debugData;
    }

    public final String getDebugDataString(Context context) {
        return this.playerDebugDataToStringConverter.getDebugDataString(context, (DebugData) this.debugData.getValue());
    }

    public final void resetDebugData() {
        pz40 pz40Var = this._debugData;
        DebugData debugData = new DebugData(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, false, 67108863, null);
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, debugData);
    }

    public final void setCompact(boolean isCompact) {
        r0 r0Var;
        Object value;
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, DebugData.copy$default((DebugData) value, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, isCompact, 33554431, null)));
    }

    public final void start(YandexPlayer<?> player, Context context) {
        stop();
        this.player = player;
        DebugObserver debugObserver = new DebugObserver();
        this.observerDispatcher.add((ObserverDispatcher<YandexDebugInfoObserver>) debugObserver);
        this.debugObserver = debugObserver;
        if (context != null) {
            NetworkTypeProvider companion = NetworkTypeProviderImpl.INSTANCE.getInstance(context);
            this.networkTypeProvider = companion;
            DebugObserver debugObserver2 = this.debugObserver;
            if (debugObserver2 != null && companion != null) {
                companion.addListener(debugObserver2);
            }
        }
        SessionColorProviderImpl sessionColorProviderImpl = new SessionColorProviderImpl(player);
        this.sessionColorProvider = sessionColorProviderImpl;
        player.addObserver(this.compositePlayerObserver);
        player.addAnalyticsObserver(this.compositePlayerAnalyticsObserver);
        player.addObserver(sessionColorProviderImpl);
        player.addAnalyticsObserver(sessionColorProviderImpl);
    }

    public final void stop() {
        NetworkTypeProvider networkTypeProvider;
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null) {
            yandexPlayer.removeObserver(this.compositePlayerObserver);
            CompositePlayerAnalyticsObserver compositePlayerAnalyticsObserver = this.compositePlayerAnalyticsObserver;
            compositePlayerAnalyticsObserver.release();
            yandexPlayer.removeAnalyticsObserver(compositePlayerAnalyticsObserver);
        }
        SessionColorProvider sessionColorProvider = this.sessionColorProvider;
        if (sessionColorProvider != null) {
            YandexPlayer<?> yandexPlayer2 = this.player;
            if (yandexPlayer2 != null) {
                yandexPlayer2.removeObserver(sessionColorProvider);
            }
            YandexPlayer<?> yandexPlayer3 = this.player;
            if (yandexPlayer3 != null) {
                yandexPlayer3.removeAnalyticsObserver(sessionColorProvider);
            }
        }
        l8x l8xVar = this.job;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.job = null;
        DebugObserver debugObserver = this.debugObserver;
        if (debugObserver != null && (networkTypeProvider = this.networkTypeProvider) != null) {
            networkTypeProvider.removeListener(debugObserver);
        }
        this.debugObserver = null;
        this.networkTypeProvider = null;
        this.sessionColorProvider = null;
        this.player = null;
    }
}
