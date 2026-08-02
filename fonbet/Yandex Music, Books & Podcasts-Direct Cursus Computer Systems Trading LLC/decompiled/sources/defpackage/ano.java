package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class ano implements o6a {
    public final ArrayList a;

    public ano(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.a = arrayList;
    }

    public final void a() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).a();
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
        arrayList.clear();
    }

    public final void b(r7b r7bVar, m4a m4aVar, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).b(r7bVar, m4aVar, arrayList);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }

    public final void c(r7b r7bVar, t5a t5aVar, ArrayList arrayList, CancellationException cancellationException) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).c(r7bVar, t5aVar, arrayList, cancellationException);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }

    public final void d(r7b r7bVar, t5a t5aVar, Throwable th, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).d(r7bVar, t5aVar, th, arrayList);
            } catch (Throwable th2) {
                Timber.INSTANCE.e(th2);
            }
        }
    }

    public final void e(r7b r7bVar, t5a t5aVar, m4a m4aVar, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).e(r7bVar, t5aVar, m4aVar, arrayList);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }

    public final void f(q2a q2aVar, t5a t5aVar, r7b r7bVar, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).f(q2aVar, t5aVar, r7bVar, arrayList);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }

    public final void g(r7b r7bVar, t5a t5aVar, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).g(r7bVar, t5aVar, arrayList);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }

    public final void h(r7b r7bVar, t5a t5aVar, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).h(r7bVar, t5aVar, arrayList);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }

    public final void i(r7b r7bVar, t5a t5aVar, m4a m4aVar, long j, ArrayList arrayList) {
        r7b r7bVar2;
        t5a t5aVar2;
        m4a m4aVar2;
        long j2;
        ArrayList arrayList2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                r7bVar2 = r7bVar;
                t5aVar2 = t5aVar;
                m4aVar2 = m4aVar;
                j2 = j;
                arrayList2 = arrayList;
                try {
                    ((ano) ((o6a) it.next())).i(r7bVar2, t5aVar2, m4aVar2, j2, arrayList2);
                } catch (Throwable th) {
                    th = th;
                    Timber.INSTANCE.e(th);
                    r7bVar = r7bVar2;
                    t5aVar = t5aVar2;
                    m4aVar = m4aVar2;
                    j = j2;
                    arrayList = arrayList2;
                }
            } catch (Throwable th2) {
                th = th2;
                r7bVar2 = r7bVar;
                t5aVar2 = t5aVar;
                m4aVar2 = m4aVar;
                j2 = j;
                arrayList2 = arrayList;
            }
            r7bVar = r7bVar2;
            t5aVar = t5aVar2;
            m4aVar = m4aVar2;
            j = j2;
            arrayList = arrayList2;
        }
    }

    public final void j(r7b r7bVar, t5a t5aVar, q2a q2aVar, long j, ArrayList arrayList) {
        r7b r7bVar2;
        t5a t5aVar2;
        q2a q2aVar2;
        long j2;
        ArrayList arrayList2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                r7bVar2 = r7bVar;
                t5aVar2 = t5aVar;
                q2aVar2 = q2aVar;
                j2 = j;
                arrayList2 = arrayList;
                try {
                    ((ano) ((o6a) it.next())).j(r7bVar2, t5aVar2, q2aVar2, j2, arrayList2);
                } catch (Throwable th) {
                    th = th;
                    Timber.INSTANCE.e(th);
                    r7bVar = r7bVar2;
                    t5aVar = t5aVar2;
                    q2aVar = q2aVar2;
                    j = j2;
                    arrayList = arrayList2;
                }
            } catch (Throwable th2) {
                th = th2;
                r7bVar2 = r7bVar;
                t5aVar2 = t5aVar;
                q2aVar2 = q2aVar;
                j2 = j;
                arrayList2 = arrayList;
            }
            r7bVar = r7bVar2;
            t5aVar = t5aVar2;
            q2aVar = q2aVar2;
            j = j2;
            arrayList = arrayList2;
        }
    }

    public final void k(r7b r7bVar, t5a t5aVar, m4a m4aVar, ArrayList arrayList) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((ano) ((o6a) it.next())).k(r7bVar, t5aVar, m4aVar, arrayList);
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
    }
}
