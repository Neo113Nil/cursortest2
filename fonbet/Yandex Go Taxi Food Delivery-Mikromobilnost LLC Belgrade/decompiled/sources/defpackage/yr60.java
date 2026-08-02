package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class yr60 extends x0 {
    public static final /* synthetic */ kgx[] O;
    public final wv5 N;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("content", 0, "getContent()Landroid/widget/TextView;", yr60.class);
        qoi0.a.getClass();
        O = new kgx[]{propertyReference1Impl};
    }

    public yr60(View view) {
        super(view);
        wv5 wv5Var = new wv5(new a450(view, z9h0.benefit_item_text, 1));
        this.N = wv5Var;
        ((TextView) wv5Var.a(O[0])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
    }
}
