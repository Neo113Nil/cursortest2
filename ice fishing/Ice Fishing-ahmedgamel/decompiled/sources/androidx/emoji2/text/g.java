package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import t0.AbstractC4990E;
import t0.C5025t;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4768a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4769b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4770c;

    public g(AbstractC4990E abstractC4990E) {
        this.f4768a = Integer.MIN_VALUE;
        this.f4770c = new Rect();
        this.f4769b = abstractC4990E;
    }

    public static g a(AbstractC4990E abstractC4990E, int i) {
        if (i == 0) {
            return new C5025t(abstractC4990E, 0);
        }
        if (i == 1) {
            return new C5025t(abstractC4990E, 1);
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

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public g(i iVar) {
        this.f4768a = 0;
        this.f4770c = new d();
        this.f4769b = iVar;
    }
}
