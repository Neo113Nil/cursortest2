package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class ovc extends br2 {
    public long c;
    public final List d;
    public final rfb e;

    public ovc() {
        super(3);
        this.d = t75.c(PlaybackException.FrameDropDetected.class);
        this.e = new rfb("This code should not be called");
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
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ((PlaybackException.FrameDropDetected) playbackException).getResumePlaybackTimestamp() < 10000) {
            return new rfb("Too little time passed after last stalled to recover");
        }
        AtomicInteger atomicInteger = this.b;
        if (atomicInteger.get() >= 3) {
            return new rfb("3 attempts were already made to recover from this error");
        }
        if (currentTimeMillis - this.c < 30000) {
            return new rfb("Specified time not passed after last recover attempt");
        }
        atomicInteger.incrementAndGet();
        this.c = System.currentTimeMillis();
        ufb.f0.getClass();
        return new ofb(new nfb(tfb.c), this);
    }

    @Override // defpackage.br2
    public final qld d() {
        return this.e;
    }

    @Override // defpackage.br2
    public final List g() {
        return this.d;
    }
}
