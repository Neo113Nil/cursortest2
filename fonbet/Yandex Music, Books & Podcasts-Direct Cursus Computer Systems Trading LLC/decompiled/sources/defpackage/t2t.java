package defpackage;

import ru.yandex.video.m3.ott.impl.TrackingEventType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;

/* loaded from: classes6.dex */
public final class t2t implements u9l {
    public final /* synthetic */ v2t a;

    public t2t(v2t v2tVar) {
        this.a = v2tVar;
    }

    @Override // defpackage.u9l
    public final void j0(FullscreenDataBundle fullscreenDataBundle) {
        fullscreenDataBundle.getClass();
        Boolean isFullscreenExternal = fullscreenDataBundle.getIsFullscreenExternal();
        boolean booleanValue = isFullscreenExternal != null ? isFullscreenExternal.booleanValue() : false;
        v2t v2tVar = this.a;
        v2tVar.r = booleanValue;
        q2t q2tVar = v2tVar.j;
        if (q2tVar != null) {
            q2tVar.h = booleanValue;
        }
    }

    @Override // defpackage.u9l
    public final void n0(PlaybackException playbackException) {
        v2t v2tVar = this.a;
        q2t q2tVar = v2tVar.j;
        v2tVar.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.PLAYER_ERROR, wgb.a(playbackException), null, 12) : null);
    }
}
