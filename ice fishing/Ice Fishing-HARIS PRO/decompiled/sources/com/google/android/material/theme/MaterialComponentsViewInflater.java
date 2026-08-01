package com.google.android.material.theme;

import F0.d;
import L0.m;
import O0.a;
import V0.w;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import h.F;
import m.C0238D;
import m.C0245b0;
import m.C0272p;
import m.C0274q;
import m.r;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends F {
    @Override // h.F
    public final C0272p a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // h.F
    public final C0274q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.F
    public final r c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // h.F
    public final C0238D d(Context context, AttributeSet attributeSet) {
        a aVar = new a(X0.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray g2 = m.g(context2, attributeSet, AbstractC0358a.f4454s, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (g2.hasValue(0)) {
            aVar.setButtonTintList(AbstractC0078a.B(context2, g2, 0));
        }
        aVar.f841f = g2.getBoolean(1, false);
        g2.recycle();
        return aVar;
    }

    @Override // h.F
    public final C0245b0 e(Context context, AttributeSet attributeSet) {
        W0.a aVar = new W0.a(X0.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (AbstractC0078a.V(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0358a.f4457v;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int h2 = W0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0358a.f4456u);
                    int h3 = W0.a.h(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h3 >= 0) {
                        aVar.setLineHeight(h3);
                    }
                }
            }
        }
        return aVar;
    }
}
