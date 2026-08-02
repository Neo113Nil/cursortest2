package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v1a implements View.OnLayoutChangeListener {
    public final /* synthetic */ gc8 a;
    public final /* synthetic */ dw8 b;
    public final /* synthetic */ w1a c;
    public final /* synthetic */ View d;
    public final /* synthetic */ xzb e;
    public final /* synthetic */ jc8 f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ List h;
    public final /* synthetic */ List i;

    public v1a(gc8 gc8Var, dw8 dw8Var, w1a w1aVar, View view, xzb xzbVar, jc8 jc8Var, ArrayList arrayList, List list, List list2) {
        this.a = gc8Var;
        this.b = dw8Var;
        this.c = w1aVar;
        this.d = view;
        this.e = xzbVar;
        this.f = jc8Var;
        this.g = arrayList;
        this.h = list;
        this.i = list2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        boolean d = Intrinsics.d(this.a.getDataTag(), this.b);
        w1a w1aVar = this.c;
        if (d) {
            w1aVar.f.j(this.d, this.a, this.e, this.f, this.g);
            w1aVar.getClass();
            List list = this.h;
            xzb xzbVar = this.e;
            w1aVar.g(this.a, xzbVar, this.d, this.f, w1a.c(list, xzbVar), w1a.c(this.i, this.e));
        }
        w1aVar.h.remove(this.d);
    }
}
