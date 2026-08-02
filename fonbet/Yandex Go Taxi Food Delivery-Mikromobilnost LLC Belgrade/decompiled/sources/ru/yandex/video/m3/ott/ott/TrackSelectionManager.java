package ru.yandex.video.m3.ott.ott;

import android.os.Handler;
import defpackage.d5z0;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.hpo0;
import defpackage.jl40;
import defpackage.sls;
import defpackage.y7x0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.dto.WatchParams;
import ru.yandex.video.m3.ott.data.repository.WatchParamsRepository;
import ru.yandex.video.m3.ott.ott.TrackSelectionManager;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0002 !B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/yandex/video/m3/ott/ott/TrackSelectionManager;", "", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "watchParamsRepository", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/util/concurrent/ExecutorService;Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;)V", "", "delayMs", "Lzy11;", "useDelayedHandling", "(J)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "videoData", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/ott/data/dto/OttVideoData;)V", "stop", "()V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "Lru/yandex/video/m3/player/PlayerObserver;", "observer", "Lru/yandex/video/m3/player/PlayerObserver;", "Lru/yandex/video/m3/player/YandexPlayer;", "handlingDelayMs", "J", "Companion", "PlayerObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackSelectionManager {
    private static final long DEFAULT_HANDLING_DELAY_MS = 50;
    private static final String RUSSIAN_LANGUAGE_CODE = "ru";
    private static final String TAG = "TrackSelectionManager";
    private final ExecutorService executorService;
    private long handlingDelayMs;
    private volatile PlayerObserver<Object> observer;
    private volatile YandexPlayer<?> player;
    private final PlayerLogger playerLogger;
    private final WatchParamsRepository watchParamsRepository;
    public static final int $stable = 8;

    public TrackSelectionManager(PlayerLogger playerLogger, ExecutorService executorService, WatchParamsRepository watchParamsRepository) {
        this.playerLogger = playerLogger;
        this.executorService = executorService;
        this.watchParamsRepository = watchParamsRepository;
    }

    public static /* synthetic */ void useDelayedHandling$default(TrackSelectionManager trackSelectionManager, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 50;
        }
        trackSelectionManager.useDelayedHandling(j);
    }

    public final void start(YandexPlayer<?> player, OttVideoData videoData) {
        stop();
        this.player = player;
        this.observer = new PlayerObserverImpl(player, videoData, this.playerLogger, this.executorService, this.watchParamsRepository, this.handlingDelayMs);
        player.addObserver(this.observer);
    }

    public final void stop() {
        YandexPlayer<?> yandexPlayer;
        PlayerObserver<? super Object> playerObserver = this.observer;
        if (playerObserver != null && (yandexPlayer = this.player) != null) {
            yandexPlayer.removeObserver(playerObserver);
        }
        PlayerObserver<Object> playerObserver2 = this.observer;
        PlayerObserverImpl playerObserverImpl = playerObserver2 instanceof PlayerObserverImpl ? (PlayerObserverImpl) playerObserver2 : null;
        if (playerObserverImpl != null) {
            playerObserverImpl.release();
        }
    }

    public final void useDelayedHandling(long delayMs) {
        this.handlingDelayMs = delayMs;
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010!\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/yandex/video/m3/ott/ott/TrackSelectionManager$PlayerObserverImpl;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "videoData", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "watchParamsRepository", "", "handlingDelayMs", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/ott/data/dto/OttVideoData;Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/util/concurrent/ExecutorService;Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;J)V", "Lkotlin/Function0;", "Lzy11;", "body", "delayTask", "(Lsls;)V", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "handleTrackChanges", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "newAudioFormat", "newSubtitleFormat", "Lru/yandex/video/m3/data/dto/VideoData;", "userPreferences", "", "detectAutomaticTrackChoice", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/dto/VideoData;)Z", "saveAudioAndSubtitleTracks", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackFormat;)V", "tryEnableRusSubtitle", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)Z", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "release", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "J", "oldAudioFormat", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "oldSubtitleFormat", "Ljava/lang/Runnable;", "delayedTask", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerObserverImpl implements PlayerObserver<Object> {
        public static final int $stable = 8;
        private Runnable delayedTask;
        private final ExecutorService executorService;
        private Handler handler;
        private final long handlingDelayMs;
        private TrackFormat oldAudioFormat;
        private TrackFormat oldSubtitleFormat;
        private final YandexPlayer<?> player;
        private final PlayerLogger playerLogger;
        private final OttVideoData videoData;
        private final WatchParamsRepository watchParamsRepository;

        public /* synthetic */ PlayerObserverImpl(YandexPlayer yandexPlayer, OttVideoData ottVideoData, PlayerLogger playerLogger, ExecutorService executorService, WatchParamsRepository watchParamsRepository, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(yandexPlayer, ottVideoData, playerLogger, executorService, watchParamsRepository, (i & 32) != 0 ? 0L : j);
        }

        private final void delayTask(sls body) {
            Handler handler = this.handler;
            if (handler == null) {
                handler = new Handler();
            }
            this.handler = handler;
            if (this.delayedTask == null) {
                y7x0 y7x0Var = new y7x0(27, body, this);
                handler.postDelayed(y7x0Var, this.handlingDelayMs);
                this.delayedTask = y7x0Var;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void delayTask$lambda$1(sls slsVar, PlayerObserverImpl playerObserverImpl) {
            slsVar.invoke();
            playerObserverImpl.delayedTask = null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean detectAutomaticTrackChoice(TrackFormat newAudioFormat, TrackFormat newSubtitleFormat, VideoData userPreferences) {
            boolean z;
            boolean z2;
            boolean z3;
            String language;
            boolean z4;
            String language2;
            if (this.oldAudioFormat == null) {
                if (newAudioFormat != null && (language2 = newAudioFormat.getLanguage()) != null) {
                    Boolean valueOf = userPreferences.getAudioLanguage() != null ? Boolean.valueOf(!language2.equals(r0)) : null;
                    if (valueOf != null) {
                        z4 = valueOf.booleanValue();
                        if (z4) {
                            z = true;
                            if (this.oldSubtitleFormat == null) {
                                if (newSubtitleFormat != null && (language = newSubtitleFormat.getLanguage()) != null) {
                                    Boolean valueOf2 = userPreferences.getSubtitleLanguage() != null ? Boolean.valueOf(!language.equals(r6)) : null;
                                    if (valueOf2 != null) {
                                        z3 = valueOf2.booleanValue();
                                        if (z3) {
                                            z2 = true;
                                            return !z || z2;
                                        }
                                    }
                                }
                                z3 = false;
                                if (z3) {
                                }
                            }
                            z2 = false;
                            if (z) {
                            }
                        }
                    }
                }
                z4 = false;
                if (z4) {
                }
            }
            z = false;
            if (this.oldSubtitleFormat == null) {
            }
            z2 = false;
            if (z) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleTrackChanges(Track audioTrack, Track subtitlesTrack) {
            TrackFormat selectedTrackFormat = audioTrack.getSelectedTrackFormat();
            TrackFormat selectedTrackFormat2 = subtitlesTrack.getSelectedTrackFormat();
            d5z0 d5z0Var = h5z0.a;
            StringBuilder sb = new StringBuilder("handleTrackChanges audio=");
            sb.append(!jl40.l(selectedTrackFormat, this.oldAudioFormat));
            sb.append(" sub=");
            sb.append(!jl40.l(selectedTrackFormat2, this.oldSubtitleFormat));
            sb.append(" subLng=");
            sb.append(selectedTrackFormat2 != null ? selectedTrackFormat2.getLanguage() : null);
            d5z0Var.h(sb.toString(), new Object[0]);
            boolean tryEnableRusSubtitle = tryEnableRusSubtitle(audioTrack, subtitlesTrack);
            boolean z = !tryEnableRusSubtitle && detectAutomaticTrackChoice(selectedTrackFormat, selectedTrackFormat2, this.videoData);
            if (!tryEnableRusSubtitle && !z) {
                saveAudioAndSubtitleTracks(selectedTrackFormat, selectedTrackFormat2);
            }
            this.oldAudioFormat = selectedTrackFormat;
            this.oldSubtitleFormat = selectedTrackFormat2;
        }

        private final void saveAudioAndSubtitleTracks(TrackFormat newAudioFormat, TrackFormat newSubtitleFormat) {
            String language = newAudioFormat != null ? newAudioFormat.getLanguage() : null;
            if (language == null || evu0.J(language)) {
                return;
            }
            TrackFormat trackFormat = this.oldAudioFormat;
            if (jl40.l(trackFormat != null ? trackFormat.getLanguage() : null, newAudioFormat != null ? newAudioFormat.getLanguage() : null)) {
                TrackFormat trackFormat2 = this.oldSubtitleFormat;
                if (jl40.l(trackFormat2 != null ? trackFormat2.getLanguage() : null, newSubtitleFormat != null ? newSubtitleFormat.getLanguage() : null)) {
                    return;
                }
            }
            ExecutorsUtilKt.executeSafely(this.executorService, new hpo0(16, this, newAudioFormat, newSubtitleFormat));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void saveAudioAndSubtitleTracks$lambda$9(PlayerObserverImpl playerObserverImpl, TrackFormat trackFormat, TrackFormat trackFormat2) {
            Object failure;
            try {
                WatchParamsRepository watchParamsRepository = playerObserverImpl.watchParamsRepository;
                String parentContentId = playerObserverImpl.videoData.getParentContentId();
                if (parentContentId == null) {
                    parentContentId = playerObserverImpl.videoData.getContentId();
                }
                failure = watchParamsRepository.sendWatchParams(new WatchParams(parentContentId, trackFormat != null ? trackFormat.getLanguage() : null, trackFormat2 != null ? trackFormat2.getLanguage() : null)).get();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                playerObserverImpl.playerLogger.error(TrackSelectionManager.TAG, "onTracksChanged", "sendWatchParams", a, new Object[0]);
            }
        }

        private final boolean tryEnableRusSubtitle(Track audioTrack, Track subtitlesTrack) {
            TrackFormat selectedTrackFormat = audioTrack.getSelectedTrackFormat();
            if ((this.videoData.getAudioLanguage() != null && !jl40.l(selectedTrackFormat, this.oldAudioFormat) && this.oldAudioFormat != null) || (this.videoData.getAudioLanguage() == null && !jl40.l(selectedTrackFormat, this.oldAudioFormat))) {
                Object obj = null;
                String language = selectedTrackFormat != null ? selectedTrackFormat.getLanguage() : null;
                if (language == null) {
                    language = "";
                }
                if (!evu0.y(language, "ru", true) && (subtitlesTrack.getSelectedTrackVariant() instanceof TrackVariant.Disable) && jl40.l(this.oldSubtitleFormat, subtitlesTrack.getSelectedTrackFormat())) {
                    List<TrackVariant> availableTrackVariants = subtitlesTrack.getAvailableTrackVariants();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : availableTrackVariants) {
                        if (obj2 instanceof TrackVariant.Variant) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String language2 = ((TrackVariant.Variant) next).getFormat().getLanguage();
                        if (language2 == null) {
                            language2 = "";
                        }
                        if (evu0.y(language2, "ru", true)) {
                            obj = next;
                            break;
                        }
                    }
                    TrackVariant.Variant variant = (TrackVariant.Variant) obj;
                    if (variant != null) {
                        PlayerLogger playerLogger = this.playerLogger;
                        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                            playerLogger.verbose(TrackSelectionManager.TAG, "onTracksChanged", "select russian subtitle for non-russian audio", new Object[0]);
                        }
                        return subtitlesTrack.selectTrack(variant);
                    }
                }
            }
            return false;
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onTracksChanged(final Track audioTrack, final Track subtitlesTrack, Track videoTrack) {
            if (this.player.isPlayingAd()) {
                return;
            }
            TrackFormat selectedTrackFormat = audioTrack.getSelectedTrackFormat();
            TrackFormat selectedTrackFormat2 = subtitlesTrack.getSelectedTrackFormat();
            if (this.handlingDelayMs == 0) {
                handleTrackChanges(audioTrack, subtitlesTrack);
            } else {
                if (jl40.l(selectedTrackFormat, this.oldAudioFormat) && jl40.l(selectedTrackFormat2, this.oldSubtitleFormat)) {
                    return;
                }
                delayTask(new sls() { // from class: ru.yandex.video.m3.ott.ott.TrackSelectionManager$PlayerObserverImpl$onTracksChanged$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m761invoke() {
                        TrackSelectionManager.PlayerObserverImpl.this.handleTrackChanges(audioTrack, subtitlesTrack);
                    }

                    @Override // defpackage.sls
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m761invoke();
                        return zy11.a;
                    }
                });
            }
        }

        public final void release() {
            Handler handler;
            Runnable runnable = this.delayedTask;
            if (runnable == null || (handler = this.handler) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
        }

        public PlayerObserverImpl(YandexPlayer<?> yandexPlayer, OttVideoData ottVideoData, PlayerLogger playerLogger, ExecutorService executorService, WatchParamsRepository watchParamsRepository, long j) {
            this.player = yandexPlayer;
            this.videoData = ottVideoData;
            this.playerLogger = playerLogger;
            this.executorService = executorService;
            this.watchParamsRepository = watchParamsRepository;
            this.handlingDelayMs = j;
        }
    }
}
