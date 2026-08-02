package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public abstract class x8 implements g580 {
    public final ynj0 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public boolean c;
    public ArrayList d;

    public x8(List list, ynj0 ynj0Var) {
        this.a = ynj0Var;
        this.d = new ArrayList(list);
    }

    public final void a() {
        if (this.c) {
            b();
        }
        this.c = false;
    }

    public abstract void b();

    public final x8 c(b580 b580Var, boolean z) {
        ArrayList arrayList = new ArrayList(this.d);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((b580) it.next()).a, b580Var.a)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            arrayList.add(b580Var);
            if (z) {
                this.a.a.add(b580Var.a);
            }
        } else {
            arrayList.set(i, b580Var);
        }
        this.d = arrayList;
        this.c = true;
        this.b.g(zy11.a);
        return this;
    }

    public final x8 d(String str) {
        ArrayList arrayList = new ArrayList(this.d);
        if (ycc.w(arrayList, new h0(str, 1), false)) {
            this.d = arrayList;
            this.c = true;
            this.b.g(zy11.a);
        }
        return this;
    }

    public final x8 e(List list) {
        this.d = new ArrayList(list);
        this.c = true;
        this.b.g(zy11.a);
        return this;
    }
}
