package ru.yandex.video.m3.player.impl.concurrent;

import defpackage.oyr;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.PrepareConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H'J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateProvider;", "currentSourceIndex", "", "getCurrentSourceIndex", "()I", "isReleased", "", "()Z", "setReleased", "(Z)V", "isStopped", "setStopped", "beginPrepare", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager$Indices;", "prepareConfig", "Lru/yandex/video/m3/player/impl/PrepareConfig;", "isActualPrepare", "prepareIndex", "isNotActualPrepare", "Indices", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ConcurrentPlayerStateManager extends ConcurrentPlayerStateProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isActive(ConcurrentPlayerStateManager concurrentPlayerStateManager) {
            return ConcurrentPlayerStateManager.super.isActive();
        }

        @Deprecated
        public static boolean isNotActive(ConcurrentPlayerStateManager concurrentPlayerStateManager) {
            return ConcurrentPlayerStateManager.super.isNotActive();
        }

        @Deprecated
        public static boolean isNotActualPrepare(ConcurrentPlayerStateManager concurrentPlayerStateManager, int i) {
            return ConcurrentPlayerStateManager.super.isNotActualPrepare(i);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager$Indices;", "", "prepareIndex", "", "sourceIndex", "(II)V", "getPrepareIndex", "()I", "getSourceIndex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Indices {
        public static final int $stable = 0;
        private final int prepareIndex;
        private final int sourceIndex;

        public Indices(int i, int i2) {
            this.prepareIndex = i;
            this.sourceIndex = i2;
        }

        public static /* synthetic */ Indices copy$default(Indices indices, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = indices.prepareIndex;
            }
            if ((i3 & 2) != 0) {
                i2 = indices.sourceIndex;
            }
            return indices.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPrepareIndex() {
            return this.prepareIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSourceIndex() {
            return this.sourceIndex;
        }

        public final Indices copy(int prepareIndex, int sourceIndex) {
            return new Indices(prepareIndex, sourceIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Indices)) {
                return false;
            }
            Indices indices = (Indices) other;
            return this.prepareIndex == indices.prepareIndex && this.sourceIndex == indices.sourceIndex;
        }

        public final int getPrepareIndex() {
            return this.prepareIndex;
        }

        public final int getSourceIndex() {
            return this.sourceIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.sourceIndex) + (Integer.hashCode(this.prepareIndex) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Indices(prepareIndex=");
            sb.append(this.prepareIndex);
            sb.append(", sourceIndex=");
            return oyr.s(sb, this.sourceIndex, ')');
        }
    }

    Indices beginPrepare(PrepareConfig prepareConfig);

    int getCurrentSourceIndex();

    boolean isActualPrepare(int prepareIndex);

    default boolean isNotActualPrepare(int prepareIndex) {
        return !isActualPrepare(prepareIndex);
    }

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateProvider
    boolean isReleased();

    @Override // ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateProvider
    boolean isStopped();

    void setReleased(boolean z);

    void setStopped(boolean z);
}
