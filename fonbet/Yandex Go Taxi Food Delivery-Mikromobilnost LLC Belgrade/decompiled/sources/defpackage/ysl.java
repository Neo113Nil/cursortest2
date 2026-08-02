package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class ysl implements omp, pyl0 {
    public int a;
    public Object b;

    public ysl(tjk tjkVar) {
        int i = m0i0.Div_Theme;
        this.b = tjkVar;
        this.a = i;
    }

    @Override // defpackage.pyl0
    public boolean a() {
        d();
        return false;
    }

    @Override // defpackage.pyl0
    public int b() {
        return -1;
    }

    @Override // defpackage.pyl0
    public int c() {
        d();
        return ((SparseIntArray) this.b).keyAt(this.a);
    }

    @Override // defpackage.pyl0
    public boolean d() {
        return this.a >= ((SparseIntArray) this.b).size();
    }

    @Override // defpackage.pyl0
    public long e() {
        d();
        return ((SparseIntArray) this.b).keyAt(this.a) + 1;
    }

    public void f() {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        if (d()) {
            return;
        }
        while (this.a < sparseIntArray.size() && sparseIntArray.valueAt(this.a) == 0) {
            this.a++;
        }
    }

    @Override // defpackage.pyl0
    public int getCount() {
        d();
        return ((SparseIntArray) this.b).valueAt(this.a);
    }

    @Override // defpackage.pyl0
    public void next() {
        d();
        this.a++;
        f();
    }

    public /* synthetic */ ysl(int i, Object obj) {
        this.b = obj;
        this.a = i;
    }
}
