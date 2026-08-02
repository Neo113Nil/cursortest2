package ru.yandex.video.m3.ab;

import defpackage.bvf0;
import defpackage.n4u0;
import defpackage.pz40;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.player.PlayerObserver;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/ab/PlayerLifecycleObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "<init>", "()V", "Lzy11;", "onResumePlayback", "onStopPlayback", "onPlayerReleased", "Lpz40;", "", "_isAliveFlow", "Lpz40;", "Ln4u0;", "isAliveFlow", "Ln4u0;", "isAliveFlow$video_player_internalRelease", "()Ln4u0;", "_isReleasedFlow", "isReleasedFlow", "isReleasedFlow$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerLifecycleObserver implements PlayerObserver<Object> {
    public static final int $stable = 8;
    private final pz40 _isAliveFlow;
    private final pz40 _isReleasedFlow;
    private final n4u0 isAliveFlow;
    private final n4u0 isReleasedFlow;

    public PlayerLifecycleObserver() {
        Boolean bool = Boolean.FALSE;
        r0 c = bvf0.c(bool);
        this._isAliveFlow = c;
        this.isAliveFlow = e.d(c);
        r0 c2 = bvf0.c(bool);
        this._isReleasedFlow = c2;
        this.isReleasedFlow = e.d(c2);
    }

    /* renamed from: isAliveFlow$video_player_internalRelease, reason: from getter */
    public final n4u0 getIsAliveFlow() {
        return this.isAliveFlow;
    }

    /* renamed from: isReleasedFlow$video_player_internalRelease, reason: from getter */
    public final n4u0 getIsReleasedFlow() {
        return this.isReleasedFlow;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlayerReleased() {
        pz40 pz40Var = this._isAliveFlow;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
        pz40 pz40Var2 = this._isReleasedFlow;
        Boolean bool2 = Boolean.TRUE;
        r0 r0Var2 = (r0) pz40Var2;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onResumePlayback() {
        pz40 pz40Var = this._isAliveFlow;
        Boolean bool = Boolean.TRUE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onStopPlayback() {
        pz40 pz40Var = this._isAliveFlow;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
