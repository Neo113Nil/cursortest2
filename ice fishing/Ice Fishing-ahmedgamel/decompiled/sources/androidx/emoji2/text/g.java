package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import t0.AbstractC4987C;
import t0.C5023s;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4736a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4737b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4738c;

    public g(AbstractC4987C abstractC4987C) {
        this.f4736a = Integer.MIN_VALUE;
        this.f4738c = new Rect();
        this.f4737b = abstractC4987C;
    }

    public static g a(AbstractC4987C abstractC4987C, int i) {
        if (i == 0) {
            return new C5023s(abstractC4987C, 0);
        }
        if (i == 1) {
            return new C5023s(abstractC4987C, 1);
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
        this.f4736a = 0;
        this.f4738c = new d();
        this.f4737b = iVar;
    }
}
