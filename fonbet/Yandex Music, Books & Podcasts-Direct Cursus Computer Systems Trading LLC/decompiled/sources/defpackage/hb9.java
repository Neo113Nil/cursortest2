package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes3.dex */
public final class hb9 extends lr8 {
    public final e23 l;
    public final hp8 m;
    public final SparseArray n;
    public final p0a o;
    public final oc9 p;
    public final fb9 q;
    public int r;
    public cb9 s;
    public boolean t;
    public int u;

    public hb9(List list, e23 e23Var, hp8 hp8Var, SparseArray sparseArray, p0a p0aVar, pm9 pm9Var, oc9 oc9Var) {
        super(e23Var, pm9Var, list);
        this.l = e23Var;
        this.m = hp8Var;
        this.n = sparseArray;
        this.o = p0aVar;
        this.p = oc9Var;
        this.q = new fb9(0, this);
        this.s = cb9.START;
    }

    public final void A(int i) {
        qj qjVar = this.a;
        if (i >= 0 && i < 2) {
            qjVar.d(u().size() + i, 2 - i, null);
            return;
        }
        int size = u().size() - 2;
        if (i >= u().size() || size > i) {
            return;
        }
        qjVar.d((i - u().size()) + 2, 2, null);
    }

    @Override // defpackage.lr8
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void j(pc9 pc9Var, int i) {
        super.j(pc9Var, C(i));
        Float f = (Float) this.n.get(i);
        if (f != null) {
            float floatValue = f.floatValue();
            int i2 = this.r;
            View view = pc9Var.a;
            if (i2 == 0) {
                view.setTranslationX(floatValue);
            } else {
                view.setTranslationY(floatValue);
            }
        }
    }

    public final int C(int i) {
        int size = u().size();
        Integer valueOf = Integer.valueOf(size);
        if (size <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue = valueOf.intValue();
        return ((i - z()) + intValue) % intValue;
    }

    @Override // defpackage.lr8, defpackage.qon
    public final int c() {
        return this.q.f();
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        return new pc9(this.l, new ec9(this.l.a.getContext$div_release(), new gb9(this, 2)), this.m, this.o, new gb9(this, 0), new gb9(this, 1));
    }

    @Override // defpackage.lr8
    public final void v(int i) {
        boolean z = this.t;
        qj qjVar = this.a;
        if (!z) {
            qjVar.e(i, 1);
        } else {
            qjVar.e(i + 2, 1);
            A(i);
        }
    }

    @Override // defpackage.lr8
    public final void w(int i) {
        this.u++;
        boolean z = this.t;
        qj qjVar = this.a;
        if (!z) {
            qjVar.f(i, 1);
        } else {
            qjVar.f(i + 2, 1);
            A(i);
        }
    }

    public final int z() {
        return this.t ? 2 : 0;
    }
}
