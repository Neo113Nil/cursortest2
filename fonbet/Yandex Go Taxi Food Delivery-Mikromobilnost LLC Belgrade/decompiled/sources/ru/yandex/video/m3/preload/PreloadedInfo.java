package ru.yandex.video.m3.preload;

import androidx.media3.common.a;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.preload.PreloadedInfo;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/preload/PreloadedInfo;", "", "", "index", "Landroidx/media3/common/a;", "format", "<init>", "(ILandroidx/media3/common/a;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload/PreloadedInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/preload/PreloadedInfo;", CA20Status.STATUS_USER_I, "getIndex", "()I", "Landroidx/media3/common/a;", "getFormat", "()Landroidx/media3/common/a;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadedInfo {
    public static final int $stable = 8;
    private final a format;
    private final int index;

    private PreloadedInfo(int i, a aVar) {
        this.index = i;
        this.format = aVar;
    }

    public static /* synthetic */ PreloadedInfo copy$default(PreloadedInfo preloadedInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload.PreloadedInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreloadedInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreloadedInfo.Builder builder) {
                }
            };
        }
        return preloadedInfo.copy(tlsVar);
    }

    public final PreloadedInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final a getFormat() {
        return this.format;
    }

    public final int getIndex() {
        return this.index;
    }

    public /* synthetic */ PreloadedInfo(int i, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, aVar);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/preload/PreloadedInfo$Builder;", "", "", "index", "Landroidx/media3/common/a;", "format", "<init>", "(ILandroidx/media3/common/a;)V", "Lru/yandex/video/m3/preload/PreloadedInfo;", "preloadedInfo", "(Lru/yandex/video/m3/preload/PreloadedInfo;)V", "build$video_player_internalRelease", "()Lru/yandex/video/m3/preload/PreloadedInfo;", "build", CA20Status.STATUS_USER_I, "getIndex", "()I", "setIndex", "(I)V", "Landroidx/media3/common/a;", "getFormat", "()Landroidx/media3/common/a;", "setFormat", "(Landroidx/media3/common/a;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private a format;
        private int index;

        public Builder(PreloadedInfo preloadedInfo) {
            this(preloadedInfo.getIndex(), preloadedInfo.getFormat());
        }

        public final PreloadedInfo build$video_player_internalRelease() {
            return new PreloadedInfo(this.index, this.format, null);
        }

        public final a getFormat() {
            return this.format;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setFormat(a aVar) {
            this.format = aVar;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public Builder(int i, a aVar) {
            this.index = i;
            this.format = aVar;
        }
    }
}
