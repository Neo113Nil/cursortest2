package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;

/* loaded from: classes12.dex */
public final class wg6 {
    public final yx40 A;
    public final yx40 B;
    public final yx40 C;
    public rzx D;
    public final tse a;
    public final fwi b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public float j;
    public float n;
    public float o;
    public jj2 p;
    public final a q;
    public pzt0 r;
    public int s;
    public sls t;
    public float[] u;
    public final yx40 v;
    public int w;
    public final SnapshotStateList x;
    public final ux40 y;
    public dtr0[] z;
    public int f = -2;
    public final oz40 g = f.j(new dtr0(-2));
    public final tx40 h = f.f(0.0f);
    public final oz40 i = f.j(Boolean.FALSE);
    public boolean k = true;
    public boolean l = true;
    public boolean m = true;

    public wg6(tse tseVar, fwi fwiVar, boolean z) {
        this.a = tseVar;
        this.b = fwiVar;
        this.c = z;
        this.d = !z;
        this.e = z;
        twt0 twt0Var = b.a;
        this.n = fwiVar.w0(56.0f);
        this.o = fwiVar.w0(125.0f);
        this.p = b.a;
        this.q = id00.a(0.0f);
        this.s = -1;
        this.u = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.v = f.g(2);
        this.x = new SnapshotStateList();
        int i = r5w.a;
        this.y = new ux40((Object) null);
        this.z = new dtr0[]{new dtr0(-1), new dtr0(-1)};
        this.A = f.g(0);
        this.B = f.g(0);
        this.C = f.g(0);
    }

    public final float a(float f) {
        boolean z = this.k;
        float[] fArr = this.u;
        float f2 = z ? fArr[this.v.getIntValue() - 1] : fArr[r3.getIntValue() - 2];
        boolean z2 = this.l;
        float[] fArr2 = this.u;
        return y6i0.c(f, f2, z2 ? fArr2[0] : fArr2[1]);
    }

    public final float b(float f) {
        tx40 tx40Var = this.h;
        float floatValue = tx40Var.getFloatValue();
        float a = a(tx40Var.getFloatValue() + f);
        tx40Var.setFloatValue(a);
        float f2 = a - floatValue;
        if (Math.abs(f2) > 0.001f) {
            this.i.setValue(Boolean.TRUE);
            pzt0 pzt0Var = this.r;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.r = null;
        }
        return f2;
    }

    public final void c(float f, float f2) {
        if (!rfb1.h(this) || Math.abs(f2) >= this.o) {
            if (this.m || f2 <= 0.0f) {
                c.e(this, f2);
            } else if (Math.abs(this.j) >= 0.001f || f / (f + f2) >= 0.1f) {
                c.e(this, 0.0f);
            } else {
                c.e(this, f2);
            }
        }
    }

    public final void d(boolean z) {
        SnapshotStateList snapshotStateList = this.x;
        int size = snapshotStateList.size();
        int i = size + 2;
        this.v.setIntValue(i);
        int i2 = 0;
        if (this.u.length < i) {
            this.u = new float[i];
            int size2 = snapshotStateList.size();
            dtr0[] dtr0VarArr = new dtr0[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                dtr0VarArr[i3] = new dtr0(-1);
            }
            this.z = dtr0VarArr;
        }
        float intValue = this.A.getIntValue();
        this.u[0] = this.B.getIntValue() - intValue;
        int size3 = snapshotStateList.size();
        float f = 0.0f;
        while (i2 < size3) {
            xpi0 xpi0Var = (xpi0) snapshotStateList.get(i2);
            f = y6i0.c(xpi0Var.b.getHeight(), f, intValue);
            int i4 = i2 + 1;
            this.u[i4] = -f;
            dtr0[] dtr0VarArr2 = this.z;
            int i5 = xpi0Var.a;
            dtr0VarArr2[i2] = new dtr0(i5);
            this.y.g(i5, i4);
            i2 = i4;
        }
        this.u[size + 1] = -intValue;
        if (z) {
            boolean g = rfb1.g(this);
            tx40 tx40Var = this.h;
            if (g) {
                tx40Var.setFloatValue(a(tx40Var.getFloatValue()));
                return;
            }
            if (rfb1.h(this)) {
                return;
            }
            boolean z2 = this.c;
            oz40 oz40Var = this.g;
            if (z2 && !this.d) {
                this.d = true;
                oz40Var.setValue(new dtr0(this.f));
            }
            if (this.e) {
                tx40Var.setFloatValue(f(((dtr0) oz40Var.getValue()).a));
            } else {
                tx40Var.setFloatValue(f(-1));
            }
        }
    }

    public final int e(int i, h62 h62Var) {
        int i2 = this.w;
        this.w = i2 + 1;
        SnapshotStateList snapshotStateList = this.x;
        if (i < 0 || i > snapshotStateList.size()) {
            snapshotStateList.add(new xpi0(i2, h62Var));
        } else {
            snapshotStateList.add(i, new xpi0(i2, h62Var));
        }
        d(false);
        return i2;
    }

    public final float f(int i) {
        if (i == -2) {
            return rfb1.c(this);
        }
        float[] fArr = this.u;
        return i == -1 ? fArr[0] : fArr[this.y.d(i)];
    }

    public final void g(h62 h62Var) {
        xpi0 xpi0Var;
        SnapshotStateList snapshotStateList = this.x;
        int size = snapshotStateList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                xpi0Var = null;
                i = -1;
                break;
            } else {
                xpi0Var = (xpi0) snapshotStateList.get(i);
                if (jl40.l(xpi0Var.b, h62Var)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (xpi0Var == null) {
            return;
        }
        snapshotStateList.remove(i);
        if (xpi0Var.a != ((dtr0) this.g.getValue()).a || rfb1.g(this)) {
            return;
        }
        d(true);
        c.e(this, 0.0f);
    }
}
