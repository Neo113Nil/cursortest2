package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.AdParameters;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/data/AdParameters;", "", "", "contentId", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/AdParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/AdParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getContentId", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdParameters {
    public static final int $stable = 0;
    private final String contentId;

    private AdParameters(String str) {
        this.contentId = str;
    }

    public static /* synthetic */ AdParameters copy$default(AdParameters adParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.AdParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AdParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AdParameters.Builder builder) {
                }
            };
        }
        return adParameters.copy(tlsVar);
    }

    public final AdParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return AdParameters.class.equals(other != null ? other.getClass() : null) && jl40.l(this.contentId, ((AdParameters) other).contentId);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public int hashCode() {
        return this.contentId.hashCode();
    }

    public String toString() {
        return oyr.t(new StringBuilder("AdParameters(contentId='"), this.contentId, "')");
    }

    public /* synthetic */ AdParameters(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/data/AdParameters$Builder;", "", "adParameters", "Lru/yandex/video/m3/data/AdParameters;", "(Lru/yandex/video/m3/data/AdParameters;)V", "contentId", "", "(Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "setContentId", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String contentId;

        public Builder(AdParameters adParameters) {
            this(adParameters.getContentId());
        }

        public final AdParameters build$video_player_internalRelease() {
            return new AdParameters(this.contentId, null);
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final void setContentId(String str) {
            this.contentId = str;
        }

        public Builder(String str) {
            this.contentId = str;
        }
    }
}
