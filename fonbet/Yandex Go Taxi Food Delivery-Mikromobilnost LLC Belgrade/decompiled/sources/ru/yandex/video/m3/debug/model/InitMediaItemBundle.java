package ru.yandex.video.m3.debug.model;

import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/debug/model/InitMediaItemBundle;", "", "initMediaItemData", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/InitMediaItemData;", "mediaData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/InitMediaItemData;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "getInitMediaItemData", "()Lru/yandex/video/m3/list_player_manager/impl/telemetry/InitMediaItemData;", "getMediaData", "()Lru/yandex/video/m3/list_player_manager/model/MediaData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InitMediaItemBundle {
    public static final int $stable = 8;
    private final InitMediaItemData initMediaItemData;
    private final MediaData mediaData;

    public InitMediaItemBundle(InitMediaItemData initMediaItemData, MediaData mediaData) {
        this.initMediaItemData = initMediaItemData;
        this.mediaData = mediaData;
    }

    public static /* synthetic */ InitMediaItemBundle copy$default(InitMediaItemBundle initMediaItemBundle, InitMediaItemData initMediaItemData, MediaData mediaData, int i, Object obj) {
        if ((i & 1) != 0) {
            initMediaItemData = initMediaItemBundle.initMediaItemData;
        }
        if ((i & 2) != 0) {
            mediaData = initMediaItemBundle.mediaData;
        }
        return initMediaItemBundle.copy(initMediaItemData, mediaData);
    }

    /* renamed from: component1, reason: from getter */
    public final InitMediaItemData getInitMediaItemData() {
        return this.initMediaItemData;
    }

    /* renamed from: component2, reason: from getter */
    public final MediaData getMediaData() {
        return this.mediaData;
    }

    public final InitMediaItemBundle copy(InitMediaItemData initMediaItemData, MediaData mediaData) {
        return new InitMediaItemBundle(initMediaItemData, mediaData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitMediaItemBundle)) {
            return false;
        }
        InitMediaItemBundle initMediaItemBundle = (InitMediaItemBundle) other;
        return jl40.l(this.initMediaItemData, initMediaItemBundle.initMediaItemData) && jl40.l(this.mediaData, initMediaItemBundle.mediaData);
    }

    public final InitMediaItemData getInitMediaItemData() {
        return this.initMediaItemData;
    }

    public final MediaData getMediaData() {
        return this.mediaData;
    }

    public int hashCode() {
        int hashCode = this.initMediaItemData.hashCode() * 31;
        MediaData mediaData = this.mediaData;
        return hashCode + (mediaData == null ? 0 : mediaData.hashCode());
    }

    public String toString() {
        return "InitMediaItemBundle(initMediaItemData=" + this.initMediaItemData + ", mediaData=" + this.mediaData + ')';
    }
}
