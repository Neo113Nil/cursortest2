package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class fgg implements u9l {
    public final yjj a;
    public rn3 b = new rn3();

    public fgg(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.u9l
    public final void B(long j, long j2) {
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
                long currentTimeMillis = System.currentTimeMillis();
                tawVar.getClass();
                cgg cggVar = new cgg(currentTimeMillis, true);
                xdr xdrVar = tawVar.l;
                xdrVar.getClass();
                xdrVar.m(null, cggVar);
                tawVar.t.add(cggVar);
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

    @Override // defpackage.u9l
    public final void G(long j, TrackType trackType) {
        rn3 a;
        HashSet u0;
        Object t7oVar;
        int i = trackType == null ? -1 : egg.a[trackType.ordinal()];
        if (i != 1) {
            a = this.b;
            if (i == 2) {
                a = rn3.a(a, 0L, 0L, a.c + j, 0L, 11);
            } else if (i == 3) {
                a = rn3.a(a, 0L, 0L, 0L, a.d + j, 7);
            }
        } else {
            rn3 rn3Var = this.b;
            a = rn3.a(rn3Var, 0L, rn3Var.b + j, 0L, 0L, 13);
        }
        this.b = a;
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
                rn3 rn3Var2 = this.b;
                tawVar.getClass();
                rn3Var2.getClass();
                xdr xdrVar = tawVar.m;
                xdrVar.getClass();
                xdrVar.m(null, rn3Var2);
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

    @Override // defpackage.u9l
    public final void I(LoadError loadError) {
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
                long currentTimeMillis = System.currentTimeMillis();
                tawVar.getClass();
                cgg cggVar = new cgg(currentTimeMillis, false);
                xdr xdrVar = tawVar.l;
                xdrVar.getClass();
                xdrVar.m(null, cggVar);
                tawVar.t.add(cggVar);
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

    @Override // defpackage.u9l
    public final void c(int i, long j, long j2) {
        HashSet u0;
        Object t7oVar;
        rn3 rn3Var = this.b;
        this.b = rn3.a(rn3Var, rn3Var.a + j, 0L, 0L, 0L, 14);
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
                rn3 rn3Var2 = this.b;
                tawVar.getClass();
                rn3Var2.getClass();
                xdr xdrVar = tawVar.m;
                xdrVar.getClass();
                xdrVar.m(null, rn3Var2);
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
