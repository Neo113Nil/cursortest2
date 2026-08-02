package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class s3t implements f8l {
    public final ct7 a;
    public final yjj b;
    public e3t c;

    public s3t(gsa gsaVar, ct7 ct7Var, yjj yjjVar) {
        ct7Var.getClass();
        this.a = ct7Var;
        this.b = yjjVar;
    }

    @Override // defpackage.f8l
    public final void M(e3t e3tVar) {
        HashSet u0;
        HashSet u02;
        Object t7oVar;
        HashSet u03;
        Object t7oVar2;
        Object t7oVar3;
        e3tVar.getClass();
        qah qahVar = this.a.c;
        yjj yjjVar = this.b;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).S();
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
        if (e3tVar != this.c) {
            qah qahVar2 = this.a.c;
            if (qahVar2 != null) {
                if (qahVar2.a(2) == 1) {
                    yjj yjjVar2 = this.b;
                    synchronized (yjjVar2.a) {
                        u03 = CollectionsKt.u0(yjjVar2.a);
                    }
                    Iterator it2 = u03.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        try {
                            r7o r7oVar3 = z7o.b;
                            ((zbl) next2).u(TrackType.Video, p1g.H(this.a, e3tVar));
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
                }
                if (qahVar2.a(1) == 1) {
                    yjj yjjVar3 = this.b;
                    synchronized (yjjVar3.a) {
                        u02 = CollectionsKt.u0(yjjVar3.a);
                    }
                    Iterator it3 = u02.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        try {
                            r7o r7oVar5 = z7o.b;
                            ((zbl) next3).u(TrackType.Audio, p1g.H(this.a, e3tVar));
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
            this.c = e3tVar;
        }
    }
}
