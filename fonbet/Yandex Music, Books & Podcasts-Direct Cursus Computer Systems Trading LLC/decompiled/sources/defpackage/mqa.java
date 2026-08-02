package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class mqa extends br2 {
    public final List c;
    public final ofb d;

    public mqa() {
        super(2);
        this.c = u75.h(PlaybackException.DrmThrowable.ErrorSession.class, PlaybackException.DrmThrowable.ErrorDrmProxyConnection.class);
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
