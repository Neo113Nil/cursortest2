package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class xeb extends br2 {
    public final List c;
    public final ofb d;

    public xeb() {
        super(0);
        this.c = t75.c(PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest.class);
        ufb.f0.getClass();
        this.d = new ofb(new nfb(tfb.b), this);
    }

    @Override // defpackage.br2, defpackage.ufb
    public final boolean b(PlaybackException playbackException) {
        return h(playbackException);
    }

    @Override // defpackage.br2, defpackage.ufb
    public final qld c(PlaybackException playbackException) {
        if (!h(playbackException)) {
            return sfb.p;
        }
        PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest errorBehindLiveWindowFromPreloadedLiveDashManifest = (PlaybackException.ErrorGeneric.ErrorBehindLiveWindowFromPreloadedLiveDashManifest) playbackException;
        errorBehindLiveWindowFromPreloadedLiveDashManifest.getCache().k(errorBehindLiveWindowFromPreloadedLiveDashManifest.getManifestCacheKey());
        return this.d;
    }

    @Override // defpackage.br2
    public final qld d() {
        return this.d;
    }

    @Override // defpackage.br2
    public final List g() {
        return this.c;
    }
}
