package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class rw1 {
    public final yqr a;
    public final Handler b;
    public fsb c;
    public dv1 d;
    public int f;
    public tw1 h;
    public float g = 1.0f;
    public int e = 0;

    public rw1(Context context, Looper looper, fsb fsbVar) {
        this.a = o5g.L(new qw1(context, 0));
        this.c = fsbVar;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        fx1.a((AudioManager) this.a.get(), this.h);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        fsb fsbVar = this.c;
        if (fsbVar != null) {
            fsbVar.h.g(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        e0 e0Var;
        boolean z2 = false;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                tw1 tw1Var = this.h;
                if (tw1Var == null) {
                    if (tw1Var == null) {
                        e0Var = new e0((char) 0, 2);
                        e0Var.d = dv1.g;
                        e0Var.c = i2;
                    } else {
                        e0 e0Var2 = new e0((char) 0, 2);
                        e0Var2.c = tw1Var.a;
                        e0Var2.d = tw1Var.d;
                        e0Var2.b = tw1Var.e;
                        e0Var = e0Var2;
                    }
                    dv1 dv1Var = this.d;
                    if (dv1Var != null && dv1Var.a == 1) {
                        z2 = true;
                    }
                    dv1Var.getClass();
                    e0Var.d = dv1Var;
                    e0Var.b = z2;
                    nb0 nb0Var = new nb0(1, this);
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new tw1(e0Var.c, nb0Var, handler, (dv1) e0Var.d, e0Var.b);
                }
                if (fx1.m((AudioManager) this.a.get(), this.h) == 1) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
