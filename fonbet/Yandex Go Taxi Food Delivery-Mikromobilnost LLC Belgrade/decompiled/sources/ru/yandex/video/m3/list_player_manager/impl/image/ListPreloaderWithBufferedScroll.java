package ru.yandex.video.m3.list_player_manager.impl.image;

import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.RequestManager;
import defpackage.b64;
import defpackage.jty;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002#$B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00018\u00008\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll;", "T", "", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Landroidx/fragment/app/FragmentActivity;", "activityContext", "Lcom/bumptech/glide/RequestManager;", "requestManager", "Ljty;", "preloadModelProvider", "", "maxPreload", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Landroidx/fragment/app/FragmentActivity;Lcom/bumptech/glide/RequestManager;Ljty;I)V", "firstVisible", "visibleCount", "totalCount", "Lzy11;", "onScrollImpl", "(III)V", "onSizeIsReady", "()V", "onScroll", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lcom/bumptech/glide/ListPreloader;", "kotlin.jvm.PlatformType", "listPreloader", "Lcom/bumptech/glide/ListPreloader;", "", "sizeIsReady", "Z", "Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll$PendingScroll;", "pendingScroll", "Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll$PendingScroll;", "Companion", "PendingScroll", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListPreloaderWithBufferedScroll<T> {

    @Deprecated
    public static final String TAG = "GlideBitmapDownloader";
    private final ListPreloader<T> listPreloader;
    private PendingScroll pendingScroll;
    private final PlayerLogger playerLogger;
    private boolean sizeIsReady;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll$PendingScroll;", "", "firstVisible", "", "visibleCount", "totalCount", "(III)V", "getFirstVisible", "()I", "getTotalCount", "getVisibleCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PendingScroll {
        private final int firstVisible;
        private final int totalCount;
        private final int visibleCount;

        public PendingScroll(int i, int i2, int i3) {
            this.firstVisible = i;
            this.visibleCount = i2;
            this.totalCount = i3;
        }

        public static /* synthetic */ PendingScroll copy$default(PendingScroll pendingScroll, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = pendingScroll.firstVisible;
            }
            if ((i4 & 2) != 0) {
                i2 = pendingScroll.visibleCount;
            }
            if ((i4 & 4) != 0) {
                i3 = pendingScroll.totalCount;
            }
            return pendingScroll.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getFirstVisible() {
            return this.firstVisible;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVisibleCount() {
            return this.visibleCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public final PendingScroll copy(int firstVisible, int visibleCount, int totalCount) {
            return new PendingScroll(firstVisible, visibleCount, totalCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingScroll)) {
                return false;
            }
            PendingScroll pendingScroll = (PendingScroll) other;
            return this.firstVisible == pendingScroll.firstVisible && this.visibleCount == pendingScroll.visibleCount && this.totalCount == pendingScroll.totalCount;
        }

        public final int getFirstVisible() {
            return this.firstVisible;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final int getVisibleCount() {
            return this.visibleCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.totalCount) + oyr.b(this.visibleCount, Integer.hashCode(this.firstVisible) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PendingScroll(firstVisible=");
            sb.append(this.firstVisible);
            sb.append(", visibleCount=");
            sb.append(this.visibleCount);
            sb.append(", totalCount=");
            return oyr.s(sb, this.totalCount, ')');
        }
    }

    public ListPreloaderWithBufferedScroll(PlayerLogger playerLogger, FragmentActivity fragmentActivity, RequestManager requestManager, jty jtyVar, int i) {
        this.playerLogger = playerLogger;
        this.listPreloader = new ListPreloader<>(requestManager, jtyVar, new ActivityViewSizeProvider(fragmentActivity, new ListPreloaderWithBufferedScroll$listPreloader$1(this)), i);
    }

    private final void onScrollImpl(int firstVisible, int visibleCount, int totalCount) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            StringBuilder s = b64.s(firstVisible, visibleCount, "preload with stats: firstVisible=", " visibleCount=", " totalCount=");
            s.append(totalCount);
            playerLogger.verbose("GlideBitmapDownloader", "onScrollImpl", s.toString(), new Object[0]);
        }
        this.listPreloader.onScroll(null, firstVisible, visibleCount, totalCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSizeIsReady() {
        this.sizeIsReady = true;
        PendingScroll pendingScroll = this.pendingScroll;
        if (pendingScroll != null) {
            onScrollImpl(pendingScroll.getFirstVisible(), pendingScroll.getVisibleCount(), pendingScroll.getTotalCount());
        }
        this.pendingScroll = null;
    }

    public final void onScroll(int firstVisible, int visibleCount, int totalCount) {
        if (this.sizeIsReady) {
            onScrollImpl(firstVisible, visibleCount, totalCount);
        } else {
            this.pendingScroll = new PendingScroll(firstVisible, visibleCount, totalCount);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll$Companion;", "", "()V", "TAG", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
