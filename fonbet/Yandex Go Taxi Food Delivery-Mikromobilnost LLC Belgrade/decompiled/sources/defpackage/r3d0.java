package defpackage;

import android.view.ViewGroup;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class r3d0 {
    public static final /* synthetic */ kgx[] e;
    public final ppu a;
    public final npu b;
    public final ow31 c;
    public final wv5 d;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("loadingAnimationLayout", 0, "getLoadingAnimationLayout()Landroid/view/ViewGroup;", r3d0.class);
        qoi0.a.getClass();
        e = new kgx[]{propertyReference1Impl};
    }

    public r3d0(PlusHomeWebView plusHomeWebView, ppu ppuVar, npu npuVar, ow31 ow31Var) {
        this.a = ppuVar;
        this.b = npuVar;
        this.c = ow31Var;
        this.d = new wv5(new a450(plusHomeWebView, v9h0.plus_sdk_loading_animation_layout, 19));
    }

    public final ViewGroup a() {
        return (ViewGroup) this.d.a(e[0]);
    }

    public final void b() {
        this.b.a(true);
        ((l8p) this.c).c(new b931(13), a());
        ((n5d0) ((nw70) this.a).b).z(a());
    }
}
