package ru.yandex.video.m3.data;

import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001$B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#¨\u0006%"}, d2 = {"Lru/yandex/video/m3/data/Ad;", "", "Lru/yandex/video/m3/data/AdType;", "type", "", "adPodCount", "", "position", "", "isPlayed", "<init>", "(Lru/yandex/video/m3/data/AdType;IJZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/Ad$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/Ad;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/data/AdType;", "getType", "()Lru/yandex/video/m3/data/AdType;", CA20Status.STATUS_USER_I, "getAdPodCount", "J", "getPosition", "()J", "Z", "()Z", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Ad {
    public static final int $stable = 0;
    private final int adPodCount;
    private final boolean isPlayed;
    private final long position;
    private final AdType type;

    private Ad(AdType adType, int i, long j, boolean z) {
        this.type = adType;
        this.adPodCount = i;
        this.position = j;
        this.isPlayed = z;
    }

    public static /* synthetic */ Ad copy$default(Ad ad, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.Ad$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Ad.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(Ad.Builder builder) {
                }
            };
        }
        return ad.copy(tlsVar);
    }

    public final Ad copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Ad.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Ad ad = (Ad) other;
        return this.adPodCount == ad.adPodCount && this.position == ad.position && this.isPlayed == ad.isPlayed && this.type == ad.type;
    }

    public final int getAdPodCount() {
        return this.adPodCount;
    }

    public final long getPosition() {
        return this.position;
    }

    public final AdType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + unr0.e(qv10.c(this.adPodCount * 31, 31, this.position), 31, this.isPlayed);
    }

    /* renamed from: isPlayed, reason: from getter */
    public final boolean getIsPlayed() {
        return this.isPlayed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ad(type=");
        sb.append(this.type);
        sb.append(", adPodCount=");
        sb.append(this.adPodCount);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", isPlayed=");
        return unr0.u(sb, this.isPlayed, ')');
    }

    public /* synthetic */ Ad(AdType adType, int i, long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(adType, i, j, z);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\r\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/data/Ad$Builder;", "", "ad", "Lru/yandex/video/m3/data/Ad;", "(Lru/yandex/video/m3/data/Ad;)V", "type", "Lru/yandex/video/m3/data/AdType;", "adPodCount", "", "position", "", "isPlayed", "", "(Lru/yandex/video/m3/data/AdType;IJZ)V", "getAdPodCount", "()I", "setAdPodCount", "(I)V", "()Z", "setPlayed", "(Z)V", "getPosition", "()J", "setPosition", "(J)V", "getType", "()Lru/yandex/video/m3/data/AdType;", "setType", "(Lru/yandex/video/m3/data/AdType;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private int adPodCount;
        private boolean isPlayed;
        private long position;
        private AdType type;

        public Builder(Ad ad) {
            this(ad.getType(), ad.getAdPodCount(), ad.getPosition(), ad.getIsPlayed());
        }

        public final Ad build$video_player_internalRelease() {
            return new Ad(this.type, this.adPodCount, this.position, this.isPlayed, null);
        }

        public final int getAdPodCount() {
            return this.adPodCount;
        }

        public final long getPosition() {
            return this.position;
        }

        public final AdType getType() {
            return this.type;
        }

        /* renamed from: isPlayed, reason: from getter */
        public final boolean getIsPlayed() {
            return this.isPlayed;
        }

        public final void setAdPodCount(int i) {
            this.adPodCount = i;
        }

        public final void setPlayed(boolean z) {
            this.isPlayed = z;
        }

        public final void setPosition(long j) {
            this.position = j;
        }

        public final void setType(AdType adType) {
            this.type = adType;
        }

        public Builder(AdType adType, int i, long j, boolean z) {
            this.type = adType;
            this.adPodCount = i;
            this.position = j;
            this.isPlayed = z;
        }
    }
}
