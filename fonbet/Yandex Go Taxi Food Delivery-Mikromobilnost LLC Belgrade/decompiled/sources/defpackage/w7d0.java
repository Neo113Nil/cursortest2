package defpackage;

import android.widget.TextView;
import androidx.core.widget.b;
import com.yandex.plus.pay.ui.core.mobile.view.accordion.PlusPayAccordionView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class w7d0 {
    public static final /* synthetic */ kgx[] e = {new PropertyReference1Impl("titleView", 0, "getTitleView()Landroid/widget/TextView;", w7d0.class), b64.x(qoi0.a, w7d0.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("iconTextView", 0, "getIconTextView()Landroid/widget/TextView;", w7d0.class)};
    public final hzk a;
    public final wv5 b;
    public final wv5 c;
    public final wv5 d;

    public w7d0(PlusPayAccordionView plusPayAccordionView, hzk hzkVar) {
        this.a = hzkVar;
        wv5 wv5Var = new wv5(new a450(plusPayAccordionView, y9h0.accordion_title, 21));
        this.b = wv5Var;
        this.c = new wv5(new a450(plusPayAccordionView, y9h0.accordion_description, 22));
        this.d = new wv5(new a450(plusPayAccordionView, y9h0.accordion_icon_text, 23));
        b.a(b(), ((TextView) wv5Var.a(e[0])).getTextColors());
        a().setVisibility(8);
        b().setRotation(180.0f);
        bb1.L(plusPayAccordionView, new d5b0(9, this));
    }

    public final TextView a() {
        return (TextView) this.c.a(e[1]);
    }

    public final TextView b() {
        return (TextView) this.d.a(e[2]);
    }
}
