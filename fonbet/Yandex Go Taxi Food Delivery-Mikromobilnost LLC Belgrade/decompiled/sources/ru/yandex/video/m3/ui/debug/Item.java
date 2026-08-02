package ru.yandex.video.m3.ui.debug;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u000bHÆ\u0003JH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/yandex/video/m3/ui/debug/Item;", "", "mediaData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "visible", "", "attachedEngine", "Lru/yandex/video/m3/player/YandexPlayer;", "listPlayerIndex", "", "preloadState", "Lru/yandex/video/m3/ui/debug/PreloadState;", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;ZLru/yandex/video/m3/player/YandexPlayer;Ljava/lang/Integer;Lru/yandex/video/m3/ui/debug/PreloadState;)V", "getAttachedEngine", "()Lru/yandex/video/m3/player/YandexPlayer;", "setAttachedEngine", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "getListPlayerIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaData", "()Lru/yandex/video/m3/list_player_manager/model/MediaData;", "getPreloadState", "()Lru/yandex/video/m3/ui/debug/PreloadState;", "setPreloadState", "(Lru/yandex/video/m3/ui/debug/PreloadState;)V", "getVisible", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;ZLru/yandex/video/m3/player/YandexPlayer;Ljava/lang/Integer;Lru/yandex/video/m3/ui/debug/PreloadState;)Lru/yandex/video/m3/ui/debug/Item;", "equals", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Item {
    public static final int $stable = 8;
    private YandexPlayer<?> attachedEngine;
    private final Integer listPlayerIndex;
    private final MediaData mediaData;
    private PreloadState preloadState;
    private final boolean visible;

    public Item(MediaData mediaData, boolean z, YandexPlayer<?> yandexPlayer, Integer num, PreloadState preloadState) {
        this.mediaData = mediaData;
        this.visible = z;
        this.attachedEngine = yandexPlayer;
        this.listPlayerIndex = num;
        this.preloadState = preloadState;
    }

    public static /* synthetic */ Item copy$default(Item item, MediaData mediaData, boolean z, YandexPlayer yandexPlayer, Integer num, PreloadState preloadState, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaData = item.mediaData;
        }
        if ((i & 2) != 0) {
            z = item.visible;
        }
        if ((i & 4) != 0) {
            yandexPlayer = item.attachedEngine;
        }
        if ((i & 8) != 0) {
            num = item.listPlayerIndex;
        }
        if ((i & 16) != 0) {
            preloadState = item.preloadState;
        }
        PreloadState preloadState2 = preloadState;
        YandexPlayer yandexPlayer2 = yandexPlayer;
        return item.copy(mediaData, z, yandexPlayer2, num, preloadState2);
    }

    /* renamed from: component1, reason: from getter */
    public final MediaData getMediaData() {
        return this.mediaData;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final YandexPlayer<?> component3() {
        return this.attachedEngine;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getListPlayerIndex() {
        return this.listPlayerIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final PreloadState getPreloadState() {
        return this.preloadState;
    }

    public final Item copy(MediaData mediaData, boolean visible, YandexPlayer<?> attachedEngine, Integer listPlayerIndex, PreloadState preloadState) {
        return new Item(mediaData, visible, attachedEngine, listPlayerIndex, preloadState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return jl40.l(this.mediaData, item.mediaData) && this.visible == item.visible && jl40.l(this.attachedEngine, item.attachedEngine) && jl40.l(this.listPlayerIndex, item.listPlayerIndex) && this.preloadState == item.preloadState;
    }

    public final YandexPlayer<?> getAttachedEngine() {
        return this.attachedEngine;
    }

    public final Integer getListPlayerIndex() {
        return this.listPlayerIndex;
    }

    public final MediaData getMediaData() {
        return this.mediaData;
    }

    public final PreloadState getPreloadState() {
        return this.preloadState;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int e = unr0.e(this.mediaData.hashCode() * 31, 31, this.visible);
        YandexPlayer<?> yandexPlayer = this.attachedEngine;
        int hashCode = (e + (yandexPlayer == null ? 0 : yandexPlayer.hashCode())) * 31;
        Integer num = this.listPlayerIndex;
        return this.preloadState.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final void setAttachedEngine(YandexPlayer<?> yandexPlayer) {
        this.attachedEngine = yandexPlayer;
    }

    public final void setPreloadState(PreloadState preloadState) {
        this.preloadState = preloadState;
    }

    public String toString() {
        return "Item(mediaData=" + this.mediaData + ", visible=" + this.visible + ", attachedEngine=" + this.attachedEngine + ", listPlayerIndex=" + this.listPlayerIndex + ", preloadState=" + this.preloadState + ')';
    }
}
