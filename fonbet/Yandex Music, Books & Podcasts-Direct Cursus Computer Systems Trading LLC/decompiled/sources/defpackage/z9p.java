package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class z9p extends br2 {
    public final List c;
    public final ofb d;

    public z9p() {
        super(Integer.MAX_VALUE);
        this.c = t75.c(PlaybackException.ErrorSeekPosition.class);
        this.d = new ofb(mfb.m, this);
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
