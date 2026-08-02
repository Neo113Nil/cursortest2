package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gf9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf9 b;

    public /* synthetic */ gf9(hf9 hf9Var, int i) {
        this.a = i;
        this.b = hf9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map o;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                hf9 hf9Var = this.b;
                c11 c11Var = hf9Var.k;
                c11Var.b--;
                hf9.h0(hf9Var);
                return;
            case 1:
                hf9 hf9Var2 = this.b;
                hf9Var2.l.set(true);
                hf9.h0(hf9Var2);
                return;
            case 2:
                this.b.k.b++;
                return;
            default:
                synchronized (this.b.j) {
                    o = uah.o(this.b.j);
                }
                int size = o.size();
                if (o.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = o.entrySet().iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((dom) ((Map.Entry) it.next()).getValue()).c) {
                            i++;
                        }
                    }
                }
                int i3 = size - i;
                int i4 = this.b.k.b;
                if (i4 < 0) {
                    i4 = 0;
                }
                int i5 = i4 + i3;
                if (o.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it2 = o.entrySet().iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (((dom) ((Map.Entry) it2.next()).getValue()).b) {
                            i2++;
                        }
                    }
                }
                int size2 = this.b.k.a.size() + i2;
                if (i5 == 0 && this.b.l.get() && this.b.m.compareAndSet(false, true)) {
                    this.b.i.a(size2 != 0);
                    return;
                }
                return;
        }
    }
}
