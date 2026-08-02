package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class ecx implements Cloneable {
    public final mcx a;
    public mcx b;

    public ecx(mcx mcxVar) {
        this.a = mcxVar;
        if (mcxVar.c()) {
            xq0.x("Default instance must be immutable.");
            throw null;
        }
        this.b = (mcx) mcxVar.d(4);
    }

    public static void b(List list, int i) {
        String c = dfi.c(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(c);
            }
            list.remove(size);
        }
    }

    public final mcx c() {
        boolean c = this.b.c();
        mcx mcxVar = this.b;
        if (c) {
            mcxVar.getClass();
            fex.c.a(mcxVar.getClass()).a(mcxVar);
            mcxVar.j();
            mcxVar = this.b;
        }
        if (mcx.m(mcxVar, true)) {
            return mcxVar;
        }
        throw new rex();
    }

    public final Object clone() {
        ecx ecxVar = (ecx) this.a.d(5);
        boolean c = this.b.c();
        mcx mcxVar = this.b;
        if (c) {
            mcxVar.getClass();
            fex.c.a(mcxVar.getClass()).a(mcxVar);
            mcxVar.j();
            mcxVar = this.b;
        }
        ecxVar.b = mcxVar;
        return ecxVar;
    }

    public final void d() {
        if (this.b.c()) {
            return;
        }
        mcx mcxVar = (mcx) this.a.d(4);
        fex.c.a(mcxVar.getClass()).c(mcxVar, this.b);
        this.b = mcxVar;
    }
}
