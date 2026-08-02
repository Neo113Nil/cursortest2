package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class eph extends br2 implements rgl {
    public final List c;
    public final ofb d;

    public eph() {
        super(2);
        this.c = t75.c(PlaybackException.DrmThrowable.MediaResourceBusy.class);
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
