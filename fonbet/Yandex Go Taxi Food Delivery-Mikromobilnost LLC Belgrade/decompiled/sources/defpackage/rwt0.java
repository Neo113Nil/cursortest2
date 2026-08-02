package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class rwt0 {
    public vwt0 a;
    public boolean b;
    public final boolean[] c;
    public int d;
    public qwt0 f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public float h = 5.0f;
    public float i = 3.0f;
    public boolean j = true;
    public final int e = 60;

    public rwt0() {
        boolean[] zArr = new boolean[100];
        this.c = zArr;
        Arrays.fill(zArr, 0, zArr.length, false);
        this.d = 0;
    }

    public static final boolean a(rwt0 rwt0Var, long j) {
        vwt0 vwt0Var;
        if (!rwt0Var.b && (vwt0Var = rwt0Var.a) != null) {
            float f = (j / 1000.0f) * 5.0f;
            while (f > 0.02f) {
                rwt0Var.g(vwt0Var.b(0.02f));
                f -= 0.02f;
            }
            rwt0Var.g(vwt0Var.b(f));
            boolean[] zArr = rwt0Var.c;
            int length = zArr.length;
            int i = 0;
            while (true) {
                float f2 = 1.0f;
                if (i >= length) {
                    rwt0Var.b = true;
                    if (rwt0Var.a != null) {
                        Iterator it = rwt0Var.g.iterator();
                        while (it.hasNext()) {
                            wz4 wz4Var = (wz4) it.next();
                            vz4 vz4Var = wz4Var.a;
                            vz4Var.b = 1.0f;
                            wz4Var.b.postOnAnimation(vz4Var);
                        }
                    }
                    synchronized (rwt0Var) {
                        rwt0Var.f = null;
                        rwt0Var.a = null;
                    }
                    return false;
                }
                if (zArr[i]) {
                    i++;
                } else {
                    vwt0 vwt0Var2 = rwt0Var.a;
                    if (!rwt0Var.b && vwt0Var2 != null) {
                        f2 = vwt0Var2.a / vwt0Var2.c;
                    } else if (vwt0Var2 == null || !vwt0Var2.f) {
                        f2 = 0.0f;
                    }
                    Iterator it2 = rwt0Var.g.iterator();
                    while (it2.hasNext()) {
                        wz4 wz4Var2 = (wz4) it2.next();
                        vz4 vz4Var2 = wz4Var2.a;
                        vz4Var2.b = f2;
                        wz4Var2.b.postOnAnimation(vz4Var2);
                    }
                }
            }
        }
        return true;
    }

    public final void b(wz4 wz4Var) {
        this.g.add(wz4Var);
    }

    public final void c() {
        this.i = 3.0f;
    }

    public final void d() {
        this.j = true;
    }

    public final void e() {
        this.h = 5.0f;
    }

    public final synchronized void f() {
        boolean[] zArr = this.c;
        Arrays.fill(zArr, 0, zArr.length, false);
        boolean z = this.j;
        this.a = new vwt0(!z, z, this.h, this.i);
        this.f = new qwt0(this, this.e);
        new Thread(this.f).start();
    }

    public final void g(float f) {
        vwt0 vwt0Var = this.a;
        if (vwt0Var == null) {
            return;
        }
        float abs = Math.abs((vwt0Var.f ? 1.0f : 0.0f) - (f / vwt0Var.c));
        int i = this.d;
        this.c[i] = abs <= 0.01f;
        int i2 = i + 1;
        this.d = i2;
        if (i2 >= 100) {
            this.d = 0;
        }
    }
}
