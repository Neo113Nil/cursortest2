package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class r6o {
    public static final /* synthetic */ kgx[] r = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/ViewGroup;", r6o.class), b64.x(qoi0.a, r6o.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new PropertyReference1Impl("image", 0, "getImage()Landroid/widget/ImageView;", r6o.class), new PropertyReference1Impl("scroller", 0, "getScroller()Landroidx/core/widget/NestedScrollView;", r6o.class), new PropertyReference1Impl("title", 0, "getTitle()Landroid/widget/TextView;", r6o.class), new PropertyReference1Impl("subtitle", 0, "getSubtitle()Landroid/widget/TextView;", r6o.class), new PropertyReference1Impl("accordion", 0, "getAccordion()Lcom/yandex/plus/pay/ui/core/mobile/view/accordion/PlusPayAccordionView;", r6o.class), new PropertyReference1Impl("errorButtons", 0, "getErrorButtons()Lcom/yandex/plus/pay/ui/core/mobile/view/error/buttons/PlusPayErrorButtonsView;", r6o.class), new PropertyReference1Impl("supportTextView", 0, "getSupportTextView()Landroid/widget/TextView;", r6o.class), new PropertyReference1Impl(ErrorResponseData.JSON_ERROR_CODE, 0, "getErrorCode()Landroid/widget/TextView;", r6o.class)};
    public final wv5 a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final i3y j;
    public final lgd0 k;
    public final i3y l;
    public final i3y m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    public r6o(ErrorContentView errorContentView, gbd0 gbd0Var, b5d0 b5d0Var, hzk hzkVar, sls slsVar, sls slsVar2, sls slsVar3) {
        this.a = new wv5(new sdg(errorContentView, z9h0.error_root, 9));
        wv5 wv5Var = new wv5(new sdg(errorContentView, z9h0.checkout_toolbar, 10));
        this.b = wv5Var;
        int i = z9h0.error_image;
        this.c = new wv5(new sdg(errorContentView, z9h0.error_scroller, 11));
        this.d = new wv5(new sdg(errorContentView, z9h0.error_title, 12));
        this.e = new wv5(new sdg(errorContentView, z9h0.error_subtitle, 13));
        this.f = new wv5(new sdg(errorContentView, z9h0.error_accordion, 14));
        this.g = new wv5(new sdg(errorContentView, z9h0.error_buttons, 15));
        wv5 wv5Var2 = new wv5(new sdg(errorContentView, z9h0.error_support_text, 16));
        this.h = wv5Var2;
        this.i = new wv5(new sdg(errorContentView, z9h0.error_code, 8));
        this.j = a.a(new c1o(2, errorContentView));
        kgx[] kgxVarArr = r;
        this.k = new lgd0((PlusPayToolbarView) wv5Var.a(kgxVarArr[1]), b5d0Var, slsVar);
        this.l = a.a(new ymj(26, this, hzkVar));
        this.m = a.a(new t7j(5, this, slsVar2, slsVar3));
        this.n = b().getPaddingLeft();
        this.o = b().getPaddingTop();
        this.p = b().getPaddingRight();
        this.q = b().getPaddingBottom();
        kgx kgxVar = kgxVarArr[2];
        try {
            View findViewById = errorContentView.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) findViewById).setImageResource(kxg0.pay_sdk_error_image);
            bb1.L(a(), new vsn(3, this, errorContentView));
            ((TextView) wv5Var2.a(kgxVarArr[8])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        } catch (ClassCastException e) {
            dy31.f(kgxVar, e);
            throw null;
        }
    }

    public final TextView a() {
        return (TextView) this.i.a(r[9]);
    }

    public final ViewGroup b() {
        return (ViewGroup) this.a.a(r[0]);
    }

    public final NestedScrollView c() {
        return (NestedScrollView) this.c.a(r[3]);
    }

    public final TextView d() {
        return (TextView) this.e.a(r[5]);
    }

    public final TextView e() {
        return (TextView) this.d.a(r[4]);
    }
}
