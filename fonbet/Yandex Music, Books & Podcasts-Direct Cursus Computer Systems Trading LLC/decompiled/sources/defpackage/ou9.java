package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class ou9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ qu9 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ iu9 c;
    public final /* synthetic */ e23 d;
    public final /* synthetic */ boolean e;

    public ou9(qu9 qu9Var, View view, iu9 iu9Var, e23 e23Var, boolean z) {
        this.a = qu9Var;
        this.b = view;
        this.c = iu9Var;
        this.d = e23Var;
        this.e = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        qu9.a(this.a, this.b, this.c, this.d, this.e);
    }
}
