package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uq2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ List b;
    public final /* synthetic */ w1a c;
    public final /* synthetic */ gc8 d;

    public uq2(ViewGroup viewGroup, List list, w1a w1aVar, gc8 gc8Var) {
        this.a = viewGroup;
        this.b = list;
        this.c = w1aVar;
        this.d = gc8Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        List list = this.b;
        c7 c7Var = new c7(8, this.a);
        Iterator it = list.iterator();
        while (c7Var.hasNext() && it.hasNext()) {
            Object next = c7Var.next();
            k79 k79Var = (k79) it.next();
            xzb xzbVar = k79Var.b;
            jc8 jc8Var = k79Var.a;
            w1a.i(this.c, this.d, xzbVar, (View) next, jc8Var);
        }
    }
}
