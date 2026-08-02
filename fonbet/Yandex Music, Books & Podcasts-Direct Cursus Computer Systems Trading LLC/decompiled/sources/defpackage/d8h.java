package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d8h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8h b;

    public /* synthetic */ d8h(g8h g8hVar, int i) {
        this.a = i;
        this.b = g8hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                g8h g8hVar = this.b;
                j8h j8hVar = g8hVar.d;
                AtomicReference atomicReference = g8hVar.a;
                if (j8hVar.A == null) {
                    if (atomicReference.get() == j8h.i0) {
                        atomicReference.set(null);
                    }
                    g8hVar.d.E.T(j8h.f0);
                    return;
                }
                return;
            case 1:
                if (this.b.a.get() == j8h.i0) {
                    this.b.a.set(null);
                }
                LinkedHashSet linkedHashSet = this.b.d.A;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((f8h) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                g06 g06Var = this.b.d.E;
                sgr sgrVar = j8h.e0;
                g06Var.T(sgrVar);
                synchronized (g06Var.a) {
                    arrayList = new ArrayList((HashSet) g06Var.b);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((mo4) it2.next()).f(sgrVar);
                }
                ((j8h) g06Var.d).D.c(sgrVar);
                return;
            default:
                this.b.d.s();
                return;
        }
    }
}
