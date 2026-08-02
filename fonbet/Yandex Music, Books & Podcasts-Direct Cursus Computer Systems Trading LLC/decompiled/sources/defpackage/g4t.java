package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class g4t implements rgl {
    public final yjj a;

    public g4t(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        HashSet u0;
        HashSet u02;
        HashSet u03;
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
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
                jsb jsbVar = (jsb) nqsVar3;
                isb b = jsbVar.b();
                TrackVariant c = jsbVar.c();
                vcu vcuVar = new vcu(c != null ? c.getTitle() : null, b != null ? Integer.valueOf(b.h) : null, new mmq(b != null ? b.f : 0, b != null ? b.g : 0));
                tawVar.getClass();
                xdr xdrVar = tawVar.e;
                xdrVar.getClass();
                xdrVar.m(null, vcuVar);
                t7oVar3 = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar3 = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar3);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
        yjj yjjVar2 = this.a;
        synchronized (yjjVar2.a) {
            u02 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it2 = u02.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                taw tawVar2 = (taw) next2;
                jsb jsbVar2 = (jsb) nqsVar;
                isb b2 = jsbVar2.b();
                TrackVariant c2 = jsbVar2.c();
                sy1 sy1Var = new sy1(c2 != null ? c2.getTitle() : null, b2 != null ? Integer.valueOf(b2.h) : null, b2 != null ? b2.d : null);
                tawVar2.getClass();
                xdr xdrVar2 = tawVar2.f;
                xdrVar2.getClass();
                xdrVar2.m(null, sy1Var);
                t7oVar2 = Unit.a;
            } catch (Throwable th2) {
                r7o r7oVar4 = z7o.b;
                t7oVar2 = new t7o(th2);
            }
            Throwable a2 = z7o.a(t7oVar2);
            if (a2 != null) {
                Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
            }
        }
        yjj yjjVar3 = this.a;
        synchronized (yjjVar3.a) {
            u03 = CollectionsKt.u0(yjjVar3.a);
        }
        Iterator it3 = u03.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            try {
                r7o r7oVar5 = z7o.b;
                taw tawVar3 = (taw) next3;
                jsb jsbVar3 = (jsb) nqsVar2;
                isb b3 = jsbVar3.b();
                TrackVariant c3 = jsbVar3.c();
                zpr zprVar = new zpr(c3 != null ? c3.getTitle() : null, b3 != null ? Integer.valueOf(b3.h) : null, b3 != null ? b3.d : null);
                tawVar3.getClass();
                xdr xdrVar3 = tawVar3.g;
                xdrVar3.getClass();
                xdrVar3.m(null, zprVar);
                t7oVar = Unit.a;
            } catch (Throwable th3) {
                r7o r7oVar6 = z7o.b;
                t7oVar = new t7o(th3);
            }
            Throwable a3 = z7o.a(t7oVar);
            if (a3 != null) {
                Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
            }
        }
    }
}
