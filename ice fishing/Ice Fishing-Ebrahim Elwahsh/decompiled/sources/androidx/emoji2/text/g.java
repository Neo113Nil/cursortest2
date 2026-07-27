package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import t0.AbstractC5019C;
import t0.C5057t;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4883a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4884b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4885c;

    public g(AbstractC5019C abstractC5019C) {
        this.f4883a = Integer.MIN_VALUE;
        this.f4885c = new Rect();
        this.f4884b = abstractC5019C;
    }

    public static g a(AbstractC5019C abstractC5019C, int i) {
        if (i == 0) {
            return new C5057t(abstractC5019C, 0);
        }
        if (i == 1) {
            return new C5057t(abstractC5019C, 1);
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
        this.f4883a = 0;
        this.f4885c = new d();
        this.f4884b = iVar;
    }
}
