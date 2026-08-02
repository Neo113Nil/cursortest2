package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public abstract class br2 implements ufb {
    public final int a;
    public final AtomicInteger b = new AtomicInteger(0);

    public br2(int i) {
        this.a = i;
    }

    @Override // defpackage.ufb
    public boolean b(PlaybackException playbackException) {
        return h(playbackException) && this.b.get() < this.a;
    }

    @Override // defpackage.ufb
    public qld c(PlaybackException playbackException) {
        if (!b(playbackException)) {
            return sfb.p;
        }
        this.b.incrementAndGet();
        return d();
    }

    public abstract qld d();

    public abstract List g();

    public final boolean h(PlaybackException playbackException) {
        List g = g();
        if ((g instanceof Collection) && g.isEmpty()) {
            return false;
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(playbackException)) {
                return true;
            }
        }
        return false;
    }
}
