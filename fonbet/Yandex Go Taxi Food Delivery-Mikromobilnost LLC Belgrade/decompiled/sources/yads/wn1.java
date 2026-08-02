package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.kgx;
import defpackage.myv0;
import defpackage.r581;
import defpackage.sg71;
import defpackage.xm71;
import defpackage.zs81;

/* loaded from: classes7.dex */
public final class wn1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ sg71 b;
    public final /* synthetic */ zs81 c;

    public wn1(zs81 zs81Var, View view, sg71 sg71Var) {
        this.a = view;
        this.c = zs81Var;
    }

    public static final void a(zs81 zs81Var) {
        xm71 xm71Var = zs81Var.a;
        r581 r581Var = zs81Var.b;
        kgx kgxVar = zs81.c[0];
        xm71Var.b.post(new myv0((ViewGroup) r581Var.a.get(), false));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.a.isShown()) {
            return true;
        }
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        throw null;
    }
}
