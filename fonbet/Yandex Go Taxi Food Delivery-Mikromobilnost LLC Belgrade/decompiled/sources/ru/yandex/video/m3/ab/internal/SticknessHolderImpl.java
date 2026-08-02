package ru.yandex.video.m3.ab.internal;

import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.noh;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/ab/internal/SticknessHolderImpl;", "Lru/yandex/video/m3/ab/internal/SticknessHolder;", "", "sticknessTestid", "<init>", "(I)V", "", "testids", "Lzy11;", "onTestidsUpdated$video_player_internalRelease", "(Ljava/util/List;)V", "onTestidsUpdated", CA20Status.STATUS_USER_I, "Leyc;", "_sticknessAccomplished", "Leyc;", "Lnoh;", "getSticknessAccomplished", "()Lnoh;", "sticknessAccomplished", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SticknessHolderImpl implements SticknessHolder {
    public static final int $stable = 8;
    private final eyc _sticknessAccomplished = gwk0.b();
    private final int sticknessTestid;

    public SticknessHolderImpl(int i) {
        this.sticknessTestid = i;
    }

    @Override // ru.yandex.video.m3.ab.internal.SticknessHolder
    public noh getSticknessAccomplished() {
        return this._sticknessAccomplished;
    }

    public final void onTestidsUpdated$video_player_internalRelease(List<Integer> testids) {
        if (testids.contains(Integer.valueOf(this.sticknessTestid))) {
            ((fyc) this._sticknessAccomplished).T(zy11.a);
        }
    }
}
