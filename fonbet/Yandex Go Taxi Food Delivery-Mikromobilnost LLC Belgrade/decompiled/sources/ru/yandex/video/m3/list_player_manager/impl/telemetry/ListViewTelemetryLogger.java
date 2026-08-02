package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import defpackage.jl40;
import defpackage.sls;
import defpackage.vty;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.impl.ItemsListAbsoluteIndicesAdapter;
import ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ReportableIntervals;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import ru.yandex.video.m3.ui.PlayerViewInternalObserver;
import ru.yandex.video.m3.ui.PlayerViewObserver;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001:\blmnopqrsBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0018\u0010;\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u00060=R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020A0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020A0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010WR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020A0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020A0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010TR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020A0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010WR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010WR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010WR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020A0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010TR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020A0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010`R\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020A0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\\R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020A0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010WR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020A0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010TR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020A0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010T¨\u0006t"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger;", "", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "listPlayerManagerEventTracker", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "absoluteItems", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "lastReportedItemRef", "Ljava/util/concurrent/atomic/AtomicInteger;", "reportedItemIndexOffsetRef", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "networkTypeProvider", "<init>", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicInteger;Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;)V", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$StartReason;", CRLReasonCodeExtension.REASON, "Lzy11;", "onMaybeStartEvent", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$StartReason;)V", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$TerminalReason;", "terminalReason", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$NotStartReason;", "notStartReason", "", "onMaybeTerminalEvent", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$TerminalReason;Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$NotStartReason;)Z", "", "now", "()J", "newMediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "onSourceSet", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "onSourceCleared", "()V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPrepareStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "onPlayerEngineAttached", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onPlayerEngineDetached", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$InternalPlayerObserver;", "internalPlayerObserver", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$InternalPlayerObserver;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$PublicPlayerObserver;", "publicPlayerObserver", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$PublicPlayerObserver;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$Collection;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/InitMediaItemData;", "intervals", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$Collection;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/OnDrawListenerHelper;", "onDrawListener", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/OnDrawListenerHelper;", "startTime", "Ljava/lang/Long;", "currentMediaItem", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "currentPlaybackConfig", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "videoStartedPlayback", "Z", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$FatalErrorStatus;", "fatalErrorStatus", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$FatalErrorStatus;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$StringInterval;", "startReason", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$StringInterval;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$TimeInterval;", "playDelta", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$TimeInterval;", "setSourceDelta", "loadVideoDataDelta", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BooleanInterval;", "videoDataFromCache", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BooleanInterval;", "connectPlaybackEngineDelta", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$IntInterval;", "playerIndex", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$IntInterval;", "playerVsid", "sourceIndex", "blurDelta", "firstFrameImageDelta", "firstFrameVideoDelta", "networkType", "positionInItemsList", "isForward", "totalTime", "finishReason", "notStartPlaybackReason", "FatalErrorStatus", "InternalPlayerObserver", "NotStartReason", "PublicPlayerObserver", "StartReason", "TerminalReason", "ViewInternalObserver", "ViewPublicObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListViewTelemetryLogger {
    public static final int $stable = 8;
    private final ItemsListAbsoluteIndicesAdapter absoluteItems;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> blurDelta;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> connectPlaybackEngineDelta;
    private MediaData currentMediaItem;
    private PlaybackConfig currentPlaybackConfig;
    private FatalErrorStatus fatalErrorStatus;
    private final ReportableIntervals.StringInterval<InitMediaItemData> finishReason;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> firstFrameImageDelta;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> firstFrameVideoDelta;
    private final ReportableIntervals.Collection<InitMediaItemData> intervals;
    private final ReportableIntervals.BooleanInterval<InitMediaItemData> isForward;
    private final AtomicReference<MediaData> lastReportedItemRef;
    private final ListPlayerManagerEventTracker listPlayerManagerEventTracker;
    private final ListYandexPlayerView listYandexPlayerView;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> loadVideoDataDelta;
    private final ReportableIntervals.StringInterval<InitMediaItemData> networkType;
    private final NetworkTypeProvider networkTypeProvider;
    private final ReportableIntervals.StringInterval<InitMediaItemData> notStartPlaybackReason;
    private final OnDrawListenerHelper onDrawListener;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> playDelta;
    private final ReportableIntervals.IntInterval<InitMediaItemData> playerIndex;
    private final ReportableIntervals.StringInterval<InitMediaItemData> playerVsid;
    private final ReportableIntervals.IntInterval<InitMediaItemData> positionInItemsList;
    private final AtomicInteger reportedItemIndexOffsetRef;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> setSourceDelta;
    private final ReportableIntervals.IntInterval<InitMediaItemData> sourceIndex;
    private final ReportableIntervals.StringInterval<InitMediaItemData> startReason;
    private Long startTime;
    private final TimeProvider timeProvider;
    private final ReportableIntervals.TimeInterval<InitMediaItemData> totalTime;
    private final ReportableIntervals.BooleanInterval<InitMediaItemData> videoDataFromCache;
    private boolean videoStartedPlayback;
    private final InternalPlayerObserver internalPlayerObserver = new InternalPlayerObserver();
    private final PublicPlayerObserver publicPlayerObserver = new PublicPlayerObserver();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$FatalErrorStatus;", "", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "PENDING", "REPORTED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum FatalErrorStatus {
        NONE,
        PENDING,
        REPORTED
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ1\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$InternalPlayerObserver;", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger;)V", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "", "wasPlayWhenReady", "Lzy11;", "onPlay", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Z)V", "onPause", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "oldMediaData", "newMediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "onSetSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "mediaData", "onDropSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "onEngineAttached", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetached", "()V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "isFromCache", "onItemVideoDataLoaded", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/data/dto/VideoData;Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class InternalPlayerObserver implements ListPlayerInternalObserver {
        public InternalPlayerObserver() {
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onDropSource(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
            ListViewTelemetryLogger.this.onSourceCleared();
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onEngineAttached(YandexPlayer<zxc0> engine) {
            ListViewTelemetryLogger.this.onPlayerEngineAttached(engine);
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onEngineDetached() {
            ListViewTelemetryLogger.this.onPlayerEngineDetached();
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onItemVideoDataLoaded(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean isFromCache) {
            ListViewTelemetryLogger.this.loadVideoDataDelta.update(Long.valueOf(ListViewTelemetryLogger.this.now()));
            ListViewTelemetryLogger.this.videoDataFromCache.update(Boolean.valueOf(isFromCache));
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onPause(InternalListYandexPlayer player, boolean wasPlayWhenReady) {
            if (wasPlayWhenReady) {
                ListViewTelemetryLogger.this.onMaybeTerminalEvent(TerminalReason.NOT_START_PLAYBACK, NotStartReason.PAUSE_BEFORE_PLAYBACK);
            }
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onPlay(InternalListYandexPlayer player, boolean wasPlayWhenReady) {
            if (wasPlayWhenReady) {
                return;
            }
            ListViewTelemetryLogger.this.onMaybeStartEvent(StartReason.PLAYING_RESUMED);
            ListViewTelemetryLogger.this.playDelta.update(Long.valueOf(ListViewTelemetryLogger.this.now()));
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onSetSource(InternalListYandexPlayer player, MediaData oldMediaData, MediaData newMediaData, PlaybackConfig playbackConfig) {
            if (oldMediaData == null || !jl40.l(oldMediaData.getVideoContentId(), newMediaData.getVideoContentId())) {
                if (oldMediaData != null) {
                    ListViewTelemetryLogger.this.onSourceCleared();
                }
                ListViewTelemetryLogger.this.onSourceSet(newMediaData, playbackConfig);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$NotStartReason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PAUSE_BEFORE_PLAYBACK", "VIEW_DETACHED", "DROP_SOURCE", "FATAL", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum NotStartReason {
        PAUSE_BEFORE_PLAYBACK("pause_before_playback"),
        VIEW_DETACHED("view_detached"),
        DROP_SOURCE("drop_source"),
        FATAL("fatal");

        private final String value;

        NotStartReason(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$PublicPlayerObserver;", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "Lzy11;", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "onResumePlayback", "()V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PublicPlayerObserver implements ListPlayerObserver {
        public PublicPlayerObserver() {
        }

        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onPlaybackError(PlaybackException playbackException) {
            boolean onMaybeTerminalEvent = ListViewTelemetryLogger.this.onMaybeTerminalEvent(TerminalReason.NOT_START_PLAYBACK, NotStartReason.FATAL);
            ListViewTelemetryLogger.this.fatalErrorStatus = onMaybeTerminalEvent ? FatalErrorStatus.REPORTED : FatalErrorStatus.PENDING;
        }

        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onPreparingStarted(PreparingParams params) {
            ListViewTelemetryLogger.this.fatalErrorStatus = FatalErrorStatus.NONE;
            ListViewTelemetryLogger.this.onPrepareStarted(params);
        }

        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onResumePlayback() {
            ListViewTelemetryLogger.this.videoStartedPlayback = true;
            if (ListViewTelemetryLogger.this.firstFrameVideoDelta.isSet()) {
                ListViewTelemetryLogger.onMaybeTerminalEvent$default(ListViewTelemetryLogger.this, TerminalReason.START_PLAYBACK, null, 2, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$StartReason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FIRST_PIXEL_VISIBLE", "PLAYING_RESUMED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum StartReason {
        FIRST_PIXEL_VISIBLE("first_pixel_visible"),
        PLAYING_RESUMED("playing_resumed");

        private final String value;

        StartReason(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$TerminalReason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "START_PLAYBACK", "NOT_START_PLAYBACK", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TerminalReason {
        START_PLAYBACK("start_playback"),
        NOT_START_PLAYBACK("not_start_playback");

        private final String value;

        TerminalReason(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$ViewInternalObserver;", "Lru/yandex/video/m3/ui/PlayerViewInternalObserver;", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger;)V", "Lzy11;", "onViewAppearOnScreen", "()V", "onViewDisappearFromScreen", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "onPlayerAttachedToView", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "onPlayerDetachedFromView", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ViewInternalObserver implements PlayerViewInternalObserver {
        public ViewInternalObserver() {
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewInternalObserver
        public void onPlayerAttachedToView(InternalListYandexPlayer player) {
            player.addInternalObserver(ListViewTelemetryLogger.this.internalPlayerObserver);
            player.addObserver(ListViewTelemetryLogger.this.publicPlayerObserver);
            MediaData item = player.getItem();
            if (item != null) {
                ListViewTelemetryLogger listViewTelemetryLogger = ListViewTelemetryLogger.this;
                PlaybackConfig playbackConfig = player.getPlaybackConfig();
                if (playbackConfig != null) {
                    listViewTelemetryLogger.onSourceSet(item, playbackConfig);
                }
            }
            YandexPlayer<zxc0> engine = player.getEngine();
            if (engine != null) {
                ListViewTelemetryLogger.this.onPlayerEngineAttached(engine);
            }
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewInternalObserver
        public void onPlayerDetachedFromView(InternalListYandexPlayer player) {
            player.removeInternalObserver(ListViewTelemetryLogger.this.internalPlayerObserver);
            player.removeObserver(ListViewTelemetryLogger.this.publicPlayerObserver);
            ListViewTelemetryLogger.this.onSourceCleared();
            ListViewTelemetryLogger.this.onPlayerEngineDetached();
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewInternalObserver
        public void onViewAppearOnScreen() {
            ReportableIntervals.StringInterval stringInterval = ListViewTelemetryLogger.this.startReason;
            final ListViewTelemetryLogger listViewTelemetryLogger = ListViewTelemetryLogger.this;
            stringInterval.updateOnNextDraw(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$ViewInternalObserver$onViewAppearOnScreen$1
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m744invoke() {
                    ListViewTelemetryLogger.this.onMaybeStartEvent(ListViewTelemetryLogger.StartReason.FIRST_PIXEL_VISIBLE);
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m744invoke();
                    return zy11.a;
                }
            });
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewInternalObserver
        public void onViewDisappearFromScreen() {
            ListViewTelemetryLogger.this.onMaybeTerminalEvent(TerminalReason.NOT_START_PLAYBACK, NotStartReason.VIEW_DETACHED);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger$ViewPublicObserver;", "Lru/yandex/video/m3/ui/PlayerViewObserver;", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger;)V", "Lzy11;", "onSwitchedToFirstFrame", "()V", "onSwitchedToContent", "onBlurPictureIsSet", "onFirstFramePictureIsSet", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ViewPublicObserver implements PlayerViewObserver {
        public ViewPublicObserver() {
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewObserver
        public void onBlurPictureIsSet() {
            ReportableIntervals.TimeInterval timeInterval = ListViewTelemetryLogger.this.blurDelta;
            final ListViewTelemetryLogger listViewTelemetryLogger = ListViewTelemetryLogger.this;
            timeInterval.updateOnNextDraw(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$ViewPublicObserver$onBlurPictureIsSet$1
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m745invoke() {
                    if (ListViewTelemetryLogger.this.firstFrameImageDelta.isSet() || ListViewTelemetryLogger.this.firstFrameVideoDelta.isSet() || ListViewTelemetryLogger.this.blurDelta.isSet()) {
                        return;
                    }
                    ListViewTelemetryLogger.this.blurDelta.update(Long.valueOf(ListViewTelemetryLogger.this.now()));
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m745invoke();
                    return zy11.a;
                }
            });
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewObserver
        public void onFirstFramePictureIsSet() {
            ReportableIntervals.TimeInterval timeInterval = ListViewTelemetryLogger.this.firstFrameImageDelta;
            final ListViewTelemetryLogger listViewTelemetryLogger = ListViewTelemetryLogger.this;
            timeInterval.updateOnNextDraw(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$ViewPublicObserver$onFirstFramePictureIsSet$1
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m746invoke() {
                    if (ListViewTelemetryLogger.this.firstFrameImageDelta.isSet() || ListViewTelemetryLogger.this.firstFrameVideoDelta.isSet()) {
                        return;
                    }
                    ListViewTelemetryLogger.this.firstFrameImageDelta.update(Long.valueOf(ListViewTelemetryLogger.this.now()));
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m746invoke();
                    return zy11.a;
                }
            });
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewObserver
        public void onSwitchedToContent() {
            ReportableIntervals.TimeInterval timeInterval = ListViewTelemetryLogger.this.firstFrameVideoDelta;
            final ListViewTelemetryLogger listViewTelemetryLogger = ListViewTelemetryLogger.this;
            timeInterval.updateOnNextDraw(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$ViewPublicObserver$onSwitchedToContent$1
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m747invoke() {
                    boolean z;
                    ListViewTelemetryLogger.this.firstFrameVideoDelta.update(Long.valueOf(ListViewTelemetryLogger.this.now()));
                    z = ListViewTelemetryLogger.this.videoStartedPlayback;
                    if (z) {
                        ListViewTelemetryLogger.onMaybeTerminalEvent$default(ListViewTelemetryLogger.this, ListViewTelemetryLogger.TerminalReason.START_PLAYBACK, null, 2, null);
                    }
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m747invoke();
                    return zy11.a;
                }
            });
        }

        @Override // ru.yandex.video.m3.ui.PlayerViewObserver
        public void onSwitchedToFirstFrame() {
            ListViewTelemetryLogger.this.firstFrameVideoDelta.reset(2);
        }
    }

    public ListViewTelemetryLogger(ListYandexPlayerView listYandexPlayerView, TimeProvider timeProvider, ListPlayerManagerEventTracker listPlayerManagerEventTracker, ItemsListAbsoluteIndicesAdapter itemsListAbsoluteIndicesAdapter, AtomicReference<MediaData> atomicReference, AtomicInteger atomicInteger, NetworkTypeProvider networkTypeProvider) {
        this.listYandexPlayerView = listYandexPlayerView;
        this.timeProvider = timeProvider;
        this.listPlayerManagerEventTracker = listPlayerManagerEventTracker;
        this.absoluteItems = itemsListAbsoluteIndicesAdapter;
        this.lastReportedItemRef = atomicReference;
        this.reportedItemIndexOffsetRef = atomicInteger;
        this.networkTypeProvider = networkTypeProvider;
        ReportableIntervals.Collection<InitMediaItemData> collection = new ReportableIntervals.Collection<>();
        this.intervals = collection;
        this.fatalErrorStatus = FatalErrorStatus.NONE;
        this.startReason = collection.createString(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$startReason$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getStartReason();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setStartReason((String) obj2);
            }
        }, 2);
        this.playDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$playDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getPlayDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setPlayDelta((Long) obj2);
            }
        }, 2);
        this.setSourceDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$setSourceDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getSetSourceDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setSetSourceDelta((Long) obj2);
            }
        }, 1);
        this.loadVideoDataDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$loadVideoDataDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getLoadVideoDataDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setLoadVideoDataDelta((Long) obj2);
            }
        }, 5);
        this.videoDataFromCache = collection.createBoolean(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$videoDataFromCache$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getVideoDataFromCache();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setVideoDataFromCache((Boolean) obj2);
            }
        }, 5);
        this.connectPlaybackEngineDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$connectPlaybackEngineDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getConnectPlaybackEngineDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setConnectPlaybackEngineDelta((Long) obj2);
            }
        }, 4);
        this.playerIndex = collection.createInt(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$playerIndex$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getPlayerIndex();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setPlayerIndex((Integer) obj2);
            }
        }, 4);
        this.playerVsid = collection.createString(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$playerVsid$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getPlayerVsid();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setPlayerVsid((String) obj2);
            }
        }, 4);
        this.sourceIndex = collection.createInt(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$sourceIndex$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getSourceIndex();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setSourceIndex((Integer) obj2);
            }
        }, 5);
        this.blurDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$blurDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getBlurDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setBlurDelta((Long) obj2);
            }
        }, 1);
        this.firstFrameImageDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$firstFrameImageDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getImageDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setImageDelta((Long) obj2);
            }
        }, 1);
        this.firstFrameVideoDelta = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$firstFrameVideoDelta$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getFirstFrameVideoDelta();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setFirstFrameVideoDelta((Long) obj2);
            }
        }, 2);
        this.networkType = collection.createString(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$networkType$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getNetworkType();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setNetworkType((String) obj2);
            }
        }, 2);
        this.positionInItemsList = collection.createInt(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$positionInItemsList$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getPositionInItemsList();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setPositionInItemsList((Integer) obj2);
            }
        }, 2);
        this.isForward = collection.createBoolean(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$isForward$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).isForward();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setForward((Boolean) obj2);
            }
        }, 2);
        this.totalTime = collection.createTime(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$totalTime$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getTotalTime();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setTotalTime((Long) obj2);
            }
        }, 2);
        this.finishReason = collection.createString(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$finishReason$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getFinishReason();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setFinishReason((String) obj2);
            }
        }, 2);
        this.notStartPlaybackReason = collection.createString(new MutablePropertyReference1Impl() { // from class: ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$notStartPlaybackReason$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
            public Object get(Object obj) {
                return ((InitMediaItemData) obj).getNotStartPlaybackReason();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
            public void set(Object obj, Object obj2) {
                ((InitMediaItemData) obj).setNotStartPlaybackReason((String) obj2);
            }
        }, 5);
        listYandexPlayerView.addInternalObserverForever$video_player_internalRelease(new ViewInternalObserver());
        listYandexPlayerView.addObserver(new ViewPublicObserver());
        this.onDrawListener = new OnDrawListenerHelper(listYandexPlayerView, new vty(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ListViewTelemetryLogger listViewTelemetryLogger) {
        listViewTelemetryLogger.intervals.onDraw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long now() {
        return this.timeProvider.uptimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMaybeStartEvent(StartReason reason) {
        if (this.startTime != null) {
            return;
        }
        FatalErrorStatus fatalErrorStatus = this.fatalErrorStatus;
        FatalErrorStatus fatalErrorStatus2 = FatalErrorStatus.REPORTED;
        if (fatalErrorStatus == fatalErrorStatus2) {
            return;
        }
        long now = now();
        this.startTime = Long.valueOf(now);
        this.startReason.update(reason.getValue());
        if (this.listYandexPlayerView.getIsShowingContent() && !this.firstFrameVideoDelta.isSetOrPending()) {
            this.firstFrameVideoDelta.update(Long.valueOf(now));
        }
        if (this.fatalErrorStatus == FatalErrorStatus.PENDING && onMaybeTerminalEvent(TerminalReason.NOT_START_PLAYBACK, NotStartReason.FATAL)) {
            this.fatalErrorStatus = fatalErrorStatus2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onMaybeTerminalEvent(TerminalReason terminalReason, NotStartReason notStartReason) {
        Long l = this.startTime;
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        this.totalTime.update(Long.valueOf(now()));
        this.finishReason.update(terminalReason.getValue());
        if (terminalReason == TerminalReason.NOT_START_PLAYBACK && notStartReason != null) {
            this.notStartPlaybackReason.update(notStartReason.getValue());
        }
        this.networkType.update(this.networkTypeProvider.getNetworkType().getNetworkTypeName());
        MediaData mediaData = this.currentMediaItem;
        if (mediaData != null) {
            int absoluteIndexOf = this.absoluteItems.absoluteIndexOf(mediaData);
            MediaData andSet = this.lastReportedItemRef.getAndSet(mediaData);
            if (absoluteIndexOf != -1) {
                int absoluteIndexOf2 = andSet != null ? this.absoluteItems.absoluteIndexOf(andSet) : -1;
                this.isForward.update(Boolean.valueOf(absoluteIndexOf2 == -1 || absoluteIndexOf >= absoluteIndexOf2));
                int i = this.reportedItemIndexOffsetRef.get();
                ReportableIntervals.IntInterval<InitMediaItemData> intInterval = this.positionInItemsList;
                if (i == Integer.MIN_VALUE) {
                    intInterval.update(0);
                    this.reportedItemIndexOffsetRef.compareAndSet(Integer.MIN_VALUE, absoluteIndexOf);
                } else {
                    intInterval.update(Integer.valueOf(absoluteIndexOf - i));
                }
            }
        }
        InitMediaItemData initMediaItemData = new InitMediaItemData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        this.intervals.report(longValue, initMediaItemData);
        this.listPlayerManagerEventTracker.reportInitMediaItemEvent(initMediaItemData, this.currentMediaItem, this.currentPlaybackConfig);
        this.intervals.reset(2);
        this.startTime = null;
        this.videoStartedPlayback = false;
        return true;
    }

    public static /* synthetic */ boolean onMaybeTerminalEvent$default(ListViewTelemetryLogger listViewTelemetryLogger, TerminalReason terminalReason, NotStartReason notStartReason, int i, Object obj) {
        if ((i & 2) != 0) {
            notStartReason = null;
        }
        return listViewTelemetryLogger.onMaybeTerminalEvent(terminalReason, notStartReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayerEngineAttached(YandexPlayer<zxc0> engine) {
        this.connectPlaybackEngineDelta.update(Long.valueOf(now()));
        this.playerIndex.update(Integer.valueOf(engine.getPlayerIndex()));
        this.playerVsid.update(engine.getVideoSessionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayerEngineDetached() {
        this.intervals.reset(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepareStarted(PreparingParams params) {
        this.sourceIndex.update(Integer.valueOf(params.getSourceIndex()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSourceCleared() {
        onMaybeTerminalEvent(TerminalReason.NOT_START_PLAYBACK, NotStartReason.DROP_SOURCE);
        this.intervals.reset(1);
        this.currentMediaItem = null;
        this.currentPlaybackConfig = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSourceSet(MediaData newMediaData, PlaybackConfig playbackConfig) {
        this.setSourceDelta.update(Long.valueOf(now()));
        this.currentMediaItem = newMediaData;
        this.currentPlaybackConfig = playbackConfig;
    }
}
