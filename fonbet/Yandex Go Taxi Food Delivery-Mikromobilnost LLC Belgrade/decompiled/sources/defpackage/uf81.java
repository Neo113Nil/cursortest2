package defpackage;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes7.dex */
public final class uf81 {
    public static final /* synthetic */ kgx[] e;
    public final ViewTreeObserver.OnPreDrawListener a;
    public final xm71 b;
    public cv81 c;
    public final r581 d;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("parentDesignView", 0, "getParentDesignView()Landroid/view/ViewGroup;", uf81.class);
        qoi0.a.getClass();
        e = new kgx[]{mutablePropertyReference1Impl};
    }

    public uf81(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        xm71 xm71Var = new xm71();
        this.a = onPreDrawListener;
        this.b = xm71Var;
        this.d = new r581(null);
    }
}
