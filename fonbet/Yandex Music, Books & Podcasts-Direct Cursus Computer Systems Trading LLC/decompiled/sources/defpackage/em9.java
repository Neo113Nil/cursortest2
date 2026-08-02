package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class em9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ gm9 a;
    public final /* synthetic */ gc8 b;
    public final /* synthetic */ xzb c;
    public final /* synthetic */ View d;
    public final /* synthetic */ jc8 e;

    public em9(gm9 gm9Var, gc8 gc8Var, xzb xzbVar, View view, jc8 jc8Var) {
        this.a = gm9Var;
        this.b = gc8Var;
        this.c = xzbVar;
        this.d = view;
        this.e = jc8Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        w1a.i(this.a.i, this.b, this.c, this.d, this.e);
    }
}
