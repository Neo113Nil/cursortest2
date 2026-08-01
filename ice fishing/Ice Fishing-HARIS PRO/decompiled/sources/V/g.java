package V;

import android.graphics.Rect;
import android.view.View;
import k0.C0210y;
import k0.K;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f1210a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1211b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1212c;

    public g(K k2) {
        this.f1210a = Integer.MIN_VALUE;
        this.f1212c = new Rect();
        this.f1211b = k2;
    }

    public static g a(K k2, int i) {
        if (i == 0) {
            return new C0210y(k2, 0);
        }
        if (i == 1) {
            return new C0210y(k2, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f1210a) {
            return 0;
        }
        return l() - this.f1210a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f1210a = 0;
        this.f1212c = new d();
        this.f1211b = iVar;
    }
}
