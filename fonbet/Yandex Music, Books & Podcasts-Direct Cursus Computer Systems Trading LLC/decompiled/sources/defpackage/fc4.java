package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class fc4 extends br2 {
    public final ofb c;
    public final List d;

    public fc4() {
        super(Integer.MAX_VALUE);
        ufb.f0.getClass();
        this.c = new ofb(new nfb(tfb.b), this);
        this.d = u75.h(PlaybackException.AdaptationSetsCountChanged.class, PlaybackException.RepresentationCountChanged.class);
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
