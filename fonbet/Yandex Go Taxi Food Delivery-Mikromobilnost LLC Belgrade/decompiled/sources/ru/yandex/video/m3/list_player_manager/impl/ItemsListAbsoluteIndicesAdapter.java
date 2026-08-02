package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.d6w;
import defpackage.ny61;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "failFast", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Z)V", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "newItems", "Lzy11;", "updateItems", "(Ljava/util/List;)V", "item", "", "absoluteIndexOf", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)I", "index", "get", "(I)Lru/yandex/video/m3/list_player_manager/model/MediaData;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Z", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter$IndicesContext;", "indicesContext", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter$IndicesContext;", "getAbsoluteSize", "()I", "absoluteSize", "Ld6w;", "getWindowIndices", "()Ld6w;", "windowIndices", "IndicesContext", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemsListAbsoluteIndicesAdapter {
    public static final int $stable = 8;
    private final boolean failFast;
    private IndicesContext indicesContext;
    private final PlayerLogger playerLogger;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00030 j\b\u0012\u0004\u0012\u00020\u0003`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter$IndicesContext;", "", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "initialItems", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "failFast", "<init>", "(Ljava/util/List;Lru/yandex/video/m3/player/utils/PlayerLogger;Z)V", "newItems", "updateItems", "(Ljava/util/List;)Z", "item", "", "absoluteIndexOf", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)I", "getAbsoluteSize", "()I", "Ld6w;", "getWindowIndices", "()Ld6w;", "index", "get", "(I)Lru/yandex/video/m3/list_player_manager/model/MediaData;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "Z", "getFailFast", "()Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "currentItems", "Ljava/util/ArrayList;", "startOffsetOfCurrentItems", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IndicesContext {
        private final ArrayList<MediaData> currentItems;
        private final boolean failFast;
        private final PlayerLogger playerLogger;
        private int startOffsetOfCurrentItems;

        public IndicesContext(List<MediaData> list, PlayerLogger playerLogger, boolean z) {
            this.playerLogger = playerLogger;
            this.failFast = z;
            UtilKt.verifyMainThread(z, playerLogger);
            this.currentItems = new ArrayList<>(list);
        }

        public final int absoluteIndexOf(MediaData item) {
            UtilKt.verifyMainThread(this.failFast, this.playerLogger);
            int indexOf = this.currentItems.indexOf(item);
            if (indexOf == -1) {
                return -1;
            }
            return indexOf + this.startOffsetOfCurrentItems;
        }

        public final MediaData get(int index) {
            UtilKt.verifyMainThread(this.failFast, this.playerLogger);
            return this.currentItems.get(index - this.startOffsetOfCurrentItems);
        }

        public final int getAbsoluteSize() {
            UtilKt.verifyMainThread(this.failFast, this.playerLogger);
            return this.currentItems.size() + this.startOffsetOfCurrentItems;
        }

        public final boolean getFailFast() {
            return this.failFast;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final d6w getWindowIndices() {
            UtilKt.verifyMainThread(this.failFast, this.playerLogger);
            int i = this.startOffsetOfCurrentItems;
            return y6i0.n(i, this.currentItems.size() + i);
        }

        public final boolean updateItems(List<MediaData> newItems) {
            UtilKt.verifyMainThread(this.failFast, this.playerLogger);
            if (!this.currentItems.isEmpty() && !newItems.isEmpty()) {
                int indexOf = this.currentItems.indexOf(kotlin.collections.a.P(newItems));
                if (indexOf != -1) {
                    this.startOffsetOfCurrentItems += indexOf;
                    this.currentItems.clear();
                    this.currentItems.addAll(newItems);
                    return true;
                }
                int lastIndexOf = this.currentItems.lastIndexOf(kotlin.collections.a.Z(newItems));
                if (lastIndexOf != -1) {
                    int size = this.startOffsetOfCurrentItems - ((newItems.size() - lastIndexOf) - 1);
                    this.startOffsetOfCurrentItems = size;
                    if (size < 0) {
                        return false;
                    }
                    this.currentItems.clear();
                    this.currentItems.addAll(newItems);
                    return true;
                }
                int indexOf2 = newItems.indexOf(kotlin.collections.a.P(this.currentItems));
                if (indexOf2 != -1) {
                    int i = this.startOffsetOfCurrentItems - indexOf2;
                    this.startOffsetOfCurrentItems = i;
                    if (i < 0) {
                        return false;
                    }
                    this.currentItems.clear();
                    this.currentItems.addAll(newItems);
                    return true;
                }
            }
            return false;
        }
    }

    public ItemsListAbsoluteIndicesAdapter(PlayerLogger playerLogger, boolean z) {
        this.playerLogger = playerLogger;
        this.failFast = z;
    }

    public final int absoluteIndexOf(MediaData item) {
        IndicesContext indicesContext = this.indicesContext;
        if (indicesContext != null) {
            return indicesContext.absoluteIndexOf(item);
        }
        return -1;
    }

    public final MediaData get(int index) {
        MediaData mediaData;
        IndicesContext indicesContext = this.indicesContext;
        if (indicesContext != null && (mediaData = indicesContext.get(index)) != null) {
            return mediaData;
        }
        ny61.r("Should call updateItems first!");
        return null;
    }

    public final int getAbsoluteSize() {
        IndicesContext indicesContext = this.indicesContext;
        if (indicesContext != null) {
            return indicesContext.getAbsoluteSize();
        }
        return 0;
    }

    public final d6w getWindowIndices() {
        d6w windowIndices;
        IndicesContext indicesContext = this.indicesContext;
        if (indicesContext != null && (windowIndices = indicesContext.getWindowIndices()) != null) {
            return windowIndices;
        }
        d6w d6wVar = d6w.w;
        return d6w.w;
    }

    public final void updateItems(List<MediaData> newItems) {
        IndicesContext indicesContext = this.indicesContext;
        if (indicesContext == null || !indicesContext.updateItems(newItems)) {
            this.indicesContext = new IndicesContext(newItems, this.playerLogger, this.failFast);
        }
    }
}
