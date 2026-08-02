package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.zxc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListPlayerAudioControl;", "", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "tag", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/lang/String;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "yandexPlayer", "Lru/yandex/video/m3/player/tracks/TrackVariant$Disable;", "getDisabledTrackVariantOrNull", "(Lru/yandex/video/m3/player/YandexPlayer;)Lru/yandex/video/m3/player/tracks/TrackVariant$Disable;", "Lru/yandex/video/m3/player/tracks/TrackVariant$Variant;", "getDefaultTrackVariantOrNull", "(Lru/yandex/video/m3/player/YandexPlayer;)Lru/yandex/video/m3/player/tracks/TrackVariant$Variant;", "", "volume", "Lzy11;", "setVolume", "(F)V", "getCurrentVolume", "()F", "", "muted", "setMuted", "(Z)Z", "isMuted", "()Z", "engine", "applyToEngine", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/lang/String;", "audioVolume", "F", "forcedMute", "Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListPlayerAudioControl {

    @Deprecated
    public static final float DEFAULT_VOLUME = 1.0f;
    private float audioVolume = 1.0f;
    private boolean forcedMute;
    private final PlayerLogger playerLogger;
    private final String tag;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ListPlayerAudioControl(PlayerLogger playerLogger, String str) {
        this.playerLogger = playerLogger;
        this.tag = str;
    }

    private final TrackVariant.Variant getDefaultTrackVariantOrNull(YandexPlayer<zxc0> yandexPlayer) {
        List<TrackVariant> availableTrackVariants;
        Track audioTrack = yandexPlayer.getAudioTrack();
        if (audioTrack == null || (availableTrackVariants = audioTrack.getAvailableTrackVariants()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : availableTrackVariants) {
            if (obj instanceof TrackVariant.Variant) {
                arrayList.add(obj);
            }
        }
        return (TrackVariant.Variant) kotlin.collections.a.R(arrayList);
    }

    private final TrackVariant.Disable getDisabledTrackVariantOrNull(YandexPlayer<zxc0> yandexPlayer) {
        List<TrackVariant> availableTrackVariants;
        Track audioTrack = yandexPlayer.getAudioTrack();
        if (audioTrack == null || (availableTrackVariants = audioTrack.getAvailableTrackVariants()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : availableTrackVariants) {
            if (obj instanceof TrackVariant.Disable) {
                arrayList.add(obj);
            }
        }
        return (TrackVariant.Disable) kotlin.collections.a.R(arrayList);
    }

    public final void applyToEngine(YandexPlayer<zxc0> engine) {
        Track audioTrack;
        TrackVariant.Disable disabledTrackVariantOrNull;
        Track audioTrack2;
        float currentVolume = getCurrentVolume();
        if (!this.forcedMute) {
            TrackVariant.Variant defaultTrackVariantOrNull = getDefaultTrackVariantOrNull(engine);
            if (defaultTrackVariantOrNull != null && (audioTrack = engine.getAudioTrack()) != null) {
                audioTrack.selectTrack(defaultTrackVariantOrNull);
            }
        } else if (engine.getPosition() == 0 && (disabledTrackVariantOrNull = getDisabledTrackVariantOrNull(engine)) != null && (audioTrack2 = engine.getAudioTrack()) != null) {
            audioTrack2.selectTrack(disabledTrackVariantOrNull);
        }
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.tag, "audioControl.applyToEngine", "forcedMute = " + this.forcedMute + ", audioVolume = " + this.audioVolume + ", result = " + currentVolume, new Object[0]);
        }
        engine.setVolume(currentVolume);
    }

    public final float getCurrentVolume() {
        if (this.forcedMute) {
            return 0.0f;
        }
        return this.audioVolume;
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getForcedMute() {
        return this.forcedMute;
    }

    public final boolean setMuted(boolean muted) {
        boolean z = this.forcedMute;
        this.forcedMute = muted;
        return z != muted;
    }

    public final void setVolume(float volume) {
        this.forcedMute = false;
        this.audioVolume = volume;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListPlayerAudioControl$Companion;", "", "()V", "DEFAULT_VOLUME", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
