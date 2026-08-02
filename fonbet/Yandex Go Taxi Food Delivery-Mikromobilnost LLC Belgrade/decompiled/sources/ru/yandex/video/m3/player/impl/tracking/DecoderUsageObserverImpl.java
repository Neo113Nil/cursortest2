package ru.yandex.video.m3.player.impl.tracking;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt;
import ru.yandex.video.m3.player.impl.tracking.data.MergeDecoderCounter;
import ru.yandex.video.m3.player.impl.tracking.data.RendererEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0003ABCB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010$J)\u0010(\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u0001012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006D"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl;", "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "eventTracker", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/EventTracker;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdates;", "getUpdates", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdates;", "", "isExpected", "Lzy11;", "logDecoderEvent", "(Lru/yandex/video/m3/player/tracks/TrackType;Z)V", "", "decoderName", "isHardwareAccelerated", "updateDecoderNameAndAccelerationType", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "trackFormat", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "updateTrackFormat", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "Lru/yandex/video/m3/player/DecoderCounter;", "newDecoderCounter", "updateDecoderCounter", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/DecoderCounter;)V", "decoderCounter", "onVideoDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "onAudioDecoderEnabled", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "format", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "foreground", "onForegroundModeSet", "(Z)V", "Lru/yandex/video/m3/player/impl/tracking/data/RendererEventData;", "getRendererEventData", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/player/impl/tracking/data/RendererEventData;", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "", "decoderUpdates", "Ljava/util/Map;", "playerInForeground", "Z", "Lru/yandex/video/m3/data/Decoder;", "getVideoDecoder", "()Lru/yandex/video/m3/data/Decoder;", "videoDecoder", "getAudioDecoder", "audioDecoder", "Companion", "DecoderUpdateType", "DecoderUpdates", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderUsageObserverImpl implements DecoderUsageObserver, DecoderProvider {
    private static final String TAG = "DecoderUsageObserverImpl";
    private final Map<TrackType, DecoderUpdates> decoderUpdates;
    private final EventTracker eventTracker;
    private boolean playerInForeground;
    private final PlayerLogger playerLogger;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdateType;", "", "(Ljava/lang/String;I)V", "INITIALIZED", "REUSED", "DISCARDED", "UNKNOWN", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DecoderUpdateType {
        INITIALIZED,
        REUSED,
        DISCARDED,
        UNKNOWN
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[DecoderUpdateType.values().length];
            try {
                iArr2[DecoderUpdateType.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DecoderUpdateType.REUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DecoderUpdateType.DISCARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DecoderUsageObserverImpl(EventTracker eventTracker, PlayerLogger playerLogger) {
        this.eventTracker = eventTracker;
        this.playerLogger = playerLogger;
        TrackType trackType = TrackType.Audio;
        int i = 1022;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        String str2 = null;
        TrackFormat trackFormat = null;
        TrackFormat trackFormat2 = null;
        DecoderCounter decoderCounter = null;
        int i2 = 0;
        int i3 = 0;
        MediaCodecReuseLog mediaCodecReuseLog = null;
        Boolean bool = null;
        Pair pair = new Pair(trackType, new DecoderUpdates(trackType, str, str2, trackFormat, trackFormat2, decoderCounter, i2, i3, mediaCodecReuseLog, bool, playerLogger, i, defaultConstructorMarker));
        TrackType trackType2 = TrackType.Video;
        this.decoderUpdates = b.l(pair, new Pair(trackType2, new DecoderUpdates(trackType2, str, str2, trackFormat, trackFormat2, decoderCounter, i2, i3, mediaCodecReuseLog, bool, playerLogger, i, defaultConstructorMarker)));
    }

    private final DecoderUpdates getUpdates(TrackType trackType) {
        DecoderUpdates decoderUpdates = this.decoderUpdates.get(trackType);
        if (decoderUpdates != null) {
            return decoderUpdates;
        }
        return new DecoderUpdates(trackType, null, null, null, null, null, 0, 0, null, null, this.playerLogger, 1022, null);
    }

    private final void logDecoderEvent(TrackType trackType, boolean isExpected) {
        DecoderUpdates updates = getUpdates(trackType);
        DecoderEventData eventData$default = DecoderUpdates.getEventData$default(updates, isExpected, this.playerInForeground, false, 4, null);
        if (eventData$default != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[updates.getCurrentUpdateType().ordinal()];
            if (i == 1) {
                this.playerLogger.info(TAG, "logDecoderEvent", "log decoder initialization " + trackType + HexString.CHAR_SPACE + eventData$default, new Object[0]);
                this.eventTracker.onDecoderInitialized(trackType, eventData$default);
            } else if (i == 2) {
                this.playerLogger.info(TAG, "logDecoderEvent", "log decoder reuse " + trackType + HexString.CHAR_SPACE + eventData$default, new Object[0]);
                this.eventTracker.onDecoderReused(trackType, eventData$default);
            } else if (i == 3) {
                this.playerLogger.info(TAG, "logDecoderEvent", "log decoder discard " + trackType + HexString.CHAR_SPACE + eventData$default, new Object[0]);
                this.eventTracker.onDecoderDiscarded(trackType, eventData$default);
            }
        }
        if (isExpected) {
            this.decoderUpdates.put(trackType, updates.applyPendingChanges());
        }
    }

    private final void updateDecoderCounter(TrackType trackType, DecoderCounter newDecoderCounter) {
        DecoderUpdates decoderUpdates = this.decoderUpdates.get(trackType);
        DecoderUpdates copy$default = DecoderUpdates.copy$default(getUpdates(trackType), null, null, null, null, null, new MergeDecoderCounter(decoderUpdates != null ? decoderUpdates.getDecoderCounter() : null, newDecoderCounter), 0, 0, null, null, null, 2015, null);
        this.decoderUpdates.put(trackType, copy$default);
        if (copy$default.checkIfReadyForLogging()) {
            logDecoderEvent(trackType, true);
        }
    }

    private final void updateDecoderNameAndAccelerationType(TrackType trackType, String decoderName, Boolean isHardwareAccelerated) {
        if (getUpdates(trackType).getNewDecoder() != null) {
            logDecoderEvent(trackType, false);
        }
        DecoderUpdates copy$default = DecoderUpdates.copy$default(getUpdates(trackType), null, decoderName, null, null, null, null, 0, 0, null, isHardwareAccelerated, null, 1533, null);
        this.decoderUpdates.put(trackType, copy$default);
        if (copy$default.checkIfReadyForLogging()) {
            logDecoderEvent(trackType, true);
        }
    }

    private final void updateTrackFormat(TrackType trackType, TrackFormat trackFormat, MediaCodecReuseLog codecReuseLog) {
        if (getUpdates(trackType).getNewTrack() != null) {
            logDecoderEvent(trackType, false);
        }
        DecoderUpdates copy$default = DecoderUpdates.copy$default(getUpdates(trackType), null, null, null, trackFormat, null, null, 0, 0, codecReuseLog, null, null, 1783, null);
        this.decoderUpdates.put(trackType, copy$default);
        if (copy$default.checkIfReadyForLogging()) {
            logDecoderEvent(trackType, true);
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderProvider
    public Decoder getAudioDecoder() {
        return getUpdates(TrackType.Audio).getDecoderData();
    }

    public final RendererEventData getRendererEventData(TrackType trackType) {
        DecoderUpdates decoderUpdates;
        int i = trackType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        if ((i == 1 || i == 2) && (decoderUpdates = this.decoderUpdates.get(trackType)) != null) {
            return decoderUpdates.getRendererData();
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderProvider
    public Decoder getVideoDecoder() {
        return getUpdates(TrackType.Video).getDecoderData();
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
        updateDecoderCounter(TrackType.Audio, decoderCounter);
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        updateTrackFormat(TrackType.Audio, format, codecReuseLog);
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
        List<CodecInfo> codecsInfo;
        Object obj;
        Boolean bool = null;
        if (mediaCodecSelectorLog != null && (codecsInfo = mediaCodecSelectorLog.getCodecsInfo()) != null) {
            Iterator<T> it = codecsInfo.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((CodecInfo) obj).getName(), decoderName)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            CodecInfo codecInfo = (CodecInfo) obj;
            if (codecInfo != null) {
                bool = Boolean.valueOf(codecInfo.getHardwareAccelerated());
            }
        }
        updateDecoderNameAndAccelerationType(trackType, decoderName, bool);
        if (mediaCodecSelectorLog == null || decoderName.equals(((CodecInfo) a.P(mediaCodecSelectorLog.getCodecsInfo())).getName()) || trackType != TrackType.Video) {
            return;
        }
        EventTracker eventTracker = this.eventTracker;
        List<CodecInfo> codecsInfo2 = mediaCodecSelectorLog.getCodecsInfo();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : codecsInfo2) {
            if (jl40.l(((CodecInfo) obj2).getName(), decoderName)) {
                break;
            } else {
                arrayList.add(obj2);
            }
        }
        for (CodecInfo codecInfo2 : mediaCodecSelectorLog.getCodecsInfo()) {
            if (jl40.l(codecInfo2.getName(), decoderName)) {
                eventTracker.onVideoDecoderFallback(new DecoderFallbackData(arrayList, codecInfo2));
                return;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver
    public void onForegroundModeSet(boolean foreground) {
        this.playerInForeground = foreground;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
        updateDecoderCounter(TrackType.Video, decoderCounter);
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserver, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        updateTrackFormat(TrackType.Video, format, codecReuseLog);
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0012J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010&J\t\u0010;\u001a\u00020\u0014HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u008a\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010H\u001a\u0004\u0018\u00010IJ\"\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u00122\b\b\u0002\u0010N\u001a\u00020\u0012J\b\u0010O\u001a\u0004\u0018\u00010PJ\t\u0010Q\u001a\u00020\rHÖ\u0001J\t\u0010R\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0011\u0010%\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u0011\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006S"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdates;", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/tracks/TrackType;", "newDecoder", "", "lastDecoder", "newTrack", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "lastTrack", "decoderCounter", "Lru/yandex/video/m3/player/DecoderCounter;", "lastInitCount", "", "lastReuseCount", "reuseLog", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "isHardwareAccelerated", "", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/DecoderCounter;IILru/yandex/video/m3/data/MediaCodecReuseLog;Ljava/lang/Boolean;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "currentDecoder", "getCurrentDecoder", "()Ljava/lang/String;", "currentTrack", "getCurrentTrack", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "currentUpdateType", "Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdateType;", "getCurrentUpdateType", "()Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdateType;", "getDecoderCounter", "()Lru/yandex/video/m3/player/DecoderCounter;", "isDecoderDiscarded", "()Z", "isDecoderInitialized", "isDecoderReused", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastDecoder", "getLastInitCount", "()I", "getLastReuseCount", "getLastTrack", "getNewDecoder", "getNewTrack", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "reuseCount", "getReuseCount", "getReuseLog", "()Lru/yandex/video/m3/data/MediaCodecReuseLog;", "getTrackType", "()Lru/yandex/video/m3/player/tracks/TrackType;", "applyPendingChanges", "checkIfReadyForLogging", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/DecoderCounter;IILru/yandex/video/m3/data/MediaCodecReuseLog;Ljava/lang/Boolean;Lru/yandex/video/m3/player/utils/PlayerLogger;)Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserverImpl$DecoderUpdates;", "equals", "other", "getDecoderData", "Lru/yandex/video/m3/data/Decoder;", "getEventData", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "isExpected", "inForeground", "warnOnEmptyData", "getRendererData", "Lru/yandex/video/m3/player/impl/tracking/data/RendererEventData;", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DecoderUpdates {
        private final String currentDecoder;
        private final TrackFormat currentTrack;
        private final DecoderCounter decoderCounter;
        private final Boolean isHardwareAccelerated;
        private final String lastDecoder;
        private final int lastInitCount;
        private final int lastReuseCount;
        private final TrackFormat lastTrack;
        private final String newDecoder;
        private final TrackFormat newTrack;
        private final PlayerLogger playerLogger;
        private final int reuseCount;
        private final MediaCodecReuseLog reuseLog;
        private final TrackType trackType;

        public /* synthetic */ DecoderUpdates(TrackType trackType, String str, String str2, TrackFormat trackFormat, TrackFormat trackFormat2, DecoderCounter decoderCounter, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, PlayerLogger playerLogger, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(trackType, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : trackFormat, (i3 & 16) != 0 ? null : trackFormat2, (i3 & 32) != 0 ? null : decoderCounter, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : mediaCodecReuseLog, (i3 & 512) != 0 ? null : bool, playerLogger);
        }

        public static /* synthetic */ DecoderUpdates copy$default(DecoderUpdates decoderUpdates, TrackType trackType, String str, String str2, TrackFormat trackFormat, TrackFormat trackFormat2, DecoderCounter decoderCounter, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, PlayerLogger playerLogger, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                trackType = decoderUpdates.trackType;
            }
            if ((i3 & 2) != 0) {
                str = decoderUpdates.newDecoder;
            }
            if ((i3 & 4) != 0) {
                str2 = decoderUpdates.lastDecoder;
            }
            if ((i3 & 8) != 0) {
                trackFormat = decoderUpdates.newTrack;
            }
            if ((i3 & 16) != 0) {
                trackFormat2 = decoderUpdates.lastTrack;
            }
            if ((i3 & 32) != 0) {
                decoderCounter = decoderUpdates.decoderCounter;
            }
            if ((i3 & 64) != 0) {
                i = decoderUpdates.lastInitCount;
            }
            if ((i3 & 128) != 0) {
                i2 = decoderUpdates.lastReuseCount;
            }
            if ((i3 & 256) != 0) {
                mediaCodecReuseLog = decoderUpdates.reuseLog;
            }
            if ((i3 & 512) != 0) {
                bool = decoderUpdates.isHardwareAccelerated;
            }
            if ((i3 & 1024) != 0) {
                playerLogger = decoderUpdates.playerLogger;
            }
            Boolean bool2 = bool;
            PlayerLogger playerLogger2 = playerLogger;
            int i4 = i2;
            MediaCodecReuseLog mediaCodecReuseLog2 = mediaCodecReuseLog;
            DecoderCounter decoderCounter2 = decoderCounter;
            int i5 = i;
            TrackFormat trackFormat3 = trackFormat2;
            String str3 = str2;
            return decoderUpdates.copy(trackType, str, str3, trackFormat, trackFormat3, decoderCounter2, i5, i4, mediaCodecReuseLog2, bool2, playerLogger2);
        }

        public static /* synthetic */ DecoderEventData getEventData$default(DecoderUpdates decoderUpdates, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 4) != 0) {
                z3 = true;
            }
            return decoderUpdates.getEventData(z, z2, z3);
        }

        public final DecoderUpdates applyPendingChanges() {
            String str = this.currentDecoder;
            TrackFormat trackFormat = this.currentTrack;
            DecoderCounter decoderCounter = this.decoderCounter;
            return copy$default(this, null, null, str, null, trackFormat, null, decoderCounter != null ? decoderCounter.getInitCount() : 0, this.reuseCount, null, this.isHardwareAccelerated, null, 1057, null);
        }

        public final boolean checkIfReadyForLogging() {
            return this.newDecoder != null ? isDecoderInitialized() && this.newTrack != null : (this.newTrack == null || this.lastDecoder == null || (!isDecoderReused() && !isDecoderDiscarded())) ? false : true;
        }

        /* renamed from: component1, reason: from getter */
        public final TrackType getTrackType() {
            return this.trackType;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getIsHardwareAccelerated() {
            return this.isHardwareAccelerated;
        }

        /* renamed from: component11, reason: from getter */
        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNewDecoder() {
            return this.newDecoder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLastDecoder() {
            return this.lastDecoder;
        }

        /* renamed from: component4, reason: from getter */
        public final TrackFormat getNewTrack() {
            return this.newTrack;
        }

        /* renamed from: component5, reason: from getter */
        public final TrackFormat getLastTrack() {
            return this.lastTrack;
        }

        /* renamed from: component6, reason: from getter */
        public final DecoderCounter getDecoderCounter() {
            return this.decoderCounter;
        }

        /* renamed from: component7, reason: from getter */
        public final int getLastInitCount() {
            return this.lastInitCount;
        }

        /* renamed from: component8, reason: from getter */
        public final int getLastReuseCount() {
            return this.lastReuseCount;
        }

        /* renamed from: component9, reason: from getter */
        public final MediaCodecReuseLog getReuseLog() {
            return this.reuseLog;
        }

        public final DecoderUpdates copy(TrackType trackType, String newDecoder, String lastDecoder, TrackFormat newTrack, TrackFormat lastTrack, DecoderCounter decoderCounter, int lastInitCount, int lastReuseCount, MediaCodecReuseLog reuseLog, Boolean isHardwareAccelerated, PlayerLogger playerLogger) {
            return new DecoderUpdates(trackType, newDecoder, lastDecoder, newTrack, lastTrack, decoderCounter, lastInitCount, lastReuseCount, reuseLog, isHardwareAccelerated, playerLogger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DecoderUpdates)) {
                return false;
            }
            DecoderUpdates decoderUpdates = (DecoderUpdates) other;
            return this.trackType == decoderUpdates.trackType && jl40.l(this.newDecoder, decoderUpdates.newDecoder) && jl40.l(this.lastDecoder, decoderUpdates.lastDecoder) && jl40.l(this.newTrack, decoderUpdates.newTrack) && jl40.l(this.lastTrack, decoderUpdates.lastTrack) && jl40.l(this.decoderCounter, decoderUpdates.decoderCounter) && this.lastInitCount == decoderUpdates.lastInitCount && this.lastReuseCount == decoderUpdates.lastReuseCount && jl40.l(this.reuseLog, decoderUpdates.reuseLog) && jl40.l(this.isHardwareAccelerated, decoderUpdates.isHardwareAccelerated) && jl40.l(this.playerLogger, decoderUpdates.playerLogger);
        }

        public final String getCurrentDecoder() {
            return this.currentDecoder;
        }

        public final TrackFormat getCurrentTrack() {
            return this.currentTrack;
        }

        public final DecoderUpdateType getCurrentUpdateType() {
            DecoderCounter decoderCounter = this.decoderCounter;
            if (decoderCounter == null || decoderCounter.getInitCount() == 0) {
                return DecoderUpdateType.UNKNOWN;
            }
            if (this.decoderCounter.getInitCount() > this.lastInitCount) {
                return DecoderUpdateType.INITIALIZED;
            }
            MediaCodecReuseLog mediaCodecReuseLog = this.reuseLog;
            return (mediaCodecReuseLog != null ? mediaCodecReuseLog.getReuseMethod() : null) == MediaCodecReuseLog.DecoderReuseMethod.DISCARD ? DecoderUpdateType.DISCARDED : DecoderUpdateType.REUSED;
        }

        public final DecoderCounter getDecoderCounter() {
            return this.decoderCounter;
        }

        public final Decoder getDecoderData() {
            DecoderEventData eventData = getEventData(true, false, false);
            if (eventData != null) {
                return new Decoder(eventData.getName(), Integer.valueOf(eventData.getInits()), Integer.valueOf(eventData.getReuses()), Integer.valueOf(eventData.getReleases()), eventData.getIsHardwareAccelerated());
            }
            return null;
        }

        public final DecoderEventData getEventData(final boolean isExpected, final boolean inForeground, boolean warnOnEmptyData) {
            String str;
            DecoderCounter decoderCounter;
            TrackFormat trackFormat = this.currentTrack;
            if (trackFormat != null && (str = this.currentDecoder) != null && (decoderCounter = this.decoderCounter) != null) {
                return DecoderEventDataKt.DecoderEventData(str, this.trackType, decoderCounter, trackFormat, this.lastTrack, new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.DecoderUsageObserverImpl$DecoderUpdates$getEventData$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(DecoderEventData.Builder builder) {
                        builder.setExpected(Boolean.valueOf(isExpected));
                        builder.setForeground(Boolean.valueOf(inForeground));
                        builder.setReuseLog(this.getReuseLog());
                        builder.setReuses(Integer.valueOf(this.getReuseCount()));
                        builder.setHardwareAccelerated(this.isHardwareAccelerated());
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DecoderEventData.Builder) obj);
                        return zy11.a;
                    }
                });
            }
            if (!warnOnEmptyData) {
                return null;
            }
            PlayerLogger.error$default(this.playerLogger, DecoderUsageObserverImpl.TAG, "getEventData", "Invalid decoder data " + this, null, new Object[0], 8, null);
            return null;
        }

        public final String getLastDecoder() {
            return this.lastDecoder;
        }

        public final int getLastInitCount() {
            return this.lastInitCount;
        }

        public final int getLastReuseCount() {
            return this.lastReuseCount;
        }

        public final TrackFormat getLastTrack() {
            return this.lastTrack;
        }

        public final String getNewDecoder() {
            return this.newDecoder;
        }

        public final TrackFormat getNewTrack() {
            return this.newTrack;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final RendererEventData getRendererData() {
            String str;
            TrackFormat trackFormat = this.currentTrack;
            if (trackFormat != null && (str = this.currentDecoder) != null && this.decoderCounter != null) {
                String id = trackFormat.getId();
                if (id == null) {
                    id = "";
                }
                return new RendererEventData(str, id, new Integer[]{Integer.valueOf(trackFormat.getWidth()), Integer.valueOf(trackFormat.getHeight())});
            }
            PlayerLogger.error$default(this.playerLogger, DecoderUsageObserverImpl.TAG, "getRendererData", "Invalid renderer data " + this, null, new Object[0], 8, null);
            return null;
        }

        public final int getReuseCount() {
            return this.reuseCount;
        }

        public final MediaCodecReuseLog getReuseLog() {
            return this.reuseLog;
        }

        public final TrackType getTrackType() {
            return this.trackType;
        }

        public int hashCode() {
            int hashCode = this.trackType.hashCode() * 31;
            String str = this.newDecoder;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lastDecoder;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TrackFormat trackFormat = this.newTrack;
            int hashCode4 = (hashCode3 + (trackFormat == null ? 0 : trackFormat.hashCode())) * 31;
            TrackFormat trackFormat2 = this.lastTrack;
            int hashCode5 = (hashCode4 + (trackFormat2 == null ? 0 : trackFormat2.hashCode())) * 31;
            DecoderCounter decoderCounter = this.decoderCounter;
            int b = oyr.b(this.lastReuseCount, oyr.b(this.lastInitCount, (hashCode5 + (decoderCounter == null ? 0 : decoderCounter.hashCode())) * 31, 31), 31);
            MediaCodecReuseLog mediaCodecReuseLog = this.reuseLog;
            int hashCode6 = (b + (mediaCodecReuseLog == null ? 0 : mediaCodecReuseLog.hashCode())) * 31;
            Boolean bool = this.isHardwareAccelerated;
            return this.playerLogger.hashCode() + ((hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public final boolean isDecoderDiscarded() {
            return getCurrentUpdateType() == DecoderUpdateType.DISCARDED;
        }

        public final boolean isDecoderInitialized() {
            return getCurrentUpdateType() == DecoderUpdateType.INITIALIZED;
        }

        public final boolean isDecoderReused() {
            return getCurrentUpdateType() == DecoderUpdateType.REUSED;
        }

        public final Boolean isHardwareAccelerated() {
            return this.isHardwareAccelerated;
        }

        public String toString() {
            return "DecoderUpdates(trackType=" + this.trackType + ", newDecoder=" + this.newDecoder + ", lastDecoder=" + this.lastDecoder + ", newTrack=" + this.newTrack + ", lastTrack=" + this.lastTrack + ", decoderCounter=" + this.decoderCounter + ", lastInitCount=" + this.lastInitCount + ", lastReuseCount=" + this.lastReuseCount + ", reuseLog=" + this.reuseLog + ", isHardwareAccelerated=" + this.isHardwareAccelerated + ", playerLogger=" + this.playerLogger + ')';
        }

        public DecoderUpdates(TrackType trackType, String str, String str2, TrackFormat trackFormat, TrackFormat trackFormat2, DecoderCounter decoderCounter, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, PlayerLogger playerLogger) {
            this.trackType = trackType;
            this.newDecoder = str;
            this.lastDecoder = str2;
            this.newTrack = trackFormat;
            this.lastTrack = trackFormat2;
            this.decoderCounter = decoderCounter;
            this.lastInitCount = i;
            this.lastReuseCount = i2;
            this.reuseLog = mediaCodecReuseLog;
            this.isHardwareAccelerated = bool;
            this.playerLogger = playerLogger;
            this.currentTrack = trackFormat == null ? trackFormat2 : trackFormat;
            this.currentDecoder = str == null ? str2 : str;
            this.reuseCount = isDecoderReused() ? i2 + 1 : i2;
        }
    }
}
