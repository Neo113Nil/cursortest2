package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class fu3 extends br2 {
    public final List c;
    public final rfb d;

    public fu3() {
        super(Integer.MAX_VALUE);
        this.c = t75.c(PlaybackException.Cancellation.class);
        this.d = new rfb("Encountered CancellationException");
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
