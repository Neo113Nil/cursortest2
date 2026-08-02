package ru.yandex.video.m3.list_player_manager.model;

import defpackage.b64;
import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/Stream;", "", "streamType", "Lru/yandex/video/m3/list_player_manager/model/StreamType;", "stream", "", "(Lru/yandex/video/m3/list_player_manager/model/StreamType;Ljava/lang/String;)V", "getStream", "()Ljava/lang/String;", "getStreamType", "()Lru/yandex/video/m3/list_player_manager/model/StreamType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Stream {
    public static final int $stable = 0;

    @ysq0("stream")
    private final String stream;

    @ysq0("stream_type")
    private final StreamType streamType;

    public Stream(StreamType streamType, String str) {
        this.streamType = streamType;
        this.stream = str;
    }

    public static /* synthetic */ Stream copy$default(Stream stream, StreamType streamType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            streamType = stream.streamType;
        }
        if ((i & 2) != 0) {
            str = stream.stream;
        }
        return stream.copy(streamType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StreamType getStreamType() {
        return this.streamType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStream() {
        return this.stream;
    }

    public final Stream copy(StreamType streamType, String stream) {
        return new Stream(streamType, stream);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stream)) {
            return false;
        }
        Stream stream = (Stream) other;
        return this.streamType == stream.streamType && jl40.l(this.stream, stream.stream);
    }

    public final String getStream() {
        return this.stream;
    }

    public final StreamType getStreamType() {
        return this.streamType;
    }

    public int hashCode() {
        StreamType streamType = this.streamType;
        return this.stream.hashCode() + ((streamType == null ? 0 : streamType.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Stream(streamType=");
        sb.append(this.streamType);
        sb.append(", stream=");
        return b64.p(sb, this.stream, ')');
    }
}
