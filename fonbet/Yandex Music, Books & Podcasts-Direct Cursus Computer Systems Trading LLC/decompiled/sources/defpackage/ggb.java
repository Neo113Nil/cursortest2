package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ggb implements rgl {
    public final yjj a;

    public ggb(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                taw tawVar = (taw) next;
                String a = wgb.a(playbackException);
                tawVar.getClass();
                xdr xdrVar = tawVar.o;
                xdrVar.getClass();
                xdrVar.m(null, a);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a2 = z7o.a(t7oVar);
            if (a2 != null) {
                Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
            }
        }
    }
}
