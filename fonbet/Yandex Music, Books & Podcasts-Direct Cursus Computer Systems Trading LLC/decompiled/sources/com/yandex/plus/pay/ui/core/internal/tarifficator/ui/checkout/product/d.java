package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.i;
import com.yandex.plus.pay.ui.core.mobile.view.PlusPayResizableSwitch;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.m8f;
import defpackage.mj4;
import defpackage.s9f;
import defpackage.vdr;
import defpackage.yxm;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class d {
    public static final /* synthetic */ s9f[] l = {new yxm(d.class, "contentView", "getContentView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), f1d.c(ern.a, d.class, "iconImageView", "getIconImageView()Landroid/widget/ImageView;", 0), new yxm(d.class, "switch", "getSwitch()Lcom/yandex/plus/pay/ui/core/mobile/view/PlusPayResizableSwitch;", 0), new yxm(d.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(d.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(d.class, "benefitsRecycler", "getBenefitsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final ProductView a;
    public final com.yandex.plus.core.imageloader.b b;
    public final vdr c;
    public final Function1 d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final f j;
    public final m8f k;

    public d(ProductView productView, com.yandex.plus.core.imageloader.b bVar, fkn fknVar, Function1 function1) {
        productView.getClass();
        bVar.getClass();
        fknVar.getClass();
        this.a = productView;
        this.b = bVar;
        this.c = fknVar;
        this.d = function1;
        this.e = new f(new i(productView, 17));
        this.f = new f(new i(productView, 18));
        this.g = new f(new i(productView, 19));
        this.h = new f(new i(productView, 20));
        this.i = new f(new i(productView, 21));
        f fVar = new f(new i(productView, 22));
        this.j = fVar;
        m8f m8fVar = new m8f(a.q, 4);
        this.k = m8fVar;
        ((RecyclerView) fVar.g(l[5])).setAdapter(m8fVar);
        b().setOnCheckedChangeListener(new mj4(6, this));
    }

    public final ImageView a() {
        return (ImageView) this.f.g(l[1]);
    }

    public final PlusPayResizableSwitch b() {
        return (PlusPayResizableSwitch) this.g.g(l[2]);
    }

    public final void c(c cVar) {
        ImageView a = a();
        com.yandex.plus.coil.b bVar = (com.yandex.plus.coil.b) this.b;
        bVar.a(a);
        s9f[] s9fVarArr = l;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.e.g(s9fVarArr[0]);
        boolean z = cVar.g;
        Boolean bool = cVar.f;
        List list = cVar.e;
        constraintLayout.setAlpha(z ? 0.5f : 1.0f);
        com.yandex.plus.ui.core.theme.a aVar = (com.yandex.plus.ui.core.theme.a) this.c.getValue();
        Context context = this.a.getContext();
        context.getClass();
        y yVar = cVar.b;
        String str = u.r(context, aVar) ? yVar.b : yVar.a;
        if (str != null) {
            bVar.b(str).i(a());
            a().setVisibility(0);
        } else {
            a().setVisibility(8);
        }
        TextView textView = (TextView) this.h.g(s9fVarArr[3]);
        String str2 = cVar.c;
        String str3 = null;
        if (str2 == null || StringsKt.U(str2)) {
            str2 = null;
        }
        r1.F(textView, str2);
        TextView textView2 = (TextView) this.i.g(s9fVarArr[4]);
        String str4 = cVar.d;
        if (str4 != null && !StringsKt.U(str4)) {
            str3 = str4;
        }
        r1.F(textView2, str3);
        boolean isEmpty = list.isEmpty();
        f fVar = this.j;
        if (isEmpty) {
            ((RecyclerView) fVar.g(s9fVarArr[5])).setVisibility(8);
        } else {
            this.k.v(list);
            ((RecyclerView) fVar.g(s9fVarArr[5])).setVisibility(0);
        }
        if (bool == null) {
            b().setVisibility(8);
        } else {
            b().setChecked(bool.booleanValue());
            b().setVisibility(0);
        }
    }
}
