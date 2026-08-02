package ru.yandex.video.m3.list_player_manager.impl.pool;

import defpackage.x43;
import defpackage.zxc0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.debug.DecoderUsageListener;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u000fJ\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0017\u0010\u000fJ\u001b\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerPool;", "Lru/yandex/video/m3/player/PlayerObserver;", "Lzxc0;", "", "targetPoolSize", "maxPoolSize", "exceptionCountToDisablePoolIncreasing", "Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerFactory;", "yandexPlayerFactory", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "<init>", "(IIILru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerFactory;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "givePlayerFromIdels", "()Lru/yandex/video/m3/player/YandexPlayer;", "giveNewPlayer", "", "increasePoolSize", "()Z", "decreasePoolSize", "getNextEngine", "acquire", "acquireForce", "yandexPlayer", "Lzy11;", "release", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerFactory;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "", "TAG", "Ljava/lang/String;", "", "issuedPlayers", "Ljava/util/List;", "Lx43;", "idlePlayers", "Lx43;", "poolSize", "Lru/yandex/video/m3/debug/DecoderUsageListener;", "decoderUsageListener", "Lru/yandex/video/m3/debug/DecoderUsageListener;", "getDecoderUsageListener", "()Lru/yandex/video/m3/debug/DecoderUsageListener;", "setDecoderUsageListener", "(Lru/yandex/video/m3/debug/DecoderUsageListener;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "decodersFatalsCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "getAvailableSize", "()I", "availableSize", "getInUseSize", "inUseSize", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerPool implements PlayerObserver<zxc0> {
    public static final int $stable = 8;
    private DecoderUsageListener decoderUsageListener;
    private final int exceptionCountToDisablePoolIncreasing;
    private final int maxPoolSize;
    private final PlayerLogger playerLogger;
    private int poolSize;
    private final int targetPoolSize;
    private final YandexPlayerFactory yandexPlayerFactory;
    private final String TAG = "YP:Pool";
    private final List<YandexPlayer<zxc0>> issuedPlayers = new ArrayList();
    private final x43 idlePlayers = new x43();
    private AtomicInteger decodersFatalsCount = new AtomicInteger(0);

    public YandexPlayerPool(int i, int i2, int i3, YandexPlayerFactory yandexPlayerFactory, PlayerLogger playerLogger) {
        this.targetPoolSize = i;
        this.maxPoolSize = i2;
        this.exceptionCountToDisablePoolIncreasing = i3;
        this.yandexPlayerFactory = yandexPlayerFactory;
        this.playerLogger = playerLogger;
        this.poolSize = i;
    }

    private final boolean decreasePoolSize() {
        if (this.poolSize <= this.targetPoolSize || getInUseSize() + getAvailableSize() <= this.targetPoolSize || getAvailableSize() <= 0) {
            return false;
        }
        YandexPlayer yandexPlayer = (YandexPlayer) this.idlePlayers.removeFirst();
        yandexPlayer.removeObserver(this);
        yandexPlayer.release();
        this.poolSize--;
        return true;
    }

    private final int getAvailableSize() {
        return this.idlePlayers.size();
    }

    private final int getInUseSize() {
        return this.issuedPlayers.size();
    }

    private final YandexPlayer<zxc0> getNextEngine() {
        return this.yandexPlayerFactory.create(this.decoderUsageListener);
    }

    private final YandexPlayer<zxc0> giveNewPlayer() {
        YandexPlayer<zxc0> nextEngine = getNextEngine();
        nextEngine.addObserver(this);
        this.issuedPlayers.add(nextEngine);
        return nextEngine;
    }

    private final YandexPlayer<zxc0> givePlayerFromIdels() {
        YandexPlayer<zxc0> yandexPlayer = (YandexPlayer) this.idlePlayers.removeFirst();
        this.issuedPlayers.add(yandexPlayer);
        return yandexPlayer;
    }

    private final boolean increasePoolSize() {
        if (this.poolSize >= this.maxPoolSize || this.decodersFatalsCount.get() >= this.exceptionCountToDisablePoolIncreasing) {
            return false;
        }
        this.poolSize++;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "increasePoolSize", "poolSize=" + this.poolSize + "; maxPoolSize=" + this.maxPoolSize, new Object[0]);
        }
        return true;
    }

    public final YandexPlayer<zxc0> acquire() {
        if (getAvailableSize() > 0) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose(this.TAG, "acquire", "availableSize > 0 will be returned idle player. It will be " + (getInUseSize() + getAvailableSize()) + " player", new Object[0]);
            }
            return givePlayerFromIdels();
        }
        if (getInUseSize() + getAvailableSize() < this.poolSize || increasePoolSize()) {
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                playerLogger2.verbose(this.TAG, "acquire", "There ara no available idle player, but acquired = " + (getInUseSize() + getAvailableSize()) + " < " + this.poolSize, new Object[0]);
            }
            return giveNewPlayer();
        }
        PlayerLogger playerLogger3 = this.playerLogger;
        if (!PlayerLoggerExtensionsKt.getEnabled(playerLogger3)) {
            return null;
        }
        playerLogger3.verbose(this.TAG, "acquire", "failed availableSize=" + getAvailableSize() + ", inUseSize=" + getInUseSize(), new Object[0]);
        return null;
    }

    public final YandexPlayer<zxc0> acquireForce() {
        YandexPlayer<zxc0> acquire = acquire();
        if (acquire == null) {
            acquire = giveNewPlayer();
            if (getInUseSize() + getAvailableSize() >= this.poolSize) {
                PlayerLogger playerLogger = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                    playerLogger.verbose(this.TAG, "acquireForce", "Try get more then " + this.poolSize + " players. It will be " + (getInUseSize() + getAvailableSize() + 1) + " player", new Object[0]);
                }
            }
        }
        return acquire;
    }

    public final DecoderUsageListener getDecoderUsageListener() {
        return this.decoderUsageListener;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackError(PlaybackException playbackException) {
        if (playbackException instanceof PlaybackException.ErrorInstantiatingDecoder) {
            this.decodersFatalsCount.incrementAndGet();
        }
    }

    public final synchronized void release(YandexPlayer<zxc0> yandexPlayer) {
        try {
            decreasePoolSize();
            int inUseSize = getInUseSize() + getAvailableSize();
            int i = this.poolSize;
            PlayerLogger playerLogger = this.playerLogger;
            if (inUseSize > i) {
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                    playerLogger.verbose(this.TAG, "release", "To much players. It is " + (getInUseSize() + getAvailableSize() + 1) + " player. Release player", new Object[0]);
                }
                this.issuedPlayers.remove(yandexPlayer);
                yandexPlayer.removeObserver(this);
                yandexPlayer.release();
            } else {
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                    playerLogger.verbose(this.TAG, "release", "Return player to pool; inUseSize=" + getInUseSize() + " availableSize=" + getAvailableSize(), new Object[0]);
                }
                this.issuedPlayers.remove(yandexPlayer);
                this.idlePlayers.addLast(yandexPlayer);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setDecoderUsageListener(DecoderUsageListener decoderUsageListener) {
        this.decoderUsageListener = decoderUsageListener;
    }
}
