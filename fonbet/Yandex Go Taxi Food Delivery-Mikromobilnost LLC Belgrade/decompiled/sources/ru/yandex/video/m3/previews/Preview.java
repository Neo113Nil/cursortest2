package ru.yandex.video.m3.previews;

import defpackage.b64;
import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.previews.Preview;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001&B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/yandex/video/m3/previews/Preview;", "", "Lru/yandex/video/m3/previews/Type;", "type", "", "url", "Lru/yandex/video/m3/previews/RelativeCropRect;", "relativeCropRect", "", "timelinePositionMs", "<init>", "(Lru/yandex/video/m3/previews/Type;Ljava/lang/String;Lru/yandex/video/m3/previews/RelativeCropRect;J)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/previews/Preview$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/previews/Preview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/previews/Type;", "getType", "()Lru/yandex/video/m3/previews/Type;", "Ljava/lang/String;", "getUrl", "Lru/yandex/video/m3/previews/RelativeCropRect;", "getRelativeCropRect", "()Lru/yandex/video/m3/previews/RelativeCropRect;", "J", "getTimelinePositionMs", "()J", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Preview {
    public static final int $stable = 0;
    private final RelativeCropRect relativeCropRect;
    private final long timelinePositionMs;
    private final Type type;
    private final String url;

    private Preview(Type type, String str, RelativeCropRect relativeCropRect, long j) {
        this.type = type;
        this.url = str;
        this.relativeCropRect = relativeCropRect;
        this.timelinePositionMs = j;
    }

    public static /* synthetic */ Preview copy$default(Preview preview, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.previews.Preview$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Preview.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(Preview.Builder builder) {
                }
            };
        }
        return preview.copy(tlsVar);
    }

    public final Preview copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Preview.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Preview preview = (Preview) other;
        return this.type == preview.type && jl40.l(this.url, preview.url) && jl40.l(this.relativeCropRect, preview.relativeCropRect) && this.timelinePositionMs == preview.timelinePositionMs;
    }

    public final RelativeCropRect getRelativeCropRect() {
        return this.relativeCropRect;
    }

    public final long getTimelinePositionMs() {
        return this.timelinePositionMs;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Long.hashCode(this.timelinePositionMs) + ((this.relativeCropRect.hashCode() + unr0.b(this.type.hashCode() * 31, 31, this.url)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Preview(type=");
        sb.append(this.type);
        sb.append(", url='");
        sb.append(this.url);
        sb.append("', relativeCropRect=");
        sb.append(this.relativeCropRect);
        sb.append(", timelinePosition=");
        return b64.o(sb, this.timelinePositionMs, ')');
    }

    public /* synthetic */ Preview(Type type, String str, RelativeCropRect relativeCropRect, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, relativeCropRect, j);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/yandex/video/m3/previews/Preview$Builder;", "", "preview", "Lru/yandex/video/m3/previews/Preview;", "(Lru/yandex/video/m3/previews/Preview;)V", "type", "Lru/yandex/video/m3/previews/Type;", "url", "", "relativeCropRect", "Lru/yandex/video/m3/previews/RelativeCropRect;", "(Lru/yandex/video/m3/previews/Type;Ljava/lang/String;Lru/yandex/video/m3/previews/RelativeCropRect;)V", "getRelativeCropRect", "()Lru/yandex/video/m3/previews/RelativeCropRect;", "setRelativeCropRect", "(Lru/yandex/video/m3/previews/RelativeCropRect;)V", "timelinePositionMs", "", "getTimelinePositionMs", "()Ljava/lang/Long;", "setTimelinePositionMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getType", "()Lru/yandex/video/m3/previews/Type;", "setType", "(Lru/yandex/video/m3/previews/Type;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private RelativeCropRect relativeCropRect;
        private Long timelinePositionMs;
        private Type type;
        private String url;

        public Builder(Preview preview) {
            this(preview.getType(), preview.getUrl(), preview.getRelativeCropRect());
            this.timelinePositionMs = this.timelinePositionMs;
        }

        public final Preview build$video_player_internalRelease() {
            Type type = this.type;
            String str = this.url;
            RelativeCropRect relativeCropRect = this.relativeCropRect;
            Long l = this.timelinePositionMs;
            return new Preview(type, str, relativeCropRect, l != null ? l.longValue() : Long.MIN_VALUE, null);
        }

        public final RelativeCropRect getRelativeCropRect() {
            return this.relativeCropRect;
        }

        public final Long getTimelinePositionMs() {
            return this.timelinePositionMs;
        }

        public final Type getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final void setRelativeCropRect(RelativeCropRect relativeCropRect) {
            this.relativeCropRect = relativeCropRect;
        }

        public final void setTimelinePositionMs(Long l) {
            this.timelinePositionMs = l;
        }

        public final void setType(Type type) {
            this.type = type;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public Builder(Type type, String str, RelativeCropRect relativeCropRect) {
            this.type = type;
            this.url = str;
            this.relativeCropRect = relativeCropRect;
        }
    }
}
