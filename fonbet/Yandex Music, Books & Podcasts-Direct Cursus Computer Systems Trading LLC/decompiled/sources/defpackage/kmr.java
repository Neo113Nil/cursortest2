package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class kmr extends br2 {
    public final List c;
    public final ofb d;

    public kmr() {
        super(3);
        this.c = t75.c(PlaybackException.ErrorStalledStuck.class);
        ufb.f0.getClass();
        this.d = new ofb(new nfb(tfb.c), this);
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
