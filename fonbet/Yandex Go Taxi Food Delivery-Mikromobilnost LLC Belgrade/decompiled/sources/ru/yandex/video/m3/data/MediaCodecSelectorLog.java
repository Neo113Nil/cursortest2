package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001#B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "", "", "mimeType", "", "requiresSecureDecoder", "requiresTunnelingDecoder", "", "Lru/yandex/video/m3/data/CodecInfo;", "codecsInfo", "<init>", "(Ljava/lang/String;ZZLjava/util/List;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/MediaCodecSelectorLog$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getMimeType", "Z", "getRequiresSecureDecoder", "()Z", "getRequiresTunnelingDecoder", "Ljava/util/List;", "getCodecsInfo", "()Ljava/util/List;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaCodecSelectorLog {
    public static final int $stable = 8;
    private final List<CodecInfo> codecsInfo;
    private final String mimeType;
    private final boolean requiresSecureDecoder;
    private final boolean requiresTunnelingDecoder;

    private MediaCodecSelectorLog(String str, boolean z, boolean z2, List<CodecInfo> list) {
        this.mimeType = str;
        this.requiresSecureDecoder = z;
        this.requiresTunnelingDecoder = z2;
        this.codecsInfo = list;
    }

    public static /* synthetic */ MediaCodecSelectorLog copy$default(MediaCodecSelectorLog mediaCodecSelectorLog, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.MediaCodecSelectorLog$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaCodecSelectorLog.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaCodecSelectorLog.Builder builder) {
                }
            };
        }
        return mediaCodecSelectorLog.copy(tlsVar);
    }

    public final MediaCodecSelectorLog copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MediaCodecSelectorLog.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        MediaCodecSelectorLog mediaCodecSelectorLog = (MediaCodecSelectorLog) other;
        return this.requiresSecureDecoder == mediaCodecSelectorLog.requiresSecureDecoder && this.requiresTunnelingDecoder == mediaCodecSelectorLog.requiresTunnelingDecoder && jl40.l(this.mimeType, mediaCodecSelectorLog.mimeType) && jl40.l(this.codecsInfo, mediaCodecSelectorLog.codecsInfo);
    }

    public final List<CodecInfo> getCodecsInfo() {
        return this.codecsInfo;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final boolean getRequiresSecureDecoder() {
        return this.requiresSecureDecoder;
    }

    public final boolean getRequiresTunnelingDecoder() {
        return this.requiresTunnelingDecoder;
    }

    public int hashCode() {
        return this.codecsInfo.hashCode() + unr0.b(unr0.e(Boolean.hashCode(this.requiresSecureDecoder) * 31, 31, this.requiresTunnelingDecoder), 31, this.mimeType);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaCodecSelectorLog(mimeType='");
        sb.append(this.mimeType);
        sb.append("', requiresSecureDecoder=");
        sb.append(this.requiresSecureDecoder);
        sb.append(", requiresTunnelingDecoder=");
        sb.append(this.requiresTunnelingDecoder);
        sb.append(", codecsInfo=");
        return unr0.t(sb, this.codecsInfo, ')');
    }

    public /* synthetic */ MediaCodecSelectorLog(String str, boolean z, boolean z2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, list);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\r\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001dR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/data/MediaCodecSelectorLog$Builder;", "", "mediaCodecSelectorLog", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "(Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "mimeType", "", "requiresSecureDecoder", "", "requiresTunnelingDecoder", "codecsInfo", "", "Lru/yandex/video/m3/data/CodecInfo;", "(Ljava/lang/String;ZZLjava/util/List;)V", "getCodecsInfo", "()Ljava/util/List;", "setCodecsInfo", "(Ljava/util/List;)V", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "getRequiresSecureDecoder", "()Z", "setRequiresSecureDecoder", "(Z)V", "getRequiresTunnelingDecoder", "setRequiresTunnelingDecoder", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private List<CodecInfo> codecsInfo;
        private String mimeType;
        private boolean requiresSecureDecoder;
        private boolean requiresTunnelingDecoder;

        public Builder(MediaCodecSelectorLog mediaCodecSelectorLog) {
            this(mediaCodecSelectorLog.getMimeType(), mediaCodecSelectorLog.getRequiresSecureDecoder(), mediaCodecSelectorLog.getRequiresTunnelingDecoder(), mediaCodecSelectorLog.getCodecsInfo());
        }

        public final MediaCodecSelectorLog build$video_player_internalRelease() {
            return new MediaCodecSelectorLog(this.mimeType, this.requiresSecureDecoder, this.requiresTunnelingDecoder, this.codecsInfo, null);
        }

        public final List<CodecInfo> getCodecsInfo() {
            return this.codecsInfo;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final boolean getRequiresSecureDecoder() {
            return this.requiresSecureDecoder;
        }

        public final boolean getRequiresTunnelingDecoder() {
            return this.requiresTunnelingDecoder;
        }

        public final void setCodecsInfo(List<CodecInfo> list) {
            this.codecsInfo = list;
        }

        public final void setMimeType(String str) {
            this.mimeType = str;
        }

        public final void setRequiresSecureDecoder(boolean z) {
            this.requiresSecureDecoder = z;
        }

        public final void setRequiresTunnelingDecoder(boolean z) {
            this.requiresTunnelingDecoder = z;
        }

        public Builder(String str, boolean z, boolean z2, List<CodecInfo> list) {
            this.mimeType = str;
            this.requiresSecureDecoder = z;
            this.requiresTunnelingDecoder = z2;
            this.codecsInfo = list;
        }
    }
}
