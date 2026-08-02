package ru.yandex.video.m3.telemetry.player;

import android.net.Uri;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.evu0;
import defpackage.fe10;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.tls;
import defpackage.w511;
import defpackage.zd10;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.PlaybackViewStateKt;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.DefaultVideoData;
import ru.yandex.video.m3.data.dto.DefaultVideoDataKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.PreparingParamsKt;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.ad.AdsLoaderHolder;
import ru.yandex.video.m3.player.decoder.YandexCodecManager;
import ru.yandex.video.m3.player.impl.PrepareConfig;
import ru.yandex.video.m3.player.impl.StalledReasonManager;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManagerImpl;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.observers.InternalPlayerObserver;
import ru.yandex.video.m3.player.observers.InternalToPublicObserversAdapter;
import ru.yandex.video.m3.player.observers.StrmManagerToObserverAdapter;
import ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;
import ru.yandex.video.m3.player.tracking.AdditionalTrackingReporter;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracking.StrmManager;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.telemetry.MediaItemToContentIdMapper;
import ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider;

@Metadata(d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002¼\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00022\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010*J\u000f\u0010/\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010*J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0017\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b=\u0010\u001fJ\u0011\u0010>\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b>\u0010\u001fJ\u001d\u0010A\u001a\u00020\u00022\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0002H\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u0002H\u0016¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020\u0002H\u0016¢\u0006\u0004\bG\u0010DJ\u000f\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010DJ\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020OH\u0016¢\u0006\u0004\bR\u0010QJ\u0017\u0010T\u001a\u00020\u00022\u0006\u0010S\u001a\u00020(H\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0003H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0005H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0002H\u0016¢\u0006\u0004\bZ\u0010DJ\u0017\u0010]\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020[H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020OH\u0016¢\u0006\u0004\ba\u0010QJ\u0017\u0010c\u001a\u00020\u00022\u0006\u0010b\u001a\u00020OH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00022\u0006\u0010e\u001a\u00020OH\u0016¢\u0006\u0004\bf\u0010dJ\u0017\u0010h\u001a\u00020\u00022\u0006\u0010g\u001a\u00020[H\u0016¢\u0006\u0004\bh\u0010^J\u000f\u0010i\u001a\u00020[H\u0016¢\u0006\u0004\bi\u0010`J\u000f\u0010j\u001a\u00020(H\u0016¢\u0006\u0004\bj\u0010*J\u000f\u0010k\u001a\u00020OH\u0016¢\u0006\u0004\bk\u0010QJ\u000f\u0010l\u001a\u00020\u0002H\u0016¢\u0006\u0004\bl\u0010DJ\u0015\u0010o\u001a\b\u0012\u0004\u0012\u00020n0mH\u0016¢\u0006\u0004\bo\u0010pJ\u0011\u0010r\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020\u00022\u0006\u0010w\u001a\u00020OH\u0016¢\u0006\u0004\bx\u0010dJ\u000f\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010}\u001a\u00020|H\u0016¢\u0006\u0004\b}\u0010~J\u001b\u0010\u0081\u0001\u001a\u00020\u00022\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0013\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0087\u0001\u001a\u00030\u0086\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J$\u0010\u008e\u0001\u001a\u00020\u00022\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J%\u0010\u0093\u0001\u001a\u00020\u00022\u0007\u0010\u0090\u0001\u001a\u00020O2\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0005\b\u0095\u0001\u0010DJ\u0011\u0010\u0096\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0005\b\u0096\u0001\u0010DJ\u0017\u0010\u0097\u0001\u001a\u00020O*\u00030\u008c\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u009b\u0001\u001a\u00020\u00022\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u009d\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u009e\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u009f\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010 \u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¡\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010¢\u0001R\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010£\u0001R$\u0010¥\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001e\u0010§\u0001\u001a\t\u0012\u0004\u0012\u0002080¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u00104\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010³\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010´\u0001R,\u0010&\u001a\u0004\u0018\u00010%2\t\u0010µ\u0001\u001a\u0004\u0018\u00010%8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b&\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006½\u0001"}, d2 = {"Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayer;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzy11;", "", "sessionId", "", "playerIndex", "Lru/yandex/video/m3/player/IndexGenerator;", "sourceIndexGenerator", "Lru/yandex/video/m3/player/tracking/StrmManager;", "strmManager", "Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "playbackStatsProvider", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "concurrentStateManager", "Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;", "mediaItemToContentIdMapper", "<init>", "(Ljava/lang/String;ILru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/player/tracking/StrmManager;Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;)V", "surfaceWidth", "surfaceHeight", "setSurfaceSize", "(II)V", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "extraParameters", "appendAdditionalParameters", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/player/tracks/Track;", "getAudioTrack", "()Lru/yandex/video/m3/player/tracks/Track;", "contentId", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "prepare", "(Ljava/lang/String;Lru/yandex/video/m3/data/PlaybackParameters;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/data/PlaybackParameters;)V", "", "getPosition", "()J", "getBufferedPosition", "getLiveEdgePosition", "getTimelineLeftEdge", "getContentDuration", "getAvailableWindowDuration", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "Lru/yandex/video/m3/player/PlayerObserver;", "observer", "addObserver", "(Lru/yandex/video/m3/player/PlayerObserver;)V", "removeObserver", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "analyticsObserver", "addAnalyticsObserver", "(Lru/yandex/video/m3/player/PlayerAnalyticsObserver;)V", "removeAnalyticsObserver", "getVideoTrack", "getSubtitlesTrack", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "connectTo", "(Lru/yandex/video/m3/player/PlayerDelegate;)V", "disconnectFromCurrentDelegate", "()V", "play", "pause", "stop", "stopKeepingDecoders", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "", "isPlaying", "()Z", "isPlayingAd", "position", "seekTo", "(J)V", "getVideoSessionId", "()Ljava/lang/String;", "getPlayerIndex", "()I", "release", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "isMuted", "muted", "setMuted", "(Z)V", "handleAudioFocus", "setHandleAudioFocus", "speed", "setPlaybackSpeed", "getPlaybackSpeed", "getLiveOffset", "isInLive", "getHidedPlayer", "", "Lru/yandex/video/m3/data/Ad;", "getAdsList", "()Ljava/util/List;", "Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "getAdditionalTrackingReporter", "()Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getAdsLoaderHolder", "()Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "isFullscreen", "notifyFullscreenModeChanged", "Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "getSkipsManager", "()Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "getCodecManager", "()Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "setRepeatMode", "(Lru/yandex/video/m3/player/RepeatMode;)V", "Lru/yandex/video/m3/data/PlaybackViewState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "getMusicTelemetryObserver", "()Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "url", "onLoadSource", "(Ljava/lang/String;)V", "Lfe10;", "mediaItem", "prepareInternal", "(Lfe10;Lru/yandex/video/m3/data/PlaybackParameters;)V", "autoPlay", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "callOnPrepareStartCallbacks", "(ZLru/yandex/video/m3/player/PreparingParams;)V", "notifyLoadingStart", "notifyLoadingFinished", "hasHttpScheme", "(Lfe10;)Z", "", "throwable", "notifyPlaybackError", "(Ljava/lang/Throwable;)V", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "observers", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "analyticsObservers", "Lru/yandex/video/m3/player/observers/InternalPlayerObserver;", "internalObservers", "Lru/yandex/video/m3/player/impl/StalledReasonManager;", "stalledReasonManager", "Lru/yandex/video/m3/player/impl/StalledReasonManager;", "Lru/yandex/video/m3/player/AbrPreferences;", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "firstPlaybackReady", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "Lru/yandex/video/m3/player/PreparingParams;", "<set-?>", "Lru/yandex/video/m3/data/dto/VideoData;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/player/RepeatMode;", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "PlayerDelegateObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandaloneTelemetryYandexPlayer implements YandexPlayer<zy11> {
    public static final int $stable = 8;
    private final AbrPreferences abrPreferences;
    private final ObserverDispatcher<PlayerAnalyticsObserver> analyticsObservers;
    private final ConcurrentPlayerStateManager concurrentStateManager;
    private final AtomicBoolean firstPlaybackReady;
    private final ObserverDispatcher<InternalPlayerObserver> internalObservers;
    private final MediaItemToContentIdMapper mediaItemToContentIdMapper;
    private final StandaloneTelemetryPlayerDelegateObserver observer;
    private final ObserverDispatcher<PlayerObserver<zy11>> observers;
    private final PlaybackStatsProvider playbackStatsProvider;
    private final int playerIndex;
    private PreparingParams preparingParams;
    private final RepeatMode repeatMode;
    private final String sessionId;
    private final IndexGenerator sourceIndexGenerator;
    private final StalledReasonManager stalledReasonManager;
    private final StrmManager strmManager;
    private VideoData videoData;

    public StandaloneTelemetryYandexPlayer(String str, int i, IndexGenerator indexGenerator, StrmManager strmManager, PlaybackStatsProvider playbackStatsProvider, ConcurrentPlayerStateManager concurrentPlayerStateManager, MediaItemToContentIdMapper mediaItemToContentIdMapper) {
        this.sessionId = str;
        this.playerIndex = i;
        this.sourceIndexGenerator = indexGenerator;
        this.strmManager = strmManager;
        this.playbackStatsProvider = playbackStatsProvider;
        this.concurrentStateManager = concurrentPlayerStateManager;
        this.mediaItemToContentIdMapper = mediaItemToContentIdMapper;
        ObserverDispatcher<PlayerObserver<zy11>> observerDispatcher = new ObserverDispatcher<>();
        this.observers = observerDispatcher;
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = new ObserverDispatcher<>();
        this.analyticsObservers = observerDispatcher2;
        ObserverDispatcher<InternalPlayerObserver> observerDispatcher3 = new ObserverDispatcher<>();
        this.internalObservers = observerDispatcher3;
        StalledReasonManager stalledReasonManager = new StalledReasonManager();
        stalledReasonManager.start(this);
        this.stalledReasonManager = stalledReasonManager;
        this.abrPreferences = AbrPreferences.INSTANCE.Empty$video_player_internalRelease();
        this.firstPlaybackReady = new AtomicBoolean(false);
        this.observer = new PlayerDelegateObserverImpl(this);
        observerDispatcher3.add((ObserverDispatcher<InternalPlayerObserver>) new StrmManagerToObserverAdapter(this, strmManager));
        observerDispatcher3.add((ObserverDispatcher<InternalPlayerObserver>) new InternalToPublicObserversAdapter(this, observerDispatcher, observerDispatcher2));
        this.repeatMode = RepeatMode.None.INSTANCE;
    }

    private final void callOnPrepareStartCallbacks(boolean autoPlay, PreparingParams preparingParams) {
        HashSet H0;
        HashSet H02;
        HashSet H03;
        Object failure;
        Object failure2;
        Object failure3;
        ObserverDispatcher<InternalPlayerObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((InternalPlayerObserver) it.next()).onPreparingInternal(preparingParams, null);
                failure3 = zy11.a;
            } catch (Throwable th) {
                failure3 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure3);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = this.analyticsObservers;
        synchronized (observerDispatcher2.getObservers()) {
            H02 = a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H02.iterator();
        while (it2.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it2.next()).onPreparingStarted(preparingParams);
                failure2 = zy11.a;
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure2);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PlayerObserver<zy11>> observerDispatcher3 = this.observers;
        synchronized (observerDispatcher3.getObservers()) {
            H03 = a.H0(observerDispatcher3.getObservers());
        }
        Iterator it3 = H03.iterator();
        while (it3.hasNext()) {
            try {
                ((PlayerObserver) it3.next()).onWillPlayWhenReadyChanged(autoPlay);
                failure = zy11.a;
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
            Throwable a3 = Result.a(failure);
            if (a3 != null) {
                h5z0.a.f(a3, "notifyObservers", new Object[0]);
            }
        }
    }

    private final boolean hasHttpScheme(fe10 fe10Var) {
        Uri uri;
        String scheme;
        zd10 zd10Var = fe10Var.b;
        return (zd10Var == null || (uri = zd10Var.a) == null || (scheme = uri.getScheme()) == null || !evu0.y(scheme, "http", false)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyLoadingFinished() {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerObserver<zy11>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerObserver) it.next()).onLoadingFinished();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyLoadingStart() {
        HashSet H0;
        HashSet H02;
        Object failure;
        Object failure2;
        ObserverDispatcher<PlayerObserver<zy11>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerObserver) it.next()).onLoadingStart();
                failure2 = zy11.a;
            } catch (Throwable th) {
                failure2 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure2);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        StalledReason stalledReason = this.stalledReasonManager.getStalledReason();
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2 = this.analyticsObservers;
        synchronized (observerDispatcher2.getObservers()) {
            H02 = a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H02.iterator();
        while (it2.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it2.next()).onLoadingStart(stalledReason);
                failure = zy11.a;
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPlaybackError(Throwable throwable) {
        HashSet H0;
        Object failure;
        PlaybackException playbackException = throwable instanceof PlaybackException ? (PlaybackException) throwable : null;
        if (playbackException == null) {
            playbackException = new PlaybackException.ErrorGeneric(throwable);
        }
        ObserverDispatcher<PlayerObserver<zy11>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerObserver) it.next()).onPlaybackError(playbackException);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadSource(String url) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticsObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerAnalyticsObserver) it.next()).onLoadSource(url);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareInternal(fe10 mediaItem, PlaybackParameters playbackParameters) {
        String str;
        Uri uri;
        final DefaultVideoData defaultVideoData;
        Uri uri2;
        if (this.concurrentStateManager.getIsReleased()) {
            return;
        }
        boolean hasHttpScheme = hasHttpScheme(mediaItem);
        MediaItemToContentIdMapper mediaItemToContentIdMapper = this.mediaItemToContentIdMapper;
        if (hasHttpScheme) {
            str = mediaItemToContentIdMapper != null ? mediaItemToContentIdMapper.getContentIdForMediaItem(mediaItem) : null;
            zd10 zd10Var = mediaItem.b;
            String uri3 = (zd10Var == null || (uri2 = zd10Var.a) == null) ? null : uri2.toString();
            if (uri3 == null) {
                uri3 = "";
            }
            defaultVideoData = DefaultVideoDataKt.DefaultVideoData$default(uri3, null, 2, null);
        } else {
            if (mediaItemToContentIdMapper == null || (str = mediaItemToContentIdMapper.getContentIdForMediaItem(mediaItem)) == null) {
                zd10 zd10Var2 = mediaItem.b;
                String uri4 = (zd10Var2 == null || (uri = zd10Var2.a) == null) ? null : uri.toString();
                str = uri4 == null ? "" : uri4;
            }
            defaultVideoData = null;
        }
        final String str2 = str;
        ConcurrentPlayerStateManager.Indices beginPrepare = this.concurrentStateManager.beginPrepare(new PrepareConfig(str2, defaultVideoData, playbackParameters));
        final Long startPosition = playbackParameters.getStartPosition();
        boolean autoPlay = playbackParameters.getAutoPlay();
        final String expandManifestUrl = this.strmManager.expandManifestUrl(this.sessionId, defaultVideoData == null ? DefaultVideoDataKt.DefaultVideoData$default("", null, 2, null) : defaultVideoData, str2, startPosition != null ? startPosition.longValue() : -9223372036854775807L, autoPlay, beginPrepare.getSourceIndex(), false);
        PreparingParams PreparingParams = PreparingParamsKt.PreparingParams(getVideoData() == null, autoPlay, beginPrepare.getSourceIndex(), this.abrPreferences, new tls() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayer$prepareInternal$preparingParams$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PreparingParams.Builder builder) {
                builder.setContentId(str2);
                builder.setVideoData(defaultVideoData);
                builder.setStartPosition(startPosition);
                builder.setExpandedManifestUrl(expandManifestUrl);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PreparingParams.Builder) obj);
                return zy11.a;
            }
        });
        this.preparingParams = PreparingParams;
        this.videoData = PreparingParams.getVideoData();
        this.concurrentStateManager.setStopped(false);
        callOnPrepareStartCallbacks(autoPlay, PreparingParams);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void addAnalyticsObserver(PlayerAnalyticsObserver analyticsObserver) {
        this.analyticsObservers.add((ObserverDispatcher<PlayerAnalyticsObserver>) analyticsObserver);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void addObserver(PlayerObserver<? super zy11> observer) {
        this.observers.add((ObserverDispatcher<PlayerObserver<zy11>>) observer);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void appendAdditionalParameters(Map<String, ? extends Object> extraParameters) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void connectTo(PlayerDelegate<zy11> playerDelegate) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void disconnectFromCurrentDelegate() {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public AdditionalTrackingReporter getAdditionalTrackingReporter() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public List<Ad> getAdsList() {
        return EmptyList.a;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public AdsLoaderHolder getAdsLoaderHolder() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public Track getAudioTrack() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getAvailableWindowDuration() {
        return this.playbackStatsProvider.getContentDuration();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getBufferedPosition() {
        return this.playbackStatsProvider.getBufferedPosition();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    /* renamed from: getCodecManager */
    public YandexCodecManager getDecoderManager() {
        return new YandexCodecManager() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayer$getCodecManager$1
            @Override // ru.yandex.video.m3.player.decoder.YandexCodecManager
            public void allowInitCodec() {
            }
        };
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getContentDuration() {
        return this.playbackStatsProvider.getContentDuration();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public /* bridge */ /* synthetic */ zy11 getHidedPlayer() {
        getHidedPlayer2();
        return zy11.a;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getLiveEdgePosition() {
        return this.playbackStatsProvider.getLiveEdgePosition();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getLiveOffset() {
        return -1L;
    }

    /* renamed from: getMusicTelemetryObserver, reason: from getter */
    public final StandaloneTelemetryPlayerDelegateObserver getObserver() {
        return this.observer;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public float getPlaybackSpeed() {
        return this.playbackStatsProvider.getPlaybackSpeed();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public PlaybackStats getPlaybackStats() {
        return this.playbackStatsProvider.getPlaybackStats();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public PlaybackViewState getPlaybackViewState() {
        return PlaybackViewStateKt.PlaybackViewState(new tls() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayer$getPlaybackViewState$1
            public final void invoke(PlaybackViewState.Builder builder) {
                builder.setVisible(Boolean.FALSE);
                builder.m738setSurfaceType((Integer) null);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackViewState.Builder) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public int getPlayerIndex() {
        return this.playerIndex;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getPosition() {
        return this.playbackStatsProvider.getPosition();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public YandexPlayerSkipsManager getSkipsManager() {
        return new YandexPlayerSkipsManager() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayer$getSkipsManager$1
            @Override // ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager
            public void start(List<PlayerSkip> skips) {
            }

            @Override // ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager
            public void stop() {
            }

            @Override // ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager
            public void updateAutoSkipsByType(PlayerSkip.Type type, boolean isEnabled) {
            }
        };
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public StreamType getStreamType() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public Track getSubtitlesTrack() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public long getTimelineLeftEdge() {
        return this.playbackStatsProvider.getTimelineLeftEdge();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public VideoData getVideoData() {
        return this.videoData;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    /* renamed from: getVideoSessionId, reason: from getter */
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public Track getVideoTrack() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public VideoType getVideoType() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public float getVolume() {
        return this.playbackStatsProvider.getVolume();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isInLive() {
        return false;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isMuted() {
        return this.playbackStatsProvider.isMuted();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isPlaying() {
        return this.playbackStatsProvider.isPlaying$video_player_internalRelease();
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public boolean isPlayingAd() {
        return false;
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void notifyFullscreenModeChanged(boolean isFullscreen) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void pause() {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void play() {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void prepare(String contentId, PlaybackParameters playbackParameters) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void prepare(VideoData videoData, PlaybackParameters playbackParameters) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void release() {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void removeAnalyticsObserver(PlayerAnalyticsObserver analyticsObserver) {
        this.analyticsObservers.remove(analyticsObserver);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void removeObserver(PlayerObserver<? super zy11> observer) {
        this.observers.remove(observer);
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void seekTo(long position) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setHandleAudioFocus(boolean handleAudioFocus) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setMuted(boolean muted) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setPlaybackSpeed(float speed) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setRepeatMode(RepeatMode repeatMode) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setSurfaceSize(int surfaceWidth, int surfaceHeight) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void setVolume(float volume) {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void stop() {
    }

    @Override // ru.yandex.video.m3.player.YandexPlayer
    public void stopKeepingDecoders() {
    }

    /* renamed from: getHidedPlayer, reason: avoid collision after fix types in other method */
    public void getHidedPlayer2() {
    }

    @Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u001aJ\u001d\u0010'\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u001aJ\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010\u001eJ\u0019\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\u001aJ\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u000208H\u0016¢\u0006\u0004\b=\u0010;J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u000208H\u0016¢\u0006\u0004\b?\u0010;J\u0017\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u000208H\u0016¢\u0006\u0004\bA\u0010;J\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010\u001aJ\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010\u001aJ#\u0010G\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bG\u0010KJ\u001f\u0010N\u001a\u00020\n2\u0006\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020 H\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\n2\u0006\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020 H\u0016¢\u0006\u0004\bP\u0010OJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010\u001aJ\u001f\u0010T\u001a\u00020\n2\u0006\u0010R\u001a\u0002082\u0006\u0010S\u001a\u000208H\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010\u001aJ\u001f\u0010Z\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0011H\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\u0011H\u0016¢\u0006\u0004\b]\u0010^J\u001f\u0010a\u001a\u00020\n2\u0006\u0010_\u001a\u0002082\u0006\u0010`\u001a\u000208H\u0016¢\u0006\u0004\ba\u0010UJ'\u0010e\u001a\u00020\n2\u0006\u0010b\u001a\u00020\r2\u0006\u0010c\u001a\u0002082\u0006\u0010d\u001a\u000208H\u0016¢\u0006\u0004\be\u0010fJ)\u0010i\u001a\u00020\n2\u0006\u0010E\u001a\u00020D2\u0006\u0010b\u001a\u00020\r2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bk\u0010\u0010J\u0017\u0010n\u001a\u00020\n2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\n2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bp\u0010oJ!\u0010u\u001a\u00020\n2\u0006\u0010r\u001a\u00020q2\b\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bu\u0010vJ!\u0010w\u001a\u00020\n2\u0006\u0010r\u001a\u00020q2\b\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bw\u0010vJ\u0017\u0010y\u001a\u00020\n2\u0006\u0010x\u001a\u00020\u0011H\u0016¢\u0006\u0004\by\u0010^J\u0017\u0010|\u001a\u00020\n2\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u00020\n2\u0006\u0010E\u001a\u00020D2\u0006\u0010~\u001a\u00020\rH\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u000208H\u0016¢\u0006\u0005\b\u0082\u0001\u0010;J-\u0010\u0086\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020 2\u0007\u0010\u0084\u0001\u001a\u0002082\u0007\u0010\u0085\u0001\u001a\u000208H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J(\u0010\u008a\u0001\u001a\u00020\n2\u0014\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002080\u0088\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\n2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J$\u0010\u0092\u0001\u001a\u00020\n2\u0007\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\rH\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\n2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0098\u0001\u0010\u001aJ\u001b\u0010\u009a\u0001\u001a\u00020\n2\u0007\u0010\u0099\u0001\u001a\u00020 H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\n2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J*\u0010¤\u0001\u001a\u00020\n2\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J%\u0010§\u0001\u001a\u00020\n2\u0007\u0010¦\u0001\u001a\u0002082\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0011\u0010©\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b©\u0001\u0010\u001aJ\u001b\u0010«\u0001\u001a\u00020\n2\u0007\u0010ª\u0001\u001a\u00020 H\u0016¢\u0006\u0006\b«\u0001\u0010\u009b\u0001J\u0018\u0010®\u0001\u001a\u00030\u00ad\u0001*\u00030¬\u0001H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010°\u0001¨\u0006±\u0001"}, d2 = {"Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayer$PlayerDelegateObserverImpl;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayer;", "player", "<init>", "(Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayer;)V", "Lfe10;", "mediaItem", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Lzy11;", "onSetMediaSource", "(Lfe10;Lru/yandex/video/m3/data/PlaybackParameters;)V", "", "url", "onLoadSource", "(Ljava/lang/String;)V", "", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "Lru/yandex/video/m3/player/PlaybackException;", Constants.KEY_EXCEPTION, "onError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onResumePlayback", "()V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "", "adList", "onAdListChanged", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/AdException;", "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdSkipped", "onAdSkipAvailable", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "onPausePlayback", "", "position", "onPlaybackProgress", "(J)V", "bufferSizeMs", "onBufferSizeChanged", "duration", "onDurationChanged", "timelineLeftEdgeMs", "onTimelineLeftEdgeChanged", "onBufferingStart", "onBufferingEnd", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "quality", "onLoadCanceled", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "width", "height", "onVideoSizeChanged", "(II)V", "onSurfaceSizeChanged", "onFirstFrame", "newPosition", "oldPosition", "onSeek", "(JJ)V", "onPlaybackEnded", "", "speed", "isUserAction", "onPlaybackSpeedChanged", "(FZ)V", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "(Z)V", "chunkLengthMs", "loadTime", "onDataLoaded", "decoderName", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Ljava/lang/String;JJ)V", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "onVideoDecoderReleased", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "onVideoDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "onAudioDecoderEnabled", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "keepDecoders", "onStop", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "logMessage", "onNoSupportedTracksForRenderer", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;)V", "bandwidthEstimation", "onBandwidthEstimation", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "", "estimates", "onInitialBandwidthEstimatesAcquired", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", BackendConfig.Restrictions.ENABLED, "className", "onNetPerfStatus", "(ZLjava/lang/String;)V", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "onRepeatModeChanged", "(Lru/yandex/video/m3/player/RepeatMode;)V", "onRepeat", "count", "onVideoFramesDropped", "(I)V", "Lru/yandex/video/m3/data/DrmType;", "drmType", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "bytes", "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "onDrmKeysLoaded", "bitrate", "onVideoChunkLoaded", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "Lru/yandex/video/m3/data/TrackSelectionType;", "toTrackSelectionType", "(Lru/yandex/video/m3/player/tracks/TrackVariant;)Lru/yandex/video/m3/data/TrackSelectionType;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerDelegateObserverImpl implements StandaloneTelemetryPlayerDelegateObserver {
        public static final int $stable = 8;
        private final StandaloneTelemetryYandexPlayer player;

        public PlayerDelegateObserverImpl(StandaloneTelemetryYandexPlayer standaloneTelemetryYandexPlayer) {
            this.player = standaloneTelemetryYandexPlayer;
        }

        private final TrackSelectionType toTrackSelectionType(TrackVariant trackVariant) {
            if (trackVariant instanceof TrackVariant.Adaptive) {
                return TrackSelectionType.ADAPTIVE;
            }
            if (trackVariant instanceof TrackVariant.Disable) {
                return TrackSelectionType.DISABLE;
            }
            if (trackVariant instanceof TrackVariant.DownloadVariant ? true : trackVariant instanceof TrackVariant.PreferredTrackVariant ? true : trackVariant instanceof TrackVariant.Variant) {
                return TrackSelectionType.FIXED;
            }
            w511.b();
            return null;
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdConfigSet(AdConfig adConfig) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdConfigSet(adConfig);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdEnd() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdEnd();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdError(AdException exception) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdError(exception);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdListChanged(List<Ad> adList) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdListChanged(adList);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdMetadata(AdMetadata adMetadata) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdMetadata(adMetadata);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdPodEnd() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdPodEnd();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdPodStart(Ad ad, int index) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdPodStart(ad, index);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdSkipAvailable(Ad ad) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdSkipAvailable(ad);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdSkipped() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdSkipped();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAdStart(Ad ad) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onAdStart(ad);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onAudioDecoderEnabled(decoderCounter);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onAudioInputFormatChanged(format, codecReuseLog);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBandwidthEstimation(long bandwidthEstimation) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onBandwidthEstimation(bandwidthEstimation);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[SYNTHETIC] */
        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
            HashSet H0;
            int i;
            long j;
            long j2;
            Object failure;
            Throwable a;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    i = elapsedMs;
                    j = bytesTransferred;
                    j2 = bitrateEstimate;
                    try {
                        ((PlayerAnalyticsObserver) it.next()).onBandwidthSample(i, j, j2);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        th = th;
                        failure = new Result.Failure(th);
                        a = Result.a(failure);
                        if (a == null) {
                        }
                        elapsedMs = i;
                        bytesTransferred = j;
                        bitrateEstimate = j2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = elapsedMs;
                    j = bytesTransferred;
                    j2 = bitrateEstimate;
                }
                a = Result.a(failure);
                if (a == null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
                elapsedMs = i;
                bytesTransferred = j;
                bitrateEstimate = j2;
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBufferSizeChanged(long bufferSizeMs) {
            HashSet H0;
            Object failure;
            super.onBufferSizeChanged(bufferSizeMs);
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onBufferSizeChanged(bufferSizeMs);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBufferingEnd() {
            HashSet H0;
            HashSet H02;
            Object failure;
            Object failure2;
            h5z0.a.a("onBufferingEnd", new Object[0]);
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onEngineBufferingEnd();
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            this.player.notifyLoadingFinished();
            if (this.player.firstPlaybackReady.compareAndSet(false, true)) {
                ObserverDispatcher observerDispatcher2 = this.player.observers;
                synchronized (observerDispatcher2.getObservers()) {
                    H02 = a.H0(observerDispatcher2.getObservers());
                }
                Iterator it2 = H02.iterator();
                while (it2.hasNext()) {
                    try {
                        ((PlayerObserver) it2.next()).onReadyForFirstPlayback();
                        failure = zy11.a;
                    } catch (Throwable th2) {
                        failure = new Result.Failure(th2);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        h5z0.a.f(a2, "notifyObservers", new Object[0]);
                    }
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBufferingStart() {
            HashSet H0;
            Object failure;
            h5z0.a.a("onBufferingStart", new Object[0]);
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onEngineBufferingStart();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            this.player.notifyLoadingStart();
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onBytesLoaded(long bytes, TrackType trackType) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onBytesLoaded(bytes, trackType);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDataLoaded(long chunkLengthMs, long loadTime) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onDataLoaded(chunkLengthMs, loadTime);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onDecoderInitialized(trackType, decoderName, mediaCodecSelectorLog);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDrmKeysLoaded() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onDrmKeysLoaded();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDrmSessionAcquired(DrmType drmType) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onDrmSessionAcquired(drmType);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onDurationChanged(long duration) {
            HashSet H0;
            Object failure;
            super.onDurationChanged(duration);
            if (this.player.getVideoType() == VideoType.LIVE) {
                duration = Long.MIN_VALUE;
            }
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onContentDurationChanged(duration);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onError(PlaybackException exception) {
            this.player.notifyPlaybackError(exception);
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onFirstFrame() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onFirstFrame();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onInitialBandwidthEstimatesAcquired(Map<String, Long> estimates) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onInitialBandwidthEstimatesAcquired(estimates);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onLoadCanceled(TrackType trackType, Integer quality) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadCanceled(trackType, quality);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onLoadError(LoadError loadError) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadError(loadError);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.telemetry.player.StandaloneTelemetryPlayerDelegateObserver
        public void onLoadSource(String url) {
            Object failure;
            String str;
            Uri parse;
            String str2;
            final String str3;
            String scheme;
            Long startPosition;
            try {
                parse = Uri.parse(url);
                str2 = null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (this.player.getVideoData() == null && (scheme = parse.getScheme()) != null) {
                if (evu0.y(scheme, "http", false)) {
                    StrmManager strmManager = this.player.strmManager;
                    String str4 = this.player.sessionId;
                    DefaultVideoData DefaultVideoData$default = DefaultVideoDataKt.DefaultVideoData$default(url, null, 2, null);
                    PreparingParams preparingParams = this.player.preparingParams;
                    String contentId = preparingParams != null ? preparingParams.getContentId() : null;
                    PreparingParams preparingParams2 = this.player.preparingParams;
                    long longValue = (preparingParams2 == null || (startPosition = preparingParams2.getStartPosition()) == null) ? -9223372036854775807L : startPosition.longValue();
                    PreparingParams preparingParams3 = this.player.preparingParams;
                    boolean autoPlay = preparingParams3 != null ? preparingParams3.getAutoPlay() : false;
                    PreparingParams preparingParams4 = this.player.preparingParams;
                    final String expandManifestUrl = strmManager.expandManifestUrl(str4, DefaultVideoData$default, contentId, longValue, autoPlay, preparingParams4 != null ? preparingParams4.getSourceIndex() : -1, false);
                    final DefaultVideoData DefaultVideoData$default2 = DefaultVideoDataKt.DefaultVideoData$default(expandManifestUrl, null, 2, null);
                    StandaloneTelemetryYandexPlayer standaloneTelemetryYandexPlayer = this.player;
                    PreparingParams preparingParams5 = standaloneTelemetryYandexPlayer.preparingParams;
                    standaloneTelemetryYandexPlayer.preparingParams = preparingParams5 != null ? preparingParams5.copy(new tls() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayer$PlayerDelegateObserverImpl$onLoadSource$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void invoke(PreparingParams.Builder builder) {
                            builder.setVideoData(DefaultVideoData.this);
                            builder.setExpandedManifestUrl(expandManifestUrl);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((PreparingParams.Builder) obj);
                            return zy11.a;
                        }
                    }) : null;
                    this.player.videoData = DefaultVideoData$default2;
                    failure = expandManifestUrl;
                    if (!(failure instanceof Result.Failure) || (str = (String) failure) == null) {
                    }
                    this.player.onLoadSource(str);
                    return;
                }
            }
            PreparingParams preparingParams6 = this.player.preparingParams;
            String expandedManifestUrl = preparingParams6 != null ? preparingParams6.getExpandedManifestUrl() : null;
            String str5 = "";
            if (expandedManifestUrl == null) {
                expandedManifestUrl = "";
            }
            Uri parse2 = Uri.parse(expandedManifestUrl);
            if (jl40.l(parse.getScheme(), parse2.getScheme()) && !jl40.l(parse.getHost(), parse2.getHost())) {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                ArrayList arrayList = new ArrayList();
                for (Object obj : queryParameterNames) {
                    if (!parse2.getQueryParameterNames().contains((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair("name", parse.getQueryParameter((String) it.next())));
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.clearQuery();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    buildUpon.appendQueryParameter((String) pair.getFirst(), (String) pair.getSecond());
                }
                Set<String> queryParameterNames2 = parse2.getQueryParameterNames();
                if (queryParameterNames2 != null) {
                    for (String str6 : queryParameterNames2) {
                        buildUpon.appendQueryParameter(str6, parse2.getQueryParameter(str6));
                    }
                }
                str3 = buildUpon.build().toString();
            } else if (jl40.l(parse.getScheme(), parse2.getScheme()) && jl40.l(parse.getHost(), parse2.getHost()) && jl40.l(parse.getPath(), parse2.getPath())) {
                str3 = null;
            } else {
                PreparingParams preparingParams7 = this.player.preparingParams;
                String expandedManifestUrl2 = preparingParams7 != null ? preparingParams7.getExpandedManifestUrl() : null;
                if (expandedManifestUrl2 != null) {
                    str5 = expandedManifestUrl2;
                }
                str3 = str5;
            }
            if (str3 != null) {
                StandaloneTelemetryYandexPlayer standaloneTelemetryYandexPlayer2 = this.player;
                PreparingParams preparingParams8 = standaloneTelemetryYandexPlayer2.preparingParams;
                standaloneTelemetryYandexPlayer2.preparingParams = preparingParams8 != null ? preparingParams8.copy(new tls() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayer$PlayerDelegateObserverImpl$onLoadSource$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(PreparingParams.Builder builder) {
                        builder.setVideoData(DefaultVideoDataKt.DefaultVideoData$default(str3, null, 2, null));
                        builder.setExpandedManifestUrl(str3);
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((PreparingParams.Builder) obj2);
                        return zy11.a;
                    }
                }) : null;
                str2 = str3;
            }
            failure = str2;
            if (failure instanceof Result.Failure) {
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNetPerfStatus(boolean enabled, String className) {
            HashSet H0;
            Object failure;
            if (enabled) {
                return;
            }
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNetPerfDisabled(className);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNewMediaItem(String url, boolean autoplay) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNewMediaItem(url, autoplay);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onNoSupportedTracksForRenderer(TrackType trackType, String logMessage) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onNoSupportedTracksForRenderer(trackType, logMessage);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPausePlayback() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onPausePlayback();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPlaybackEnded() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackEnded();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPlaybackProgress(long position) {
            HashSet H0;
            HashSet H02;
            Object failure;
            Object failure2;
            super.onPlaybackProgress(position);
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackProgress(position);
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            ObserverDispatcher observerDispatcher2 = this.player.analyticsObservers;
            synchronized (observerDispatcher2.getObservers()) {
                H02 = a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H02.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it2.next()).onAnalyticsPlaybackProgress(position);
                    failure = zy11.a;
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPlaybackSpeedChanged(float speed, boolean isUserAction) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onPlaybackSpeedChanged(speed, isUserAction);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onPreparingWithAdConfig(AdConfig adConfig) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onPreparingWithAdConfig(adConfig);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onRepeat() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onRepeat();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onRepeatModeChanged(RepeatMode repeatMode) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onRepeatModeChanged(repeatMode);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onResumePlayback() {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onResumePlayback();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onSeek(long newPosition, long oldPosition) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onSeek(newPosition, oldPosition);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.telemetry.player.StandaloneTelemetryPlayerDelegateObserver
        public void onSetMediaSource(fe10 mediaItem, PlaybackParameters playbackParameters) {
            this.player.prepareInternal(mediaItem, playbackParameters);
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onStartFromCacheInfoReady(startFromCacheInfo);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onStop(boolean keepDecoders) {
            HashSet H0;
            HashSet H02;
            Object failure;
            Object failure2;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onStopPlayback();
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            ObserverDispatcher observerDispatcher2 = this.player.analyticsObservers;
            synchronized (observerDispatcher2.getObservers()) {
                H02 = a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H02.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it2.next()).onStopPlayback(keepDecoders);
                    failure = zy11.a;
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onSurfaceSizeChanged(int width, int height) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onSurfaceSizeChangedInternal(SizeKt.Size$default(width, height, null, 4, null));
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onTimelineLeftEdgeChanged(long timelineLeftEdgeMs) {
            HashSet H0;
            Object failure;
            super.onTimelineLeftEdgeChanged(timelineLeftEdgeMs);
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onTimelineLeftEdgeChanged(timelineLeftEdgeMs);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoAndStreamTypeChanged(videoType, streamType);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoChunkLoaded(int bitrate) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoChunkLoaded(bitrate);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoDecoderEnabled(decoderCounter);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[SYNTHETIC] */
        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
            HashSet H0;
            String str;
            long j;
            long j2;
            Object failure;
            Throwable a;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    str = decoderName;
                    j = initializedTimestampMs;
                    j2 = initializationDurationMs;
                    try {
                        ((PlayerAnalyticsObserver) it.next()).onVideoDecoderInitialized(str, j, j2);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        th = th;
                        failure = new Result.Failure(th);
                        a = Result.a(failure);
                        if (a == null) {
                        }
                        decoderName = str;
                        initializedTimestampMs = j;
                        initializationDurationMs = j2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = decoderName;
                    j = initializedTimestampMs;
                    j2 = initializationDurationMs;
                }
                a = Result.a(failure);
                if (a == null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
                decoderName = str;
                initializedTimestampMs = j;
                initializationDurationMs = j2;
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoDecoderReleased(String decoderName) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoDecoderReleased(decoderName);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoFramesDropped(int count) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoFramesDropped(count);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onVideoInputFormatChanged(format, codecReuseLog);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onVideoSizeChanged(int width, int height) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onVideoSizeChanged(width, height);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.observers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerObserver) it.next()).onWillPlayWhenReadyChanged(willPlayWhenReady);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
        public void onLoadCanceled(LoadCanceled loadCanceled) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = this.player.analyticsObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerAnalyticsObserver) it.next()).onLoadCanceled(loadCanceled);
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    public /* synthetic */ StandaloneTelemetryYandexPlayer(String str, int i, IndexGenerator indexGenerator, StrmManager strmManager, PlaybackStatsProvider playbackStatsProvider, ConcurrentPlayerStateManager concurrentPlayerStateManager, MediaItemToContentIdMapper mediaItemToContentIdMapper, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, indexGenerator, strmManager, playbackStatsProvider, (i2 & 32) != 0 ? new ConcurrentPlayerStateManagerImpl(indexGenerator) : concurrentPlayerStateManager, mediaItemToContentIdMapper);
    }
}
