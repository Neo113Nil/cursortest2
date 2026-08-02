package defpackage;

import java.util.List;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class n6w extends br2 {
    public final List c;
    public final rfb d;

    public n6w() {
        super(Integer.MAX_VALUE);
        this.c = t75.c(PlaybackException.WrongCallbackThread.class);
        this.d = new rfb("This error's purpose is internal debug");
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
