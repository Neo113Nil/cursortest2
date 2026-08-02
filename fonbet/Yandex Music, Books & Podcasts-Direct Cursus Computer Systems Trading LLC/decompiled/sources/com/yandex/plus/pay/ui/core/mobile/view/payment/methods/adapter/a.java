package com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.feature.webviews.internal.home.i;
import defpackage.b6e;
import defpackage.ern;
import defpackage.f1d;
import defpackage.k32;
import defpackage.s9f;
import defpackage.xq0;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a extends f {
    public static final /* synthetic */ s9f[] E = {new yxm(a.class, "methodIcon", "getMethodIcon()Landroid/widget/ImageView;", 0), f1d.c(ern.a, a.class, "methodTextView", "getMethodTextView()Landroid/widget/TextView;", 0), new yxm(a.class, "methodAdditionalTextView", "getMethodAdditionalTextView()Landroid/widget/TextView;", 0), new yxm(a.class, "methodPromoTextView", "getMethodPromoTextView()Landroid/widget/TextView;", 0), new yxm(a.class, "selectedIcon", "getSelectedIcon()Landroid/widget/ImageView;", 0), new yxm(a.class, "divider", "getDivider()Landroid/view/View;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f A;
    public final com.yandex.plus.bdui.plus.content.controller.f B;
    public final com.yandex.plus.bdui.plus.content.controller.f C;
    public com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c D;
    public final com.yandex.plus.ui.core.theme.a u;
    public final com.yandex.plus.core.imageloader.b v;
    public final Function1 w;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final com.yandex.plus.bdui.plus.content.controller.f y;
    public final com.yandex.plus.bdui.plus.content.controller.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, com.yandex.plus.ui.core.theme.a aVar, com.yandex.plus.core.imageloader.b bVar, k32 k32Var) {
        super(view);
        aVar.getClass();
        bVar.getClass();
        k32Var.getClass();
        this.u = aVar;
        this.v = bVar;
        this.w = k32Var;
        this.x = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 21));
        this.y = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 22));
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 23));
        this.z = fVar;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 24));
        this.A = fVar2;
        this.B = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 25));
        this.C = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(view, 26));
        u().setBackground(com.yandex.plus.bdui.plus.analytics.b.y(new ColorDrawable(r1.j(R.attr.pay_sdk_secondaryBlockColor, view)), view.getContext().getResources().getDimension(R.dimen.pay_sdk_payment_methods_icon_corner_radius)));
        view.setBackground(new ColorDrawable(0));
        r1.E(view, new i(5, this));
        s9f[] s9fVarArr = E;
        ((TextView) fVar.g(s9fVarArr[2])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
        ((TextView) fVar2.g(s9fVarArr[3])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    @Override // com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(d dVar, boolean z) {
        Integer num;
        v vVar;
        boolean z2;
        int i;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.b bVar;
        dVar.getClass();
        if (!(dVar instanceof b)) {
            xq0.x("item must be PaymentMethodsAdapter.Item.PaymentMethod");
            return;
        }
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c cVar = ((b) dVar).a;
        this.D = cVar;
        v vVar2 = cVar.h;
        Integer num2 = null;
        com.yandex.plus.ui.core.theme.a aVar = this.u;
        View view = this.a;
        if (vVar2 != null) {
            Context context = view.getContext();
            context.getClass();
            k kVar = u.r(context, aVar) ? vVar2.b : vVar2.a;
            if (kVar != null) {
                num = Integer.valueOf(com.yandex.plus.bdui.plus.analytics.b.P(kVar));
                vVar = cVar.i;
                if (vVar != null) {
                    Context context2 = view.getContext();
                    context2.getClass();
                    k kVar2 = u.r(context2, aVar) ? vVar.b : vVar.a;
                    if (kVar2 != null) {
                        num2 = Integer.valueOf(com.yandex.plus.bdui.plus.analytics.b.P(kVar2));
                    }
                }
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar2 = cVar.c;
                z2 = aVar2.b;
                boolean z3 = aVar2.a;
                s9f[] s9fVarArr = E;
                s9f s9fVar = s9fVarArr[4];
                com.yandex.plus.bdui.plus.content.controller.f fVar = this.B;
                ImageView imageView = (ImageView) fVar.g(s9fVar);
                if (!z2) {
                    view.getClass();
                    int j = r1.j(R.attr.pay_sdk_secondaryTextColor, view);
                    ((ImageView) fVar.g(s9fVarArr[4])).setImageResource(R.drawable.pay_sdk_ic_next_arrow);
                    ((ImageView) fVar.g(s9fVarArr[4])).setImageTintList(ColorStateList.valueOf(j));
                } else if (!cVar.b || z3) {
                    i = 4;
                    imageView.setVisibility(i);
                    ((View) this.C.g(s9fVarArr[5])).setVisibility(z ? 0 : 4);
                    s9f s9fVar2 = s9fVarArr[1];
                    com.yandex.plus.bdui.plus.content.controller.f fVar2 = this.y;
                    ((TextView) fVar2.g(s9fVar2)).setText(cVar.d);
                    r1.F((TextView) this.z.g(s9fVarArr[2]), cVar.e);
                    r1.F((TextView) this.A.g(s9fVarArr[3]), cVar.f);
                    bVar = cVar.g;
                    if (bVar != null) {
                        Context context3 = view.getContext();
                        context3.getClass();
                        y yVar = bVar.a;
                        String str = u.r(context3, aVar) ? yVar.b : yVar.a;
                        u().setVisibility(0);
                        ((com.yandex.plus.coil.b) this.v).b(str).i(u());
                    } else {
                        if (bVar != null) {
                            b6e.s();
                            return;
                        }
                        u().setVisibility(8);
                    }
                    if (num != null) {
                        ((TextView) fVar2.g(s9fVarArr[1])).setTextColor(num.intValue());
                    }
                    if (num2 != null) {
                        view.setBackgroundColor(num2.intValue());
                        return;
                    }
                    return;
                }
                i = 0;
                imageView.setVisibility(i);
                ((View) this.C.g(s9fVarArr[5])).setVisibility(z ? 0 : 4);
                s9f s9fVar22 = s9fVarArr[1];
                com.yandex.plus.bdui.plus.content.controller.f fVar22 = this.y;
                ((TextView) fVar22.g(s9fVar22)).setText(cVar.d);
                r1.F((TextView) this.z.g(s9fVarArr[2]), cVar.e);
                r1.F((TextView) this.A.g(s9fVarArr[3]), cVar.f);
                bVar = cVar.g;
                if (bVar != null) {
                }
                if (num != null) {
                }
                if (num2 != null) {
                }
            }
        }
        num = null;
        vVar = cVar.i;
        if (vVar != null) {
        }
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar22 = cVar.c;
        z2 = aVar22.b;
        boolean z32 = aVar22.a;
        s9f[] s9fVarArr2 = E;
        s9f s9fVar3 = s9fVarArr2[4];
        com.yandex.plus.bdui.plus.content.controller.f fVar3 = this.B;
        ImageView imageView2 = (ImageView) fVar3.g(s9fVar3);
        if (!z2) {
        }
        i = 0;
        imageView2.setVisibility(i);
        ((View) this.C.g(s9fVarArr2[5])).setVisibility(z ? 0 : 4);
        s9f s9fVar222 = s9fVarArr2[1];
        com.yandex.plus.bdui.plus.content.controller.f fVar222 = this.y;
        ((TextView) fVar222.g(s9fVar222)).setText(cVar.d);
        r1.F((TextView) this.z.g(s9fVarArr2[2]), cVar.e);
        r1.F((TextView) this.A.g(s9fVarArr2[3]), cVar.f);
        bVar = cVar.g;
        if (bVar != null) {
        }
        if (num != null) {
        }
        if (num2 != null) {
        }
    }

    public final ImageView u() {
        return (ImageView) this.x.g(E[0]);
    }
}
