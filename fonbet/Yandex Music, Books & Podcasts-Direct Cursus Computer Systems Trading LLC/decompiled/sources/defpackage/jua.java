package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class jua implements mgu {
    public final oq2 a;
    public final oq2 b;
    public final SparseArray c = new SparseArray();
    public int d = 0;
    public float e = 0.0f;
    public final /* synthetic */ int f;

    public jua(ViewGroup viewGroup, oq2 oq2Var, oq2 oq2Var2, int i) {
        this.f = i;
        this.a = oq2Var;
        this.b = oq2Var2;
    }

    @Override // defpackage.mgu
    public int a(int i, int i2) {
        switch (this.f) {
            case 0:
                this.c.clear();
                break;
        }
        return c(i, i2);
    }

    @Override // defpackage.mgu
    public final boolean b(int i, float f) {
        switch (this.f) {
            case 0:
                break;
            default:
                SparseArray sparseArray = this.c;
                if (sparseArray.size() != 0) {
                    if (i == 0 || (i == 1 && f <= 0.0f)) {
                        sparseArray.size();
                        m1s m1sVar = (m1s) sparseArray.valueAt(sparseArray.size() - 1);
                        if (m1sVar.a() != m1sVar.b()) {
                        }
                    }
                }
                break;
        }
        return true;
    }

    public final int c(int i, int i2) {
        SparseArray sparseArray = this.c;
        m1s m1sVar = (m1s) sparseArray.get(i);
        if (m1sVar == null) {
            n nVar = this.b.a.m;
            int size = nVar == null ? 0 : nVar.m().size();
            if (size == 0) {
                return 0;
            }
            m1s m1sVar2 = new m1s(size, new eq2(this, View.MeasureSpec.getSize(i), i2));
            sparseArray.put(i, m1sVar2);
            m1sVar = m1sVar2;
        }
        int i3 = this.d;
        float f = this.e;
        switch (this.f) {
            case 0:
                if (f < 0.01f) {
                    return m1sVar.c(i3);
                }
                return Math.round(((m1sVar.c(i3 + 1) - r0) * f) + m1sVar.c(i3));
            default:
                if (i3 > 0) {
                    return m1sVar.b();
                }
                if (f < 0.01f) {
                    return m1sVar.a();
                }
                return Math.round(((m1sVar.b() - r6) * f) + m1sVar.a());
        }
    }
}
