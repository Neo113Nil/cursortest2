package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class xnm extends br2 {
    public final ofb c;
    public final List d;

    public xnm() {
        super(0);
        ufb.f0.getClass();
        this.c = new ofb(new nfb(tfb.b), this);
        this.d = t75.c(PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired.class);
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
        PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired preloadedLiveDashManifestInCacheExpired = (PlaybackException.ErrorGeneric.PreloadedLiveDashManifestInCacheExpired) playbackException;
        preloadedLiveDashManifestInCacheExpired.getCache().k(preloadedLiveDashManifestInCacheExpired.getManifestUri());
        return this.c;
    }

    @Override // defpackage.br2
    public final qld d() {
        return this.c;
    }

    @Override // defpackage.br2
    public final List g() {
        return this.d;
    }
}
