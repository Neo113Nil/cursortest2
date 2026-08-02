package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.RepeatMode$Fixed;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class tsb implements f8l {
    public final i8l a;
    public final le3 b;
    public final yjj c;
    public final AtomicReference d;

    public tsb(ExoPlayer exoPlayer, le3 le3Var, yjj yjjVar) {
        exoPlayer.getClass();
        this.a = exoPlayer;
        this.b = le3Var;
        this.c = yjjVar;
        this.d = new AtomicReference(fyn.a);
    }

    @Override // defpackage.f8l
    public final void I(int i, onh onhVar) {
        HashSet u0;
        Object t7oVar;
        if (i == 0) {
            iyn iynVar = (iyn) this.d.get();
            if (iynVar instanceof RepeatMode$Fixed) {
                RepeatMode$Fixed repeatMode$Fixed = (RepeatMode$Fixed) iynVar;
                int i2 = 1;
                RepeatMode$Fixed copy$default = RepeatMode$Fixed.copy$default(repeatMode$Fixed, 0, repeatMode$Fixed.getWatched() + 1, repeatMode$Fixed.getCount() == repeatMode$Fixed.getWatched() + 1, 1, null);
                this.d.set(copy$default);
                if (copy$default.isFinished()) {
                    this.b.l(new ypb(i2, this));
                }
            }
            yjj yjjVar = this.c;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).q();
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }
}
