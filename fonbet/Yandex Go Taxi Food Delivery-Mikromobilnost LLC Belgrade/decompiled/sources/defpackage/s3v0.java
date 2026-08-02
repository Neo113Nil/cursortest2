package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p003native.SuccessNativeContentView;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class s3v0 {
    public static final /* synthetic */ kgx[] n = {new PropertyReference1Impl("toolbar", 0, "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", s3v0.class), b64.x(qoi0.a, s3v0.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl("logosRecyclerView", 0, "getLogosRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", s3v0.class), new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", s3v0.class), new PropertyReference1Impl("descriptionTextView", 0, "getDescriptionTextView()Landroid/widget/TextView;", s3v0.class), new PropertyReference1Impl("button", 0, "getButton()Landroid/widget/Button;", s3v0.class), new PropertyReference1Impl("confettiView", 0, "getConfettiView()Lcom/yandex/plus/pay/ui/core/mobile/view/confetti/PlusPayConfettiView;", s3v0.class)};
    public final SuccessNativeContentView a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final lgd0 g;
    public final PlusPayConfettiView.a h;
    public final p8f0 i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public s3v0(SuccessNativeContentView successNativeContentView, gbd0 gbd0Var, b5d0 b5d0Var, Integer num, sls slsVar, sls slsVar2) {
        this.a = successNativeContentView;
        int i = z9h0.checkout_toolbar;
        this.b = new wv5(new l9f0(successNativeContentView, z9h0.success_content_root, 3));
        int i2 = z9h0.success_logos_recycler;
        this.c = new wv5(new l9f0(successNativeContentView, z9h0.success_title, 4));
        this.d = new wv5(new l9f0(successNativeContentView, z9h0.success_text, 5));
        wv5 wv5Var = new wv5(new l9f0(successNativeContentView, z9h0.success_button, 6));
        this.e = wv5Var;
        this.f = new wv5(new l9f0(successNativeContentView, z9h0.success_confetti_view, 7));
        kgx[] kgxVarArr = n;
        kgx kgxVar = kgxVarArr[0];
        try {
            View findViewById = successNativeContentView.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
            }
            this.g = new lgd0((PlusPayToolbarView) findViewById, b5d0Var, slsVar);
            this.h = new PlusPayConfettiView.a();
            p8f0 p8f0Var = new p8f0((PlusTheme) ((n4u0) ((qc20) gbd0Var).a).getValue(), b5d0Var, num);
            this.i = p8f0Var;
            this.j = a().getPaddingLeft();
            this.k = a().getPaddingTop();
            this.l = a().getPaddingRight();
            this.m = a().getPaddingBottom();
            kgx kgxVar2 = kgxVarArr[2];
            try {
                View findViewById2 = successNativeContentView.findViewById(i2);
                if (findViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
                RecyclerView recyclerView = (RecyclerView) findViewById2;
                recyclerView.setAdapter(p8f0Var);
                recyclerView.addItemDecoration(new q8f0());
                recyclerView.setChildDrawingOrderCallback(new s2u0(4));
                bb1.L((Button) wv5Var.a(kgxVarArr[5]), new xbg0(9, slsVar2));
            } catch (ClassCastException e) {
                dy31.f(kgxVar2, e);
                throw null;
            }
        } catch (ClassCastException e2) {
            dy31.f(kgxVar, e2);
            throw null;
        }
    }

    public final ViewGroup a() {
        return (ViewGroup) this.b.a(n[1]);
    }
}
