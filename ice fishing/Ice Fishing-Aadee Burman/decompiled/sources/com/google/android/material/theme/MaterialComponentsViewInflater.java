package com.google.android.material.theme;

import A3.a;
import H3.y;
import L3.F;
import U.b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.icefishing.icefishinglive2.C5275R;
import h.C4536D;
import k3.AbstractC4632a;
import m.C4668B;
import m.C4703o;
import m.C4705p;
import m.C4707q;
import m.Z;
import s3.C4974c;
import y3.k;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C4536D {
    @Override // h.C4536D
    public final C4703o a(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    @Override // h.C4536D
    public final C4705p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.C4536D
    public final C4707q c(Context context, AttributeSet attributeSet) {
        return new C4974c(context, attributeSet);
    }

    @Override // h.C4536D
    public final C4668B d(Context context, AttributeSet attributeSet) {
        a aVar = new a(J3.a.a(context, attributeSet, C5275R.attr.radioButtonStyle, C5275R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f3 = k.f(context2, attributeSet, AbstractC4632a.f38642o, C5275R.attr.radioButtonStyle, C5275R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f3.hasValue(0)) {
            b.c(aVar, O3.b.m(context2, f3, 0));
        }
        aVar.f29y = f3.getBoolean(1, false);
        f3.recycle();
        return aVar;
    }

    @Override // h.C4536D
    public final Z e(Context context, AttributeSet attributeSet) {
        I3.a aVar = new I3.a(J3.a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (F.q(context2, C5275R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC4632a.f38645r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int k9 = I3.a.k(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (k9 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC4632a.f38644q);
                    int k10 = I3.a.k(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (k10 >= 0) {
                        aVar.setLineHeight(k10);
                    }
                }
            }
        }
        return aVar;
    }
}
