package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class t7j extends br2 implements rgl {
    public final List c;
    public final ofb d;

    public t7j() {
        super(1);
        this.c = u75.h(PlaybackException.ErrorNoPrepare.class, PlaybackException.ErrorPlaylistReset.class, PlaybackException.ErrorPlaylistStuck.class);
        ufb.f0.getClass();
        this.d = new ofb(new nfb(tfb.c), this);
    }

    @Override // defpackage.rgl
    public final void a() {
        this.b.set(0);
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
