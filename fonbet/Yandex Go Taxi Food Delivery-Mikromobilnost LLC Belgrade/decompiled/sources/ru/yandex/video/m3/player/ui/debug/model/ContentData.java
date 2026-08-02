package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "", "contentId", "", "streamType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "videoType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;", "(Ljava/lang/String;Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;)V", "getContentId", "()Ljava/lang/String;", "getStreamType", "()Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "getVideoType", "()Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ContentData {
    public static final int $stable = 0;
    private final String contentId;
    private final CurrentStreamType streamType;
    private final CurrentVideoType videoType;

    public /* synthetic */ ContentData(String str, CurrentStreamType currentStreamType, CurrentVideoType currentVideoType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : currentStreamType, (i & 4) != 0 ? null : currentVideoType);
    }

    public static /* synthetic */ ContentData copy$default(ContentData contentData, String str, CurrentStreamType currentStreamType, CurrentVideoType currentVideoType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentData.contentId;
        }
        if ((i & 2) != 0) {
            currentStreamType = contentData.streamType;
        }
        if ((i & 4) != 0) {
            currentVideoType = contentData.videoType;
        }
        return contentData.copy(str, currentStreamType, currentVideoType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component2, reason: from getter */
    public final CurrentStreamType getStreamType() {
        return this.streamType;
    }

    /* renamed from: component3, reason: from getter */
    public final CurrentVideoType getVideoType() {
        return this.videoType;
    }

    public final ContentData copy(String contentId, CurrentStreamType streamType, CurrentVideoType videoType) {
        return new ContentData(contentId, streamType, videoType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentData)) {
            return false;
        }
        ContentData contentData = (ContentData) other;
        return jl40.l(this.contentId, contentData.contentId) && this.streamType == contentData.streamType && this.videoType == contentData.videoType;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final CurrentStreamType getStreamType() {
        return this.streamType;
    }

    public final CurrentVideoType getVideoType() {
        return this.videoType;
    }

    public int hashCode() {
        String str = this.contentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CurrentStreamType currentStreamType = this.streamType;
        int hashCode2 = (hashCode + (currentStreamType == null ? 0 : currentStreamType.hashCode())) * 31;
        CurrentVideoType currentVideoType = this.videoType;
        return hashCode2 + (currentVideoType != null ? currentVideoType.hashCode() : 0);
    }

    public String toString() {
        return "ContentData(contentId=" + this.contentId + ", streamType=" + this.streamType + ", videoType=" + this.videoType + ')';
    }

    public ContentData(String str, CurrentStreamType currentStreamType, CurrentVideoType currentVideoType) {
        this.contentId = str;
        this.streamType = currentStreamType;
        this.videoType = currentVideoType;
    }

    public ContentData() {
        this(null, null, null, 7, null);
    }
}
