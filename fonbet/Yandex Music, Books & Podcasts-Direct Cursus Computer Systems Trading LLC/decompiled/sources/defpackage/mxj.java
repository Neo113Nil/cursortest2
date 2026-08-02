package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class mxj extends br2 {
    public final List c;
    public final ofb d;

    public mxj() {
        super(Integer.MAX_VALUE);
        this.c = u75.h(PlaybackException.ErrorBehindLiveWindow.class, PlaybackException.HLSLiveRequestsStartOutOfLiveWindow.class);
        ufb.f0.getClass();
        this.d = new ofb(new nfb(tfb.b), this);
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
