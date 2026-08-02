package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class yn4 extends bt1 {
    public final /* synthetic */ int c = 2;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn4(osh oshVar) {
        super(1, ((zn4) oshVar.c).e);
        this.d = oshVar;
    }

    @Override // defpackage.bt1
    public final void b() {
        List list;
        switch (this.c) {
            case 0:
                osh oshVar = (osh) this.d;
                jkk.c();
                try {
                    jkk.a();
                    jkk.a.getClass();
                    if (((sgr) oshVar.b) == null) {
                        try {
                            ((bg3) oshVar.a).T();
                        } catch (Throwable th) {
                            sgr i = sgr.f.h(th).i("Failed to call onReady.");
                            oshVar.b = i;
                            ((zn4) oshVar.c).i.f(i);
                        }
                    }
                    jkk.a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        jkk.a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 1:
                ((f8h) this.d).i();
                return;
            default:
                jv7 jv7Var = (jv7) this.d;
                jv7Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (jv7Var) {
                        try {
                            if (jv7Var.v.isEmpty()) {
                                jv7Var.v = null;
                                jv7Var.u = true;
                                return;
                            } else {
                                list = jv7Var.v;
                                jv7Var.v = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn4(f8h f8hVar, jv7 jv7Var) {
        super(1, f8hVar.c);
        this.d = jv7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn4(f8h f8hVar, we6 we6Var) {
        super(1, we6Var);
        this.d = f8hVar;
    }
}
