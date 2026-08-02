package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ylk extends wlk {
    public final xlk d;
    public Object e;
    public boolean f;
    public int g;

    public ylk(xlk xlkVar, bat[] batVarArr) {
        super(xlkVar.c, batVarArr);
        this.d = xlkVar;
        this.g = xlkVar.e;
    }

    public final void c(int i, aat aatVar, Object obj, int i2) {
        int i3 = i2 * 5;
        bat[] batVarArr = this.a;
        if (i3 <= 30) {
            int P = 1 << u7g.P(i, i3);
            if (aatVar.h(P)) {
                batVarArr[i2].a(Integer.bitCount(aatVar.a) * 2, aatVar.f(P), aatVar.d);
                this.b = i2;
                return;
            }
            int t = aatVar.t(P);
            aat s = aatVar.s(t);
            batVarArr[i2].a(Integer.bitCount(aatVar.a) * 2, t, aatVar.d);
            c(i, s, obj, i2 + 1);
            return;
        }
        bat batVar = batVarArr[i2];
        Object[] objArr = aatVar.d;
        batVar.a(objArr.length, 0, objArr);
        while (true) {
            bat batVar2 = batVarArr[i2];
            if (Intrinsics.d(batVar2.a[batVar2.c], obj)) {
                this.b = i2;
                return;
            } else {
                batVarArr[i2].c += 2;
            }
        }
    }

    @Override // defpackage.wlk, java.util.Iterator
    public final Object next() {
        if (this.d.e != this.g) {
            xq0.i();
            return null;
        }
        if (!this.c) {
            wvs.n();
            return null;
        }
        bat batVar = this.a[this.b];
        this.e = batVar.a[batVar.c];
        this.f = true;
        return super.next();
    }

    @Override // defpackage.wlk, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            e7o.n();
            return;
        }
        boolean z = this.c;
        xlk xlkVar = this.d;
        if (!z) {
            wct.n(xlkVar).remove(this.e);
        } else {
            if (!z) {
                wvs.n();
                return;
            }
            bat batVar = this.a[this.b];
            Object obj = batVar.a[batVar.c];
            wct.n(xlkVar).remove(this.e);
            c(obj != null ? obj.hashCode() : 0, xlkVar.c, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.g = xlkVar.e;
    }
}
