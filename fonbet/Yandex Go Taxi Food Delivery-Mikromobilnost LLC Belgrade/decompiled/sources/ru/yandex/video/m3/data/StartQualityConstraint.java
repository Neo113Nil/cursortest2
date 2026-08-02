package ru.yandex.video.m3.data;

import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.StartQualityConstraint;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/data/StartQualityConstraint;", "", "", "maxHeight", "<init>", "(I)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/StartQualityConstraint$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/StartQualityConstraint;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getMaxHeight", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartQualityConstraint {
    public static final int $stable = 0;
    private final int maxHeight;

    private StartQualityConstraint(int i) {
        this.maxHeight = i;
    }

    public static /* synthetic */ StartQualityConstraint copy$default(StartQualityConstraint startQualityConstraint, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.StartQualityConstraint$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((StartQualityConstraint.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(StartQualityConstraint.Builder builder) {
                }
            };
        }
        return startQualityConstraint.copy(tlsVar);
    }

    public final StartQualityConstraint copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return StartQualityConstraint.class.equals(other != null ? other.getClass() : null) && this.maxHeight == ((StartQualityConstraint) other).maxHeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public int hashCode() {
        return this.maxHeight;
    }

    public String toString() {
        return oyr.s(new StringBuilder("StartQualityConstraint(maxHeight="), this.maxHeight, ')');
    }

    public /* synthetic */ StartQualityConstraint(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/data/StartQualityConstraint$Builder;", "", "startQualityConstraint", "Lru/yandex/video/m3/data/StartQualityConstraint;", "(Lru/yandex/video/m3/data/StartQualityConstraint;)V", "maxHeight", "", "(I)V", "getMaxHeight", "()I", "setMaxHeight", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private int maxHeight;

        public Builder(StartQualityConstraint startQualityConstraint) {
            this(startQualityConstraint.getMaxHeight());
        }

        public final StartQualityConstraint build$video_player_internalRelease() {
            return new StartQualityConstraint(this.maxHeight, null);
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final void setMaxHeight(int i) {
            this.maxHeight = i;
        }

        public Builder(int i) {
            this.maxHeight = i;
        }
    }
}
