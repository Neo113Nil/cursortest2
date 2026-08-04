package com.gamericefishpro.space.f;

import android.graphics.Rect;
import android.view.View;
import com.gamericefishpro.space.d.s;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public Object a;
    public final Object b;

    public b(y3 y3Var) {
        this.a = new s(1, this);
        this.b = new a(this, y3Var);
    }

    public static b a(b0 b0Var, int i) {
        if (i == 0) {
            return new t(b0Var, 0);
        }
        if (i == 1) {
            return new t(b0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int[] b(int i);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public int[] l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public abstract int m();

    public String n() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        Intrinsics.h("text");
        throw null;
    }

    public abstract int o();

    public abstract int p(View view);

    public abstract int q(View view);

    public boolean r() {
        return ((s) this.a).b && ((a) this.b).d;
    }

    public abstract void s(int i);

    public abstract void u();

    public abstract int[] x(int i);

    public b() {
        this.b = new int[2];
    }

    public b(b0 b0Var) {
        this.b = new Rect();
        this.a = b0Var;
    }

    public void t() {
    }

    public void w() {
    }

    public void v(com.gamericefishpro.space.d.a aVar) {
    }
}
