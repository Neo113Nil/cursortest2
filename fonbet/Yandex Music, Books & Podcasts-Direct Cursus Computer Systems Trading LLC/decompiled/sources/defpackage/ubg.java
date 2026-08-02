package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class ubg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wbg b;

    public /* synthetic */ ubg(wbg wbgVar, int i) {
        this.a = i;
        this.b = wbgVar;
    }

    private final void a() {
        HashSet u0;
        Object t7oVar;
        wbg wbgVar = this.b;
        qdc qdcVar = wbgVar.c;
        String str = wbgVar.d;
        imh d = wbgVar.a.d();
        qdcVar.H(str, "onPlaybackEnded", String.valueOf(d != null ? d.d : null), new Object[0]);
        yjj yjjVar = wbgVar.a.o;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((r9g) next).e();
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

    private final void b() {
        HashSet u0;
        Object t7oVar;
        wbg wbgVar = this.b;
        qdc qdcVar = wbgVar.c;
        String str = wbgVar.d;
        imh d = wbgVar.a.d();
        qdcVar.H(str, "onPausePlayback", String.valueOf(d != null ? d.d : null), new Object[0]);
        yjj yjjVar = wbgVar.a.o;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((r9g) next).getClass();
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

    private final void c() {
        HashSet u0;
        Object t7oVar;
        wbg wbgVar = this.b;
        qdc qdcVar = wbgVar.c;
        String str = wbgVar.d;
        imh d = wbgVar.a.d();
        qdcVar.H(str, "onReadyForFirstPlayback", String.valueOf(d != null ? d.d : null), new Object[0]);
        if (wbgVar.a.e()) {
            acg acgVar = wbgVar.a;
            acgVar.t = true;
            acgVar.k();
            qdc qdcVar2 = wbgVar.c;
            String str2 = wbgVar.d;
            StringBuilder sb = new StringBuilder();
            imh d2 = wbgVar.a.d();
            qdcVar2.H(str2, "onReadyForFirstPlayback", su4.o(sb, d2 != null ? d2.d : null, " notify"), new Object[0]);
            yjj yjjVar = wbgVar.a.o;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((r9g) next).v();
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

    @Override // java.lang.Runnable
    public final void run() {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        HashSet u03;
        Object t7oVar3;
        HashSet u04;
        Object t7oVar4;
        switch (this.a) {
            case 0:
                yjj yjjVar = this.b.a.o;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((r9g) next).getClass();
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
                return;
            case 1:
                yjj yjjVar2 = this.b.a.o;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it2 = u02.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    try {
                        r7o r7oVar3 = z7o.b;
                        ((r9g) next2).getClass();
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
                return;
            case 2:
                yjj yjjVar3 = this.b.a.o;
                synchronized (yjjVar3.a) {
                    u03 = CollectionsKt.u0(yjjVar3.a);
                }
                Iterator it3 = u03.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    try {
                        r7o r7oVar5 = z7o.b;
                        ((r9g) next3).getClass();
                        t7oVar3 = Unit.a;
                    } catch (Throwable th3) {
                        r7o r7oVar6 = z7o.b;
                        t7oVar3 = new t7o(th3);
                    }
                    Throwable a3 = z7o.a(t7oVar3);
                    if (a3 != null) {
                        Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                    }
                }
                return;
            case 3:
                wbg wbgVar = this.b;
                qdc qdcVar = wbgVar.c;
                String str = wbgVar.d;
                acg acgVar = wbgVar.a;
                imh d = acgVar.d();
                qdcVar.H(str, "onLoadingStart", String.valueOf(d != null ? d.d : null), new Object[0]);
                acgVar.j();
                acgVar.C = true;
                return;
            case 4:
                wbg wbgVar2 = this.b;
                qdc qdcVar2 = wbgVar2.c;
                String str2 = wbgVar2.d;
                acg acgVar2 = wbgVar2.a;
                imh d2 = acgVar2.d();
                qdcVar2.H(str2, "onLoadingFinished", String.valueOf(d2 != null ? d2.d : null), new Object[0]);
                acgVar2.C = false;
                acgVar2.k();
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                c();
                return;
            default:
                wbg wbgVar3 = this.b;
                qdc qdcVar3 = wbgVar3.c;
                String str3 = wbgVar3.d;
                StringBuilder sb = new StringBuilder();
                imh d3 = wbgVar3.a.d();
                sb.append(d3 != null ? d3.d : null);
                sb.append(" position=");
                acg acgVar3 = wbgVar3.a;
                y7g.Y(false, acgVar3.a);
                paw pawVar = acgVar3.j;
                sb.append(pawVar != null ? pawVar.getPosition() : 0L);
                qdcVar3.H(str3, "onResumePlayback", sb.toString(), new Object[0]);
                yjj yjjVar4 = wbgVar3.a.o;
                synchronized (yjjVar4.a) {
                    u04 = CollectionsKt.u0(yjjVar4.a);
                }
                Iterator it4 = u04.iterator();
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    try {
                        r7o r7oVar7 = z7o.b;
                        ((r9g) next4).a();
                        t7oVar4 = Unit.a;
                    } catch (Throwable th4) {
                        r7o r7oVar8 = z7o.b;
                        t7oVar4 = new t7o(th4);
                    }
                    Throwable a4 = z7o.a(t7oVar4);
                    if (a4 != null) {
                        Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                    }
                }
                return;
        }
    }

    public /* synthetic */ ubg(wbg wbgVar, long j, int i) {
        this.a = i;
        this.b = wbgVar;
    }
}
