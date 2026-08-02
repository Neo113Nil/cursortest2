package ru.yandex.video.m3.player.impl.tracking;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.h5z0;
import defpackage.kux0;
import defpackage.oyr;
import defpackage.scc;
import defpackage.sls;
import defpackage.t601;
import defpackage.tcc;
import defpackage.u601;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StartQualityConstraint;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.TargetFormat;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.data.dto.PlaybackOptions;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.PlayerAliveStateLog;
import ru.yandex.video.m3.player.impl.tracking.data.IgnoredErrorData;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.SimpleDecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.StalledStuckEventData;
import ru.yandex.video.m3.player.impl.tracking.errors.ErrorNoSupportedTracksForRenderer;
import ru.yandex.video.m3.player.impl.tracking.event.AdDataKt;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefaultKt;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.report.DebugReportReason;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.report.builder.ReportBuilderExtKt;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.tracking.ViewPortChangeListener;
import ru.yandex.video.m3.player.tracking.ViewPortProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackSelectionInitializationError;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000¶\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002Â\u0002\b\u0000\u0018\u0000 È\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004È\u0002É\u0002B\u007f\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001e\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b4\u00103J\u0010\u00105\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b5\u00103J\u0018\u00108\u001a\u00020&2\u0006\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b:\u00103J\u0018\u0010<\u001a\u00020&2\u0006\u0010;\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b>\u00103J\u0018\u0010@\u001a\u00020&2\u0006\u0010?\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b@\u0010/J\u0010\u0010A\u001a\u00020&H\u0096\u0001¢\u0006\u0004\bA\u00103J\u0010\u0010B\u001a\u00020&H\u0096\u0001¢\u0006\u0004\bB\u00103J\u0010\u0010C\u001a\u00020&H\u0096\u0001¢\u0006\u0004\bC\u00103J\u0018\u0010E\u001a\u00020&2\u0006\u0010D\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bE\u0010/J\u0018\u0010F\u001a\u00020&2\u0006\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\bF\u00109J \u0010J\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096\u0001¢\u0006\u0004\bJ\u0010KJ\u0018\u0010N\u001a\u00020&2\u0006\u0010M\u001a\u00020LH\u0096\u0001¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\u00020&2\u0006\u0010?\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bP\u0010/J\u0018\u0010S\u001a\u00020&2\u0006\u0010R\u001a\u00020QH\u0096\u0001¢\u0006\u0004\bS\u0010TJ\"\u0010Y\u001a\u00020&2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010WH\u0096\u0001¢\u0006\u0004\bY\u0010ZJ(\u0010^\u001a\u00020&2\u0006\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020,2\u0006\u0010]\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b^\u0010_J\"\u0010c\u001a\u00020&2\u0006\u0010`\u001a\u00020,2\b\u0010b\u001a\u0004\u0018\u00010aH\u0096\u0001¢\u0006\u0004\bc\u0010dJ\u0018\u0010g\u001a\u00020&2\u0006\u0010f\u001a\u00020eH\u0096\u0001¢\u0006\u0004\bg\u0010hJ\u0018\u0010j\u001a\u00020&2\u0006\u0010i\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\bj\u0010kJ\u0018\u0010n\u001a\u00020&2\u0006\u0010m\u001a\u00020lH\u0096\u0001¢\u0006\u0004\bn\u0010oJ \u0010s\u001a\u00020&2\u0006\u0010q\u001a\u00020p2\u0006\u0010r\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\bs\u0010tJ\u0010\u0010u\u001a\u00020&H\u0096\u0001¢\u0006\u0004\bu\u00103J\u0010\u0010v\u001a\u00020&H\u0096\u0001¢\u0006\u0004\bv\u00103J\u001e\u0010y\u001a\u00020&2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020w0#H\u0096\u0001¢\u0006\u0004\by\u0010(J\u0018\u0010|\u001a\u00020&2\u0006\u0010{\u001a\u00020zH\u0096\u0001¢\u0006\u0004\b|\u0010}J\u0018\u0010~\u001a\u00020&2\u0006\u0010{\u001a\u00020zH\u0096\u0001¢\u0006\u0004\b~\u0010}J\u001d\u0010\u0080\u0001\u001a\u00020&2\b\u0010\u007f\u001a\u0004\u0018\u00010GH\u0096\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J+\u0010\u0086\u0001\u001a\u00020&2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0096\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0089\u0001\u001a\u00020&2\u0007\u0010\u0088\u0001\u001a\u00020GH\u0096\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J.\u0010\u008e\u0001\u001a\u00020&2\u0007\u0010\u008b\u0001\u001a\u00020p2\u0007\u0010\u008c\u0001\u001a\u00020,2\u0007\u0010\u008d\u0001\u001a\u00020,H\u0096\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001c\u0010\u0091\u0001\u001a\u00020&2\u0007\u0010\u0090\u0001\u001a\u00020GH\u0096\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J$\u0010\u0092\u0001\u001a\u00020&2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010WH\u0096\u0001¢\u0006\u0005\b\u0092\u0001\u0010ZJ\u001c\u0010\u0095\u0001\u001a\u00020&2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001b\u0010\u0098\u0001\u001a\u00020&2\u0007\u0010\u0097\u0001\u001a\u00020pH\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010>\u001a\u00020&2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0016¢\u0006\u0005\b>\u0010\u009c\u0001J\u001a\u0010>\u001a\u00020&2\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0016¢\u0006\u0005\b>\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020&H\u0016¢\u0006\u0005\b \u0001\u00103J\u001c\u0010£\u0001\u001a\u00020&2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0019\u0010¥\u0001\u001a\u00020&2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0005\b¥\u0001\u0010+J\u001d\u0010¦\u0001\u001a\u00020&2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010pH\u0016¢\u0006\u0006\b¦\u0001\u0010\u0099\u0001J\u001b\u0010§\u0001\u001a\u00020&2\u0007\u0010\u008b\u0001\u001a\u00020pH\u0016¢\u0006\u0006\b§\u0001\u0010\u0099\u0001J\u0011\u0010¨\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b¨\u0001\u00103J\u0011\u0010©\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b©\u0001\u00103J\u001e\u0010¬\u0001\u001a\u00020&2\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001e\u0010®\u0001\u001a\u00020&2\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010\u00ad\u0001J#\u0010°\u0001\u001a\u00020&2\u0006\u0010)\u001a\u00020$2\u0007\u0010¯\u0001\u001a\u00020GH\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0011\u0010²\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b²\u0001\u00103J\u001c\u0010µ\u0001\u001a\u00020&2\b\u0010´\u0001\u001a\u00030³\u0001H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001a\u0010B\u001a\u00020&2\b\u0010¸\u0001\u001a\u00030·\u0001H\u0016¢\u0006\u0005\bB\u0010¹\u0001J\u0011\u0010º\u0001\u001a\u00020&H\u0016¢\u0006\u0005\bº\u0001\u00103J\u0011\u0010»\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b»\u0001\u00103J\u001a\u0010½\u0001\u001a\u00020&2\u0007\u0010¼\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b½\u0001\u0010kJ\u0011\u0010¾\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b¾\u0001\u00103J\u0011\u0010¿\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b¿\u0001\u00103J\u001c\u0010Â\u0001\u001a\u00020&2\b\u0010Á\u0001\u001a\u00030À\u0001H\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001c\u0010Æ\u0001\u001a\u00020&2\b\u0010Å\u0001\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J&\u0010Ê\u0001\u001a\u00020&2\b\u0010Å\u0001\u001a\u00030Ä\u00012\b\u0010É\u0001\u001a\u00030È\u0001H\u0016¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001c\u0010Í\u0001\u001a\u00020&2\b\u0010Ì\u0001\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÍ\u0001\u0010Ç\u0001J%\u0010Í\u0001\u001a\u00020&2\b\u0010Ì\u0001\u001a\u00030Ä\u00012\u0007\u0010Î\u0001\u001a\u00020pH\u0016¢\u0006\u0006\bÍ\u0001\u0010Ï\u0001J$\u0010Ò\u0001\u001a\u00020&2\u0007\u0010Ð\u0001\u001a\u00020,2\u0007\u0010Ñ\u0001\u001a\u00020,H\u0016¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J/\u0010Ö\u0001\u001a\u00020&2\u0006\u0010b\u001a\u00020a2\u0007\u0010\u008b\u0001\u001a\u00020p2\n\u0010Õ\u0001\u001a\u0005\u0018\u00010Ô\u0001H\u0016¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0019\u0010Ø\u0001\u001a\u00020&2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0005\bØ\u0001\u0010TJ$\u0010Û\u0001\u001a\u00020&2\u0007\u0010Ù\u0001\u001a\u00020,2\u0007\u0010Ú\u0001\u001a\u00020,H\u0016¢\u0006\u0006\bÛ\u0001\u0010Ó\u0001J\u0018\u0010C\u001a\u00020&2\u0007\u0010Ü\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0004\bC\u0010kJ\u0011\u0010Ý\u0001\u001a\u00020&H\u0016¢\u0006\u0005\bÝ\u0001\u00103J#\u0010ß\u0001\u001a\u00020&2\u0006\u0010b\u001a\u00020a2\u0007\u0010Þ\u0001\u001a\u00020pH\u0016¢\u0006\u0006\bß\u0001\u0010à\u0001J\u001a\u0010â\u0001\u001a\u00020&2\u0007\u0010á\u0001\u001a\u00020,H\u0016¢\u0006\u0005\bâ\u0001\u0010/J(\u0010å\u0001\u001a\u00020&2\u0014\u0010ä\u0001\u001a\u000f\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020,0ã\u0001H\u0016¢\u0006\u0006\bå\u0001\u0010æ\u0001J0\u0010ë\u0001\u001a\u00020&2\b\u0010è\u0001\u001a\u00030ç\u00012\b\u0010é\u0001\u001a\u00030ç\u00012\b\u0010ê\u0001\u001a\u00030ç\u0001H\u0016¢\u0006\u0006\bë\u0001\u0010ì\u0001J&\u0010í\u0001\u001a\u00020&2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010\u007f\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001c\u0010í\u0001\u001a\u00020&2\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0016¢\u0006\u0006\bí\u0001\u0010ñ\u0001J\u001c\u0010ô\u0001\u001a\u00020&2\b\u0010ó\u0001\u001a\u00030ò\u0001H\u0016¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u001b\u0010÷\u0001\u001a\u00020&2\u0007\u0010ö\u0001\u001a\u00020pH\u0016¢\u0006\u0006\b÷\u0001\u0010\u0099\u0001J%\u0010û\u0001\u001a\u00020&2\b\u0010ù\u0001\u001a\u00030ø\u00012\u0007\u0010ú\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u001e\u0010ÿ\u0001\u001a\u00020&2\f\u0010þ\u0001\u001a\u0007\u0012\u0002\b\u00030ý\u0001¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u001b\u0010\u0082\u0002\u001a\u0004\u0018\u00010\b2\u0007\u0010\u0081\u0002\u001a\u00020\u001d¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u0011\u0010\u0084\u0002\u001a\u00020&H\u0007¢\u0006\u0005\b\u0084\u0002\u00103J\u0011\u0010\u0085\u0002\u001a\u00020&H\u0007¢\u0006\u0005\b\u0085\u0002\u00103J\u0011\u0010\u0086\u0002\u001a\u00020&H\u0007¢\u0006\u0005\b\u0086\u0002\u00103J\u0011\u0010\u0087\u0002\u001a\u00020&H\u0007¢\u0006\u0005\b\u0087\u0002\u00103J\u0011\u0010\u0088\u0002\u001a\u00020&H\u0007¢\u0006\u0005\b\u0088\u0002\u00103J\u001c\u0010\u0089\u0002\u001a\u00020&2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0007¢\u0006\u0006\b\u0089\u0002\u0010\u009c\u0001J\u001b\u0010\u008b\u0002\u001a\u00020&2\u0007\u0010\u008a\u0002\u001a\u00020pH\u0016¢\u0006\u0006\b\u008b\u0002\u0010\u0099\u0001J\u001c\u0010\u008e\u0002\u001a\u00020&2\b\u0010\u008d\u0002\u001a\u00030\u008c\u0002H\u0016¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u001c\u0010\u0092\u0002\u001a\u00020&2\b\u0010\u0091\u0002\u001a\u00030\u0090\u0002H\u0016¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J$\u0010\u0096\u0002\u001a\u00020&2\u0007\u0010\u0094\u0002\u001a\u00020\u001d2\u0007\u0010\u0095\u0002\u001a\u00020\u001dH\u0007¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J\u0013\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0098\u0002¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u001a\u0010\u009c\u0002\u001a\u00020&2\u0007\u0010\u009b\u0002\u001a\u00020\u001dH\u0002¢\u0006\u0005\b\u009c\u0002\u0010kJ\u001f\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u009d\u00022\b\u0010\u008d\u0002\u001a\u00030\u008c\u0002H\u0002¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J\u0012\u0010 \u0002\u001a\u00020\bH\u0002¢\u0006\u0006\b \u0002\u0010¡\u0002J\u001a\u0010£\u0002\u001a\u00020&2\u0007\u0010¢\u0002\u001a\u00020\u001dH\u0002¢\u0006\u0005\b£\u0002\u0010kJ\u0019\u0010¤\u0002\u001a\u00020&*\u0005\u0018\u00010\u0098\u0002H\u0002¢\u0006\u0006\b¤\u0002\u0010¥\u0002R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¦\u0002R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010§\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¨\u0002R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010©\u0002R\u0015\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010©\u0002R\u0015\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010ª\u0002R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010«\u0002R\u0015\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010¬\u0002R\u0017\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u00ad\u0002R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010®\u0002R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010¯\u0002R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010°\u0002R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010±\u0002R \u0010þ\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010²\u0002R&\u0010´\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0002\b\u0003\u0018\u00010³\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002R&\u0010¶\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0002\b\u0003\u0018\u00010³\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010µ\u0002R\u0019\u0010·\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010°\u0002R\u0019\u0010¸\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010°\u0002R&\u0010º\u0002\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020p0¹\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u001a\u0010¼\u0002\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u0019\u0010¾\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010°\u0002R\u0019\u0010¼\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010°\u0002R\u0019\u0010¿\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010°\u0002R\u001c\u0010À\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u0018\u0010Ã\u0002\u001a\u00030Â\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010Ä\u0002R\u0018\u0010Æ\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002¨\u0006Ê\u0002"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/TrackingObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Lru/yandex/video/m3/player/impl/tracking/TrackChangesObserver;", "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "Lru/yandex/video/m3/player/tracking/ViewPortChangeListener;", "Lru/yandex/video/m3/player/impl/tracking/State;", "initialState", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "eventTracker", "Lru/yandex/video/m3/player/impl/tracking/StateProvider;", "stateProvider", "Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;", "stalledStateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "playerAliveScheduledExecutorService", "decoderUsageObserver", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "logConfigs", "trackChangesObserverImpl", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldSendCreatePlayerEvent", "Lru/yandex/video/m3/player/tracking/ViewPortProvider;", "viewPortProvider", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "reportBuilder", "", "enableCodecTelemetryReportLogger", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/State;Lru/yandex/video/m3/player/impl/tracking/EventTracker;Lru/yandex/video/m3/player/impl/tracking/StateProvider;Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;Lru/yandex/video/m3/player/impl/tracking/TrackChangesObserver;Ljava/util/concurrent/atomic/AtomicBoolean;Lru/yandex/video/m3/player/tracking/ViewPortProvider;Lru/yandex/video/m3/player/report/builder/ReportBuilder;ZLru/yandex/video/m3/ab/config/AbConfig;)V", "", "Lru/yandex/video/m3/data/Ad;", "adList", "Lzy11;", "onAdListChanged", "(Ljava/util/List;)V", "ad", "onAdSkipAvailable", "(Lru/yandex/video/m3/data/Ad;)V", "", "bufferSizeMs", "onBufferSizeChanged", "(J)V", "durationMs", "onContentDurationChanged", "onDrmKeysLoaded", "()V", "onEngineBufferingEnd", "onEngineBufferingStart", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onEnginePrepared", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "onFirstFrame", "hidedPlayer", "onHidedPlayerReady", "(Ljava/lang/Object;)V", "onLoadingStart", "positionMs", "onPlaybackProgress", "onPlayerReleased", "onReadyForFirstPlayback", "onStopPlayback", "timelineLeftEdgeMs", "onTimelineLeftEdgeChanged", "onVideoDataPrepared", "", "width", "height", "onVideoSizeChanged", "(II)V", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "onAnalyticsPlaybackProgress", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "onAudioDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onAudioInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "bytes", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "Lru/yandex/video/m3/data/DrmType;", "drmType", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "foreground", "onForegroundModeSet", "(Z)V", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "fullscreenDataBundle", "onFullscreenInfoUpdated", "(Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;)V", "", "url", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "onPauseCommand", "onPlayCommand", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "skips", "onSkipsUpdated", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "onSurfaceSizeChanged", "(Lru/yandex/video/m3/data/Size;)V", "onSurfaceSizeChangedInternal", "quality", "onUserManuallySelectedQuality", "(Ljava/lang/Integer;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "bitrate", "onVideoChunkLoaded", "(I)V", "decoderName", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Ljava/lang/String;JJ)V", "count", "onVideoFramesDropped", "onVideoInputFormatChanged", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "expandedManifestUrl", "onLoadSource", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/data/StalledReason;", "stalledReason", "(Lru/yandex/video/m3/data/StalledReason;)V", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "extendedStalledReason", "(Lru/yandex/video/m3/data/ExtendedStalledReason;)V", "onLoadingFinished", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdStart", "onVideoDecoderReleased", "onAudioDecoderReleased", "onAdEnd", "onAdSkipped", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "firstPlaybackInfo", "(Lru/yandex/video/m3/player/FirstPlaybackInfo;)V", "onResumePlayback", "onPausePlayback", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "onPlaybackEnded", "onRepeat", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "onRepeatModeChanged", "(Lru/yandex/video/m3/player/RepeatMode;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/data/RecoverDetails;", "recoverDetails", "onPlayerWillTryRecoverAfterError", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/data/RecoverDetails;)V", "nonFatalPlaybackException", "onNonFatalPlaybackException", "ignoreReason", "(Lru/yandex/video/m3/player/PlaybackException;Ljava/lang/String;)V", "chunkLengthMs", "loadTimeMs", "onDataLoaded", "(JJ)V", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "onVideoDecoderEnabled", "newPositionMs", "oldPositionMs", "onSeek", "keepDecoders", "onStopCommand", "logMessage", "onNoSupportedTracksForRenderer", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;)V", "bandwidthEstimation", "onBandwidthEstimation", "", "estimates", "onInitialBandwidthEstimatesAcquired", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "onLoadCanceled", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "className", "onNetPerfDisabled", "", "speed", "isUserAction", "onPlaybackSpeedChanged", "(FZ)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "isPlayerDestroying", "release", "(Z)Lru/yandex/video/m3/player/impl/tracking/State;", "submitPlayerAlive", TrackingObserver.MAYBE_SEND_START, TrackingObserver.SCHEDULE_WATCH_EVENTS, TrackingObserver.STOP_SCHEDULE_WATCH_EVENTS, TrackingObserver.STOP_STALLED, TrackingObserver.START_STALLED, "eventName", "logEvent", "", "throwable", "logError", "(Ljava/lang/Throwable;)V", "Lru/yandex/video/m3/data/ViewPortState;", "viewPortState", "onViewPortChanged", "(Lru/yandex/video/m3/data/ViewPortState;)V", "isFirstEverStart", "autoPlay", TrackingObserver.ON_PLAY_BACK_INITIALIZATION, "(ZZ)V", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "getPlaybackOptions", "()Lru/yandex/video/m3/data/dto/PlaybackOptions;", "isAdStarting", "updateAdContentIdInPlaybackOptions", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "generateEventDataForExc", "(Ljava/lang/Throwable;)Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "getState", "()Lru/yandex/video/m3/player/impl/tracking/State;", "value", TrackingObserver.SET_PLAY_WHEN_READY, "reportMissingIfNull", "(Lru/yandex/video/m3/data/dto/PlaybackOptions;)V", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "Lru/yandex/video/m3/player/impl/tracking/StateProvider;", "Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "Lru/yandex/video/m3/player/impl/tracking/TrackChangesObserver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/yandex/video/m3/player/tracking/ViewPortProvider;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "Z", "Lru/yandex/video/m3/ab/config/AbConfig;", "Lru/yandex/video/m3/player/YandexPlayer;", "Ljava/util/concurrent/Future;", "watchedTimeFutures", "Ljava/util/List;", "stalledStateFutures", "isWatchEverStarted", "isTrackSelectionInitializationEverSent", "", "initializedDecoders", "Ljava/util/Map;", "lastStalledReason", "Lru/yandex/video/m3/data/StalledReason;", "isLoading", "isReleased", "playbackOptions", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "ru/yandex/video/m3/player/impl/tracking/TrackingObserver$playerAliveLogHolder$1", "playerAliveLogHolder", "Lru/yandex/video/m3/player/impl/tracking/TrackingObserver$playerAliveLogHolder$1;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "Companion", "MissingPlaybackOptionsException", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingObserver implements PlayerObserver<Object>, PlayerAnalyticsObserver, StrmEventLogger, TrackChangesObserver, DecoderUsageObserver, ViewPortChangeListener {
    private static final String MAYBE_SEND_START = "maybeSendStart";
    private static final String ON_PLAY_BACK_INITIALIZATION = "onPlaybackInitialization";
    private static final String SCHEDULE_WATCH_EVENTS = "scheduleWatchEvents";
    private static final String SET_PLAY_WHEN_READY = "setPlayWhenReady";
    private static final String START_STALLED = "startStalled";
    private static final String STOP_SCHEDULE_WATCH_EVENTS = "stopScheduleWatchEvents";
    private static final String STOP_STALLED = "stopStalled";
    private static final String TAG = "TrackingObserver";
    private final AbConfig abConfig;
    private final DecoderUsageObserver decoderUsageObserver;
    private final boolean enableCodecTelemetryReportLogger;
    private final EventTracker eventTracker;
    private Map<TrackType, String> initializedDecoders;
    private boolean isLoading;
    private volatile boolean isReleased;
    private boolean isTrackSelectionInitializationEverSent;
    private boolean isWatchEverStarted;
    private StalledReason lastStalledReason;
    private final PlayerAliveStateLog.LogConfigs logConfigs;
    private final TimberPlayerLogger logger;
    private PlaybackOptions playbackOptions;
    private YandexPlayer<?> player;
    private final TrackingObserver$playerAliveLogHolder$1 playerAliveLogHolder;
    private final ScheduledExecutorService playerAliveScheduledExecutorService;
    private final ReportBuilder reportBuilder;
    private final ScheduledExecutorService scheduledExecutorService;
    private AtomicBoolean shouldSendCreatePlayerEvent;
    private volatile List<? extends Future<?>> stalledStateFutures;
    private final StalledStateProvider stalledStateProvider;
    private final StateProvider stateProvider;
    private final TrackChangesObserver trackChangesObserverImpl;
    private final ViewPortProvider viewPortProvider;
    private volatile List<? extends Future<?>> watchedTimeFutures;
    private boolean willPlayWhenReady;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/TrackingObserver$MissingPlaybackOptionsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MissingPlaybackOptionsException extends RuntimeException {
        public static final int $stable = 0;

        public MissingPlaybackOptionsException() {
            super("PlaybackOptions are missing when required to log event");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackType.Audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ru.yandex.video.m3.player.impl.tracking.PlayerAliveLogHolder, ru.yandex.video.m3.player.impl.tracking.TrackingObserver$playerAliveLogHolder$1] */
    public TrackingObserver(State state, EventTracker eventTracker, StateProvider stateProvider, StalledStateProvider stalledStateProvider, ScheduledExecutorService scheduledExecutorService, final ScheduledExecutorService scheduledExecutorService2, DecoderUsageObserver decoderUsageObserver, final PlayerAliveStateLog.LogConfigs logConfigs, TrackChangesObserver trackChangesObserver, AtomicBoolean atomicBoolean, ViewPortProvider viewPortProvider, ReportBuilder reportBuilder, boolean z, AbConfig abConfig) {
        this.eventTracker = eventTracker;
        this.stateProvider = stateProvider;
        this.stalledStateProvider = stalledStateProvider;
        this.scheduledExecutorService = scheduledExecutorService;
        this.playerAliveScheduledExecutorService = scheduledExecutorService2;
        this.decoderUsageObserver = decoderUsageObserver;
        this.logConfigs = logConfigs;
        this.trackChangesObserverImpl = trackChangesObserver;
        this.shouldSendCreatePlayerEvent = atomicBoolean;
        this.viewPortProvider = viewPortProvider;
        this.reportBuilder = reportBuilder;
        this.enableCodecTelemetryReportLogger = z;
        this.abConfig = abConfig;
        EmptyList emptyList = EmptyList.a;
        this.watchedTimeFutures = emptyList;
        this.stalledStateFutures = emptyList;
        this.initializedDecoders = new LinkedHashMap();
        this.lastStalledReason = StalledReason.INIT;
        this.isLoading = state != null ? state.isLoading() : false;
        this.willPlayWhenReady = state != null ? state.getWillPlayWhenReady() : false;
        ?? r1 = new PlayerAliveLogHolder(logConfigs, scheduledExecutorService2) { // from class: ru.yandex.video.m3.player.impl.tracking.TrackingObserver$playerAliveLogHolder$1
            @Override // ru.yandex.video.m3.player.impl.tracking.PlayerAliveLogHolder
            public PlayerAliveState getCurrentState() {
                StateProvider stateProvider2;
                PlayerAliveState.Companion companion = PlayerAliveState.INSTANCE;
                stateProvider2 = TrackingObserver.this.stateProvider;
                return companion.fromPlayerState(stateProvider2.getPlayerState());
            }

            @Override // ru.yandex.video.m3.player.impl.tracking.PlayerAliveLogHolder
            public void sendStates(List<PlayerAliveState> states) {
                EventTracker eventTracker2;
                StateProvider stateProvider2;
                PlaybackOptions playbackOptions;
                eventTracker2 = TrackingObserver.this.eventTracker;
                stateProvider2 = TrackingObserver.this.stateProvider;
                PlayerState playerState = stateProvider2.getPlayerState();
                playbackOptions = TrackingObserver.this.playbackOptions;
                eventTracker2.onPlayerAlive(playerState, states, playbackOptions);
            }
        };
        this.playerAliveLogHolder = r1;
        this.logger = new TimberPlayerLogger();
        r1.initLog();
    }

    private final DefaultEventData generateEventDataForExc(Throwable throwable) {
        if (throwable instanceof PlaybackException.ErrorInRenderer) {
            DecoderUsageObserver decoderUsageObserver = this.decoderUsageObserver;
            DecoderUsageObserverImpl decoderUsageObserverImpl = decoderUsageObserver instanceof DecoderUsageObserverImpl ? (DecoderUsageObserverImpl) decoderUsageObserver : null;
            if (decoderUsageObserverImpl != null) {
                return decoderUsageObserverImpl.getRendererEventData(((PlaybackException.ErrorInRenderer) throwable).getTrackType());
            }
        } else if (throwable instanceof PlaybackException.ErrorStalledStuck) {
            return new StalledStuckEventData(((PlaybackException.ErrorStalledStuck) throwable).getLoadControlState());
        }
        return null;
    }

    private final State getState() {
        return new State(this.willPlayWhenReady, this.isLoading);
    }

    private final void reportMissingIfNull(PlaybackOptions playbackOptions) {
        if (playbackOptions == null) {
            EventTracker.onError$default(this.eventTracker, this.stateProvider.getPlayerState(), new MissingPlaybackOptionsException(), false, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleWatchEvents$lambda$39$lambda$36(TrackingObserver trackingObserver) {
        PlayerState playerState = trackingObserver.stateProvider.getPlayerState();
        TimberPlayerLogger timberPlayerLogger = trackingObserver.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, SCHEDULE_WATCH_EVENTS, "on30SecHeartbeat watched=" + playerState.getWatchedTime(), new Object[0]);
        }
        trackingObserver.eventTracker.on30SecHeartbeat(playerState);
    }

    private final void setPlayWhenReady(boolean value) {
        this.stalledStateProvider.setPlayWhenReady(value);
        boolean z = this.willPlayWhenReady;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (z == value) {
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
                timberPlayerLogger.debug(TAG, SET_PLAY_WHEN_READY, "onWillPlayWhenReadyPossiblyChanged willPlayWhenReady hasn't changed. It is still " + this.willPlayWhenReady, new Object[0]);
                return;
            }
            return;
        }
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, SET_PLAY_WHEN_READY, "onWillPlayWhenReadyChanged willPlayWhenReady=" + value + " isLoading=" + this.isLoading, new Object[0]);
        }
        this.willPlayWhenReady = value;
        if (this.isLoading) {
            if (value) {
                startStalled(this.lastStalledReason);
            } else {
                stopStalled();
                this.lastStalledReason = StalledReason.OTHER;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startStalled$lambda$53$lambda$52(TrackingObserver trackingObserver, StalledState stalledState) {
        trackingObserver.eventTracker.onStalled(trackingObserver.stateProvider.getPlayerState(), stalledState);
    }

    private final void updateAdContentIdInPlaybackOptions(boolean isAdStarting) {
        PlaybackOptions playbackOptions = null;
        String str = isAdStarting ? "unknownAdContentId" : null;
        PlaybackOptions playbackOptions2 = this.playbackOptions;
        if (playbackOptions2 instanceof PlaybackOptions.ContentIdPlaybackOptions) {
            playbackOptions = PlaybackOptions.ContentIdPlaybackOptions.copy$default((PlaybackOptions.ContentIdPlaybackOptions) playbackOptions2, null, null, null, false, str, null, null, null, null, 495, null);
        } else if (playbackOptions2 instanceof PlaybackOptions.DirectSourcePlaybackOptions) {
            playbackOptions = PlaybackOptions.DirectSourcePlaybackOptions.copy$default((PlaybackOptions.DirectSourcePlaybackOptions) playbackOptions2, null, null, null, null, false, str, null, null, null, 479, null);
        } else if (playbackOptions2 != null) {
            w511.b();
            return;
        }
        this.playbackOptions = playbackOptions;
    }

    public final PlaybackOptions getPlaybackOptions() {
        return this.playbackOptions;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmEventLogger
    public void logError(Throwable throwable) {
        EventTracker.onError$default(this.eventTracker, this.stateProvider.getPlayerState(), throwable, false, null, 8, null);
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmEventLogger
    public void logEvent(String eventName) {
        this.eventTracker.onEvent(this.stateProvider.getPlayerState(), eventName);
    }

    public final void maybeSendStart() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            StringBuilder sb = new StringBuilder("isWatchEverStarted=");
            sb.append(this.isWatchEverStarted);
            sb.append(" player?.isPlayingAd()=");
            YandexPlayer<?> yandexPlayer = this.player;
            sb.append(yandexPlayer != null ? Boolean.valueOf(yandexPlayer.isPlayingAd()) : null);
            timberPlayerLogger.debug(TAG, MAYBE_SEND_START, sb.toString(), new Object[0]);
        }
        if (this.isWatchEverStarted) {
            return;
        }
        YandexPlayer<?> yandexPlayer2 = this.player;
        if (yandexPlayer2 == null || !yandexPlayer2.isPlayingAd()) {
            TimberPlayerLogger timberPlayerLogger2 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, MAYBE_SEND_START, "send Start", new Object[0]);
            }
            this.eventTracker.onStart(this.stateProvider.getPlayerState(), this.initializedDecoders);
            this.isWatchEverStarted = true;
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdConfigSet(AdConfig adConfig) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onAdConfigSet", null, new Object[0], 4, null);
        }
        this.eventTracker.onAdConfigSet(adConfig);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdEnd() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onAdEnd", null, new Object[0], 4, null);
        }
        updateAdContentIdInPlaybackOptions(false);
        this.stateProvider.onAdEnd();
        this.eventTracker.onAdEnd(this.stateProvider.getPlayerState());
        maybeSendStart();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdError(AdException exception) {
        boolean z = false;
        h5z0.a.d("onAdError " + exception, new Object[0]);
        if (exception instanceof AdException.PlaybackEngineError) {
            Throwable cause = exception.getCause();
            PlaybackException playbackException = cause instanceof PlaybackException ? (PlaybackException) cause : null;
            if (playbackException != null) {
                z = playbackException instanceof PlaybackException.ErrorInRenderer;
            }
        }
        this.eventTracker.onAdError(this.stateProvider.getPlayerState(), exception, z);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdListChanged(List<Ad> adList) {
        this.trackChangesObserverImpl.onAdListChanged(adList);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAdMetadata(AdMetadata adMetadata) {
        this.decoderUsageObserver.onAdMetadata(adMetadata);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdPodEnd() {
        this.eventTracker.onAdPodEnd(this.stateProvider.getPlayerState());
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdPodStart(Ad ad, int index) {
        this.eventTracker.onAdPodStart(this.stateProvider.getPlayerState(), ad);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdSkipAvailable(Ad ad) {
        this.trackChangesObserverImpl.onAdSkipAvailable(ad);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdSkipped() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onAdSkipped", null, new Object[0], 4, null);
        }
        this.eventTracker.onAdSkipped(this.stateProvider.getPlayerState());
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdStart(Ad ad) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onAdStart", "ad=" + ad, new Object[0]);
        }
        updateAdContentIdInPlaybackOptions(true);
        this.stateProvider.onAdStart(AdDataKt.toTrackingAdType(ad.getType()));
        stopScheduleWatchEvents();
        this.eventTracker.onAdStart(this.stateProvider.getPlayerState(), ad);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAnalyticsPlaybackProgress(long positionMs) {
        this.decoderUsageObserver.onAnalyticsPlaybackProgress(positionMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
        this.decoderUsageObserver.onAudioDecoderEnabled(decoderCounter);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioDecoderReleased(String decoderName) {
        this.eventTracker.onDecoderReleased(TrackType.Audio, new SimpleDecoderEventData(decoderName));
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        this.decoderUsageObserver.onAudioInputFormatChanged(format, codecReuseLog);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBandwidthEstimation(long bandwidthEstimation) {
        this.stateProvider.setBandwidthEstimation(bandwidthEstimation);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        this.decoderUsageObserver.onBandwidthSample(elapsedMs, bytesTransferred, bitrateEstimate);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onBufferSizeChanged(long bufferSizeMs) {
        this.trackChangesObserverImpl.onBufferSizeChanged(bufferSizeMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBytesLoaded(long bytes, TrackType trackType) {
        this.decoderUsageObserver.onBytesLoaded(bytes, trackType);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onContentDurationChanged(long durationMs) {
        this.trackChangesObserverImpl.onContentDurationChanged(durationMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDataLoaded(long chunkLengthMs, long loadTimeMs) {
        this.stateProvider.onDataLoaded(chunkLengthMs, loadTimeMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
        this.initializedDecoders.put(trackType, decoderName);
        this.decoderUsageObserver.onDecoderInitialized(trackType, decoderName, mediaCodecSelectorLog);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onDrmKeysLoaded() {
        this.trackChangesObserverImpl.onDrmKeysLoaded();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDrmSessionAcquired(DrmType drmType) {
        this.decoderUsageObserver.onDrmSessionAcquired(drmType);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onEngineBufferingEnd() {
        this.trackChangesObserverImpl.onEngineBufferingEnd();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onEngineBufferingStart() {
        this.trackChangesObserverImpl.onEngineBufferingStart();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onEnginePrepared(VideoData videoData) {
        this.trackChangesObserverImpl.onEnginePrepared(videoData);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onFirstFrame() {
        this.trackChangesObserverImpl.onFirstFrame();
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver
    public void onForegroundModeSet(boolean foreground) {
        this.decoderUsageObserver.onForegroundModeSet(foreground);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onFullscreenInfoUpdated(FullscreenDataBundle fullscreenDataBundle) {
        this.decoderUsageObserver.onFullscreenInfoUpdated(fullscreenDataBundle);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onHidedPlayerReady(Object hidedPlayer) {
        this.trackChangesObserverImpl.onHidedPlayerReady(hidedPlayer);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onInitialBandwidthEstimatesAcquired(Map<String, Long> estimates) {
        this.stateProvider.setInitialBandwidthEstimatesAcquired(estimates);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadCanceled(TrackType trackType, Integer quality) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onLoadCanceled", "trackType: " + trackType + " quality: " + quality, new Object[0]);
        }
        this.eventTracker.onLoadCanceled(this.stateProvider.getPlayerState(), trackType, quality);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadError(LoadError loadError) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onLoadError", "loadError: " + loadError, new Object[0]);
        }
        this.eventTracker.onLoadError(this.stateProvider.getPlayerState(), loadError);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadSource(String expandedManifestUrl) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onLoadSource", null, new Object[0], 4, null);
        }
        PlaybackOptions playbackOptions = this.playbackOptions;
        PlaybackOptions playbackOptions2 = null;
        if (playbackOptions instanceof PlaybackOptions.ContentIdPlaybackOptions) {
            PlaybackOptions.ContentIdPlaybackOptions contentIdPlaybackOptions = (PlaybackOptions.ContentIdPlaybackOptions) playbackOptions;
            YandexPlayer<?> yandexPlayer = this.player;
            playbackOptions2 = PlaybackOptions.ContentIdPlaybackOptions.copy$default(contentIdPlaybackOptions, null, null, null, false, null, yandexPlayer != null ? yandexPlayer.getVideoData() : null, expandedManifestUrl, null, null, 415, null);
        } else if (playbackOptions instanceof PlaybackOptions.DirectSourcePlaybackOptions) {
            playbackOptions2 = PlaybackOptions.DirectSourcePlaybackOptions.copy$default((PlaybackOptions.DirectSourcePlaybackOptions) playbackOptions, null, null, null, null, false, null, expandedManifestUrl, null, null, 447, null);
        } else if (playbackOptions != null) {
            w511.b();
            return;
        }
        this.playbackOptions = playbackOptions2;
        this.eventTracker.onLoadSource();
        this.stateProvider.connectToPlayer();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingFinished() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            StringBuilder sb = new StringBuilder("player?.isPlaying()=");
            YandexPlayer<?> yandexPlayer = this.player;
            sb.append(yandexPlayer != null ? Boolean.valueOf(yandexPlayer.isPlaying()) : null);
            sb.append(" player.isPlaying()=");
            YandexPlayer<?> yandexPlayer2 = this.player;
            sb.append(yandexPlayer2 != null ? Boolean.valueOf(yandexPlayer2.isPlaying()) : null);
            sb.append("  player.isPlayingAd()=");
            YandexPlayer<?> yandexPlayer3 = this.player;
            sb.append(yandexPlayer3 != null ? Boolean.valueOf(yandexPlayer3.isPlayingAd()) : null);
            sb.append(" willPlayWhenReady=");
            sb.append(this.willPlayWhenReady);
            timberPlayerLogger.debug(TAG, "onLoadingFinished", sb.toString(), new Object[0]);
        }
        this.isLoading = false;
        stopStalled();
        if (this.willPlayWhenReady) {
            YandexPlayer<?> yandexPlayer4 = this.player;
            if (yandexPlayer4 == null || !yandexPlayer4.isPlayingAd()) {
                scheduleWatchEvents();
            }
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadingStart(StalledReason stalledReason) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onLoadingStart", "stalledReason = " + stalledReason, new Object[0]);
        }
        this.lastStalledReason = stalledReason;
        this.isLoading = true;
        if (this.willPlayWhenReady) {
            startStalled(stalledReason);
        }
        stopScheduleWatchEvents();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onNetPerfDisabled(String className) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onNetPerfDisabled", null, new Object[0], 4, null);
        }
        this.eventTracker.onNetPerfDisabled(this.stateProvider.getPlayerState(), className);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onNewMediaItem(String url, boolean autoplay) {
        this.decoderUsageObserver.onNewMediaItem(url, autoplay);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onNoSupportedTracksForRenderer(TrackType trackType, String logMessage) {
        int i = WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        Throwable audio = i != 1 ? i != 2 ? null : new ErrorNoSupportedTracksForRenderer.Audio(logMessage) : new ErrorNoSupportedTracksForRenderer.Video(logMessage);
        if (audio != null) {
            this.eventTracker.onError(this.stateProvider.getPlayerState(), audio, true, generateEventDataForExc(audio));
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onNonFatalPlaybackException(PlaybackException nonFatalPlaybackException) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onPlayerWillTryRecoverAfterError", String.valueOf(nonFatalPlaybackException), new Object[0]);
        }
        this.eventTracker.onError(this.stateProvider.getPlayerState(), nonFatalPlaybackException, false, generateEventDataForExc(nonFatalPlaybackException));
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPauseCommand() {
        this.decoderUsageObserver.onPauseCommand();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPausePlayback() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onPausePlayback", null, new Object[0], 4, null);
        }
        this.stateProvider.onPausePlayback();
        submitPlayerAlive();
        stopScheduleWatchEvents();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPlayCommand() {
        this.decoderUsageObserver.onPlayCommand();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackEnded() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onPlaybackEnded", null, new Object[0], 4, null);
        }
        stopScheduleWatchEvents();
        this.stateProvider.onPlaybackEnded();
        submitPlayerAlive();
        this.eventTracker.onEnd(this.stateProvider.getPlayerState());
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackError(PlaybackException playbackException) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onPlaybackError", String.valueOf(playbackException), new Object[0]);
        }
        setPlayWhenReady(false);
        stopScheduleWatchEvents();
        this.stateProvider.onPlaybackError();
        submitPlayerAlive();
        if (this.enableCodecTelemetryReportLogger) {
            this.eventTracker.onMaybeDebugReport(playbackException, new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.TrackingObserver$onPlaybackError$2
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final DebugReport invoke() {
                    ReportBuilder reportBuilder;
                    reportBuilder = TrackingObserver.this.reportBuilder;
                    return reportBuilder.getDebugReport();
                }
            });
        }
        this.eventTracker.onFatalError(this.stateProvider.getPlayerState(), playbackException, generateEventDataForExc(playbackException));
    }

    public final void onPlaybackInitialization(boolean isFirstEverStart, boolean autoPlay) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, ON_PLAY_BACK_INITIALIZATION, timberPlayerLogger + HexString.CHAR_SPACE + Thread.currentThread().getName(), new Object[0]);
        }
        TimberPlayerLogger timberPlayerLogger2 = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
            timberPlayerLogger2.debug(TAG, ON_PLAY_BACK_INITIALIZATION, "onInitialization isFirstEverStart=" + isFirstEverStart + " autoPlay=" + autoPlay, new Object[0]);
        }
        startLog();
        reportMissingIfNull(this.playbackOptions);
        boolean z = this.shouldSendCreatePlayerEvent.get();
        EventTracker eventTracker = this.eventTracker;
        if (z) {
            eventTracker.onCreatePlayer(this.abConfig);
            this.shouldSendCreatePlayerEvent.set(false);
        } else {
            eventTracker.onSetSource();
        }
        if (this.isLoading && autoPlay) {
            onLoadingStart(StalledReason.SET_SOURCE);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackProgress(long positionMs) {
        this.trackChangesObserverImpl.onPlaybackProgress(positionMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackSpeedChanged(float speed, boolean isUserAction) {
        submitPlayerAlive();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlayerReleased() {
        this.trackChangesObserverImpl.onPlayerReleased();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPlayerWillTryRecoverAfterError(PlaybackException playbackException, RecoverDetails recoverDetails) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onPlayerWillTryRecoverAfterError", String.valueOf(playbackException), new Object[0]);
        }
        this.eventTracker.onRecoverStreamError(playbackException, recoverDetails);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        String contentId = params.getContentId();
        VideoData videoData = params.getVideoData();
        PlaybackOptions playbackOptions = null;
        if (videoData != null) {
            Long startPosition = params.getStartPosition();
            int sourceIndex = params.getSourceIndex();
            boolean autoPlay = params.getAutoPlay();
            String adContentId = params.getAdContentId();
            AbrPreferences abrPreferences = params.getAbrPreferences();
            StartQualityConstraint startQualityConstraint = params.getStartQualityConstraint();
            playbackOptions = new PlaybackOptions.DirectSourcePlaybackOptions(videoData, contentId, startPosition, Integer.valueOf(sourceIndex), autoPlay, adContentId, params.getExpandedManifestUrl(), abrPreferences, startQualityConstraint != null ? Integer.valueOf(startQualityConstraint.getMaxHeight()) : null);
        } else if (contentId != null) {
            Long startPosition2 = params.getStartPosition();
            int sourceIndex2 = params.getSourceIndex();
            boolean autoPlay2 = params.getAutoPlay();
            String adContentId2 = params.getAdContentId();
            AbrPreferences abrPreferences2 = params.getAbrPreferences();
            StartQualityConstraint startQualityConstraint2 = params.getStartQualityConstraint();
            playbackOptions = new PlaybackOptions.ContentIdPlaybackOptions(contentId, startPosition2, Integer.valueOf(sourceIndex2), autoPlay2, adContentId2, null, params.getExpandedManifestUrl(), abrPreferences2, startQualityConstraint2 != null ? Integer.valueOf(startQualityConstraint2.getMaxHeight()) : null, 32, null);
        } else {
            h5z0.a.d("Either contentId or videoData must be not null in " + params, new Object[0]);
        }
        this.playbackOptions = playbackOptions;
        onPlaybackInitialization(params.getIsFirstEverStart(), params.getAutoPlay());
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPreparingWithAdConfig(AdConfig adConfig) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onPreparingWithAdConfig", null, new Object[0], 4, null);
        }
        this.eventTracker.onPreparingWithAdConfig(adConfig);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onReadyForFirstPlayback(FirstPlaybackInfo firstPlaybackInfo) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onReadyForFirstPlayback", "isWatchEverStarted=" + this.isWatchEverStarted + " firstPlaybackInfo=" + firstPlaybackInfo, new Object[0]);
        }
        if (this.isWatchEverStarted) {
            return;
        }
        this.eventTracker.onCanPlay(firstPlaybackInfo);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onRepeat() {
        this.stateProvider.onRepeat();
        this.eventTracker.onRepeat(this.stateProvider.getPlayerState());
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onRepeatModeChanged(RepeatMode repeatMode) {
        this.stateProvider.onRepeatModeChanged(repeatMode);
        submitPlayerAlive();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onResumePlayback() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            StringBuilder sb = new StringBuilder("isWatchEverStarted=");
            sb.append(this.isWatchEverStarted);
            sb.append(" player?.isPlayingAd()=");
            YandexPlayer<?> yandexPlayer = this.player;
            sb.append(yandexPlayer != null ? Boolean.valueOf(yandexPlayer.isPlayingAd()) : null);
            timberPlayerLogger.debug(TAG, "onResumePlayback", sb.toString(), new Object[0]);
        }
        maybeSendStart();
        YandexPlayer<?> yandexPlayer2 = this.player;
        if (yandexPlayer2 == null || !yandexPlayer2.isPlayingAd()) {
            scheduleWatchEvents();
            this.stateProvider.onResumePlayback();
            this.isWatchEverStarted = true;
        }
        submitPlayerAlive();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onSeek(long newPositionMs, long oldPositionMs) {
        stopStalled();
        this.eventTracker.onSeek(newPositionMs, oldPositionMs);
        if (this.isLoading && this.willPlayWhenReady) {
            StalledReason stalledReason = StalledReason.SEEK;
            this.lastStalledReason = stalledReason;
            startStalled(stalledReason);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSkipsUpdated(List<PlayerSkip> skips) {
        this.decoderUsageObserver.onSkipsUpdated(skips);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo) {
        if (startFromCacheInfo.getAudioCachePositionMs() == null || startFromCacheInfo.getVideoCachePositionMs() == null) {
            return;
        }
        this.eventTracker.onStartFromCacheInfoReady(startFromCacheInfo);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onStopCommand() {
        this.stateProvider.disconnectFromPlayer();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onStopPlayback(boolean keepDecoders) {
        this.eventTracker.onStop(keepDecoders);
        stopStalled();
        stopLog();
        this.decoderUsageObserver.onForegroundModeSet(keepDecoders);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSurfaceSizeChanged(Size surfaceSize) {
        this.decoderUsageObserver.onSurfaceSizeChanged(surfaceSize);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSurfaceSizeChangedInternal(Size surfaceSize) {
        this.decoderUsageObserver.onSurfaceSizeChangedInternal(surfaceSize);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onTimelineLeftEdgeChanged(long timelineLeftEdgeMs) {
        this.trackChangesObserverImpl.onTimelineLeftEdgeChanged(timelineLeftEdgeMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
        if (!this.isWatchEverStarted && !this.isTrackSelectionInitializationEverSent) {
            TrackVariant selectedTrackVariant = videoTrack.getSelectedTrackVariant();
            TrackVariant.Adaptive adaptive = selectedTrackVariant instanceof TrackVariant.Adaptive ? (TrackVariant.Adaptive) selectedTrackVariant : null;
            TrackSelectionInitializationError trackSelectionInitializationError = adaptive != null ? adaptive.getTrackSelectionInitializationError() : null;
            if (trackSelectionInitializationError != null) {
                this.isTrackSelectionInitializationEverSent = true;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                TargetFormat targetFormat = trackSelectionInitializationError.getTargetFormat();
                if (targetFormat != null) {
                    linkedHashMap.put("targetFormat", targetFormat);
                }
                linkedHashMap.put("allFormats", trackSelectionInitializationError.getAllFormats());
                linkedHashMap.put("selectedFormats", trackSelectionInitializationError.getSelectedFormats());
                EventTracker.onError$default(this.eventTracker, this.stateProvider.getPlayerState(), new PlaybackException.TrackSelectionInitialization(trackSelectionInitializationError.getMessage(), linkedHashMap), false, null, 8, null);
            }
        }
        this.trackChangesObserverImpl.onTracksChanged(audioTrack, subtitlesTrack, videoTrack);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onUserManuallySelectedQuality(Integer quality) {
        this.decoderUsageObserver.onUserManuallySelectedQuality(quality);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
        this.decoderUsageObserver.onVideoAndStreamTypeChanged(videoType, streamType);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoChunkLoaded(int bitrate) {
        this.decoderUsageObserver.onVideoChunkLoaded(bitrate);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onVideoDataPrepared(VideoData videoData) {
        this.trackChangesObserverImpl.onVideoDataPrepared(videoData);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
        this.stateProvider.setDecoderCounter(decoderCounter);
        this.decoderUsageObserver.onVideoDecoderEnabled(decoderCounter);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        this.decoderUsageObserver.onVideoDecoderInitialized(decoderName, initializedTimestampMs, initializationDurationMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoDecoderReleased(String decoderName) {
        EventTracker eventTracker = this.eventTracker;
        TrackType trackType = TrackType.Video;
        if (decoderName == null) {
            decoderName = "unknown";
        }
        eventTracker.onDecoderReleased(trackType, new SimpleDecoderEventData(decoderName));
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoFramesDropped(int count) {
        this.decoderUsageObserver.onVideoFramesDropped(count);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        this.decoderUsageObserver.onVideoInputFormatChanged(format, codecReuseLog);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onVideoSizeChanged(int width, int height) {
        this.trackChangesObserverImpl.onVideoSizeChanged(width, height);
    }

    @Override // ru.yandex.video.m3.player.tracking.ViewPortChangeListener
    public void onViewPortChanged(ViewPortState viewPortState) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onViewPortChanged", "viewPortChanged: " + viewPortState, new Object[0]);
        }
        submitPlayerAlive();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
        setPlayWhenReady(willPlayWhenReady);
    }

    public final State release(boolean isPlayerDestroying) {
        this.stateProvider.disconnectFromPlayer();
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "release", "isPlayerDestroying=" + isPlayerDestroying + " thread=" + Thread.currentThread(), new Object[0]);
        }
        this.isReleased = true;
        State state = getState();
        if (isPlayerDestroying) {
            state = null;
        }
        stopStalled();
        stopScheduleWatchEvents();
        releaseLog();
        if (isPlayerDestroying) {
            DebugReport debugReportIfNecessary = ReportBuilderExtKt.getDebugReportIfNecessary(this.reportBuilder, DebugReportReason.ON_PLAYER_RELEASE);
            if (debugReportIfNecessary != null) {
                this.eventTracker.onDebugReport(debugReportIfNecessary);
            }
            this.eventTracker.onDestroyPlayer(this.stateProvider.getPlayerState());
        }
        this.viewPortProvider.removeListener(this);
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null) {
            yandexPlayer.removeObserver(this);
        }
        YandexPlayer<?> yandexPlayer2 = this.player;
        if (yandexPlayer2 != null) {
            yandexPlayer2.removeAnalyticsObserver(this);
        }
        return state;
    }

    public final void scheduleWatchEvents() {
        int i = 0;
        if (!this.watchedTimeFutures.isEmpty()) {
            TimberPlayerLogger timberPlayerLogger = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
                timberPlayerLogger.debug(TAG, SCHEDULE_WATCH_EVENTS, "WatchEvents already scheduled", new Object[0]);
                return;
            }
            return;
        }
        if (this.isReleased) {
            TimberPlayerLogger timberPlayerLogger2 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, SCHEDULE_WATCH_EVENTS, "TrackingObserver already released", new Object[0]);
                return;
            }
            return;
        }
        PlayerState playerState = this.stateProvider.getPlayerState();
        TimberPlayerLogger timberPlayerLogger3 = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger3)) {
            timberPlayerLogger3.debug(TAG, SCHEDULE_WATCH_EVENTS, "watched=" + playerState.getWatchedTime(), new Object[0]);
        }
        long watchedTime = playerState.getWatchedTime();
        Pair[] pairArr = {new Pair(Long.valueOf(4000 - watchedTime), new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.TrackingObserver$scheduleWatchEvents$4$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m793invoke() {
                StateProvider stateProvider;
                TimberPlayerLogger timberPlayerLogger4;
                EventTracker eventTracker;
                stateProvider = TrackingObserver.this.stateProvider;
                PlayerState playerState2 = stateProvider.getPlayerState();
                timberPlayerLogger4 = TrackingObserver.this.logger;
                if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger4)) {
                    timberPlayerLogger4.debug("TrackingObserver", "scheduleWatchEvents", "on4secWatched watched=" + playerState2.getWatchedTime(), new Object[0]);
                }
                eventTracker = TrackingObserver.this.eventTracker;
                eventTracker.on4SecWatched(playerState2);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m793invoke();
                return zy11.a;
            }
        }), new Pair(Long.valueOf(10000 - watchedTime), new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.TrackingObserver$scheduleWatchEvents$4$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m794invoke() {
                StateProvider stateProvider;
                TimberPlayerLogger timberPlayerLogger4;
                EventTracker eventTracker;
                stateProvider = TrackingObserver.this.stateProvider;
                PlayerState playerState2 = stateProvider.getPlayerState();
                timberPlayerLogger4 = TrackingObserver.this.logger;
                if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger4)) {
                    timberPlayerLogger4.debug("TrackingObserver", "scheduleWatchEvents", "on10SecWatched watched=" + playerState2.getWatchedTime(), new Object[0]);
                }
                eventTracker = TrackingObserver.this.eventTracker;
                eventTracker.on10SecWatched(playerState2);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m794invoke();
                return zy11.a;
            }
        }), new Pair(Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT - watchedTime), new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.TrackingObserver$scheduleWatchEvents$4$3
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m795invoke() {
                StateProvider stateProvider;
                TimberPlayerLogger timberPlayerLogger4;
                EventTracker eventTracker;
                stateProvider = TrackingObserver.this.stateProvider;
                PlayerState playerState2 = stateProvider.getPlayerState();
                timberPlayerLogger4 = TrackingObserver.this.logger;
                if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger4)) {
                    timberPlayerLogger4.debug("TrackingObserver", "scheduleWatchEvents", "on20SecWatched watched=" + playerState2.getWatchedTime(), new Object[0]);
                }
                eventTracker = TrackingObserver.this.eventTracker;
                eventTracker.on20SecWatched(playerState2);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m795invoke();
                return zy11.a;
            }
        })};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            if (((Number) pair.c()).longValue() >= 0) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            TimberPlayerLogger timberPlayerLogger4 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger4)) {
                timberPlayerLogger4.debug(TAG, SCHEDULE_WATCH_EVENTS, "schedule event 4, 10 and 20 sec events on scheduler delay=" + ((Number) pair2.c()).longValue(), new Object[0]);
            }
            arrayList2.add(ExecutorsUtilKt.scheduleSafely(this.scheduledExecutorService, new u601(i, (sls) pair2.f()), ((Number) pair2.c()).longValue(), TimeUnit.MILLISECONDS));
        }
        ScheduledFuture<?> scheduleAtFixedRateSafely = ExecutorsUtilKt.scheduleAtFixedRateSafely(this.scheduledExecutorService, new kux0(19, this), 30000 - (watchedTime % 30000), 30000L, TimeUnit.MILLISECONDS);
        TimberPlayerLogger timberPlayerLogger5 = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger5)) {
            timberPlayerLogger5.debug(TAG, SCHEDULE_WATCH_EVENTS, "schedule event 30 sec event on scheduler", new Object[0]);
        }
        this.watchedTimeFutures = a.o0(arrayList2, scheduleAtFixedRateSafely);
    }

    public final void start(YandexPlayer<?> player) {
        player.addObserver(this);
        player.addAnalyticsObserver(this);
        this.player = player;
        this.viewPortProvider.addListener(this);
    }

    public final void startStalled(StalledReason stalledReason) {
        Object obj;
        int i = 0;
        if (!this.stalledStateFutures.isEmpty()) {
            TimberPlayerLogger timberPlayerLogger = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
                timberPlayerLogger.debug(TAG, START_STALLED, "stalled already started", new Object[0]);
                return;
            }
            return;
        }
        boolean z = this.isReleased;
        TimberPlayerLogger timberPlayerLogger2 = this.logger;
        if (z) {
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, START_STALLED, "TrackingObserver already released", new Object[0]);
                return;
            }
            return;
        }
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
            timberPlayerLogger2.debug(TAG, START_STALLED, "stalledReason = " + stalledReason + " thread=" + Thread.currentThread(), new Object[0]);
        }
        List<StalledState> beginStalledPeriods = this.stalledStateProvider.beginStalledPeriods(EventDefaultKt.toLoggingStalledReason(stalledReason));
        Iterator<T> it = beginStalledPeriods.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((StalledState) obj).getInternalStalledDuration() == 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StalledState stalledState = (StalledState) obj;
        if (stalledState != null) {
            this.eventTracker.onStalled(this.stateProvider.getPlayerState(), stalledState);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : beginStalledPeriods) {
            if (((StalledState) obj2).getInternalStalledDuration() > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StalledState stalledState2 = (StalledState) it2.next();
            arrayList2.add(ExecutorsUtilKt.scheduleSafely(this.scheduledExecutorService, new t601(i, this, stalledState2), stalledState2.getInternalStalledDuration(), TimeUnit.MILLISECONDS));
        }
        this.stalledStateFutures = arrayList2;
        stopScheduleWatchEvents();
        this.stateProvider.onBufferingStart(stalledReason);
        submitPlayerAlive();
    }

    public final void stopScheduleWatchEvents() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, STOP_SCHEDULE_WATCH_EVENTS, "STOP scheduleWatchEvents", new Object[0]);
        }
        int i = 0;
        for (Object obj : this.watchedTimeFutures) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Future future = (Future) obj;
            TimberPlayerLogger timberPlayerLogger2 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, STOP_SCHEDULE_WATCH_EVENTS, oyr.i(i, "STOP "), new Object[0]);
            }
            if (future != null) {
                future.cancel(false);
            }
            i = i2;
        }
        this.watchedTimeFutures = EmptyList.a;
    }

    public final void stopStalled() {
        boolean isEmpty = this.stalledStateFutures.isEmpty();
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (isEmpty) {
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
                timberPlayerLogger.debug(TAG, STOP_STALLED, "stalled already stopped", new Object[0]);
                return;
            }
            return;
        }
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, STOP_STALLED, null, new Object[0], 4, null);
        }
        Iterator<T> it = this.stalledStateFutures.iterator();
        while (it.hasNext()) {
            Future future = (Future) it.next();
            if (future != null) {
                future.cancel(false);
            }
        }
        this.stalledStateFutures = EmptyList.a;
        StalledState endStalledPeriod = this.stalledStateProvider.endStalledPeriod();
        if (endStalledPeriod != null) {
            this.eventTracker.onStalledEnd(this.stateProvider.getPlayerState(), endStalledPeriod);
            this.stateProvider.onBufferingEnd(this.willPlayWhenReady);
        }
        submitPlayerAlive();
    }

    public final void submitPlayerAlive() {
        saveCurrentState();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onStopPlayback() {
        this.trackChangesObserverImpl.onStopPlayback();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onNonFatalPlaybackException(PlaybackException nonFatalPlaybackException, String ignoreReason) {
        this.eventTracker.onError(this.stateProvider.getPlayerState(), nonFatalPlaybackException, false, new IgnoredErrorData(ignoreReason, false, 2, null));
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingStart() {
        this.trackChangesObserverImpl.onLoadingStart();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadingStart(ExtendedStalledReason extendedStalledReason) {
        this.stalledStateProvider.setExtendedStalledReason(extendedStalledReason);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadCanceled(LoadCanceled loadCanceled) {
        this.eventTracker.onLoadCanceled(loadCanceled);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onReadyForFirstPlayback() {
        this.trackChangesObserverImpl.onReadyForFirstPlayback();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TrackingObserver(State state, EventTracker eventTracker, StateProvider stateProvider, StalledStateProvider stalledStateProvider, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, DecoderUsageObserver decoderUsageObserver, PlayerAliveStateLog.LogConfigs logConfigs, TrackChangesObserver trackChangesObserver, AtomicBoolean atomicBoolean, ViewPortProvider viewPortProvider, ReportBuilder reportBuilder, boolean z, AbConfig abConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(state, r4, stateProvider, stalledStateProvider, scheduledExecutorService, scheduledExecutorService2, decoderUsageObserver, r10, r11, atomicBoolean, viewPortProvider, reportBuilder, z, abConfig);
        EventTracker eventTracker2;
        TrackChangesObserver trackChangesObserver2;
        PlayerAliveStateLog.LogConfigs logConfigs2 = (i & 128) != 0 ? null : logConfigs;
        if ((i & 256) != 0) {
            eventTracker2 = eventTracker;
            trackChangesObserver2 = new TrackChangesObserverImpl(eventTracker2);
        } else {
            eventTracker2 = eventTracker;
            trackChangesObserver2 = trackChangesObserver;
        }
    }
}
