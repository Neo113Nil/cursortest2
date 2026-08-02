package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.b6e;
import defpackage.ger;
import defpackage.ldg;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class a0 implements sqn {
    public static final a0 b = new a0(0);
    public final /* synthetic */ int a;

    public a0(n1 n1Var) {
        this.a = 7;
    }

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        z zVar = (z) obj2;
        e0Var.getClass();
        if (zVar instanceof y) {
            return new e0(e0Var.a, ((y) zVar).a);
        }
        if (zVar instanceof x) {
            return new e0(((x) zVar).a, e0Var.b);
        }
        b6e.s();
        return null;
    }

    public void b(View view) {
        int i = this.a;
        view.getClass();
        switch (i) {
            case 1:
                TextView textView = (TextView) view;
                textView.setTextSize(24.0f);
                ldg.K(textView, R.color.passport_logout_primary);
                ldg.J(textView, ru.yandex.music.R.font.ys_text_medium);
                textView.setGravity(1);
                break;
            case 2:
                TextView textView2 = (TextView) view;
                textView2.setTextSize(16.0f);
                ldg.K(textView2, R.color.passport_logout_link);
                ldg.J(textView2, ru.yandex.music.R.font.ys_text_medium);
                textView2.setGravity(1);
                break;
            case 3:
                TextView textView3 = (TextView) view;
                textView3.setTextSize(16.0f);
                ldg.K(textView3, R.color.passport_logout_primary);
                ldg.J(textView3, ru.yandex.music.R.font.ys_text_regular);
                break;
            case 4:
                TextView textView4 = (TextView) view;
                textView4.setTextSize(14.0f);
                ldg.K(textView4, R.color.passport_logout_secondary);
                ldg.J(textView4, ru.yandex.music.R.font.ys_text_regular);
                break;
            case 5:
                TextView textView5 = (TextView) view;
                textView5.setTextSize(16.0f);
                ldg.K(textView5, R.color.passport_logout_primary);
                ldg.J(textView5, ru.yandex.music.R.font.ys_text_medium);
                textView5.setBackgroundResource(R.drawable.passport_logout_button_background);
                textView5.setGravity(17);
                break;
            case 6:
                TextView textView6 = (TextView) view;
                textView6.setTextSize(16.0f);
                ldg.K(textView6, R.color.passport_logout_on_brand_background);
                ldg.J(textView6, ru.yandex.music.R.font.ys_text_medium);
                textView6.setBackgroundResource(R.drawable.passport_logout_prominent_button_background);
                textView6.setGravity(17);
                break;
            default:
                RadioButton radioButton = (RadioButton) view;
                ger gerVar = new ger(null, null);
                int[] iArr = {android.R.attr.state_checked};
                Context context = radioButton.getContext();
                context.getClass();
                gerVar.a(iArr, n1.P(context, R.drawable.passport_logout_radio_checked, R.color.passport_logout_brand_background));
                Context context2 = radioButton.getContext();
                context2.getClass();
                gerVar.a(new int[0], n1.P(context2, R.drawable.passport_logout_radio_normal, R.color.passport_logout_border));
                radioButton.setButtonDrawable(gerVar);
                break;
        }
    }

    public /* synthetic */ a0(int i) {
        this.a = i;
    }
}
