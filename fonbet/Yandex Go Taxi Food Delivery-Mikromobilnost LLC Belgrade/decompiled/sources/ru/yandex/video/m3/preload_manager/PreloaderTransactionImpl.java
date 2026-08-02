package ru.yandex.video.m3.preload_manager;

import android.os.Handler;
import android.os.Looper;
import defpackage.jl40;
import defpackage.ooc;
import defpackage.tw21;
import defpackage.wnb0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.VideoData;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl;", "Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "Lru/yandex/video/m3/preload_manager/PreloadManagerImpl;", "preloadManager", "Landroid/os/Handler;", "handler", "<init>", "(Lru/yandex/video/m3/preload_manager/PreloadManagerImpl;Landroid/os/Handler;)V", "Lzy11;", "checkPreconditions", "()V", "Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionInfo;", "execute", "(Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionInfo;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "startPreload", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "setPriority", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "cancelPreload", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "commit", "revert", "close", "Lru/yandex/video/m3/preload_manager/PreloadManagerImpl;", "Landroid/os/Handler;", "Landroid/os/Looper;", "myLooper", "Landroid/os/Looper;", "", "actions", "Ljava/util/List;", "", "<set-?>", "inProgress", "Z", "getInProgress", "()Z", "TransactionInfo", "TransactionType", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloaderTransactionImpl implements PreloaderTransaction {
    public static final int $stable = 8;
    private final Handler handler;
    private final PreloadManagerImpl preloadManager;
    private final Looper myLooper = Looper.myLooper();
    private final List<TransactionInfo> actions = new ArrayList();
    private volatile boolean inProgress = true;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionInfo;", "", "transactionType", "Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionType;", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadConfig;", "priority", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "(Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionType;Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "getConfig", "()Lru/yandex/video/m3/preload_manager/PreloadConfig;", "getPriority", "()Lru/yandex/video/m3/preload_manager/PreloadPriority;", "getTransactionType", "()Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionType;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TransactionInfo {
        private final PreloadConfig config;
        private final PreloadPriority priority;
        private final TransactionType transactionType;
        private final VideoData videoData;

        public TransactionInfo(TransactionType transactionType, VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority) {
            this.transactionType = transactionType;
            this.videoData = videoData;
            this.config = preloadConfig;
            this.priority = preloadPriority;
        }

        public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, TransactionType transactionType, VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionType = transactionInfo.transactionType;
            }
            if ((i & 2) != 0) {
                videoData = transactionInfo.videoData;
            }
            if ((i & 4) != 0) {
                preloadConfig = transactionInfo.config;
            }
            if ((i & 8) != 0) {
                preloadPriority = transactionInfo.priority;
            }
            return transactionInfo.copy(transactionType, videoData, preloadConfig, preloadPriority);
        }

        /* renamed from: component1, reason: from getter */
        public final TransactionType getTransactionType() {
            return this.transactionType;
        }

        /* renamed from: component2, reason: from getter */
        public final VideoData getVideoData() {
            return this.videoData;
        }

        /* renamed from: component3, reason: from getter */
        public final PreloadConfig getConfig() {
            return this.config;
        }

        /* renamed from: component4, reason: from getter */
        public final PreloadPriority getPriority() {
            return this.priority;
        }

        public final TransactionInfo copy(TransactionType transactionType, VideoData videoData, PreloadConfig config, PreloadPriority priority) {
            return new TransactionInfo(transactionType, videoData, config, priority);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionInfo)) {
                return false;
            }
            TransactionInfo transactionInfo = (TransactionInfo) other;
            return this.transactionType == transactionInfo.transactionType && jl40.l(this.videoData, transactionInfo.videoData) && jl40.l(this.config, transactionInfo.config) && jl40.l(this.priority, transactionInfo.priority);
        }

        public final PreloadConfig getConfig() {
            return this.config;
        }

        public final PreloadPriority getPriority() {
            return this.priority;
        }

        public final TransactionType getTransactionType() {
            return this.transactionType;
        }

        public final VideoData getVideoData() {
            return this.videoData;
        }

        public int hashCode() {
            int hashCode = (this.videoData.hashCode() + (this.transactionType.hashCode() * 31)) * 31;
            PreloadConfig preloadConfig = this.config;
            int hashCode2 = (hashCode + (preloadConfig == null ? 0 : preloadConfig.hashCode())) * 31;
            PreloadPriority preloadPriority = this.priority;
            return hashCode2 + (preloadPriority != null ? preloadPriority.hashCode() : 0);
        }

        public String toString() {
            return "TransactionInfo(transactionType=" + this.transactionType + ", videoData=" + this.videoData + ", config=" + this.config + ", priority=" + this.priority + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloaderTransactionImpl$TransactionType;", "", "(Ljava/lang/String;I)V", "START_PRELOAD", "SET_PRIORITY", "CANCEL_PRELOAD", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TransactionType {
        START_PRELOAD,
        SET_PRIORITY,
        CANCEL_PRELOAD
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.START_PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.SET_PRIORITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.CANCEL_PRELOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PreloaderTransactionImpl(PreloadManagerImpl preloadManagerImpl, Handler handler) {
        this.preloadManager = preloadManagerImpl;
        this.handler = handler;
    }

    private final void checkPreconditions() {
        if (!jl40.l(Looper.myLooper(), this.myLooper)) {
            throw new TransactionException("All transaction calls should happen from same thread");
        }
        if (!getInProgress()) {
            throw new TransactionException("Transaction already completed by commit / revert");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commit$lambda$2(PreloaderTransactionImpl preloaderTransactionImpl) {
        Closeable batchMode$video_player_internalRelease = preloaderTransactionImpl.preloadManager.batchMode$video_player_internalRelease();
        try {
            Iterator<T> it = preloaderTransactionImpl.actions.iterator();
            while (it.hasNext()) {
                preloaderTransactionImpl.execute((TransactionInfo) it.next());
            }
            ooc.g(batchMode$video_player_internalRelease, null);
        } finally {
        }
    }

    private final void execute(TransactionInfo transactionInfo) {
        int i = WhenMappings.$EnumSwitchMapping$0[transactionInfo.getTransactionType().ordinal()];
        if (i == 1) {
            this.preloadManager.startPreload(transactionInfo.getVideoData(), transactionInfo.getConfig(), transactionInfo.getPriority());
        } else if (i == 2) {
            this.preloadManager.setPriority(transactionInfo.getVideoData(), transactionInfo.getPriority());
        } else {
            if (i != 3) {
                return;
            }
            this.preloadManager.cancelPreload(transactionInfo.getVideoData());
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
    public void cancelPreload(VideoData videoData) {
        checkPreconditions();
        this.actions.add(new TransactionInfo(TransactionType.CANCEL_PRELOAD, videoData, null, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        commit();
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
    public void commit() {
        checkPreconditions();
        this.inProgress = false;
        tw21.a0(this.handler, new wnb0(28, this));
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
    public boolean getInProgress() {
        return this.inProgress;
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
    public void revert() {
        checkPreconditions();
        this.inProgress = false;
        this.actions.clear();
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
    public void setPriority(VideoData videoData, PreloadPriority priority) {
        checkPreconditions();
        this.actions.add(new TransactionInfo(TransactionType.SET_PRIORITY, videoData, null, priority));
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
    public void startPreload(VideoData videoData, PreloadConfig config, PreloadPriority priority) {
        checkPreconditions();
        this.actions.add(new TransactionInfo(TransactionType.START_PRELOAD, videoData, config, priority));
    }
}
