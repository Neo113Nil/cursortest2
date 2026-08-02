package ru.yandex.video.m3.data;

import defpackage.tls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/data/AdMetadata;", "", "", "", "messages", "<init>", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/AdMetadata$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/AdMetadata;", "Ljava/util/List;", "getMessages", "()Ljava/util/List;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdMetadata {
    public static final int $stable = 8;
    private final List<String> messages;

    private AdMetadata(List<String> list) {
        this.messages = list;
    }

    public final AdMetadata copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final List<String> getMessages() {
        return this.messages;
    }

    public /* synthetic */ AdMetadata(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\r\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/data/AdMetadata$Builder;", "", "adMetadata", "Lru/yandex/video/m3/data/AdMetadata;", "(Lru/yandex/video/m3/data/AdMetadata;)V", "messages", "", "", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "setMessages", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private List<String> messages;

        public Builder(AdMetadata adMetadata) {
            this(adMetadata.getMessages());
        }

        public final AdMetadata build$video_player_internalRelease() {
            return new AdMetadata(this.messages, null);
        }

        public final List<String> getMessages() {
            return this.messages;
        }

        public final void setMessages(List<String> list) {
            this.messages = list;
        }

        public Builder(List<String> list) {
            this.messages = list;
        }
    }
}
