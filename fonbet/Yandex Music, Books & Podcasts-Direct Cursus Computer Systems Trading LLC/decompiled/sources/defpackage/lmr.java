package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class lmr implements Runnable {
    public final axh a;
    public final ExoPlayer b;
    public final yjj c;
    public final jmr d;

    public lmr(axh axhVar, ExoPlayer exoPlayer, yjj yjjVar, jmr jmrVar) {
        axhVar.getClass();
        exoPlayer.getClass();
        yjjVar.getClass();
        jmrVar.getClass();
        this.a = axhVar;
        this.b = exoPlayer;
        this.c = yjjVar;
        this.d = jmrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        axh axhVar = this.a;
        axhVar.getClass();
        LoadControlState loadControlState = new LoadControlState(axhVar.k);
        axh axhVar2 = this.a;
        ndl ndlVar = ndl.d;
        mis misVar = sis.a;
        long j = 1000;
        long s0 = this.b.s0() * j;
        long w = j * this.b.w();
        float f = this.b.m().a;
        this.b.g0();
        boolean k = axhVar2.k(new geg(ndlVar, s0, w, f, false, 100500L));
        long w2 = this.b.w();
        jmr jmrVar = this.d;
        boolean z = w2 >= jmrVar.a;
        if (jmrVar.d || (jmrVar.c && k)) {
            z = false;
        }
        yjj yjjVar = this.c;
        if (z) {
            synchronized (yjjVar.a) {
                u02 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u02.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).Y(new PlaybackException.ErrorStalledStuck(new RuntimeException(String.valueOf(loadControlState)), loadControlState));
                    t7oVar2 = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar2 = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar2);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
            return;
        }
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it2 = u0.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                ((zbl) next2).X(new PlaybackException.ErrorStalledStuck(new RuntimeException(String.valueOf(loadControlState)), loadControlState));
                t7oVar = Unit.a;
            } catch (Throwable th2) {
                r7o r7oVar4 = z7o.b;
                t7oVar = new t7o(th2);
            }
            Throwable a2 = z7o.a(t7oVar);
            if (a2 != null) {
                Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
            }
        }
    }
}
