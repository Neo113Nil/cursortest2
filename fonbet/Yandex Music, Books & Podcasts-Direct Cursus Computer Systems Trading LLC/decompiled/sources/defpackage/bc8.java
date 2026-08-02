package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bc8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ gc8 c;

    public /* synthetic */ bc8(h23 h23Var, gc8 gc8Var, int i) {
        this.a = i;
        this.b = h23Var;
        this.c = gc8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        g23 g23Var;
        f23 a;
        List list;
        Map b0;
        xzb xzbVar;
        qv8 qv8Var = null;
        switch (this.a) {
            case 0:
                g23Var = this.b.b;
                a = g23Var.a();
                try {
                    gc8 gc8Var = this.c;
                    int i = gc8.D0;
                    gc8Var.x(true);
                    return;
                } finally {
                    g23Var.getClass();
                    g23.b(a);
                }
            case 1:
                gc8 gc8Var2 = this.c;
                a = this.b.b.a();
                try {
                    rv8 divData = gc8Var2.getDivData();
                    if (divData != null && (list = divData.c) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((qv8) next).b == gc8Var2.getStateId$div_release()) {
                                    qv8Var = next;
                                }
                            }
                        }
                        qv8Var = qv8Var;
                    }
                    if (qv8Var != null) {
                        gc8Var2.A(qv8Var);
                    }
                    gc8.j(gc8Var2);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            default:
                a = this.b.b.a();
                try {
                    w1a A = this.c.getDiv2Component$div_release().A();
                    synchronized (this.c.t) {
                        b0 = leu.b0(this.c.t);
                    }
                    for (Map.Entry entry : b0.entrySet()) {
                        View view = (View) entry.getKey();
                        jc8 jc8Var = (jc8) entry.getValue();
                        e23 G = bg3.G(view);
                        if (G != null && (xzbVar = G.b) != null) {
                            boolean isAttachedToWindow = view.isAttachedToWindow();
                            gc8 gc8Var3 = this.c;
                            if (isAttachedToWindow) {
                                w1a.i(A, gc8Var3, xzbVar, view, jc8Var);
                            } else {
                                w1a.i(A, gc8Var3, xzbVar, null, jc8Var);
                            }
                        }
                    }
                    g23Var = this.b.b;
                    return;
                } catch (Throwable th2) {
                    g23Var = this.b.b;
                    throw th2;
                }
        }
    }
}
